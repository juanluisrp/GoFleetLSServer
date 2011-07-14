/*
 * XML Type:  WayPointListType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.WayPointListType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML WayPointListType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class WayPointListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.WayPointListType
{
    private static final long serialVersionUID = 1L;
    
    public WayPointListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STARTPOINT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "StartPoint");
    private static final javax.xml.namespace.QName VIAPOINT$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "ViaPoint");
    private static final javax.xml.namespace.QName ENDPOINT$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "EndPoint");
    
    
    /**
     * Gets the "StartPoint" element
     */
    public net.opengis.xls.WayPointType getStartPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.WayPointType target = null;
            target = (net.opengis.xls.WayPointType)get_store().find_element_user(STARTPOINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StartPoint" element
     */
    public void setStartPoint(net.opengis.xls.WayPointType startPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.WayPointType target = null;
            target = (net.opengis.xls.WayPointType)get_store().find_element_user(STARTPOINT$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.WayPointType)get_store().add_element_user(STARTPOINT$0);
            }
            target.set(startPoint);
        }
    }
    
    /**
     * Appends and returns a new empty "StartPoint" element
     */
    public net.opengis.xls.WayPointType addNewStartPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.WayPointType target = null;
            target = (net.opengis.xls.WayPointType)get_store().add_element_user(STARTPOINT$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "ViaPoint" elements
     */
    public net.opengis.xls.WayPointType[] getViaPointArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VIAPOINT$2, targetList);
            net.opengis.xls.WayPointType[] result = new net.opengis.xls.WayPointType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ViaPoint" element
     */
    public net.opengis.xls.WayPointType getViaPointArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.WayPointType target = null;
            target = (net.opengis.xls.WayPointType)get_store().find_element_user(VIAPOINT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ViaPoint" element
     */
    public int sizeOfViaPointArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VIAPOINT$2);
        }
    }
    
    /**
     * Sets array of all "ViaPoint" element
     */
    public void setViaPointArray(net.opengis.xls.WayPointType[] viaPointArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(viaPointArray, VIAPOINT$2);
        }
    }
    
    /**
     * Sets ith "ViaPoint" element
     */
    public void setViaPointArray(int i, net.opengis.xls.WayPointType viaPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.WayPointType target = null;
            target = (net.opengis.xls.WayPointType)get_store().find_element_user(VIAPOINT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(viaPoint);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ViaPoint" element
     */
    public net.opengis.xls.WayPointType insertNewViaPoint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.WayPointType target = null;
            target = (net.opengis.xls.WayPointType)get_store().insert_element_user(VIAPOINT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ViaPoint" element
     */
    public net.opengis.xls.WayPointType addNewViaPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.WayPointType target = null;
            target = (net.opengis.xls.WayPointType)get_store().add_element_user(VIAPOINT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "ViaPoint" element
     */
    public void removeViaPoint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VIAPOINT$2, i);
        }
    }
    
    /**
     * Gets the "EndPoint" element
     */
    public net.opengis.xls.WayPointType getEndPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.WayPointType target = null;
            target = (net.opengis.xls.WayPointType)get_store().find_element_user(ENDPOINT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EndPoint" element
     */
    public void setEndPoint(net.opengis.xls.WayPointType endPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.WayPointType target = null;
            target = (net.opengis.xls.WayPointType)get_store().find_element_user(ENDPOINT$4, 0);
            if (target == null)
            {
                target = (net.opengis.xls.WayPointType)get_store().add_element_user(ENDPOINT$4);
            }
            target.set(endPoint);
        }
    }
    
    /**
     * Appends and returns a new empty "EndPoint" element
     */
    public net.opengis.xls.WayPointType addNewEndPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.WayPointType target = null;
            target = (net.opengis.xls.WayPointType)get_store().add_element_user(ENDPOINT$4);
            return target;
        }
    }
}
