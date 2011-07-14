/*
 * An XML document type.
 * Localname: _GML
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.GMLDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl;
/**
 * A document containing one _GML(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class GMLDocumentImpl extends net.opengis.gml.impl.ObjectDocumentImpl implements net.opengis.gml.GMLDocument
{
    private static final long serialVersionUID = 1L;
    
    public GMLDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GML$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GML");
    private static final org.apache.xmlbeans.QNameSet GML$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "LinearRing"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "LineString"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Geometry"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Curve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiPolygon"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Envelope"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeometricAggregate"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GML"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Point"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Surface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Polygon"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeometricPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Ring"),
    });
    
    
    /**
     * Gets the "_GML" element
     */
    public net.opengis.gml.AbstractGMLType getGML()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGMLType target = null;
            target = (net.opengis.gml.AbstractGMLType)get_store().find_element_user(GML$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_GML" element
     */
    public void setGML(net.opengis.gml.AbstractGMLType gml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGMLType target = null;
            target = (net.opengis.gml.AbstractGMLType)get_store().find_element_user(GML$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractGMLType)get_store().add_element_user(GML$0);
            }
            target.set(gml);
        }
    }
    
    /**
     * Appends and returns a new empty "_GML" element
     */
    public net.opengis.gml.AbstractGMLType addNewGML()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGMLType target = null;
            target = (net.opengis.gml.AbstractGMLType)get_store().add_element_user(GML$0);
            return target;
        }
    }
}
