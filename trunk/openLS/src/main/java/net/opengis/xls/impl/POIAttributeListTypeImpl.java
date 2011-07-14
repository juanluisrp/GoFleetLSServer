/*
 * XML Type:  POIAttributeListType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.POIAttributeListType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML POIAttributeListType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class POIAttributeListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.POIAttributeListType
{
    private static final long serialVersionUID = 1L;
    
    public POIAttributeListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFERENCESYSTEM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "ReferenceSystem");
    private static final javax.xml.namespace.QName POIINFOLIST$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "POIInfoList");
    
    
    /**
     * Gets the "ReferenceSystem" element
     */
    public net.opengis.xls.ReferenceSystemType getReferenceSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ReferenceSystemType target = null;
            target = (net.opengis.xls.ReferenceSystemType)get_store().find_element_user(REFERENCESYSTEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ReferenceSystem" element
     */
    public boolean isSetReferenceSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCESYSTEM$0) != 0;
        }
    }
    
    /**
     * Sets the "ReferenceSystem" element
     */
    public void setReferenceSystem(net.opengis.xls.ReferenceSystemType referenceSystem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ReferenceSystemType target = null;
            target = (net.opengis.xls.ReferenceSystemType)get_store().find_element_user(REFERENCESYSTEM$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.ReferenceSystemType)get_store().add_element_user(REFERENCESYSTEM$0);
            }
            target.set(referenceSystem);
        }
    }
    
    /**
     * Appends and returns a new empty "ReferenceSystem" element
     */
    public net.opengis.xls.ReferenceSystemType addNewReferenceSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ReferenceSystemType target = null;
            target = (net.opengis.xls.ReferenceSystemType)get_store().add_element_user(REFERENCESYSTEM$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ReferenceSystem" element
     */
    public void unsetReferenceSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCESYSTEM$0, 0);
        }
    }
    
    /**
     * Gets the "POIInfoList" element
     */
    public net.opengis.xls.POIInfoListType getPOIInfoList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.POIInfoListType target = null;
            target = (net.opengis.xls.POIInfoListType)get_store().find_element_user(POIINFOLIST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "POIInfoList" element
     */
    public boolean isSetPOIInfoList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POIINFOLIST$2) != 0;
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
            target = (net.opengis.xls.POIInfoListType)get_store().find_element_user(POIINFOLIST$2, 0);
            if (target == null)
            {
                target = (net.opengis.xls.POIInfoListType)get_store().add_element_user(POIINFOLIST$2);
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
            target = (net.opengis.xls.POIInfoListType)get_store().add_element_user(POIINFOLIST$2);
            return target;
        }
    }
    
    /**
     * Unsets the "POIInfoList" element
     */
    public void unsetPOIInfoList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POIINFOLIST$2, 0);
        }
    }
}
