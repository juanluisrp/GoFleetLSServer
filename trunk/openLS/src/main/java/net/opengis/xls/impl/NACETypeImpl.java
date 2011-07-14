/*
 * XML Type:  NACEType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.NACEType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML NACEType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class NACETypeImpl extends net.opengis.xls.impl.AbstractNamedReferenceSystemImpl implements net.opengis.xls.NACEType
{
    private static final long serialVersionUID = 1L;
    
    public NACETypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIVISION$0 = 
        new javax.xml.namespace.QName("", "division");
    private static final javax.xml.namespace.QName GROUP$2 = 
        new javax.xml.namespace.QName("", "group");
    private static final javax.xml.namespace.QName CLASS1$4 = 
        new javax.xml.namespace.QName("", "class");
    private static final javax.xml.namespace.QName DESCRIPTION$6 = 
        new javax.xml.namespace.QName("", "description");
    
    
    /**
     * Gets the "division" attribute
     */
    public java.lang.String getDivision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIVISION$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "division" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDivision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DIVISION$0);
            return target;
        }
    }
    
    /**
     * True if has "division" attribute
     */
    public boolean isSetDivision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DIVISION$0) != null;
        }
    }
    
    /**
     * Sets the "division" attribute
     */
    public void setDivision(java.lang.String division)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIVISION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIVISION$0);
            }
            target.setStringValue(division);
        }
    }
    
    /**
     * Sets (as xml) the "division" attribute
     */
    public void xsetDivision(org.apache.xmlbeans.XmlString division)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DIVISION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DIVISION$0);
            }
            target.set(division);
        }
    }
    
    /**
     * Unsets the "division" attribute
     */
    public void unsetDivision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DIVISION$0);
        }
    }
    
    /**
     * Gets the "group" attribute
     */
    public java.lang.String getGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GROUP$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "group" attribute
     */
    public org.apache.xmlbeans.XmlString xgetGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GROUP$2);
            return target;
        }
    }
    
    /**
     * True if has "group" attribute
     */
    public boolean isSetGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(GROUP$2) != null;
        }
    }
    
    /**
     * Sets the "group" attribute
     */
    public void setGroup(java.lang.String group)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GROUP$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GROUP$2);
            }
            target.setStringValue(group);
        }
    }
    
    /**
     * Sets (as xml) the "group" attribute
     */
    public void xsetGroup(org.apache.xmlbeans.XmlString group)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GROUP$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(GROUP$2);
            }
            target.set(group);
        }
    }
    
    /**
     * Unsets the "group" attribute
     */
    public void unsetGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(GROUP$2);
        }
    }
    
    /**
     * Gets the "class" attribute
     */
    public java.lang.String getClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "class" attribute
     */
    public org.apache.xmlbeans.XmlString xgetClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASS1$4);
            return target;
        }
    }
    
    /**
     * True if has "class" attribute
     */
    public boolean isSetClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CLASS1$4) != null;
        }
    }
    
    /**
     * Sets the "class" attribute
     */
    public void setClass1(java.lang.String class1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASS1$4);
            }
            target.setStringValue(class1);
        }
    }
    
    /**
     * Sets (as xml) the "class" attribute
     */
    public void xsetClass1(org.apache.xmlbeans.XmlString class1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASS1$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CLASS1$4);
            }
            target.set(class1);
        }
    }
    
    /**
     * Unsets the "class" attribute
     */
    public void unsetClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CLASS1$4);
        }
    }
    
    /**
     * Gets the "description" attribute
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "description" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$6);
            return target;
        }
    }
    
    /**
     * True if has "description" attribute
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DESCRIPTION$6) != null;
        }
    }
    
    /**
     * Sets the "description" attribute
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESCRIPTION$6);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "description" attribute
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESCRIPTION$6);
            }
            target.set(description);
        }
    }
    
    /**
     * Unsets the "description" attribute
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DESCRIPTION$6);
        }
    }
}
