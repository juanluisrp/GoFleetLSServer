/*
 * XML Type:  RouteInstructionType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.RouteInstructionType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML RouteInstructionType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class RouteInstructionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.RouteInstructionType
{
    private static final long serialVersionUID = 1L;
    
    public RouteInstructionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INSTRUCTION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Instruction");
    private static final javax.xml.namespace.QName DISTANCE$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "distance");
    private static final javax.xml.namespace.QName ROUTEINSTRUCTIONGEOMETRY$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "RouteInstructionGeometry");
    private static final javax.xml.namespace.QName BOUNDINGBOX$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "BoundingBox");
    private static final javax.xml.namespace.QName DURATION$8 = 
        new javax.xml.namespace.QName("", "duration");
    private static final javax.xml.namespace.QName DESCRIPTION$10 = 
        new javax.xml.namespace.QName("", "description");
    
    
    /**
     * Gets the "Instruction" element
     */
    public java.lang.String getInstruction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSTRUCTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Instruction" element
     */
    public org.apache.xmlbeans.XmlString xgetInstruction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INSTRUCTION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Instruction" element
     */
    public void setInstruction(java.lang.String instruction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSTRUCTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INSTRUCTION$0);
            }
            target.setStringValue(instruction);
        }
    }
    
    /**
     * Sets (as xml) the "Instruction" element
     */
    public void xsetInstruction(org.apache.xmlbeans.XmlString instruction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INSTRUCTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INSTRUCTION$0);
            }
            target.set(instruction);
        }
    }
    
    /**
     * Gets the "distance" element
     */
    public net.opengis.xls.DistanceType getDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.DistanceType target = null;
            target = (net.opengis.xls.DistanceType)get_store().find_element_user(DISTANCE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "distance" element
     */
    public void setDistance(net.opengis.xls.DistanceType distance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.DistanceType target = null;
            target = (net.opengis.xls.DistanceType)get_store().find_element_user(DISTANCE$2, 0);
            if (target == null)
            {
                target = (net.opengis.xls.DistanceType)get_store().add_element_user(DISTANCE$2);
            }
            target.set(distance);
        }
    }
    
    /**
     * Appends and returns a new empty "distance" element
     */
    public net.opengis.xls.DistanceType addNewDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.DistanceType target = null;
            target = (net.opengis.xls.DistanceType)get_store().add_element_user(DISTANCE$2);
            return target;
        }
    }
    
    /**
     * Gets the "RouteInstructionGeometry" element
     */
    public net.opengis.xls.RouteGeometryType getRouteInstructionGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteGeometryType target = null;
            target = (net.opengis.xls.RouteGeometryType)get_store().find_element_user(ROUTEINSTRUCTIONGEOMETRY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "RouteInstructionGeometry" element
     */
    public boolean isSetRouteInstructionGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROUTEINSTRUCTIONGEOMETRY$4) != 0;
        }
    }
    
    /**
     * Sets the "RouteInstructionGeometry" element
     */
    public void setRouteInstructionGeometry(net.opengis.xls.RouteGeometryType routeInstructionGeometry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteGeometryType target = null;
            target = (net.opengis.xls.RouteGeometryType)get_store().find_element_user(ROUTEINSTRUCTIONGEOMETRY$4, 0);
            if (target == null)
            {
                target = (net.opengis.xls.RouteGeometryType)get_store().add_element_user(ROUTEINSTRUCTIONGEOMETRY$4);
            }
            target.set(routeInstructionGeometry);
        }
    }
    
    /**
     * Appends and returns a new empty "RouteInstructionGeometry" element
     */
    public net.opengis.xls.RouteGeometryType addNewRouteInstructionGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteGeometryType target = null;
            target = (net.opengis.xls.RouteGeometryType)get_store().add_element_user(ROUTEINSTRUCTIONGEOMETRY$4);
            return target;
        }
    }
    
    /**
     * Unsets the "RouteInstructionGeometry" element
     */
    public void unsetRouteInstructionGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROUTEINSTRUCTIONGEOMETRY$4, 0);
        }
    }
    
    /**
     * Gets the "BoundingBox" element
     */
    public net.opengis.gml.EnvelopeType getBoundingBox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EnvelopeType target = null;
            target = (net.opengis.gml.EnvelopeType)get_store().find_element_user(BOUNDINGBOX$6, 0);
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
            return get_store().count_elements(BOUNDINGBOX$6) != 0;
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
            target = (net.opengis.gml.EnvelopeType)get_store().find_element_user(BOUNDINGBOX$6, 0);
            if (target == null)
            {
                target = (net.opengis.gml.EnvelopeType)get_store().add_element_user(BOUNDINGBOX$6);
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
            target = (net.opengis.gml.EnvelopeType)get_store().add_element_user(BOUNDINGBOX$6);
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
            get_store().remove_element(BOUNDINGBOX$6, 0);
        }
    }
    
    /**
     * Gets the "duration" attribute
     */
    public org.apache.xmlbeans.GDuration getDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DURATION$8);
            if (target == null)
            {
                return null;
            }
            return target.getGDurationValue();
        }
    }
    
    /**
     * Gets (as xml) the "duration" attribute
     */
    public org.apache.xmlbeans.XmlDuration xgetDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDuration target = null;
            target = (org.apache.xmlbeans.XmlDuration)get_store().find_attribute_user(DURATION$8);
            return target;
        }
    }
    
    /**
     * Sets the "duration" attribute
     */
    public void setDuration(org.apache.xmlbeans.GDuration duration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DURATION$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DURATION$8);
            }
            target.setGDurationValue(duration);
        }
    }
    
    /**
     * Sets (as xml) the "duration" attribute
     */
    public void xsetDuration(org.apache.xmlbeans.XmlDuration duration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDuration target = null;
            target = (org.apache.xmlbeans.XmlDuration)get_store().find_attribute_user(DURATION$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDuration)get_store().add_attribute_user(DURATION$8);
            }
            target.set(duration);
        }
    }
    
    /**
     * Gets the "description" attribute
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "description" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$10);
            return target;
        }
    }
    
    /**
     * True if has "description" attribute
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DESCRIPTION$10) != null;
        }
    }
    
    /**
     * Sets the "description" attribute
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESCRIPTION$10);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "description" attribute
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESCRIPTION$10);
            }
            target.set(description);
        }
    }
    
    /**
     * Unsets the "description" attribute
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DESCRIPTION$10);
        }
    }
}
