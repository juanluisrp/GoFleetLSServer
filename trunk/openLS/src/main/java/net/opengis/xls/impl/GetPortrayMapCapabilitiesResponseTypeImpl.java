/*
 * XML Type:  GetPortrayMapCapabilitiesResponseType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.GetPortrayMapCapabilitiesResponseType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML GetPortrayMapCapabilitiesResponseType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class GetPortrayMapCapabilitiesResponseTypeImpl extends net.opengis.xls.impl.AbstractResponseParametersTypeImpl implements net.opengis.xls.GetPortrayMapCapabilitiesResponseType
{
    private static final long serialVersionUID = 1L;
    
    public GetPortrayMapCapabilitiesResponseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AVAILABLESRS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "AvailableSRS");
    private static final javax.xml.namespace.QName AVAILABLELAYERS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "AvailableLayers");
    private static final javax.xml.namespace.QName AVAILABLEFORMATS$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "AvailableFormats");
    private static final javax.xml.namespace.QName AVAILABLESTYLES$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "AvailableStyles");
    
    
    /**
     * Gets the "AvailableSRS" element
     */
    public net.opengis.xls.AvailableSRSType getAvailableSRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AvailableSRSType target = null;
            target = (net.opengis.xls.AvailableSRSType)get_store().find_element_user(AVAILABLESRS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AvailableSRS" element
     */
    public void setAvailableSRS(net.opengis.xls.AvailableSRSType availableSRS)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AvailableSRSType target = null;
            target = (net.opengis.xls.AvailableSRSType)get_store().find_element_user(AVAILABLESRS$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.AvailableSRSType)get_store().add_element_user(AVAILABLESRS$0);
            }
            target.set(availableSRS);
        }
    }
    
    /**
     * Appends and returns a new empty "AvailableSRS" element
     */
    public net.opengis.xls.AvailableSRSType addNewAvailableSRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AvailableSRSType target = null;
            target = (net.opengis.xls.AvailableSRSType)get_store().add_element_user(AVAILABLESRS$0);
            return target;
        }
    }
    
    /**
     * Gets the "AvailableLayers" element
     */
    public net.opengis.xls.AvailableLayersType getAvailableLayers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AvailableLayersType target = null;
            target = (net.opengis.xls.AvailableLayersType)get_store().find_element_user(AVAILABLELAYERS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AvailableLayers" element
     */
    public void setAvailableLayers(net.opengis.xls.AvailableLayersType availableLayers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AvailableLayersType target = null;
            target = (net.opengis.xls.AvailableLayersType)get_store().find_element_user(AVAILABLELAYERS$2, 0);
            if (target == null)
            {
                target = (net.opengis.xls.AvailableLayersType)get_store().add_element_user(AVAILABLELAYERS$2);
            }
            target.set(availableLayers);
        }
    }
    
    /**
     * Appends and returns a new empty "AvailableLayers" element
     */
    public net.opengis.xls.AvailableLayersType addNewAvailableLayers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AvailableLayersType target = null;
            target = (net.opengis.xls.AvailableLayersType)get_store().add_element_user(AVAILABLELAYERS$2);
            return target;
        }
    }
    
    /**
     * Gets the "AvailableFormats" element
     */
    public net.opengis.xls.AvailableFormatsType getAvailableFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AvailableFormatsType target = null;
            target = (net.opengis.xls.AvailableFormatsType)get_store().find_element_user(AVAILABLEFORMATS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AvailableFormats" element
     */
    public void setAvailableFormats(net.opengis.xls.AvailableFormatsType availableFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AvailableFormatsType target = null;
            target = (net.opengis.xls.AvailableFormatsType)get_store().find_element_user(AVAILABLEFORMATS$4, 0);
            if (target == null)
            {
                target = (net.opengis.xls.AvailableFormatsType)get_store().add_element_user(AVAILABLEFORMATS$4);
            }
            target.set(availableFormats);
        }
    }
    
    /**
     * Appends and returns a new empty "AvailableFormats" element
     */
    public net.opengis.xls.AvailableFormatsType addNewAvailableFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AvailableFormatsType target = null;
            target = (net.opengis.xls.AvailableFormatsType)get_store().add_element_user(AVAILABLEFORMATS$4);
            return target;
        }
    }
    
    /**
     * Gets the "AvailableStyles" element
     */
    public net.opengis.xls.AvailableStylesType getAvailableStyles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AvailableStylesType target = null;
            target = (net.opengis.xls.AvailableStylesType)get_store().find_element_user(AVAILABLESTYLES$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AvailableStyles" element
     */
    public void setAvailableStyles(net.opengis.xls.AvailableStylesType availableStyles)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AvailableStylesType target = null;
            target = (net.opengis.xls.AvailableStylesType)get_store().find_element_user(AVAILABLESTYLES$6, 0);
            if (target == null)
            {
                target = (net.opengis.xls.AvailableStylesType)get_store().add_element_user(AVAILABLESTYLES$6);
            }
            target.set(availableStyles);
        }
    }
    
    /**
     * Appends and returns a new empty "AvailableStyles" element
     */
    public net.opengis.xls.AvailableStylesType addNewAvailableStyles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AvailableStylesType target = null;
            target = (net.opengis.xls.AvailableStylesType)get_store().add_element_user(AVAILABLESTYLES$6);
            return target;
        }
    }
}
