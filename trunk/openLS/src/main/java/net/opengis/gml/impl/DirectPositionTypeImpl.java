/*
 * XML Type:  DirectPositionType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.DirectPositionType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl;
/**
 * An XML DirectPositionType(@http://www.opengis.net/gml).
 *
 * This is a list type whose items are org.apache.xmlbeans.XmlDouble.
 */
public class DirectPositionTypeImpl extends org.apache.xmlbeans.impl.values.XmlListImpl implements net.opengis.gml.DirectPositionType
{
    private static final long serialVersionUID = 1L;
    
    public DirectPositionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected DirectPositionTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName SRSNAME$0 = 
        new javax.xml.namespace.QName("", "srsName");
    private static final javax.xml.namespace.QName DIMENSION$2 = 
        new javax.xml.namespace.QName("", "dimension");
    
    
    /**
     * Gets the "srsName" attribute
     */
    public java.lang.String getSrsName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SRSNAME$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "srsName" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetSrsName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(SRSNAME$0);
            return target;
        }
    }
    
    /**
     * True if has "srsName" attribute
     */
    public boolean isSetSrsName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SRSNAME$0) != null;
        }
    }
    
    /**
     * Sets the "srsName" attribute
     */
    public void setSrsName(java.lang.String srsName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SRSNAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SRSNAME$0);
            }
            target.setStringValue(srsName);
        }
    }
    
    /**
     * Sets (as xml) the "srsName" attribute
     */
    public void xsetSrsName(org.apache.xmlbeans.XmlAnyURI srsName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(SRSNAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(SRSNAME$0);
            }
            target.set(srsName);
        }
    }
    
    /**
     * Unsets the "srsName" attribute
     */
    public void unsetSrsName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SRSNAME$0);
        }
    }
    
    /**
     * Gets the "dimension" attribute
     */
    public java.math.BigInteger getDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIMENSION$2);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "dimension" attribute
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(DIMENSION$2);
            return target;
        }
    }
    
    /**
     * True if has "dimension" attribute
     */
    public boolean isSetDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DIMENSION$2) != null;
        }
    }
    
    /**
     * Sets the "dimension" attribute
     */
    public void setDimension(java.math.BigInteger dimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIMENSION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIMENSION$2);
            }
            target.setBigIntegerValue(dimension);
        }
    }
    
    /**
     * Sets (as xml) the "dimension" attribute
     */
    public void xsetDimension(org.apache.xmlbeans.XmlPositiveInteger dimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(DIMENSION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_attribute_user(DIMENSION$2);
            }
            target.set(dimension);
        }
    }
    
    /**
     * Unsets the "dimension" attribute
     */
    public void unsetDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DIMENSION$2);
        }
    }
}
