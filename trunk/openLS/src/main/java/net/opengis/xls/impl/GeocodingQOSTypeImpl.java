/*
 * XML Type:  GeocodingQOSType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.GeocodingQOSType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML GeocodingQOSType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class GeocodingQOSTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.GeocodingQOSType
{
    private static final long serialVersionUID = 1L;
    
    public GeocodingQOSTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCURACY$0 = 
        new javax.xml.namespace.QName("", "accuracy");
    private static final javax.xml.namespace.QName MATCHTYPE$2 = 
        new javax.xml.namespace.QName("", "matchType");
    
    
    /**
     * Gets the "accuracy" attribute
     */
    public float getAccuracy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCURACY$0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "accuracy" attribute
     */
    public org.apache.xmlbeans.XmlFloat xgetAccuracy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_attribute_user(ACCURACY$0);
            return target;
        }
    }
    
    /**
     * True if has "accuracy" attribute
     */
    public boolean isSetAccuracy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACCURACY$0) != null;
        }
    }
    
    /**
     * Sets the "accuracy" attribute
     */
    public void setAccuracy(float accuracy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCURACY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACCURACY$0);
            }
            target.setFloatValue(accuracy);
        }
    }
    
    /**
     * Sets (as xml) the "accuracy" attribute
     */
    public void xsetAccuracy(org.apache.xmlbeans.XmlFloat accuracy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_attribute_user(ACCURACY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_attribute_user(ACCURACY$0);
            }
            target.set(accuracy);
        }
    }
    
    /**
     * Unsets the "accuracy" attribute
     */
    public void unsetAccuracy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACCURACY$0);
        }
    }
    
    /**
     * Gets the "matchType" attribute
     */
    public java.lang.String getMatchType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MATCHTYPE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "matchType" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMatchType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MATCHTYPE$2);
            return target;
        }
    }
    
    /**
     * True if has "matchType" attribute
     */
    public boolean isSetMatchType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MATCHTYPE$2) != null;
        }
    }
    
    /**
     * Sets the "matchType" attribute
     */
    public void setMatchType(java.lang.String matchType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MATCHTYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MATCHTYPE$2);
            }
            target.setStringValue(matchType);
        }
    }
    
    /**
     * Sets (as xml) the "matchType" attribute
     */
    public void xsetMatchType(org.apache.xmlbeans.XmlString matchType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MATCHTYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MATCHTYPE$2);
            }
            target.set(matchType);
        }
    }
    
    /**
     * Unsets the "matchType" attribute
     */
    public void unsetMatchType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MATCHTYPE$2);
        }
    }
}
