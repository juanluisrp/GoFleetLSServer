/*
 * XML Type:  AbstractAddressType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.AbstractAddressType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML AbstractAddressType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class AbstractAddressTypeImpl extends net.opengis.xls.impl.AbstractLocationTypeImpl implements net.opengis.xls.AbstractAddressType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractAddressTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESSEE$0 = 
        new javax.xml.namespace.QName("", "addressee");
    private static final javax.xml.namespace.QName COUNTRYCODE$2 = 
        new javax.xml.namespace.QName("", "countryCode");
    private static final javax.xml.namespace.QName LANGUAGE$4 = 
        new javax.xml.namespace.QName("", "language");
    
    
    /**
     * Gets the "addressee" attribute
     */
    public java.lang.String getAddressee()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDRESSEE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "addressee" attribute
     */
    public org.apache.xmlbeans.XmlString xgetAddressee()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADDRESSEE$0);
            return target;
        }
    }
    
    /**
     * True if has "addressee" attribute
     */
    public boolean isSetAddressee()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ADDRESSEE$0) != null;
        }
    }
    
    /**
     * Sets the "addressee" attribute
     */
    public void setAddressee(java.lang.String addressee)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDRESSEE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADDRESSEE$0);
            }
            target.setStringValue(addressee);
        }
    }
    
    /**
     * Sets (as xml) the "addressee" attribute
     */
    public void xsetAddressee(org.apache.xmlbeans.XmlString addressee)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADDRESSEE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ADDRESSEE$0);
            }
            target.set(addressee);
        }
    }
    
    /**
     * Unsets the "addressee" attribute
     */
    public void unsetAddressee()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ADDRESSEE$0);
        }
    }
    
    /**
     * Gets the "countryCode" attribute
     */
    public java.lang.String getCountryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNTRYCODE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "countryCode" attribute
     */
    public net.opengis.xls.CountryCodeType xgetCountryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.CountryCodeType target = null;
            target = (net.opengis.xls.CountryCodeType)get_store().find_attribute_user(COUNTRYCODE$2);
            return target;
        }
    }
    
    /**
     * Sets the "countryCode" attribute
     */
    public void setCountryCode(java.lang.String countryCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNTRYCODE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNTRYCODE$2);
            }
            target.setStringValue(countryCode);
        }
    }
    
    /**
     * Sets (as xml) the "countryCode" attribute
     */
    public void xsetCountryCode(net.opengis.xls.CountryCodeType countryCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.CountryCodeType target = null;
            target = (net.opengis.xls.CountryCodeType)get_store().find_attribute_user(COUNTRYCODE$2);
            if (target == null)
            {
                target = (net.opengis.xls.CountryCodeType)get_store().add_attribute_user(COUNTRYCODE$2);
            }
            target.set(countryCode);
        }
    }
    
    /**
     * Gets the "language" attribute
     */
    public java.lang.String getLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGE$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "language" attribute
     */
    public org.apache.xmlbeans.XmlLanguage xgetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANGUAGE$4);
            return target;
        }
    }
    
    /**
     * True if has "language" attribute
     */
    public boolean isSetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LANGUAGE$4) != null;
        }
    }
    
    /**
     * Sets the "language" attribute
     */
    public void setLanguage(java.lang.String language)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANGUAGE$4);
            }
            target.setStringValue(language);
        }
    }
    
    /**
     * Sets (as xml) the "language" attribute
     */
    public void xsetLanguage(org.apache.xmlbeans.XmlLanguage language)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANGUAGE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANGUAGE$4);
            }
            target.set(language);
        }
    }
    
    /**
     * Unsets the "language" attribute
     */
    public void unsetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LANGUAGE$4);
        }
    }
}
