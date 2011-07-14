/*
 * XML Type:  PortrayMapResponseType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.PortrayMapResponseType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML PortrayMapResponseType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class PortrayMapResponseTypeImpl extends net.opengis.xls.impl.AbstractResponseParametersTypeImpl implements net.opengis.xls.PortrayMapResponseType
{
    private static final long serialVersionUID = 1L;
    
    public PortrayMapResponseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAP$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Map");
    
    
    /**
     * Gets array of all "Map" elements
     */
    public net.opengis.xls.MapType[] getMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MAP$0, targetList);
            net.opengis.xls.MapType[] result = new net.opengis.xls.MapType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Map" element
     */
    public net.opengis.xls.MapType getMapArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.MapType target = null;
            target = (net.opengis.xls.MapType)get_store().find_element_user(MAP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Map" element
     */
    public int sizeOfMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAP$0);
        }
    }
    
    /**
     * Sets array of all "Map" element
     */
    public void setMapArray(net.opengis.xls.MapType[] mapArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(mapArray, MAP$0);
        }
    }
    
    /**
     * Sets ith "Map" element
     */
    public void setMapArray(int i, net.opengis.xls.MapType map)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.MapType target = null;
            target = (net.opengis.xls.MapType)get_store().find_element_user(MAP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(map);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Map" element
     */
    public net.opengis.xls.MapType insertNewMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.MapType target = null;
            target = (net.opengis.xls.MapType)get_store().insert_element_user(MAP$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Map" element
     */
    public net.opengis.xls.MapType addNewMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.MapType target = null;
            target = (net.opengis.xls.MapType)get_store().add_element_user(MAP$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Map" element
     */
    public void removeMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAP$0, i);
        }
    }
}
