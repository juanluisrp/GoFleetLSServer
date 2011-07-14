/*
 * An XML document type.
 * Localname: ResponseHeader
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.ResponseHeaderDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one ResponseHeader(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class ResponseHeaderDocumentImpl extends net.opengis.xls.impl.HeaderDocumentImpl implements net.opengis.xls.ResponseHeaderDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResponseHeaderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESPONSEHEADER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "ResponseHeader");
    
    
    /**
     * Gets the "ResponseHeader" element
     */
    public net.opengis.xls.ResponseHeaderType getResponseHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ResponseHeaderType target = null;
            target = (net.opengis.xls.ResponseHeaderType)get_store().find_element_user(RESPONSEHEADER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ResponseHeader" element
     */
    public void setResponseHeader(net.opengis.xls.ResponseHeaderType responseHeader)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ResponseHeaderType target = null;
            target = (net.opengis.xls.ResponseHeaderType)get_store().find_element_user(RESPONSEHEADER$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.ResponseHeaderType)get_store().add_element_user(RESPONSEHEADER$0);
            }
            target.set(responseHeader);
        }
    }
    
    /**
     * Appends and returns a new empty "ResponseHeader" element
     */
    public net.opengis.xls.ResponseHeaderType addNewResponseHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ResponseHeaderType target = null;
            target = (net.opengis.xls.ResponseHeaderType)get_store().add_element_user(RESPONSEHEADER$0);
            return target;
        }
    }
}
