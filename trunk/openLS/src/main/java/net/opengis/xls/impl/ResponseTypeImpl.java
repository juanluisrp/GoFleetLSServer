/*
 * XML Type:  ResponseType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.ResponseType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML ResponseType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class ResponseTypeImpl extends net.opengis.xls.impl.AbstractBodyTypeImpl implements net.opengis.xls.ResponseType
{
    private static final long serialVersionUID = 1L;
    
    public ResponseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERRORLIST$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "ErrorList");
    private static final javax.xml.namespace.QName RESPONSEPARAMETERS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_ResponseParameters");
    private static final org.apache.xmlbeans.QNameSet RESPONSEPARAMETERS$3 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "PortrayMapResponse"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_ResponseParameters"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "GetPortrayMapCapabilitiesResponse"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "DetermineRouteResponse"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "DirectoryResponse"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "ReverseGeocodeResponse"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "GeocodeResponse"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "SLIA"),
    });
    private static final javax.xml.namespace.QName VERSION$4 = 
        new javax.xml.namespace.QName("", "version");
    private static final javax.xml.namespace.QName REQUESTID$6 = 
        new javax.xml.namespace.QName("", "requestID");
    private static final javax.xml.namespace.QName NUMBEROFRESPONSES$8 = 
        new javax.xml.namespace.QName("", "numberOfResponses");
    
    
    /**
     * Gets the "ErrorList" element
     */
    public net.opengis.xls.ErrorListType getErrorList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ErrorListType target = null;
            target = (net.opengis.xls.ErrorListType)get_store().find_element_user(ERRORLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ErrorList" element
     */
    public boolean isSetErrorList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRORLIST$0) != 0;
        }
    }
    
    /**
     * Sets the "ErrorList" element
     */
    public void setErrorList(net.opengis.xls.ErrorListType errorList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ErrorListType target = null;
            target = (net.opengis.xls.ErrorListType)get_store().find_element_user(ERRORLIST$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.ErrorListType)get_store().add_element_user(ERRORLIST$0);
            }
            target.set(errorList);
        }
    }
    
    /**
     * Appends and returns a new empty "ErrorList" element
     */
    public net.opengis.xls.ErrorListType addNewErrorList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ErrorListType target = null;
            target = (net.opengis.xls.ErrorListType)get_store().add_element_user(ERRORLIST$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ErrorList" element
     */
    public void unsetErrorList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRORLIST$0, 0);
        }
    }
    
    /**
     * Gets the "_ResponseParameters" element
     */
    public net.opengis.xls.AbstractResponseParametersType getResponseParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractResponseParametersType target = null;
            target = (net.opengis.xls.AbstractResponseParametersType)get_store().find_element_user(RESPONSEPARAMETERS$3, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "_ResponseParameters" element
     */
    public boolean isSetResponseParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESPONSEPARAMETERS$3) != 0;
        }
    }
    
    /**
     * Sets the "_ResponseParameters" element
     */
    public void setResponseParameters(net.opengis.xls.AbstractResponseParametersType responseParameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractResponseParametersType target = null;
            target = (net.opengis.xls.AbstractResponseParametersType)get_store().find_element_user(RESPONSEPARAMETERS$3, 0);
            if (target == null)
            {
                target = (net.opengis.xls.AbstractResponseParametersType)get_store().add_element_user(RESPONSEPARAMETERS$2);
            }
            target.set(responseParameters);
        }
    }
    
    /**
     * Appends and returns a new empty "_ResponseParameters" element
     */
    public net.opengis.xls.AbstractResponseParametersType addNewResponseParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractResponseParametersType target = null;
            target = (net.opengis.xls.AbstractResponseParametersType)get_store().add_element_user(RESPONSEPARAMETERS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "_ResponseParameters" element
     */
    public void unsetResponseParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESPONSEPARAMETERS$3, 0);
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
     * Gets the "numberOfResponses" attribute
     */
    public java.math.BigInteger getNumberOfResponses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMBEROFRESPONSES$8);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "numberOfResponses" attribute
     */
    public org.apache.xmlbeans.XmlNonNegativeInteger xgetNumberOfResponses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(NUMBEROFRESPONSES$8);
            return target;
        }
    }
    
    /**
     * True if has "numberOfResponses" attribute
     */
    public boolean isSetNumberOfResponses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NUMBEROFRESPONSES$8) != null;
        }
    }
    
    /**
     * Sets the "numberOfResponses" attribute
     */
    public void setNumberOfResponses(java.math.BigInteger numberOfResponses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMBEROFRESPONSES$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NUMBEROFRESPONSES$8);
            }
            target.setBigIntegerValue(numberOfResponses);
        }
    }
    
    /**
     * Sets (as xml) the "numberOfResponses" attribute
     */
    public void xsetNumberOfResponses(org.apache.xmlbeans.XmlNonNegativeInteger numberOfResponses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(NUMBEROFRESPONSES$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_attribute_user(NUMBEROFRESPONSES$8);
            }
            target.set(numberOfResponses);
        }
    }
    
    /**
     * Unsets the "numberOfResponses" attribute
     */
    public void unsetNumberOfResponses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NUMBEROFRESPONSES$8);
        }
    }
}
