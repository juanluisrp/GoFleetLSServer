/*
 * An XML document type.
 * Localname: PortrayMapRequest
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.PortrayMapRequestDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one PortrayMapRequest(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class PortrayMapRequestDocumentImpl extends net.opengis.xls.impl.RequestParametersDocumentImpl implements net.opengis.xls.PortrayMapRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public PortrayMapRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PORTRAYMAPREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "PortrayMapRequest");
    
    
    /**
     * Gets the "PortrayMapRequest" element
     */
    public net.opengis.xls.PortrayMapRequestType getPortrayMapRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.PortrayMapRequestType target = null;
            target = (net.opengis.xls.PortrayMapRequestType)get_store().find_element_user(PORTRAYMAPREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PortrayMapRequest" element
     */
    public void setPortrayMapRequest(net.opengis.xls.PortrayMapRequestType portrayMapRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.PortrayMapRequestType target = null;
            target = (net.opengis.xls.PortrayMapRequestType)get_store().find_element_user(PORTRAYMAPREQUEST$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.PortrayMapRequestType)get_store().add_element_user(PORTRAYMAPREQUEST$0);
            }
            target.set(portrayMapRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "PortrayMapRequest" element
     */
    public net.opengis.xls.PortrayMapRequestType addNewPortrayMapRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.PortrayMapRequestType target = null;
            target = (net.opengis.xls.PortrayMapRequestType)get_store().add_element_user(PORTRAYMAPREQUEST$0);
            return target;
        }
    }
}
