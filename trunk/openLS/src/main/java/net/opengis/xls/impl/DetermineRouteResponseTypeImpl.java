/*
 * XML Type:  DetermineRouteResponseType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.DetermineRouteResponseType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML DetermineRouteResponseType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class DetermineRouteResponseTypeImpl extends net.opengis.xls.impl.AbstractResponseParametersTypeImpl implements net.opengis.xls.DetermineRouteResponseType
{
    private static final long serialVersionUID = 1L;
    
    public DetermineRouteResponseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROUTEHANDLE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "RouteHandle");
    private static final javax.xml.namespace.QName ROUTESUMMARY$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "RouteSummary");
    private static final javax.xml.namespace.QName ROUTEGEOMETRY$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "RouteGeometry");
    private static final javax.xml.namespace.QName ROUTEINSTRUCTIONSLIST$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "RouteInstructionsList");
    private static final javax.xml.namespace.QName ROUTEMAP$8 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "RouteMap");
    
    
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
     * Gets the "RouteSummary" element
     */
    public net.opengis.xls.RouteSummaryType getRouteSummary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteSummaryType target = null;
            target = (net.opengis.xls.RouteSummaryType)get_store().find_element_user(ROUTESUMMARY$2, 0);
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
    public void setRouteSummary(net.opengis.xls.RouteSummaryType routeSummary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteSummaryType target = null;
            target = (net.opengis.xls.RouteSummaryType)get_store().find_element_user(ROUTESUMMARY$2, 0);
            if (target == null)
            {
                target = (net.opengis.xls.RouteSummaryType)get_store().add_element_user(ROUTESUMMARY$2);
            }
            target.set(routeSummary);
        }
    }
    
    /**
     * Appends and returns a new empty "RouteSummary" element
     */
    public net.opengis.xls.RouteSummaryType addNewRouteSummary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteSummaryType target = null;
            target = (net.opengis.xls.RouteSummaryType)get_store().add_element_user(ROUTESUMMARY$2);
            return target;
        }
    }
    
    /**
     * Gets the "RouteGeometry" element
     */
    public net.opengis.xls.RouteGeometryType getRouteGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteGeometryType target = null;
            target = (net.opengis.xls.RouteGeometryType)get_store().find_element_user(ROUTEGEOMETRY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "RouteGeometry" element
     */
    public boolean isSetRouteGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROUTEGEOMETRY$4) != 0;
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
            target = (net.opengis.xls.RouteGeometryType)get_store().find_element_user(ROUTEGEOMETRY$4, 0);
            if (target == null)
            {
                target = (net.opengis.xls.RouteGeometryType)get_store().add_element_user(ROUTEGEOMETRY$4);
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
            target = (net.opengis.xls.RouteGeometryType)get_store().add_element_user(ROUTEGEOMETRY$4);
            return target;
        }
    }
    
    /**
     * Unsets the "RouteGeometry" element
     */
    public void unsetRouteGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROUTEGEOMETRY$4, 0);
        }
    }
    
    /**
     * Gets the "RouteInstructionsList" element
     */
    public net.opengis.xls.RouteInstructionsListType getRouteInstructionsList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteInstructionsListType target = null;
            target = (net.opengis.xls.RouteInstructionsListType)get_store().find_element_user(ROUTEINSTRUCTIONSLIST$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "RouteInstructionsList" element
     */
    public boolean isSetRouteInstructionsList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROUTEINSTRUCTIONSLIST$6) != 0;
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
            target = (net.opengis.xls.RouteInstructionsListType)get_store().find_element_user(ROUTEINSTRUCTIONSLIST$6, 0);
            if (target == null)
            {
                target = (net.opengis.xls.RouteInstructionsListType)get_store().add_element_user(ROUTEINSTRUCTIONSLIST$6);
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
            target = (net.opengis.xls.RouteInstructionsListType)get_store().add_element_user(ROUTEINSTRUCTIONSLIST$6);
            return target;
        }
    }
    
    /**
     * Unsets the "RouteInstructionsList" element
     */
    public void unsetRouteInstructionsList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROUTEINSTRUCTIONSLIST$6, 0);
        }
    }
    
    /**
     * Gets array of all "RouteMap" elements
     */
    public net.opengis.xls.RouteMapType[] getRouteMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ROUTEMAP$8, targetList);
            net.opengis.xls.RouteMapType[] result = new net.opengis.xls.RouteMapType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "RouteMap" element
     */
    public net.opengis.xls.RouteMapType getRouteMapArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteMapType target = null;
            target = (net.opengis.xls.RouteMapType)get_store().find_element_user(ROUTEMAP$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "RouteMap" element
     */
    public int sizeOfRouteMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROUTEMAP$8);
        }
    }
    
    /**
     * Sets array of all "RouteMap" element
     */
    public void setRouteMapArray(net.opengis.xls.RouteMapType[] routeMapArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(routeMapArray, ROUTEMAP$8);
        }
    }
    
    /**
     * Sets ith "RouteMap" element
     */
    public void setRouteMapArray(int i, net.opengis.xls.RouteMapType routeMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteMapType target = null;
            target = (net.opengis.xls.RouteMapType)get_store().find_element_user(ROUTEMAP$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(routeMap);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RouteMap" element
     */
    public net.opengis.xls.RouteMapType insertNewRouteMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteMapType target = null;
            target = (net.opengis.xls.RouteMapType)get_store().insert_element_user(ROUTEMAP$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RouteMap" element
     */
    public net.opengis.xls.RouteMapType addNewRouteMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteMapType target = null;
            target = (net.opengis.xls.RouteMapType)get_store().add_element_user(ROUTEMAP$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "RouteMap" element
     */
    public void removeRouteMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROUTEMAP$8, i);
        }
    }
}
