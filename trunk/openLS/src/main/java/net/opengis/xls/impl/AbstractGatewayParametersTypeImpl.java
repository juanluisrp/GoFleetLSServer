/*
 * XML Type:  AbstractGatewayParametersType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.AbstractGatewayParametersType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML AbstractGatewayParametersType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class AbstractGatewayParametersTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.AbstractGatewayParametersType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractGatewayParametersTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQUESTEDQOP$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "RequestedQoP");
    private static final javax.xml.namespace.QName LOCATIONTYPE$2 = 
        new javax.xml.namespace.QName("", "locationType");
    private static final javax.xml.namespace.QName REQUESTEDSRSNAME$4 = 
        new javax.xml.namespace.QName("", "requestedsrsName");
    private static final javax.xml.namespace.QName PRIORITY$6 = 
        new javax.xml.namespace.QName("", "priority");
    
    
    /**
     * Gets the "RequestedQoP" element
     */
    public net.opengis.xls.QualityOfPositionType getRequestedQoP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.QualityOfPositionType target = null;
            target = (net.opengis.xls.QualityOfPositionType)get_store().find_element_user(REQUESTEDQOP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "RequestedQoP" element
     */
    public boolean isSetRequestedQoP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUESTEDQOP$0) != 0;
        }
    }
    
    /**
     * Sets the "RequestedQoP" element
     */
    public void setRequestedQoP(net.opengis.xls.QualityOfPositionType requestedQoP)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.QualityOfPositionType target = null;
            target = (net.opengis.xls.QualityOfPositionType)get_store().find_element_user(REQUESTEDQOP$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.QualityOfPositionType)get_store().add_element_user(REQUESTEDQOP$0);
            }
            target.set(requestedQoP);
        }
    }
    
    /**
     * Appends and returns a new empty "RequestedQoP" element
     */
    public net.opengis.xls.QualityOfPositionType addNewRequestedQoP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.QualityOfPositionType target = null;
            target = (net.opengis.xls.QualityOfPositionType)get_store().add_element_user(REQUESTEDQOP$0);
            return target;
        }
    }
    
    /**
     * Unsets the "RequestedQoP" element
     */
    public void unsetRequestedQoP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUESTEDQOP$0, 0);
        }
    }
    
    /**
     * Gets the "locationType" attribute
     */
    public net.opengis.xls.AbstractGatewayParametersType.LocationType.Enum getLocationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATIONTYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LOCATIONTYPE$2);
            }
            if (target == null)
            {
                return null;
            }
            return (net.opengis.xls.AbstractGatewayParametersType.LocationType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "locationType" attribute
     */
    public net.opengis.xls.AbstractGatewayParametersType.LocationType xgetLocationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractGatewayParametersType.LocationType target = null;
            target = (net.opengis.xls.AbstractGatewayParametersType.LocationType)get_store().find_attribute_user(LOCATIONTYPE$2);
            if (target == null)
            {
                target = (net.opengis.xls.AbstractGatewayParametersType.LocationType)get_default_attribute_value(LOCATIONTYPE$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "locationType" attribute
     */
    public boolean isSetLocationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LOCATIONTYPE$2) != null;
        }
    }
    
    /**
     * Sets the "locationType" attribute
     */
    public void setLocationType(net.opengis.xls.AbstractGatewayParametersType.LocationType.Enum locationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATIONTYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCATIONTYPE$2);
            }
            target.setEnumValue(locationType);
        }
    }
    
    /**
     * Sets (as xml) the "locationType" attribute
     */
    public void xsetLocationType(net.opengis.xls.AbstractGatewayParametersType.LocationType locationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractGatewayParametersType.LocationType target = null;
            target = (net.opengis.xls.AbstractGatewayParametersType.LocationType)get_store().find_attribute_user(LOCATIONTYPE$2);
            if (target == null)
            {
                target = (net.opengis.xls.AbstractGatewayParametersType.LocationType)get_store().add_attribute_user(LOCATIONTYPE$2);
            }
            target.set(locationType);
        }
    }
    
    /**
     * Unsets the "locationType" attribute
     */
    public void unsetLocationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LOCATIONTYPE$2);
        }
    }
    
    /**
     * Gets the "requestedsrsName" attribute
     */
    public java.lang.String getRequestedsrsName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUESTEDSRSNAME$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "requestedsrsName" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetRequestedsrsName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(REQUESTEDSRSNAME$4);
            return target;
        }
    }
    
    /**
     * True if has "requestedsrsName" attribute
     */
    public boolean isSetRequestedsrsName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REQUESTEDSRSNAME$4) != null;
        }
    }
    
    /**
     * Sets the "requestedsrsName" attribute
     */
    public void setRequestedsrsName(java.lang.String requestedsrsName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUESTEDSRSNAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REQUESTEDSRSNAME$4);
            }
            target.setStringValue(requestedsrsName);
        }
    }
    
    /**
     * Sets (as xml) the "requestedsrsName" attribute
     */
    public void xsetRequestedsrsName(org.apache.xmlbeans.XmlAnyURI requestedsrsName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(REQUESTEDSRSNAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(REQUESTEDSRSNAME$4);
            }
            target.set(requestedsrsName);
        }
    }
    
    /**
     * Unsets the "requestedsrsName" attribute
     */
    public void unsetRequestedsrsName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REQUESTEDSRSNAME$4);
        }
    }
    
    /**
     * Gets the "priority" attribute
     */
    public net.opengis.xls.AbstractGatewayParametersType.Priority.Enum getPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRIORITY$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PRIORITY$6);
            }
            if (target == null)
            {
                return null;
            }
            return (net.opengis.xls.AbstractGatewayParametersType.Priority.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "priority" attribute
     */
    public net.opengis.xls.AbstractGatewayParametersType.Priority xgetPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractGatewayParametersType.Priority target = null;
            target = (net.opengis.xls.AbstractGatewayParametersType.Priority)get_store().find_attribute_user(PRIORITY$6);
            if (target == null)
            {
                target = (net.opengis.xls.AbstractGatewayParametersType.Priority)get_default_attribute_value(PRIORITY$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "priority" attribute
     */
    public boolean isSetPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PRIORITY$6) != null;
        }
    }
    
    /**
     * Sets the "priority" attribute
     */
    public void setPriority(net.opengis.xls.AbstractGatewayParametersType.Priority.Enum priority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRIORITY$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRIORITY$6);
            }
            target.setEnumValue(priority);
        }
    }
    
    /**
     * Sets (as xml) the "priority" attribute
     */
    public void xsetPriority(net.opengis.xls.AbstractGatewayParametersType.Priority priority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractGatewayParametersType.Priority target = null;
            target = (net.opengis.xls.AbstractGatewayParametersType.Priority)get_store().find_attribute_user(PRIORITY$6);
            if (target == null)
            {
                target = (net.opengis.xls.AbstractGatewayParametersType.Priority)get_store().add_attribute_user(PRIORITY$6);
            }
            target.set(priority);
        }
    }
    
    /**
     * Unsets the "priority" attribute
     */
    public void unsetPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PRIORITY$6);
        }
    }
    /**
     * An XML locationType(@).
     *
     * This is an atomic type that is a restriction of net.opengis.xls.AbstractGatewayParametersType$LocationType.
     */
    public static class LocationTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements net.opengis.xls.AbstractGatewayParametersType.LocationType
    {
        private static final long serialVersionUID = 1L;
        
        public LocationTypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected LocationTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML priority(@).
     *
     * This is an atomic type that is a restriction of net.opengis.xls.AbstractGatewayParametersType$Priority.
     */
    public static class PriorityImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements net.opengis.xls.AbstractGatewayParametersType.Priority
    {
        private static final long serialVersionUID = 1L;
        
        public PriorityImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected PriorityImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
