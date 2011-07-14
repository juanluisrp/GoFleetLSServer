/*
 * XML Type:  NamedPlaceType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.NamedPlaceType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML NamedPlaceType(@http://www.opengis.net/xls).
 *
 * This is an atomic type that is a restriction of net.opengis.xls.NamedPlaceType.
 */
public class NamedPlaceTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements net.opengis.xls.NamedPlaceType
{
    private static final long serialVersionUID = 1L;
    
    public NamedPlaceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected NamedPlaceTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("", "type");
    
    
    /**
     * Gets the "type" attribute
     */
    public net.opengis.xls.NamedPlaceClassification.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                return null;
            }
            return (net.opengis.xls.NamedPlaceClassification.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public net.opengis.xls.NamedPlaceClassification xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.NamedPlaceClassification target = null;
            target = (net.opengis.xls.NamedPlaceClassification)get_store().find_attribute_user(TYPE$0);
            return target;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(net.opengis.xls.NamedPlaceClassification.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(net.opengis.xls.NamedPlaceClassification type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.NamedPlaceClassification target = null;
            target = (net.opengis.xls.NamedPlaceClassification)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (net.opengis.xls.NamedPlaceClassification)get_store().add_attribute_user(TYPE$0);
            }
            target.set(type);
        }
    }
}
