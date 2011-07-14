/*
 * An XML document type.
 * Localname: RoutePreference
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.RoutePreferenceDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one RoutePreference(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class RoutePreferenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.RoutePreferenceDocument
{
    private static final long serialVersionUID = 1L;
    
    public RoutePreferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROUTEPREFERENCE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "RoutePreference");
    
    
    /**
     * Gets the "RoutePreference" element
     */
    public net.opengis.xls.RoutePreferenceType.Enum getRoutePreference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROUTEPREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (net.opengis.xls.RoutePreferenceType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "RoutePreference" element
     */
    public net.opengis.xls.RoutePreferenceType xgetRoutePreference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RoutePreferenceType target = null;
            target = (net.opengis.xls.RoutePreferenceType)get_store().find_element_user(ROUTEPREFERENCE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RoutePreference" element
     */
    public void setRoutePreference(net.opengis.xls.RoutePreferenceType.Enum routePreference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROUTEPREFERENCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROUTEPREFERENCE$0);
            }
            target.setEnumValue(routePreference);
        }
    }
    
    /**
     * Sets (as xml) the "RoutePreference" element
     */
    public void xsetRoutePreference(net.opengis.xls.RoutePreferenceType routePreference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RoutePreferenceType target = null;
            target = (net.opengis.xls.RoutePreferenceType)get_store().find_element_user(ROUTEPREFERENCE$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.RoutePreferenceType)get_store().add_element_user(ROUTEPREFERENCE$0);
            }
            target.set(routePreference);
        }
    }
}
