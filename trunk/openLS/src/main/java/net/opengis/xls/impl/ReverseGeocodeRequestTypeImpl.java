/*
 * XML Type:  ReverseGeocodeRequestType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.ReverseGeocodeRequestType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML ReverseGeocodeRequestType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class ReverseGeocodeRequestTypeImpl extends net.opengis.xls.impl.AbstractRequestParametersTypeImpl implements net.opengis.xls.ReverseGeocodeRequestType
{
    private static final long serialVersionUID = 1L;
    
    public ReverseGeocodeRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POSITION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Position");
    private static final javax.xml.namespace.QName REVERSEGEOCODEPREFERENCE$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "ReverseGeocodePreference");
    
    
    /**
     * Gets the "Position" element
     */
    public net.opengis.xls.PositionType getPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.PositionType target = null;
            target = (net.opengis.xls.PositionType)get_store().find_element_user(POSITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Position" element
     */
    public void setPosition(net.opengis.xls.PositionType position)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.PositionType target = null;
            target = (net.opengis.xls.PositionType)get_store().find_element_user(POSITION$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.PositionType)get_store().add_element_user(POSITION$0);
            }
            target.set(position);
        }
    }
    
    /**
     * Appends and returns a new empty "Position" element
     */
    public net.opengis.xls.PositionType addNewPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.PositionType target = null;
            target = (net.opengis.xls.PositionType)get_store().add_element_user(POSITION$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "ReverseGeocodePreference" elements
     */
    public net.opengis.xls.ReverseGeocodePreferenceType.Enum[] getReverseGeocodePreferenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REVERSEGEOCODEPREFERENCE$2, targetList);
            net.opengis.xls.ReverseGeocodePreferenceType.Enum[] result = new net.opengis.xls.ReverseGeocodePreferenceType.Enum[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = (net.opengis.xls.ReverseGeocodePreferenceType.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
            return result;
        }
    }
    
    /**
     * Gets ith "ReverseGeocodePreference" element
     */
    public net.opengis.xls.ReverseGeocodePreferenceType.Enum getReverseGeocodePreferenceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REVERSEGEOCODEPREFERENCE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (net.opengis.xls.ReverseGeocodePreferenceType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "ReverseGeocodePreference" elements
     */
    public net.opengis.xls.ReverseGeocodePreferenceType[] xgetReverseGeocodePreferenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REVERSEGEOCODEPREFERENCE$2, targetList);
            net.opengis.xls.ReverseGeocodePreferenceType[] result = new net.opengis.xls.ReverseGeocodePreferenceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "ReverseGeocodePreference" element
     */
    public net.opengis.xls.ReverseGeocodePreferenceType xgetReverseGeocodePreferenceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ReverseGeocodePreferenceType target = null;
            target = (net.opengis.xls.ReverseGeocodePreferenceType)get_store().find_element_user(REVERSEGEOCODEPREFERENCE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (net.opengis.xls.ReverseGeocodePreferenceType)target;
        }
    }
    
    /**
     * Returns number of "ReverseGeocodePreference" element
     */
    public int sizeOfReverseGeocodePreferenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REVERSEGEOCODEPREFERENCE$2);
        }
    }
    
    /**
     * Sets array of all "ReverseGeocodePreference" element
     */
    public void setReverseGeocodePreferenceArray(net.opengis.xls.ReverseGeocodePreferenceType.Enum[] reverseGeocodePreferenceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(reverseGeocodePreferenceArray, REVERSEGEOCODEPREFERENCE$2);
        }
    }
    
    /**
     * Sets ith "ReverseGeocodePreference" element
     */
    public void setReverseGeocodePreferenceArray(int i, net.opengis.xls.ReverseGeocodePreferenceType.Enum reverseGeocodePreference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REVERSEGEOCODEPREFERENCE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(reverseGeocodePreference);
        }
    }
    
    /**
     * Sets (as xml) array of all "ReverseGeocodePreference" element
     */
    public void xsetReverseGeocodePreferenceArray(net.opengis.xls.ReverseGeocodePreferenceType[]reverseGeocodePreferenceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(reverseGeocodePreferenceArray, REVERSEGEOCODEPREFERENCE$2);
        }
    }
    
    /**
     * Sets (as xml) ith "ReverseGeocodePreference" element
     */
    public void xsetReverseGeocodePreferenceArray(int i, net.opengis.xls.ReverseGeocodePreferenceType reverseGeocodePreference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ReverseGeocodePreferenceType target = null;
            target = (net.opengis.xls.ReverseGeocodePreferenceType)get_store().find_element_user(REVERSEGEOCODEPREFERENCE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(reverseGeocodePreference);
        }
    }
    
    /**
     * Inserts the value as the ith "ReverseGeocodePreference" element
     */
    public void insertReverseGeocodePreference(int i, net.opengis.xls.ReverseGeocodePreferenceType.Enum reverseGeocodePreference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(REVERSEGEOCODEPREFERENCE$2, i);
            target.setEnumValue(reverseGeocodePreference);
        }
    }
    
    /**
     * Appends the value as the last "ReverseGeocodePreference" element
     */
    public void addReverseGeocodePreference(net.opengis.xls.ReverseGeocodePreferenceType.Enum reverseGeocodePreference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REVERSEGEOCODEPREFERENCE$2);
            target.setEnumValue(reverseGeocodePreference);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ReverseGeocodePreference" element
     */
    public net.opengis.xls.ReverseGeocodePreferenceType insertNewReverseGeocodePreference(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ReverseGeocodePreferenceType target = null;
            target = (net.opengis.xls.ReverseGeocodePreferenceType)get_store().insert_element_user(REVERSEGEOCODEPREFERENCE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ReverseGeocodePreference" element
     */
    public net.opengis.xls.ReverseGeocodePreferenceType addNewReverseGeocodePreference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ReverseGeocodePreferenceType target = null;
            target = (net.opengis.xls.ReverseGeocodePreferenceType)get_store().add_element_user(REVERSEGEOCODEPREFERENCE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "ReverseGeocodePreference" element
     */
    public void removeReverseGeocodePreference(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REVERSEGEOCODEPREFERENCE$2, i);
        }
    }
}
