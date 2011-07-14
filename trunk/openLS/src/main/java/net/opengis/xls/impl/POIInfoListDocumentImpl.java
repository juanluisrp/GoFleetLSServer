/*
 * An XML document type.
 * Localname: POIInfoList
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.POIInfoListDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one POIInfoList(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class POIInfoListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.POIInfoListDocument
{
    private static final long serialVersionUID = 1L;
    
    public POIInfoListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POIINFOLIST$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "POIInfoList");
    
    
    /**
     * Gets the "POIInfoList" element
     */
    public net.opengis.xls.POIInfoListType getPOIInfoList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.POIInfoListType target = null;
            target = (net.opengis.xls.POIInfoListType)get_store().find_element_user(POIINFOLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "POIInfoList" element
     */
    public void setPOIInfoList(net.opengis.xls.POIInfoListType poiInfoList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.POIInfoListType target = null;
            target = (net.opengis.xls.POIInfoListType)get_store().find_element_user(POIINFOLIST$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.POIInfoListType)get_store().add_element_user(POIINFOLIST$0);
            }
            target.set(poiInfoList);
        }
    }
    
    /**
     * Appends and returns a new empty "POIInfoList" element
     */
    public net.opengis.xls.POIInfoListType addNewPOIInfoList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.POIInfoListType target = null;
            target = (net.opengis.xls.POIInfoListType)get_store().add_element_user(POIINFOLIST$0);
            return target;
        }
    }
}
