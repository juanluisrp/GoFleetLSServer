/*
 * An XML document type.
 * Localname: XLS
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.XLSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one XLS(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class XLSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.XLSDocument
{
    private static final long serialVersionUID = 1L;
    
    public XLSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName XLS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "XLS");
    
    
    /**
     * Gets the "XLS" element
     */
    public net.opengis.xls.XLSType getXLS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.XLSType target = null;
            target = (net.opengis.xls.XLSType)get_store().find_element_user(XLS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "XLS" element
     */
    public void setXLS(net.opengis.xls.XLSType xls)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.XLSType target = null;
            target = (net.opengis.xls.XLSType)get_store().find_element_user(XLS$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.XLSType)get_store().add_element_user(XLS$0);
            }
            target.set(xls);
        }
    }
    
    /**
     * Appends and returns a new empty "XLS" element
     */
    public net.opengis.xls.XLSType addNewXLS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.XLSType target = null;
            target = (net.opengis.xls.XLSType)get_store().add_element_user(XLS$0);
            return target;
        }
    }
}
