/*
 * XML Type:  GeocodeRequestType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.GeocodeRequestType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML GeocodeRequestType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class GeocodeRequestTypeImpl extends net.opengis.xls.impl.AbstractRequestParametersTypeImpl implements net.opengis.xls.GeocodeRequestType
{
    private static final long serialVersionUID = 1L;
    
    public GeocodeRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Address");
    private static final javax.xml.namespace.QName RETURNFREEFORM$2 = 
        new javax.xml.namespace.QName("", "returnFreeForm");
    
    
    /**
     * Gets array of all "Address" elements
     */
    public net.opengis.xls.AddressType[] getAddressArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ADDRESS$0, targetList);
            net.opengis.xls.AddressType[] result = new net.opengis.xls.AddressType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Address" element
     */
    public net.opengis.xls.AddressType getAddressArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AddressType target = null;
            target = (net.opengis.xls.AddressType)get_store().find_element_user(ADDRESS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Address" element
     */
    public int sizeOfAddressArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS$0);
        }
    }
    
    /**
     * Sets array of all "Address" element
     */
    public void setAddressArray(net.opengis.xls.AddressType[] addressArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(addressArray, ADDRESS$0);
        }
    }
    
    /**
     * Sets ith "Address" element
     */
    public void setAddressArray(int i, net.opengis.xls.AddressType address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AddressType target = null;
            target = (net.opengis.xls.AddressType)get_store().find_element_user(ADDRESS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(address);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Address" element
     */
    public net.opengis.xls.AddressType insertNewAddress(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AddressType target = null;
            target = (net.opengis.xls.AddressType)get_store().insert_element_user(ADDRESS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Address" element
     */
    public net.opengis.xls.AddressType addNewAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AddressType target = null;
            target = (net.opengis.xls.AddressType)get_store().add_element_user(ADDRESS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Address" element
     */
    public void removeAddress(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS$0, i);
        }
    }
    
    /**
     * Gets the "returnFreeForm" attribute
     */
    public boolean getReturnFreeForm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RETURNFREEFORM$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(RETURNFREEFORM$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "returnFreeForm" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetReturnFreeForm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RETURNFREEFORM$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(RETURNFREEFORM$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "returnFreeForm" attribute
     */
    public boolean isSetReturnFreeForm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RETURNFREEFORM$2) != null;
        }
    }
    
    /**
     * Sets the "returnFreeForm" attribute
     */
    public void setReturnFreeForm(boolean returnFreeForm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RETURNFREEFORM$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RETURNFREEFORM$2);
            }
            target.setBooleanValue(returnFreeForm);
        }
    }
    
    /**
     * Sets (as xml) the "returnFreeForm" attribute
     */
    public void xsetReturnFreeForm(org.apache.xmlbeans.XmlBoolean returnFreeForm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RETURNFREEFORM$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(RETURNFREEFORM$2);
            }
            target.set(returnFreeForm);
        }
    }
    
    /**
     * Unsets the "returnFreeForm" attribute
     */
    public void unsetReturnFreeForm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RETURNFREEFORM$2);
        }
    }
}
