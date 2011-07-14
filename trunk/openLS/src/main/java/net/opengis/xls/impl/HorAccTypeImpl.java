/*
 * XML Type:  HorAccType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.HorAccType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML HorAccType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class HorAccTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.HorAccType
{
    private static final long serialVersionUID = 1L;
    
    public HorAccTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISTANCE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Distance");
    private static final javax.xml.namespace.QName ANGLE$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Angle");
    
    
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
     * True if has "Distance" element
     */
    public boolean isSetDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISTANCE$0) != 0;
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
     * Unsets the "Distance" element
     */
    public void unsetDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISTANCE$0, 0);
        }
    }
    
    /**
     * Gets the "Angle" element
     */
    public net.opengis.xls.AngleType getAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AngleType target = null;
            target = (net.opengis.xls.AngleType)get_store().find_element_user(ANGLE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Angle" element
     */
    public boolean isSetAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANGLE$2) != 0;
        }
    }
    
    /**
     * Sets the "Angle" element
     */
    public void setAngle(net.opengis.xls.AngleType angle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AngleType target = null;
            target = (net.opengis.xls.AngleType)get_store().find_element_user(ANGLE$2, 0);
            if (target == null)
            {
                target = (net.opengis.xls.AngleType)get_store().add_element_user(ANGLE$2);
            }
            target.set(angle);
        }
    }
    
    /**
     * Appends and returns a new empty "Angle" element
     */
    public net.opengis.xls.AngleType addNewAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AngleType target = null;
            target = (net.opengis.xls.AngleType)get_store().add_element_user(ANGLE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Angle" element
     */
    public void unsetAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANGLE$2, 0);
        }
    }
}
