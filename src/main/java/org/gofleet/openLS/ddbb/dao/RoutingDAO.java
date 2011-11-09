/*
 * Copyright (C) 2011, Emergya (http://www.emergya.es)
 *
 * @author <a href="mailto:marias@emergya.com">María Arias</a>
 *
 * This file is part of GoFleet
 *
 * This software is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 *
 * As a special exception, if you link this library with other files to
 * produce an executable, this library does not by itself cause the
 * resulting executable to be covered by the GNU General Public License.
 * This exception does not however invalidate any other reasons why the
 * executable file might be covered by the GNU General Public License.
 */
package org.gofleet.openLS.ddbb.dao;

import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.sql.Array;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.Resource;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import net.opengis.gml.v_3_1_1.LineStringType;
import net.opengis.xls.v_1_2_0.DetermineRouteRequestType;
import net.opengis.xls.v_1_2_0.DetermineRouteResponseType;
import net.opengis.xls.v_1_2_0.DistanceType;
import net.opengis.xls.v_1_2_0.RouteGeometryType;
import net.opengis.xls.v_1_2_0.RouteHandleType;
import net.opengis.xls.v_1_2_0.RouteInstructionsListType;
import net.opengis.xls.v_1_2_0.RouteMapType;
import net.opengis.xls.v_1_2_0.RouteSummaryType;
import net.opengis.xls.v_1_2_0.WayPointListType;
import net.opengis.xls.v_1_2_0.WayPointType;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.gofleet.openLS.ddbb.GeoCoding;
import org.gofleet.openLS.ddbb.bean.Routing;
import org.gofleet.openLS.ddbb.order.StDistance;
import org.gofleet.openLS.util.GeoUtil;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.postgresql.jdbc4.Jdbc4Array;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.LineString;
import com.vividsolutions.jts.geom.PrecisionModel;
import com.vividsolutions.jts.io.WKTReader;

@Repository
public class RoutingDAO {
	private static final String GID_ROUTING = "id";

	private static final String TABLE_ROUTING = "routing";

	@SuppressWarnings("unused")
	private static final String EPSG_4326 = "EPSG:4326";

	private HibernateTemplate hibernateTemplate;

	private static Log LOG = LogFactory.getLog(RoutingDAO.class);

	@SuppressWarnings("unused")
	@Resource
	private GeoCoding geocoding;

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	/**
	 * Devuelve el id del vértice más cercano, calculado según la tabla de
	 * routing.
	 * 
	 * @param p
	 * @param end
	 * @return
	 */
	@Transactional(readOnly = true)
	private Integer getVertex(final Geometry p, final boolean end) {
		LOG.trace("getVertex(" + p + ", " + end + ")");
		HibernateCallback<Integer> action = new HibernateCallback<Integer>() {

			public Integer doInHibernate(Session session)
					throws HibernateException, SQLException {
				p.setSRID(4326);
				Criteria criteria = session.createCriteria(Routing.class);
				criteria.addOrder(StDistance.asc("geometry", p));
				criteria.setProjection(Projections.id());
				criteria.setMaxResults(1);
				criteria.setCacheable(true);
				return (Integer) criteria.uniqueResult();
			}
		};
		return hibernateTemplate.executeWithNativeSession(action);
	}

