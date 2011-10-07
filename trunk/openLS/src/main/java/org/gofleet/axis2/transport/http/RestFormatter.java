package org.gofleet.axis2.transport.http;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.URL;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMOutputFormat;
import org.apache.axis2.AxisFault;
import org.apache.axis2.Constants;
import org.apache.axis2.context.MessageContext;
import org.apache.axis2.transport.MessageFormatter;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xmlbeans.impl.common.XmlReaderToWriter;

public class RestFormatter implements MessageFormatter {

	Log LOG = LogFactory.getLog(RestFormatter.class);

	public String formatSOAPAction(MessageContext arg0, OMOutputFormat arg1,
			String arg2) {
		LOG.trace("formatSOAPAction(" + arg0 + ", " + arg1 + ", " + arg2 + ")");
		return arg2;
	}

	public byte[] getBytes(MessageContext msgCtxt, OMOutputFormat format)
			throws AxisFault {
		try {
			LOG.trace("getBytes(" + msgCtxt + ", " + format + ")");
			OMElement element = msgCtxt.getEnvelope().getBody()
					.getFirstElement();
			ByteArrayOutputStream bytesOut = new ByteArrayOutputStream();
			XMLStreamWriter writer = getXMLWriter(bytesOut, format);
			XmlReaderToWriter.writeAll(element.getXMLStreamReader(), writer);
			return bytesOut.toByteArray();
		} catch (Throwable e) {
			LOG.error(e, e);
			throw AxisFault.makeFault(e);
		}

	}

	private XMLStreamWriter getXMLWriter(OutputStream outStream,
			OMOutputFormat format) throws AxisFault {
		try {
			LOG.trace("getXMLWriter(" + outStream + ", "
					+ format.getCharSetEncoding() + ")");
			return getXMLWriter(new OutputStreamWriter(outStream,
					format.getCharSetEncoding()));
		} catch (UnsupportedEncodingException ex) {
			LOG.error(ex, ex);
			throw AxisFault.makeFault(ex);
		}
	}

	protected XMLStreamWriter getXMLWriter(Writer writer) {
		try {
			LOG.trace("getXMLWriter(" + writer + ")");
			XMLOutputFactory xof = XMLOutputFactory.newInstance();
			return xof.createXMLStreamWriter(writer);
		} catch (XMLStreamException e) {
			LOG.error(e, e);
			LOG.error(AxisFault.makeFault(e));
			return null;
		}
	}

	public String getContentType(MessageContext msgCtxt, OMOutputFormat format,
			String arg2) {
		try {
			LOG.trace("getContentType(" + msgCtxt + "," + format + ")");
			String contentType = (String) msgCtxt
					.getProperty(Constants.Configuration.CONTENT_TYPE);
			String encoding = format.getCharSetEncoding();
			if (contentType == null) {
				contentType = (String) msgCtxt
						.getProperty(Constants.Configuration.MESSAGE_TYPE);
			}
			if (encoding != null) {
				contentType += "; charset=" + encoding;
			}
			LOG.trace("Content Type detected: " + contentType);

			if (format.getXmlVersion() == null)
				format.setXmlVersion("1.0");

			if (format.getContentType() == null)
				format.setContentType(contentType);

			return contentType;
		} catch (Throwable t) {
			LOG.error(t, t);
			return "";
		}
	}

	public URL getTargetAddress(MessageContext msgCtxt, OMOutputFormat format,
			URL targetURL) throws AxisFault {
		LOG.trace("getTargetAddress(" + targetURL + ")");
		return targetURL;
	}

	public void writeTo(MessageContext msgCtxt, OMOutputFormat format,
			OutputStream out, boolean arg3) throws AxisFault {
		try {
			LOG.trace("writeTo(" + msgCtxt + ", " + format + ")");
			out.write(getBytes(msgCtxt, format));
		} catch (Throwable e) {
			LOG.error(e, e);
			throw AxisFault.makeFault(e);
		}
	}
}
