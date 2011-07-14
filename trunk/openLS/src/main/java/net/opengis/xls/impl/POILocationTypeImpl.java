/*
 * XML Type:  POILocationType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.POILocationType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML POILocationType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class POILocationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.POILocationType
{
    private static final long serialVersionUID = 1L;
    
    public POILocationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Address");
    private static final javax.xml.namespace.QName NEAREST$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Nearest");
    private static final javax.xml.namespace.QName WITHINDISTANCE$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "WithinDistance");
    private static final javax.xml.namespace.QName WITHINBOUNDARY$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "WithinBoundary");
    
    
    /**
     * Gets the "Address" element
     */
    public net.opengis.xls.AddressType getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AddressType target = null;
            target = (net.opengis.xls.AddressType)get_store().find_element_user(ADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Address" element
     */
    public boolean isSetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS$0) != 0;
        }
    }
    
    /**
     * Sets the "Address" element
     */
    public void setAddress(net.opengis.xls.AddressType address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AddressType target = null;
            target = (net.opengis.xls.AddressType)get_store().find_element_user(ADDRESS$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.AddressType)get_store().add_element_user(ADDRESS$0);
            }
            target.set(address);
        }
    }
    
    /**
     * Appends and returns a new empty "Address" element
     */
    public net.opengis.xls.AddressType addNewAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AddressType target = null;
            target = (net.opengis.xls.AddressType)get_store().add_element_user(ADDRESS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Address" element
     */
    public void unsetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS$0, 0);
        }
    }
    
    /**
     * Gets the "Nearest" element
     */
    public net.opengis.xls.NearestType getNearest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.NearestType target = null;
            target = (net.opengis.xls.NearestType)get_store().find_element_user(NEAREST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Nearest" element
     */
    public boolean isSetNearest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NEAREST$2) != 0;
        }
    }
    
    /**
     * Sets the "Nearest" element
     */
    public void setNearest(net.opengis.xls.NearestType nearest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.NearestType target = null;
            target = (net.opengis.xls.NearestType)get_store().find_element_user(NEAREST$2, 0);
            if (target == null)
            {
                target = (net.opengis.xls.NearestType)get_store().add_element_user(NEAREST$2);
            }
            target.set(nearest);
        }
    }
    
    /**
     * Appends and returns a new empty "Nearest" element
     */
    public net.opengis.xls.NearestType addNewNearest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.NearestType target = null;
            target = (net.opengis.xls.NearestType)get_store().add_element_user(NEAREST$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Nearest" element
     */
    public void unsetNearest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NEAREST$2, 0);
        }
    }
    
    /**
     * Gets the "WithinDistance" element
     */
    public net.opengis.xls.WithinDistanceType getWithinDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.WithinDistanceType target = null;
            target = (net.opengis.xls.WithinDistanceType)get_store().find_element_user(WITHINDISTANCE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "WithinDistance" element
     */
    public boolean isSetWithinDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WITHINDISTANCE$4) != 0;
        }
    }
    
    /**
     * Sets the "WithinDistance" element
     */
    public void setWithinDistance(net.opengis.xls.WithinDistanceType withinDistance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.WithinDistanceType target = null;
            target = (net.opengis.xls.WithinDistanceType)get_store().find_element_user(WITHINDISTANCE$4, 0);
            if (target == null)
            {
                target = (net.opengis.xls.WithinDistanceType)get_store().add_element_user(WITHINDISTANCE$4);
            }
            target.set(withinDistance);
        }
    }
    
    /**
     * Appends and returns a new empty "WithinDistance" element
     */
    public net.opengis.xls.WithinDistanceType addNewWithinDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.WithinDistanceType target = null;
            target = (net.opengis.xls.WithinDistanceType)get_store().add_element_user(WITHINDISTANCE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "WithinDistance" element
     */
    public void unsetWithinDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WITHINDISTANCE$4, 0);
        }
    }
    
    /**
     * Gets the "WithinBoundary" element
     */
    public net.opengis.xls.WithinBoundaryType getWithinBoundary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.WithinBoundaryType target = null;
            target = (net.opengis.xls.WithinBoundaryType)get_store().find_element_user(WITHINBOUNDARY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "WithinBoundary" element
     */
    public boolean isSetWithinBoundary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WITHINBOUNDARY$6) != 0;
        }
    }
    
    /**
     * Sets the "WithinBoundary" element
     */
    public void setWithinBoundary(net.opengis.xls.WithinBoundaryType withinBoundary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.WithinBoundaryType target = null;
            target = (net.opengis.xls.WithinBoundaryType)get_store().find_element_user(WITHINBOUNDARY$6, 0);
            if (target == null)
            {
                target = (net.opengis.xls.WithinBoundaryType)get_store().add_element_user(WITHINBOUNDARY$6);
            }
            target.set(withinBoundary);
        }
    }
    
    /**
     * Appends and returns a new empty "WithinBoundary" element
     */
    public net.opengis.xls.WithinBoundaryType addNewWithinBoundary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.WithinBoundaryType target = null;
            target = (net.opengis.xls.WithinBoundaryType)get_store().add_element_user(WITHINBOUNDARY$6);
            return target;
        }
    }
    
    /**
     * Unsets the "WithinBoundary" element
     */
    public void unsetWithinBoundary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WITHINBOUNDARY$6, 0);
        }
    }
}
