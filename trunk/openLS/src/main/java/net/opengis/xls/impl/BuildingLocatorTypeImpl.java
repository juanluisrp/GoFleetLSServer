/*
 * XML Type:  BuildingLocatorType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.BuildingLocatorType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML BuildingLocatorType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class BuildingLocatorTypeImpl extends net.opengis.xls.impl.AbstractStreetLocatorTypeImpl implements net.opengis.xls.BuildingLocatorType
{
    private static final long serialVersionUID = 1L;
    
    public BuildingLocatorTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMBER$0 = 
        new javax.xml.namespace.QName("", "number");
    private static final javax.xml.namespace.QName SUBDIVISION$2 = 
        new javax.xml.namespace.QName("", "subdivision");
    private static final javax.xml.namespace.QName BUILDINGNAME$4 = 
        new javax.xml.namespace.QName("", "buildingName");
    
    
    /**
     * Gets the "number" attribute
     */
    public java.lang.String getNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMBER$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "number" attribute
     */
    public org.apache.xmlbeans.XmlString xgetNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NUMBER$0);
            return target;
        }
    }
    
    /**
     * True if has "number" attribute
     */
    public boolean isSetNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NUMBER$0) != null;
        }
    }
    
    /**
     * Sets the "number" attribute
     */
    public void setNumber(java.lang.String number)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMBER$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NUMBER$0);
            }
            target.setStringValue(number);
        }
    }
    
    /**
     * Sets (as xml) the "number" attribute
     */
    public void xsetNumber(org.apache.xmlbeans.XmlString number)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NUMBER$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NUMBER$0);
            }
            target.set(number);
        }
    }
    
    /**
     * Unsets the "number" attribute
     */
    public void unsetNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NUMBER$0);
        }
    }
    
    /**
     * Gets the "subdivision" attribute
     */
    public java.lang.String getSubdivision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUBDIVISION$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "subdivision" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSubdivision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SUBDIVISION$2);
            return target;
        }
    }
    
    /**
     * True if has "subdivision" attribute
     */
    public boolean isSetSubdivision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SUBDIVISION$2) != null;
        }
    }
    
    /**
     * Sets the "subdivision" attribute
     */
    public void setSubdivision(java.lang.String subdivision)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUBDIVISION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUBDIVISION$2);
            }
            target.setStringValue(subdivision);
        }
    }
    
    /**
     * Sets (as xml) the "subdivision" attribute
     */
    public void xsetSubdivision(org.apache.xmlbeans.XmlString subdivision)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SUBDIVISION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SUBDIVISION$2);
            }
            target.set(subdivision);
        }
    }
    
    /**
     * Unsets the "subdivision" attribute
     */
    public void unsetSubdivision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SUBDIVISION$2);
        }
    }
    
    /**
     * Gets the "buildingName" attribute
     */
    public java.lang.String getBuildingName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BUILDINGNAME$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "buildingName" attribute
     */
    public org.apache.xmlbeans.XmlString xgetBuildingName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BUILDINGNAME$4);
            return target;
        }
    }
    
    /**
     * True if has "buildingName" attribute
     */
    public boolean isSetBuildingName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BUILDINGNAME$4) != null;
        }
    }
    
    /**
     * Sets the "buildingName" attribute
     */
    public void setBuildingName(java.lang.String buildingName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BUILDINGNAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BUILDINGNAME$4);
            }
            target.setStringValue(buildingName);
        }
    }
    
    /**
     * Sets (as xml) the "buildingName" attribute
     */
    public void xsetBuildingName(org.apache.xmlbeans.XmlString buildingName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BUILDINGNAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BUILDINGNAME$4);
            }
            target.set(buildingName);
        }
    }
    
    /**
     * Unsets the "buildingName" attribute
     */
    public void unsetBuildingName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BUILDINGNAME$4);
        }
    }
}
