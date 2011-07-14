/*
 * XML Type:  AbstractMeasureType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.AbstractMeasureType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML AbstractMeasureType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class AbstractMeasureTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.AbstractMeasureType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractMeasureTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUE$0 = 
        new javax.xml.namespace.QName("", "value");
    private static final javax.xml.namespace.QName ACCURACY$2 = 
        new javax.xml.namespace.QName("", "accuracy");
    
    
    /**
     * Gets the "value" attribute
     */
    public java.math.BigDecimal getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "value" attribute
     */
    public org.apache.xmlbeans.XmlDecimal xgetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(VALUE$0);
            return target;
        }
    }
    
    /**
     * Sets the "value" attribute
     */
    public void setValue(java.math.BigDecimal value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$0);
            }
            target.setBigDecimalValue(value);
        }
    }
    
    /**
     * Sets (as xml) the "value" attribute
     */
    public void xsetValue(org.apache.xmlbeans.XmlDecimal value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(VALUE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(VALUE$0);
            }
            target.set(value);
        }
    }
    
    /**
     * Gets the "accuracy" attribute
     */
    public java.math.BigDecimal getAccuracy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCURACY$2);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "accuracy" attribute
     */
    public org.apache.xmlbeans.XmlDecimal xgetAccuracy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(ACCURACY$2);
            return target;
        }
    }
    
    /**
     * True if has "accuracy" attribute
     */
    public boolean isSetAccuracy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACCURACY$2) != null;
        }
    }
    
    /**
     * Sets the "accuracy" attribute
     */
    public void setAccuracy(java.math.BigDecimal accuracy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCURACY$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACCURACY$2);
            }
            target.setBigDecimalValue(accuracy);
        }
    }
    
    /**
     * Sets (as xml) the "accuracy" attribute
     */
    public void xsetAccuracy(org.apache.xmlbeans.XmlDecimal accuracy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(ACCURACY$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(ACCURACY$2);
            }
            target.set(accuracy);
        }
    }
    
    /**
     * Unsets the "accuracy" attribute
     */
    public void unsetAccuracy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACCURACY$2);
        }
    }
}
