/*
 * An XML document type.
 * Localname: Fault
 * Namespace: http://schemas.xmlsoap.org/soap/envelope/
 * Java type: org.xmlsoap.schemas.soap.envelope.FaultDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.soap.envelope.impl;
/**
 * A document containing one Fault(@http://schemas.xmlsoap.org/soap/envelope/) element.
 *
 * This is a complex type.
 */
public class FaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.soap.envelope.FaultDocument
{
    private static final long serialVersionUID = 1L;
    
    public FaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FAULT$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/envelope/", "Fault");
    
    
    /**
     * Gets the "Fault" element
     */
    public org.xmlsoap.schemas.soap.envelope.Fault getFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.envelope.Fault target = null;
            target = (org.xmlsoap.schemas.soap.envelope.Fault)get_store().find_element_user(FAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Fault" element
     */
    public void setFault(org.xmlsoap.schemas.soap.envelope.Fault fault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.envelope.Fault target = null;
            target = (org.xmlsoap.schemas.soap.envelope.Fault)get_store().find_element_user(FAULT$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.envelope.Fault)get_store().add_element_user(FAULT$0);
            }
            target.set(fault);
        }
    }
    
    /**
     * Appends and returns a new empty "Fault" element
     */
    public org.xmlsoap.schemas.soap.envelope.Fault addNewFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.envelope.Fault target = null;
            target = (org.xmlsoap.schemas.soap.envelope.Fault)get_store().add_element_user(FAULT$0);
            return target;
        }
    }
}
