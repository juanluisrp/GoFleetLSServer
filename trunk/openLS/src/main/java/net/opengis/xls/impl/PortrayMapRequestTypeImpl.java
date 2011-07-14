/*
 * XML Type:  PortrayMapRequestType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.PortrayMapRequestType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML PortrayMapRequestType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class PortrayMapRequestTypeImpl extends net.opengis.xls.impl.AbstractRequestParametersTypeImpl implements net.opengis.xls.PortrayMapRequestType
{
    private static final long serialVersionUID = 1L;
    
    public PortrayMapRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OUTPUT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Output");
    private static final javax.xml.namespace.QName BASEMAP$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Basemap");
    private static final javax.xml.namespace.QName OVERLAY$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Overlay");
    
    
    /**
     * Gets array of all "Output" elements
     */
    public net.opengis.xls.OutputType[] getOutputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OUTPUT$0, targetList);
            net.opengis.xls.OutputType[] result = new net.opengis.xls.OutputType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Output" element
     */
    public net.opengis.xls.OutputType getOutputArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.OutputType target = null;
            target = (net.opengis.xls.OutputType)get_store().find_element_user(OUTPUT$0, i);
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
    public void setOutputArray(net.opengis.xls.OutputType[] outputArray)
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
    public void setOutputArray(int i, net.opengis.xls.OutputType output)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.OutputType target = null;
            target = (net.opengis.xls.OutputType)get_store().find_element_user(OUTPUT$0, i);
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
    public net.opengis.xls.OutputType insertNewOutput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.OutputType target = null;
            target = (net.opengis.xls.OutputType)get_store().insert_element_user(OUTPUT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Output" element
     */
    public net.opengis.xls.OutputType addNewOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.OutputType target = null;
            target = (net.opengis.xls.OutputType)get_store().add_element_user(OUTPUT$0);
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
    
    /**
     * Gets the "Basemap" element
     */
    public net.opengis.xls.LayerType getBasemap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.LayerType target = null;
            target = (net.opengis.xls.LayerType)get_store().find_element_user(BASEMAP$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Basemap" element
     */
    public boolean isSetBasemap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BASEMAP$2) != 0;
        }
    }
    
    /**
     * Sets the "Basemap" element
     */
    public void setBasemap(net.opengis.xls.LayerType basemap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.LayerType target = null;
            target = (net.opengis.xls.LayerType)get_store().find_element_user(BASEMAP$2, 0);
            if (target == null)
            {
                target = (net.opengis.xls.LayerType)get_store().add_element_user(BASEMAP$2);
            }
            target.set(basemap);
        }
    }
    
    /**
     * Appends and returns a new empty "Basemap" element
     */
    public net.opengis.xls.LayerType addNewBasemap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.LayerType target = null;
            target = (net.opengis.xls.LayerType)get_store().add_element_user(BASEMAP$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Basemap" element
     */
    public void unsetBasemap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BASEMAP$2, 0);
        }
    }
    
    /**
     * Gets array of all "Overlay" elements
     */
    public net.opengis.xls.OverlayType[] getOverlayArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OVERLAY$4, targetList);
            net.opengis.xls.OverlayType[] result = new net.opengis.xls.OverlayType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Overlay" element
     */
    public net.opengis.xls.OverlayType getOverlayArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.OverlayType target = null;
            target = (net.opengis.xls.OverlayType)get_store().find_element_user(OVERLAY$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Overlay" element
     */
    public int sizeOfOverlayArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OVERLAY$4);
        }
    }
    
    /**
     * Sets array of all "Overlay" element
     */
    public void setOverlayArray(net.opengis.xls.OverlayType[] overlayArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(overlayArray, OVERLAY$4);
        }
    }
    
    /**
     * Sets ith "Overlay" element
     */
    public void setOverlayArray(int i, net.opengis.xls.OverlayType overlay)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.OverlayType target = null;
            target = (net.opengis.xls.OverlayType)get_store().find_element_user(OVERLAY$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(overlay);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Overlay" element
     */
    public net.opengis.xls.OverlayType insertNewOverlay(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.OverlayType target = null;
            target = (net.opengis.xls.OverlayType)get_store().insert_element_user(OVERLAY$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Overlay" element
     */
    public net.opengis.xls.OverlayType addNewOverlay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.OverlayType target = null;
            target = (net.opengis.xls.OverlayType)get_store().add_element_user(OVERLAY$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "Overlay" element
     */
    public void removeOverlay(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OVERLAY$4, i);
        }
    }
}
