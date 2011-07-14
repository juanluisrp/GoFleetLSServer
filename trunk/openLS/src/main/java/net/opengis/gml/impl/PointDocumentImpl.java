/*
 * An XML document type.
 * Localname: Point
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.PointDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl;
/**
 * A document containing one Point(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class PointDocumentImpl extends net.opengis.gml.impl.GeometricPrimitiveDocumentImpl implements net.opengis.gml.PointDocument
{
    private static final long serialVersionUID = 1L;
    
    public PointDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POINT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Point");
    
    
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
}
