/*
 * An XML document type.
 * Localname: SLIA
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.SLIADocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one SLIA(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class SLIADocumentImpl extends net.opengis.xls.impl.ResponseParametersDocumentImpl implements net.opengis.xls.SLIADocument
{
    private static final long serialVersionUID = 1L;
    
    public SLIADocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SLIA$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "SLIA");
    
    
    /**
     * Gets the "SLIA" element
     */
    public net.opengis.xls.SLIAType getSLIA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.SLIAType target = null;
            target = (net.opengis.xls.SLIAType)get_store().find_element_user(SLIA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SLIA" element
     */
    public void setSLIA(net.opengis.xls.SLIAType slia)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.SLIAType target = null;
            target = (net.opengis.xls.SLIAType)get_store().find_element_user(SLIA$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.SLIAType)get_store().add_element_user(SLIA$0);
            }
            target.set(slia);
        }
    }
    
    /**
     * Appends and returns a new empty "SLIA" element
     */
    public net.opengis.xls.SLIAType addNewSLIA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.SLIAType target = null;
            target = (net.opengis.xls.SLIAType)get_store().add_element_user(SLIA$0);
            return target;
        }
    }
}
