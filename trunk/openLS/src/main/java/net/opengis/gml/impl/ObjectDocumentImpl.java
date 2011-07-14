/*
 * An XML document type.
 * Localname: _Object
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ObjectDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl;
/**
 * A document containing one _Object(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ObjectDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.ObjectDocument
{
    private static final long serialVersionUID = 1L;
    
    public ObjectDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBJECT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Object");
    private static final org.apache.xmlbeans.QNameSet OBJECT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "LinearRing"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "LineString"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Geometry"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Curve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiPolygon"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Object"),
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
     * Gets the "_Object" element
     */
    public org.apache.xmlbeans.XmlObject getObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(OBJECT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_Object" element
     */
    public void setObject(org.apache.xmlbeans.XmlObject object)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(OBJECT$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(OBJECT$0);
            }
            target.set(object);
        }
    }
    
    /**
     * Appends and returns a new empty "_Object" element
     */
    public org.apache.xmlbeans.XmlObject addNewObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(OBJECT$0);
            return target;
        }
    }
}
