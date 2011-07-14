/*
 * XML Type:  CenterContextType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.CenterContextType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML CenterContextType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class CenterContextTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.CenterContextType
{
    private static final long serialVersionUID = 1L;
    
    public CenterContextTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CENTERPOINT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "CenterPoint");
    private static final javax.xml.namespace.QName DISPLAYSCALE$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "DisplayScale");
    private static final javax.xml.namespace.QName DPI$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "DPI");
    private static final javax.xml.namespace.QName RADIUS$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Radius");
    private static final javax.xml.namespace.QName AZIMUTH$8 = 
        new javax.xml.namespace.QName("", "azimuth");
    private static final javax.xml.namespace.QName SRS$10 = 
        new javax.xml.namespace.QName("", "SRS");
    
    
    /**
     * Gets the "CenterPoint" element
     */
    public net.opengis.gml.PointType getCenterPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PointType target = null;
            target = (net.opengis.gml.PointType)get_store().find_element_user(CENTERPOINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CenterPoint" element
     */
    public void setCenterPoint(net.opengis.gml.PointType centerPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PointType target = null;
            target = (net.opengis.gml.PointType)get_store().find_element_user(CENTERPOINT$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.PointType)get_store().add_element_user(CENTERPOINT$0);
            }
            target.set(centerPoint);
        }
    }
    
    /**
     * Appends and returns a new empty "CenterPoint" element
     */
    public net.opengis.gml.PointType addNewCenterPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PointType target = null;
            target = (net.opengis.gml.PointType)get_store().add_element_user(CENTERPOINT$0);
            return target;
        }
    }
    
    /**
     * Gets the "DisplayScale" element
     */
    public java.math.BigInteger getDisplayScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYSCALE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "DisplayScale" element
     */
    public org.apache.xmlbeans.XmlInteger xgetDisplayScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(DISPLAYSCALE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "DisplayScale" element
     */
    public boolean isSetDisplayScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPLAYSCALE$2) != 0;
        }
    }
    
    /**
     * Sets the "DisplayScale" element
     */
    public void setDisplayScale(java.math.BigInteger displayScale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYSCALE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISPLAYSCALE$2);
            }
            target.setBigIntegerValue(displayScale);
        }
    }
    
    /**
     * Sets (as xml) the "DisplayScale" element
     */
    public void xsetDisplayScale(org.apache.xmlbeans.XmlInteger displayScale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(DISPLAYSCALE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(DISPLAYSCALE$2);
            }
            target.set(displayScale);
        }
    }
    
    /**
     * Unsets the "DisplayScale" element
     */
    public void unsetDisplayScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPLAYSCALE$2, 0);
        }
    }
    
    /**
     * Gets the "DPI" element
     */
    public java.math.BigInteger getDPI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DPI$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "DPI" element
     */
    public org.apache.xmlbeans.XmlInteger xgetDPI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(DPI$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "DPI" element
     */
    public boolean isSetDPI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DPI$4) != 0;
        }
    }
    
    /**
     * Sets the "DPI" element
     */
    public void setDPI(java.math.BigInteger dpi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DPI$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DPI$4);
            }
            target.setBigIntegerValue(dpi);
        }
    }
    
    /**
     * Sets (as xml) the "DPI" element
     */
    public void xsetDPI(org.apache.xmlbeans.XmlInteger dpi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(DPI$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(DPI$4);
            }
            target.set(dpi);
        }
    }
    
    /**
     * Unsets the "DPI" element
     */
    public void unsetDPI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DPI$4, 0);
        }
    }
    
    /**
     * Gets the "Radius" element
     */
    public net.opengis.xls.RadiusType getRadius()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RadiusType target = null;
            target = (net.opengis.xls.RadiusType)get_store().find_element_user(RADIUS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Radius" element
     */
    public boolean isSetRadius()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RADIUS$6) != 0;
        }
    }
    
    /**
     * Sets the "Radius" element
     */
    public void setRadius(net.opengis.xls.RadiusType radius)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RadiusType target = null;
            target = (net.opengis.xls.RadiusType)get_store().find_element_user(RADIUS$6, 0);
            if (target == null)
            {
                target = (net.opengis.xls.RadiusType)get_store().add_element_user(RADIUS$6);
            }
            target.set(radius);
        }
    }
    
    /**
     * Appends and returns a new empty "Radius" element
     */
    public net.opengis.xls.RadiusType addNewRadius()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RadiusType target = null;
            target = (net.opengis.xls.RadiusType)get_store().add_element_user(RADIUS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "Radius" element
     */
    public void unsetRadius()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RADIUS$6, 0);
        }
    }
    
    /**
     * Gets the "azimuth" attribute
     */
    public java.math.BigInteger getAzimuth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AZIMUTH$8);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "azimuth" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetAzimuth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(AZIMUTH$8);
            return target;
        }
    }
    
    /**
     * True if has "azimuth" attribute
     */
    public boolean isSetAzimuth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AZIMUTH$8) != null;
        }
    }
    
    /**
     * Sets the "azimuth" attribute
     */
    public void setAzimuth(java.math.BigInteger azimuth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AZIMUTH$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AZIMUTH$8);
            }
            target.setBigIntegerValue(azimuth);
        }
    }
    
    /**
     * Sets (as xml) the "azimuth" attribute
     */
    public void xsetAzimuth(org.apache.xmlbeans.XmlInteger azimuth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(AZIMUTH$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(AZIMUTH$8);
            }
            target.set(azimuth);
        }
    }
    
    /**
     * Unsets the "azimuth" attribute
     */
    public void unsetAzimuth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AZIMUTH$8);
        }
    }
    
    /**
     * Gets the "SRS" attribute
     */
    public java.lang.String getSRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SRS$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SRS" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SRS$10);
            return target;
        }
    }
    
    /**
     * Sets the "SRS" attribute
     */
    public void setSRS(java.lang.String srs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SRS$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SRS$10);
            }
            target.setStringValue(srs);
        }
    }
    
    /**
     * Sets (as xml) the "SRS" attribute
     */
    public void xsetSRS(org.apache.xmlbeans.XmlString srs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SRS$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SRS$10);
            }
            target.set(srs);
        }
    }
}
