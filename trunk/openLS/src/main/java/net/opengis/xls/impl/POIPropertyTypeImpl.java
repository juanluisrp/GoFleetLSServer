/*
 * XML Type:  POIPropertyType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.POIPropertyType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML POIPropertyType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class POIPropertyTypeImpl extends net.opengis.xls.impl.AbstractPOIPropertyTypeImpl implements net.opengis.xls.POIPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public POIPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName VALUE$2 = 
        new javax.xml.namespace.QName("", "value");
    
    
    /**
     * Gets the "name" attribute
     */
    public net.opengis.xls.POIPropertyNameType.Enum getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                return null;
            }
            return (net.opengis.xls.POIPropertyNameType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public net.opengis.xls.POIPropertyNameType xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.POIPropertyNameType target = null;
            target = (net.opengis.xls.POIPropertyNameType)get_store().find_attribute_user(NAME$0);
            return target;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(net.opengis.xls.POIPropertyNameType.Enum name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
            }
            target.setEnumValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(net.opengis.xls.POIPropertyNameType name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.POIPropertyNameType target = null;
            target = (net.opengis.xls.POIPropertyNameType)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                target = (net.opengis.xls.POIPropertyNameType)get_store().add_attribute_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "value" attribute
     */
    public java.lang.String getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "value" attribute
     */
    public org.apache.xmlbeans.XmlString xgetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$2);
            return target;
        }
    }
    
    /**
     * Sets the "value" attribute
     */
    public void setValue(java.lang.String value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$2);
            }
            target.setStringValue(value);
        }
    }
    
    /**
     * Sets (as xml) the "value" attribute
     */
    public void xsetValue(org.apache.xmlbeans.XmlString value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALUE$2);
            }
            target.set(value);
        }
    }
}
