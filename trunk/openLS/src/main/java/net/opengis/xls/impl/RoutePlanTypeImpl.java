/*
 * XML Type:  RoutePlanType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.RoutePlanType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML RoutePlanType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class RoutePlanTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.RoutePlanType
{
    private static final long serialVersionUID = 1L;
    
    public RoutePlanTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROUTEPREFERENCE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "RoutePreference");
    private static final javax.xml.namespace.QName WAYPOINTLIST$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "WayPointList");
    private static final javax.xml.namespace.QName AVOIDLIST$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "AvoidList");
    private static final javax.xml.namespace.QName USEREALTIMETRAFFIC$6 = 
        new javax.xml.namespace.QName("", "useRealTimeTraffic");
    private static final javax.xml.namespace.QName EXPECTEDSTARTTIME$8 = 
        new javax.xml.namespace.QName("", "expectedStartTime");
    private static final javax.xml.namespace.QName EXPECTEDENDTIME$10 = 
        new javax.xml.namespace.QName("", "expectedEndTime");
    
    
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
    
    /**
     * Gets the "WayPointList" element
     */
    public net.opengis.xls.WayPointListType getWayPointList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.WayPointListType target = null;
            target = (net.opengis.xls.WayPointListType)get_store().find_element_user(WAYPOINTLIST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "WayPointList" element
     */
    public void setWayPointList(net.opengis.xls.WayPointListType wayPointList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.WayPointListType target = null;
            target = (net.opengis.xls.WayPointListType)get_store().find_element_user(WAYPOINTLIST$2, 0);
            if (target == null)
            {
                target = (net.opengis.xls.WayPointListType)get_store().add_element_user(WAYPOINTLIST$2);
            }
            target.set(wayPointList);
        }
    }
    
    /**
     * Appends and returns a new empty "WayPointList" element
     */
    public net.opengis.xls.WayPointListType addNewWayPointList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.WayPointListType target = null;
            target = (net.opengis.xls.WayPointListType)get_store().add_element_user(WAYPOINTLIST$2);
            return target;
        }
    }
    
    /**
     * Gets the "AvoidList" element
     */
    public net.opengis.xls.AvoidListType getAvoidList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AvoidListType target = null;
            target = (net.opengis.xls.AvoidListType)get_store().find_element_user(AVOIDLIST$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "AvoidList" element
     */
    public boolean isSetAvoidList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AVOIDLIST$4) != 0;
        }
    }
    
    /**
     * Sets the "AvoidList" element
     */
    public void setAvoidList(net.opengis.xls.AvoidListType avoidList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AvoidListType target = null;
            target = (net.opengis.xls.AvoidListType)get_store().find_element_user(AVOIDLIST$4, 0);
            if (target == null)
            {
                target = (net.opengis.xls.AvoidListType)get_store().add_element_user(AVOIDLIST$4);
            }
            target.set(avoidList);
        }
    }
    
    /**
     * Appends and returns a new empty "AvoidList" element
     */
    public net.opengis.xls.AvoidListType addNewAvoidList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AvoidListType target = null;
            target = (net.opengis.xls.AvoidListType)get_store().add_element_user(AVOIDLIST$4);
            return target;
        }
    }
    
    /**
     * Unsets the "AvoidList" element
     */
    public void unsetAvoidList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AVOIDLIST$4, 0);
        }
    }
    
    /**
     * Gets the "useRealTimeTraffic" attribute
     */
    public boolean getUseRealTimeTraffic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEREALTIMETRAFFIC$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(USEREALTIMETRAFFIC$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "useRealTimeTraffic" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetUseRealTimeTraffic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USEREALTIMETRAFFIC$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(USEREALTIMETRAFFIC$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "useRealTimeTraffic" attribute
     */
    public boolean isSetUseRealTimeTraffic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(USEREALTIMETRAFFIC$6) != null;
        }
    }
    
    /**
     * Sets the "useRealTimeTraffic" attribute
     */
    public void setUseRealTimeTraffic(boolean useRealTimeTraffic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEREALTIMETRAFFIC$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USEREALTIMETRAFFIC$6);
            }
            target.setBooleanValue(useRealTimeTraffic);
        }
    }
    
    /**
     * Sets (as xml) the "useRealTimeTraffic" attribute
     */
    public void xsetUseRealTimeTraffic(org.apache.xmlbeans.XmlBoolean useRealTimeTraffic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USEREALTIMETRAFFIC$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(USEREALTIMETRAFFIC$6);
            }
            target.set(useRealTimeTraffic);
        }
    }
    
    /**
     * Unsets the "useRealTimeTraffic" attribute
     */
    public void unsetUseRealTimeTraffic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(USEREALTIMETRAFFIC$6);
        }
    }
    
    /**
     * Gets the "expectedStartTime" attribute
     */
    public java.util.Calendar getExpectedStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPECTEDSTARTTIME$8);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "expectedStartTime" attribute
     */
    public org.apache.xmlbeans.XmlDateTime xgetExpectedStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(EXPECTEDSTARTTIME$8);
            return target;
        }
    }
    
    /**
     * True if has "expectedStartTime" attribute
     */
    public boolean isSetExpectedStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EXPECTEDSTARTTIME$8) != null;
        }
    }
    
    /**
     * Sets the "expectedStartTime" attribute
     */
    public void setExpectedStartTime(java.util.Calendar expectedStartTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPECTEDSTARTTIME$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXPECTEDSTARTTIME$8);
            }
            target.setCalendarValue(expectedStartTime);
        }
    }
    
    /**
     * Sets (as xml) the "expectedStartTime" attribute
     */
    public void xsetExpectedStartTime(org.apache.xmlbeans.XmlDateTime expectedStartTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(EXPECTEDSTARTTIME$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(EXPECTEDSTARTTIME$8);
            }
            target.set(expectedStartTime);
        }
    }
    
    /**
     * Unsets the "expectedStartTime" attribute
     */
    public void unsetExpectedStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EXPECTEDSTARTTIME$8);
        }
    }
    
    /**
     * Gets the "expectedEndTime" attribute
     */
    public java.util.Calendar getExpectedEndTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPECTEDENDTIME$10);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "expectedEndTime" attribute
     */
    public org.apache.xmlbeans.XmlDateTime xgetExpectedEndTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(EXPECTEDENDTIME$10);
            return target;
        }
    }
    
    /**
     * True if has "expectedEndTime" attribute
     */
    public boolean isSetExpectedEndTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EXPECTEDENDTIME$10) != null;
        }
    }
    
    /**
     * Sets the "expectedEndTime" attribute
     */
    public void setExpectedEndTime(java.util.Calendar expectedEndTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPECTEDENDTIME$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXPECTEDENDTIME$10);
            }
            target.setCalendarValue(expectedEndTime);
        }
    }
    
    /**
     * Sets (as xml) the "expectedEndTime" attribute
     */
    public void xsetExpectedEndTime(org.apache.xmlbeans.XmlDateTime expectedEndTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(EXPECTEDENDTIME$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(EXPECTEDENDTIME$10);
            }
            target.set(expectedEndTime);
        }
    }
    
    /**
     * Unsets the "expectedEndTime" attribute
     */
    public void unsetExpectedEndTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EXPECTEDENDTIME$10);
        }
    }
}
