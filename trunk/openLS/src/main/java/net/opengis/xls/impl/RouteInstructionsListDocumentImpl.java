/*
 * An XML document type.
 * Localname: RouteInstructionsList
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.RouteInstructionsListDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one RouteInstructionsList(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class RouteInstructionsListDocumentImpl extends net.opengis.xls.impl.ADTDocumentImpl implements net.opengis.xls.RouteInstructionsListDocument
{
    private static final long serialVersionUID = 1L;
    
    public RouteInstructionsListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROUTEINSTRUCTIONSLIST$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "RouteInstructionsList");
    
    
    /**
     * Gets the "RouteInstructionsList" element
     */
    public net.opengis.xls.RouteInstructionsListType getRouteInstructionsList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteInstructionsListType target = null;
            target = (net.opengis.xls.RouteInstructionsListType)get_store().find_element_user(ROUTEINSTRUCTIONSLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RouteInstructionsList" element
     */
    public void setRouteInstructionsList(net.opengis.xls.RouteInstructionsListType routeInstructionsList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteInstructionsListType target = null;
            target = (net.opengis.xls.RouteInstructionsListType)get_store().find_element_user(ROUTEINSTRUCTIONSLIST$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.RouteInstructionsListType)get_store().add_element_user(ROUTEINSTRUCTIONSLIST$0);
            }
            target.set(routeInstructionsList);
        }
    }
    
    /**
     * Appends and returns a new empty "RouteInstructionsList" element
     */
    public net.opengis.xls.RouteInstructionsListType addNewRouteInstructionsList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteInstructionsListType target = null;
            target = (net.opengis.xls.RouteInstructionsListType)get_store().add_element_user(ROUTEINSTRUCTIONSLIST$0);
            return target;
        }
    }
}
