/*
 * XML Type:  GeocodedAddressType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.GeocodedAddressType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML GeocodedAddressType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class GeocodedAddressTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.GeocodedAddressType
{
    private static final long serialVersionUID = 1L;
    
    public GeocodedAddressTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POINT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Point");
    private static final javax.xml.namespace.QName ADDRESS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Address");
    private static final javax.xml.namespace.QName GEOCODEMATCHCODE$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "GeocodeMatchCode");
    
    
    /**
     * Gets the "Point" element
     */
    public net.opengis.gml.PointType getPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PointType target = null;
            target = (net.opengis.gml.PointType)get_store().find_element_user(POINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Point" element
     */
    public void setPoint(net.opengis.gml.PointType point)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PointType target = null;
            target = (net.opengis.gml.PointType)get_store().find_element_user(POINT$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.PointType)get_store().add_element_user(POINT$0);
            }
            target.set(point);
        }
    }
    
    /**
     * Appends and returns a new empty "Point" element
     */
    public net.opengis.gml.PointType addNewPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PointType target = null;
            target = (net.opengis.gml.PointType)get_store().add_element_user(POINT$0);
            return target;
        }
    }
    
    /**
     * Gets the "Address" element
     */
    public net.opengis.xls.AddressType getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AddressType target = null;
            target = (net.opengis.xls.AddressType)get_store().find_element_user(ADDRESS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Address" element
     */
    public void setAddress(net.opengis.xls.AddressType address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AddressType target = null;
            target = (net.opengis.xls.AddressType)get_store().find_element_user(ADDRESS$2, 0);
            if (target == null)
            {
                target = (net.opengis.xls.AddressType)get_store().add_element_user(ADDRESS$2);
            }
            target.set(address);
        }
    }
    
    /**
     * Appends and returns a new empty "Address" element
     */
    public net.opengis.xls.AddressType addNewAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AddressType target = null;
            target = (net.opengis.xls.AddressType)get_store().add_element_user(ADDRESS$2);
            return target;
        }
    }
    
    /**
     * Gets the "GeocodeMatchCode" element
     */
    public net.opengis.xls.GeocodingQOSType getGeocodeMatchCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.GeocodingQOSType target = null;
            target = (net.opengis.xls.GeocodingQOSType)get_store().find_element_user(GEOCODEMATCHCODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "GeocodeMatchCode" element
     */
    public boolean isSetGeocodeMatchCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GEOCODEMATCHCODE$4) != 0;
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
            target = (net.opengis.xls.GeocodingQOSType)get_store().find_element_user(GEOCODEMATCHCODE$4, 0);
            if (target == null)
            {
                target = (net.opengis.xls.GeocodingQOSType)get_store().add_element_user(GEOCODEMATCHCODE$4);
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
            target = (net.opengis.xls.GeocodingQOSType)get_store().add_element_user(GEOCODEMATCHCODE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "GeocodeMatchCode" element
     */
    public void unsetGeocodeMatchCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GEOCODEMATCHCODE$4, 0);
        }
    }
}
