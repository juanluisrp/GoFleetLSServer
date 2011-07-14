/*
 * XML Type:  StreetAddressType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.StreetAddressType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML StreetAddressType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class StreetAddressTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.StreetAddressType
{
    private static final long serialVersionUID = 1L;
    
    public StreetAddressTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STREETLOCATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_StreetLocation");
    private static final org.apache.xmlbeans.QNameSet STREETLOCATION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Building"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_StreetLocation"),
    });
    private static final javax.xml.namespace.QName STREET$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Street");
    private static final javax.xml.namespace.QName LOCATOR$4 = 
        new javax.xml.namespace.QName("", "locator");
    
    
    /**
     * Gets the "_StreetLocation" element
     */
    public net.opengis.xls.AbstractStreetLocatorType getStreetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractStreetLocatorType target = null;
            target = (net.opengis.xls.AbstractStreetLocatorType)get_store().find_element_user(STREETLOCATION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "_StreetLocation" element
     */
    public boolean isSetStreetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STREETLOCATION$1) != 0;
        }
    }
    
    /**
     * Sets the "_StreetLocation" element
     */
    public void setStreetLocation(net.opengis.xls.AbstractStreetLocatorType streetLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractStreetLocatorType target = null;
            target = (net.opengis.xls.AbstractStreetLocatorType)get_store().find_element_user(STREETLOCATION$1, 0);
            if (target == null)
            {
                target = (net.opengis.xls.AbstractStreetLocatorType)get_store().add_element_user(STREETLOCATION$0);
            }
            target.set(streetLocation);
        }
    }
    
    /**
     * Appends and returns a new empty "_StreetLocation" element
     */
    public net.opengis.xls.AbstractStreetLocatorType addNewStreetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractStreetLocatorType target = null;
            target = (net.opengis.xls.AbstractStreetLocatorType)get_store().add_element_user(STREETLOCATION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "_StreetLocation" element
     */
    public void unsetStreetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STREETLOCATION$1, 0);
        }
    }
    
    /**
     * Gets array of all "Street" elements
     */
    public net.opengis.xls.StreetNameType[] getStreetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STREET$2, targetList);
            net.opengis.xls.StreetNameType[] result = new net.opengis.xls.StreetNameType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Street" element
     */
    public net.opengis.xls.StreetNameType getStreetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.StreetNameType target = null;
            target = (net.opengis.xls.StreetNameType)get_store().find_element_user(STREET$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Street" element
     */
    public int sizeOfStreetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STREET$2);
        }
    }
    
    /**
     * Sets array of all "Street" element
     */
    public void setStreetArray(net.opengis.xls.StreetNameType[] streetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(streetArray, STREET$2);
        }
    }
    
    /**
     * Sets ith "Street" element
     */
    public void setStreetArray(int i, net.opengis.xls.StreetNameType street)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.StreetNameType target = null;
            target = (net.opengis.xls.StreetNameType)get_store().find_element_user(STREET$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(street);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Street" element
     */
    public net.opengis.xls.StreetNameType insertNewStreet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.StreetNameType target = null;
            target = (net.opengis.xls.StreetNameType)get_store().insert_element_user(STREET$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Street" element
     */
    public net.opengis.xls.StreetNameType addNewStreet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.StreetNameType target = null;
            target = (net.opengis.xls.StreetNameType)get_store().add_element_user(STREET$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "Street" element
     */
    public void removeStreet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STREET$2, i);
        }
    }
    
    /**
     * Gets the "locator" attribute
     */
    public org.apache.xmlbeans.XmlAnySimpleType getLocator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(LOCATOR$4);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "locator" attribute
     */
    public boolean isSetLocator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LOCATOR$4) != null;
        }
    }
    
    /**
     * Sets the "locator" attribute
     */
    public void setLocator(org.apache.xmlbeans.XmlAnySimpleType locator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(LOCATOR$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(LOCATOR$4);
            }
            target.set(locator);
        }
    }
    
    /**
     * Appends and returns a new empty "locator" attribute
     */
    public org.apache.xmlbeans.XmlAnySimpleType addNewLocator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(LOCATOR$4);
            return target;
        }
    }
    
    /**
     * Unsets the "locator" attribute
     */
    public void unsetLocator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LOCATOR$4);
        }
    }
}
