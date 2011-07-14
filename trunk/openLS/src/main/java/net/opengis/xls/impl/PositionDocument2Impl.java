/*
 * An XML document type.
 * Localname: Position
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.PositionDocument2
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one Position(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class PositionDocument2Impl extends net.opengis.xls.impl.PositionDocumentImpl implements net.opengis.xls.PositionDocument2
{
    private static final long serialVersionUID = 1L;
    
    public PositionDocument2Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POSITION2$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Position");
    
    
    /**
     * Gets the "Position" element
     */
    public net.opengis.xls.PositionType getPosition2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.PositionType target = null;
            target = (net.opengis.xls.PositionType)get_store().find_element_user(POSITION2$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Position" element
     */
    public void setPosition2(net.opengis.xls.PositionType position2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.PositionType target = null;
            target = (net.opengis.xls.PositionType)get_store().find_element_user(POSITION2$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.PositionType)get_store().add_element_user(POSITION2$0);
            }
            target.set(position2);
        }
    }
    
    /**
     * Appends and returns a new empty "Position" element
     */
    public net.opengis.xls.PositionType addNewPosition2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.PositionType target = null;
            target = (net.opengis.xls.PositionType)get_store().add_element_user(POSITION2$0);
            return target;
        }
    }
}
