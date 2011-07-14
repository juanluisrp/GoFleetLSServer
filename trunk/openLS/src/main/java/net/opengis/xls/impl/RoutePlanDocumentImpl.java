/*
 * An XML document type.
 * Localname: RoutePlan
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.RoutePlanDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one RoutePlan(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class RoutePlanDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.RoutePlanDocument
{
    private static final long serialVersionUID = 1L;
    
    public RoutePlanDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROUTEPLAN$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "RoutePlan");
    
    
    /**
     * Gets the "RoutePlan" element
     */
    public net.opengis.xls.RoutePlanType getRoutePlan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RoutePlanType target = null;
            target = (net.opengis.xls.RoutePlanType)get_store().find_element_user(ROUTEPLAN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RoutePlan" element
     */
    public void setRoutePlan(net.opengis.xls.RoutePlanType routePlan)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RoutePlanType target = null;
            target = (net.opengis.xls.RoutePlanType)get_store().find_element_user(ROUTEPLAN$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.RoutePlanType)get_store().add_element_user(ROUTEPLAN$0);
            }
            target.set(routePlan);
        }
    }
    
    /**
     * Appends and returns a new empty "RoutePlan" element
     */
    public net.opengis.xls.RoutePlanType addNewRoutePlan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RoutePlanType target = null;
            target = (net.opengis.xls.RoutePlanType)get_store().add_element_user(ROUTEPLAN$0);
            return target;
        }
    }
}
