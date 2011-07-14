/*
 * XML Type:  PolygonType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.PolygonType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl;
/**
 * An XML PolygonType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class PolygonTypeImpl extends net.opengis.gml.impl.AbstractSurfaceTypeImpl implements net.opengis.gml.PolygonType
{
    private static final long serialVersionUID = 1L;
    
    public PolygonTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTERIOR$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "exterior");
    private static final javax.xml.namespace.QName INTERIOR$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "interior");
    
    
    /**
     * Gets the "exterior" element
     */
    public net.opengis.gml.AbstractRingPropertyType getExterior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractRingPropertyType target = null;
            target = (net.opengis.gml.AbstractRingPropertyType)get_store().find_element_user(EXTERIOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "exterior" element
     */
    public boolean isSetExterior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTERIOR$0) != 0;
        }
    }
    
    /**
     * Sets the "exterior" element
     */
    public void setExterior(net.opengis.gml.AbstractRingPropertyType exterior)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractRingPropertyType target = null;
            target = (net.opengis.gml.AbstractRingPropertyType)get_store().find_element_user(EXTERIOR$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractRingPropertyType)get_store().add_element_user(EXTERIOR$0);
            }
            target.set(exterior);
        }
    }
    
    /**
     * Appends and returns a new empty "exterior" element
     */
    public net.opengis.gml.AbstractRingPropertyType addNewExterior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractRingPropertyType target = null;
            target = (net.opengis.gml.AbstractRingPropertyType)get_store().add_element_user(EXTERIOR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "exterior" element
     */
    public void unsetExterior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTERIOR$0, 0);
        }
    }
    
    /**
     * Gets array of all "interior" elements
     */
    public net.opengis.gml.AbstractRingPropertyType[] getInteriorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INTERIOR$2, targetList);
            net.opengis.gml.AbstractRingPropertyType[] result = new net.opengis.gml.AbstractRingPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "interior" element
     */
    public net.opengis.gml.AbstractRingPropertyType getInteriorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractRingPropertyType target = null;
            target = (net.opengis.gml.AbstractRingPropertyType)get_store().find_element_user(INTERIOR$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "interior" element
     */
    public int sizeOfInteriorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTERIOR$2);
        }
    }
    
    /**
     * Sets array of all "interior" element
     */
    public void setInteriorArray(net.opengis.gml.AbstractRingPropertyType[] interiorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(interiorArray, INTERIOR$2);
        }
    }
    
    /**
     * Sets ith "interior" element
     */
    public void setInteriorArray(int i, net.opengis.gml.AbstractRingPropertyType interior)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractRingPropertyType target = null;
            target = (net.opengis.gml.AbstractRingPropertyType)get_store().find_element_user(INTERIOR$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(interior);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "interior" element
     */
    public net.opengis.gml.AbstractRingPropertyType insertNewInterior(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractRingPropertyType target = null;
            target = (net.opengis.gml.AbstractRingPropertyType)get_store().insert_element_user(INTERIOR$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "interior" element
     */
    public net.opengis.gml.AbstractRingPropertyType addNewInterior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractRingPropertyType target = null;
            target = (net.opengis.gml.AbstractRingPropertyType)get_store().add_element_user(INTERIOR$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "interior" element
     */
    public void removeInterior(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTERIOR$2, i);
        }
    }
}
