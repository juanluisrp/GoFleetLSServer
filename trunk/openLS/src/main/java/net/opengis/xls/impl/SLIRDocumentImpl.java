/*
 * An XML document type.
 * Localname: SLIR
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.SLIRDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one SLIR(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class SLIRDocumentImpl extends net.opengis.xls.impl.RequestParametersDocumentImpl implements net.opengis.xls.SLIRDocument
{
    private static final long serialVersionUID = 1L;
    
    public SLIRDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SLIR$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "SLIR");
    
    
    /**
     * Gets the "SLIR" element
     */
    public net.opengis.xls.SLIRType getSLIR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.SLIRType target = null;
            target = (net.opengis.xls.SLIRType)get_store().find_element_user(SLIR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SLIR" element
     */
    public void setSLIR(net.opengis.xls.SLIRType slir)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.SLIRType target = null;
            target = (net.opengis.xls.SLIRType)get_store().find_element_user(SLIR$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.SLIRType)get_store().add_element_user(SLIR$0);
            }
            target.set(slir);
        }
    }
    
    /**
     * Appends and returns a new empty "SLIR" element
     */
    public net.opengis.xls.SLIRType addNewSLIR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.SLIRType target = null;
            target = (net.opengis.xls.SLIRType)get_store().add_element_user(SLIR$0);
            return target;
        }
    }
}
