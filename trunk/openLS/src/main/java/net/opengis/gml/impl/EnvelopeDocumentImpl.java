/*
 * An XML document type.
 * Localname: Envelope
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.EnvelopeDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl;
/**
 * A document containing one Envelope(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class EnvelopeDocumentImpl extends net.opengis.gml.impl.GeometryDocumentImpl implements net.opengis.gml.EnvelopeDocument
{
    private static final long serialVersionUID = 1L;
    
    public EnvelopeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENVELOPE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Envelope");
    
    
    /**
     * Gets the "Envelope" element
     */
    public net.opengis.gml.EnvelopeType getEnvelope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EnvelopeType target = null;
            target = (net.opengis.gml.EnvelopeType)get_store().find_element_user(ENVELOPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Envelope" element
     */
    public void setEnvelope(net.opengis.gml.EnvelopeType envelope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EnvelopeType target = null;
            target = (net.opengis.gml.EnvelopeType)get_store().find_element_user(ENVELOPE$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.EnvelopeType)get_store().add_element_user(ENVELOPE$0);
            }
            target.set(envelope);
        }
    }
    
    /**
     * Appends and returns a new empty "Envelope" element
     */
    public net.opengis.gml.EnvelopeType addNewEnvelope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EnvelopeType target = null;
            target = (net.opengis.gml.EnvelopeType)get_store().add_element_user(ENVELOPE$0);
            return target;
        }
    }
}
