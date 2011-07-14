/*
 * An XML document type.
 * Localname: NACE
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.NACEDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one NACE(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class NACEDocumentImpl extends net.opengis.xls.impl.NamedReferenceSystemDocumentImpl implements net.opengis.xls.NACEDocument
{
    private static final long serialVersionUID = 1L;
    
    public NACEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NACE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "NACE");
    
    
    /**
     * Gets the "NACE" element
     */
    public net.opengis.xls.NACEType getNACE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.NACEType target = null;
            target = (net.opengis.xls.NACEType)get_store().find_element_user(NACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "NACE" element
     */
    public void setNACE(net.opengis.xls.NACEType nace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.NACEType target = null;
            target = (net.opengis.xls.NACEType)get_store().find_element_user(NACE$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.NACEType)get_store().add_element_user(NACE$0);
            }
            target.set(nace);
        }
    }
    
    /**
     * Appends and returns a new empty "NACE" element
     */
    public net.opengis.xls.NACEType addNewNACE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.NACEType target = null;
            target = (net.opengis.xls.NACEType)get_store().add_element_user(NACE$0);
            return target;
        }
    }
}
