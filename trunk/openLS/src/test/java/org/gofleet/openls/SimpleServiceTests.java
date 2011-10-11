package org.gofleet.openls;

import java.io.FileNotFoundException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import net.opengis.xls.v_1_2_0.XLSType;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.impl.builder.SAXOMBuilder;
import org.apache.axis2.AxisFault;
import org.gofleet.openLS.OpenLS;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class SimpleServiceTests {

	@Autowired
	OpenLS openLS;

	@Test
	public void testEmptyRoute() throws AxisFault, FileNotFoundException,
			JAXBException {
		openLS.openLS(convertFile2OMElement("determineRouteRequest.xml",
				XLSType.class));
	}

	@Test
	public void testEmptyGeocoding() throws AxisFault, FileNotFoundException,
			JAXBException {
		openLS.openLS(convertFile2OMElement("geocodingRequest.xml",
				XLSType.class));
	}

	@Test
	public void testEmptyReverseGeocoding() throws AxisFault,
			FileNotFoundException, JAXBException {
		openLS.openLS(convertFile2OMElement("reverseGeocodingRequest.xml",
				XLSType.class));
	}

	private OMElement convertFile2OMElement(String path, Class<?> classType)
			throws FileNotFoundException, JAXBException {
		Unmarshaller m = JAXBContext.newInstance(classType)
				.createUnmarshaller();
		SAXOMBuilder builder = new SAXOMBuilder();
		Object tmp = m.unmarshal(this.getClass().getResourceAsStream(
				"/determineRouteRequest.xml"));

		Marshaller mar = JAXBContext.newInstance(classType).createMarshaller();
		mar.marshal(tmp, builder);

		OMElement element = builder.getRootElement();
		return element;
	}
}