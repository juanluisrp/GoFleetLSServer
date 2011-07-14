/*
 * XML Type:  SLIAType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.SLIAType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML SLIAType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class SLIATypeImpl extends net.opengis.xls.impl.AbstractResponseParametersTypeImpl implements net.opengis.xls.SLIAType
{
    private static final long serialVersionUID = 1L;
    
    public SLIATypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OUTPUTGATEWAYPARAMETERS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "OutputGatewayParameters");
    private static final javax.xml.namespace.QName REQUESTID$2 = 
        new javax.xml.namespace.QName("", "requestID");
    
    
    /**
     * Gets the "OutputGatewayParameters" element
     */
    public net.opengis.xls.OutputGatewayParametersType getOutputGatewayParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.OutputGatewayParametersType target = null;
            target = (net.opengis.xls.OutputGatewayParametersType)get_store().find_element_user(OUTPUTGATEWAYPARAMETERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OutputGatewayParameters" element
     */
    public void setOutputGatewayParameters(net.opengis.xls.OutputGatewayParametersType outputGatewayParameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.OutputGatewayParametersType target = null;
            target = (net.opengis.xls.OutputGatewayParametersType)get_store().find_element_user(OUTPUTGATEWAYPARAMETERS$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.OutputGatewayParametersType)get_store().add_element_user(OUTPUTGATEWAYPARAMETERS$0);
            }
            target.set(outputGatewayParameters);
        }
    }
    
    /**
     * Appends and returns a new empty "OutputGatewayParameters" element
     */
    public net.opengis.xls.OutputGatewayParametersType addNewOutputGatewayParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.OutputGatewayParametersType target = null;
            target = (net.opengis.xls.OutputGatewayParametersType)get_store().add_element_user(OUTPUTGATEWAYPARAMETERS$0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUESTID$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REQUESTID$2);
            return target;
        }
    }
    
    /**
     * True if has "requestID" attribute
     */
    public boolean isSetRequestID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REQUESTID$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUESTID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REQUESTID$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REQUESTID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REQUESTID$2);
            }
            target.set(requestID);
        }
    }
    
    /**
     * Unsets the "requestID" attribute
     */
    public void unsetRequestID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REQUESTID$2);
        }
    }
}
