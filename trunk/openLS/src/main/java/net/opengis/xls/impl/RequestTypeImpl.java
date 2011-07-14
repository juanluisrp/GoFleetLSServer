/*
 * XML Type:  RequestType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.RequestType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML RequestType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class RequestTypeImpl extends net.opengis.xls.impl.AbstractBodyTypeImpl implements net.opengis.xls.RequestType
{
    private static final long serialVersionUID = 1L;
    
    public RequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQUESTPARAMETERS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_RequestParameters");
    private static final org.apache.xmlbeans.QNameSet REQUESTPARAMETERS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "PortrayMapRequest"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "GeocodeRequest"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_RequestParameters"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "DetermineRouteRequest"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "DirectoryRequest"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "GetPortrayMapCapabilitiesRequest"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "ReverseGeocodeRequest"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "SLIR"),
    });
    private static final javax.xml.namespace.QName METHODNAME$2 = 
        new javax.xml.namespace.QName("", "methodName");
    private static final javax.xml.namespace.QName VERSION$4 = 
        new javax.xml.namespace.QName("", "version");
    private static final javax.xml.namespace.QName REQUESTID$6 = 
        new javax.xml.namespace.QName("", "requestID");
    private static final javax.xml.namespace.QName MAXIMUMRESPONSES$8 = 
        new javax.xml.namespace.QName("", "maximumResponses");
    
    
    /**
     * Gets the "_RequestParameters" element
     */
    public net.opengis.xls.AbstractRequestParametersType getRequestParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractRequestParametersType target = null;
            target = (net.opengis.xls.AbstractRequestParametersType)get_store().find_element_user(REQUESTPARAMETERS$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "_RequestParameters" element
     */
    public boolean isSetRequestParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUESTPARAMETERS$1) != 0;
        }
    }
    
    /**
     * Sets the "_RequestParameters" element
     */
    public void setRequestParameters(net.opengis.xls.AbstractRequestParametersType requestParameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractRequestParametersType target = null;
            target = (net.opengis.xls.AbstractRequestParametersType)get_store().find_element_user(REQUESTPARAMETERS$1, 0);
            if (target == null)
            {
                target = (net.opengis.xls.AbstractRequestParametersType)get_store().add_element_user(REQUESTPARAMETERS$0);
            }
            target.set(requestParameters);
        }
    }
    
    /**
     * Appends and returns a new empty "_RequestParameters" element
     */
    public net.opengis.xls.AbstractRequestParametersType addNewRequestParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractRequestParametersType target = null;
            target = (net.opengis.xls.AbstractRequestParametersType)get_store().add_element_user(REQUESTPARAMETERS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "_RequestParameters" element
     */
    public void unsetRequestParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUESTPARAMETERS$1, 0);
        }
    }
    
    /**
     * Gets the "methodName" attribute
     */
    public java.lang.String getMethodName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHODNAME$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "methodName" attribute
     */
    public org.apache.xmlbeans.XmlNMTOKEN xgetMethodName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(METHODNAME$2);
            return target;
        }
    }
    
    /**
     * Sets the "methodName" attribute
     */
    public void setMethodName(java.lang.String methodName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHODNAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(METHODNAME$2);
            }
            target.setStringValue(methodName);
        }
    }
    
    /**
     * Sets (as xml) the "methodName" attribute
     */
    public void xsetMethodName(org.apache.xmlbeans.XmlNMTOKEN methodName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(METHODNAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(METHODNAME$2);
            }
            target.set(methodName);
        }
    }
    
    /**
     * Gets the "version" attribute
     */
    public java.lang.String getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "version" attribute
     */
    public org.apache.xmlbeans.XmlString xgetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSION$4);
            return target;
        }
    }
    
    /**
     * Sets the "version" attribute
     */
    public void setVersion(java.lang.String version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$4);
            }
            target.setStringValue(version);
        }
    }
    
    /**
     * Sets (as xml) the "version" attribute
     */
    public void xsetVersion(org.apache.xmlbeans.XmlString version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VERSION$4);
            }
            target.set(version);
        }
    }
    
    /**
     * Gets the "requestID" attribute
     */
    public java.lang.String getRequestID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUESTID$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "requestID" attribute
     */
    public org.apache.xmlbeans.XmlString xgetRequestID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REQUESTID$6);
            return target;
        }
    }
    
    /**
     * Sets the "requestID" attribute
     */
    public void setRequestID(java.lang.String requestID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUESTID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REQUESTID$6);
            }
            target.setStringValue(requestID);
        }
    }
    
    /**
     * Sets (as xml) the "requestID" attribute
     */
    public void xsetRequestID(org.apache.xmlbeans.XmlString requestID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REQUESTID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REQUESTID$6);
            }
            target.set(requestID);
        }
    }
    
    /**
     * Gets the "maximumResponses" attribute
     */
    public java.math.BigInteger getMaximumResponses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXIMUMRESPONSES$8);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "maximumResponses" attribute
     */
    public org.apache.xmlbeans.XmlNonNegativeInteger xgetMaximumResponses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(MAXIMUMRESPONSES$8);
            return target;
        }
    }
    
    /**
     * True if has "maximumResponses" attribute
     */
    public boolean isSetMaximumResponses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MAXIMUMRESPONSES$8) != null;
        }
    }
    
    /**
     * Sets the "maximumResponses" attribute
     */
    public void setMaximumResponses(java.math.BigInteger maximumResponses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXIMUMRESPONSES$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAXIMUMRESPONSES$8);
            }
            target.setBigIntegerValue(maximumResponses);
        }
    }
    
    /**
     * Sets (as xml) the "maximumResponses" attribute
     */
    public void xsetMaximumResponses(org.apache.xmlbeans.XmlNonNegativeInteger maximumResponses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(MAXIMUMRESPONSES$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_attribute_user(MAXIMUMRESPONSES$8);
            }
            target.set(maximumResponses);
        }
    }
    
    /**
     * Unsets the "maximumResponses" attribute
     */
    public void unsetMaximumResponses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MAXIMUMRESPONSES$8);
        }
    }
}
