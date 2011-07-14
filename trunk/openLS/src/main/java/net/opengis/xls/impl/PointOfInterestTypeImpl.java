/*
 * XML Type:  PointOfInterestType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.PointOfInterestType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML PointOfInterestType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class PointOfInterestTypeImpl extends net.opengis.xls.impl.AbstractPOITypeImpl implements net.opengis.xls.PointOfInterestType
{
    private static final long serialVersionUID = 1L;
    
    public PointOfInterestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POIATTRIBUTELIST$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "POIAttributeList");
    private static final javax.xml.namespace.QName POINT$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Point");
    private static final javax.xml.namespace.QName ADDRESS$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Address");
    private static final javax.xml.namespace.QName ID$6 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName POINAME$8 = 
        new javax.xml.namespace.QName("", "POIName");
    private static final javax.xml.namespace.QName PHONENUMBER$10 = 
        new javax.xml.namespace.QName("", "phoneNumber");
    private static final javax.xml.namespace.QName DESCRIPTION$12 = 
        new javax.xml.namespace.QName("", "description");
    
    
    /**
     * Gets the "POIAttributeList" element
     */
    public net.opengis.xls.POIAttributeListType getPOIAttributeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.POIAttributeListType target = null;
            target = (net.opengis.xls.POIAttributeListType)get_store().find_element_user(POIATTRIBUTELIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "POIAttributeList" element
     */
    public boolean isSetPOIAttributeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POIATTRIBUTELIST$0) != 0;
        }
    }
    
    /**
     * Sets the "POIAttributeList" element
     */
    public void setPOIAttributeList(net.opengis.xls.POIAttributeListType poiAttributeList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.POIAttributeListType target = null;
            target = (net.opengis.xls.POIAttributeListType)get_store().find_element_user(POIATTRIBUTELIST$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.POIAttributeListType)get_store().add_element_user(POIATTRIBUTELIST$0);
            }
            target.set(poiAttributeList);
        }
    }
    
    /**
     * Appends and returns a new empty "POIAttributeList" element
     */
    public net.opengis.xls.POIAttributeListType addNewPOIAttributeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.POIAttributeListType target = null;
            target = (net.opengis.xls.POIAttributeListType)get_store().add_element_user(POIATTRIBUTELIST$0);
            return target;
        }
    }
    
    /**
     * Unsets the "POIAttributeList" element
     */
    public void unsetPOIAttributeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POIATTRIBUTELIST$0, 0);
        }
    }
    
    /**
     * Gets the "Point" element
     */
    public net.opengis.gml.PointType getPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PointType target = null;
            target = (net.opengis.gml.PointType)get_store().find_element_user(POINT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Point" element
     */
    public boolean isSetPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POINT$2) != 0;
        }
    }
    
    /**
     * Sets the "Point" element
     */
    public void setPoint(net.opengis.gml.PointType point)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PointType target = null;
            target = (net.opengis.gml.PointType)get_store().find_element_user(POINT$2, 0);
            if (target == null)
            {
                target = (net.opengis.gml.PointType)get_store().add_element_user(POINT$2);
            }
            target.set(point);
        }
    }
    
    /**
     * Appends and returns a new empty "Point" element
     */
    public net.opengis.gml.PointType addNewPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PointType target = null;
            target = (net.opengis.gml.PointType)get_store().add_element_user(POINT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Point" element
     */
    public void unsetPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POINT$2, 0);
        }
    }
    
    /**
     * Gets the "Address" element
     */
    public net.opengis.xls.AddressType getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AddressType target = null;
            target = (net.opengis.xls.AddressType)get_store().find_element_user(ADDRESS$4, 0);
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
            return get_store().count_elements(ADDRESS$4) != 0;
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
            target = (net.opengis.xls.AddressType)get_store().find_element_user(ADDRESS$4, 0);
            if (target == null)
            {
                target = (net.opengis.xls.AddressType)get_store().add_element_user(ADDRESS$4);
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
            target = (net.opengis.xls.AddressType)get_store().add_element_user(ADDRESS$4);
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
            get_store().remove_element(ADDRESS$4, 0);
        }
    }
    
    /**
     * Gets the "ID" attribute
     */
    public java.lang.String getID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ID" attribute
     */
    public org.apache.xmlbeans.XmlString xgetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$6);
            return target;
        }
    }
    
    /**
     * Sets the "ID" attribute
     */
    public void setID(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$6);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "ID" attribute
     */
    public void xsetID(org.apache.xmlbeans.XmlString id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$6);
            }
            target.set(id);
        }
    }
    
    /**
     * Gets the "POIName" attribute
     */
    public java.lang.String getPOIName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POINAME$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "POIName" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPOIName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POINAME$8);
            return target;
        }
    }
    
    /**
     * True if has "POIName" attribute
     */
    public boolean isSetPOIName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(POINAME$8) != null;
        }
    }
    
    /**
     * Sets the "POIName" attribute
     */
    public void setPOIName(java.lang.String poiName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POINAME$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POINAME$8);
            }
            target.setStringValue(poiName);
        }
    }
    
    /**
     * Sets (as xml) the "POIName" attribute
     */
    public void xsetPOIName(org.apache.xmlbeans.XmlString poiName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POINAME$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(POINAME$8);
            }
            target.set(poiName);
        }
    }
    
    /**
     * Unsets the "POIName" attribute
     */
    public void unsetPOIName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(POINAME$8);
        }
    }
    
    /**
     * Gets the "phoneNumber" attribute
     */
    public java.lang.String getPhoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PHONENUMBER$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "phoneNumber" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPhoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PHONENUMBER$10);
            return target;
        }
    }
    
    /**
     * True if has "phoneNumber" attribute
     */
    public boolean isSetPhoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PHONENUMBER$10) != null;
        }
    }
    
    /**
     * Sets the "phoneNumber" attribute
     */
    public void setPhoneNumber(java.lang.String phoneNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PHONENUMBER$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PHONENUMBER$10);
            }
            target.setStringValue(phoneNumber);
        }
    }
    
    /**
     * Sets (as xml) the "phoneNumber" attribute
     */
    public void xsetPhoneNumber(org.apache.xmlbeans.XmlString phoneNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PHONENUMBER$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PHONENUMBER$10);
            }
            target.set(phoneNumber);
        }
    }
    
    /**
     * Unsets the "phoneNumber" attribute
     */
    public void unsetPhoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PHONENUMBER$10);
        }
    }
    
    /**
     * Gets the "description" attribute
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "description" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$12);
            return target;
        }
    }
    
    /**
     * True if has "description" attribute
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DESCRIPTION$12) != null;
        }
    }
    
    /**
     * Sets the "description" attribute
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESCRIPTION$12);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "description" attribute
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESCRIPTION$12);
            }
            target.set(description);
        }
    }
    
    /**
     * Unsets the "description" attribute
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DESCRIPTION$12);
        }
    }
}
