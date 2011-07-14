/*
 * XML Type:  RouteHandleType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.RouteHandleType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML RouteHandleType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class RouteHandleTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.RouteHandleType
{
    private static final long serialVersionUID = 1L;
    
    public RouteHandleTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICEID$0 = 
        new javax.xml.namespace.QName("", "serviceID");
    private static final javax.xml.namespace.QName ROUTEID$2 = 
        new javax.xml.namespace.QName("", "routeID");
    
    
    /**
     * Gets the "serviceID" attribute
     */
    public java.lang.String getServiceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVICEID$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "serviceID" attribute
     */
    public org.apache.xmlbeans.XmlString xgetServiceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SERVICEID$0);
            return target;
        }
    }
    
    /**
     * True if has "serviceID" attribute
     */
    public boolean isSetServiceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SERVICEID$0) != null;
        }
    }
    
    /**
     * Sets the "serviceID" attribute
     */
    public void setServiceID(java.lang.String serviceID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVICEID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERVICEID$0);
            }
            target.setStringValue(serviceID);
        }
    }
    
    /**
     * Sets (as xml) the "serviceID" attribute
     */
    public void xsetServiceID(org.apache.xmlbeans.XmlString serviceID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SERVICEID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SERVICEID$0);
            }
            target.set(serviceID);
        }
    }
    
    /**
     * Unsets the "serviceID" attribute
     */
    public void unsetServiceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SERVICEID$0);
        }
    }
    
    /**
     * Gets the "routeID" attribute
     */
    public java.lang.String getRouteID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROUTEID$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "routeID" attribute
     */
    public org.apache.xmlbeans.XmlString xgetRouteID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ROUTEID$2);
            return target;
        }
    }
    
    /**
     * Sets the "routeID" attribute
     */
    public void setRouteID(java.lang.String routeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROUTEID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROUTEID$2);
            }
            target.setStringValue(routeID);
        }
    }
    
    /**
     * Sets (as xml) the "routeID" attribute
     */
    public void xsetRouteID(org.apache.xmlbeans.XmlString routeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ROUTEID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ROUTEID$2);
            }
            target.set(routeID);
        }
    }
}
