/*
 * An XML document type.
 * Localname: DirectoryResponse
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.DirectoryResponseDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one DirectoryResponse(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class DirectoryResponseDocumentImpl extends net.opengis.xls.impl.ResponseParametersDocumentImpl implements net.opengis.xls.DirectoryResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public DirectoryResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIRECTORYRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "DirectoryResponse");
    
    
    /**
     * Gets the "DirectoryResponse" element
     */
    public net.opengis.xls.DirectoryResponseType getDirectoryResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.DirectoryResponseType target = null;
            target = (net.opengis.xls.DirectoryResponseType)get_store().find_element_user(DIRECTORYRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DirectoryResponse" element
     */
    public void setDirectoryResponse(net.opengis.xls.DirectoryResponseType directoryResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.DirectoryResponseType target = null;
            target = (net.opengis.xls.DirectoryResponseType)get_store().find_element_user(DIRECTORYRESPONSE$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.DirectoryResponseType)get_store().add_element_user(DIRECTORYRESPONSE$0);
            }
            target.set(directoryResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "DirectoryResponse" element
     */
    public net.opengis.xls.DirectoryResponseType addNewDirectoryResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.DirectoryResponseType target = null;
            target = (net.opengis.xls.DirectoryResponseType)get_store().add_element_user(DIRECTORYRESPONSE$0);
            return target;
        }
    }
}
