/*
 * XML Type:  AddressType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.AddressType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML AddressType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class AddressTypeImpl extends net.opengis.xls.impl.AbstractAddressTypeImpl implements net.opengis.xls.AddressType
{
    private static final long serialVersionUID = 1L;
    
    public AddressTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FREEFORMADDRESS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "freeFormAddress");
    private static final javax.xml.namespace.QName STREETADDRESS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "StreetAddress");
    private static final javax.xml.namespace.QName PLACE$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Place");
    private static final javax.xml.namespace.QName POSTALCODE$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "PostalCode");
    
    
    /**
     * Gets the "freeFormAddress" element
     */
    public java.lang.String getFreeFormAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FREEFORMADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "freeFormAddress" element
     */
    public org.apache.xmlbeans.XmlString xgetFreeFormAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FREEFORMADDRESS$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "freeFormAddress" element
     */
    public boolean isSetFreeFormAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FREEFORMADDRESS$0) != 0;
        }
    }
    
    /**
     * Sets the "freeFormAddress" element
     */
    public void setFreeFormAddress(java.lang.String freeFormAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FREEFORMADDRESS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FREEFORMADDRESS$0);
            }
            target.setStringValue(freeFormAddress);
        }
    }
    
    /**
     * Sets (as xml) the "freeFormAddress" element
     */
    public void xsetFreeFormAddress(org.apache.xmlbeans.XmlString freeFormAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FREEFORMADDRESS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FREEFORMADDRESS$0);
            }
            target.set(freeFormAddress);
        }
    }
    
    /**
     * Unsets the "freeFormAddress" element
     */
    public void unsetFreeFormAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FREEFORMADDRESS$0, 0);
        }
    }
    
    /**
     * Gets the "StreetAddress" element
     */
    public net.opengis.xls.StreetAddressType getStreetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.StreetAddressType target = null;
            target = (net.opengis.xls.StreetAddressType)get_store().find_element_user(STREETADDRESS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "StreetAddress" element
     */
    public boolean isSetStreetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STREETADDRESS$2) != 0;
        }
    }
    
    /**
     * Sets the "StreetAddress" element
     */
    public void setStreetAddress(net.opengis.xls.StreetAddressType streetAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.StreetAddressType target = null;
            target = (net.opengis.xls.StreetAddressType)get_store().find_element_user(STREETADDRESS$2, 0);
            if (target == null)
            {
                target = (net.opengis.xls.StreetAddressType)get_store().add_element_user(STREETADDRESS$2);
            }
            target.set(streetAddress);
        }
    }
    
    /**
     * Appends and returns a new empty "StreetAddress" element
     */
    public net.opengis.xls.StreetAddressType addNewStreetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.StreetAddressType target = null;
            target = (net.opengis.xls.StreetAddressType)get_store().add_element_user(STREETADDRESS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "StreetAddress" element
     */
    public void unsetStreetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STREETADDRESS$2, 0);
        }
    }
    
    /**
     * Gets array of all "Place" elements
     */
    public net.opengis.xls.NamedPlaceType[] getPlaceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PLACE$4, targetList);
            net.opengis.xls.NamedPlaceType[] result = new net.opengis.xls.NamedPlaceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Place" element
     */
    public net.opengis.xls.NamedPlaceType getPlaceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.NamedPlaceType target = null;
            target = (net.opengis.xls.NamedPlaceType)get_store().find_element_user(PLACE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Place" element
     */
    public int sizeOfPlaceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PLACE$4);
        }
    }
    
    /**
     * Sets array of all "Place" element
     */
    public void setPlaceArray(net.opengis.xls.NamedPlaceType[] placeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(placeArray, PLACE$4);
        }
    }
    
    /**
     * Sets ith "Place" element
     */
    public void setPlaceArray(int i, net.opengis.xls.NamedPlaceType place)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.NamedPlaceType target = null;
            target = (net.opengis.xls.NamedPlaceType)get_store().find_element_user(PLACE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(place);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Place" element
     */
    public net.opengis.xls.NamedPlaceType insertNewPlace(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.NamedPlaceType target = null;
            target = (net.opengis.xls.NamedPlaceType)get_store().insert_element_user(PLACE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Place" element
     */
    public net.opengis.xls.NamedPlaceType addNewPlace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.NamedPlaceType target = null;
            target = (net.opengis.xls.NamedPlaceType)get_store().add_element_user(PLACE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "Place" element
     */
    public void removePlace(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PLACE$4, i);
        }
    }
    
    /**
     * Gets the "PostalCode" element
     */
    public java.lang.String getPostalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTALCODE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PostalCode" element
     */
    public net.opengis.xls.PostalCodeType xgetPostalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.PostalCodeType target = null;
            target = (net.opengis.xls.PostalCodeType)get_store().find_element_user(POSTALCODE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "PostalCode" element
     */
    public boolean isSetPostalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POSTALCODE$6) != 0;
        }
    }
    
    /**
     * Sets the "PostalCode" element
     */
    public void setPostalCode(java.lang.String postalCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTALCODE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSTALCODE$6);
            }
            target.setStringValue(postalCode);
        }
    }
    
    /**
     * Sets (as xml) the "PostalCode" element
     */
    public void xsetPostalCode(net.opengis.xls.PostalCodeType postalCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.PostalCodeType target = null;
            target = (net.opengis.xls.PostalCodeType)get_store().find_element_user(POSTALCODE$6, 0);
            if (target == null)
            {
                target = (net.opengis.xls.PostalCodeType)get_store().add_element_user(POSTALCODE$6);
            }
            target.set(postalCode);
        }
    }
    
    /**
     * Unsets the "PostalCode" element
     */
    public void unsetPostalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POSTALCODE$6, 0);
        }
    }
}
