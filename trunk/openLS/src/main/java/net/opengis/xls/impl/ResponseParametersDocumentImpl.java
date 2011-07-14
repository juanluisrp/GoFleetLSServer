/*
 * An XML document type.
 * Localname: _ResponseParameters
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.ResponseParametersDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one _ResponseParameters(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class ResponseParametersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.ResponseParametersDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResponseParametersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESPONSEPARAMETERS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_ResponseParameters");
    private static final org.apache.xmlbeans.QNameSet RESPONSEPARAMETERS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "PortrayMapResponse"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_ResponseParameters"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "GetPortrayMapCapabilitiesResponse"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "DetermineRouteResponse"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "DirectoryResponse"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "ReverseGeocodeResponse"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "GeocodeResponse"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "SLIA"),
    });
    
    
    /**
     * Gets the "_ResponseParameters" element
     */
    public net.opengis.xls.AbstractResponseParametersType getResponseParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractResponseParametersType target = null;
            target = (net.opengis.xls.AbstractResponseParametersType)get_store().find_element_user(RESPONSEPARAMETERS$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
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
            target = (net.opengis.xls.AbstractResponseParametersType)get_store().find_element_user(RESPONSEPARAMETERS$1, 0);
            if (target == null)
            {
                target = (net.opengis.xls.AbstractResponseParametersType)get_store().add_element_user(RESPONSEPARAMETERS$0);
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
            target = (net.opengis.xls.AbstractResponseParametersType)get_store().add_element_user(RESPONSEPARAMETERS$0);
            return target;
        }
    }
}
