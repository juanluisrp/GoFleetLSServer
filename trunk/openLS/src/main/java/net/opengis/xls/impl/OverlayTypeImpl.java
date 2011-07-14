/*
 * XML Type:  OverlayType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.OverlayType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML OverlayType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class OverlayTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.OverlayType
{
    private static final long serialVersionUID = 1L;
    
    public OverlayTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POI$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "POI");
    private static final javax.xml.namespace.QName ROUTEGEOMETRY$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "RouteGeometry");
    private static final javax.xml.namespace.QName POSITION$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Position");
    private static final javax.xml.namespace.QName MAP$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Map");
    private static final javax.xml.namespace.QName STYLE$8 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Style");
    private static final javax.xml.namespace.QName ZORDER$10 = 
        new javax.xml.namespace.QName("", "zorder");
    
    
    /**
     * Gets the "POI" element
     */
    public net.opengis.xls.PointOfInterestType getPOI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.PointOfInterestType target = null;
            target = (net.opengis.xls.PointOfInterestType)get_store().find_element_user(POI$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "POI" element
     */
    public boolean isSetPOI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POI$0) != 0;
        }
    }
    
    /**
     * Sets the "POI" element
     */
    public void setPOI(net.opengis.xls.PointOfInterestType poi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.PointOfInterestType target = null;
            target = (net.opengis.xls.PointOfInterestType)get_store().find_element_user(POI$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.PointOfInterestType)get_store().add_element_user(POI$0);
            }
            target.set(poi);
        }
    }
    
    /**
     * Appends and returns a new empty "POI" element
     */
    public net.opengis.xls.PointOfInterestType addNewPOI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.PointOfInterestType target = null;
            target = (net.opengis.xls.PointOfInterestType)get_store().add_element_user(POI$0);
            return target;
        }
    }
    
    /**
     * Unsets the "POI" element
     */
    public void unsetPOI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POI$0, 0);
        }
    }
    
    /**
     * Gets the "RouteGeometry" element
     */
    public net.opengis.xls.RouteGeometryType getRouteGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteGeometryType target = null;
            target = (net.opengis.xls.RouteGeometryType)get_store().find_element_user(ROUTEGEOMETRY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "RouteGeometry" element
     */
    public boolean isSetRouteGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROUTEGEOMETRY$2) != 0;
        }
    }
    
    /**
     * Sets the "RouteGeometry" element
     */
    public void setRouteGeometry(net.opengis.xls.RouteGeometryType routeGeometry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteGeometryType target = null;
            target = (net.opengis.xls.RouteGeometryType)get_store().find_element_user(ROUTEGEOMETRY$2, 0);
            if (target == null)
            {
                target = (net.opengis.xls.RouteGeometryType)get_store().add_element_user(ROUTEGEOMETRY$2);
            }
            target.set(routeGeometry);
        }
    }
    
    /**
     * Appends and returns a new empty "RouteGeometry" element
     */
    public net.opengis.xls.RouteGeometryType addNewRouteGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteGeometryType target = null;
            target = (net.opengis.xls.RouteGeometryType)get_store().add_element_user(ROUTEGEOMETRY$2);
            return target;
        }
    }
    
    /**
     * Unsets the "RouteGeometry" element
     */
    public void unsetRouteGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROUTEGEOMETRY$2, 0);
        }
    }
    
    /**
     * Gets the "Position" element
     */
    public net.opengis.xls.PositionType getPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.PositionType target = null;
            target = (net.opengis.xls.PositionType)get_store().find_element_user(POSITION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Position" element
     */
    public boolean isSetPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POSITION$4) != 0;
        }
    }
    
    /**
     * Sets the "Position" element
     */
    public void setPosition(net.opengis.xls.PositionType position)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.PositionType target = null;
            target = (net.opengis.xls.PositionType)get_store().find_element_user(POSITION$4, 0);
            if (target == null)
            {
                target = (net.opengis.xls.PositionType)get_store().add_element_user(POSITION$4);
            }
            target.set(position);
        }
    }
    
    /**
     * Appends and returns a new empty "Position" element
     */
    public net.opengis.xls.PositionType addNewPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.PositionType target = null;
            target = (net.opengis.xls.PositionType)get_store().add_element_user(POSITION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "Position" element
     */
    public void unsetPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POSITION$4, 0);
        }
    }
    
    /**
     * Gets the "Map" element
     */
    public net.opengis.xls.MapType getMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.MapType target = null;
            target = (net.opengis.xls.MapType)get_store().find_element_user(MAP$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Map" element
     */
    public boolean isSetMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAP$6) != 0;
        }
    }
    
    /**
     * Sets the "Map" element
     */
    public void setMap(net.opengis.xls.MapType map)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.MapType target = null;
            target = (net.opengis.xls.MapType)get_store().find_element_user(MAP$6, 0);
            if (target == null)
            {
                target = (net.opengis.xls.MapType)get_store().add_element_user(MAP$6);
            }
            target.set(map);
        }
    }
    
    /**
     * Appends and returns a new empty "Map" element
     */
    public net.opengis.xls.MapType addNewMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.MapType target = null;
            target = (net.opengis.xls.MapType)get_store().add_element_user(MAP$6);
            return target;
        }
    }
    
    /**
     * Unsets the "Map" element
     */
    public void unsetMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAP$6, 0);
        }
    }
    
    /**
     * Gets the "Style" element
     */
    public net.opengis.xls.StyleType getStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.StyleType target = null;
            target = (net.opengis.xls.StyleType)get_store().find_element_user(STYLE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Style" element
     */
    public boolean isSetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STYLE$8) != 0;
        }
    }
    
    /**
     * Sets the "Style" element
     */
    public void setStyle(net.opengis.xls.StyleType style)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.StyleType target = null;
            target = (net.opengis.xls.StyleType)get_store().find_element_user(STYLE$8, 0);
            if (target == null)
            {
                target = (net.opengis.xls.StyleType)get_store().add_element_user(STYLE$8);
            }
            target.set(style);
        }
    }
    
    /**
     * Appends and returns a new empty "Style" element
     */
    public net.opengis.xls.StyleType addNewStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.StyleType target = null;
            target = (net.opengis.xls.StyleType)get_store().add_element_user(STYLE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "Style" element
     */
    public void unsetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STYLE$8, 0);
        }
    }
    
    /**
     * Gets the "zorder" attribute
     */
    public java.math.BigInteger getZorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ZORDER$10);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "zorder" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetZorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(ZORDER$10);
            return target;
        }
    }
    
    /**
     * True if has "zorder" attribute
     */
    public boolean isSetZorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ZORDER$10) != null;
        }
    }
    
    /**
     * Sets the "zorder" attribute
     */
    public void setZorder(java.math.BigInteger zorder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ZORDER$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ZORDER$10);
            }
            target.setBigIntegerValue(zorder);
        }
    }
    
    /**
     * Sets (as xml) the "zorder" attribute
     */
    public void xsetZorder(org.apache.xmlbeans.XmlInteger zorder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(ZORDER$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(ZORDER$10);
            }
            target.set(zorder);
        }
    }
    
    /**
     * Unsets the "zorder" attribute
     */
    public void unsetZorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ZORDER$10);
        }
    }
}
