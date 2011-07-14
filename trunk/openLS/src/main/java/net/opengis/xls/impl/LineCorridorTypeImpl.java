/*
 * XML Type:  LineCorridorType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.LineCorridorType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML LineCorridorType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class LineCorridorTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.LineCorridorType
{
    private static final long serialVersionUID = 1L;
    
    public LineCorridorTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINESTRING$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "LineString");
    private static final javax.xml.namespace.QName DISTANCE$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Distance");
    
    
    /**
     * Gets the "LineString" element
     */
    public net.opengis.gml.LineStringType getLineString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LineStringType target = null;
            target = (net.opengis.gml.LineStringType)get_store().find_element_user(LINESTRING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LineString" element
     */
    public void setLineString(net.opengis.gml.LineStringType lineString)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LineStringType target = null;
            target = (net.opengis.gml.LineStringType)get_store().find_element_user(LINESTRING$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.LineStringType)get_store().add_element_user(LINESTRING$0);
            }
            target.set(lineString);
        }
    }
    
    /**
     * Appends and returns a new empty "LineString" element
     */
    public net.opengis.gml.LineStringType addNewLineString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LineStringType target = null;
            target = (net.opengis.gml.LineStringType)get_store().add_element_user(LINESTRING$0);
            return target;
        }
    }
    
    /**
     * Gets the "Distance" element
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
     * Sets the "Distance" element
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
     * Appends and returns a new empty "Distance" element
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
}
