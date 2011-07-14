/*
 * An XML document type.
 * Localname: _Surface
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.SurfaceDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl;
/**
 * A document containing one _Surface(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class SurfaceDocumentImpl extends net.opengis.gml.impl.GeometricPrimitiveDocumentImpl implements net.opengis.gml.SurfaceDocument
{
    private static final long serialVersionUID = 1L;
    
    public SurfaceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SURFACE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Surface");
    private static final org.apache.xmlbeans.QNameSet SURFACE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Surface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Polygon"),
    });
    
    
    /**
     * Gets the "_Surface" element
     */
    public net.opengis.gml.AbstractSurfaceType getSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractSurfaceType target = null;
            target = (net.opengis.gml.AbstractSurfaceType)get_store().find_element_user(SURFACE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_Surface" element
     */
    public void setSurface(net.opengis.gml.AbstractSurfaceType surface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractSurfaceType target = null;
            target = (net.opengis.gml.AbstractSurfaceType)get_store().find_element_user(SURFACE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractSurfaceType)get_store().add_element_user(SURFACE$0);
            }
            target.set(surface);
        }
    }
    
    /**
     * Appends and returns a new empty "_Surface" element
     */
    public net.opengis.gml.AbstractSurfaceType addNewSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractSurfaceType target = null;
            target = (net.opengis.gml.AbstractSurfaceType)get_store().add_element_user(SURFACE$0);
            return target;
        }
    }
}
