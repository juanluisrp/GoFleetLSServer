/*
 * An XML document type.
 * Localname: StartPoint
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.StartPointDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one StartPoint(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class StartPointDocumentImpl extends net.opengis.xls.impl.WayPointDocumentImpl implements net.opengis.xls.StartPointDocument
{
    private static final long serialVersionUID = 1L;
    
    public StartPointDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STARTPOINT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "StartPoint");
    
    
    /**
     * Gets the "StartPoint" element
     */
    public net.opengis.xls.WayPointType getStartPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.WayPointType target = null;
            target = (net.opengis.xls.WayPointType)get_store().find_element_user(STARTPOINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StartPoint" element
     */
    public void setStartPoint(net.opengis.xls.WayPointType startPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.WayPointType target = null;
            target = (net.opengis.xls.WayPointType)get_store().find_element_user(STARTPOINT$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.WayPointType)get_store().add_element_user(STARTPOINT$0);
            }
            target.set(startPoint);
        }
    }
    
    /**
     * Appends and returns a new empty "StartPoint" element
     */
    public net.opengis.xls.WayPointType addNewStartPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.WayPointType target = null;
            target = (net.opengis.xls.WayPointType)get_store().add_element_user(STARTPOINT$0);
            return target;
        }
    }
}
