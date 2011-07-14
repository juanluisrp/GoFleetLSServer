/*
 * An XML document type.
 * Localname: RouteSummary
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.RouteSummaryDocument2
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one RouteSummary(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class RouteSummaryDocument2Impl extends net.opengis.xls.impl.RouteSummaryDocumentImpl implements net.opengis.xls.RouteSummaryDocument2
{
    private static final long serialVersionUID = 1L;
    
    public RouteSummaryDocument2Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROUTESUMMARY2$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "RouteSummary");
    
    
    /**
     * Gets the "RouteSummary" element
     */
    public net.opengis.xls.RouteSummaryType getRouteSummary2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteSummaryType target = null;
            target = (net.opengis.xls.RouteSummaryType)get_store().find_element_user(ROUTESUMMARY2$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RouteSummary" element
     */
    public void setRouteSummary2(net.opengis.xls.RouteSummaryType routeSummary2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteSummaryType target = null;
            target = (net.opengis.xls.RouteSummaryType)get_store().find_element_user(ROUTESUMMARY2$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.RouteSummaryType)get_store().add_element_user(ROUTESUMMARY2$0);
            }
            target.set(routeSummary2);
        }
    }
    
    /**
     * Appends and returns a new empty "RouteSummary" element
     */
    public net.opengis.xls.RouteSummaryType addNewRouteSummary2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteSummaryType target = null;
            target = (net.opengis.xls.RouteSummaryType)get_store().add_element_user(ROUTESUMMARY2$0);
            return target;
        }
    }
}
