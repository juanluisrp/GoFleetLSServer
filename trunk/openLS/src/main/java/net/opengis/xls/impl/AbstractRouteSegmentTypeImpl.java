/*
 * XML Type:  AbstractRouteSegmentType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.AbstractRouteSegmentType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML AbstractRouteSegmentType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class AbstractRouteSegmentTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.AbstractRouteSegmentType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractRouteSegmentTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISTANCE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Distance");
    private static final javax.xml.namespace.QName TRAVELTIME$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "TravelTime");
    private static final javax.xml.namespace.QName BOUNDINGBOX$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "BoundingBox");
    private static final javax.xml.namespace.QName NAME$6 = 
        new javax.xml.namespace.QName("", "name");
    
    
    /**
     * Gets the "Distance" element
     */
    public net.opengis.xls.DistanceType getDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.DistanceType target = null;
            target = (net.opengis.xls.DistanceType)get_store().find_element_user(DISTANCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
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
            target = (net.opengis.xls.DistanceType)get_store().find_element_user(DISTANCE$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.DistanceType)get_store().add_element_user(DISTANCE$0);
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
            target = (net.opengis.xls.DistanceType)get_store().add_element_user(DISTANCE$0);
            return target;
        }
    }
    
    /**
     * Gets the "TravelTime" element
     */
    public org.apache.xmlbeans.GDuration getTravelTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRAVELTIME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getGDurationValue();
        }
    }
    
    /**
     * Gets (as xml) the "TravelTime" element
     */
    public org.apache.xmlbeans.XmlDuration xgetTravelTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDuration target = null;
            target = (org.apache.xmlbeans.XmlDuration)get_store().find_element_user(TRAVELTIME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TravelTime" element
     */
    public void setTravelTime(org.apache.xmlbeans.GDuration travelTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRAVELTIME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRAVELTIME$2);
            }
            target.setGDurationValue(travelTime);
        }
    }
    
    /**
     * Sets (as xml) the "TravelTime" element
     */
    public void xsetTravelTime(org.apache.xmlbeans.XmlDuration travelTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDuration target = null;
            target = (org.apache.xmlbeans.XmlDuration)get_store().find_element_user(TRAVELTIME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDuration)get_store().add_element_user(TRAVELTIME$2);
            }
            target.set(travelTime);
        }
    }
    
    /**
     * Gets the "BoundingBox" element
     */
    public net.opengis.gml.EnvelopeType getBoundingBox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EnvelopeType target = null;
            target = (net.opengis.gml.EnvelopeType)get_store().find_element_user(BOUNDINGBOX$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BoundingBox" element
     */
    public void setBoundingBox(net.opengis.gml.EnvelopeType boundingBox)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EnvelopeType target = null;
            target = (net.opengis.gml.EnvelopeType)get_store().find_element_user(BOUNDINGBOX$4, 0);
            if (target == null)
            {
                target = (net.opengis.gml.EnvelopeType)get_store().add_element_user(BOUNDINGBOX$4);
            }
            target.set(boundingBox);
        }
    }
    
    /**
     * Appends and returns a new empty "BoundingBox" element
     */
    public net.opengis.gml.EnvelopeType addNewBoundingBox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EnvelopeType target = null;
            target = (net.opengis.gml.EnvelopeType)get_store().add_element_user(BOUNDINGBOX$4);
            return target;
        }
    }
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
            return target;
        }
    }
    
    /**
     * True if has "name" attribute
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME$6) != null;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$6);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$6);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$6);
        }
    }
}
