/*
 * An XML document type.
 * Localname: _Position
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.PositionDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one _Position(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class PositionDocumentImpl extends net.opengis.xls.impl.LocationDocumentImpl implements net.opengis.xls.PositionDocument
{
    private static final long serialVersionUID = 1L;
    
    public PositionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POSITION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_Position");
    private static final org.apache.xmlbeans.QNameSet POSITION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Position"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_Position"),
    });
    
    
    /**
     * Gets the "_Position" element
     */
    public net.opengis.xls.AbstractPositionType getPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractPositionType target = null;
            target = (net.opengis.xls.AbstractPositionType)get_store().find_element_user(POSITION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_Position" element
     */
    public void setPosition(net.opengis.xls.AbstractPositionType position)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractPositionType target = null;
            target = (net.opengis.xls.AbstractPositionType)get_store().find_element_user(POSITION$1, 0);
            if (target == null)
            {
                target = (net.opengis.xls.AbstractPositionType)get_store().add_element_user(POSITION$0);
            }
            target.set(position);
        }
    }
    
    /**
     * Appends and returns a new empty "_Position" element
     */
    public net.opengis.xls.AbstractPositionType addNewPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractPositionType target = null;
            target = (net.opengis.xls.AbstractPositionType)get_store().add_element_user(POSITION$0);
            return target;
        }
    }
}
