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
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Repeat;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class SimpleServiceTests {

	@Autowired
	OpenLS openLS;
	static OMElement determineRouteRequest = null;
	static OMElement geocodingRequest = null;
	static OMElement reverseGeocodingRequest = null;

	@BeforeClass
	public static void initialize() throws FileNotFoundException, JAXBException {
		determineRouteRequest = convertFile2OMElement(
				"/determineRouteRequest.xml", XLSType.class);
		geocodingRequest = convertFile2OMElement("/geocodingRequest.xml",
				XLSType.class);
		reverseGeocodingRequest = convertFile2OMElement(
				"/reverseGeocoding.xml", XLSType.class);
	}

	@Test(timeout = 15000)
	@Repeat(value = 10)
	public void testEmptyRoute() throws AxisFault, FileNotFoundException,
			JAXBException {
		openLS.openLS(determineRouteRequest);
	}

	@Test(timeout = 5000)
	@Repeat(value = 10)
	public void testEmptyGeocoding() throws AxisFault, FileNotFoundException,
			JAXBException {
		openLS.openLS(geocodingRequest);
	}

	@Test(timeout = 1000)
	public void testEmptyDirectory() throws AxisFault, FileNotFoundException,
			JAXBException {
		openLS.openLS(convertFile2OMElement("/directory.xml", XLSType.class));
	}

	@Test(timeout = 5000)
	@Repeat(value = 10)
	public void testEmptyReverseGeocoding() throws AxisFault,
			FileNotFoundException, JAXBException {
		openLS.openLS(reverseGeocodingRequest);
	}

	private static OMElement convertFile2OMElement(String path,
			Class<?> classType) throws FileNotFoundException, JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(classType);
		Unmarshaller m = jaxbContext.createUnmarshaller();
		SAXOMBuilder builder = new SAXOMBuilder();
		Object tmp = m.unmarshal(SimpleServiceTests.class
				.getResourceAsStream(path));
		Marshaller mar = jaxbContext.createMarshaller();
		mar.marshal(tmp, builder);

		OMElement element = builder.getRootElement();
		return element;
	}
}
