/*
 * An XML document type.
 * Localname: NAICS
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.NAICSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one NAICS(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class NAICSDocumentImpl extends net.opengis.xls.impl.NamedReferenceSystemDocumentImpl implements net.opengis.xls.NAICSDocument
{
    private static final long serialVersionUID = 1L;
    
    public NAICSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAICS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "NAICS");
    
    
    /**
     * Gets the "NAICS" element
     */
    public net.opengis.xls.NAICSType getNAICS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.NAICSType target = null;
            target = (net.opengis.xls.NAICSType)get_store().find_element_user(NAICS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "NAICS" element
     */
    public void setNAICS(net.opengis.xls.NAICSType naics)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.NAICSType target = null;
            target = (net.opengis.xls.NAICSType)get_store().find_element_user(NAICS$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.NAICSType)get_store().add_element_user(NAICS$0);
            }
            target.set(naics);
        }
    }
    
    /**
     * Appends and returns a new empty "NAICS" element
     */
    public net.opengis.xls.NAICSType addNewNAICS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.NAICSType target = null;
            target = (net.opengis.xls.NAICSType)get_store().add_element_user(NAICS$0);
            return target;
        }
    }
}
