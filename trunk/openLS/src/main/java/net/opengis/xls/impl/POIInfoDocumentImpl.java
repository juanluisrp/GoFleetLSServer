/*
 * An XML document type.
 * Localname: POIInfo
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.POIInfoDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one POIInfo(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class POIInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.POIInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public POIInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POIINFO$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "POIInfo");
    
    
    /**
     * Gets the "POIInfo" element
     */
    public net.opengis.xls.POIInfoType getPOIInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.POIInfoType target = null;
            target = (net.opengis.xls.POIInfoType)get_store().find_element_user(POIINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "POIInfo" element
     */
    public void setPOIInfo(net.opengis.xls.POIInfoType poiInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.POIInfoType target = null;
            target = (net.opengis.xls.POIInfoType)get_store().find_element_user(POIINFO$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.POIInfoType)get_store().add_element_user(POIINFO$0);
            }
            target.set(poiInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "POIInfo" element
     */
    public net.opengis.xls.POIInfoType addNewPOIInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.POIInfoType target = null;
            target = (net.opengis.xls.POIInfoType)get_store().add_element_user(POIINFO$0);
            return target;
        }
    }
}
