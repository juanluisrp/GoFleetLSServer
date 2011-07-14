/*
 * XML Type:  RouteGeometryRequestType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.RouteGeometryRequestType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML RouteGeometryRequestType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class RouteGeometryRequestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.RouteGeometryRequestType
{
    private static final long serialVersionUID = 1L;
    
    public RouteGeometryRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BOUNDINGBOX$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "BoundingBox");
    private static final javax.xml.namespace.QName SCALE$2 = 
        new javax.xml.namespace.QName("", "scale");
    private static final javax.xml.namespace.QName PROVIDESTARTINGPORTION$4 = 
        new javax.xml.namespace.QName("", "provideStartingPortion");
    private static final javax.xml.namespace.QName MAXPOINTS$6 = 
        new javax.xml.namespace.QName("", "maxPoints");
    
    
    /**
     * Gets the "BoundingBox" element
     */
    public net.opengis.gml.EnvelopeType getBoundingBox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EnvelopeType target = null;
            target = (net.opengis.gml.EnvelopeType)get_store().find_element_user(BOUNDINGBOX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "BoundingBox" element
     */
    public boolean isSetBoundingBox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOUNDINGBOX$0) != 0;
        }
    }
    
    /**
     * Sets the "BoundingBox" element
     */
    public void setBoundingBox(net.opengis.gml.EnvelopeType boundingBox)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EnvelopeType target = null;
            target = (net.opengis.gml.EnvelopeType)get_store().find_element_user(BOUNDINGBOX$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.EnvelopeType)get_store().add_element_user(BOUNDINGBOX$0);
            }
            target.set(boundingBox);
        }
    }
    
    /**
     * Appends and returns a new empty "BoundingBox" element
     */
    public net.opengis.gml.EnvelopeType addNewBoundingBox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EnvelopeType target = null;
            target = (net.opengis.gml.EnvelopeType)get_store().add_element_user(BOUNDINGBOX$0);
            return target;
        }
    }
    
    /**
     * Unsets the "BoundingBox" element
     */
    public void unsetBoundingBox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOUNDINGBOX$0, 0);
        }
    }
    
    /**
     * Gets the "scale" attribute
     */
    public java.math.BigInteger getScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCALE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SCALE$2);
            }
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "scale" attribute
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(SCALE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_default_attribute_value(SCALE$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "scale" attribute
     */
    public boolean isSetScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SCALE$2) != null;
        }
    }
    
    /**
     * Sets the "scale" attribute
     */
    public void setScale(java.math.BigInteger scale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCALE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCALE$2);
            }
            target.setBigIntegerValue(scale);
        }
    }
    
    /**
     * Sets (as xml) the "scale" attribute
     */
    public void xsetScale(org.apache.xmlbeans.XmlPositiveInteger scale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(SCALE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_attribute_user(SCALE$2);
            }
            target.set(scale);
        }
    }
    
    /**
     * Unsets the "scale" attribute
     */
    public void unsetScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SCALE$2);
        }
    }
    
    /**
     * Gets the "provideStartingPortion" attribute
     */
    public boolean getProvideStartingPortion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROVIDESTARTINGPORTION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROVIDESTARTINGPORTION$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "provideStartingPortion" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetProvideStartingPortion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROVIDESTARTINGPORTION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROVIDESTARTINGPORTION$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "provideStartingPortion" attribute
     */
    public boolean isSetProvideStartingPortion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PROVIDESTARTINGPORTION$4) != null;
        }
    }
    
    /**
     * Sets the "provideStartingPortion" attribute
     */
    public void setProvideStartingPortion(boolean provideStartingPortion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROVIDESTARTINGPORTION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROVIDESTARTINGPORTION$4);
            }
            target.setBooleanValue(provideStartingPortion);
        }
    }
    
    /**
     * Sets (as xml) the "provideStartingPortion" attribute
     */
    public void xsetProvideStartingPortion(org.apache.xmlbeans.XmlBoolean provideStartingPortion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROVIDESTARTINGPORTION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROVIDESTARTINGPORTION$4);
            }
            target.set(provideStartingPortion);
        }
    }
    
    /**
     * Unsets the "provideStartingPortion" attribute
     */
    public void unsetProvideStartingPortion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PROVIDESTARTINGPORTION$4);
        }
    }
    
    /**
     * Gets the "maxPoints" attribute
     */
    public java.math.BigInteger getMaxPoints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXPOINTS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MAXPOINTS$6);
            }
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "maxPoints" attribute
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetMaxPoints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(MAXPOINTS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_default_attribute_value(MAXPOINTS$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "maxPoints" attribute
     */
    public boolean isSetMaxPoints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MAXPOINTS$6) != null;
        }
    }
    
    /**
     * Sets the "maxPoints" attribute
     */
    public void setMaxPoints(java.math.BigInteger maxPoints)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXPOINTS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAXPOINTS$6);
            }
            target.setBigIntegerValue(maxPoints);
        }
    }
    
    /**
     * Sets (as xml) the "maxPoints" attribute
     */
    public void xsetMaxPoints(org.apache.xmlbeans.XmlPositiveInteger maxPoints)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(MAXPOINTS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_attribute_user(MAXPOINTS$6);
            }
            target.set(maxPoints);
        }
    }
    
    /**
     * Unsets the "maxPoints" attribute
     */
    public void unsetMaxPoints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MAXPOINTS$6);
        }
    }
}
