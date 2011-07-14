/*
 * An XML document type.
 * Localname: _Header
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.HeaderDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one _Header(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class HeaderDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.HeaderDocument
{
    private static final long serialVersionUID = 1L;
    
    public HeaderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HEADER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_Header");
    private static final org.apache.xmlbeans.QNameSet HEADER$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_Header"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "RequestHeader"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "ResponseHeader"),
    });
    
    
    /**
     * Gets the "_Header" element
     */
    public net.opengis.xls.AbstractHeaderType getHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractHeaderType target = null;
            target = (net.opengis.xls.AbstractHeaderType)get_store().find_element_user(HEADER$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_Header" element
     */
    public void setHeader(net.opengis.xls.AbstractHeaderType header)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractHeaderType target = null;
            target = (net.opengis.xls.AbstractHeaderType)get_store().find_element_user(HEADER$1, 0);
            if (target == null)
            {
                target = (net.opengis.xls.AbstractHeaderType)get_store().add_element_user(HEADER$0);
            }
            target.set(header);
        }
    }
    
    /**
     * Appends and returns a new empty "_Header" element
     */
    public net.opengis.xls.AbstractHeaderType addNewHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractHeaderType target = null;
            target = (net.opengis.xls.AbstractHeaderType)get_store().add_element_user(HEADER$0);
            return target;
        }
    }
}
