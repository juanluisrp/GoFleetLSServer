/*
 * An XML attribute type.
 * Localname: mustUnderstand
 * Namespace: http://schemas.xmlsoap.org/soap/envelope/
 * Java type: org.xmlsoap.schemas.soap.envelope.MustUnderstandAttribute
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.soap.envelope.impl;
/**
 * A document containing one mustUnderstand(@http://schemas.xmlsoap.org/soap/envelope/) attribute.
 *
 * This is a complex type.
 */
public class MustUnderstandAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.soap.envelope.MustUnderstandAttribute
{
    private static final long serialVersionUID = 1L;
    
    public MustUnderstandAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MUSTUNDERSTAND$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/envelope/", "mustUnderstand");
    
    
    /**
     * Gets the "mustUnderstand" attribute
     */
    public boolean getMustUnderstand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MUSTUNDERSTAND$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MUSTUNDERSTAND$0);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "mustUnderstand" attribute
     */
    public org.xmlsoap.schemas.soap.envelope.MustUnderstandAttribute.MustUnderstand xgetMustUnderstand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.envelope.MustUnderstandAttribute.MustUnderstand target = null;
            target = (org.xmlsoap.schemas.soap.envelope.MustUnderstandAttribute.MustUnderstand)get_store().find_attribute_user(MUSTUNDERSTAND$0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.envelope.MustUnderstandAttribute.MustUnderstand)get_default_attribute_value(MUSTUNDERSTAND$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "mustUnderstand" attribute
     */
    public boolean isSetMustUnderstand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MUSTUNDERSTAND$0) != null;
        }
    }
    
    /**
     * Sets the "mustUnderstand" attribute
     */
    public void setMustUnderstand(boolean mustUnderstand)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MUSTUNDERSTAND$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MUSTUNDERSTAND$0);
            }
            target.setBooleanValue(mustUnderstand);
        }
    }
    
    /**
     * Sets (as xml) the "mustUnderstand" attribute
     */
    public void xsetMustUnderstand(org.xmlsoap.schemas.soap.envelope.MustUnderstandAttribute.MustUnderstand mustUnderstand)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.envelope.MustUnderstandAttribute.MustUnderstand target = null;
            target = (org.xmlsoap.schemas.soap.envelope.MustUnderstandAttribute.MustUnderstand)get_store().find_attribute_user(MUSTUNDERSTAND$0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.envelope.MustUnderstandAttribute.MustUnderstand)get_store().add_attribute_user(MUSTUNDERSTAND$0);
            }
            target.set(mustUnderstand);
        }
    }
    
    /**
     * Unsets the "mustUnderstand" attribute
     */
    public void unsetMustUnderstand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MUSTUNDERSTAND$0);
        }
    }
    /**
     * An XML mustUnderstand(@http://schemas.xmlsoap.org/soap/envelope/).
     *
     * This is an atomic type that is a restriction of org.xmlsoap.schemas.soap.envelope.MustUnderstandAttribute$MustUnderstand.
     */
    public static class MustUnderstandImpl extends org.apache.xmlbeans.impl.values.JavaBooleanHolderEx implements org.xmlsoap.schemas.soap.envelope.MustUnderstandAttribute.MustUnderstand
    {
        private static final long serialVersionUID = 1L;
        
        public MustUnderstandImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected MustUnderstandImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
