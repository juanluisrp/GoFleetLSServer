/*
 * XML Type:  GeocodeResponseType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.GeocodeResponseType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML GeocodeResponseType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class GeocodeResponseTypeImpl extends net.opengis.xls.impl.AbstractResponseParametersTypeImpl implements net.opengis.xls.GeocodeResponseType
{
    private static final long serialVersionUID = 1L;
    
    public GeocodeResponseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOCODERESPONSELIST$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "GeocodeResponseList");
    
    
    /**
     * Gets array of all "GeocodeResponseList" elements
     */
    public net.opengis.xls.GeocodeResponseListType[] getGeocodeResponseListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GEOCODERESPONSELIST$0, targetList);
            net.opengis.xls.GeocodeResponseListType[] result = new net.opengis.xls.GeocodeResponseListType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "GeocodeResponseList" element
     */
    public net.opengis.xls.GeocodeResponseListType getGeocodeResponseListArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.GeocodeResponseListType target = null;
            target = (net.opengis.xls.GeocodeResponseListType)get_store().find_element_user(GEOCODERESPONSELIST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "GeocodeResponseList" element
     */
    public int sizeOfGeocodeResponseListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GEOCODERESPONSELIST$0);
        }
    }
    
    /**
     * Sets array of all "GeocodeResponseList" element
     */
    public void setGeocodeResponseListArray(net.opengis.xls.GeocodeResponseListType[] geocodeResponseListArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(geocodeResponseListArray, GEOCODERESPONSELIST$0);
        }
    }
    
    /**
     * Sets ith "GeocodeResponseList" element
     */
    public void setGeocodeResponseListArray(int i, net.opengis.xls.GeocodeResponseListType geocodeResponseList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.GeocodeResponseListType target = null;
            target = (net.opengis.xls.GeocodeResponseListType)get_store().find_element_user(GEOCODERESPONSELIST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(geocodeResponseList);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "GeocodeResponseList" element
     */
    public net.opengis.xls.GeocodeResponseListType insertNewGeocodeResponseList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.GeocodeResponseListType target = null;
            target = (net.opengis.xls.GeocodeResponseListType)get_store().insert_element_user(GEOCODERESPONSELIST$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "GeocodeResponseList" element
     */
    public net.opengis.xls.GeocodeResponseListType addNewGeocodeResponseList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.GeocodeResponseListType target = null;
            target = (net.opengis.xls.GeocodeResponseListType)get_store().add_element_user(GEOCODERESPONSELIST$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "GeocodeResponseList" element
     */
    public void removeGeocodeResponseList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GEOCODERESPONSELIST$0, i);
        }
    }
}
