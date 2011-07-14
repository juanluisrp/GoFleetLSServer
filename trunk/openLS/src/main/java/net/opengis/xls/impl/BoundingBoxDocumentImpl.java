/*
 * An XML document type.
 * Localname: BoundingBox
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.BoundingBoxDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one BoundingBox(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class BoundingBoxDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.BoundingBoxDocument
{
    private static final long serialVersionUID = 1L;
    
    public BoundingBoxDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BOUNDINGBOX$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "BoundingBox");
    
    
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
}
