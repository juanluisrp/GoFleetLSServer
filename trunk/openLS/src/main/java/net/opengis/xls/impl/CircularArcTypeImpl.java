/*
 * XML Type:  CircularArcType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.CircularArcType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML CircularArcType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class CircularArcTypeImpl extends net.opengis.gml.impl.AbstractGeometricPrimitiveTypeImpl implements net.opengis.xls.CircularArcType
{
    private static final long serialVersionUID = 1L;
    
    public CircularArcTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "pos");
    private static final javax.xml.namespace.QName INNERRADIUS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "innerRadius");
    private static final javax.xml.namespace.QName OUTERRADIUS$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "outerRadius");
    private static final javax.xml.namespace.QName STARTANGLE$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "startAngle");
    private static final javax.xml.namespace.QName ENDANGLE$8 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "endAngle");
    private static final javax.xml.namespace.QName INTERPOLATION$10 = 
        new javax.xml.namespace.QName("", "interpolation");
    private static final javax.xml.namespace.QName NUMARC$12 = 
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
     * Gets the "innerRadius" element
     */
    public net.opengis.gml.LengthType getInnerRadius()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LengthType target = null;
            target = (net.opengis.gml.LengthType)get_store().find_element_user(INNERRADIUS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "innerRadius" element
     */
    public void setInnerRadius(net.opengis.gml.LengthType innerRadius)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LengthType target = null;
            target = (net.opengis.gml.LengthType)get_store().find_element_user(INNERRADIUS$2, 0);
            if (target == null)
            {
                target = (net.opengis.gml.LengthType)get_store().add_element_user(INNERRADIUS$2);
            }
            target.set(innerRadius);
        }
    }
    
    /**
     * Appends and returns a new empty "innerRadius" element
     */
    public net.opengis.gml.LengthType addNewInnerRadius()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LengthType target = null;
            target = (net.opengis.gml.LengthType)get_store().add_element_user(INNERRADIUS$2);
            return target;
        }
    }
    
    /**
     * Gets the "outerRadius" element
     */
    public net.opengis.gml.LengthType getOuterRadius()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LengthType target = null;
            target = (net.opengis.gml.LengthType)get_store().find_element_user(OUTERRADIUS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "outerRadius" element
     */
    public void setOuterRadius(net.opengis.gml.LengthType outerRadius)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LengthType target = null;
            target = (net.opengis.gml.LengthType)get_store().find_element_user(OUTERRADIUS$4, 0);
            if (target == null)
            {
                target = (net.opengis.gml.LengthType)get_store().add_element_user(OUTERRADIUS$4);
            }
            target.set(outerRadius);
        }
    }
    
    /**
     * Appends and returns a new empty "outerRadius" element
     */
    public net.opengis.gml.LengthType addNewOuterRadius()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LengthType target = null;
            target = (net.opengis.gml.LengthType)get_store().add_element_user(OUTERRADIUS$4);
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
            target = (net.opengis.gml.AngleType)get_store().find_element_user(STARTANGLE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
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
            target = (net.opengis.gml.AngleType)get_store().find_element_user(STARTANGLE$6, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AngleType)get_store().add_element_user(STARTANGLE$6);
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
            target = (net.opengis.gml.AngleType)get_store().add_element_user(STARTANGLE$6);
            return target;
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
            target = (net.opengis.gml.AngleType)get_store().find_element_user(ENDANGLE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
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
            target = (net.opengis.gml.AngleType)get_store().find_element_user(ENDANGLE$8, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AngleType)get_store().add_element_user(ENDANGLE$8);
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
            target = (net.opengis.gml.AngleType)get_store().add_element_user(ENDANGLE$8);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERPOLATION$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INTERPOLATION$10);
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
            target = (net.opengis.gml.CurveInterpolationType)get_store().find_attribute_user(INTERPOLATION$10);
            if (target == null)
            {
                target = (net.opengis.gml.CurveInterpolationType)get_default_attribute_value(INTERPOLATION$10);
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
            return get_store().find_attribute_user(INTERPOLATION$10) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERPOLATION$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INTERPOLATION$10);
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
            target = (net.opengis.gml.CurveInterpolationType)get_store().find_attribute_user(INTERPOLATION$10);
            if (target == null)
            {
                target = (net.opengis.gml.CurveInterpolationType)get_store().add_attribute_user(INTERPOLATION$10);
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
            get_store().remove_attribute(INTERPOLATION$10);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMARC$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NUMARC$12);
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
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(NUMARC$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_default_attribute_value(NUMARC$12);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMARC$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NUMARC$12);
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
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(NUMARC$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(NUMARC$12);
            }
            target.set(numArc);
        }
    }
}
