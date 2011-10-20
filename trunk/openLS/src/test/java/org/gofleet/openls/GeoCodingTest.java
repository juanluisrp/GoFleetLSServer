package org.gofleet.openls;

/*
 * Copyright (C) 2011, Emergya (http://www.emergya.es)
 *
 * @author <a href="mailto:marcos@emergya.es">Moisés Arcos</a>
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
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLStreamException;

import net.opengis.gml.v_3_1_1.DirectPositionType;
import net.opengis.gml.v_3_1_1.PointType;
import net.opengis.xls.v_1_2_0.AbstractBodyType;
import net.opengis.xls.v_1_2_0.AbstractResponseParametersType;
import net.opengis.xls.v_1_2_0.AddressType;
import net.opengis.xls.v_1_2_0.GeocodeResponseListType;
import net.opengis.xls.v_1_2_0.GeocodeResponseType;
import net.opengis.xls.v_1_2_0.GeocodedAddressType;
import net.opengis.xls.v_1_2_0.PositionType;
import net.opengis.xls.v_1_2_0.ResponseType;
import net.opengis.xls.v_1_2_0.ReverseGeocodeRequestType;
import net.opengis.xls.v_1_2_0.ReverseGeocodeResponseType;
import net.opengis.xls.v_1_2_0.ReverseGeocodedLocationType;
import net.opengis.xls.v_1_2_0.XLSType;

import org.apache.axiom.om.OMElement;
import org.apache.axis2.AxisFault;
import org.gofleet.openLS.OpenLS;
import org.gofleet.openLS.ddbb.GeoCoding;
import org.gofleet.openLS.util.Utils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.xml.sax.SAXException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class GeoCodingTest {

	@Autowired
	GeoCoding geocoding;
	@Autowired
	OpenLS openLS;

	@Test
	public void testReverseGeocoding() {

		// Lista de valores del punto
		ArrayList<Double> list = new ArrayList<Double>();
		list.add(37.38);
		list.add(-5.99);

		// Punto que dará contenido al parámetro de entrada
		PointType point = new PointType();
		DirectPositionType pos = new DirectPositionType();
		pos.setValue(list);
		point.setPos(pos);

		// Posición de prueba para el parámetro
		PositionType position = new PositionType();
		position.setPoint(point);

		// Parametros del servicio
		ReverseGeocodeRequestType param = new ReverseGeocodeRequestType();
		param.setPosition(position);
		assertNotNull(param);

		// Servicio de geocoding al que se le introduce los parametros
		ReverseGeocodeResponseType res = geocoding.reverseGeocode(param);
		assertNotNull(res);

		List<ReverseGeocodedLocationType> res_array = res
				.getReverseGeocodedLocation();
		assertNotNull(res_array);
		assertTrue(res_array.size() > 0);
		for (ReverseGeocodedLocationType locationType : res_array) {
			AddressType addressRes = locationType.getAddress();
			PointType pointRes = locationType.getPoint();
			// Comprobamos que cada parámetro de la dirección no sea nulo
			assertNotNull(addressRes.getAddressee());
			assertNotNull(addressRes.getLanguage());
			assertNotNull(addressRes.getPostalCode());
			assertNotNull(addressRes.getCountryCode());
			// Comprobamos que el punto del resultado es el mismo que el del
			// origen
			assertTrue(pointRes.equals(point));
		}

	}

	@Test
	public void testGeocoding() throws AxisFault, FileNotFoundException,
			JAXBException, XMLStreamException, FactoryConfigurationError,
			SAXException {
		OMElement resultado = openLS.openLS(Utils.convertFile2OMElement(
				"/geocodingRequest.xml", XLSType.class));

		Object object = Utils.convertOMElement2Object(resultado, XLSType.class,
				true);

		assertTrue("This is no XLS object", object instanceof XLSType);

		XLSType xls = (XLSType) object;

		assertNotNull("The response is null", xls);

		assertNotNull("The body is null.", xls.getBody());

		List<JAXBElement<? extends AbstractBodyType>> body = xls.getBody();

		assertNotNull("The body is null! How? We have just checked it!", body);

		assertEquals("The body should jave three responses", body.size(), 3);

		for (JAXBElement<? extends AbstractBodyType> body_ : body) {
			AbstractBodyType o = body_.getValue();

			assertTrue("This is no response!", o instanceof ResponseType);

			ResponseType response = (ResponseType) o;

			assertNotNull("The contents of the body are null? (ResponseType)",
					response);

			assertEquals("I should have only one response", response
					.getNumberOfResponses().intValue(), 1);

			assertNotNull("Response parameters are null!",
					response.getResponseParameters());

			AbstractResponseParametersType arpt = response
					.getResponseParameters().getValue();

			assertTrue("The response is not a geocode response",
					arpt instanceof GeocodeResponseType);

			GeocodeResponseType grrt = (GeocodeResponseType) arpt;
			for (GeocodeResponseListType list : grrt.getGeocodeResponseList()) {
				List<GeocodedAddressType> arrayAddress = list
						.getGeocodedAddress();
				assertTrue(arrayAddress.size() > 0);
				for (GeocodedAddressType addressType : arrayAddress) {
					AddressType paramEval = addressType.getAddress();
					assertNotNull(paramEval.getCountryCode());
					assertNotNull(paramEval.getStreetAddress());
					assertNotNull(paramEval.getPlace());
				}
			}
		}
	}
}
