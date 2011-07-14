/*
 * An XML document type.
 * Localname: _WayPoint
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.WayPointDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one _WayPoint(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class WayPointDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.WayPointDocument
{
    private static final long serialVersionUID = 1L;
    
    public WayPointDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WAYPOINT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_WayPoint");
    private static final org.apache.xmlbeans.QNameSet WAYPOINT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "ViaPoint"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_WayPoint"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "StartPoint"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "EndPoint"),
    });
    
    
    /**
     * Gets the "_WayPoint" element
     */
    public net.opengis.xls.AbstractWayPointType getWayPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractWayPointType target = null;
            target = (net.opengis.xls.AbstractWayPointType)get_store().find_element_user(WAYPOINT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_WayPoint" element
     */
    public void setWayPoint(net.opengis.xls.AbstractWayPointType wayPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractWayPointType target = null;
            target = (net.opengis.xls.AbstractWayPointType)get_store().find_element_user(WAYPOINT$1, 0);
            if (target == null)
            {
                target = (net.opengis.xls.AbstractWayPointType)get_store().add_element_user(WAYPOINT$0);
            }
            target.set(wayPoint);
        }
    }
    
    /**
     * Appends and returns a new empty "_WayPoint" element
     */
    public net.opengis.xls.AbstractWayPointType addNewWayPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractWayPointType target = null;
            target = (net.opengis.xls.AbstractWayPointType)get_store().add_element_user(WAYPOINT$0);
            return target;
        }
    }
}
