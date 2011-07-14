/*
 * An XML document type.
 * Localname: Angle
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.AngleDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one Angle(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class AngleDocumentImpl extends net.opengis.xls.impl.MeasureDocumentImpl implements net.opengis.xls.AngleDocument
{
    private static final long serialVersionUID = 1L;
    
    public AngleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANGLE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Angle");
    
    
    /**
     * Gets the "Angle" element
     */
    public net.opengis.xls.AngleType getAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AngleType target = null;
            target = (net.opengis.xls.AngleType)get_store().find_element_user(ANGLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Angle" element
     */
    public void setAngle(net.opengis.xls.AngleType angle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AngleType target = null;
            target = (net.opengis.xls.AngleType)get_store().find_element_user(ANGLE$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.AngleType)get_store().add_element_user(ANGLE$0);
            }
            target.set(angle);
        }
    }
    
    /**
     * Appends and returns a new empty "Angle" element
     */
    public net.opengis.xls.AngleType addNewAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AngleType target = null;
            target = (net.opengis.xls.AngleType)get_store().add_element_user(ANGLE$0);
            return target;
        }
    }
}
