/*
 * XML Type:  NearestType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.NearestType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML NearestType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class NearestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.NearestType
{
    private static final long serialVersionUID = 1L;
    
    public NearestTypeImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName NEARESTCRITERION$2 = 
        new javax.xml.namespace.QName("", "nearestCriterion");
    
    
    /**
     * Gets array of all "_Location" elements
     */
    public net.opengis.xls.AbstractLocationType[] getLocationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCATION$1, targetList);
            net.opengis.xls.AbstractLocationType[] result = new net.opengis.xls.AbstractLocationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "_Location" element
     */
    public net.opengis.xls.AbstractLocationType getLocationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractLocationType target = null;
            target = (net.opengis.xls.AbstractLocationType)get_store().find_element_user(LOCATION$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "_Location" element
     */
    public int sizeOfLocationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATION$1);
        }
    }
    
    /**
     * Sets array of all "_Location" element
     */
    public void setLocationArray(net.opengis.xls.AbstractLocationType[] locationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(locationArray, LOCATION$0, LOCATION$1);
        }
    }
    
    /**
     * Sets ith "_Location" element
     */
    public void setLocationArray(int i, net.opengis.xls.AbstractLocationType location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractLocationType target = null;
            target = (net.opengis.xls.AbstractLocationType)get_store().find_element_user(LOCATION$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(location);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "_Location" element
     */
    public net.opengis.xls.AbstractLocationType insertNewLocation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractLocationType target = null;
            target = (net.opengis.xls.AbstractLocationType)get_store().insert_element_user(LOCATION$1, LOCATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "_Location" element
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
     * Removes the ith "_Location" element
     */
    public void removeLocation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATION$1, i);
        }
    }
    
    /**
     * Gets the "nearestCriterion" attribute
     */
    public net.opengis.xls.NearestCriterionType.Enum getNearestCriterion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NEARESTCRITERION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NEARESTCRITERION$2);
            }
            if (target == null)
            {
                return null;
            }
            return (net.opengis.xls.NearestCriterionType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "nearestCriterion" attribute
     */
    public net.opengis.xls.NearestCriterionType xgetNearestCriterion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.NearestCriterionType target = null;
            target = (net.opengis.xls.NearestCriterionType)get_store().find_attribute_user(NEARESTCRITERION$2);
            if (target == null)
            {
                target = (net.opengis.xls.NearestCriterionType)get_default_attribute_value(NEARESTCRITERION$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "nearestCriterion" attribute
     */
    public boolean isSetNearestCriterion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NEARESTCRITERION$2) != null;
        }
    }
    
    /**
     * Sets the "nearestCriterion" attribute
     */
    public void setNearestCriterion(net.opengis.xls.NearestCriterionType.Enum nearestCriterion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NEARESTCRITERION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NEARESTCRITERION$2);
            }
            target.setEnumValue(nearestCriterion);
        }
    }
    
    /**
     * Sets (as xml) the "nearestCriterion" attribute
     */
    public void xsetNearestCriterion(net.opengis.xls.NearestCriterionType nearestCriterion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.NearestCriterionType target = null;
            target = (net.opengis.xls.NearestCriterionType)get_store().find_attribute_user(NEARESTCRITERION$2);
            if (target == null)
            {
                target = (net.opengis.xls.NearestCriterionType)get_store().add_attribute_user(NEARESTCRITERION$2);
            }
            target.set(nearestCriterion);
        }
    }
    
    /**
     * Unsets the "nearestCriterion" attribute
     */
    public void unsetNearestCriterion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NEARESTCRITERION$2);
        }
    }
}
