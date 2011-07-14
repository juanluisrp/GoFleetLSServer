/*
 * XML Type:  OutputType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.OutputType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML OutputType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class OutputTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.OutputType
{
    private static final long serialVersionUID = 1L;
    
    public OutputTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BBOXCONTEXT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "BBoxContext");
    private static final javax.xml.namespace.QName CENTERCONTEXT$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "CenterContext");
    private static final javax.xml.namespace.QName WIDTH$4 = 
        new javax.xml.namespace.QName("", "width");
    private static final javax.xml.namespace.QName HEIGHT$6 = 
        new javax.xml.namespace.QName("", "height");
    private static final javax.xml.namespace.QName FORMAT$8 = 
        new javax.xml.namespace.QName("", "format");
    private static final javax.xml.namespace.QName BGCOLOR$10 = 
        new javax.xml.namespace.QName("", "BGcolor");
    private static final javax.xml.namespace.QName TRANSPARENT$12 = 
        new javax.xml.namespace.QName("", "transparent");
    private static final javax.xml.namespace.QName CONTENT$14 = 
        new javax.xml.namespace.QName("", "content");
    
    
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
     * Gets the "CenterContext" element
     */
    public net.opengis.xls.CenterContextType getCenterContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.CenterContextType target = null;
            target = (net.opengis.xls.CenterContextType)get_store().find_element_user(CENTERCONTEXT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CenterContext" element
     */
    public boolean isSetCenterContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CENTERCONTEXT$2) != 0;
        }
    }
    
    /**
     * Sets the "CenterContext" element
     */
    public void setCenterContext(net.opengis.xls.CenterContextType centerContext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.CenterContextType target = null;
            target = (net.opengis.xls.CenterContextType)get_store().find_element_user(CENTERCONTEXT$2, 0);
            if (target == null)
            {
                target = (net.opengis.xls.CenterContextType)get_store().add_element_user(CENTERCONTEXT$2);
            }
            target.set(centerContext);
        }
    }
    
    /**
     * Appends and returns a new empty "CenterContext" element
     */
    public net.opengis.xls.CenterContextType addNewCenterContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.CenterContextType target = null;
            target = (net.opengis.xls.CenterContextType)get_store().add_element_user(CENTERCONTEXT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "CenterContext" element
     */
    public void unsetCenterContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CENTERCONTEXT$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WIDTH$4);
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
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(WIDTH$4);
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
            return get_store().find_attribute_user(WIDTH$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WIDTH$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WIDTH$4);
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
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(WIDTH$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_attribute_user(WIDTH$4);
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
            get_store().remove_attribute(WIDTH$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEIGHT$6);
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
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(HEIGHT$6);
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
            return get_store().find_attribute_user(HEIGHT$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEIGHT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEIGHT$6);
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
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(HEIGHT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_attribute_user(HEIGHT$6);
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
            get_store().remove_attribute(HEIGHT$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMAT$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FORMAT$8);
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
            return get_store().find_attribute_user(FORMAT$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMAT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORMAT$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FORMAT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FORMAT$8);
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
            get_store().remove_attribute(FORMAT$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BGCOLOR$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BGCOLOR$10);
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
            return get_store().find_attribute_user(BGCOLOR$10) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BGCOLOR$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BGCOLOR$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BGCOLOR$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BGCOLOR$10);
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
            get_store().remove_attribute(BGCOLOR$10);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRANSPARENT$12);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TRANSPARENT$12);
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
            return get_store().find_attribute_user(TRANSPARENT$12) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRANSPARENT$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TRANSPARENT$12);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TRANSPARENT$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(TRANSPARENT$12);
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
            get_store().remove_attribute(TRANSPARENT$12);
        }
    }
    
    /**
     * Gets the "content" attribute
     */
    public net.opengis.xls.PresentationContentType.Enum getContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTENT$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CONTENT$14);
            }
            if (target == null)
            {
                return null;
            }
            return (net.opengis.xls.PresentationContentType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "content" attribute
     */
    public net.opengis.xls.PresentationContentType xgetContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.PresentationContentType target = null;
            target = (net.opengis.xls.PresentationContentType)get_store().find_attribute_user(CONTENT$14);
            if (target == null)
            {
                target = (net.opengis.xls.PresentationContentType)get_default_attribute_value(CONTENT$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "content" attribute
     */
    public boolean isSetContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONTENT$14) != null;
        }
    }
    
    /**
     * Sets the "content" attribute
     */
    public void setContent(net.opengis.xls.PresentationContentType.Enum content)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTENT$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONTENT$14);
            }
            target.setEnumValue(content);
        }
    }
    
    /**
     * Sets (as xml) the "content" attribute
     */
    public void xsetContent(net.opengis.xls.PresentationContentType content)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.PresentationContentType target = null;
            target = (net.opengis.xls.PresentationContentType)get_store().find_attribute_user(CONTENT$14);
            if (target == null)
            {
                target = (net.opengis.xls.PresentationContentType)get_store().add_attribute_user(CONTENT$14);
            }
            target.set(content);
        }
    }
    
    /**
     * Unsets the "content" attribute
     */
    public void unsetContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONTENT$14);
        }
    }
}
