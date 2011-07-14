/*
 * XML Type:  LayerType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.LayerType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML LayerType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class LayerTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.LayerType
{
    private static final long serialVersionUID = 1L;
    
    public LayerTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LAYER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Layer");
    private static final javax.xml.namespace.QName FILTER$2 = 
        new javax.xml.namespace.QName("", "filter");
    
    
    /**
     * Gets array of all "Layer" elements
     */
    public net.opengis.xls.LayerType.Layer[] getLayerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LAYER$0, targetList);
            net.opengis.xls.LayerType.Layer[] result = new net.opengis.xls.LayerType.Layer[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Layer" element
     */
    public net.opengis.xls.LayerType.Layer getLayerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.LayerType.Layer target = null;
            target = (net.opengis.xls.LayerType.Layer)get_store().find_element_user(LAYER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
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
    public void setLayerArray(net.opengis.xls.LayerType.Layer[] layerArray)
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
    public void setLayerArray(int i, net.opengis.xls.LayerType.Layer layer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.LayerType.Layer target = null;
            target = (net.opengis.xls.LayerType.Layer)get_store().find_element_user(LAYER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(layer);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Layer" element
     */
    public net.opengis.xls.LayerType.Layer insertNewLayer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.LayerType.Layer target = null;
            target = (net.opengis.xls.LayerType.Layer)get_store().insert_element_user(LAYER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Layer" element
     */
    public net.opengis.xls.LayerType.Layer addNewLayer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.LayerType.Layer target = null;
            target = (net.opengis.xls.LayerType.Layer)get_store().add_element_user(LAYER$0);
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
    
    /**
     * Gets the "filter" attribute
     */
    public net.opengis.xls.LayerType.Filter.Enum getFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILTER$2);
            if (target == null)
            {
                return null;
            }
            return (net.opengis.xls.LayerType.Filter.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "filter" attribute
     */
    public net.opengis.xls.LayerType.Filter xgetFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.LayerType.Filter target = null;
            target = (net.opengis.xls.LayerType.Filter)get_store().find_attribute_user(FILTER$2);
            return target;
        }
    }
    
    /**
     * Sets the "filter" attribute
     */
    public void setFilter(net.opengis.xls.LayerType.Filter.Enum filter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILTER$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILTER$2);
            }
            target.setEnumValue(filter);
        }
    }
    
    /**
     * Sets (as xml) the "filter" attribute
     */
    public void xsetFilter(net.opengis.xls.LayerType.Filter filter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.LayerType.Filter target = null;
            target = (net.opengis.xls.LayerType.Filter)get_store().find_attribute_user(FILTER$2);
            if (target == null)
            {
                target = (net.opengis.xls.LayerType.Filter)get_store().add_attribute_user(FILTER$2);
            }
            target.set(filter);
        }
    }
    /**
     * An XML Layer(@http://www.opengis.net/xls).
     *
     * This is a complex type.
     */
    public static class LayerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.LayerType.Layer
    {
        private static final long serialVersionUID = 1L;
        
        public LayerImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STYLE$0 = 
            new javax.xml.namespace.QName("http://www.opengis.net/xls", "Style");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("", "name");
        
        
        /**
         * Gets the "Style" element
         */
        public net.opengis.xls.StyleType getStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.opengis.xls.StyleType target = null;
                target = (net.opengis.xls.StyleType)get_store().find_element_user(STYLE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Style" element
         */
        public boolean isSetStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STYLE$0) != 0;
            }
        }
        
        /**
         * Sets the "Style" element
         */
        public void setStyle(net.opengis.xls.StyleType style)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.opengis.xls.StyleType target = null;
                target = (net.opengis.xls.StyleType)get_store().find_element_user(STYLE$0, 0);
                if (target == null)
                {
                    target = (net.opengis.xls.StyleType)get_store().add_element_user(STYLE$0);
                }
                target.set(style);
            }
        }
        
        /**
         * Appends and returns a new empty "Style" element
         */
        public net.opengis.xls.StyleType addNewStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.opengis.xls.StyleType target = null;
                target = (net.opengis.xls.StyleType)get_store().add_element_user(STYLE$0);
                return target;
            }
        }
        
        /**
         * Unsets the "Style" element
         */
        public void unsetStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STYLE$0, 0);
            }
        }
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
                return target;
            }
        }
        
        /**
         * Sets the "name" attribute
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$2);
                }
                target.set(name);
            }
        }
    }
    /**
     * An XML filter(@).
     *
     * This is an atomic type that is a restriction of net.opengis.xls.LayerType$Filter.
     */
    public static class FilterImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements net.opengis.xls.LayerType.Filter
    {
        private static final long serialVersionUID = 1L;
        
        public FilterImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected FilterImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
