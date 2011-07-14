/*
 * XML Type:  WayPointType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.WayPointType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML WayPointType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class WayPointTypeImpl extends net.opengis.xls.impl.AbstractWayPointTypeImpl implements net.opengis.xls.WayPointType
{
    private static final long serialVersionUID = 1L;
    
    public WayPointTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_Location");
    private static final org.apache.xmlbeans.QNameSet LOCATION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Address"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "POI"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_Location"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Position"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_Position"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_POI"),
    });
    private static final javax.xml.namespace.QName GEOCODEMATCHCODE$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "GeocodeMatchCode");
    private static final javax.xml.namespace.QName STOP$4 = 
        new javax.xml.namespace.QName("", "stop");
    
    
    /**
     * Gets the "_Location" element
     */
    public net.opengis.xls.AbstractLocationType getLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractLocationType target = null;
            target = (net.opengis.xls.AbstractLocationType)get_store().find_element_user(LOCATION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_Location" element
     */
    public void setLocation(net.opengis.xls.AbstractLocationType location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractLocationType target = null;
            target = (net.opengis.xls.AbstractLocationType)get_store().find_element_user(LOCATION$1, 0);
            if (target == null)
            {
                target = (net.opengis.xls.AbstractLocationType)get_store().add_element_user(LOCATION$0);
            }
            target.set(location);
        }
    }
    
    /**
     * Appends and returns a new empty "_Location" element
     */
    public net.opengis.xls.AbstractLocationType addNewLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractLocationType target = null;
            target = (net.opengis.xls.AbstractLocationType)get_store().add_element_user(LOCATION$0);
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
            target = (net.opengis.xls.GeocodingQOSType)get_store().find_element_user(GEOCODEMATCHCODE$2, 0);
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
            return get_store().count_elements(GEOCODEMATCHCODE$2) != 0;
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
            target = (net.opengis.xls.GeocodingQOSType)get_store().find_element_user(GEOCODEMATCHCODE$2, 0);
            if (target == null)
            {
                target = (net.opengis.xls.GeocodingQOSType)get_store().add_element_user(GEOCODEMATCHCODE$2);
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
            target = (net.opengis.xls.GeocodingQOSType)get_store().add_element_user(GEOCODEMATCHCODE$2);
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
            get_store().remove_element(GEOCODEMATCHCODE$2, 0);
        }
    }
    
    /**
     * Gets the "stop" attribute
     */
    public boolean getStop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STOP$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(STOP$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "stop" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetStop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(STOP$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(STOP$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "stop" attribute
     */
    public boolean isSetStop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STOP$4) != null;
        }
    }
    
    /**
     * Sets the "stop" attribute
     */
    public void setStop(boolean stop)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STOP$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STOP$4);
            }
            target.setBooleanValue(stop);
        }
    }
    
    /**
     * Sets (as xml) the "stop" attribute
     */
    public void xsetStop(org.apache.xmlbeans.XmlBoolean stop)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(STOP$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(STOP$4);
            }
            target.set(stop);
        }
    }
    
    /**
     * Unsets the "stop" attribute
     */
    public void unsetStop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STOP$4);
        }
    }
}
