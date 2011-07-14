/*
 * An XML document type.
 * Localname: RequestHeader
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.RequestHeaderDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one RequestHeader(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class RequestHeaderDocumentImpl extends net.opengis.xls.impl.HeaderDocumentImpl implements net.opengis.xls.RequestHeaderDocument
{
    private static final long serialVersionUID = 1L;
    
    public RequestHeaderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQUESTHEADER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "RequestHeader");
    
    
    /**
     * Gets the "RequestHeader" element
     */
    public net.opengis.xls.RequestHeaderType getRequestHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RequestHeaderType target = null;
            target = (net.opengis.xls.RequestHeaderType)get_store().find_element_user(REQUESTHEADER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RequestHeader" element
     */
    public void setRequestHeader(net.opengis.xls.RequestHeaderType requestHeader)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RequestHeaderType target = null;
            target = (net.opengis.xls.RequestHeaderType)get_store().find_element_user(REQUESTHEADER$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.RequestHeaderType)get_store().add_element_user(REQUESTHEADER$0);
            }
            target.set(requestHeader);
        }
    }
    
    /**
     * Appends and returns a new empty "RequestHeader" element
     */
    public net.opengis.xls.RequestHeaderType addNewRequestHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RequestHeaderType target = null;
            target = (net.opengis.xls.RequestHeaderType)get_store().add_element_user(REQUESTHEADER$0);
            return target;
        }
    }
}
