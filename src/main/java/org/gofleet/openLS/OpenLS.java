package org.gofleet.openLS;

import java.util.LinkedList;
import java.util.List;

import javax.annotation.Resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLStreamException;

import net.opengis.xls.v_1_2_0.AbstractResponseParametersType;
import net.opengis.xls.v_1_2_0.DetermineRouteRequestType;
import net.opengis.xls.v_1_2_0.DirectoryRequestType;
import net.opengis.xls.v_1_2_0.GeocodeRequestType;
import net.opengis.xls.v_1_2_0.RequestType;
import net.opengis.xls.v_1_2_0.ReverseGeocodeRequestType;
import net.opengis.xls.v_1_2_0.XLSType;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.gofleet.openLS.ddbb.GeoCoding;
import org.gofleet.openLS.ddbb.Routing;
import org.gofleet.openLS.util.Utils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.xml.sax.SAXException;

/*
 * Copyright (C) 2011, Emergya (http://www.emergya.es)
 *
 * @author <a href="mailto:marias@emergya.es">María Arias</a>
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
@Controller(value = "openLSService")
@Scope("session")
@Path("/")
public class OpenLS {
	static Log LOG = LogFactory.getLog(OpenLS.class);

	@Resource
	private Routing routingController;

	@Resource
	private GeoCoding geoCodingController;

	/**
	 * method parameter names for routing
	 */
	private static String[] routing = { "routePlan", "routeRequest", "routing" };
	/**
	 * method parameter names for reverseGeocoding
	 */
	private static String[] reverseGeocoding = { "reverseGeocoding",
			"reverseGeocode", "RevGcReq" };
	/**
	 * method parameter names for directory
	 */
	private static String[] directory = { "directory", "DirectoryRequest" };
	/**
	 * method parameter names for geocoding
	 */
	private static String[] geocoding = { "geocoding", "GeocodeRequest" };

	/**
	 * Stupid test to see if the Server is alive.
	 * 
	 * @return
	 */
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String test() {
		return "Have you tried sending a XLS request by POST?";
	}

	/**
	 * Main function for the webservice. It determines the operation with the
	 * request parameters of {@link XLSType}
	 * 
	 * @param parameter
	 * @return
	 */
	@POST
	@Produces(MediaType.TEXT_XML)
	@Consumes({ MediaType.APPLICATION_XML, MediaType.TEXT_XML,
			MediaType.APPLICATION_ATOM_XML })
	public JAXBElement<XLSType> openLS(JAXBElement<XLSType> jaxbelement) {
		XLSType parameter = jaxbelement.getValue();
		LOG.trace("openLS(" + parameter + ")");
		String method = Utils.getMethod(parameter);

		List<List<AbstractResponseParametersType>> resultado = new LinkedList<List<AbstractResponseParametersType>>();

		try {
			if (Utils.equals(routing, method))
				resultado.add(routePlan(parameter));
			else if (Utils.equals(reverseGeocoding, method))
				resultado = reverseGeocoding(parameter);
			else if (Utils.equals(geocoding, method))
				resultado = geocoding(parameter);
			else if (Utils.equals(directory, method))
				resultado = directory(parameter);
		} catch (JAXBException e) {
			LOG.error(e, e);
			throw new RuntimeException(e);
		} catch (XMLStreamException e) {
			LOG.error(e, e);
			throw new RuntimeException(e);
		} catch (FactoryConfigurationError e) {
			LOG.error(e, e);
			throw new RuntimeException(e);
		} catch (SAXException e) {
			LOG.error(e, e);
			throw new RuntimeException(e);
		} catch (Throwable e) {
			LOG.error(e, e);
			throw new RuntimeException(e);
		}
		if (resultado == null)
			throw new RuntimeException(
					new Exception("Function not implemented"));

		return Utils.envelop(resultado);
	}

	/**
	 * Calls the routing method
	 * 
	 * @param parameter
	 * @return
	 * @throws AxisFault
	 * @throws SAXException
	 * @throws FactoryConfigurationError
	 * @throws XMLStreamException
	 * @throws JAXBException
	 */
	protected List<AbstractResponseParametersType> routePlan(XLSType xls)
			throws JAXBException, XMLStreamException,
			FactoryConfigurationError, SAXException {
		@SuppressWarnings("unchecked")
		RequestType body = ((JAXBElement<RequestType>) xls.getBody().get(0))
				.getValue();
		DetermineRouteRequestType param = (DetermineRouteRequestType) body
				.getRequestParameters().getValue();
		AbstractResponseParametersType arpt = routingController
				.routePlan(param);
		List<AbstractResponseParametersType> list = new LinkedList<AbstractResponseParametersType>();

		list.add(arpt);

		return list;
	}

	/**
	 * Calls the reverseGeocoding method
	 * 
	 * @param parameter
	 * @return
	 * @throws AxisFault
	 * @throws SAXException
	 * @throws FactoryConfigurationError
	 * @throws XMLStreamException
	 * @throws JAXBException
	 */
	@SuppressWarnings("unchecked")
	protected List<List<AbstractResponseParametersType>> reverseGeocoding(
			XLSType xls) throws JAXBException, XMLStreamException,
			FactoryConfigurationError, SAXException {
		RequestType body = ((JAXBElement<RequestType>) xls.getBody().get(0))
				.getValue();
		ReverseGeocodeRequestType param = (ReverseGeocodeRequestType) body
				.getRequestParameters().getValue();
		return geoCodingController.reverseGeocode(param);
	}

	/**
	 * Calls the directory method
	 * 
	 * @param parameter
	 * @return
	 * @throws AxisFault
	 * @throws SAXException
	 * @throws FactoryConfigurationError
	 * @throws XMLStreamException
	 * @throws JAXBException
	 */
	protected List<List<AbstractResponseParametersType>> directory(XLSType xls)
			throws JAXBException, XMLStreamException,
			FactoryConfigurationError, SAXException {
		@SuppressWarnings("unchecked")
		RequestType body = ((JAXBElement<RequestType>) xls.getBody().get(0))
				.getValue();
		DirectoryRequestType param = (DirectoryRequestType) body
				.getRequestParameters().getValue();
		return geoCodingController.directory(param);
	}

	/**
	 * Calls the geocoding method
	 * 
	 * @param parameter
	 * @return
	 * @throws AxisFault
	 * @throws SAXException
	 * @throws FactoryConfigurationError
	 * @throws XMLStreamException
	 * @throws JAXBException
	 */
	protected List<List<AbstractResponseParametersType>> geocoding(XLSType xls)
			throws JAXBException, XMLStreamException,
			FactoryConfigurationError, SAXException {
		@SuppressWarnings("unchecked")
		RequestType body = ((JAXBElement<RequestType>) xls.getBody().get(0))
				.getValue();
		GeocodeRequestType param = (GeocodeRequestType) body
				.getRequestParameters().getValue();

		return geoCodingController.geocoding(param);
	}

}
