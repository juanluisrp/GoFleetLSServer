/*
 * XML Type:  DetermineRouteRequestType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.DetermineRouteRequestType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML DetermineRouteRequestType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class DetermineRouteRequestTypeImpl extends net.opengis.xls.impl.AbstractRequestParametersTypeImpl implements net.opengis.xls.DetermineRouteRequestType
{
    private static final long serialVersionUID = 1L;
    
    public DetermineRouteRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROUTEHANDLE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "RouteHandle");
    private static final javax.xml.namespace.QName ROUTEPLAN$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "RoutePlan");
    private static final javax.xml.namespace.QName ROUTEINSTRUCTIONSREQUEST$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "RouteInstructionsRequest");
    private static final javax.xml.namespace.QName ROUTEGEOMETRYREQUEST$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "RouteGeometryRequest");
    private static final javax.xml.namespace.QName ROUTEMAPREQUEST$8 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "RouteMapRequest");
    private static final javax.xml.namespace.QName PROVIDEROUTEHANDLE$10 = 
        new javax.xml.namespace.QName("", "provideRouteHandle");
    private static final javax.xml.namespace.QName DISTANCEUNIT$12 = 
        new javax.xml.namespace.QName("", "distanceUnit");
    
    
    /**
     * Gets the "RouteHandle" element
     */
    public net.opengis.xls.RouteHandleType getRouteHandle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteHandleType target = null;
            target = (net.opengis.xls.RouteHandleType)get_store().find_element_user(ROUTEHANDLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "RouteHandle" element
     */
    public boolean isSetRouteHandle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROUTEHANDLE$0) != 0;
        }
    }
    
    /**
     * Sets the "RouteHandle" element
     */
    public void setRouteHandle(net.opengis.xls.RouteHandleType routeHandle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteHandleType target = null;
            target = (net.opengis.xls.RouteHandleType)get_store().find_element_user(ROUTEHANDLE$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.RouteHandleType)get_store().add_element_user(ROUTEHANDLE$0);
            }
            target.set(routeHandle);
        }
    }
    
    /**
     * Appends and returns a new empty "RouteHandle" element
     */
    public net.opengis.xls.RouteHandleType addNewRouteHandle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteHandleType target = null;
            target = (net.opengis.xls.RouteHandleType)get_store().add_element_user(ROUTEHANDLE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "RouteHandle" element
     */
    public void unsetRouteHandle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROUTEHANDLE$0, 0);
        }
    }
    
    /**
     * Gets the "RoutePlan" element
     */
    public net.opengis.xls.RoutePlanType getRoutePlan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RoutePlanType target = null;
            target = (net.opengis.xls.RoutePlanType)get_store().find_element_user(ROUTEPLAN$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "RoutePlan" element
     */
    public boolean isSetRoutePlan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROUTEPLAN$2) != 0;
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
            target = (net.opengis.xls.RoutePlanType)get_store().find_element_user(ROUTEPLAN$2, 0);
            if (target == null)
            {
                target = (net.opengis.xls.RoutePlanType)get_store().add_element_user(ROUTEPLAN$2);
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
            target = (net.opengis.xls.RoutePlanType)get_store().add_element_user(ROUTEPLAN$2);
            return target;
        }
    }
    
    /**
     * Unsets the "RoutePlan" element
     */
    public void unsetRoutePlan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROUTEPLAN$2, 0);
        }
    }
    
    /**
     * Gets the "RouteInstructionsRequest" element
     */
    public net.opengis.xls.RouteInstructionsRequestType getRouteInstructionsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteInstructionsRequestType target = null;
            target = (net.opengis.xls.RouteInstructionsRequestType)get_store().find_element_user(ROUTEINSTRUCTIONSREQUEST$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "RouteInstructionsRequest" element
     */
    public boolean isSetRouteInstructionsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROUTEINSTRUCTIONSREQUEST$4) != 0;
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
            target = (net.opengis.xls.RouteInstructionsRequestType)get_store().find_element_user(ROUTEINSTRUCTIONSREQUEST$4, 0);
            if (target == null)
            {
                target = (net.opengis.xls.RouteInstructionsRequestType)get_store().add_element_user(ROUTEINSTRUCTIONSREQUEST$4);
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
            target = (net.opengis.xls.RouteInstructionsRequestType)get_store().add_element_user(ROUTEINSTRUCTIONSREQUEST$4);
            return target;
        }
    }
    
    /**
     * Unsets the "RouteInstructionsRequest" element
     */
    public void unsetRouteInstructionsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROUTEINSTRUCTIONSREQUEST$4, 0);
        }
    }
    
    /**
     * Gets the "RouteGeometryRequest" element
     */
    public net.opengis.xls.RouteGeometryRequestType getRouteGeometryRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteGeometryRequestType target = null;
            target = (net.opengis.xls.RouteGeometryRequestType)get_store().find_element_user(ROUTEGEOMETRYREQUEST$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "RouteGeometryRequest" element
     */
    public boolean isSetRouteGeometryRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROUTEGEOMETRYREQUEST$6) != 0;
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
            target = (net.opengis.xls.RouteGeometryRequestType)get_store().find_element_user(ROUTEGEOMETRYREQUEST$6, 0);
            if (target == null)
            {
                target = (net.opengis.xls.RouteGeometryRequestType)get_store().add_element_user(ROUTEGEOMETRYREQUEST$6);
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
            target = (net.opengis.xls.RouteGeometryRequestType)get_store().add_element_user(ROUTEGEOMETRYREQUEST$6);
            return target;
        }
    }
    
    /**
     * Unsets the "RouteGeometryRequest" element
     */
    public void unsetRouteGeometryRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROUTEGEOMETRYREQUEST$6, 0);
        }
    }
    
    /**
     * Gets the "RouteMapRequest" element
     */
    public net.opengis.xls.RouteMapRequestType getRouteMapRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteMapRequestType target = null;
            target = (net.opengis.xls.RouteMapRequestType)get_store().find_element_user(ROUTEMAPREQUEST$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "RouteMapRequest" element
     */
    public boolean isSetRouteMapRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROUTEMAPREQUEST$8) != 0;
        }
    }
    
    /**
     * Sets the "RouteMapRequest" element
     */
    public void setRouteMapRequest(net.opengis.xls.RouteMapRequestType routeMapRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteMapRequestType target = null;
            target = (net.opengis.xls.RouteMapRequestType)get_store().find_element_user(ROUTEMAPREQUEST$8, 0);
            if (target == null)
            {
                target = (net.opengis.xls.RouteMapRequestType)get_store().add_element_user(ROUTEMAPREQUEST$8);
            }
            target.set(routeMapRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "RouteMapRequest" element
     */
    public net.opengis.xls.RouteMapRequestType addNewRouteMapRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteMapRequestType target = null;
            target = (net.opengis.xls.RouteMapRequestType)get_store().add_element_user(ROUTEMAPREQUEST$8);
            return target;
        }
    }
    
    /**
     * Unsets the "RouteMapRequest" element
     */
    public void unsetRouteMapRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROUTEMAPREQUEST$8, 0);
        }
    }
    
    /**
     * Gets the "provideRouteHandle" attribute
     */
    public boolean getProvideRouteHandle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROVIDEROUTEHANDLE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROVIDEROUTEHANDLE$10);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "provideRouteHandle" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetProvideRouteHandle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROVIDEROUTEHANDLE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROVIDEROUTEHANDLE$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "provideRouteHandle" attribute
     */
    public boolean isSetProvideRouteHandle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PROVIDEROUTEHANDLE$10) != null;
        }
    }
    
    /**
     * Sets the "provideRouteHandle" attribute
     */
    public void setProvideRouteHandle(boolean provideRouteHandle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROVIDEROUTEHANDLE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROVIDEROUTEHANDLE$10);
            }
            target.setBooleanValue(provideRouteHandle);
        }
    }
    
    /**
     * Sets (as xml) the "provideRouteHandle" attribute
     */
    public void xsetProvideRouteHandle(org.apache.xmlbeans.XmlBoolean provideRouteHandle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROVIDEROUTEHANDLE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROVIDEROUTEHANDLE$10);
            }
            target.set(provideRouteHandle);
        }
    }
    
    /**
     * Unsets the "provideRouteHandle" attribute
     */
    public void unsetProvideRouteHandle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PROVIDEROUTEHANDLE$10);
        }
    }
    
    /**
     * Gets the "distanceUnit" attribute
     */
    public net.opengis.xls.DistanceUnitType.Enum getDistanceUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTANCEUNIT$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DISTANCEUNIT$12);
            }
            if (target == null)
            {
                return null;
            }
            return (net.opengis.xls.DistanceUnitType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "distanceUnit" attribute
     */
    public net.opengis.xls.DistanceUnitType xgetDistanceUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.DistanceUnitType target = null;
            target = (net.opengis.xls.DistanceUnitType)get_store().find_attribute_user(DISTANCEUNIT$12);
            if (target == null)
            {
                target = (net.opengis.xls.DistanceUnitType)get_default_attribute_value(DISTANCEUNIT$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "distanceUnit" attribute
     */
    public boolean isSetDistanceUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISTANCEUNIT$12) != null;
        }
    }
    
    /**
     * Sets the "distanceUnit" attribute
     */
    public void setDistanceUnit(net.opengis.xls.DistanceUnitType.Enum distanceUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTANCEUNIT$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISTANCEUNIT$12);
            }
            target.setEnumValue(distanceUnit);
        }
    }
    
    /**
     * Sets (as xml) the "distanceUnit" attribute
     */
    public void xsetDistanceUnit(net.opengis.xls.DistanceUnitType distanceUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.DistanceUnitType target = null;
            target = (net.opengis.xls.DistanceUnitType)get_store().find_attribute_user(DISTANCEUNIT$12);
            if (target == null)
            {
                target = (net.opengis.xls.DistanceUnitType)get_store().add_attribute_user(DISTANCEUNIT$12);
            }
            target.set(distanceUnit);
        }
    }
    
    /**
     * Unsets the "distanceUnit" attribute
     */
    public void unsetDistanceUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISTANCEUNIT$12);
        }
    }
}
