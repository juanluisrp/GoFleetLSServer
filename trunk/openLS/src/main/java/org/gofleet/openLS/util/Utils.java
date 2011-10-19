package org.gofleet.openLS.util;

import java.io.FileNotFoundException;
import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigInteger;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.transform.sax.SAXSource;

import net.opengis.xls.v_1_2_0.AbstractResponseParametersType;
import net.opengis.xls.v_1_2_0.RequestType;
import net.opengis.xls.v_1_2_0.ResponseHeaderType;
import net.opengis.xls.v_1_2_0.ResponseType;
import net.opengis.xls.v_1_2_0.XLSType;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.impl.builder.SAXOMBuilder;
import org.apache.axis2.AxisFault;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xmlbeans.impl.common.XmlReaderToWriter;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.NamespaceFilter;
import org.xml.sax.helpers.XMLReaderFactory;

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
public class Utils {
	static Log LOG = LogFactory.getLog(Utils.class);
	private static final XMLOutputFactory XOF = XMLOutputFactory.newInstance();
	private static JAXBContext JAXB_C = null;

	static {
		try {
			JAXB_C = JAXBContext.newInstance(XLSType.class);
		} catch (JAXBException e) {
			LOG.error("Some problem with JAXB", e);
		}
	}

	public static String getXML(OMElement element)
			throws FactoryConfigurationError, XMLStreamException, JAXBException {
		StringWriter stringWriter = new StringWriter();
		XMLStreamWriter xmlStreamWriter = XOF
				.createXMLStreamWriter(stringWriter);
		XMLStreamReader xmlStreamReader = element.getXMLStreamReader();
		XmlReaderToWriter.writeAll(xmlStreamReader, xmlStreamWriter);
		return stringWriter.getBuffer().toString();
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
			return element;
		} catch (Throwable t) {
			LOG.error("Error converting Object to OMElement.", t);
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
				LOG.debug(parameter + ": " + getXML(element));
			}
		} catch (Throwable t) {
			LOG.error("Error debugging OMElement " + parameter);
		}
	}

	/**
	 * Envelops an {@link AbstractResponseParametersType} response inside the
	 * {@link XLSType}
	 * 
	 * @param element
	 * @return
	 * @throws AxisFault
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static OMElement envelop(
			List<List<AbstractResponseParametersType>> params) throws AxisFault {
		try {
			XLSType xlsType = new XLSType();

			ResponseType responseType = new ResponseType();

			for (List<AbstractResponseParametersType> element : params) {
				for (AbstractResponseParametersType e : element) {
					String responseClass = e.getClass().getSimpleName()
							.toString();
					responseClass = responseClass.substring(0,
							responseClass.length() - 4);

					JAXBElement<? extends AbstractResponseParametersType> body_ = new JAXBElement(
							new QName("http://www.opengis.net/xls",
									responseClass, ""), e.getClass(), e);
					responseType.setResponseParameters(body_);
				}
				responseType.setNumberOfResponses(new BigInteger((new Integer(
						element.size())).toString()));
				xlsType.getBody().add(
						new JAXBElement(new QName("http://www.opengis.net/xls",
								"Response"), responseType.getClass(),
								responseType));
			}

			ResponseHeaderType header = new ResponseHeaderType();

			xlsType.setHeader(new JAXBElement<ResponseHeaderType>(new QName(
					"http://www.opengis.net/xls", "ResponseHeader"),
					ResponseHeaderType.class, header));

			return convertObject2OMElement(xlsType, XLSType.class);
		} catch (AxisFault e) {
			LOG.error(e, e.getCause());
			throw e;
		}
	}

	/**
	 * Given a {@link XLSType} object, it returns the method called.
	 * 
	 * @param parameter
	 * @return
	 * @throws AxisFault
	 */
	public static String getMethod(OMElement parameter) throws AxisFault {
		try {
			net.opengis.xls.v_1_2_0.XLSType xlsType = Utils
					.getXLSElement(parameter);

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
	 * Given a {@link OMElement} object, it returns the {@link Object} inside.
	 * 
	 * @param parameter
	 * @param classType
	 * @return
	 * @throws AxisFault
	 */
	public static Object convertOMElement2Object(OMElement parameter,
			Class<?> classType) throws JAXBException, XMLStreamException,
			FactoryConfigurationError, SAXException {
		return convertOMElement2Object(parameter, classType, false);
	}

	/**
	 * Given a {@link OMElement} object, it returns the {@link Object} inside.
	 * 
	 * @param parameter
	 * @param classType
	 * @param useType
	 * @return
	 * @throws AxisFault
	 */
	public static Object convertOMElement2Object(OMElement parameter,
			Class<?> classType, boolean useType) throws JAXBException,
			XMLStreamException, FactoryConfigurationError, SAXException {
		try {
			Unmarshaller unmarshaller = JAXB_C.createUnmarshaller();
			String xml = getXML(parameter);

			if (!useType) {
				xml = StringUtils.replace(xml, "type ", " ");
				xml = StringUtils.replace(xml, "Type ", " ");
				xml = StringUtils.replace(xml, "type>", ">");
				xml = StringUtils.replace(xml, "Type>", ">");
			}

			if (LOG.isTraceEnabled()) {
				LOG.trace("Converting");
				LOG.trace(xml);
				LOG.trace("to " + classType);
			}

			StringReader sr = new StringReader(xml);
			NamespaceFilter inFilter = new NamespaceFilter("", false);
			inFilter.setParent(XMLReaderFactory.createXMLReader());
			SAXSource source = new SAXSource(inFilter, new InputSource(sr));
			Object resultado = unmarshaller.unmarshal(source);
			if (resultado instanceof JAXBElement)
				resultado = ((JAXBElement) resultado).getValue();

			LOG.trace("We return " + resultado);

			return resultado;
		} catch (JAXBException e) {
			LOG.error(e, e);
			throw e;
		} catch (XMLStreamException e) {
			LOG.error(e, e);
			throw e;
		} catch (SAXException e) {
			LOG.error(e, e);
			throw e;
		} catch (FactoryConfigurationError e) {
			LOG.error(e, e);
			throw e;
		}
	}

	static net.opengis.xls.v_1_2_0.XLSType getXLSElement(OMElement parameter)
			throws JAXBException, XMLStreamException, SAXException {

		Class<XLSType> classType = XLSType.class;

		XLSType xlsType = (XLSType) convertOMElement2Object(parameter,
				classType);

		return xlsType;
	}

	/**
	 * Check if rules contains method, ignoring case.
	 * 
	 * @param rules
	 * @param method
	 * @return
	 */
	public static boolean equals(String[] rules, String method) {
		for (String rule : rules)
			if (StringUtils.equalsIgnoreCase(method, rule))
				return true;
		return false;
	}

	public static OMElement convertFile2OMElement(String path,
			Class<?> classType) throws FileNotFoundException, JAXBException {
		Unmarshaller m = JAXBContext.newInstance(classType)
				.createUnmarshaller();
		SAXOMBuilder builder = new SAXOMBuilder();
		Object tmp = m.unmarshal(Utils.class.getResourceAsStream(path));

		Marshaller mar = JAXBContext.newInstance(classType).createMarshaller();
		mar.marshal(tmp, builder);

		OMElement element = builder.getRootElement();
		return element;
	}

}
