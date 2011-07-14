/*
 * An XML document type.
 * Localname: RouteHandle
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.RouteHandleDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one RouteHandle(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class RouteHandleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.RouteHandleDocument
{
    private static final long serialVersionUID = 1L;
    
    public RouteHandleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROUTEHANDLE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "RouteHandle");
    
    
    /**
     * Gets the "RouteHandle" element
     */
    public net.opengis.xls.RouteHandleType getRouteHandle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteHandleType target = null;
            target = (net.opengis.xls.RouteHandleType)get_store().find_element_user(ROUTEHANDLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RouteHandle" element
     */
    public void setRouteHandle(net.opengis.xls.RouteHandleType routeHandle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteHandleType target = null;
            target = (net.opengis.xls.RouteHandleType)get_store().find_element_user(ROUTEHANDLE$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.RouteHandleType)get_store().add_element_user(ROUTEHANDLE$0);
            }
            target.set(routeHandle);
        }
    }
    
    /**
     * Appends and returns a new empty "RouteHandle" element
     */
    public net.opengis.xls.RouteHandleType addNewRouteHandle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteHandleType target = null;
            target = (net.opengis.xls.RouteHandleType)get_store().add_element_user(ROUTEHANDLE$0);
            return target;
        }
    }
}
