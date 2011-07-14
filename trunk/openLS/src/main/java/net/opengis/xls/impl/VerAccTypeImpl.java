/*
 * XML Type:  VerAccType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.VerAccType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML VerAccType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class VerAccTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.VerAccType
{
    private static final long serialVersionUID = 1L;
    
    public VerAccTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISTANCE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Distance");
    
    
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
}
