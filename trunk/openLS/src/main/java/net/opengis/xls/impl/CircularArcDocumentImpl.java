/*
 * An XML document type.
 * Localname: CircularArc
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.CircularArcDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one CircularArc(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class CircularArcDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.CircularArcDocument
{
    private static final long serialVersionUID = 1L;
    
    public CircularArcDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CIRCULARARC$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "CircularArc");
    
    
    /**
     * Gets the "CircularArc" element
     */
    public net.opengis.xls.CircularArcType getCircularArc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.CircularArcType target = null;
            target = (net.opengis.xls.CircularArcType)get_store().find_element_user(CIRCULARARC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CircularArc" element
     */
    public void setCircularArc(net.opengis.xls.CircularArcType circularArc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.CircularArcType target = null;
            target = (net.opengis.xls.CircularArcType)get_store().find_element_user(CIRCULARARC$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.CircularArcType)get_store().add_element_user(CIRCULARARC$0);
            }
            target.set(circularArc);
        }
    }
    
    /**
     * Appends and returns a new empty "CircularArc" element
     */
    public net.opengis.xls.CircularArcType addNewCircularArc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.CircularArcType target = null;
            target = (net.opengis.xls.CircularArcType)get_store().add_element_user(CIRCULARARC$0);
            return target;
        }
    }
}
