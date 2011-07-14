/*
 * An XML document type.
 * Localname: _Ring
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.RingDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl;
/**
 * A document containing one _Ring(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class RingDocumentImpl extends net.opengis.gml.impl.GeometryDocumentImpl implements net.opengis.gml.RingDocument
{
    private static final long serialVersionUID = 1L;
    
    public RingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RING$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Ring");
    private static final org.apache.xmlbeans.QNameSet RING$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "LinearRing"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Ring"),
    });
    
    
    /**
     * Gets the "_Ring" element
     */
    public net.opengis.gml.AbstractRingType getRing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractRingType target = null;
            target = (net.opengis.gml.AbstractRingType)get_store().find_element_user(RING$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_Ring" element
     */
    public void setRing(net.opengis.gml.AbstractRingType ring)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractRingType target = null;
            target = (net.opengis.gml.AbstractRingType)get_store().find_element_user(RING$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractRingType)get_store().add_element_user(RING$0);
            }
            target.set(ring);
        }
    }
    
    /**
     * Appends and returns a new empty "_Ring" element
     */
    public net.opengis.gml.AbstractRingType addNewRing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractRingType target = null;
            target = (net.opengis.gml.AbstractRingType)get_store().add_element_user(RING$0);
            return target;
        }
    }
}
