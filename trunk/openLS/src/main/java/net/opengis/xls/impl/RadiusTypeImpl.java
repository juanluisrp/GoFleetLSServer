/*
 * XML Type:  RadiusType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.RadiusType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML RadiusType(@http://www.opengis.net/xls).
 *
 * This is an atomic type that is a restriction of net.opengis.xls.RadiusType.
 */
public class RadiusTypeImpl extends org.apache.xmlbeans.impl.values.JavaDecimalHolderEx implements net.opengis.xls.RadiusType
{
    private static final long serialVersionUID = 1L;
    
    public RadiusTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected RadiusTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName UNIT$0 = 
        new javax.xml.namespace.QName("", "unit");
    
    
    /**
     * Gets the "unit" attribute
     */
    public net.opengis.xls.DistanceUnitType.Enum getUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIT$0);
            if (target == null)
            {
                return null;
            }
            return (net.opengis.xls.DistanceUnitType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "unit" attribute
     */
    public net.opengis.xls.DistanceUnitType xgetUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.DistanceUnitType target = null;
            target = (net.opengis.xls.DistanceUnitType)get_store().find_attribute_user(UNIT$0);
            return target;
        }
    }
    
    /**
     * Sets the "unit" attribute
     */
    public void setUnit(net.opengis.xls.DistanceUnitType.Enum unit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNIT$0);
            }
            target.setEnumValue(unit);
        }
    }
    
    /**
     * Sets (as xml) the "unit" attribute
     */
    public void xsetUnit(net.opengis.xls.DistanceUnitType unit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.DistanceUnitType target = null;
            target = (net.opengis.xls.DistanceUnitType)get_store().find_attribute_user(UNIT$0);
            if (target == null)
            {
                target = (net.opengis.xls.DistanceUnitType)get_store().add_attribute_user(UNIT$0);
            }
            target.set(unit);
        }
    }
}
