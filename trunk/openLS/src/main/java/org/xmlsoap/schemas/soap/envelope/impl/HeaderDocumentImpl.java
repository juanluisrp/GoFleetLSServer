/*
 * An XML document type.
 * Localname: Header
 * Namespace: http://schemas.xmlsoap.org/soap/envelope/
 * Java type: org.xmlsoap.schemas.soap.envelope.HeaderDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.soap.envelope.impl;
/**
 * A document containing one Header(@http://schemas.xmlsoap.org/soap/envelope/) element.
 *
 * This is a complex type.
 */
public class HeaderDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.soap.envelope.HeaderDocument
{
    private static final long serialVersionUID = 1L;
    
    public HeaderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HEADER$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/envelope/", "Header");
    
    
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
}
