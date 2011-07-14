/*
 * An XML document type.
 * Localname: _Geometry
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.GeometryDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl;
/**
 * A document containing one _Geometry(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class GeometryDocumentImpl extends net.opengis.gml.impl.GMLDocumentImpl implements net.opengis.gml.GeometryDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeometryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOMETRY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Geometry");
    private static final org.apache.xmlbeans.QNameSet GEOMETRY$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "LineString"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "LinearRing"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Geometry"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Curve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiPolygon"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Envelope"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeometricAggregate"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Point"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Surface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Polygon"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeometricPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Ring"),
    });
    
    
    /**
     * Gets the "_Geometry" element
     */
    public net.opengis.gml.AbstractGeometryType getGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeometryType target = null;
            target = (net.opengis.gml.AbstractGeometryType)get_store().find_element_user(GEOMETRY$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_Geometry" element
     */
    public void setGeometry(net.opengis.gml.AbstractGeometryType geometry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeometryType target = null;
            target = (net.opengis.gml.AbstractGeometryType)get_store().find_element_user(GEOMETRY$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractGeometryType)get_store().add_element_user(GEOMETRY$0);
            }
            target.set(geometry);
        }
    }
    
    /**
     * Appends and returns a new empty "_Geometry" element
     */
    public net.opengis.gml.AbstractGeometryType addNewGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeometryType target = null;
            target = (net.opengis.gml.AbstractGeometryType)get_store().add_element_user(GEOMETRY$0);
            return target;
        }
    }
}
