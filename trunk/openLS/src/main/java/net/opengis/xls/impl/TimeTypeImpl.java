/*
 * XML Type:  TimeType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.TimeType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML TimeType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class TimeTypeImpl extends net.opengis.xls.impl.TimeStampTypeImpl implements net.opengis.xls.TimeType
{
    private static final long serialVersionUID = 1L;
    
    public TimeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UTCOFFSET$0 = 
        new javax.xml.namespace.QName("", "utcOffset");
    
    
    /**
     * Gets the "utcOffset" attribute
     */
    public java.math.BigInteger getUtcOffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UTCOFFSET$0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "utcOffset" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetUtcOffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(UTCOFFSET$0);
            return target;
        }
    }
    
    /**
     * True if has "utcOffset" attribute
     */
    public boolean isSetUtcOffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(UTCOFFSET$0) != null;
        }
    }
    
    /**
     * Sets the "utcOffset" attribute
     */
    public void setUtcOffset(java.math.BigInteger utcOffset)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UTCOFFSET$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UTCOFFSET$0);
            }
            target.setBigIntegerValue(utcOffset);
        }
    }
    
    /**
     * Sets (as xml) the "utcOffset" attribute
     */
    public void xsetUtcOffset(org.apache.xmlbeans.XmlInteger utcOffset)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(UTCOFFSET$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(UTCOFFSET$0);
            }
            target.set(utcOffset);
        }
    }
    
    /**
     * Unsets the "utcOffset" attribute
     */
    public void unsetUtcOffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(UTCOFFSET$0);
        }
    }
}
