/*
 * XML Type:  Envelope
 * Namespace: http://schemas.xmlsoap.org/soap/envelope/
 * Java type: org.xmlsoap.schemas.soap.envelope.Envelope
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.soap.envelope.impl;
/**
 * An XML Envelope(@http://schemas.xmlsoap.org/soap/envelope/).
 *
 * This is a complex type.
 */
public class EnvelopeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.soap.envelope.Envelope
{
    private static final long serialVersionUID = 1L;
    
    public EnvelopeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HEADER$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/envelope/", "Header");
    private static final javax.xml.namespace.QName BODY$2 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/envelope/", "Body");
    
    
    /**
     * Gets the "Header" element
     */
    public org.xmlsoap.schemas.soap.envelope.Header getHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.envelope.Header target = null;
            target = (org.xmlsoap.schemas.soap.envelope.Header)get_store().find_element_user(HEADER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Header" element
     */
    public boolean isSetHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HEADER$0) != 0;
        }
    }
    
    /**
     * Sets the "Header" element
     */
    public void setHeader(org.xmlsoap.schemas.soap.envelope.Header header)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.envelope.Header target = null;
            target = (org.xmlsoap.schemas.soap.envelope.Header)get_store().find_element_user(HEADER$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.envelope.Header)get_store().add_element_user(HEADER$0);
            }
            target.set(header);
        }
    }
    
    /**
     * Appends and returns a new empty "Header" element
     */
    public org.xmlsoap.schemas.soap.envelope.Header addNewHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.envelope.Header target = null;
            target = (org.xmlsoap.schemas.soap.envelope.Header)get_store().add_element_user(HEADER$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Header" element
     */
    public void unsetHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HEADER$0, 0);
        }
    }
    
    /**
     * Gets the "Body" element
     */
    public org.xmlsoap.schemas.soap.envelope.Body getBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.envelope.Body target = null;
            target = (org.xmlsoap.schemas.soap.envelope.Body)get_store().find_element_user(BODY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Body" element
     */
    public void setBody(org.xmlsoap.schemas.soap.envelope.Body body)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.envelope.Body target = null;
            target = (org.xmlsoap.schemas.soap.envelope.Body)get_store().find_element_user(BODY$2, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.envelope.Body)get_store().add_element_user(BODY$2);
            }
            target.set(body);
        }
    }
    
    /**
     * Appends and returns a new empty "Body" element
     */
    public org.xmlsoap.schemas.soap.envelope.Body addNewBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.envelope.Body target = null;
            target = (org.xmlsoap.schemas.soap.envelope.Body)get_store().add_element_user(BODY$2);
            return target;
        }
    }
}
