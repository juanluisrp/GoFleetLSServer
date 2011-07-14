/*
 * XML Type:  POIPropertiesType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.POIPropertiesType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML POIPropertiesType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class POIPropertiesTypeImpl extends net.opengis.xls.impl.AbstractPOISelectionCriteriaTypeImpl implements net.opengis.xls.POIPropertiesType
{
    private static final long serialVersionUID = 1L;
    
    public POIPropertiesTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POIPROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_POIProperty");
    private static final org.apache.xmlbeans.QNameSet POIPROPERTY$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "POIProperty"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_POIProperty"),
    });
    private static final javax.xml.namespace.QName DIRECTORYTYPE$2 = 
        new javax.xml.namespace.QName("", "directoryType");
    
    
    /**
     * Gets array of all "_POIProperty" elements
     */
    public org.apache.xmlbeans.XmlObject[] getPOIPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(POIPROPERTY$1, targetList);
            org.apache.xmlbeans.XmlObject[] result = new org.apache.xmlbeans.XmlObject[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "_POIProperty" element
     */
    public org.apache.xmlbeans.XmlObject getPOIPropertyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(POIPROPERTY$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "_POIProperty" element
     */
    public int sizeOfPOIPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POIPROPERTY$1);
        }
    }
    
    /**
     * Sets array of all "_POIProperty" element
     */
    public void setPOIPropertyArray(org.apache.xmlbeans.XmlObject[] poiPropertyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(poiPropertyArray, POIPROPERTY$0, POIPROPERTY$1);
        }
    }
    
    /**
     * Sets ith "_POIProperty" element
     */
    public void setPOIPropertyArray(int i, org.apache.xmlbeans.XmlObject poiProperty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(POIPROPERTY$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(poiProperty);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "_POIProperty" element
     */
    public org.apache.xmlbeans.XmlObject insertNewPOIProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(POIPROPERTY$1, POIPROPERTY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "_POIProperty" element
     */
    public org.apache.xmlbeans.XmlObject addNewPOIProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(POIPROPERTY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "_POIProperty" element
     */
    public void removePOIProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POIPROPERTY$1, i);
        }
    }
    
    /**
     * Gets the "directoryType" attribute
     */
    public java.lang.String getDirectoryType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIRECTORYTYPE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "directoryType" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDirectoryType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DIRECTORYTYPE$2);
            return target;
        }
    }
    
    /**
     * True if has "directoryType" attribute
     */
    public boolean isSetDirectoryType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DIRECTORYTYPE$2) != null;
        }
    }
    
    /**
     * Sets the "directoryType" attribute
     */
    public void setDirectoryType(java.lang.String directoryType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIRECTORYTYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIRECTORYTYPE$2);
            }
            target.setStringValue(directoryType);
        }
    }
    
    /**
     * Sets (as xml) the "directoryType" attribute
     */
    public void xsetDirectoryType(org.apache.xmlbeans.XmlString directoryType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DIRECTORYTYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DIRECTORYTYPE$2);
            }
            target.set(directoryType);
        }
    }
    
    /**
     * Unsets the "directoryType" attribute
     */
    public void unsetDirectoryType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DIRECTORYTYPE$2);
        }
    }
}
