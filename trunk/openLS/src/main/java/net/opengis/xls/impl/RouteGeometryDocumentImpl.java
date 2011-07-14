/*
 * An XML document type.
 * Localname: RouteGeometry
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.RouteGeometryDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one RouteGeometry(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class RouteGeometryDocumentImpl extends net.opengis.xls.impl.ADTDocumentImpl implements net.opengis.xls.RouteGeometryDocument
{
    private static final long serialVersionUID = 1L;
    
    public RouteGeometryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROUTEGEOMETRY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "RouteGeometry");
    
    
    /**
     * Gets the "RouteGeometry" element
     */
    public net.opengis.xls.RouteGeometryType getRouteGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteGeometryType target = null;
            target = (net.opengis.xls.RouteGeometryType)get_store().find_element_user(ROUTEGEOMETRY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RouteGeometry" element
     */
    public void setRouteGeometry(net.opengis.xls.RouteGeometryType routeGeometry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteGeometryType target = null;
            target = (net.opengis.xls.RouteGeometryType)get_store().find_element_user(ROUTEGEOMETRY$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.RouteGeometryType)get_store().add_element_user(ROUTEGEOMETRY$0);
            }
            target.set(routeGeometry);
        }
    }
    
    /**
     * Appends and returns a new empty "RouteGeometry" element
     */
    public net.opengis.xls.RouteGeometryType addNewRouteGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteGeometryType target = null;
            target = (net.opengis.xls.RouteGeometryType)get_store().add_element_user(ROUTEGEOMETRY$0);
            return target;
        }
    }
}