	@Transactional(readOnly = true)
	public DetermineRouteResponseType routePlan(
			final DetermineRouteRequestType param) {
		HibernateCallback<DetermineRouteResponseType> action = new HibernateCallback<DetermineRouteResponseType>() {

			public DetermineRouteResponseType doInHibernate(Session session)
					throws HibernateException, SQLException {
				// TODO change deprecation?
				@SuppressWarnings("deprecation")
				CallableStatement consulta = session.connection().prepareCall(
						"{call gls_tsp(?,?,?,?)}");

				WayPointListType wayPointList = param.getRoutePlan()
						.getWayPointList();
				Integer source = getSourcePoint(param.getRoutePlan()
						.getWayPointList().getStartPoint());
				Array stopTable = getStopTables(session, wayPointList);

				consulta.setString(1, TABLE_ROUTING);
				consulta.setArray(2, stopTable);
				consulta.setString(3, GID_ROUTING);
				if (source != null)
					consulta.setInt(4, source.intValue());
				else
					consulta.setInt(4, -1);

				LOG.debug(consulta);

				return getRouteResponse(consulta.executeQuery());

			}

			private Integer getSourcePoint(WayPointType startPoint) {
				return getVertex(GeoUtil.getPoint(startPoint), false);
			}

			private Array getStopTables(Session session,
					WayPointListType wayPointList) throws SQLException {
				List<Integer> stops = new ArrayList<Integer>();
				for (WayPointType wayPoint : wayPointList.getViaPoint()) {
					Integer bi = getVertex(GeoUtil.getPoint(wayPoint), false);
					if (bi != null)
						stops.add(bi.intValue());
				}
				Integer vertex = getVertex(
						GeoUtil.getPoint(wayPointList.getEndPoint()), false);
				if (vertex != null)
					stops.add(vertex.intValue());

				// TODO change deprecation?
				@SuppressWarnings("deprecation")
				Array stopTable = session.connection().createArrayOf("int4",
						stops.toArray(new Integer[] {}));
				return stopTable;
			}

			private DetermineRouteResponseType getRouteResponse(
					ResultSet resultado) throws SQLException {

				DetermineRouteResponseType res = new DetermineRouteResponseType();
				Integer last = -1;
				if (resultado.next()) {
					String[][] array = (String[][]) ((Jdbc4Array) resultado
							.getArray(1)).getArray();

					if (LOG.isTraceEnabled()) {
						for (String[] step : array)
							LOG.trace("Going to " + step[0] + " at cost "
									+ step[1] + " using " + step[2]);
					}

					WKTReader wktReader = new WKTReader();
					List<Coordinate> coordinates = new LinkedList<Coordinate>();
					Double cost = 0d;

					for (String[] step : array) {
						try {
							Integer current = new Integer(step[0]);
							LOG.trace("Comparing " + current + " with " + last);
							if (!current.equals(last)) {
								Geometry geometry = wktReader.read(step[2]);
								LOG.trace(geometry);
								for (Coordinate coord : geometry
										.getCoordinates())
									coordinates.add(coord);
								Double tmp_cost = new Double(step[1]);
								if (!(tmp_cost.isInfinite() || tmp_cost.isNaN())) {
									cost += tmp_cost;
								}
								LOG.trace("New cost " + cost);
							} else
								LOG.trace("Repeating step " + current);
							last = current;
						} catch (Exception e) {
							LOG.error("Unknown Geometry", e);
						}
					}

					RouteGeometryType routeGeometry;
					try {
						routeGeometry = getRouteGeometry(coordinates);
						res.setRouteGeometry(routeGeometry);
					} catch (JAXBException e) {
						LOG.error(e, e);
					}

					res.setRouteHandle(getRouteHandle(coordinates));
					res.setRouteInstructionsList(getInstructionsList(coordinates));
					res.setRouteMap(getRouteMap(coordinates));
					res.setRouteSummary(getRouteSummary(cost));
				}
				return res;
			}

			private RouteSummaryType getRouteSummary(Double cost) {
				RouteSummaryType res = new RouteSummaryType();
				DistanceType coste = new DistanceType();
				if (cost.isInfinite() || cost.isNaN())
					coste.setValue(BigDecimal.valueOf(0d));
				else
					coste.setValue(BigDecimal.valueOf(cost));
				res.setTotalDistance(coste);
				return res;
			}

			private List<RouteMapType> getRouteMap(List<Coordinate> lineStrings) {
				List<RouteMapType> res = new ArrayList<RouteMapType>(0);
				return res;
			}

			private RouteInstructionsListType getInstructionsList(
					List<Coordinate> lineStrings) {
				RouteInstructionsListType res = new RouteInstructionsListType();
				return res;
			}

			private RouteHandleType getRouteHandle(List<Coordinate> lineStrings) {
				RouteHandleType handleType = new RouteHandleType();
				handleType.setRouteID("-1");
				handleType.setServiceID("-1");
				return handleType;
			}

			private RouteGeometryType getRouteGeometry(
					List<Coordinate> lineStrings) throws JAXBException {
				LineString line = (new GeometryFactory(new PrecisionModel(),
						4326)).createLineString(lineStrings
						.toArray(new Coordinate[] {}));

				JAXBContext context = JAXBContext
						.newInstance("org.jvnet.ogc.gml.v_3_1_1.jts");

				if (LOG.isTraceEnabled())
					context.createMarshaller().marshal(line, System.out);

				StringWriter writer = new StringWriter();
				context.createMarshaller().marshal(line, writer);

				Unmarshaller unmarshaller = JAXBContext.newInstance(
						LineStringType.class).createUnmarshaller();
				StringReader reader = new StringReader(writer.toString());

				@SuppressWarnings("unchecked")
				JAXBElement<LineStringType> lineElement = (JAXBElement<LineStringType>) unmarshaller
						.unmarshal(reader);

				LineStringType lineString = lineElement.getValue();

				RouteGeometryType routeGeometry = new RouteGeometryType();
				routeGeometry.setLineString(lineString);
				return routeGeometry;
			}
		};
		return hibernateTemplate.executeWithNativeSession(action);
	}
}
