/*
 * XML Type:  RouteInstructionsRequestType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.RouteInstructionsRequestType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML RouteInstructionsRequestType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class RouteInstructionsRequestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.RouteInstructionsRequestType
{
    private static final long serialVersionUID = 1L;
    
    public RouteInstructionsRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FORMAT$0 = 
        new javax.xml.namespace.QName("", "format");
    private static final javax.xml.namespace.QName PROVIDEGEOMETRY$2 = 
        new javax.xml.namespace.QName("", "provideGeometry");
    private static final javax.xml.namespace.QName PROVIDEBOUNDINGBOX$4 = 
        new javax.xml.namespace.QName("", "provideBoundingBox");
    
    
    /**
     * Gets the "format" attribute
     */
    public java.lang.String getFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMAT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FORMAT$0);
            }
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FORMAT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(FORMAT$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "format" attribute
     */
    public boolean isSetFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FORMAT$0) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMAT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORMAT$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FORMAT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FORMAT$0);
            }
            target.set(format);
        }
    }
    
    /**
     * Unsets the "format" attribute
     */
    public void unsetFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FORMAT$0);
        }
    }
    
    /**
     * Gets the "provideGeometry" attribute
     */
    public boolean getProvideGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROVIDEGEOMETRY$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROVIDEGEOMETRY$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "provideGeometry" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetProvideGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROVIDEGEOMETRY$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROVIDEGEOMETRY$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "provideGeometry" attribute
     */
    public boolean isSetProvideGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PROVIDEGEOMETRY$2) != null;
        }
    }
    
    /**
     * Sets the "provideGeometry" attribute
     */
    public void setProvideGeometry(boolean provideGeometry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROVIDEGEOMETRY$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROVIDEGEOMETRY$2);
            }
            target.setBooleanValue(provideGeometry);
        }
    }
    
    /**
     * Sets (as xml) the "provideGeometry" attribute
     */
    public void xsetProvideGeometry(org.apache.xmlbeans.XmlBoolean provideGeometry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROVIDEGEOMETRY$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROVIDEGEOMETRY$2);
            }
            target.set(provideGeometry);
        }
    }
    
    /**
     * Unsets the "provideGeometry" attribute
     */
    public void unsetProvideGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PROVIDEGEOMETRY$2);
        }
    }
    
    /**
     * Gets the "provideBoundingBox" attribute
     */
    public boolean getProvideBoundingBox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROVIDEBOUNDINGBOX$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROVIDEBOUNDINGBOX$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "provideBoundingBox" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetProvideBoundingBox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROVIDEBOUNDINGBOX$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROVIDEBOUNDINGBOX$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "provideBoundingBox" attribute
     */
    public boolean isSetProvideBoundingBox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PROVIDEBOUNDINGBOX$4) != null;
        }
    }
    
    /**
     * Sets the "provideBoundingBox" attribute
     */
    public void setProvideBoundingBox(boolean provideBoundingBox)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROVIDEBOUNDINGBOX$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROVIDEBOUNDINGBOX$4);
            }
            target.setBooleanValue(provideBoundingBox);
        }
    }
    
    /**
     * Sets (as xml) the "provideBoundingBox" attribute
     */
    public void xsetProvideBoundingBox(org.apache.xmlbeans.XmlBoolean provideBoundingBox)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROVIDEBOUNDINGBOX$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROVIDEBOUNDINGBOX$4);
            }
            target.set(provideBoundingBox);
        }
    }
    
    /**
     * Unsets the "provideBoundingBox" attribute
     */
    public void unsetProvideBoundingBox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PROVIDEBOUNDINGBOX$4);
        }
    }
}
