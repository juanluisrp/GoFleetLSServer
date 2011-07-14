/*
 * An XML document type.
 * Localname: ReverseGeocodeResponse
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.ReverseGeocodeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one ReverseGeocodeResponse(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class ReverseGeocodeResponseDocumentImpl extends net.opengis.xls.impl.ResponseParametersDocumentImpl implements net.opengis.xls.ReverseGeocodeResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReverseGeocodeResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REVERSEGEOCODERESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "ReverseGeocodeResponse");
    
    
    /**
     * Gets the "ReverseGeocodeResponse" element
     */
    public net.opengis.xls.ReverseGeocodeResponseType getReverseGeocodeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ReverseGeocodeResponseType target = null;
            target = (net.opengis.xls.ReverseGeocodeResponseType)get_store().find_element_user(REVERSEGEOCODERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ReverseGeocodeResponse" element
     */
    public void setReverseGeocodeResponse(net.opengis.xls.ReverseGeocodeResponseType reverseGeocodeResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ReverseGeocodeResponseType target = null;
            target = (net.opengis.xls.ReverseGeocodeResponseType)get_store().find_element_user(REVERSEGEOCODERESPONSE$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.ReverseGeocodeResponseType)get_store().add_element_user(REVERSEGEOCODERESPONSE$0);
            }
            target.set(reverseGeocodeResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "ReverseGeocodeResponse" element
     */
    public net.opengis.xls.ReverseGeocodeResponseType addNewReverseGeocodeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ReverseGeocodeResponseType target = null;
            target = (net.opengis.xls.ReverseGeocodeResponseType)get_store().add_element_user(REVERSEGEOCODERESPONSE$0);
            return target;
        }
    }
}
