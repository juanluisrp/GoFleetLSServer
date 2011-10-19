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
import java.math.BigInteger;
import java.sql.Array;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import net.opengis.gml.v_3_1_1.CoordinatesType;
import net.opengis.gml.v_3_1_1.LineStringType;
import net.opengis.xls.v_1_2_0.AbstractLocationType;
import net.opengis.xls.v_1_2_0.AbstractResponseParametersType;
import net.opengis.xls.v_1_2_0.AddressType;
import net.opengis.xls.v_1_2_0.DetermineRouteRequestType;
import net.opengis.xls.v_1_2_0.DetermineRouteResponseType;
import net.opengis.xls.v_1_2_0.DirectoryRequestType;
import net.opengis.xls.v_1_2_0.DirectoryResponseType;
import net.opengis.xls.v_1_2_0.DistanceType;
import net.opengis.xls.v_1_2_0.GeocodeRequestType;
import net.opengis.xls.v_1_2_0.GeocodeResponseListType;
import net.opengis.xls.v_1_2_0.GeocodeResponseType;
import net.opengis.xls.v_1_2_0.GeocodedAddressType;
import net.opengis.xls.v_1_2_0.ReverseGeocodeRequestType;
import net.opengis.xls.v_1_2_0.ReverseGeocodeResponseType;
import net.opengis.xls.v_1_2_0.RouteGeometryType;
import net.opengis.xls.v_1_2_0.RouteHandleType;
import net.opengis.xls.v_1_2_0.RouteInstructionsListType;
import net.opengis.xls.v_1_2_0.RouteMapType;
import net.opengis.xls.v_1_2_0.RouteSummaryType;
import net.opengis.xls.v_1_2_0.WayPointListType;
import net.opengis.xls.v_1_2_0.WayPointType;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.gofleet.openLS.util.GeoUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.postgis.PGgeometry;
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
public class GeoCodingDAO {
	private static final String GID_ROUTING = "id";

	private static final String TABLE_ROUTING = "routing";

	private static final String EPSG_4326 = "EPSG:4326";

	private static final String TS = " ";

	private static final String CS = ",";

	private HibernateTemplate hibernateTemplate;

	public static Log LOG = LogFactory.getLog(GeoCodingDAO.class);

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	@Transactional(readOnly = true)
	public DetermineRouteResponseType routePlan(
			final DetermineRouteRequestType param) {
		HibernateCallback<DetermineRouteResponseType> action = new HibernateCallback<DetermineRouteResponseType>() {

			public DetermineRouteResponseType doInHibernate(Session session)
					throws HibernateException, SQLException {
				CallableStatement consulta = session.connection().prepareCall(
						"{call gls_tsp(?,?,?,?)}");

				WayPointListType wayPointList = param.getRoutePlan()
						.getWayPointList();
				Integer source = getSourcePoint(wayPointList);
				Array stopTable = getStopTables(session, wayPointList);

				consulta.setString(1, TABLE_ROUTING);
				consulta.setArray(2, stopTable);
				consulta.setString(3, GID_ROUTING);
				consulta.setInt(4, source);

				return getRouteResponse(consulta.executeQuery());

			}

			private Integer getSourcePoint(WayPointListType wayPointList) {
				WayPointType startPoint = wayPointList.getStartPoint();
				AbstractLocationType pType = startPoint.getLocation()
						.getValue();

				// TODO
				// Geometry geom = geocoding.geocoding(param)

				Integer source = new Integer(10);
				return source;
			}

			private Array getStopTables(Session session,
					WayPointListType wayPointList) throws SQLException {
				List<Integer> stops = new ArrayList<Integer>();
				for (WayPointType wayPoint : wayPointList.getViaPoint())
					stops.add(20);

				// TODO

				Array stopTable = session.connection().createArrayOf("int4",
						stops.toArray(new Integer[] {}));
				return stopTable;
			}

			private DetermineRouteResponseType getRouteResponse(
					ResultSet resultado) throws SQLException {

				DetermineRouteResponseType res = new DetermineRouteResponseType();
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
							Geometry geometry = wktReader.read(step[2]);
							for (Coordinate coord : geometry.getCoordinates())
								coordinates.add(coord);
							cost += new Double(step[1]);
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

			private CoordinatesType getCoordinatesType() {
				CoordinatesType coordinateType = new CoordinatesType();
				coordinateType.setCs(CS);
				coordinateType.setTs(TS);
				return coordinateType;
			}
		};
		return hibernateTemplate.executeWithNativeSession(action);
	}

	@Transactional(readOnly = true)
	public DirectoryResponseType directory(DirectoryRequestType param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional(readOnly = true)
	public ReverseGeocodeResponseType reverseGeocode(
			ReverseGeocodeRequestType param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional(readOnly = true)
	public List<List<AbstractResponseParametersType>> geocoding(
			final GeocodeRequestType param) {
		HibernateCallback<List<List<AbstractResponseParametersType>>> action = new HibernateCallback<List<List<AbstractResponseParametersType>>>() {
			public List<List<AbstractResponseParametersType>> doInHibernate(
					Session session) throws HibernateException, SQLException {

				List<List<AbstractResponseParametersType>> res = new LinkedList<List<AbstractResponseParametersType>>();
				List<AddressType> addressList = param.getAddress();

				for (AddressType addressType : addressList) {
					List<AbstractResponseParametersType> res_ = new LinkedList<AbstractResponseParametersType>();

					CallableStatement consulta = session.connection()
							.prepareCall("{call gls_geocoding(?, ?, ?, ?, ?)}");

					String street = GeoUtil.extractStreet(addressType);
					String munsub = GeoUtil.extractMunSub(addressType);
					String mun = GeoUtil.extractMun(addressType);
					String subcountry = GeoUtil.extractSubCountry(addressType);
					String country = GeoUtil.extractCountry(addressType);

					consulta.setString(1, street);
					consulta.setString(2, munsub);
					consulta.setString(3, mun);
					consulta.setString(4, subcountry);
					consulta.setString(5, country);

					LOG.debug(consulta);

					ResultSet o = consulta.executeQuery();
					GeocodeResponseType grt = new GeocodeResponseType();
					while (o.next()) {
						GeocodeResponseListType geocode = new GeocodeResponseListType();
						try {
							PGgeometry g = (PGgeometry) o.getObject("geometry");
							Jdbc4Array address = (Jdbc4Array) o
									.getArray("address");

							GeocodedAddressType addresstype = new GeocodedAddressType();
							addresstype.setPoint(GeoUtil.getReferencedPoint(g));
							addresstype.setAddress(GeoUtil.getAddress(address));
							
							geocode.getGeocodedAddress().add(addresstype);
							
							geocode.setNumberOfGeocodedAddresses(BigInteger
									.valueOf(1l));
							
							grt.getGeocodeResponseList().add(geocode);
						} catch (Throwable t) {
							LOG.error("Error extracting data from database.", t);
						}
						res_.add(grt);
					}
					res.add(res_);
				}
				return res;
			}

		};

		return hibernateTemplate.executeWithNativeSession(action);
	}
}
