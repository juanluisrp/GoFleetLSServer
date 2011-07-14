/*
 * XML Type:  NAICSType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.NAICSType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML NAICSType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class NAICSTypeImpl extends net.opengis.xls.impl.AbstractNamedReferenceSystemImpl implements net.opengis.xls.NAICSType
{
    private static final long serialVersionUID = 1L;
    
    public NAICSTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName SUBTYPE$2 = 
        new javax.xml.namespace.QName("", "subType");
    private static final javax.xml.namespace.QName CATEGORY$4 = 
        new javax.xml.namespace.QName("", "category");
    
    
    /**
     * Gets the "type" attribute
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.apache.xmlbeans.XmlString xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$0);
            return target;
        }
    }
    
    /**
     * True if has "type" attribute
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$0) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.apache.xmlbeans.XmlString type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" attribute
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$0);
        }
    }
    
    /**
     * Gets the "subType" attribute
     */
    public java.lang.String getSubType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUBTYPE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "subType" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSubType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SUBTYPE$2);
            return target;
        }
    }
    
    /**
     * True if has "subType" attribute
     */
    public boolean isSetSubType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SUBTYPE$2) != null;
        }
    }
    
    /**
     * Sets the "subType" attribute
     */
    public void setSubType(java.lang.String subType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUBTYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUBTYPE$2);
            }
            target.setStringValue(subType);
        }
    }
    
    /**
     * Sets (as xml) the "subType" attribute
     */
    public void xsetSubType(org.apache.xmlbeans.XmlString subType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SUBTYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SUBTYPE$2);
            }
            target.set(subType);
        }
    }
    
    /**
     * Unsets the "subType" attribute
     */
    public void unsetSubType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SUBTYPE$2);
        }
    }
    
    /**
     * Gets the "category" attribute
     */
    public java.lang.String getCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CATEGORY$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "category" attribute
     */
    public org.apache.xmlbeans.XmlString xgetCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CATEGORY$4);
            return target;
        }
    }
    
    /**
     * True if has "category" attribute
     */
    public boolean isSetCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CATEGORY$4) != null;
        }
    }
    
    /**
     * Sets the "category" attribute
     */
    public void setCategory(java.lang.String category)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CATEGORY$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CATEGORY$4);
            }
            target.setStringValue(category);
        }
    }
    
    /**
     * Sets (as xml) the "category" attribute
     */
    public void xsetCategory(org.apache.xmlbeans.XmlString category)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CATEGORY$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CATEGORY$4);
            }
            target.set(category);
        }
    }
    
    /**
     * Unsets the "category" attribute
     */
    public void unsetCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CATEGORY$4);
        }
    }
}
