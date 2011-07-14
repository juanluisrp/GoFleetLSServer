/*
 * An XML document type.
 * Localname: _GeometricPrimitive
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.GeometricPrimitiveDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl;
/**
 * A document containing one _GeometricPrimitive(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class GeometricPrimitiveDocumentImpl extends net.opengis.gml.impl.GeometryDocumentImpl implements net.opengis.gml.GeometricPrimitiveDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeometricPrimitiveDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOMETRICPRIMITIVE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeometricPrimitive");
    private static final org.apache.xmlbeans.QNameSet GEOMETRICPRIMITIVE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "LineString"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Point"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Curve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Surface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Polygon"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeometricPrimitive"),
    });
    
    
    /**
     * Gets the "_GeometricPrimitive" element
     */
    public net.opengis.gml.AbstractGeometricPrimitiveType getGeometricPrimitive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeometricPrimitiveType target = null;
            target = (net.opengis.gml.AbstractGeometricPrimitiveType)get_store().find_element_user(GEOMETRICPRIMITIVE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_GeometricPrimitive" element
     */
    public void setGeometricPrimitive(net.opengis.gml.AbstractGeometricPrimitiveType geometricPrimitive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeometricPrimitiveType target = null;
            target = (net.opengis.gml.AbstractGeometricPrimitiveType)get_store().find_element_user(GEOMETRICPRIMITIVE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractGeometricPrimitiveType)get_store().add_element_user(GEOMETRICPRIMITIVE$0);
            }
            target.set(geometricPrimitive);
        }
    }
    
    /**
     * Appends and returns a new empty "_GeometricPrimitive" element
     */
    public net.opengis.gml.AbstractGeometricPrimitiveType addNewGeometricPrimitive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeometricPrimitiveType target = null;
            target = (net.opengis.gml.AbstractGeometricPrimitiveType)get_store().add_element_user(GEOMETRICPRIMITIVE$0);
            return target;
        }
    }
}
