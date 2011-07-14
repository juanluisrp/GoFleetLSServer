/*
 * An XML document type.
 * Localname: RouteInstructionsRequest
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.RouteInstructionsRequestDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one RouteInstructionsRequest(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class RouteInstructionsRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.RouteInstructionsRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public RouteInstructionsRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROUTEINSTRUCTIONSREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "RouteInstructionsRequest");
    
    
    /**
     * Gets the "RouteInstructionsRequest" element
     */
    public net.opengis.xls.RouteInstructionsRequestType getRouteInstructionsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteInstructionsRequestType target = null;
            target = (net.opengis.xls.RouteInstructionsRequestType)get_store().find_element_user(ROUTEINSTRUCTIONSREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RouteInstructionsRequest" element
     */
    public void setRouteInstructionsRequest(net.opengis.xls.RouteInstructionsRequestType routeInstructionsRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteInstructionsRequestType target = null;
            target = (net.opengis.xls.RouteInstructionsRequestType)get_store().find_element_user(ROUTEINSTRUCTIONSREQUEST$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.RouteInstructionsRequestType)get_store().add_element_user(ROUTEINSTRUCTIONSREQUEST$0);
            }
            target.set(routeInstructionsRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "RouteInstructionsRequest" element
     */
    public net.opengis.xls.RouteInstructionsRequestType addNewRouteInstructionsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteInstructionsRequestType target = null;
            target = (net.opengis.xls.RouteInstructionsRequestType)get_store().add_element_user(ROUTEINSTRUCTIONSREQUEST$0);
            return target;
        }
    }
}
