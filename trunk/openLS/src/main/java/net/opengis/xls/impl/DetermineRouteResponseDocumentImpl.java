/*
 * An XML document type.
 * Localname: DetermineRouteResponse
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.DetermineRouteResponseDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one DetermineRouteResponse(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class DetermineRouteResponseDocumentImpl extends net.opengis.xls.impl.ResponseParametersDocumentImpl implements net.opengis.xls.DetermineRouteResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public DetermineRouteResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DETERMINEROUTERESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "DetermineRouteResponse");
    
    
    /**
     * Gets the "DetermineRouteResponse" element
     */
    public net.opengis.xls.DetermineRouteResponseType getDetermineRouteResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.DetermineRouteResponseType target = null;
            target = (net.opengis.xls.DetermineRouteResponseType)get_store().find_element_user(DETERMINEROUTERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DetermineRouteResponse" element
     */
    public void setDetermineRouteResponse(net.opengis.xls.DetermineRouteResponseType determineRouteResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.DetermineRouteResponseType target = null;
            target = (net.opengis.xls.DetermineRouteResponseType)get_store().find_element_user(DETERMINEROUTERESPONSE$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.DetermineRouteResponseType)get_store().add_element_user(DETERMINEROUTERESPONSE$0);
            }
            target.set(determineRouteResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "DetermineRouteResponse" element
     */
    public net.opengis.xls.DetermineRouteResponseType addNewDetermineRouteResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.DetermineRouteResponseType target = null;
            target = (net.opengis.xls.DetermineRouteResponseType)get_store().add_element_user(DETERMINEROUTERESPONSE$0);
            return target;
        }
    }
}
