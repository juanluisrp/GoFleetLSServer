/*
 * XML Type:  RouteMapOutputType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.RouteMapOutputType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML RouteMapOutputType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class RouteMapOutputTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.RouteMapOutputType
{
    private static final long serialVersionUID = 1L;
    
    public RouteMapOutputTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BBOXCONTEXT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "BBoxContext");
    private static final javax.xml.namespace.QName WIDTH$2 = 
        new javax.xml.namespace.QName("", "width");
    private static final javax.xml.namespace.QName HEIGHT$4 = 
        new javax.xml.namespace.QName("", "height");
    private static final javax.xml.namespace.QName FORMAT$6 = 
        new javax.xml.namespace.QName("", "format");
    private static final javax.xml.namespace.QName BGCOLOR$8 = 
        new javax.xml.namespace.QName("", "BGcolor");
    private static final javax.xml.namespace.QName TRANSPARENT$10 = 
        new javax.xml.namespace.QName("", "transparent");
    private static final javax.xml.namespace.QName STYLE$12 = 
        new javax.xml.namespace.QName("", "style");
    
    
    /**
     * Gets the "BBoxContext" element
     */
    public net.opengis.gml.EnvelopeType getBBoxContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EnvelopeType target = null;
            target = (net.opengis.gml.EnvelopeType)get_store().find_element_user(BBOXCONTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "BBoxContext" element
     */
    public boolean isSetBBoxContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BBOXCONTEXT$0) != 0;
        }
    }
    
    /**
     * Sets the "BBoxContext" element
     */
    public void setBBoxContext(net.opengis.gml.EnvelopeType bBoxContext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EnvelopeType target = null;
            target = (net.opengis.gml.EnvelopeType)get_store().find_element_user(BBOXCONTEXT$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.EnvelopeType)get_store().add_element_user(BBOXCONTEXT$0);
            }
            target.set(bBoxContext);
        }
    }
    
    /**
     * Appends and returns a new empty "BBoxContext" element
     */
    public net.opengis.gml.EnvelopeType addNewBBoxContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EnvelopeType target = null;
            target = (net.opengis.gml.EnvelopeType)get_store().add_element_user(BBOXCONTEXT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "BBoxContext" element
     */
    public void unsetBBoxContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BBOXCONTEXT$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WIDTH$2);
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
    public org.apache.xmlbeans.XmlNonNegativeInteger xgetWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(WIDTH$2);
            return target;
        }
    }
    
    /**
     * True if has "width" attribute
     */
    public boolean isSetWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(WIDTH$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WIDTH$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WIDTH$2);
            }
            target.setBigIntegerValue(width);
        }
    }
    
    /**
     * Sets (as xml) the "width" attribute
     */
    public void xsetWidth(org.apache.xmlbeans.XmlNonNegativeInteger width)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(WIDTH$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_attribute_user(WIDTH$2);
            }
            target.set(width);
        }
    }
    
    /**
     * Unsets the "width" attribute
     */
    public void unsetWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(WIDTH$2);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEIGHT$4);
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
    public org.apache.xmlbeans.XmlNonNegativeInteger xgetHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(HEIGHT$4);
            return target;
        }
    }
    
    /**
     * True if has "height" attribute
     */
    public boolean isSetHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HEIGHT$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEIGHT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEIGHT$4);
            }
            target.setBigIntegerValue(height);
        }
    }
    
    /**
     * Sets (as xml) the "height" attribute
     */
    public void xsetHeight(org.apache.xmlbeans.XmlNonNegativeInteger height)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(HEIGHT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_attribute_user(HEIGHT$4);
            }
            target.set(height);
        }
    }
    
    /**
     * Unsets the "height" attribute
     */
    public void unsetHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HEIGHT$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMAT$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FORMAT$6);
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
            return get_store().find_attribute_user(FORMAT$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMAT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORMAT$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FORMAT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FORMAT$6);
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
            get_store().remove_attribute(FORMAT$6);
        }
    }
    
    /**
     * Gets the "BGcolor" attribute
     */
    public java.lang.String getBGcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BGCOLOR$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "BGcolor" attribute
     */
    public org.apache.xmlbeans.XmlString xgetBGcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BGCOLOR$8);
            return target;
        }
    }
    
    /**
     * True if has "BGcolor" attribute
     */
    public boolean isSetBGcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BGCOLOR$8) != null;
        }
    }
    
    /**
     * Sets the "BGcolor" attribute
     */
    public void setBGcolor(java.lang.String bGcolor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BGCOLOR$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BGCOLOR$8);
            }
            target.setStringValue(bGcolor);
        }
    }
    
    /**
     * Sets (as xml) the "BGcolor" attribute
     */
    public void xsetBGcolor(org.apache.xmlbeans.XmlString bGcolor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BGCOLOR$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BGCOLOR$8);
            }
            target.set(bGcolor);
        }
    }
    
    /**
     * Unsets the "BGcolor" attribute
     */
    public void unsetBGcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BGCOLOR$8);
        }
    }
    
    /**
     * Gets the "transparent" attribute
     */
    public boolean getTransparent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRANSPARENT$10);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "transparent" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetTransparent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TRANSPARENT$10);
            return target;
        }
    }
    
    /**
     * True if has "transparent" attribute
     */
    public boolean isSetTransparent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TRANSPARENT$10) != null;
        }
    }
    
    /**
     * Sets the "transparent" attribute
     */
    public void setTransparent(boolean transparent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRANSPARENT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TRANSPARENT$10);
            }
            target.setBooleanValue(transparent);
        }
    }
    
    /**
     * Sets (as xml) the "transparent" attribute
     */
    public void xsetTransparent(org.apache.xmlbeans.XmlBoolean transparent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TRANSPARENT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(TRANSPARENT$10);
            }
            target.set(transparent);
        }
    }
    
    /**
     * Unsets the "transparent" attribute
     */
    public void unsetTransparent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TRANSPARENT$10);
        }
    }
    
    /**
     * Gets the "style" attribute
     */
    public net.opengis.xls.RouteMapStyleType.Enum getStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLE$12);
            if (target == null)
            {
                return null;
            }
            return (net.opengis.xls.RouteMapStyleType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "style" attribute
     */
    public net.opengis.xls.RouteMapStyleType xgetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteMapStyleType target = null;
            target = (net.opengis.xls.RouteMapStyleType)get_store().find_attribute_user(STYLE$12);
            return target;
        }
    }
    
    /**
     * True if has "style" attribute
     */
    public boolean isSetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STYLE$12) != null;
        }
    }
    
    /**
     * Sets the "style" attribute
     */
    public void setStyle(net.opengis.xls.RouteMapStyleType.Enum style)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STYLE$12);
            }
            target.setEnumValue(style);
        }
    }
    
    /**
     * Sets (as xml) the "style" attribute
     */
    public void xsetStyle(net.opengis.xls.RouteMapStyleType style)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteMapStyleType target = null;
            target = (net.opengis.xls.RouteMapStyleType)get_store().find_attribute_user(STYLE$12);
            if (target == null)
            {
                target = (net.opengis.xls.RouteMapStyleType)get_store().add_attribute_user(STYLE$12);
            }
            target.set(style);
        }
    }
    
    /**
     * Unsets the "style" attribute
     */
    public void unsetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STYLE$12);
        }
    }
}
