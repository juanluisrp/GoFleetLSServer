/*
 * XML Type:  AbstractMSInformationType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.AbstractMSInformationType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML AbstractMSInformationType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class AbstractMSInformationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.AbstractMSInformationType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractMSInformationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MSIDTYPE$0 = 
        new javax.xml.namespace.QName("", "msIDType");
    private static final javax.xml.namespace.QName MSIDVALUE$2 = 
        new javax.xml.namespace.QName("", "msIDValue");
    private static final javax.xml.namespace.QName ENCRYPTION$4 = 
        new javax.xml.namespace.QName("", "encryption");
    
    
    /**
     * Gets the "msIDType" attribute
     */
    public net.opengis.xls.AbstractMSInformationType.MsIDType.Enum getMsIDType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MSIDTYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MSIDTYPE$0);
            }
            if (target == null)
            {
                return null;
            }
            return (net.opengis.xls.AbstractMSInformationType.MsIDType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "msIDType" attribute
     */
    public net.opengis.xls.AbstractMSInformationType.MsIDType xgetMsIDType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractMSInformationType.MsIDType target = null;
            target = (net.opengis.xls.AbstractMSInformationType.MsIDType)get_store().find_attribute_user(MSIDTYPE$0);
            if (target == null)
            {
                target = (net.opengis.xls.AbstractMSInformationType.MsIDType)get_default_attribute_value(MSIDTYPE$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "msIDType" attribute
     */
    public boolean isSetMsIDType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MSIDTYPE$0) != null;
        }
    }
    
    /**
     * Sets the "msIDType" attribute
     */
    public void setMsIDType(net.opengis.xls.AbstractMSInformationType.MsIDType.Enum msIDType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MSIDTYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MSIDTYPE$0);
            }
            target.setEnumValue(msIDType);
        }
    }
    
    /**
     * Sets (as xml) the "msIDType" attribute
     */
    public void xsetMsIDType(net.opengis.xls.AbstractMSInformationType.MsIDType msIDType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractMSInformationType.MsIDType target = null;
            target = (net.opengis.xls.AbstractMSInformationType.MsIDType)get_store().find_attribute_user(MSIDTYPE$0);
            if (target == null)
            {
                target = (net.opengis.xls.AbstractMSInformationType.MsIDType)get_store().add_attribute_user(MSIDTYPE$0);
            }
            target.set(msIDType);
        }
    }
    
    /**
     * Unsets the "msIDType" attribute
     */
    public void unsetMsIDType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MSIDTYPE$0);
        }
    }
    
    /**
     * Gets the "msIDValue" attribute
     */
    public java.lang.String getMsIDValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MSIDVALUE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "msIDValue" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMsIDValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MSIDVALUE$2);
            return target;
        }
    }
    
    /**
     * True if has "msIDValue" attribute
     */
    public boolean isSetMsIDValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MSIDVALUE$2) != null;
        }
    }
    
    /**
     * Sets the "msIDValue" attribute
     */
    public void setMsIDValue(java.lang.String msIDValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MSIDVALUE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MSIDVALUE$2);
            }
            target.setStringValue(msIDValue);
        }
    }
    
    /**
     * Sets (as xml) the "msIDValue" attribute
     */
    public void xsetMsIDValue(org.apache.xmlbeans.XmlString msIDValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MSIDVALUE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MSIDVALUE$2);
            }
            target.set(msIDValue);
        }
    }
    
    /**
     * Unsets the "msIDValue" attribute
     */
    public void unsetMsIDValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MSIDVALUE$2);
        }
    }
    
    /**
     * Gets the "encryption" attribute
     */
    public net.opengis.xls.AbstractMSInformationType.Encryption.Enum getEncryption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCRYPTION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ENCRYPTION$4);
            }
            if (target == null)
            {
                return null;
            }
            return (net.opengis.xls.AbstractMSInformationType.Encryption.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "encryption" attribute
     */
    public net.opengis.xls.AbstractMSInformationType.Encryption xgetEncryption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractMSInformationType.Encryption target = null;
            target = (net.opengis.xls.AbstractMSInformationType.Encryption)get_store().find_attribute_user(ENCRYPTION$4);
            if (target == null)
            {
                target = (net.opengis.xls.AbstractMSInformationType.Encryption)get_default_attribute_value(ENCRYPTION$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "encryption" attribute
     */
    public boolean isSetEncryption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ENCRYPTION$4) != null;
        }
    }
    
    /**
     * Sets the "encryption" attribute
     */
    public void setEncryption(net.opengis.xls.AbstractMSInformationType.Encryption.Enum encryption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCRYPTION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENCRYPTION$4);
            }
            target.setEnumValue(encryption);
        }
    }
    
    /**
     * Sets (as xml) the "encryption" attribute
     */
    public void xsetEncryption(net.opengis.xls.AbstractMSInformationType.Encryption encryption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractMSInformationType.Encryption target = null;
            target = (net.opengis.xls.AbstractMSInformationType.Encryption)get_store().find_attribute_user(ENCRYPTION$4);
            if (target == null)
            {
                target = (net.opengis.xls.AbstractMSInformationType.Encryption)get_store().add_attribute_user(ENCRYPTION$4);
            }
            target.set(encryption);
        }
    }
    
    /**
     * Unsets the "encryption" attribute
     */
    public void unsetEncryption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ENCRYPTION$4);
        }
    }
    /**
     * An XML msIDType(@).
     *
     * This is an atomic type that is a restriction of net.opengis.xls.AbstractMSInformationType$MsIDType.
     */
    public static class MsIDTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements net.opengis.xls.AbstractMSInformationType.MsIDType
    {
        private static final long serialVersionUID = 1L;
        
        public MsIDTypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected MsIDTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML encryption(@).
     *
     * This is an atomic type that is a restriction of net.opengis.xls.AbstractMSInformationType$Encryption.
     */
    public static class EncryptionImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements net.opengis.xls.AbstractMSInformationType.Encryption
    {
        private static final long serialVersionUID = 1L;
        
        public EncryptionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected EncryptionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
