/*
 * An XML document type.
 * Localname: Request
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.RequestDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one Request(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class RequestDocumentImpl extends net.opengis.xls.impl.BodyDocumentImpl implements net.opengis.xls.RequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public RequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQUEST$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Request");
    
    
    /**
     * Gets the "Request" element
     */
    public net.opengis.xls.RequestType getRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RequestType target = null;
            target = (net.opengis.xls.RequestType)get_store().find_element_user(REQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Request" element
     */
    public void setRequest(net.opengis.xls.RequestType request)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RequestType target = null;
            target = (net.opengis.xls.RequestType)get_store().find_element_user(REQUEST$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.RequestType)get_store().add_element_user(REQUEST$0);
            }
            target.set(request);
        }
    }
    
    /**
     * Appends and returns a new empty "Request" element
     */
    public net.opengis.xls.RequestType addNewRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RequestType target = null;
            target = (net.opengis.xls.RequestType)get_store().add_element_user(REQUEST$0);
            return target;
        }
    }
}
