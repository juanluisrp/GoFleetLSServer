/*
 * An XML document type.
 * Localname: _StreetLocation
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.StreetLocationDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one _StreetLocation(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class StreetLocationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.StreetLocationDocument
{
    private static final long serialVersionUID = 1L;
    
    public StreetLocationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STREETLOCATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_StreetLocation");
    private static final org.apache.xmlbeans.QNameSet STREETLOCATION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Building"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_StreetLocation"),
    });
    
    
    /**
     * Gets the "_StreetLocation" element
     */
    public net.opengis.xls.AbstractStreetLocatorType getStreetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractStreetLocatorType target = null;
            target = (net.opengis.xls.AbstractStreetLocatorType)get_store().find_element_user(STREETLOCATION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_StreetLocation" element
     */
    public void setStreetLocation(net.opengis.xls.AbstractStreetLocatorType streetLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractStreetLocatorType target = null;
            target = (net.opengis.xls.AbstractStreetLocatorType)get_store().find_element_user(STREETLOCATION$1, 0);
            if (target == null)
            {
                target = (net.opengis.xls.AbstractStreetLocatorType)get_store().add_element_user(STREETLOCATION$0);
            }
            target.set(streetLocation);
        }
    }
    
    /**
     * Appends and returns a new empty "_StreetLocation" element
     */
    public net.opengis.xls.AbstractStreetLocatorType addNewStreetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractStreetLocatorType target = null;
            target = (net.opengis.xls.AbstractStreetLocatorType)get_store().add_element_user(STREETLOCATION$0);
            return target;
        }
    }
}
