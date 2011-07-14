/*
 * XML Type:  GeocodeResponseListType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.GeocodeResponseListType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML GeocodeResponseListType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class GeocodeResponseListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.GeocodeResponseListType
{
    private static final long serialVersionUID = 1L;
    
    public GeocodeResponseListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOCODEDADDRESS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "GeocodedAddress");
    private static final javax.xml.namespace.QName NUMBEROFGEOCODEDADDRESSES$2 = 
        new javax.xml.namespace.QName("", "numberOfGeocodedAddresses");
    
    
    /**
     * Gets array of all "GeocodedAddress" elements
     */
    public net.opengis.xls.GeocodedAddressType[] getGeocodedAddressArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GEOCODEDADDRESS$0, targetList);
            net.opengis.xls.GeocodedAddressType[] result = new net.opengis.xls.GeocodedAddressType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "GeocodedAddress" element
     */
    public net.opengis.xls.GeocodedAddressType getGeocodedAddressArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.GeocodedAddressType target = null;
            target = (net.opengis.xls.GeocodedAddressType)get_store().find_element_user(GEOCODEDADDRESS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "GeocodedAddress" element
     */
    public int sizeOfGeocodedAddressArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GEOCODEDADDRESS$0);
        }
    }
    
    /**
     * Sets array of all "GeocodedAddress" element
     */
    public void setGeocodedAddressArray(net.opengis.xls.GeocodedAddressType[] geocodedAddressArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(geocodedAddressArray, GEOCODEDADDRESS$0);
        }
    }
    
    /**
     * Sets ith "GeocodedAddress" element
     */
    public void setGeocodedAddressArray(int i, net.opengis.xls.GeocodedAddressType geocodedAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.GeocodedAddressType target = null;
            target = (net.opengis.xls.GeocodedAddressType)get_store().find_element_user(GEOCODEDADDRESS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(geocodedAddress);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "GeocodedAddress" element
     */
    public net.opengis.xls.GeocodedAddressType insertNewGeocodedAddress(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.GeocodedAddressType target = null;
            target = (net.opengis.xls.GeocodedAddressType)get_store().insert_element_user(GEOCODEDADDRESS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "GeocodedAddress" element
     */
    public net.opengis.xls.GeocodedAddressType addNewGeocodedAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.GeocodedAddressType target = null;
            target = (net.opengis.xls.GeocodedAddressType)get_store().add_element_user(GEOCODEDADDRESS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "GeocodedAddress" element
     */
    public void removeGeocodedAddress(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GEOCODEDADDRESS$0, i);
        }
    }
    
    /**
     * Gets the "numberOfGeocodedAddresses" attribute
     */
    public java.math.BigInteger getNumberOfGeocodedAddresses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMBEROFGEOCODEDADDRESSES$2);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "numberOfGeocodedAddresses" attribute
     */
    public org.apache.xmlbeans.XmlNonNegativeInteger xgetNumberOfGeocodedAddresses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(NUMBEROFGEOCODEDADDRESSES$2);
            return target;
        }
    }
    
    /**
     * Sets the "numberOfGeocodedAddresses" attribute
     */
    public void setNumberOfGeocodedAddresses(java.math.BigInteger numberOfGeocodedAddresses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMBEROFGEOCODEDADDRESSES$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NUMBEROFGEOCODEDADDRESSES$2);
            }
            target.setBigIntegerValue(numberOfGeocodedAddresses);
        }
    }
    
    /**
     * Sets (as xml) the "numberOfGeocodedAddresses" attribute
     */
    public void xsetNumberOfGeocodedAddresses(org.apache.xmlbeans.XmlNonNegativeInteger numberOfGeocodedAddresses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(NUMBEROFGEOCODEDADDRESSES$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_attribute_user(NUMBEROFGEOCODEDADDRESSES$2);
            }
            target.set(numberOfGeocodedAddresses);
        }
    }
}
