/*
 * XML Type:  ArcByCenterPointType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ArcByCenterPointType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl;
/**
 * An XML ArcByCenterPointType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class ArcByCenterPointTypeImpl extends net.opengis.gml.impl.AbstractCurveSegmentTypeImpl implements net.opengis.gml.ArcByCenterPointType
{
    private static final long serialVersionUID = 1L;
    
    public ArcByCenterPointTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "pos");
    private static final javax.xml.namespace.QName RADIUS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "radius");
    private static final javax.xml.namespace.QName STARTANGLE$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "startAngle");
    private static final javax.xml.namespace.QName ENDANGLE$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "endAngle");
    private static final javax.xml.namespace.QName INTERPOLATION$8 = 
        new javax.xml.namespace.QName("", "interpolation");
    private static final javax.xml.namespace.QName NUMARC$10 = 
        new javax.xml.namespace.QName("", "numArc");
    
    
    /**
     * Gets the "pos" element
     */
    public net.opengis.gml.DirectPositionType getPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectPositionType target = null;
            target = (net.opengis.gml.DirectPositionType)get_store().find_element_user(POS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pos" element
     */
    public void setPos(net.opengis.gml.DirectPositionType pos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectPositionType target = null;
            target = (net.opengis.gml.DirectPositionType)get_store().find_element_user(POS$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.DirectPositionType)get_store().add_element_user(POS$0);
            }
            target.set(pos);
        }
    }
    
    /**
     * Appends and returns a new empty "pos" element
     */
    public net.opengis.gml.DirectPositionType addNewPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectPositionType target = null;
            target = (net.opengis.gml.DirectPositionType)get_store().add_element_user(POS$0);
            return target;
        }
    }
    
    /**
     * Gets the "radius" element
     */
    public net.opengis.gml.LengthType getRadius()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LengthType target = null;
            target = (net.opengis.gml.LengthType)get_store().find_element_user(RADIUS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "radius" element
     */
    public void setRadius(net.opengis.gml.LengthType radius)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LengthType target = null;
            target = (net.opengis.gml.LengthType)get_store().find_element_user(RADIUS$2, 0);
            if (target == null)
            {
                target = (net.opengis.gml.LengthType)get_store().add_element_user(RADIUS$2);
            }
            target.set(radius);
        }
    }
    
    /**
     * Appends and returns a new empty "radius" element
     */
    public net.opengis.gml.LengthType addNewRadius()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LengthType target = null;
            target = (net.opengis.gml.LengthType)get_store().add_element_user(RADIUS$2);
            return target;
        }
    }
    
    /**
     * Gets the "startAngle" element
     */
    public net.opengis.gml.AngleType getStartAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AngleType target = null;
            target = (net.opengis.gml.AngleType)get_store().find_element_user(STARTANGLE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "startAngle" element
     */
    public boolean isSetStartAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STARTANGLE$4) != 0;
        }
    }
    
    /**
     * Sets the "startAngle" element
     */
    public void setStartAngle(net.opengis.gml.AngleType startAngle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AngleType target = null;
            target = (net.opengis.gml.AngleType)get_store().find_element_user(STARTANGLE$4, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AngleType)get_store().add_element_user(STARTANGLE$4);
            }
            target.set(startAngle);
        }
    }
    
    /**
     * Appends and returns a new empty "startAngle" element
     */
    public net.opengis.gml.AngleType addNewStartAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AngleType target = null;
            target = (net.opengis.gml.AngleType)get_store().add_element_user(STARTANGLE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "startAngle" element
     */
    public void unsetStartAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STARTANGLE$4, 0);
        }
    }
    
    /**
     * Gets the "endAngle" element
     */
    public net.opengis.gml.AngleType getEndAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AngleType target = null;
            target = (net.opengis.gml.AngleType)get_store().find_element_user(ENDANGLE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "endAngle" element
     */
    public boolean isSetEndAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDANGLE$6) != 0;
        }
    }
    
    /**
     * Sets the "endAngle" element
     */
    public void setEndAngle(net.opengis.gml.AngleType endAngle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AngleType target = null;
            target = (net.opengis.gml.AngleType)get_store().find_element_user(ENDANGLE$6, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AngleType)get_store().add_element_user(ENDANGLE$6);
            }
            target.set(endAngle);
        }
    }
    
    /**
     * Appends and returns a new empty "endAngle" element
     */
    public net.opengis.gml.AngleType addNewEndAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AngleType target = null;
            target = (net.opengis.gml.AngleType)get_store().add_element_user(ENDANGLE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "endAngle" element
     */
    public void unsetEndAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDANGLE$6, 0);
        }
    }
    
    /**
     * Gets the "interpolation" attribute
     */
    public net.opengis.gml.CurveInterpolationType.Enum getInterpolation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERPOLATION$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INTERPOLATION$8);
            }
            if (target == null)
            {
                return null;
            }
            return (net.opengis.gml.CurveInterpolationType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "interpolation" attribute
     */
    public net.opengis.gml.CurveInterpolationType xgetInterpolation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CurveInterpolationType target = null;
            target = (net.opengis.gml.CurveInterpolationType)get_store().find_attribute_user(INTERPOLATION$8);
            if (target == null)
            {
                target = (net.opengis.gml.CurveInterpolationType)get_default_attribute_value(INTERPOLATION$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "interpolation" attribute
     */
    public boolean isSetInterpolation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INTERPOLATION$8) != null;
        }
    }
    
    /**
     * Sets the "interpolation" attribute
     */
    public void setInterpolation(net.opengis.gml.CurveInterpolationType.Enum interpolation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERPOLATION$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INTERPOLATION$8);
            }
            target.setEnumValue(interpolation);
        }
    }
    
    /**
     * Sets (as xml) the "interpolation" attribute
     */
    public void xsetInterpolation(net.opengis.gml.CurveInterpolationType interpolation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CurveInterpolationType target = null;
            target = (net.opengis.gml.CurveInterpolationType)get_store().find_attribute_user(INTERPOLATION$8);
            if (target == null)
            {
                target = (net.opengis.gml.CurveInterpolationType)get_store().add_attribute_user(INTERPOLATION$8);
            }
            target.set(interpolation);
        }
    }
    
    /**
     * Unsets the "interpolation" attribute
     */
    public void unsetInterpolation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INTERPOLATION$8);
        }
    }
    
    /**
     * Gets the "numArc" attribute
     */
    public java.math.BigInteger getNumArc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMARC$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NUMARC$10);
            }
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "numArc" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetNumArc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(NUMARC$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_default_attribute_value(NUMARC$10);
            }
            return target;
        }
    }
    
    /**
     * Sets the "numArc" attribute
     */
    public void setNumArc(java.math.BigInteger numArc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMARC$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NUMARC$10);
            }
            target.setBigIntegerValue(numArc);
        }
    }
    
    /**
     * Sets (as xml) the "numArc" attribute
     */
    public void xsetNumArc(org.apache.xmlbeans.XmlInteger numArc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(NUMARC$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(NUMARC$10);
            }
            target.set(numArc);
        }
    }
}
