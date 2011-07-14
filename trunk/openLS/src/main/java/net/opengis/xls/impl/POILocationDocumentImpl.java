/*
 * An XML document type.
 * Localname: POILocation
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.POILocationDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one POILocation(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class POILocationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.POILocationDocument
{
    private static final long serialVersionUID = 1L;
    
    public POILocationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POILOCATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "POILocation");
    
    
    /**
     * Gets the "POILocation" element
     */
    public net.opengis.xls.POILocationType getPOILocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.POILocationType target = null;
            target = (net.opengis.xls.POILocationType)get_store().find_element_user(POILOCATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "POILocation" element
     */
    public void setPOILocation(net.opengis.xls.POILocationType poiLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.POILocationType target = null;
            target = (net.opengis.xls.POILocationType)get_store().find_element_user(POILOCATION$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.POILocationType)get_store().add_element_user(POILOCATION$0);
            }
            target.set(poiLocation);
        }
    }
    
    /**
     * Appends and returns a new empty "POILocation" element
     */
    public net.opengis.xls.POILocationType addNewPOILocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.POILocationType target = null;
            target = (net.opengis.xls.POILocationType)get_store().add_element_user(POILOCATION$0);
            return target;
        }
    }
}
