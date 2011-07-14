/*
 * An XML document type.
 * Localname: DirectoryRequest
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.DirectoryRequestDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one DirectoryRequest(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class DirectoryRequestDocumentImpl extends net.opengis.xls.impl.RequestParametersDocumentImpl implements net.opengis.xls.DirectoryRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public DirectoryRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIRECTORYREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "DirectoryRequest");
    
    
    /**
     * Gets the "DirectoryRequest" element
     */
    public net.opengis.xls.DirectoryRequestType getDirectoryRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.DirectoryRequestType target = null;
            target = (net.opengis.xls.DirectoryRequestType)get_store().find_element_user(DIRECTORYREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DirectoryRequest" element
     */
    public void setDirectoryRequest(net.opengis.xls.DirectoryRequestType directoryRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.DirectoryRequestType target = null;
            target = (net.opengis.xls.DirectoryRequestType)get_store().find_element_user(DIRECTORYREQUEST$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.DirectoryRequestType)get_store().add_element_user(DIRECTORYREQUEST$0);
            }
            target.set(directoryRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "DirectoryRequest" element
     */
    public net.opengis.xls.DirectoryRequestType addNewDirectoryRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.DirectoryRequestType target = null;
            target = (net.opengis.xls.DirectoryRequestType)get_store().add_element_user(DIRECTORYREQUEST$0);
            return target;
        }
    }
}
