/*
 * An XML document type.
 * Localname: RouteMapRequest
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.RouteMapRequestDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one RouteMapRequest(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class RouteMapRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.RouteMapRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public RouteMapRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROUTEMAPREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "RouteMapRequest");
    
    
    /**
     * Gets the "RouteMapRequest" element
     */
    public net.opengis.xls.RouteMapRequestType getRouteMapRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteMapRequestType target = null;
            target = (net.opengis.xls.RouteMapRequestType)get_store().find_element_user(ROUTEMAPREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RouteMapRequest" element
     */
    public void setRouteMapRequest(net.opengis.xls.RouteMapRequestType routeMapRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteMapRequestType target = null;
            target = (net.opengis.xls.RouteMapRequestType)get_store().find_element_user(ROUTEMAPREQUEST$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.RouteMapRequestType)get_store().add_element_user(ROUTEMAPREQUEST$0);
            }
            target.set(routeMapRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "RouteMapRequest" element
     */
    public net.opengis.xls.RouteMapRequestType addNewRouteMapRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteMapRequestType target = null;
            target = (net.opengis.xls.RouteMapRequestType)get_store().add_element_user(ROUTEMAPREQUEST$0);
            return target;
        }
    }
}
