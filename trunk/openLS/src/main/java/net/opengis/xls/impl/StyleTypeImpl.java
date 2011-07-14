/*
 * XML Type:  StyleType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.StyleType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML StyleType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class StyleTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.StyleType
{
    private static final long serialVersionUID = 1L;
    
    public StyleTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Name");
    private static final javax.xml.namespace.QName STYLECONTENT$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "StyleContent");
    
    
    /**
     * Gets the "Name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$0) != 0;
        }
    }
    
    /**
     * Sets the "Name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "Name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "Name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$0, 0);
        }
    }
    
    /**
     * Gets the "StyleContent" element
     */
    public java.lang.String getStyleContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STYLECONTENT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "StyleContent" element
     */
    public org.apache.xmlbeans.XmlString xgetStyleContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STYLECONTENT$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "StyleContent" element
     */
    public boolean isSetStyleContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STYLECONTENT$2) != 0;
        }
    }
    
    /**
     * Sets the "StyleContent" element
     */
    public void setStyleContent(java.lang.String styleContent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STYLECONTENT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STYLECONTENT$2);
            }
            target.setStringValue(styleContent);
        }
    }
    
    /**
     * Sets (as xml) the "StyleContent" element
     */
    public void xsetStyleContent(org.apache.xmlbeans.XmlString styleContent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STYLECONTENT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STYLECONTENT$2);
            }
            target.set(styleContent);
        }
    }
    
    /**
     * Unsets the "StyleContent" element
     */
    public void unsetStyleContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STYLECONTENT$2, 0);
        }
    }
}
