package org.gofleet.openls;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLStreamException;

import net.opengis.gml.v_3_1_1.DirectPositionType;
import net.opengis.xls.v_1_2_0.AbstractBodyType;
import net.opengis.xls.v_1_2_0.AbstractResponseParametersType;
import net.opengis.xls.v_1_2_0.DetermineRouteResponseType;
import net.opengis.xls.v_1_2_0.ResponseType;
import net.opengis.xls.v_1_2_0.RouteGeometryType;
import net.opengis.xls.v_1_2_0.XLSType;

import org.apache.axiom.om.OMElement;
import org.apache.axis2.AxisFault;
import org.gofleet.openLS.OpenLS;
import org.gofleet.openLS.Utils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.xml.sax.SAXException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class RoutingServiceTests {

	@Autowired
	OpenLS openLS;

	@Test
	public void testSimpleRoute() throws AxisFault, FileNotFoundException,
			JAXBException, XMLStreamException, FactoryConfigurationError,
			SAXException {
		OMElement resultado = openLS.openLS(Utils.convertFile2OMElement(
				"/determineRouteRequest.xml", XLSType.class));

		assertNotNull("Empty response", resultado);

		assertEquals("This is no XLS object", resultado.getQName()
				.getLocalPart(), "xlsType");
		assertEquals("Wrong namespace", resultado.getQName().getNamespaceURI(),
				"http://www.opengis.net/xls");

		Object object = Utils.convertOMElement2Object(resultado, XLSType.class,
				true);

		assertTrue("This is no XLS object", object instanceof XLSType);

		XLSType xls = (XLSType) object;

		assertNotNull("The response is null", xls);

		assertNotNull("The body is null.", xls.getBody());

		List<JAXBElement<? extends AbstractBodyType>> body = xls.getBody();

		assertNotNull("The body is null! How? We have just checked it!", body);

		assertTrue("The body should be unique", body.size() == 1);

		Object o = body.get(0).getValue();

		assertTrue("This is no response!", o instanceof ResponseType);

		ResponseType response = (ResponseType) o;

		assertNotNull("The contents of the body are null? (ResponseType)",
				response);

		assertEquals("I should have only one response", response
				.getNumberOfResponses().intValue(), 1);

		assertNotNull("Response parameters are null!",
				response.getResponseParameters());

		AbstractResponseParametersType arpt = response.getResponseParameters()
				.getValue();

		assertTrue("The response is not a route response",
				arpt instanceof DetermineRouteResponseType);

		DetermineRouteResponseType drrt = (DetermineRouteResponseType) arpt;

		assertNotNull("There should be a response (determineRouteResponse",
				drrt);

		assertNotNull("The geometry shouldn't be null", drrt.getRouteGeometry());

		RouteGeometryType routeGeometry = drrt.getRouteGeometry();

		assertNotNull("There should be a linestring",
				routeGeometry.getLineString());

		List<JAXBElement<?>> posOrPointPropertyOrPointRep = routeGeometry
				.getLineString().getPosOrPointPropertyOrPointRep();

		assertNotNull("There should be a list of positions",
				posOrPointPropertyOrPointRep);

		assertEquals("I was expecting four points",
				posOrPointPropertyOrPointRep.size(), 4);

		for (JAXBElement<?> element : posOrPointPropertyOrPointRep) {
			assertNotNull(element);
			o = element.getValue();
			assertNotNull(o);
			assertTrue(o instanceof DirectPositionType);
			DirectPositionType dpt = new DirectPositionType();
			// assertTrue(dpt.getSrsName().indexOf("4326") > 0);
			assertEquals("Are we working on " + dpt.getValue().size()
					+ " dimensions?" + dpt, dpt.getValue().size(), 2);

			for (Double d : dpt.getValue())
				assertNotNull(d);
		}

	}
}
