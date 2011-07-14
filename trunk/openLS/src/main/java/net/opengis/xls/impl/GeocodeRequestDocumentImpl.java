/*
 * An XML document type.
 * Localname: GeocodeRequest
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.GeocodeRequestDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one GeocodeRequest(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class GeocodeRequestDocumentImpl extends net.opengis.xls.impl.RequestParametersDocumentImpl implements net.opengis.xls.GeocodeRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeocodeRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOCODEREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "GeocodeRequest");
    
    
    /**
     * Gets the "GeocodeRequest" element
     */
    public net.opengis.xls.GeocodeRequestType getGeocodeRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.GeocodeRequestType target = null;
            target = (net.opengis.xls.GeocodeRequestType)get_store().find_element_user(GEOCODEREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GeocodeRequest" element
     */
    public void setGeocodeRequest(net.opengis.xls.GeocodeRequestType geocodeRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.GeocodeRequestType target = null;
            target = (net.opengis.xls.GeocodeRequestType)get_store().find_element_user(GEOCODEREQUEST$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.GeocodeRequestType)get_store().add_element_user(GEOCODEREQUEST$0);
            }
            target.set(geocodeRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GeocodeRequest" element
     */
    public net.opengis.xls.GeocodeRequestType addNewGeocodeRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.GeocodeRequestType target = null;
            target = (net.opengis.xls.GeocodeRequestType)get_store().add_element_user(GEOCODEREQUEST$0);
            return target;
        }
    }
}
