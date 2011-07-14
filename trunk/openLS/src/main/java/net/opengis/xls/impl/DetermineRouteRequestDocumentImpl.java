/*
 * An XML document type.
 * Localname: DetermineRouteRequest
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.DetermineRouteRequestDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one DetermineRouteRequest(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class DetermineRouteRequestDocumentImpl extends net.opengis.xls.impl.RequestParametersDocumentImpl implements net.opengis.xls.DetermineRouteRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public DetermineRouteRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DETERMINEROUTEREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "DetermineRouteRequest");
    
    
    /**
     * Gets the "DetermineRouteRequest" element
     */
    public net.opengis.xls.DetermineRouteRequestType getDetermineRouteRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.DetermineRouteRequestType target = null;
            target = (net.opengis.xls.DetermineRouteRequestType)get_store().find_element_user(DETERMINEROUTEREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DetermineRouteRequest" element
     */
    public void setDetermineRouteRequest(net.opengis.xls.DetermineRouteRequestType determineRouteRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.DetermineRouteRequestType target = null;
            target = (net.opengis.xls.DetermineRouteRequestType)get_store().find_element_user(DETERMINEROUTEREQUEST$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.DetermineRouteRequestType)get_store().add_element_user(DETERMINEROUTEREQUEST$0);
            }
            target.set(determineRouteRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "DetermineRouteRequest" element
     */
    public net.opengis.xls.DetermineRouteRequestType addNewDetermineRouteRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.DetermineRouteRequestType target = null;
            target = (net.opengis.xls.DetermineRouteRequestType)get_store().add_element_user(DETERMINEROUTEREQUEST$0);
            return target;
        }
    }
}
