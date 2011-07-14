/*
 * An XML document type.
 * Localname: Speed
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.SpeedDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one Speed(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class SpeedDocumentImpl extends net.opengis.xls.impl.MeasureDocumentImpl implements net.opengis.xls.SpeedDocument
{
    private static final long serialVersionUID = 1L;
    
    public SpeedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPEED$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Speed");
    
    
    /**
     * Gets the "Speed" element
     */
    public net.opengis.xls.SpeedType getSpeed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.SpeedType target = null;
            target = (net.opengis.xls.SpeedType)get_store().find_element_user(SPEED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Speed" element
     */
    public void setSpeed(net.opengis.xls.SpeedType speed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.SpeedType target = null;
            target = (net.opengis.xls.SpeedType)get_store().find_element_user(SPEED$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.SpeedType)get_store().add_element_user(SPEED$0);
            }
            target.set(speed);
        }
    }
    
    /**
     * Appends and returns a new empty "Speed" element
     */
    public net.opengis.xls.SpeedType addNewSpeed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.SpeedType target = null;
            target = (net.opengis.xls.SpeedType)get_store().add_element_user(SPEED$0);
            return target;
        }
    }
}
