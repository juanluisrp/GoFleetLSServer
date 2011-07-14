/*
 * An XML document type.
 * Localname: Body
 * Namespace: http://schemas.xmlsoap.org/soap/envelope/
 * Java type: org.xmlsoap.schemas.soap.envelope.BodyDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.soap.envelope.impl;
/**
 * A document containing one Body(@http://schemas.xmlsoap.org/soap/envelope/) element.
 *
 * This is a complex type.
 */
public class BodyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.soap.envelope.BodyDocument
{
    private static final long serialVersionUID = 1L;
    
    public BodyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BODY$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/envelope/", "Body");
    
    
    /**
     * Gets the "Body" element
     */
    public org.xmlsoap.schemas.soap.envelope.Body getBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.envelope.Body target = null;
            target = (org.xmlsoap.schemas.soap.envelope.Body)get_store().find_element_user(BODY$0, 0);
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
            target = (org.xmlsoap.schemas.soap.envelope.Body)get_store().find_element_user(BODY$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.envelope.Body)get_store().add_element_user(BODY$0);
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
            target = (org.xmlsoap.schemas.soap.envelope.Body)get_store().add_element_user(BODY$0);
            return target;
        }
    }
}
