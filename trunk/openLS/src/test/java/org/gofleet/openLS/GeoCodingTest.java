
package org.gofleet.openLS;
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
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import net.opengis.gml.DirectPositionType;
import net.opengis.gml.PointType;
import net.opengis.xls.AddressType;
import net.opengis.xls.GeocodeRequestType;
import net.opengis.xls.GeocodeResponseListType;
import net.opengis.xls.GeocodeResponseType;
import net.opengis.xls.GeocodedAddressType;
import net.opengis.xls.PositionType;
import net.opengis.xls.ReverseGeocodeRequestType;
import net.opengis.xls.ReverseGeocodeResponseType;
import net.opengis.xls.ReverseGeocodedLocationType;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GeoCodingTest {
	
	private GeoCoding geocoding;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

		geocoding = new GeoCoding();
	}

	
	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void testReverseGeocoding() {

		// Lista de valores del punto
		ArrayList<String> list = new ArrayList<String>();
		list.add("37.38");
		list.add("-5.99");

		// Punto que dará contenido al parámetro de entrada
		PointType point = new net.opengis.xls.gofleet.PointType();
		DirectPositionType pos = new net.opengis.xls.gofleet.DirectPositionType();
		pos.setListValue(list);
		point.setPos(pos);

		// Posición de prueba para el parámetro
		PositionType position = new net.opengis.xls.gofleet.PositionType();
		position.setPoint(point);

		// Parametros del servicio
		ReverseGeocodeRequestType param = new net.opengis.xls.gofleet.ReverseGeocodeRequestType();
		param.setPosition(position);
		assertNotNull(param);

		// Servicio de geocoding al que se le introduce los parametros
		ReverseGeocodeResponseType res = geocoding.reverseGeocoding(param);
		assertNotNull(res);
		
		ReverseGeocodedLocationType[] res_array = res.getReverseGeocodedLocationArray();
		assertNotNull(res_array);
		int i = 0;
		assertTrue(res_array.length > 0);
		while(i<res_array.length){
			AddressType addressRes = res_array[i].getAddress();
			PointType pointRes = res_array[i].getPoint();
			// Comprobamos que cada parámetro de la dirección no sea nulo
			assertNotNull(addressRes.getAddressee());
			assertNotNull(addressRes.getLanguage());
			assertNotNull(addressRes.getPostalCode());
			assertNotNull(addressRes.getCountryCode());
			// Comprobamos que el punto del resultado es el mismo que el del origen
			assertTrue(pointRes.equals(point));
			i++;
		}
		
	}

	@Test
	public void testGeocoding() {
		
		// Comprobamos que pasándole un nombre de una calle nos complete los demas campos
		
		String addressee = "Avenida Innovación";
		assertNotNull(addressee);
		
		AddressType address = new net.opengis.xls.gofleet.AddressType();
		assertNotNull(address);
		address.setAddressee(addressee);
		AddressType[] addressArray;
		addressArray = new AddressType[1];

		GeocodeRequestType param = new net.opengis.xls.gofleet.GeocodeRequestType();
		param.setAddressArray(addressArray);
		assertNotNull(param);

		GeocodeResponseType res = geocoding.geocoding(param);
		// Que el resultado no sea nulo
		assertNotNull(res);
		GeocodeResponseListType[] arrayRes = res.getGeocodeResponseListArray();
		int i = 0;
		int j = 0;
		// Que el array tenga algun dato
		assertTrue(arrayRes.length>0);
		while(i<arrayRes.length){
			GeocodedAddressType[] arrayAddress = arrayRes[i].getGeocodedAddressArray();
			assertTrue(arrayAddress.length>0);
			while(j<arrayAddress.length){
				AddressType paramEval = arrayAddress[j].addNewAddress();
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
