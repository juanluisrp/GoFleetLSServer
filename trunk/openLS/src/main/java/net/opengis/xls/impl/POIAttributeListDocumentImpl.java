/*
 * An XML document type.
 * Localname: POIAttributeList
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.POIAttributeListDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one POIAttributeList(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class POIAttributeListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.POIAttributeListDocument
{
    private static final long serialVersionUID = 1L;
    
    public POIAttributeListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POIATTRIBUTELIST$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "POIAttributeList");
    
    
    /**
     * Gets the "POIAttributeList" element
     */
    public net.opengis.xls.POIAttributeListType getPOIAttributeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.POIAttributeListType target = null;
            target = (net.opengis.xls.POIAttributeListType)get_store().find_element_user(POIATTRIBUTELIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "POIAttributeList" element
     */
    public void setPOIAttributeList(net.opengis.xls.POIAttributeListType poiAttributeList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.POIAttributeListType target = null;
            target = (net.opengis.xls.POIAttributeListType)get_store().find_element_user(POIATTRIBUTELIST$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.POIAttributeListType)get_store().add_element_user(POIATTRIBUTELIST$0);
            }
            target.set(poiAttributeList);
        }
    }
    
    /**
     * Appends and returns a new empty "POIAttributeList" element
     */
    public net.opengis.xls.POIAttributeListType addNewPOIAttributeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.POIAttributeListType target = null;
            target = (net.opengis.xls.POIAttributeListType)get_store().add_element_user(POIATTRIBUTELIST$0);
            return target;
        }
    }
}
