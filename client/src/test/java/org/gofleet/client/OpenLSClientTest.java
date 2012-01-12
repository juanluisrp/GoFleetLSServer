/*
 * Copyright (C) 2012, Emergya (http://www.emergya.com)
 *
 * @author <a href="mailto:marias@emergya.com">María Arias de Reyna</a>
 *
 * This file is part of GoFleetLS
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
package org.gofleet.client;

import static org.junit.Assert.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import net.opengis.xls.v_1_2_0.XLSType;

import org.gofleetls.client.OpenLSClient;
import org.junit.Test;

/**
 * @author marias
 * 
 */
public class OpenLSClientTest {

	private String url = "http://localhost:8080/gofleetLS/";
	/**
	 * Test method for
	 * {@link org.gofleetls.client.OpenLSClient#post(net.opengis.xls.v_1_2_0.XLSType, java.lang.String)}
	 * .
	 * @throws JAXBException 
	 */
	@Test
	@SuppressWarnings("restriction")
	public void testPost() throws JAXBException {
		Unmarshaller m = JAXBContext.newInstance(XLSType.class)
				.createUnmarshaller();
		JAXBElement<XLSType> object = (JAXBElement<XLSType>) m.unmarshal(OpenLSClientTest.class
				.getResourceAsStream("/determineRouteRequest.xml"));

		assertNotNull(OpenLSClient.post(object.getValue(), url));
	}
}
