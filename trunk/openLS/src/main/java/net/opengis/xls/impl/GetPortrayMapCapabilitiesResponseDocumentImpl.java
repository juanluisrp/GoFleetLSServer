/*
 * An XML document type.
 * Localname: GetPortrayMapCapabilitiesResponse
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.GetPortrayMapCapabilitiesResponseDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one GetPortrayMapCapabilitiesResponse(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class GetPortrayMapCapabilitiesResponseDocumentImpl extends net.opengis.xls.impl.ResponseParametersDocumentImpl implements net.opengis.xls.GetPortrayMapCapabilitiesResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetPortrayMapCapabilitiesResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPORTRAYMAPCAPABILITIESRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "GetPortrayMapCapabilitiesResponse");
    
    
    /**
     * Gets the "GetPortrayMapCapabilitiesResponse" element
     */
    public net.opengis.xls.GetPortrayMapCapabilitiesResponseType getGetPortrayMapCapabilitiesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.GetPortrayMapCapabilitiesResponseType target = null;
            target = (net.opengis.xls.GetPortrayMapCapabilitiesResponseType)get_store().find_element_user(GETPORTRAYMAPCAPABILITIESRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetPortrayMapCapabilitiesResponse" element
     */
    public void setGetPortrayMapCapabilitiesResponse(net.opengis.xls.GetPortrayMapCapabilitiesResponseType getPortrayMapCapabilitiesResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.GetPortrayMapCapabilitiesResponseType target = null;
            target = (net.opengis.xls.GetPortrayMapCapabilitiesResponseType)get_store().find_element_user(GETPORTRAYMAPCAPABILITIESRESPONSE$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.GetPortrayMapCapabilitiesResponseType)get_store().add_element_user(GETPORTRAYMAPCAPABILITIESRESPONSE$0);
            }
            target.set(getPortrayMapCapabilitiesResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetPortrayMapCapabilitiesResponse" element
     */
    public net.opengis.xls.GetPortrayMapCapabilitiesResponseType addNewGetPortrayMapCapabilitiesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.GetPortrayMapCapabilitiesResponseType target = null;
            target = (net.opengis.xls.GetPortrayMapCapabilitiesResponseType)get_store().add_element_user(GETPORTRAYMAPCAPABILITIESRESPONSE$0);
            return target;
        }
    }
}
