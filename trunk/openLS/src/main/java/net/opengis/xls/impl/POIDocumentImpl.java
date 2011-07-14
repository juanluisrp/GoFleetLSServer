/*
 * An XML document type.
 * Localname: _POI
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.POIDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one _POI(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class POIDocumentImpl extends net.opengis.xls.impl.LocationDocumentImpl implements net.opengis.xls.POIDocument
{
    private static final long serialVersionUID = 1L;
    
    public POIDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POI$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_POI");
    private static final org.apache.xmlbeans.QNameSet POI$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "POI"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_POI"),
    });
    
    
    /**
     * Gets the "_POI" element
     */
    public net.opengis.xls.AbstractPOIType getPOI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractPOIType target = null;
            target = (net.opengis.xls.AbstractPOIType)get_store().find_element_user(POI$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_POI" element
     */
    public void setPOI(net.opengis.xls.AbstractPOIType poi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractPOIType target = null;
            target = (net.opengis.xls.AbstractPOIType)get_store().find_element_user(POI$1, 0);
            if (target == null)
            {
                target = (net.opengis.xls.AbstractPOIType)get_store().add_element_user(POI$0);
            }
            target.set(poi);
        }
    }
    
    /**
     * Appends and returns a new empty "_POI" element
     */
    public net.opengis.xls.AbstractPOIType addNewPOI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractPOIType target = null;
            target = (net.opengis.xls.AbstractPOIType)get_store().add_element_user(POI$0);
            return target;
        }
    }
}
