/*
 * XML Type:  XLSType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.XLSType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML XLSType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class XLSTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.XLSType
{
    private static final long serialVersionUID = 1L;
    
    public XLSTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HEADER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_Header");
    private static final org.apache.xmlbeans.QNameSet HEADER$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_Header"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "RequestHeader"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "ResponseHeader"),
    });
    private static final javax.xml.namespace.QName BODY$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_Body");
    private static final org.apache.xmlbeans.QNameSet BODY$3 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_Body"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Response"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Request"),
    });
    private static final javax.xml.namespace.QName VERSION$4 = 
        new javax.xml.namespace.QName("", "version");
    private static final javax.xml.namespace.QName LANG$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "lang");
    
    
    /**
     * Gets the "_Header" element
     */
    public net.opengis.xls.AbstractHeaderType getHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractHeaderType target = null;
            target = (net.opengis.xls.AbstractHeaderType)get_store().find_element_user(HEADER$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_Header" element
     */
    public void setHeader(net.opengis.xls.AbstractHeaderType header)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractHeaderType target = null;
            target = (net.opengis.xls.AbstractHeaderType)get_store().find_element_user(HEADER$1, 0);
            if (target == null)
            {
                target = (net.opengis.xls.AbstractHeaderType)get_store().add_element_user(HEADER$0);
            }
            target.set(header);
        }
    }
    
    /**
     * Appends and returns a new empty "_Header" element
     */
    public net.opengis.xls.AbstractHeaderType addNewHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractHeaderType target = null;
            target = (net.opengis.xls.AbstractHeaderType)get_store().add_element_user(HEADER$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "_Body" elements
     */
    public net.opengis.xls.AbstractBodyType[] getBodyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BODY$3, targetList);
            net.opengis.xls.AbstractBodyType[] result = new net.opengis.xls.AbstractBodyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "_Body" element
     */
    public net.opengis.xls.AbstractBodyType getBodyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractBodyType target = null;
            target = (net.opengis.xls.AbstractBodyType)get_store().find_element_user(BODY$3, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "_Body" element
     */
    public int sizeOfBodyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BODY$3);
        }
    }
    
    /**
     * Sets array of all "_Body" element
     */
    public void setBodyArray(net.opengis.xls.AbstractBodyType[] bodyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bodyArray, BODY$2, BODY$3);
        }
    }
    
    /**
     * Sets ith "_Body" element
     */
    public void setBodyArray(int i, net.opengis.xls.AbstractBodyType body)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractBodyType target = null;
            target = (net.opengis.xls.AbstractBodyType)get_store().find_element_user(BODY$3, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(body);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "_Body" element
     */
    public net.opengis.xls.AbstractBodyType insertNewBody(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractBodyType target = null;
            target = (net.opengis.xls.AbstractBodyType)get_store().insert_element_user(BODY$3, BODY$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "_Body" element
     */
    public net.opengis.xls.AbstractBodyType addNewBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractBodyType target = null;
            target = (net.opengis.xls.AbstractBodyType)get_store().add_element_user(BODY$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "_Body" element
     */
    public void removeBody(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BODY$3, i);
        }
    }
    
    /**
     * Gets the "version" attribute
     */
    public java.math.BigDecimal getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$4);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "version" attribute
     */
    public org.apache.xmlbeans.XmlDecimal xgetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(VERSION$4);
            return target;
        }
    }
    
    /**
     * Sets the "version" attribute
     */
    public void setVersion(java.math.BigDecimal version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$4);
            }
            target.setBigDecimalValue(version);
        }
    }
    
    /**
     * Sets (as xml) the "version" attribute
     */
    public void xsetVersion(org.apache.xmlbeans.XmlDecimal version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(VERSION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(VERSION$4);
            }
            target.set(version);
        }
    }
    
    /**
     * Gets the "lang" attribute
     */
    public java.lang.String getLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "lang" attribute
     */
    public org.apache.xmlbeans.XmlLanguage xgetLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$6);
            return target;
        }
    }
    
    /**
     * True if has "lang" attribute
     */
    public boolean isSetLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LANG$6) != null;
        }
    }
    
    /**
     * Sets the "lang" attribute
     */
    public void setLang(java.lang.String lang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$6);
            }
            target.setStringValue(lang);
        }
    }
    
    /**
     * Sets (as xml) the "lang" attribute
     */
    public void xsetLang(org.apache.xmlbeans.XmlLanguage lang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$6);
            }
            target.set(lang);
        }
    }
    
    /**
     * Unsets the "lang" attribute
     */
    public void unsetLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LANG$6);
        }
    }
}
