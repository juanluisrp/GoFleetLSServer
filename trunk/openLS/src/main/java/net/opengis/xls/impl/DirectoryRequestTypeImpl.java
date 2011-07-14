/*
 * XML Type:  DirectoryRequestType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.DirectoryRequestType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML DirectoryRequestType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class DirectoryRequestTypeImpl extends net.opengis.xls.impl.AbstractRequestParametersTypeImpl implements net.opengis.xls.DirectoryRequestType
{
    private static final long serialVersionUID = 1L;
    
    public DirectoryRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POILOCATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "POILocation");
    private static final javax.xml.namespace.QName POISELECTIONCRITERIA$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_POISelectionCriteria");
    private static final org.apache.xmlbeans.QNameSet POISELECTIONCRITERIA$3 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_POISelectionCriteria"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "POIProperties"),
    });
    private static final javax.xml.namespace.QName SORTCRITERIA$4 = 
        new javax.xml.namespace.QName("", "sortCriteria");
    private static final javax.xml.namespace.QName SORTDIRECTION$6 = 
        new javax.xml.namespace.QName("", "sortDirection");
    private static final javax.xml.namespace.QName DISTANCEUNIT$8 = 
        new javax.xml.namespace.QName("", "distanceUnit");
    
    
    /**
     * Gets the "POILocation" element
     */
    public net.opengis.xls.POILocationType getPOILocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.POILocationType target = null;
            target = (net.opengis.xls.POILocationType)get_store().find_element_user(POILOCATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "POILocation" element
     */
    public boolean isSetPOILocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POILOCATION$0) != 0;
        }
    }
    
    /**
     * Sets the "POILocation" element
     */
    public void setPOILocation(net.opengis.xls.POILocationType poiLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.POILocationType target = null;
            target = (net.opengis.xls.POILocationType)get_store().find_element_user(POILOCATION$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.POILocationType)get_store().add_element_user(POILOCATION$0);
            }
            target.set(poiLocation);
        }
    }
    
    /**
     * Appends and returns a new empty "POILocation" element
     */
    public net.opengis.xls.POILocationType addNewPOILocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.POILocationType target = null;
            target = (net.opengis.xls.POILocationType)get_store().add_element_user(POILOCATION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "POILocation" element
     */
    public void unsetPOILocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POILOCATION$0, 0);
        }
    }
    
    /**
     * Gets the "_POISelectionCriteria" element
     */
    public net.opengis.xls.AbstractPOISelectionCriteriaType getPOISelectionCriteria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractPOISelectionCriteriaType target = null;
            target = (net.opengis.xls.AbstractPOISelectionCriteriaType)get_store().find_element_user(POISELECTIONCRITERIA$3, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_POISelectionCriteria" element
     */
    public void setPOISelectionCriteria(net.opengis.xls.AbstractPOISelectionCriteriaType poiSelectionCriteria)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractPOISelectionCriteriaType target = null;
            target = (net.opengis.xls.AbstractPOISelectionCriteriaType)get_store().find_element_user(POISELECTIONCRITERIA$3, 0);
            if (target == null)
            {
                target = (net.opengis.xls.AbstractPOISelectionCriteriaType)get_store().add_element_user(POISELECTIONCRITERIA$2);
            }
            target.set(poiSelectionCriteria);
        }
    }
    
    /**
     * Appends and returns a new empty "_POISelectionCriteria" element
     */
    public net.opengis.xls.AbstractPOISelectionCriteriaType addNewPOISelectionCriteria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractPOISelectionCriteriaType target = null;
            target = (net.opengis.xls.AbstractPOISelectionCriteriaType)get_store().add_element_user(POISELECTIONCRITERIA$2);
            return target;
        }
    }
    
    /**
     * Gets the "sortCriteria" attribute
     */
    public java.lang.String getSortCriteria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTCRITERIA$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sortCriteria" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSortCriteria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SORTCRITERIA$4);
            return target;
        }
    }
    
    /**
     * True if has "sortCriteria" attribute
     */
    public boolean isSetSortCriteria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SORTCRITERIA$4) != null;
        }
    }
    
    /**
     * Sets the "sortCriteria" attribute
     */
    public void setSortCriteria(java.lang.String sortCriteria)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTCRITERIA$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SORTCRITERIA$4);
            }
            target.setStringValue(sortCriteria);
        }
    }
    
    /**
     * Sets (as xml) the "sortCriteria" attribute
     */
    public void xsetSortCriteria(org.apache.xmlbeans.XmlString sortCriteria)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SORTCRITERIA$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SORTCRITERIA$4);
            }
            target.set(sortCriteria);
        }
    }
    
    /**
     * Unsets the "sortCriteria" attribute
     */
    public void unsetSortCriteria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SORTCRITERIA$4);
        }
    }
    
    /**
     * Gets the "sortDirection" attribute
     */
    public net.opengis.xls.SortDirectionType.Enum getSortDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTDIRECTION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SORTDIRECTION$6);
            }
            if (target == null)
            {
                return null;
            }
            return (net.opengis.xls.SortDirectionType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "sortDirection" attribute
     */
    public net.opengis.xls.SortDirectionType xgetSortDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.SortDirectionType target = null;
            target = (net.opengis.xls.SortDirectionType)get_store().find_attribute_user(SORTDIRECTION$6);
            if (target == null)
            {
                target = (net.opengis.xls.SortDirectionType)get_default_attribute_value(SORTDIRECTION$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "sortDirection" attribute
     */
    public boolean isSetSortDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SORTDIRECTION$6) != null;
        }
    }
    
    /**
     * Sets the "sortDirection" attribute
     */
    public void setSortDirection(net.opengis.xls.SortDirectionType.Enum sortDirection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTDIRECTION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SORTDIRECTION$6);
            }
            target.setEnumValue(sortDirection);
        }
    }
    
    /**
     * Sets (as xml) the "sortDirection" attribute
     */
    public void xsetSortDirection(net.opengis.xls.SortDirectionType sortDirection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.SortDirectionType target = null;
            target = (net.opengis.xls.SortDirectionType)get_store().find_attribute_user(SORTDIRECTION$6);
            if (target == null)
            {
                target = (net.opengis.xls.SortDirectionType)get_store().add_attribute_user(SORTDIRECTION$6);
            }
            target.set(sortDirection);
        }
    }
    
    /**
     * Unsets the "sortDirection" attribute
     */
    public void unsetSortDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SORTDIRECTION$6);
        }
    }
    
    /**
     * Gets the "distanceUnit" attribute
     */
    public net.opengis.xls.DistanceUnitType.Enum getDistanceUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTANCEUNIT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DISTANCEUNIT$8);
            }
            if (target == null)
            {
                return null;
            }
            return (net.opengis.xls.DistanceUnitType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "distanceUnit" attribute
     */
    public net.opengis.xls.DistanceUnitType xgetDistanceUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.DistanceUnitType target = null;
            target = (net.opengis.xls.DistanceUnitType)get_store().find_attribute_user(DISTANCEUNIT$8);
            if (target == null)
            {
                target = (net.opengis.xls.DistanceUnitType)get_default_attribute_value(DISTANCEUNIT$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "distanceUnit" attribute
     */
    public boolean isSetDistanceUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISTANCEUNIT$8) != null;
        }
    }
    
    /**
     * Sets the "distanceUnit" attribute
     */
    public void setDistanceUnit(net.opengis.xls.DistanceUnitType.Enum distanceUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTANCEUNIT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISTANCEUNIT$8);
            }
            target.setEnumValue(distanceUnit);
        }
    }
    
    /**
     * Sets (as xml) the "distanceUnit" attribute
     */
    public void xsetDistanceUnit(net.opengis.xls.DistanceUnitType distanceUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.DistanceUnitType target = null;
            target = (net.opengis.xls.DistanceUnitType)get_store().find_attribute_user(DISTANCEUNIT$8);
            if (target == null)
            {
                target = (net.opengis.xls.DistanceUnitType)get_store().add_attribute_user(DISTANCEUNIT$8);
            }
            target.set(distanceUnit);
        }
    }
    
    /**
     * Unsets the "distanceUnit" attribute
     */
    public void unsetDistanceUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISTANCEUNIT$8);
        }
    }
}
