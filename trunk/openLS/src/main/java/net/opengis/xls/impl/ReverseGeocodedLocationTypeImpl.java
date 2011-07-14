/*
 * XML Type:  ReverseGeocodedLocationType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.ReverseGeocodedLocationType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML ReverseGeocodedLocationType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class ReverseGeocodedLocationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.ReverseGeocodedLocationType
{
    private static final long serialVersionUID = 1L;
    
    public ReverseGeocodedLocationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POINT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Point");
    private static final javax.xml.namespace.QName ADDRESS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Address");
    private static final javax.xml.namespace.QName SEARCHCENTREDISTANCE$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "SearchCentreDistance");
    
    
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
     * Gets the "SearchCentreDistance" element
     */
    public net.opengis.xls.DistanceType getSearchCentreDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.DistanceType target = null;
            target = (net.opengis.xls.DistanceType)get_store().find_element_user(SEARCHCENTREDISTANCE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SearchCentreDistance" element
     */
    public boolean isSetSearchCentreDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEARCHCENTREDISTANCE$4) != 0;
        }
    }
    
    /**
     * Sets the "SearchCentreDistance" element
     */
    public void setSearchCentreDistance(net.opengis.xls.DistanceType searchCentreDistance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.DistanceType target = null;
            target = (net.opengis.xls.DistanceType)get_store().find_element_user(SEARCHCENTREDISTANCE$4, 0);
            if (target == null)
            {
                target = (net.opengis.xls.DistanceType)get_store().add_element_user(SEARCHCENTREDISTANCE$4);
            }
            target.set(searchCentreDistance);
        }
    }
    
    /**
     * Appends and returns a new empty "SearchCentreDistance" element
     */
    public net.opengis.xls.DistanceType addNewSearchCentreDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.DistanceType target = null;
            target = (net.opengis.xls.DistanceType)get_store().add_element_user(SEARCHCENTREDISTANCE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "SearchCentreDistance" element
     */
    public void unsetSearchCentreDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEARCHCENTREDISTANCE$4, 0);
        }
    }
}
