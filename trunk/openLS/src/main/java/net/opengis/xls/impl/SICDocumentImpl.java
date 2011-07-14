/*
 * An XML document type.
 * Localname: SIC
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.SICDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one SIC(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class SICDocumentImpl extends net.opengis.xls.impl.NamedReferenceSystemDocumentImpl implements net.opengis.xls.SICDocument
{
    private static final long serialVersionUID = 1L;
    
    public SICDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SIC$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "SIC");
    
    
    /**
     * Gets the "SIC" element
     */
    public net.opengis.xls.SICType getSIC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.SICType target = null;
            target = (net.opengis.xls.SICType)get_store().find_element_user(SIC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SIC" element
     */
    public void setSIC(net.opengis.xls.SICType sic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.SICType target = null;
            target = (net.opengis.xls.SICType)get_store().find_element_user(SIC$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.SICType)get_store().add_element_user(SIC$0);
            }
            target.set(sic);
        }
    }
    
    /**
     * Appends and returns a new empty "SIC" element
     */
    public net.opengis.xls.SICType addNewSIC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.SICType target = null;
            target = (net.opengis.xls.SICType)get_store().add_element_user(SIC$0);
            return target;
        }
    }
}
