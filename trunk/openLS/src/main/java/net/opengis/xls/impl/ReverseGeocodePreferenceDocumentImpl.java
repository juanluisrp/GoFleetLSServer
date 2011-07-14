/*
 * An XML document type.
 * Localname: ReverseGeocodePreference
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.ReverseGeocodePreferenceDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one ReverseGeocodePreference(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class ReverseGeocodePreferenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.ReverseGeocodePreferenceDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReverseGeocodePreferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REVERSEGEOCODEPREFERENCE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "ReverseGeocodePreference");
    
    
    /**
     * Gets the "ReverseGeocodePreference" element
     */
    public net.opengis.xls.ReverseGeocodePreferenceType.Enum getReverseGeocodePreference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REVERSEGEOCODEPREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (net.opengis.xls.ReverseGeocodePreferenceType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReverseGeocodePreference" element
     */
    public net.opengis.xls.ReverseGeocodePreferenceType xgetReverseGeocodePreference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ReverseGeocodePreferenceType target = null;
            target = (net.opengis.xls.ReverseGeocodePreferenceType)get_store().find_element_user(REVERSEGEOCODEPREFERENCE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ReverseGeocodePreference" element
     */
    public void setReverseGeocodePreference(net.opengis.xls.ReverseGeocodePreferenceType.Enum reverseGeocodePreference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REVERSEGEOCODEPREFERENCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REVERSEGEOCODEPREFERENCE$0);
            }
            target.setEnumValue(reverseGeocodePreference);
        }
    }
    
    /**
     * Sets (as xml) the "ReverseGeocodePreference" element
     */
    public void xsetReverseGeocodePreference(net.opengis.xls.ReverseGeocodePreferenceType reverseGeocodePreference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ReverseGeocodePreferenceType target = null;
            target = (net.opengis.xls.ReverseGeocodePreferenceType)get_store().find_element_user(REVERSEGEOCODEPREFERENCE$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.ReverseGeocodePreferenceType)get_store().add_element_user(REVERSEGEOCODEPREFERENCE$0);
            }
            target.set(reverseGeocodePreference);
        }
    }
}
