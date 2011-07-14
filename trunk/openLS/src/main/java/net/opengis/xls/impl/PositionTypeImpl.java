/*
 * XML Type:  PositionType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.PositionType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML PositionType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class PositionTypeImpl extends net.opengis.xls.impl.AbstractPositionTypeImpl implements net.opengis.xls.PositionType
{
    private static final long serialVersionUID = 1L;
    
    public PositionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POINT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Point");
    private static final javax.xml.namespace.QName ELLIPSE$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Ellipse");
    private static final javax.xml.namespace.QName CIRCLEBYCENTERPOINT$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CircleByCenterPoint");
    private static final javax.xml.namespace.QName CIRCULARARC$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "CircularArc");
    private static final javax.xml.namespace.QName POLYGON$8 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Polygon");
    private static final javax.xml.namespace.QName MULTIPOLYGON$10 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiPolygon");
    private static final javax.xml.namespace.QName QOP$12 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "QoP");
    private static final javax.xml.namespace.QName TIME$14 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Time");
    private static final javax.xml.namespace.QName SPEED$16 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Speed");
    private static final javax.xml.namespace.QName DIRECTION$18 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Direction");
    private static final javax.xml.namespace.QName LEVELOFCONF$20 = 
        new javax.xml.namespace.QName("", "levelOfConf");
    
    
    /**
     * Gets the "Point" element
     */
    public net.opengis.gml.PointType getPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PointType target = null;
            target = (net.opengis.gml.PointType)get_store().find_element_user(POINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Point" element
     */
    public void setPoint(net.opengis.gml.PointType point)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PointType target = null;
            target = (net.opengis.gml.PointType)get_store().find_element_user(POINT$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.PointType)get_store().add_element_user(POINT$0);
            }
            target.set(point);
        }
    }
    
    /**
     * Appends and returns a new empty "Point" element
     */
    public net.opengis.gml.PointType addNewPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PointType target = null;
            target = (net.opengis.gml.PointType)get_store().add_element_user(POINT$0);
            return target;
        }
    }
    
    /**
     * Gets the "Ellipse" element
     */
    public net.opengis.xls.EllipseType getEllipse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.EllipseType target = null;
            target = (net.opengis.xls.EllipseType)get_store().find_element_user(ELLIPSE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Ellipse" element
     */
    public boolean isSetEllipse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ELLIPSE$2) != 0;
        }
    }
    
    /**
     * Sets the "Ellipse" element
     */
    public void setEllipse(net.opengis.xls.EllipseType ellipse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.EllipseType target = null;
            target = (net.opengis.xls.EllipseType)get_store().find_element_user(ELLIPSE$2, 0);
            if (target == null)
            {
                target = (net.opengis.xls.EllipseType)get_store().add_element_user(ELLIPSE$2);
            }
            target.set(ellipse);
        }
    }
    
    /**
     * Appends and returns a new empty "Ellipse" element
     */
    public net.opengis.xls.EllipseType addNewEllipse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.EllipseType target = null;
            target = (net.opengis.xls.EllipseType)get_store().add_element_user(ELLIPSE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Ellipse" element
     */
    public void unsetEllipse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ELLIPSE$2, 0);
        }
    }
    
    /**
     * Gets the "CircleByCenterPoint" element
     */
    public net.opengis.gml.CircleByCenterPointType getCircleByCenterPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CircleByCenterPointType target = null;
            target = (net.opengis.gml.CircleByCenterPointType)get_store().find_element_user(CIRCLEBYCENTERPOINT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CircleByCenterPoint" element
     */
    public boolean isSetCircleByCenterPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CIRCLEBYCENTERPOINT$4) != 0;
        }
    }
    
    /**
     * Sets the "CircleByCenterPoint" element
     */
    public void setCircleByCenterPoint(net.opengis.gml.CircleByCenterPointType circleByCenterPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CircleByCenterPointType target = null;
            target = (net.opengis.gml.CircleByCenterPointType)get_store().find_element_user(CIRCLEBYCENTERPOINT$4, 0);
            if (target == null)
            {
                target = (net.opengis.gml.CircleByCenterPointType)get_store().add_element_user(CIRCLEBYCENTERPOINT$4);
            }
            target.set(circleByCenterPoint);
        }
    }
    
    /**
     * Appends and returns a new empty "CircleByCenterPoint" element
     */
    public net.opengis.gml.CircleByCenterPointType addNewCircleByCenterPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CircleByCenterPointType target = null;
            target = (net.opengis.gml.CircleByCenterPointType)get_store().add_element_user(CIRCLEBYCENTERPOINT$4);
            return target;
        }
    }
    
    /**
     * Unsets the "CircleByCenterPoint" element
     */
    public void unsetCircleByCenterPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CIRCLEBYCENTERPOINT$4, 0);
        }
    }
    
    /**
     * Gets the "CircularArc" element
     */
    public net.opengis.xls.CircularArcType getCircularArc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.CircularArcType target = null;
            target = (net.opengis.xls.CircularArcType)get_store().find_element_user(CIRCULARARC$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CircularArc" element
     */
    public boolean isSetCircularArc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CIRCULARARC$6) != 0;
        }
    }
    
    /**
     * Sets the "CircularArc" element
     */
    public void setCircularArc(net.opengis.xls.CircularArcType circularArc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.CircularArcType target = null;
            target = (net.opengis.xls.CircularArcType)get_store().find_element_user(CIRCULARARC$6, 0);
            if (target == null)
            {
                target = (net.opengis.xls.CircularArcType)get_store().add_element_user(CIRCULARARC$6);
            }
            target.set(circularArc);
        }
    }
    
    /**
     * Appends and returns a new empty "CircularArc" element
     */
    public net.opengis.xls.CircularArcType addNewCircularArc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.CircularArcType target = null;
            target = (net.opengis.xls.CircularArcType)get_store().add_element_user(CIRCULARARC$6);
            return target;
        }
    }
    
    /**
     * Unsets the "CircularArc" element
     */
    public void unsetCircularArc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CIRCULARARC$6, 0);
        }
    }
    
    /**
     * Gets the "Polygon" element
     */
    public net.opengis.gml.PolygonType getPolygon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolygonType target = null;
            target = (net.opengis.gml.PolygonType)get_store().find_element_user(POLYGON$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Polygon" element
     */
    public boolean isSetPolygon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POLYGON$8) != 0;
        }
    }
    
    /**
     * Sets the "Polygon" element
     */
    public void setPolygon(net.opengis.gml.PolygonType polygon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolygonType target = null;
            target = (net.opengis.gml.PolygonType)get_store().find_element_user(POLYGON$8, 0);
            if (target == null)
            {
                target = (net.opengis.gml.PolygonType)get_store().add_element_user(POLYGON$8);
            }
            target.set(polygon);
        }
    }
    
    /**
     * Appends and returns a new empty "Polygon" element
     */
    public net.opengis.gml.PolygonType addNewPolygon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolygonType target = null;
            target = (net.opengis.gml.PolygonType)get_store().add_element_user(POLYGON$8);
            return target;
        }
    }
    
    /**
     * Unsets the "Polygon" element
     */
    public void unsetPolygon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POLYGON$8, 0);
        }
    }
    
    /**
     * Gets the "MultiPolygon" element
     */
    public net.opengis.gml.MultiPolygonType getMultiPolygon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiPolygonType target = null;
            target = (net.opengis.gml.MultiPolygonType)get_store().find_element_user(MULTIPOLYGON$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MultiPolygon" element
     */
    public boolean isSetMultiPolygon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MULTIPOLYGON$10) != 0;
        }
    }
    
    /**
     * Sets the "MultiPolygon" element
     */
    public void setMultiPolygon(net.opengis.gml.MultiPolygonType multiPolygon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiPolygonType target = null;
            target = (net.opengis.gml.MultiPolygonType)get_store().find_element_user(MULTIPOLYGON$10, 0);
            if (target == null)
            {
                target = (net.opengis.gml.MultiPolygonType)get_store().add_element_user(MULTIPOLYGON$10);
            }
            target.set(multiPolygon);
        }
    }
    
    /**
     * Appends and returns a new empty "MultiPolygon" element
     */
    public net.opengis.gml.MultiPolygonType addNewMultiPolygon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiPolygonType target = null;
            target = (net.opengis.gml.MultiPolygonType)get_store().add_element_user(MULTIPOLYGON$10);
            return target;
        }
    }
    
    /**
     * Unsets the "MultiPolygon" element
     */
    public void unsetMultiPolygon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MULTIPOLYGON$10, 0);
        }
    }
    
    /**
     * Gets the "QoP" element
     */
    public net.opengis.xls.QualityOfPositionType getQoP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.QualityOfPositionType target = null;
            target = (net.opengis.xls.QualityOfPositionType)get_store().find_element_user(QOP$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "QoP" element
     */
    public boolean isSetQoP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QOP$12) != 0;
        }
    }
    
    /**
     * Sets the "QoP" element
     */
    public void setQoP(net.opengis.xls.QualityOfPositionType qoP)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.QualityOfPositionType target = null;
            target = (net.opengis.xls.QualityOfPositionType)get_store().find_element_user(QOP$12, 0);
            if (target == null)
            {
                target = (net.opengis.xls.QualityOfPositionType)get_store().add_element_user(QOP$12);
            }
            target.set(qoP);
        }
    }
    
    /**
     * Appends and returns a new empty "QoP" element
     */
    public net.opengis.xls.QualityOfPositionType addNewQoP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.QualityOfPositionType target = null;
            target = (net.opengis.xls.QualityOfPositionType)get_store().add_element_user(QOP$12);
            return target;
        }
    }
    
    /**
     * Unsets the "QoP" element
     */
    public void unsetQoP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QOP$12, 0);
        }
    }
    
    /**
     * Gets the "Time" element
     */
    public net.opengis.xls.TimeType getTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.TimeType target = null;
            target = (net.opengis.xls.TimeType)get_store().find_element_user(TIME$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Time" element
     */
    public boolean isSetTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIME$14) != 0;
        }
    }
    
    /**
     * Sets the "Time" element
     */
    public void setTime(net.opengis.xls.TimeType time)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.TimeType target = null;
            target = (net.opengis.xls.TimeType)get_store().find_element_user(TIME$14, 0);
            if (target == null)
            {
                target = (net.opengis.xls.TimeType)get_store().add_element_user(TIME$14);
            }
            target.set(time);
        }
    }
    
    /**
     * Appends and returns a new empty "Time" element
     */
    public net.opengis.xls.TimeType addNewTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.TimeType target = null;
            target = (net.opengis.xls.TimeType)get_store().add_element_user(TIME$14);
            return target;
        }
    }
    
    /**
     * Unsets the "Time" element
     */
    public void unsetTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIME$14, 0);
        }
    }
    
    /**
     * Gets the "Speed" element
     */
    public net.opengis.xls.SpeedType getSpeed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.SpeedType target = null;
            target = (net.opengis.xls.SpeedType)get_store().find_element_user(SPEED$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Speed" element
     */
    public boolean isSetSpeed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPEED$16) != 0;
        }
    }
    
    /**
     * Sets the "Speed" element
     */
    public void setSpeed(net.opengis.xls.SpeedType speed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.SpeedType target = null;
            target = (net.opengis.xls.SpeedType)get_store().find_element_user(SPEED$16, 0);
            if (target == null)
            {
                target = (net.opengis.xls.SpeedType)get_store().add_element_user(SPEED$16);
            }
            target.set(speed);
        }
    }
    
    /**
     * Appends and returns a new empty "Speed" element
     */
    public net.opengis.xls.SpeedType addNewSpeed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.SpeedType target = null;
            target = (net.opengis.xls.SpeedType)get_store().add_element_user(SPEED$16);
            return target;
        }
    }
    
    /**
     * Unsets the "Speed" element
     */
    public void unsetSpeed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPEED$16, 0);
        }
    }
    
    /**
     * Gets the "Direction" element
     */
    public net.opengis.xls.AngleType getDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AngleType target = null;
            target = (net.opengis.xls.AngleType)get_store().find_element_user(DIRECTION$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Direction" element
     */
    public boolean isSetDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIRECTION$18) != 0;
        }
    }
    
    /**
     * Sets the "Direction" element
     */
    public void setDirection(net.opengis.xls.AngleType direction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AngleType target = null;
            target = (net.opengis.xls.AngleType)get_store().find_element_user(DIRECTION$18, 0);
            if (target == null)
            {
                target = (net.opengis.xls.AngleType)get_store().add_element_user(DIRECTION$18);
            }
            target.set(direction);
        }
    }
    
    /**
     * Appends and returns a new empty "Direction" element
     */
    public net.opengis.xls.AngleType addNewDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AngleType target = null;
            target = (net.opengis.xls.AngleType)get_store().add_element_user(DIRECTION$18);
            return target;
        }
    }
    
    /**
     * Unsets the "Direction" element
     */
    public void unsetDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIRECTION$18, 0);
        }
    }
    
    /**
     * Gets the "levelOfConf" attribute
     */
    public java.lang.String getLevelOfConf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEVELOFCONF$20);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "levelOfConf" attribute
     */
    public org.apache.xmlbeans.XmlString xgetLevelOfConf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LEVELOFCONF$20);
            return target;
        }
    }
    
    /**
     * True if has "levelOfConf" attribute
     */
    public boolean isSetLevelOfConf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LEVELOFCONF$20) != null;
        }
    }
    
    /**
     * Sets the "levelOfConf" attribute
     */
    public void setLevelOfConf(java.lang.String levelOfConf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEVELOFCONF$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LEVELOFCONF$20);
            }
            target.setStringValue(levelOfConf);
        }
    }
    
    /**
     * Sets (as xml) the "levelOfConf" attribute
     */
    public void xsetLevelOfConf(org.apache.xmlbeans.XmlString levelOfConf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LEVELOFCONF$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LEVELOFCONF$20);
            }
            target.set(levelOfConf);
        }
    }
    
    /**
     * Unsets the "levelOfConf" attribute
     */
    public void unsetLevelOfConf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LEVELOFCONF$20);
        }
    }
}
