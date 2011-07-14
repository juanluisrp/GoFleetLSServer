/*
 * XML Type:  POIWithDistanceType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.POIWithDistanceType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML POIWithDistanceType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class POIWithDistanceTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.POIWithDistanceType
{
    private static final long serialVersionUID = 1L;
    
    public POIWithDistanceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POI$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "POI");
    private static final javax.xml.namespace.QName DISTANCE$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Distance");
    
    
    /**
     * Gets the "POI" element
     */
    public net.opengis.xls.PointOfInterestType getPOI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.PointOfInterestType target = null;
            target = (net.opengis.xls.PointOfInterestType)get_store().find_element_user(POI$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "POI" element
     */
    public void setPOI(net.opengis.xls.PointOfInterestType poi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.PointOfInterestType target = null;
            target = (net.opengis.xls.PointOfInterestType)get_store().find_element_user(POI$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.PointOfInterestType)get_store().add_element_user(POI$0);
            }
            target.set(poi);
        }
    }
    
    /**
     * Appends and returns a new empty "POI" element
     */
    public net.opengis.xls.PointOfInterestType addNewPOI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.PointOfInterestType target = null;
            target = (net.opengis.xls.PointOfInterestType)get_store().add_element_user(POI$0);
            return target;
        }
    }
    
    /**
     * Gets the "Distance" element
     */
    public net.opengis.xls.DistanceType getDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.DistanceType target = null;
            target = (net.opengis.xls.DistanceType)get_store().find_element_user(DISTANCE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Distance" element
     */
    public boolean isSetDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISTANCE$2) != 0;
        }
    }
    
    /**
     * Sets the "Distance" element
     */
    public void setDistance(net.opengis.xls.DistanceType distance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.DistanceType target = null;
            target = (net.opengis.xls.DistanceType)get_store().find_element_user(DISTANCE$2, 0);
            if (target == null)
            {
                target = (net.opengis.xls.DistanceType)get_store().add_element_user(DISTANCE$2);
            }
            target.set(distance);
        }
    }
    
    /**
     * Appends and returns a new empty "Distance" element
     */
    public net.opengis.xls.DistanceType addNewDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.DistanceType target = null;
            target = (net.opengis.xls.DistanceType)get_store().add_element_user(DISTANCE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Distance" element
     */
    public void unsetDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISTANCE$2, 0);
        }
    }
}
