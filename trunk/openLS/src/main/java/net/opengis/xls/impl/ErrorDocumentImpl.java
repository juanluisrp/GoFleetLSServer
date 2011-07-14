/*
 * An XML document type.
 * Localname: Error
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.ErrorDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one Error(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class ErrorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.ErrorDocument
{
    private static final long serialVersionUID = 1L;
    
    public ErrorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERROR$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Error");
    
    
    /**
     * Gets the "Error" element
     */
    public net.opengis.xls.ErrorType getError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ErrorType target = null;
            target = (net.opengis.xls.ErrorType)get_store().find_element_user(ERROR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Error" element
     */
    public void setError(net.opengis.xls.ErrorType error)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ErrorType target = null;
            target = (net.opengis.xls.ErrorType)get_store().find_element_user(ERROR$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.ErrorType)get_store().add_element_user(ERROR$0);
            }
            target.set(error);
        }
    }
    
    /**
     * Appends and returns a new empty "Error" element
     */
    public net.opengis.xls.ErrorType addNewError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ErrorType target = null;
            target = (net.opengis.xls.ErrorType)get_store().add_element_user(ERROR$0);
            return target;
        }
    }
}
