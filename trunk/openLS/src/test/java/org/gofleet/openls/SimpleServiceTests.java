package org.gofleet.openls;

import java.io.FileNotFoundException;

import javax.xml.bind.JAXBException;

import net.opengis.xls.v_1_2_0.XLSType;

import org.apache.axiom.om.OMElement;
import org.apache.axis2.AxisFault;
import org.gofleet.openLS.OpenLS;
import org.gofleet.openLS.util.Utils;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.ExpectedException;
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
	static OMElement directoryRequest = null;

	@BeforeClass
	public static void initialize() throws FileNotFoundException, JAXBException {
		determineRouteRequest = Utils.convertFile2OMElement(
				"/determineRouteRequest.xml", XLSType.class);
		geocodingRequest = Utils.convertFile2OMElement("/geocodingRequest.xml",
				XLSType.class);
		reverseGeocodingRequest = Utils.convertFile2OMElement(
				"/reverseGeocoding.xml", XLSType.class);
		directoryRequest = Utils.convertFile2OMElement("/directory.xml",
				XLSType.class);
	}

	@Test(timeout = 20000)
	@Repeat(value = 10)
	public void testEmptyRoute() throws AxisFault, FileNotFoundException,
			JAXBException {
		openLS.openLS(determineRouteRequest);
	}

	@Test(timeout = 5000)
	@Repeat(value = 8)
	public void testEmptyGeocoding() throws AxisFault, FileNotFoundException,
			JAXBException {
		openLS.openLS(geocodingRequest);
	}

	@Test(timeout = 1000)
	@ExpectedException(value = AxisFault.class)
	public void testEmptyDirectory() throws AxisFault, FileNotFoundException,
			JAXBException {
		openLS.openLS(directoryRequest);
	}

	@Test(timeout = 5000)
	@Repeat(value = 8)
	public void testEmptyReverseGeocoding() throws AxisFault,
			FileNotFoundException, JAXBException {
		openLS.openLS(reverseGeocodingRequest);
	}
}
