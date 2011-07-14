/*
 * An XML document type.
 * Localname: EndPoint
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.EndPointDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one EndPoint(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class EndPointDocumentImpl extends net.opengis.xls.impl.WayPointDocumentImpl implements net.opengis.xls.EndPointDocument
{
    private static final long serialVersionUID = 1L;
    
    public EndPointDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENDPOINT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "EndPoint");
    
    
    /**
     * Gets the "EndPoint" element
     */
    public net.opengis.xls.WayPointType getEndPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.WayPointType target = null;
            target = (net.opengis.xls.WayPointType)get_store().find_element_user(ENDPOINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EndPoint" element
     */
    public void setEndPoint(net.opengis.xls.WayPointType endPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.WayPointType target = null;
            target = (net.opengis.xls.WayPointType)get_store().find_element_user(ENDPOINT$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.WayPointType)get_store().add_element_user(ENDPOINT$0);
            }
            target.set(endPoint);
        }
    }
    
    /**
     * Appends and returns a new empty "EndPoint" element
     */
    public net.opengis.xls.WayPointType addNewEndPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.WayPointType target = null;
            target = (net.opengis.xls.WayPointType)get_store().add_element_user(ENDPOINT$0);
            return target;
        }
    }
}
