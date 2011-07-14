/*
 * XML Type:  ContentType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.ContentType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML ContentType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class ContentTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.ContentType
{
    private static final long serialVersionUID = 1L;
    
    public ContentTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATA$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Data");
    private static final javax.xml.namespace.QName URL$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "URL");
    private static final javax.xml.namespace.QName FORMAT$4 = 
        new javax.xml.namespace.QName("", "format");
    private static final javax.xml.namespace.QName WIDTH$6 = 
        new javax.xml.namespace.QName("", "width");
    private static final javax.xml.namespace.QName HEIGHT$8 = 
        new javax.xml.namespace.QName("", "height");
    
    
    /**
     * Gets the "Data" element
     */
    public java.lang.String getData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Data" element
     */
    public org.apache.xmlbeans.XmlString xgetData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATA$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Data" element
     */
    public boolean isSetData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATA$0) != 0;
        }
    }
    
    /**
     * Sets the "Data" element
     */
    public void setData(java.lang.String data)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATA$0);
            }
            target.setStringValue(data);
        }
    }
    
    /**
     * Sets (as xml) the "Data" element
     */
    public void xsetData(org.apache.xmlbeans.XmlString data)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATA$0);
            }
            target.set(data);
        }
    }
    
    /**
     * Unsets the "Data" element
     */
    public void unsetData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATA$0, 0);
        }
    }
    
    /**
     * Gets the "URL" element
     */
    public java.lang.String getURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "URL" element
     */
    public org.apache.xmlbeans.XmlString xgetURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URL$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "URL" element
     */
    public boolean isSetURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(URL$2) != 0;
        }
    }
    
    /**
     * Sets the "URL" element
     */
    public void setURL(java.lang.String url)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(URL$2);
            }
            target.setStringValue(url);
        }
    }
    
    /**
     * Sets (as xml) the "URL" element
     */
    public void xsetURL(org.apache.xmlbeans.XmlString url)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(URL$2);
            }
            target.set(url);
        }
    }
    
    /**
     * Unsets the "URL" element
     */
    public void unsetURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(URL$2, 0);
        }
    }
    
    /**
     * Gets the "format" attribute
     */
    public java.lang.String getFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMAT$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "format" attribute
     */
    public org.apache.xmlbeans.XmlString xgetFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FORMAT$4);
            return target;
        }
    }
    
    /**
     * Sets the "format" attribute
     */
    public void setFormat(java.lang.String format)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMAT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORMAT$4);
            }
            target.setStringValue(format);
        }
    }
    
    /**
     * Sets (as xml) the "format" attribute
     */
    public void xsetFormat(org.apache.xmlbeans.XmlString format)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FORMAT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FORMAT$4);
            }
            target.set(format);
        }
    }
    
    /**
     * Gets the "width" attribute
     */
    public java.math.BigInteger getWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WIDTH$6);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "width" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(WIDTH$6);
            return target;
        }
    }
    
    /**
     * Sets the "width" attribute
     */
    public void setWidth(java.math.BigInteger width)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WIDTH$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WIDTH$6);
            }
            target.setBigIntegerValue(width);
        }
    }
    
    /**
     * Sets (as xml) the "width" attribute
     */
    public void xsetWidth(org.apache.xmlbeans.XmlInteger width)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(WIDTH$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(WIDTH$6);
            }
            target.set(width);
        }
    }
    
    /**
     * Gets the "height" attribute
     */
    public java.math.BigInteger getHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEIGHT$8);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "height" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(HEIGHT$8);
            return target;
        }
    }
    
    /**
     * Sets the "height" attribute
     */
    public void setHeight(java.math.BigInteger height)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEIGHT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEIGHT$8);
            }
            target.setBigIntegerValue(height);
        }
    }
    
    /**
     * Sets (as xml) the "height" attribute
     */
    public void xsetHeight(org.apache.xmlbeans.XmlInteger height)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(HEIGHT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(HEIGHT$8);
            }
            target.set(height);
        }
    }
}
