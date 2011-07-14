/*
 * XML Type:  WithinDistanceType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.WithinDistanceType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML WithinDistanceType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class WithinDistanceTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.WithinDistanceType
{
    private static final long serialVersionUID = 1L;
    
    public WithinDistanceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_Location");
    private static final org.apache.xmlbeans.QNameSet LOCATION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Address"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "POI"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_Location"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Position"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_Position"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_POI"),
    });
    private static final javax.xml.namespace.QName MINIMUMDISTANCE$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "MinimumDistance");
    private static final javax.xml.namespace.QName MAXIMUMDISTANCE$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "MaximumDistance");
    
    
    /**
     * Gets the "_Location" element
     */
    public net.opengis.xls.AbstractLocationType getLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractLocationType target = null;
            target = (net.opengis.xls.AbstractLocationType)get_store().find_element_user(LOCATION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_Location" element
     */
    public void setLocation(net.opengis.xls.AbstractLocationType location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractLocationType target = null;
            target = (net.opengis.xls.AbstractLocationType)get_store().find_element_user(LOCATION$1, 0);
            if (target == null)
            {
                target = (net.opengis.xls.AbstractLocationType)get_store().add_element_user(LOCATION$0);
            }
            target.set(location);
        }
    }
    
    /**
     * Appends and returns a new empty "_Location" element
     */
    public net.opengis.xls.AbstractLocationType addNewLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractLocationType target = null;
            target = (net.opengis.xls.AbstractLocationType)get_store().add_element_user(LOCATION$0);
            return target;
        }
    }
    
    /**
     * Gets the "MinimumDistance" element
     */
    public net.opengis.xls.DistanceType getMinimumDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.DistanceType target = null;
            target = (net.opengis.xls.DistanceType)get_store().find_element_user(MINIMUMDISTANCE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MinimumDistance" element
     */
    public boolean isSetMinimumDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MINIMUMDISTANCE$2) != 0;
        }
    }
    
    /**
     * Sets the "MinimumDistance" element
     */
    public void setMinimumDistance(net.opengis.xls.DistanceType minimumDistance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.DistanceType target = null;
            target = (net.opengis.xls.DistanceType)get_store().find_element_user(MINIMUMDISTANCE$2, 0);
            if (target == null)
            {
                target = (net.opengis.xls.DistanceType)get_store().add_element_user(MINIMUMDISTANCE$2);
            }
            target.set(minimumDistance);
        }
    }
    
    /**
     * Appends and returns a new empty "MinimumDistance" element
     */
    public net.opengis.xls.DistanceType addNewMinimumDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.DistanceType target = null;
            target = (net.opengis.xls.DistanceType)get_store().add_element_user(MINIMUMDISTANCE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "MinimumDistance" element
     */
    public void unsetMinimumDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MINIMUMDISTANCE$2, 0);
        }
    }
    
    /**
     * Gets the "MaximumDistance" element
     */
    public net.opengis.xls.DistanceType getMaximumDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.DistanceType target = null;
            target = (net.opengis.xls.DistanceType)get_store().find_element_user(MAXIMUMDISTANCE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MaximumDistance" element
     */
    public boolean isSetMaximumDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXIMUMDISTANCE$4) != 0;
        }
    }
    
    /**
     * Sets the "MaximumDistance" element
     */
    public void setMaximumDistance(net.opengis.xls.DistanceType maximumDistance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.DistanceType target = null;
            target = (net.opengis.xls.DistanceType)get_store().find_element_user(MAXIMUMDISTANCE$4, 0);
            if (target == null)
            {
                target = (net.opengis.xls.DistanceType)get_store().add_element_user(MAXIMUMDISTANCE$4);
            }
            target.set(maximumDistance);
        }
    }
    
    /**
     * Appends and returns a new empty "MaximumDistance" element
     */
    public net.opengis.xls.DistanceType addNewMaximumDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.DistanceType target = null;
            target = (net.opengis.xls.DistanceType)get_store().add_element_user(MAXIMUMDISTANCE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "MaximumDistance" element
     */
    public void unsetMaximumDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXIMUMDISTANCE$4, 0);
        }
    }
}
