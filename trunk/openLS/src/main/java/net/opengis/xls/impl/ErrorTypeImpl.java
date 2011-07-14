/*
 * XML Type:  ErrorType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.ErrorType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML ErrorType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class ErrorTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.ErrorType
{
    private static final long serialVersionUID = 1L;
    
    public ErrorTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERRORCODE$0 = 
        new javax.xml.namespace.QName("", "errorCode");
    private static final javax.xml.namespace.QName SEVERITY$2 = 
        new javax.xml.namespace.QName("", "severity");
    private static final javax.xml.namespace.QName LOCATIONID$4 = 
        new javax.xml.namespace.QName("", "locationID");
    private static final javax.xml.namespace.QName LOCATIONPATH$6 = 
        new javax.xml.namespace.QName("", "locationPath");
    private static final javax.xml.namespace.QName MESSAGE$8 = 
        new javax.xml.namespace.QName("", "message");
    
    
    /**
     * Gets the "errorCode" attribute
     */
    public net.opengis.xls.ErrorCodeType.Enum getErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORCODE$0);
            if (target == null)
            {
                return null;
            }
            return (net.opengis.xls.ErrorCodeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "errorCode" attribute
     */
    public net.opengis.xls.ErrorCodeType xgetErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ErrorCodeType target = null;
            target = (net.opengis.xls.ErrorCodeType)get_store().find_attribute_user(ERRORCODE$0);
            return target;
        }
    }
    
    /**
     * Sets the "errorCode" attribute
     */
    public void setErrorCode(net.opengis.xls.ErrorCodeType.Enum errorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORCODE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ERRORCODE$0);
            }
            target.setEnumValue(errorCode);
        }
    }
    
    /**
     * Sets (as xml) the "errorCode" attribute
     */
    public void xsetErrorCode(net.opengis.xls.ErrorCodeType errorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ErrorCodeType target = null;
            target = (net.opengis.xls.ErrorCodeType)get_store().find_attribute_user(ERRORCODE$0);
            if (target == null)
            {
                target = (net.opengis.xls.ErrorCodeType)get_store().add_attribute_user(ERRORCODE$0);
            }
            target.set(errorCode);
        }
    }
    
    /**
     * Gets the "severity" attribute
     */
    public net.opengis.xls.SeverityType.Enum getSeverity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEVERITY$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SEVERITY$2);
            }
            if (target == null)
            {
                return null;
            }
            return (net.opengis.xls.SeverityType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "severity" attribute
     */
    public net.opengis.xls.SeverityType xgetSeverity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.SeverityType target = null;
            target = (net.opengis.xls.SeverityType)get_store().find_attribute_user(SEVERITY$2);
            if (target == null)
            {
                target = (net.opengis.xls.SeverityType)get_default_attribute_value(SEVERITY$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "severity" attribute
     */
    public boolean isSetSeverity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SEVERITY$2) != null;
        }
    }
    
    /**
     * Sets the "severity" attribute
     */
    public void setSeverity(net.opengis.xls.SeverityType.Enum severity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEVERITY$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SEVERITY$2);
            }
            target.setEnumValue(severity);
        }
    }
    
    /**
     * Sets (as xml) the "severity" attribute
     */
    public void xsetSeverity(net.opengis.xls.SeverityType severity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.SeverityType target = null;
            target = (net.opengis.xls.SeverityType)get_store().find_attribute_user(SEVERITY$2);
            if (target == null)
            {
                target = (net.opengis.xls.SeverityType)get_store().add_attribute_user(SEVERITY$2);
            }
            target.set(severity);
        }
    }
    
    /**
     * Unsets the "severity" attribute
     */
    public void unsetSeverity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SEVERITY$2);
        }
    }
    
    /**
     * Gets the "locationID" attribute
     */
    public java.lang.String getLocationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATIONID$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "locationID" attribute
     */
    public org.apache.xmlbeans.XmlIDREF xgetLocationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(LOCATIONID$4);
            return target;
        }
    }
    
    /**
     * True if has "locationID" attribute
     */
    public boolean isSetLocationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LOCATIONID$4) != null;
        }
    }
    
    /**
     * Sets the "locationID" attribute
     */
    public void setLocationID(java.lang.String locationID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATIONID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCATIONID$4);
            }
            target.setStringValue(locationID);
        }
    }
    
    /**
     * Sets (as xml) the "locationID" attribute
     */
    public void xsetLocationID(org.apache.xmlbeans.XmlIDREF locationID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(LOCATIONID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREF)get_store().add_attribute_user(LOCATIONID$4);
            }
            target.set(locationID);
        }
    }
    
    /**
     * Unsets the "locationID" attribute
     */
    public void unsetLocationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LOCATIONID$4);
        }
    }
    
    /**
     * Gets the "locationPath" attribute
     */
    public java.lang.String getLocationPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATIONPATH$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "locationPath" attribute
     */
    public org.apache.xmlbeans.XmlString xgetLocationPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOCATIONPATH$6);
            return target;
        }
    }
    
    /**
     * True if has "locationPath" attribute
     */
    public boolean isSetLocationPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LOCATIONPATH$6) != null;
        }
    }
    
    /**
     * Sets the "locationPath" attribute
     */
    public void setLocationPath(java.lang.String locationPath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATIONPATH$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCATIONPATH$6);
            }
            target.setStringValue(locationPath);
        }
    }
    
    /**
     * Sets (as xml) the "locationPath" attribute
     */
    public void xsetLocationPath(org.apache.xmlbeans.XmlString locationPath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOCATIONPATH$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LOCATIONPATH$6);
            }
            target.set(locationPath);
        }
    }
    
    /**
     * Unsets the "locationPath" attribute
     */
    public void unsetLocationPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LOCATIONPATH$6);
        }
    }
    
    /**
     * Gets the "message" attribute
     */
    public java.lang.String getMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MESSAGE$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "message" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MESSAGE$8);
            return target;
        }
    }
    
    /**
     * True if has "message" attribute
     */
    public boolean isSetMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MESSAGE$8) != null;
        }
    }
    
    /**
     * Sets the "message" attribute
     */
    public void setMessage(java.lang.String message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MESSAGE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MESSAGE$8);
            }
            target.setStringValue(message);
        }
    }
    
    /**
     * Sets (as xml) the "message" attribute
     */
    public void xsetMessage(org.apache.xmlbeans.XmlString message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MESSAGE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MESSAGE$8);
            }
            target.set(message);
        }
    }
    
    /**
     * Unsets the "message" attribute
     */
    public void unsetMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MESSAGE$8);
        }
    }
}
