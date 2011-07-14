/*
 * XML Type:  AvailableLayersType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.AvailableLayersType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML AvailableLayersType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class AvailableLayersTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.AvailableLayersType
{
    private static final long serialVersionUID = 1L;
    
    public AvailableLayersTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LAYER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Layer");
    
    
    /**
     * Gets array of all "Layer" elements
     */
    public java.lang.String[] getLayerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LAYER$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "Layer" element
     */
    public java.lang.String getLayerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAYER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "Layer" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetLayerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LAYER$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "Layer" element
     */
    public org.apache.xmlbeans.XmlString xgetLayerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LAYER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "Layer" element
     */
    public int sizeOfLayerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LAYER$0);
        }
    }
    
    /**
     * Sets array of all "Layer" element
     */
    public void setLayerArray(java.lang.String[] layerArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(layerArray, LAYER$0);
        }
    }
    
    /**
     * Sets ith "Layer" element
     */
    public void setLayerArray(int i, java.lang.String layer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAYER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(layer);
        }
    }
    
    /**
     * Sets (as xml) array of all "Layer" element
     */
    public void xsetLayerArray(org.apache.xmlbeans.XmlString[]layerArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(layerArray, LAYER$0);
        }
    }
    
    /**
     * Sets (as xml) ith "Layer" element
     */
    public void xsetLayerArray(int i, org.apache.xmlbeans.XmlString layer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LAYER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(layer);
        }
    }
    
    /**
     * Inserts the value as the ith "Layer" element
     */
    public void insertLayer(int i, java.lang.String layer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(LAYER$0, i);
            target.setStringValue(layer);
        }
    }
    
    /**
     * Appends the value as the last "Layer" element
     */
    public void addLayer(java.lang.String layer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LAYER$0);
            target.setStringValue(layer);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Layer" element
     */
    public org.apache.xmlbeans.XmlString insertNewLayer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(LAYER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Layer" element
     */
    public org.apache.xmlbeans.XmlString addNewLayer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LAYER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Layer" element
     */
    public void removeLayer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LAYER$0, i);
        }
    }
}
