/*
 * An XML document type.
 * Localname: ReverseGeocodeRequest
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.ReverseGeocodeRequestDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one ReverseGeocodeRequest(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class ReverseGeocodeRequestDocumentImpl extends net.opengis.xls.impl.RequestParametersDocumentImpl implements net.opengis.xls.ReverseGeocodeRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReverseGeocodeRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REVERSEGEOCODEREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "ReverseGeocodeRequest");
    
    
    /**
     * Gets the "ReverseGeocodeRequest" element
     */
    public net.opengis.xls.ReverseGeocodeRequestType getReverseGeocodeRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ReverseGeocodeRequestType target = null;
            target = (net.opengis.xls.ReverseGeocodeRequestType)get_store().find_element_user(REVERSEGEOCODEREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ReverseGeocodeRequest" element
     */
    public void setReverseGeocodeRequest(net.opengis.xls.ReverseGeocodeRequestType reverseGeocodeRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ReverseGeocodeRequestType target = null;
            target = (net.opengis.xls.ReverseGeocodeRequestType)get_store().find_element_user(REVERSEGEOCODEREQUEST$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.ReverseGeocodeRequestType)get_store().add_element_user(REVERSEGEOCODEREQUEST$0);
            }
            target.set(reverseGeocodeRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "ReverseGeocodeRequest" element
     */
    public net.opengis.xls.ReverseGeocodeRequestType addNewReverseGeocodeRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ReverseGeocodeRequestType target = null;
            target = (net.opengis.xls.ReverseGeocodeRequestType)get_store().add_element_user(REVERSEGEOCODEREQUEST$0);
            return target;
        }
    }
}
