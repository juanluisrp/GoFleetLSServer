package org.gofleet.openLS;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

import net.opengis.xls.v_1_2_0.AbstractBodyType;
import net.opengis.xls.v_1_2_0.AbstractHeaderType;
import net.opengis.xls.v_1_2_0.AbstractRequestParametersType;
import net.opengis.xls.v_1_2_0.AbstractResponseParametersType;
import net.opengis.xls.v_1_2_0.DetermineRouteRequestType;
import net.opengis.xls.v_1_2_0.GeocodeRequestType;
import net.opengis.xls.v_1_2_0.RequestType;
import net.opengis.xls.v_1_2_0.ReverseGeocodeRequestType;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axiom.om.impl.builder.SAXOMBuilder;
import org.apache.axis2.AxisFault;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xmlbeans.impl.common.XmlReaderToWriter;
import org.gofleet.openLS.opengis.XLS;

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
public class OpenLS {
	private static Log LOG = LogFactory.getLog(OpenLS.class);

	/**
	 * method parameter names for routing
	 */
	private static String[] routing = { "routePlan", "routeRequest", "routing" };
	/**
	 * method parameter names for reverseGeocoding
	 */
	private static String[] reverseGeocoding = { "reverseGeocoding",
			"DirectoryRequest" };
	/**
	 * method parameter names for geocoding
	 */
	private static String[] geocoding = { "geocoding", "GeocodeRequest" };

	/**
	 * Stupid test to see if the Server is alive.
	 * 
	 * @return
	 */
	public OMElement test() {
		OMFactory fac = OMAbstractFactory.getOMFactory();
		OMNamespace omNs = fac.createOMNamespace(
				"http://example1.org/example1", "example1");
		OMElement method = fac.createOMElement("echo", omNs);
		OMElement value = fac.createOMElement("Text", omNs);
		value.addChild(fac.createOMText(value, "Server Alive"));
		method.addChild(value);

		return method;
	}

	/**
	 * Main function for the webservice. It determines the operation with the
	 * request parameters of {@link XLS}
	 * 
	 * @param parameter
	 * @return
	 * @throws AxisFault
	 */
	public OMElement openLS(OMElement parameter) throws AxisFault {
		String method = convertOMElement2Object(parameter);

		AbstractResponseParametersType resultado = null;

		if (equals(routing, method))
			resultado = routePlan(parameter);
		else if (equals(reverseGeocoding, method))
			resultado = reverseGeocoding(parameter);
		else if (equals(geocoding, method))
			resultado = geocoding(parameter);

		if (resultado == null)
			throw AxisFault
					.makeFault(new Exception("Function not implemented"));

		return envelop(resultado);
	}

	/**
	 * Check if rules contains method, ignoring case.
	 * @param rules
	 * @param method
	 * @return
	 */
	private boolean equals(String[] rules, String method) {
		for (String rule : rules)
			if (StringUtils.equalsIgnoreCase(method, rule))
				return true;
		return false;
	}

	/**
	 * Calls the routing method
	 * @param parameter
	 * @return
	 * @throws AxisFault
	 */
	protected AbstractResponseParametersType routePlan(OMElement parameter)
			throws AxisFault {
		DetermineRouteRequestType param = (DetermineRouteRequestType) convertOMElement2Object(
				parameter, DetermineRouteRequestType.class);
		return Routing.routePlan(param);
	}

	/**
	 * Calls the reverseGeocoding method
	 * @param parameter
	 * @return
	 * @throws AxisFault
	 */
	protected AbstractResponseParametersType reverseGeocoding(
			OMElement parameter) throws AxisFault {
		ReverseGeocodeRequestType param = (ReverseGeocodeRequestType) convertOMElement2Object(
				parameter, ReverseGeocodeRequestType.class);
		return GeoCoding.reverseGeocoding(param);
	}

	/**
	 * Calls the geocoding method
	 * @param parameter
	 * @return
	 * @throws AxisFault
	 */
	protected AbstractResponseParametersType geocoding(OMElement parameter)
			throws AxisFault {
		GeocodeRequestType param = (GeocodeRequestType) convertOMElement2Object(
				parameter, GeocodeRequestType.class);
		return GeoCoding.geocoding(param);
	}

