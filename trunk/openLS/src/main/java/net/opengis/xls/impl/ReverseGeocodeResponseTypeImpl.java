/*
 * XML Type:  ReverseGeocodeResponseType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.ReverseGeocodeResponseType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML ReverseGeocodeResponseType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class ReverseGeocodeResponseTypeImpl extends net.opengis.xls.impl.AbstractResponseParametersTypeImpl implements net.opengis.xls.ReverseGeocodeResponseType
{
    private static final long serialVersionUID = 1L;
    
    public ReverseGeocodeResponseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REVERSEGEOCODEDLOCATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "ReverseGeocodedLocation");
    
    
    /**
     * Gets array of all "ReverseGeocodedLocation" elements
     */
    public net.opengis.xls.ReverseGeocodedLocationType[] getReverseGeocodedLocationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REVERSEGEOCODEDLOCATION$0, targetList);
            net.opengis.xls.ReverseGeocodedLocationType[] result = new net.opengis.xls.ReverseGeocodedLocationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ReverseGeocodedLocation" element
     */
    public net.opengis.xls.ReverseGeocodedLocationType getReverseGeocodedLocationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ReverseGeocodedLocationType target = null;
            target = (net.opengis.xls.ReverseGeocodedLocationType)get_store().find_element_user(REVERSEGEOCODEDLOCATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ReverseGeocodedLocation" element
     */
    public int sizeOfReverseGeocodedLocationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REVERSEGEOCODEDLOCATION$0);
        }
    }
    
    /**
     * Sets array of all "ReverseGeocodedLocation" element
     */
    public void setReverseGeocodedLocationArray(net.opengis.xls.ReverseGeocodedLocationType[] reverseGeocodedLocationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(reverseGeocodedLocationArray, REVERSEGEOCODEDLOCATION$0);
        }
    }
    
    /**
     * Sets ith "ReverseGeocodedLocation" element
     */
    public void setReverseGeocodedLocationArray(int i, net.opengis.xls.ReverseGeocodedLocationType reverseGeocodedLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ReverseGeocodedLocationType target = null;
            target = (net.opengis.xls.ReverseGeocodedLocationType)get_store().find_element_user(REVERSEGEOCODEDLOCATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(reverseGeocodedLocation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ReverseGeocodedLocation" element
     */
    public net.opengis.xls.ReverseGeocodedLocationType insertNewReverseGeocodedLocation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ReverseGeocodedLocationType target = null;
            target = (net.opengis.xls.ReverseGeocodedLocationType)get_store().insert_element_user(REVERSEGEOCODEDLOCATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ReverseGeocodedLocation" element
     */
    public net.opengis.xls.ReverseGeocodedLocationType addNewReverseGeocodedLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ReverseGeocodedLocationType target = null;
            target = (net.opengis.xls.ReverseGeocodedLocationType)get_store().add_element_user(REVERSEGEOCODEDLOCATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ReverseGeocodedLocation" element
     */
    public void removeReverseGeocodedLocation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REVERSEGEOCODEDLOCATION$0, i);
        }
    }
}
