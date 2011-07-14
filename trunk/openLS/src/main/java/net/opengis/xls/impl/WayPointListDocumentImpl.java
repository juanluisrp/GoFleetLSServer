/*
 * An XML document type.
 * Localname: WayPointList
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.WayPointListDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one WayPointList(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class WayPointListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.WayPointListDocument
{
    private static final long serialVersionUID = 1L;
    
    public WayPointListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WAYPOINTLIST$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "WayPointList");
    
    
    /**
     * Gets the "WayPointList" element
     */
    public net.opengis.xls.WayPointListType getWayPointList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.WayPointListType target = null;
            target = (net.opengis.xls.WayPointListType)get_store().find_element_user(WAYPOINTLIST$0, 0);
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
            target = (net.opengis.xls.WayPointListType)get_store().find_element_user(WAYPOINTLIST$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.WayPointListType)get_store().add_element_user(WAYPOINTLIST$0);
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
            target = (net.opengis.xls.WayPointListType)get_store().add_element_user(WAYPOINTLIST$0);
            return target;
        }
    }
}
