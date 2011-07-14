/*
 * An XML document type.
 * Localname: _Location
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.LocationDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one _Location(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class LocationDocumentImpl extends net.opengis.xls.impl.ADTDocumentImpl implements net.opengis.xls.LocationDocument
{
    private static final long serialVersionUID = 1L;
    
    public LocationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_Location");
    private static final org.apache.xmlbeans.QNameSet LOCATION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Address"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "POI"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_Location"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Position"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_Position"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_POI"),
    });
    
    
    /**
     * Gets the "_Location" element
     */
    public net.opengis.xls.AbstractLocationType getLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractLocationType target = null;
            target = (net.opengis.xls.AbstractLocationType)get_store().find_element_user(LOCATION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_Location" element
     */
    public void setLocation(net.opengis.xls.AbstractLocationType location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractLocationType target = null;
            target = (net.opengis.xls.AbstractLocationType)get_store().find_element_user(LOCATION$1, 0);
            if (target == null)
            {
                target = (net.opengis.xls.AbstractLocationType)get_store().add_element_user(LOCATION$0);
            }
            target.set(location);
        }
    }
    
    /**
     * Appends and returns a new empty "_Location" element
     */
    public net.opengis.xls.AbstractLocationType addNewLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractLocationType target = null;
            target = (net.opengis.xls.AbstractLocationType)get_store().add_element_user(LOCATION$0);
            return target;
        }
    }
}
