/*
 * XML Type:  DirectoryResponseType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.DirectoryResponseType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML DirectoryResponseType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class DirectoryResponseTypeImpl extends net.opengis.xls.impl.AbstractResponseParametersTypeImpl implements net.opengis.xls.DirectoryResponseType
{
    private static final long serialVersionUID = 1L;
    
    public DirectoryResponseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POICONTEXT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "POIContext");
    
    
    /**
     * Gets array of all "POIContext" elements
     */
    public net.opengis.xls.POIWithDistanceType[] getPOIContextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(POICONTEXT$0, targetList);
            net.opengis.xls.POIWithDistanceType[] result = new net.opengis.xls.POIWithDistanceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "POIContext" element
     */
    public net.opengis.xls.POIWithDistanceType getPOIContextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.POIWithDistanceType target = null;
            target = (net.opengis.xls.POIWithDistanceType)get_store().find_element_user(POICONTEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "POIContext" element
     */
    public int sizeOfPOIContextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POICONTEXT$0);
        }
    }
    
    /**
     * Sets array of all "POIContext" element
     */
    public void setPOIContextArray(net.opengis.xls.POIWithDistanceType[] poiContextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(poiContextArray, POICONTEXT$0);
        }
    }
    
    /**
     * Sets ith "POIContext" element
     */
    public void setPOIContextArray(int i, net.opengis.xls.POIWithDistanceType poiContext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.POIWithDistanceType target = null;
            target = (net.opengis.xls.POIWithDistanceType)get_store().find_element_user(POICONTEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(poiContext);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "POIContext" element
     */
    public net.opengis.xls.POIWithDistanceType insertNewPOIContext(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.POIWithDistanceType target = null;
            target = (net.opengis.xls.POIWithDistanceType)get_store().insert_element_user(POICONTEXT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "POIContext" element
     */
    public net.opengis.xls.POIWithDistanceType addNewPOIContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.POIWithDistanceType target = null;
            target = (net.opengis.xls.POIWithDistanceType)get_store().add_element_user(POICONTEXT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "POIContext" element
     */
    public void removePOIContext(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POICONTEXT$0, i);
        }
    }
}
