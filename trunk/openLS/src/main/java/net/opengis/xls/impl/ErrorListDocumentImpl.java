/*
 * An XML document type.
 * Localname: ErrorList
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.ErrorListDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one ErrorList(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class ErrorListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.ErrorListDocument
{
    private static final long serialVersionUID = 1L;
    
    public ErrorListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERRORLIST$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "ErrorList");
    
    
    /**
     * Gets the "ErrorList" element
     */
    public net.opengis.xls.ErrorListType getErrorList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ErrorListType target = null;
            target = (net.opengis.xls.ErrorListType)get_store().find_element_user(ERRORLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ErrorList" element
     */
    public void setErrorList(net.opengis.xls.ErrorListType errorList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ErrorListType target = null;
            target = (net.opengis.xls.ErrorListType)get_store().find_element_user(ERRORLIST$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.ErrorListType)get_store().add_element_user(ERRORLIST$0);
            }
            target.set(errorList);
        }
    }
    
    /**
     * Appends and returns a new empty "ErrorList" element
     */
    public net.opengis.xls.ErrorListType addNewErrorList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ErrorListType target = null;
            target = (net.opengis.xls.ErrorListType)get_store().add_element_user(ERRORLIST$0);
            return target;
        }
    }
}
