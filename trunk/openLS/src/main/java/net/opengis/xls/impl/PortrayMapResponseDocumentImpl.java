/*
 * An XML document type.
 * Localname: PortrayMapResponse
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.PortrayMapResponseDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one PortrayMapResponse(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class PortrayMapResponseDocumentImpl extends net.opengis.xls.impl.ResponseParametersDocumentImpl implements net.opengis.xls.PortrayMapResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public PortrayMapResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PORTRAYMAPRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "PortrayMapResponse");
    
    
    /**
     * Gets the "PortrayMapResponse" element
     */
    public net.opengis.xls.PortrayMapResponseType getPortrayMapResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.PortrayMapResponseType target = null;
            target = (net.opengis.xls.PortrayMapResponseType)get_store().find_element_user(PORTRAYMAPRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PortrayMapResponse" element
     */
    public void setPortrayMapResponse(net.opengis.xls.PortrayMapResponseType portrayMapResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.PortrayMapResponseType target = null;
            target = (net.opengis.xls.PortrayMapResponseType)get_store().find_element_user(PORTRAYMAPRESPONSE$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.PortrayMapResponseType)get_store().add_element_user(PORTRAYMAPRESPONSE$0);
            }
            target.set(portrayMapResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "PortrayMapResponse" element
     */
    public net.opengis.xls.PortrayMapResponseType addNewPortrayMapResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.PortrayMapResponseType target = null;
            target = (net.opengis.xls.PortrayMapResponseType)get_store().add_element_user(PORTRAYMAPRESPONSE$0);
            return target;
        }
    }
}
