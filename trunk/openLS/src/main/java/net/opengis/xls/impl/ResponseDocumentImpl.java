/*
 * An XML document type.
 * Localname: Response
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.ResponseDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one Response(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class ResponseDocumentImpl extends net.opengis.xls.impl.BodyDocumentImpl implements net.opengis.xls.ResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Response");
    
    
    /**
     * Gets the "Response" element
     */
    public net.opengis.xls.ResponseType getResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ResponseType target = null;
            target = (net.opengis.xls.ResponseType)get_store().find_element_user(RESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Response" element
     */
    public void setResponse(net.opengis.xls.ResponseType response)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ResponseType target = null;
            target = (net.opengis.xls.ResponseType)get_store().find_element_user(RESPONSE$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.ResponseType)get_store().add_element_user(RESPONSE$0);
            }
            target.set(response);
        }
    }
    
    /**
     * Appends and returns a new empty "Response" element
     */
    public net.opengis.xls.ResponseType addNewResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ResponseType target = null;
            target = (net.opengis.xls.ResponseType)get_store().add_element_user(RESPONSE$0);
            return target;
        }
    }
}
