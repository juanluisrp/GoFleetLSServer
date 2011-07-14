/*
 * An XML document type.
 * Localname: GetPortrayMapCapabilitiesRequest
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.GetPortrayMapCapabilitiesRequestDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one GetPortrayMapCapabilitiesRequest(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class GetPortrayMapCapabilitiesRequestDocumentImpl extends net.opengis.xls.impl.RequestParametersDocumentImpl implements net.opengis.xls.GetPortrayMapCapabilitiesRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetPortrayMapCapabilitiesRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPORTRAYMAPCAPABILITIESREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "GetPortrayMapCapabilitiesRequest");
    
    
    /**
     * Gets the "GetPortrayMapCapabilitiesRequest" element
     */
    public net.opengis.xls.GetPortrayMapCapabilitiesRequestType getGetPortrayMapCapabilitiesRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.GetPortrayMapCapabilitiesRequestType target = null;
            target = (net.opengis.xls.GetPortrayMapCapabilitiesRequestType)get_store().find_element_user(GETPORTRAYMAPCAPABILITIESREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetPortrayMapCapabilitiesRequest" element
     */
    public void setGetPortrayMapCapabilitiesRequest(net.opengis.xls.GetPortrayMapCapabilitiesRequestType getPortrayMapCapabilitiesRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.GetPortrayMapCapabilitiesRequestType target = null;
            target = (net.opengis.xls.GetPortrayMapCapabilitiesRequestType)get_store().find_element_user(GETPORTRAYMAPCAPABILITIESREQUEST$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.GetPortrayMapCapabilitiesRequestType)get_store().add_element_user(GETPORTRAYMAPCAPABILITIESREQUEST$0);
            }
            target.set(getPortrayMapCapabilitiesRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetPortrayMapCapabilitiesRequest" element
     */
    public net.opengis.xls.GetPortrayMapCapabilitiesRequestType addNewGetPortrayMapCapabilitiesRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.GetPortrayMapCapabilitiesRequestType target = null;
            target = (net.opengis.xls.GetPortrayMapCapabilitiesRequestType)get_store().add_element_user(GETPORTRAYMAPCAPABILITIESREQUEST$0);
            return target;
        }
    }
}
