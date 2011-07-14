/*
 * XML Type:  AvoidListType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.AvoidListType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML AvoidListType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class AvoidListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.AvoidListType
{
    private static final long serialVersionUID = 1L;
    
    public AvoidListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AOI$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "AOI");
    private static final javax.xml.namespace.QName LOCATION$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_Location");
    private static final org.apache.xmlbeans.QNameSet LOCATION$3 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Address"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "POI"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_Location"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Position"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_Position"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_POI"),
    });
    private static final javax.xml.namespace.QName AVOIDFEATURE$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "AvoidFeature");
    
    
    /**
     * Gets array of all "AOI" elements
     */
    public net.opengis.xls.AreaOfInterestType[] getAOIArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AOI$0, targetList);
            net.opengis.xls.AreaOfInterestType[] result = new net.opengis.xls.AreaOfInterestType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AOI" element
     */
    public net.opengis.xls.AreaOfInterestType getAOIArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AreaOfInterestType target = null;
            target = (net.opengis.xls.AreaOfInterestType)get_store().find_element_user(AOI$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AOI" element
     */
    public int sizeOfAOIArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AOI$0);
        }
    }
    
    /**
     * Sets array of all "AOI" element
     */
    public void setAOIArray(net.opengis.xls.AreaOfInterestType[] aoiArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(aoiArray, AOI$0);
        }
    }
    
    /**
     * Sets ith "AOI" element
     */
    public void setAOIArray(int i, net.opengis.xls.AreaOfInterestType aoi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AreaOfInterestType target = null;
            target = (net.opengis.xls.AreaOfInterestType)get_store().find_element_user(AOI$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(aoi);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AOI" element
     */
    public net.opengis.xls.AreaOfInterestType insertNewAOI(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AreaOfInterestType target = null;
            target = (net.opengis.xls.AreaOfInterestType)get_store().insert_element_user(AOI$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AOI" element
     */
    public net.opengis.xls.AreaOfInterestType addNewAOI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AreaOfInterestType target = null;
            target = (net.opengis.xls.AreaOfInterestType)get_store().add_element_user(AOI$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "AOI" element
     */
    public void removeAOI(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AOI$0, i);
        }
    }
    
    /**
     * Gets array of all "_Location" elements
     */
    public net.opengis.xls.AbstractLocationType[] getLocationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCATION$3, targetList);
            net.opengis.xls.AbstractLocationType[] result = new net.opengis.xls.AbstractLocationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "_Location" element
     */
    public net.opengis.xls.AbstractLocationType getLocationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractLocationType target = null;
            target = (net.opengis.xls.AbstractLocationType)get_store().find_element_user(LOCATION$3, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "_Location" element
     */
    public int sizeOfLocationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATION$3);
        }
    }
    
    /**
     * Sets array of all "_Location" element
     */
    public void setLocationArray(net.opengis.xls.AbstractLocationType[] locationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(locationArray, LOCATION$2, LOCATION$3);
        }
    }
    
    /**
     * Sets ith "_Location" element
     */
    public void setLocationArray(int i, net.opengis.xls.AbstractLocationType location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractLocationType target = null;
            target = (net.opengis.xls.AbstractLocationType)get_store().find_element_user(LOCATION$3, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(location);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "_Location" element
     */
    public net.opengis.xls.AbstractLocationType insertNewLocation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractLocationType target = null;
            target = (net.opengis.xls.AbstractLocationType)get_store().insert_element_user(LOCATION$3, LOCATION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "_Location" element
     */
    public net.opengis.xls.AbstractLocationType addNewLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractLocationType target = null;
            target = (net.opengis.xls.AbstractLocationType)get_store().add_element_user(LOCATION$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "_Location" element
     */
    public void removeLocation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATION$3, i);
        }
    }
    
    /**
     * Gets array of all "AvoidFeature" elements
     */
    public net.opengis.xls.AvoidFeatureType.Enum[] getAvoidFeatureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AVOIDFEATURE$4, targetList);
            net.opengis.xls.AvoidFeatureType.Enum[] result = new net.opengis.xls.AvoidFeatureType.Enum[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = (net.opengis.xls.AvoidFeatureType.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
            return result;
        }
    }
    
    /**
     * Gets ith "AvoidFeature" element
     */
    public net.opengis.xls.AvoidFeatureType.Enum getAvoidFeatureArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AVOIDFEATURE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (net.opengis.xls.AvoidFeatureType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "AvoidFeature" elements
     */
    public net.opengis.xls.AvoidFeatureType[] xgetAvoidFeatureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AVOIDFEATURE$4, targetList);
            net.opengis.xls.AvoidFeatureType[] result = new net.opengis.xls.AvoidFeatureType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "AvoidFeature" element
     */
    public net.opengis.xls.AvoidFeatureType xgetAvoidFeatureArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AvoidFeatureType target = null;
            target = (net.opengis.xls.AvoidFeatureType)get_store().find_element_user(AVOIDFEATURE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (net.opengis.xls.AvoidFeatureType)target;
        }
    }
    
    /**
     * Returns number of "AvoidFeature" element
     */
    public int sizeOfAvoidFeatureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AVOIDFEATURE$4);
        }
    }
    
    /**
     * Sets array of all "AvoidFeature" element
     */
    public void setAvoidFeatureArray(net.opengis.xls.AvoidFeatureType.Enum[] avoidFeatureArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(avoidFeatureArray, AVOIDFEATURE$4);
        }
    }
    
    /**
     * Sets ith "AvoidFeature" element
     */
    public void setAvoidFeatureArray(int i, net.opengis.xls.AvoidFeatureType.Enum avoidFeature)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AVOIDFEATURE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(avoidFeature);
        }
    }
    
    /**
     * Sets (as xml) array of all "AvoidFeature" element
     */
    public void xsetAvoidFeatureArray(net.opengis.xls.AvoidFeatureType[]avoidFeatureArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(avoidFeatureArray, AVOIDFEATURE$4);
        }
    }
    
    /**
     * Sets (as xml) ith "AvoidFeature" element
     */
    public void xsetAvoidFeatureArray(int i, net.opengis.xls.AvoidFeatureType avoidFeature)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AvoidFeatureType target = null;
            target = (net.opengis.xls.AvoidFeatureType)get_store().find_element_user(AVOIDFEATURE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(avoidFeature);
        }
    }
    
    /**
     * Inserts the value as the ith "AvoidFeature" element
     */
    public void insertAvoidFeature(int i, net.opengis.xls.AvoidFeatureType.Enum avoidFeature)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(AVOIDFEATURE$4, i);
            target.setEnumValue(avoidFeature);
        }
    }
    
    /**
     * Appends the value as the last "AvoidFeature" element
     */
    public void addAvoidFeature(net.opengis.xls.AvoidFeatureType.Enum avoidFeature)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AVOIDFEATURE$4);
            target.setEnumValue(avoidFeature);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AvoidFeature" element
     */
    public net.opengis.xls.AvoidFeatureType insertNewAvoidFeature(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AvoidFeatureType target = null;
            target = (net.opengis.xls.AvoidFeatureType)get_store().insert_element_user(AVOIDFEATURE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AvoidFeature" element
     */
    public net.opengis.xls.AvoidFeatureType addNewAvoidFeature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AvoidFeatureType target = null;
            target = (net.opengis.xls.AvoidFeatureType)get_store().add_element_user(AVOIDFEATURE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "AvoidFeature" element
     */
    public void removeAvoidFeature(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AVOIDFEATURE$4, i);
        }
    }
}
