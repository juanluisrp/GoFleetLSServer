/*
 * An XML document type.
 * Localname: POIProperty
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.POIPropertyDocument2
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one POIProperty(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class POIPropertyDocument2Impl extends net.opengis.xls.impl.POIPropertyDocumentImpl implements net.opengis.xls.POIPropertyDocument2
{
    private static final long serialVersionUID = 1L;
    
    public POIPropertyDocument2Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POIPROPERTY2$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "POIProperty");
    
    
    /**
     * Gets the "POIProperty" element
     */
    public net.opengis.xls.POIPropertyType getPOIProperty2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.POIPropertyType target = null;
            target = (net.opengis.xls.POIPropertyType)get_store().find_element_user(POIPROPERTY2$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "POIProperty" element
     */
    public void setPOIProperty2(net.opengis.xls.POIPropertyType poiProperty2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.POIPropertyType target = null;
            target = (net.opengis.xls.POIPropertyType)get_store().find_element_user(POIPROPERTY2$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.POIPropertyType)get_store().add_element_user(POIPROPERTY2$0);
            }
            target.set(poiProperty2);
        }
    }
    
    /**
     * Appends and returns a new empty "POIProperty" element
     */
    public net.opengis.xls.POIPropertyType addNewPOIProperty2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.POIPropertyType target = null;
            target = (net.opengis.xls.POIPropertyType)get_store().add_element_user(POIPROPERTY2$0);
            return target;
        }
    }
}
