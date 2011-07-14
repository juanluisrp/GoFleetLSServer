/*
 * An XML document type.
 * Localname: Ellipse
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.EllipseDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one Ellipse(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class EllipseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.EllipseDocument
{
    private static final long serialVersionUID = 1L;
    
    public EllipseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ELLIPSE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Ellipse");
    
    
    /**
     * Gets the "Ellipse" element
     */
    public net.opengis.xls.EllipseType getEllipse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.EllipseType target = null;
            target = (net.opengis.xls.EllipseType)get_store().find_element_user(ELLIPSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Ellipse" element
     */
    public void setEllipse(net.opengis.xls.EllipseType ellipse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.EllipseType target = null;
            target = (net.opengis.xls.EllipseType)get_store().find_element_user(ELLIPSE$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.EllipseType)get_store().add_element_user(ELLIPSE$0);
            }
            target.set(ellipse);
        }
    }
    
    /**
     * Appends and returns a new empty "Ellipse" element
     */
    public net.opengis.xls.EllipseType addNewEllipse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.EllipseType target = null;
            target = (net.opengis.xls.EllipseType)get_store().add_element_user(ELLIPSE$0);
            return target;
        }
    }
}
