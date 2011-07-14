/*
 * An XML document type.
 * Localname: GeocodeResponse
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.GeocodeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one GeocodeResponse(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class GeocodeResponseDocumentImpl extends net.opengis.xls.impl.ResponseParametersDocumentImpl implements net.opengis.xls.GeocodeResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeocodeResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOCODERESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "GeocodeResponse");
    
    
    /**
     * Gets the "GeocodeResponse" element
     */
    public net.opengis.xls.GeocodeResponseType getGeocodeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.GeocodeResponseType target = null;
            target = (net.opengis.xls.GeocodeResponseType)get_store().find_element_user(GEOCODERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GeocodeResponse" element
     */
    public void setGeocodeResponse(net.opengis.xls.GeocodeResponseType geocodeResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.GeocodeResponseType target = null;
            target = (net.opengis.xls.GeocodeResponseType)get_store().find_element_user(GEOCODERESPONSE$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.GeocodeResponseType)get_store().add_element_user(GEOCODERESPONSE$0);
            }
            target.set(geocodeResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GeocodeResponse" element
     */
    public net.opengis.xls.GeocodeResponseType addNewGeocodeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.GeocodeResponseType target = null;
            target = (net.opengis.xls.GeocodeResponseType)get_store().add_element_user(GEOCODERESPONSE$0);
            return target;
        }
    }
}
