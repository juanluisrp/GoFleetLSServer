/*
 * An XML document type.
 * Localname: POI
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.POIDocument2
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one POI(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class POIDocument2Impl extends net.opengis.xls.impl.POIDocumentImpl implements net.opengis.xls.POIDocument2
{
    private static final long serialVersionUID = 1L;
    
    public POIDocument2Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POI2$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "POI");
    
    
    /**
     * Gets the "POI" element
     */
    public net.opengis.xls.PointOfInterestType getPOI2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.PointOfInterestType target = null;
            target = (net.opengis.xls.PointOfInterestType)get_store().find_element_user(POI2$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "POI" element
     */
    public void setPOI2(net.opengis.xls.PointOfInterestType poi2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.PointOfInterestType target = null;
            target = (net.opengis.xls.PointOfInterestType)get_store().find_element_user(POI2$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.PointOfInterestType)get_store().add_element_user(POI2$0);
            }
            target.set(poi2);
        }
    }
    
    /**
     * Appends and returns a new empty "POI" element
     */
    public net.opengis.xls.PointOfInterestType addNewPOI2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.PointOfInterestType target = null;
            target = (net.opengis.xls.PointOfInterestType)get_store().add_element_user(POI2$0);
            return target;
        }
    }
}
