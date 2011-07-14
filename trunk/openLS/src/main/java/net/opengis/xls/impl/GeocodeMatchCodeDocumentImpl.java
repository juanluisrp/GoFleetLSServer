/*
 * An XML document type.
 * Localname: GeocodeMatchCode
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.GeocodeMatchCodeDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one GeocodeMatchCode(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class GeocodeMatchCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.GeocodeMatchCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeocodeMatchCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOCODEMATCHCODE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "GeocodeMatchCode");
    
    
    /**
     * Gets the "GeocodeMatchCode" element
     */
    public net.opengis.xls.GeocodingQOSType getGeocodeMatchCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.GeocodingQOSType target = null;
            target = (net.opengis.xls.GeocodingQOSType)get_store().find_element_user(GEOCODEMATCHCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GeocodeMatchCode" element
     */
    public void setGeocodeMatchCode(net.opengis.xls.GeocodingQOSType geocodeMatchCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.GeocodingQOSType target = null;
            target = (net.opengis.xls.GeocodingQOSType)get_store().find_element_user(GEOCODEMATCHCODE$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.GeocodingQOSType)get_store().add_element_user(GEOCODEMATCHCODE$0);
            }
            target.set(geocodeMatchCode);
        }
    }
    
    /**
     * Appends and returns a new empty "GeocodeMatchCode" element
     */
    public net.opengis.xls.GeocodingQOSType addNewGeocodeMatchCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.GeocodingQOSType target = null;
            target = (net.opengis.xls.GeocodingQOSType)get_store().add_element_user(GEOCODEMATCHCODE$0);
            return target;
        }
    }
}
