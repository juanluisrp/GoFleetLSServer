/*
 * XML Type:  OutputMSInformationType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.OutputMSInformationType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML OutputMSInformationType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class OutputMSInformationTypeImpl extends net.opengis.xls.impl.AbstractMSInformationTypeImpl implements net.opengis.xls.OutputMSInformationType
{
    private static final long serialVersionUID = 1L;
    
    public OutputMSInformationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POSITION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Position");
    
    
    /**
     * Gets the "Position" element
     */
    public net.opengis.xls.PositionType getPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.PositionType target = null;
            target = (net.opengis.xls.PositionType)get_store().find_element_user(POSITION$0, 0);
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
    public void setPosition(net.opengis.xls.PositionType position)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.PositionType target = null;
            target = (net.opengis.xls.PositionType)get_store().find_element_user(POSITION$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.PositionType)get_store().add_element_user(POSITION$0);
            }
            target.set(position);
        }
    }
    
    /**
     * Appends and returns a new empty "Position" element
     */
    public net.opengis.xls.PositionType addNewPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.PositionType target = null;
            target = (net.opengis.xls.PositionType)get_store().add_element_user(POSITION$0);
            return target;
        }
    }
}
