/*
 * XML Type:  RequestHeaderType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.RequestHeaderType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML RequestHeaderType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class RequestHeaderTypeImpl extends net.opengis.xls.impl.AbstractHeaderTypeImpl implements net.opengis.xls.RequestHeaderType
{
    private static final long serialVersionUID = 1L;
    
    public RequestHeaderTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLIENTNAME$0 = 
        new javax.xml.namespace.QName("", "clientName");
    private static final javax.xml.namespace.QName CLIENTPASSWORD$2 = 
        new javax.xml.namespace.QName("", "clientPassword");
    private static final javax.xml.namespace.QName SESSIONID$4 = 
        new javax.xml.namespace.QName("", "sessionID");
    private static final javax.xml.namespace.QName SRSNAME$6 = 
        new javax.xml.namespace.QName("", "srsName");
    private static final javax.xml.namespace.QName MSID$8 = 
        new javax.xml.namespace.QName("", "MSID");
    
    
    /**
     * Gets the "clientName" attribute
     */
    public java.lang.String getClientName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLIENTNAME$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "clientName" attribute
     */
    public org.apache.xmlbeans.XmlString xgetClientName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLIENTNAME$0);
            return target;
        }
    }
    
    /**
     * True if has "clientName" attribute
     */
    public boolean isSetClientName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CLIENTNAME$0) != null;
        }
    }
    
    /**
     * Sets the "clientName" attribute
     */
    public void setClientName(java.lang.String clientName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLIENTNAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLIENTNAME$0);
            }
            target.setStringValue(clientName);
        }
    }
    
    /**
     * Sets (as xml) the "clientName" attribute
     */
    public void xsetClientName(org.apache.xmlbeans.XmlString clientName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLIENTNAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CLIENTNAME$0);
            }
            target.set(clientName);
        }
    }
    
    /**
     * Unsets the "clientName" attribute
     */
    public void unsetClientName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CLIENTNAME$0);
        }
    }
    
    /**
     * Gets the "clientPassword" attribute
     */
    public java.lang.String getClientPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLIENTPASSWORD$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "clientPassword" attribute
     */
    public org.apache.xmlbeans.XmlString xgetClientPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLIENTPASSWORD$2);
            return target;
        }
    }
    
    /**
     * True if has "clientPassword" attribute
     */
    public boolean isSetClientPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CLIENTPASSWORD$2) != null;
        }
    }
    
    /**
     * Sets the "clientPassword" attribute
     */
    public void setClientPassword(java.lang.String clientPassword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLIENTPASSWORD$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLIENTPASSWORD$2);
            }
            target.setStringValue(clientPassword);
        }
    }
    
    /**
     * Sets (as xml) the "clientPassword" attribute
     */
    public void xsetClientPassword(org.apache.xmlbeans.XmlString clientPassword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLIENTPASSWORD$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CLIENTPASSWORD$2);
            }
            target.set(clientPassword);
        }
    }
    
    /**
     * Unsets the "clientPassword" attribute
     */
    public void unsetClientPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CLIENTPASSWORD$2);
        }
    }
    
    /**
     * Gets the "sessionID" attribute
     */
    public java.lang.String getSessionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SESSIONID$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sessionID" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSessionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SESSIONID$4);
            return target;
        }
    }
    
    /**
     * True if has "sessionID" attribute
     */
    public boolean isSetSessionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SESSIONID$4) != null;
        }
    }
    
    /**
     * Sets the "sessionID" attribute
     */
    public void setSessionID(java.lang.String sessionID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SESSIONID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SESSIONID$4);
            }
            target.setStringValue(sessionID);
        }
    }
    
    /**
     * Sets (as xml) the "sessionID" attribute
     */
    public void xsetSessionID(org.apache.xmlbeans.XmlString sessionID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SESSIONID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SESSIONID$4);
            }
            target.set(sessionID);
        }
    }
    
    /**
     * Unsets the "sessionID" attribute
     */
    public void unsetSessionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SESSIONID$4);
        }
    }
    
    /**
     * Gets the "srsName" attribute
     */
    public java.lang.String getSrsName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SRSNAME$6);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(SRSNAME$6);
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
            return get_store().find_attribute_user(SRSNAME$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SRSNAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SRSNAME$6);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(SRSNAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(SRSNAME$6);
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
            get_store().remove_attribute(SRSNAME$6);
        }
    }
    
    /**
     * Gets the "MSID" attribute
     */
    public java.lang.String getMSID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MSID$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MSID" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMSID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MSID$8);
            return target;
        }
    }
    
    /**
     * True if has "MSID" attribute
     */
    public boolean isSetMSID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MSID$8) != null;
        }
    }
    
    /**
     * Sets the "MSID" attribute
     */
    public void setMSID(java.lang.String msid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MSID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MSID$8);
            }
            target.setStringValue(msid);
        }
    }
    
    /**
     * Sets (as xml) the "MSID" attribute
     */
    public void xsetMSID(org.apache.xmlbeans.XmlString msid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MSID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MSID$8);
            }
            target.set(msid);
        }
    }
    
    /**
     * Unsets the "MSID" attribute
     */
    public void unsetMSID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MSID$8);
        }
    }
}
