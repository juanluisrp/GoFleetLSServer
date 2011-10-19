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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import net.opengis.gml.v_3_1_1.DirectPositionType;
import net.opengis.gml.v_3_1_1.PointType;
import net.opengis.xls.v_1_2_0.AbstractResponseParametersType;
import net.opengis.xls.v_1_2_0.AddressType;
import net.opengis.xls.v_1_2_0.GeocodeRequestType;
import net.opengis.xls.v_1_2_0.GeocodeResponseListType;
import net.opengis.xls.v_1_2_0.GeocodeResponseType;
import net.opengis.xls.v_1_2_0.GeocodedAddressType;
import net.opengis.xls.v_1_2_0.PositionType;
import net.opengis.xls.v_1_2_0.ReverseGeocodeRequestType;
import net.opengis.xls.v_1_2_0.ReverseGeocodeResponseType;
import net.opengis.xls.v_1_2_0.ReverseGeocodedLocationType;

import org.gofleet.openLS.ddbb.GeoCoding;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class GeoCodingTest {

	@Autowired
	GeoCoding geocoding;

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
		int i = 0;
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
			i++;
		}

	}

	@Test
	public void testGeocoding() {

		// Comprobamos que pasándole un nombre de una calle nos complete los
		// demas campos

		String addressee = "Avenida Innovación";
		assertNotNull(addressee);

		AddressType address = new AddressType();
		assertNotNull(address);
		address.setAddressee(addressee);
		List<AddressType> addressArray = new LinkedList<AddressType>();

		GeocodeRequestType param = new GeocodeRequestType();
		param.setAddress(addressArray);
		assertNotNull(param);

		List<List<AbstractResponseParametersType>> listres = geocoding.geocoding(param);
		
		GeocodeResponseType res = (GeocodeResponseType) listres.get(0).get(0);
		// Que el resultado no sea nulo
		assertNotNull(res);
		List<GeocodeResponseListType> arrayRes = res.getGeocodeResponseList();
		int i = 0;
		int j = 0;
		// Que el array tenga algun dato
		assertTrue(arrayRes.size() > 0);
		for (GeocodeResponseListType list : arrayRes) {
			List<GeocodedAddressType> arrayAddress = list.getGeocodedAddress();
			assertTrue(arrayAddress.size() > 0);
			for (GeocodedAddressType addressType : arrayAddress) {
				AddressType paramEval = addressType.getAddress();
				// Comprobamos que cada uno de los parámetros no sea nulo
				assertNotNull(paramEval.getCountryCode());
				assertNotNull(paramEval.getLanguage());
				assertNotNull(paramEval.getPostalCode());
				assertNotNull(paramEval.getStreetAddress());
				j++;
			}
			i++;
		}
	}
}
