/*
 * An XML document type.
 * Localname: RouteGeometryRequest
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.RouteGeometryRequestDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one RouteGeometryRequest(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class RouteGeometryRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.RouteGeometryRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public RouteGeometryRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROUTEGEOMETRYREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "RouteGeometryRequest");
    
    
    /**
     * Gets the "RouteGeometryRequest" element
     */
    public net.opengis.xls.RouteGeometryRequestType getRouteGeometryRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteGeometryRequestType target = null;
            target = (net.opengis.xls.RouteGeometryRequestType)get_store().find_element_user(ROUTEGEOMETRYREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RouteGeometryRequest" element
     */
    public void setRouteGeometryRequest(net.opengis.xls.RouteGeometryRequestType routeGeometryRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteGeometryRequestType target = null;
            target = (net.opengis.xls.RouteGeometryRequestType)get_store().find_element_user(ROUTEGEOMETRYREQUEST$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.RouteGeometryRequestType)get_store().add_element_user(ROUTEGEOMETRYREQUEST$0);
            }
            target.set(routeGeometryRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "RouteGeometryRequest" element
     */
    public net.opengis.xls.RouteGeometryRequestType addNewRouteGeometryRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteGeometryRequestType target = null;
            target = (net.opengis.xls.RouteGeometryRequestType)get_store().add_element_user(ROUTEGEOMETRYREQUEST$0);
            return target;
        }
    }
}
