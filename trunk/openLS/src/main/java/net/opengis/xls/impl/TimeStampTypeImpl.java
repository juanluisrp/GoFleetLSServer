/*
 * XML Type:  TimeStampType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.TimeStampType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML TimeStampType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class TimeStampTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.TimeStampType
{
    private static final long serialVersionUID = 1L;
    
    public TimeStampTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BEGIN$0 = 
        new javax.xml.namespace.QName("", "begin");
    private static final javax.xml.namespace.QName DURATION$2 = 
        new javax.xml.namespace.QName("", "duration");
    
    
    /**
     * Gets the "begin" attribute
     */
    public java.util.Calendar getBegin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BEGIN$0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "begin" attribute
     */
    public org.apache.xmlbeans.XmlDateTime xgetBegin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(BEGIN$0);
            return target;
        }
    }
    
    /**
     * Sets the "begin" attribute
     */
    public void setBegin(java.util.Calendar begin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BEGIN$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BEGIN$0);
            }
            target.setCalendarValue(begin);
        }
    }
    
    /**
     * Sets (as xml) the "begin" attribute
     */
    public void xsetBegin(org.apache.xmlbeans.XmlDateTime begin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(BEGIN$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(BEGIN$0);
            }
            target.set(begin);
        }
    }
    
    /**
     * Gets the "duration" attribute
     */
    public org.apache.xmlbeans.GDuration getDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DURATION$2);
            if (target == null)
            {
                return null;
            }
            return target.getGDurationValue();
        }
    }
    
    /**
     * Gets (as xml) the "duration" attribute
     */
    public org.apache.xmlbeans.XmlDuration xgetDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDuration target = null;
            target = (org.apache.xmlbeans.XmlDuration)get_store().find_attribute_user(DURATION$2);
            return target;
        }
    }
    
    /**
     * True if has "duration" attribute
     */
    public boolean isSetDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DURATION$2) != null;
        }
    }
    
    /**
     * Sets the "duration" attribute
     */
    public void setDuration(org.apache.xmlbeans.GDuration duration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DURATION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DURATION$2);
            }
            target.setGDurationValue(duration);
        }
    }
    
    /**
     * Sets (as xml) the "duration" attribute
     */
    public void xsetDuration(org.apache.xmlbeans.XmlDuration duration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDuration target = null;
            target = (org.apache.xmlbeans.XmlDuration)get_store().find_attribute_user(DURATION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDuration)get_store().add_attribute_user(DURATION$2);
            }
            target.set(duration);
        }
    }
    
    /**
     * Unsets the "duration" attribute
     */
    public void unsetDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DURATION$2);
        }
    }
}
