/*
 * An XML document type.
 * Localname: RouteMap
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.RouteMapDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one RouteMap(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class RouteMapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.RouteMapDocument
{
    private static final long serialVersionUID = 1L;
    
    public RouteMapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROUTEMAP$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "RouteMap");
    
    
    /**
     * Gets the "RouteMap" element
     */
    public net.opengis.xls.RouteMapType getRouteMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteMapType target = null;
            target = (net.opengis.xls.RouteMapType)get_store().find_element_user(ROUTEMAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RouteMap" element
     */
    public void setRouteMap(net.opengis.xls.RouteMapType routeMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteMapType target = null;
            target = (net.opengis.xls.RouteMapType)get_store().find_element_user(ROUTEMAP$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.RouteMapType)get_store().add_element_user(ROUTEMAP$0);
            }
            target.set(routeMap);
        }
    }
    
    /**
     * Appends and returns a new empty "RouteMap" element
     */
    public net.opengis.xls.RouteMapType addNewRouteMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteMapType target = null;
            target = (net.opengis.xls.RouteMapType)get_store().add_element_user(ROUTEMAP$0);
            return target;
        }
    }
}
