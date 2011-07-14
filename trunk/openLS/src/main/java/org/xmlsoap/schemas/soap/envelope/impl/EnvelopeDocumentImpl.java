/*
 * An XML document type.
 * Localname: Envelope
 * Namespace: http://schemas.xmlsoap.org/soap/envelope/
 * Java type: org.xmlsoap.schemas.soap.envelope.EnvelopeDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.soap.envelope.impl;
/**
 * A document containing one Envelope(@http://schemas.xmlsoap.org/soap/envelope/) element.
 *
 * This is a complex type.
 */
public class EnvelopeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.soap.envelope.EnvelopeDocument
{
    private static final long serialVersionUID = 1L;
    
    public EnvelopeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENVELOPE$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/envelope/", "Envelope");
    
    
    /**
     * Gets the "Envelope" element
     */
    public org.xmlsoap.schemas.soap.envelope.Envelope getEnvelope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.envelope.Envelope target = null;
            target = (org.xmlsoap.schemas.soap.envelope.Envelope)get_store().find_element_user(ENVELOPE$0, 0);
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
    public void setEnvelope(org.xmlsoap.schemas.soap.envelope.Envelope envelope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.envelope.Envelope target = null;
            target = (org.xmlsoap.schemas.soap.envelope.Envelope)get_store().find_element_user(ENVELOPE$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.envelope.Envelope)get_store().add_element_user(ENVELOPE$0);
            }
            target.set(envelope);
        }
    }
    
    /**
     * Appends and returns a new empty "Envelope" element
     */
    public org.xmlsoap.schemas.soap.envelope.Envelope addNewEnvelope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.envelope.Envelope target = null;
            target = (org.xmlsoap.schemas.soap.envelope.Envelope)get_store().add_element_user(ENVELOPE$0);
            return target;
        }
    }
}
