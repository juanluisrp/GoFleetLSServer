/*
 * XML Type:  StreetNameType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.StreetNameType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML StreetNameType(@http://www.opengis.net/xls).
 *
 * This is an atomic type that is a restriction of net.opengis.xls.StreetNameType.
 */
public class StreetNameTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements net.opengis.xls.StreetNameType
{
    private static final long serialVersionUID = 1L;
    
    public StreetNameTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected StreetNameTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName DIRECTIONALPREFIX$0 = 
        new javax.xml.namespace.QName("", "directionalPrefix");
    private static final javax.xml.namespace.QName TYPEPREFIX$2 = 
        new javax.xml.namespace.QName("", "typePrefix");
    private static final javax.xml.namespace.QName OFFICIALNAME$4 = 
        new javax.xml.namespace.QName("", "officialName");
    private static final javax.xml.namespace.QName TYPESUFFIX$6 = 
        new javax.xml.namespace.QName("", "typeSuffix");
    private static final javax.xml.namespace.QName DIRECTIONALSUFFIX$8 = 
        new javax.xml.namespace.QName("", "directionalSuffix");
    private static final javax.xml.namespace.QName MUNIOCTANT$10 = 
        new javax.xml.namespace.QName("", "muniOctant");
    
    
    /**
     * Gets the "directionalPrefix" attribute
     */
    public java.lang.String getDirectionalPrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIRECTIONALPREFIX$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "directionalPrefix" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDirectionalPrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DIRECTIONALPREFIX$0);
            return target;
        }
    }
    
    /**
     * True if has "directionalPrefix" attribute
     */
    public boolean isSetDirectionalPrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DIRECTIONALPREFIX$0) != null;
        }
    }
    
    /**
     * Sets the "directionalPrefix" attribute
     */
    public void setDirectionalPrefix(java.lang.String directionalPrefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIRECTIONALPREFIX$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIRECTIONALPREFIX$0);
            }
            target.setStringValue(directionalPrefix);
        }
    }
    
    /**
     * Sets (as xml) the "directionalPrefix" attribute
     */
    public void xsetDirectionalPrefix(org.apache.xmlbeans.XmlString directionalPrefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DIRECTIONALPREFIX$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DIRECTIONALPREFIX$0);
            }
            target.set(directionalPrefix);
        }
    }
    
    /**
     * Unsets the "directionalPrefix" attribute
     */
    public void unsetDirectionalPrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DIRECTIONALPREFIX$0);
        }
    }
    
    /**
     * Gets the "typePrefix" attribute
     */
    public java.lang.String getTypePrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPEPREFIX$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "typePrefix" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTypePrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPEPREFIX$2);
            return target;
        }
    }
    
    /**
     * True if has "typePrefix" attribute
     */
    public boolean isSetTypePrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPEPREFIX$2) != null;
        }
    }
    
    /**
     * Sets the "typePrefix" attribute
     */
    public void setTypePrefix(java.lang.String typePrefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPEPREFIX$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPEPREFIX$2);
            }
            target.setStringValue(typePrefix);
        }
    }
    
    /**
     * Sets (as xml) the "typePrefix" attribute
     */
    public void xsetTypePrefix(org.apache.xmlbeans.XmlString typePrefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPEPREFIX$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPEPREFIX$2);
            }
            target.set(typePrefix);
        }
    }
    
    /**
     * Unsets the "typePrefix" attribute
     */
    public void unsetTypePrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPEPREFIX$2);
        }
    }
    
    /**
     * Gets the "officialName" attribute
     */
    public java.lang.String getOfficialName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OFFICIALNAME$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "officialName" attribute
     */
    public org.apache.xmlbeans.XmlString xgetOfficialName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OFFICIALNAME$4);
            return target;
        }
    }
    
    /**
     * True if has "officialName" attribute
     */
    public boolean isSetOfficialName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OFFICIALNAME$4) != null;
        }
    }
    
    /**
     * Sets the "officialName" attribute
     */
    public void setOfficialName(java.lang.String officialName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OFFICIALNAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OFFICIALNAME$4);
            }
            target.setStringValue(officialName);
        }
    }
    
    /**
     * Sets (as xml) the "officialName" attribute
     */
    public void xsetOfficialName(org.apache.xmlbeans.XmlString officialName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OFFICIALNAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OFFICIALNAME$4);
            }
            target.set(officialName);
        }
    }
    
    /**
     * Unsets the "officialName" attribute
     */
    public void unsetOfficialName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OFFICIALNAME$4);
        }
    }
    
    /**
     * Gets the "typeSuffix" attribute
     */
    public java.lang.String getTypeSuffix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPESUFFIX$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "typeSuffix" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTypeSuffix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPESUFFIX$6);
            return target;
        }
    }
    
    /**
     * True if has "typeSuffix" attribute
     */
    public boolean isSetTypeSuffix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPESUFFIX$6) != null;
        }
    }
    
    /**
     * Sets the "typeSuffix" attribute
     */
    public void setTypeSuffix(java.lang.String typeSuffix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPESUFFIX$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPESUFFIX$6);
            }
            target.setStringValue(typeSuffix);
        }
    }
    
    /**
     * Sets (as xml) the "typeSuffix" attribute
     */
    public void xsetTypeSuffix(org.apache.xmlbeans.XmlString typeSuffix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPESUFFIX$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPESUFFIX$6);
            }
            target.set(typeSuffix);
        }
    }
    
    /**
     * Unsets the "typeSuffix" attribute
     */
    public void unsetTypeSuffix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPESUFFIX$6);
        }
    }
    
    /**
     * Gets the "directionalSuffix" attribute
     */
    public java.lang.String getDirectionalSuffix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIRECTIONALSUFFIX$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "directionalSuffix" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDirectionalSuffix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DIRECTIONALSUFFIX$8);
            return target;
        }
    }
    
    /**
     * True if has "directionalSuffix" attribute
     */
    public boolean isSetDirectionalSuffix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DIRECTIONALSUFFIX$8) != null;
        }
    }
    
    /**
     * Sets the "directionalSuffix" attribute
     */
    public void setDirectionalSuffix(java.lang.String directionalSuffix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIRECTIONALSUFFIX$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIRECTIONALSUFFIX$8);
            }
            target.setStringValue(directionalSuffix);
        }
    }
    
    /**
     * Sets (as xml) the "directionalSuffix" attribute
     */
    public void xsetDirectionalSuffix(org.apache.xmlbeans.XmlString directionalSuffix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DIRECTIONALSUFFIX$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DIRECTIONALSUFFIX$8);
            }
            target.set(directionalSuffix);
        }
    }
    
    /**
     * Unsets the "directionalSuffix" attribute
     */
    public void unsetDirectionalSuffix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DIRECTIONALSUFFIX$8);
        }
    }
    
    /**
     * Gets the "muniOctant" attribute
     */
    public net.opengis.gml.CompassPointEnumeration.Enum getMuniOctant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MUNIOCTANT$10);
            if (target == null)
            {
                return null;
            }
            return (net.opengis.gml.CompassPointEnumeration.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "muniOctant" attribute
     */
    public net.opengis.gml.CompassPointEnumeration xgetMuniOctant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CompassPointEnumeration target = null;
            target = (net.opengis.gml.CompassPointEnumeration)get_store().find_attribute_user(MUNIOCTANT$10);
            return target;
        }
    }
    
    /**
     * True if has "muniOctant" attribute
     */
    public boolean isSetMuniOctant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MUNIOCTANT$10) != null;
        }
    }
    
    /**
     * Sets the "muniOctant" attribute
     */
    public void setMuniOctant(net.opengis.gml.CompassPointEnumeration.Enum muniOctant)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MUNIOCTANT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MUNIOCTANT$10);
            }
            target.setEnumValue(muniOctant);
        }
    }
    
    /**
     * Sets (as xml) the "muniOctant" attribute
     */
    public void xsetMuniOctant(net.opengis.gml.CompassPointEnumeration muniOctant)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CompassPointEnumeration target = null;
            target = (net.opengis.gml.CompassPointEnumeration)get_store().find_attribute_user(MUNIOCTANT$10);
            if (target == null)
            {
                target = (net.opengis.gml.CompassPointEnumeration)get_store().add_attribute_user(MUNIOCTANT$10);
            }
            target.set(muniOctant);
        }
    }
    
    /**
     * Unsets the "muniOctant" attribute
     */
    public void unsetMuniOctant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MUNIOCTANT$10);
        }
    }
}