	/**
	 * Given a {@link XLS} object, it returns the
	 * {@link AbstractRequestParametersType} inside.
	 * 
	 * @param parameter
	 * @param classType
	 * @return
	 * @throws AxisFault
	 */
	public static AbstractRequestParametersType convertOMElement2Object(
			OMElement parameter, Class<?> classType) throws AxisFault {
		try {
			Unmarshaller unmarshaller = JAXBContext.newInstance(XLS.class)
					.createUnmarshaller();
			XMLStreamReader xmlStreamReader = parameter.getXMLStreamReader();
			@SuppressWarnings("unchecked")
			JAXBElement<XLS> message = (JAXBElement<XLS>) unmarshaller
					.unmarshal(xmlStreamReader);
			net.opengis.xls.v_1_2_0.XLSType xlsType = message.getValue();

			@SuppressWarnings("unchecked")
			RequestType requestType = ((JAXBElement<RequestType>) xlsType
					.getBody().get(0)).getValue();

			JAXBElement<? extends AbstractRequestParametersType> parameters = requestType
					.getRequestParameters();

			return parameters.getValue();
		} catch (Throwable t) {
			debugOMElement(parameter);
			LOG.error("Error converting OMElement to Object.", t);
			throw AxisFault.makeFault(t);
		}
	}

	/**
	 * Given a {@link XLS} object, it returns the method called.
	 * 
	 * @param parameter
	 * @return
	 * @throws AxisFault
	 */
	public static String convertOMElement2Object(OMElement parameter)
			throws AxisFault {
		try {
			Unmarshaller unmarshaller = JAXBContext.newInstance(XLS.class)
					.createUnmarshaller();
			XMLStreamReader xmlStreamReader = parameter.getXMLStreamReader();
			@SuppressWarnings("unchecked")
			JAXBElement<XLS> message = (JAXBElement<XLS>) unmarshaller
					.unmarshal(xmlStreamReader);
			net.opengis.xls.v_1_2_0.XLSType xlsType = message.getValue();

			@SuppressWarnings("unchecked")
			RequestType requestType = ((JAXBElement<RequestType>) xlsType
					.getBody().get(0)).getValue();

			return requestType.getMethodName();
		} catch (Throwable t) {
			debugOMElement(parameter);
			LOG.error("Error converting OMElement to XLSType.", t);
			throw AxisFault.makeFault(t);
		}
	}

	/**
	 * If DEBUG is enabled on the {@link Log}, it writes the OMElement received
	 * as XML.
	 * 
	 * @param parameter
	 * @param classType
	 * @return
	 */
	public static void debugOMElement(OMElement parameter) {
		try {
			if (LOG.isDebugEnabled()) {
				OMElement element = parameter.cloneOMElement();
				XMLOutputFactory xof = XMLOutputFactory.newInstance();
				StringWriter w = new StringWriter();
				XMLStreamWriter writer = xof.createXMLStreamWriter(w);
				XmlReaderToWriter
						.writeAll(element.getXMLStreamReader(), writer);
				LOG.debug(w.getBuffer());
			}
		} catch (Throwable t) {
			LOG.error("Error debugging OMElement " + parameter);
		}
	}

	/**
	 * Converts the given Object as its {@link OMElement} representation.
	 * 
	 * @param res
	 * @param classType
	 * @return
	 * @throws AxisFault
	 */
	public static OMElement convertObject2OMElement(Object res,
			Class<?> classType) throws AxisFault {
		try {
			Marshaller m = JAXBContext.newInstance(classType)
					.createMarshaller();
			SAXOMBuilder builder = new SAXOMBuilder();
			m.marshal(res, builder);
			OMElement element = builder.getRootElement();
			debugOMElement(element);
			return element;
		} catch (Throwable t) {
			LOG.error("Error converting Object to OMElement.", t);
			throw AxisFault.makeFault(t);
		}
	}

	/**
	 * Envelops an {@link AbstractResponseParametersType} response inside the
	 * {@link XLS}
	 * 
	 * @param element
	 * @return
	 * @throws AxisFault
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static OMElement envelop(AbstractResponseParametersType element)
			throws AxisFault {
		XLS xlsType = new XLS();

		List<JAXBElement<? extends AbstractBodyType>> body = new ArrayList<JAXBElement<? extends AbstractBodyType>>();

		JAXBElement<? extends AbstractBodyType> body_ = new JAXBElement(
				new QName(""), element.getClass(), element);
		body.add(body_);

		JAXBElement<? extends AbstractHeaderType> header = null;

		// TODO internacionalization
		//xlsType.setLang("es");

		xlsType.setBody(body);

		xlsType.setHeader(header);

		return convertObject2OMElement(xlsType, XLS.class);
	}

}
