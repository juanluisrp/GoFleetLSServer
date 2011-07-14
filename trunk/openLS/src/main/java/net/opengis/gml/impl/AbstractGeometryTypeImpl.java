/*
 * XML Type:  AbstractGeometryType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.AbstractGeometryType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl;
/**
 * An XML AbstractGeometryType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class AbstractGeometryTypeImpl extends net.opengis.gml.impl.AbstractGMLTypeImpl implements net.opengis.gml.AbstractGeometryType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractGeometryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GID$0 = 
        new javax.xml.namespace.QName("", "gid");
    private static final javax.xml.namespace.QName SRSNAME$2 = 
        new javax.xml.namespace.QName("", "srsName");
    
    
    /**
     * Gets the "gid" attribute
     */
    public java.lang.String getGid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GID$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "gid" attribute
     */
    public org.apache.xmlbeans.XmlString xgetGid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GID$0);
            return target;
        }
    }
    
    /**
     * True if has "gid" attribute
     */
    public boolean isSetGid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(GID$0) != null;
        }
    }
    
    /**
     * Sets the "gid" attribute
     */
    public void setGid(java.lang.String gid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GID$0);
            }
            target.setStringValue(gid);
        }
    }
    
    /**
     * Sets (as xml) the "gid" attribute
     */
    public void xsetGid(org.apache.xmlbeans.XmlString gid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(GID$0);
            }
            target.set(gid);
        }
    }
    
    /**
     * Unsets the "gid" attribute
     */
    public void unsetGid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(GID$0);
        }
    }
    
    /**
     * Gets the "srsName" attribute
     */
    public java.lang.String getSrsName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SRSNAME$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "srsName" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetSrsName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(SRSNAME$2);
            return target;
        }
    }
    
    /**
     * True if has "srsName" attribute
     */
    public boolean isSetSrsName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SRSNAME$2) != null;
        }
    }
    
    /**
     * Sets the "srsName" attribute
     */
    public void setSrsName(java.lang.String srsName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SRSNAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SRSNAME$2);
            }
            target.setStringValue(srsName);
        }
    }
    
    /**
     * Sets (as xml) the "srsName" attribute
     */
    public void xsetSrsName(org.apache.xmlbeans.XmlAnyURI srsName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(SRSNAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(SRSNAME$2);
            }
            target.set(srsName);
        }
    }
    
    /**
     * Unsets the "srsName" attribute
     */
    public void unsetSrsName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SRSNAME$2);
        }
    }
}
