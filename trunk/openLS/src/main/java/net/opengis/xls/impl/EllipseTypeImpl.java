/*
 * XML Type:  EllipseType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.EllipseType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML EllipseType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class EllipseTypeImpl extends net.opengis.gml.impl.AbstractGeometricPrimitiveTypeImpl implements net.opengis.xls.EllipseType
{
    private static final long serialVersionUID = 1L;
    
    public EllipseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "pos");
    private static final javax.xml.namespace.QName MAJORAXIS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "majorAxis");
    private static final javax.xml.namespace.QName MINORAXIS$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "minorAxis");
    private static final javax.xml.namespace.QName ROTATION$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "rotation");
    
    
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
     * Gets the "majorAxis" element
     */
    public net.opengis.gml.LengthType getMajorAxis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LengthType target = null;
            target = (net.opengis.gml.LengthType)get_store().find_element_user(MAJORAXIS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "majorAxis" element
     */
    public void setMajorAxis(net.opengis.gml.LengthType majorAxis)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LengthType target = null;
            target = (net.opengis.gml.LengthType)get_store().find_element_user(MAJORAXIS$2, 0);
            if (target == null)
            {
                target = (net.opengis.gml.LengthType)get_store().add_element_user(MAJORAXIS$2);
            }
            target.set(majorAxis);
        }
    }
    
    /**
     * Appends and returns a new empty "majorAxis" element
     */
    public net.opengis.gml.LengthType addNewMajorAxis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LengthType target = null;
            target = (net.opengis.gml.LengthType)get_store().add_element_user(MAJORAXIS$2);
            return target;
        }
    }
    
    /**
     * Gets the "minorAxis" element
     */
    public net.opengis.gml.LengthType getMinorAxis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LengthType target = null;
            target = (net.opengis.gml.LengthType)get_store().find_element_user(MINORAXIS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "minorAxis" element
     */
    public void setMinorAxis(net.opengis.gml.LengthType minorAxis)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LengthType target = null;
            target = (net.opengis.gml.LengthType)get_store().find_element_user(MINORAXIS$4, 0);
            if (target == null)
            {
                target = (net.opengis.gml.LengthType)get_store().add_element_user(MINORAXIS$4);
            }
            target.set(minorAxis);
        }
    }
    
    /**
     * Appends and returns a new empty "minorAxis" element
     */
    public net.opengis.gml.LengthType addNewMinorAxis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LengthType target = null;
            target = (net.opengis.gml.LengthType)get_store().add_element_user(MINORAXIS$4);
            return target;
        }
    }
    
    /**
     * Gets the "rotation" element
     */
    public net.opengis.gml.AngleType getRotation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AngleType target = null;
            target = (net.opengis.gml.AngleType)get_store().find_element_user(ROTATION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "rotation" element
     */
    public void setRotation(net.opengis.gml.AngleType rotation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AngleType target = null;
            target = (net.opengis.gml.AngleType)get_store().find_element_user(ROTATION$6, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AngleType)get_store().add_element_user(ROTATION$6);
            }
            target.set(rotation);
        }
    }
    
    /**
     * Appends and returns a new empty "rotation" element
     */
    public net.opengis.gml.AngleType addNewRotation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AngleType target = null;
            target = (net.opengis.gml.AngleType)get_store().add_element_user(ROTATION$6);
            return target;
        }
    }
}
