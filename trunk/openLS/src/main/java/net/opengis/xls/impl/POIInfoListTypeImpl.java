/*
 * XML Type:  POIInfoListType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.POIInfoListType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML POIInfoListType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class POIInfoListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.POIInfoListType
{
    private static final long serialVersionUID = 1L;
    
    public POIInfoListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POIINFO$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "POIInfo");
    
    
    /**
     * Gets array of all "POIInfo" elements
     */
    public net.opengis.xls.POIInfoType[] getPOIInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(POIINFO$0, targetList);
            net.opengis.xls.POIInfoType[] result = new net.opengis.xls.POIInfoType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "POIInfo" element
     */
    public net.opengis.xls.POIInfoType getPOIInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.POIInfoType target = null;
            target = (net.opengis.xls.POIInfoType)get_store().find_element_user(POIINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "POIInfo" element
     */
    public int sizeOfPOIInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POIINFO$0);
        }
    }
    
    /**
     * Sets array of all "POIInfo" element
     */
    public void setPOIInfoArray(net.opengis.xls.POIInfoType[] poiInfoArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(poiInfoArray, POIINFO$0);
        }
    }
    
    /**
     * Sets ith "POIInfo" element
     */
    public void setPOIInfoArray(int i, net.opengis.xls.POIInfoType poiInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.POIInfoType target = null;
            target = (net.opengis.xls.POIInfoType)get_store().find_element_user(POIINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(poiInfo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "POIInfo" element
     */
    public net.opengis.xls.POIInfoType insertNewPOIInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.POIInfoType target = null;
            target = (net.opengis.xls.POIInfoType)get_store().insert_element_user(POIINFO$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "POIInfo" element
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
    
    /**
     * Removes the ith "POIInfo" element
     */
    public void removePOIInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POIINFO$0, i);
        }
    }
}
