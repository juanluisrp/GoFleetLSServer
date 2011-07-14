/*
 * XML Type:  RouteMapRequestType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.RouteMapRequestType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML RouteMapRequestType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class RouteMapRequestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.RouteMapRequestType
{
    private static final long serialVersionUID = 1L;
    
    public RouteMapRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OUTPUT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Output");
    
    
    /**
     * Gets array of all "Output" elements
     */
    public net.opengis.xls.RouteMapOutputType[] getOutputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OUTPUT$0, targetList);
            net.opengis.xls.RouteMapOutputType[] result = new net.opengis.xls.RouteMapOutputType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Output" element
     */
    public net.opengis.xls.RouteMapOutputType getOutputArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteMapOutputType target = null;
            target = (net.opengis.xls.RouteMapOutputType)get_store().find_element_user(OUTPUT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Output" element
     */
    public int sizeOfOutputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OUTPUT$0);
        }
    }
    
    /**
     * Sets array of all "Output" element
     */
    public void setOutputArray(net.opengis.xls.RouteMapOutputType[] outputArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(outputArray, OUTPUT$0);
        }
    }
    
    /**
     * Sets ith "Output" element
     */
    public void setOutputArray(int i, net.opengis.xls.RouteMapOutputType output)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteMapOutputType target = null;
            target = (net.opengis.xls.RouteMapOutputType)get_store().find_element_user(OUTPUT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(output);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Output" element
     */
    public net.opengis.xls.RouteMapOutputType insertNewOutput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteMapOutputType target = null;
            target = (net.opengis.xls.RouteMapOutputType)get_store().insert_element_user(OUTPUT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Output" element
     */
    public net.opengis.xls.RouteMapOutputType addNewOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteMapOutputType target = null;
            target = (net.opengis.xls.RouteMapOutputType)get_store().add_element_user(OUTPUT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Output" element
     */
    public void removeOutput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OUTPUT$0, i);
        }
    }
}
