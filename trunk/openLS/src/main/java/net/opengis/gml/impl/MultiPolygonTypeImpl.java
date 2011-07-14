/*
 * XML Type:  MultiPolygonType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MultiPolygonType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl;
/**
 * An XML MultiPolygonType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class MultiPolygonTypeImpl extends net.opengis.gml.impl.AbstractGeometricAggregateTypeImpl implements net.opengis.gml.MultiPolygonType
{
    private static final long serialVersionUID = 1L;
    
    public MultiPolygonTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POLYGONMEMBER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "polygonMember");
    
    
    /**
     * Gets array of all "polygonMember" elements
     */
    public net.opengis.gml.PolygonPropertyType[] getPolygonMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(POLYGONMEMBER$0, targetList);
            net.opengis.gml.PolygonPropertyType[] result = new net.opengis.gml.PolygonPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "polygonMember" element
     */
    public net.opengis.gml.PolygonPropertyType getPolygonMemberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolygonPropertyType target = null;
            target = (net.opengis.gml.PolygonPropertyType)get_store().find_element_user(POLYGONMEMBER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "polygonMember" element
     */
    public int sizeOfPolygonMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POLYGONMEMBER$0);
        }
    }
    
    /**
     * Sets array of all "polygonMember" element
     */
    public void setPolygonMemberArray(net.opengis.gml.PolygonPropertyType[] polygonMemberArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(polygonMemberArray, POLYGONMEMBER$0);
        }
    }
    
    /**
     * Sets ith "polygonMember" element
     */
    public void setPolygonMemberArray(int i, net.opengis.gml.PolygonPropertyType polygonMember)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolygonPropertyType target = null;
            target = (net.opengis.gml.PolygonPropertyType)get_store().find_element_user(POLYGONMEMBER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(polygonMember);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "polygonMember" element
     */
    public net.opengis.gml.PolygonPropertyType insertNewPolygonMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolygonPropertyType target = null;
            target = (net.opengis.gml.PolygonPropertyType)get_store().insert_element_user(POLYGONMEMBER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "polygonMember" element
     */
    public net.opengis.gml.PolygonPropertyType addNewPolygonMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolygonPropertyType target = null;
            target = (net.opengis.gml.PolygonPropertyType)get_store().add_element_user(POLYGONMEMBER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "polygonMember" element
     */
    public void removePolygonMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POLYGONMEMBER$0, i);
        }
    }
}
