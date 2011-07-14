/*
 * XML Type:  SpeedType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.SpeedType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML SpeedType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class SpeedTypeImpl extends net.opengis.xls.impl.AbstractMeasureTypeImpl implements net.opengis.xls.SpeedType
{
    private static final long serialVersionUID = 1L;
    
    public SpeedTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UOM$0 = 
        new javax.xml.namespace.QName("", "uom");
    
    
    /**
     * Gets the "uom" attribute
     */
    public net.opengis.xls.SpeedUnitType.Enum getUom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UOM$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(UOM$0);
            }
            if (target == null)
            {
                return null;
            }
            return (net.opengis.xls.SpeedUnitType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "uom" attribute
     */
    public net.opengis.xls.SpeedUnitType xgetUom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.SpeedUnitType target = null;
            target = (net.opengis.xls.SpeedUnitType)get_store().find_attribute_user(UOM$0);
            if (target == null)
            {
                target = (net.opengis.xls.SpeedUnitType)get_default_attribute_value(UOM$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "uom" attribute
     */
    public boolean isSetUom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(UOM$0) != null;
        }
    }
    
    /**
     * Sets the "uom" attribute
     */
    public void setUom(net.opengis.xls.SpeedUnitType.Enum uom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UOM$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UOM$0);
            }
            target.setEnumValue(uom);
        }
    }
    
    /**
     * Sets (as xml) the "uom" attribute
     */
    public void xsetUom(net.opengis.xls.SpeedUnitType uom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.SpeedUnitType target = null;
            target = (net.opengis.xls.SpeedUnitType)get_store().find_attribute_user(UOM$0);
            if (target == null)
            {
                target = (net.opengis.xls.SpeedUnitType)get_store().add_attribute_user(UOM$0);
            }
            target.set(uom);
        }
    }
    
    /**
     * Unsets the "uom" attribute
     */
    public void unsetUom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(UOM$0);
        }
    }
}
