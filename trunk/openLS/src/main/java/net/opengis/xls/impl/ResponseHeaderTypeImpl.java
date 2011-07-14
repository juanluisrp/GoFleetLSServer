/*
 * XML Type:  ResponseHeaderType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.ResponseHeaderType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML ResponseHeaderType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class ResponseHeaderTypeImpl extends net.opengis.xls.impl.AbstractHeaderTypeImpl implements net.opengis.xls.ResponseHeaderType
{
    private static final long serialVersionUID = 1L;
    
    public ResponseHeaderTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERRORLIST$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "ErrorList");
    private static final javax.xml.namespace.QName SESSIONID$2 = 
        new javax.xml.namespace.QName("", "sessionID");
    
    
    /**
     * Gets the "ErrorList" element
     */
    public net.opengis.xls.ErrorListType getErrorList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ErrorListType target = null;
            target = (net.opengis.xls.ErrorListType)get_store().find_element_user(ERRORLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ErrorList" element
     */
    public boolean isSetErrorList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRORLIST$0) != 0;
        }
    }
    
    /**
     * Sets the "ErrorList" element
     */
    public void setErrorList(net.opengis.xls.ErrorListType errorList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ErrorListType target = null;
            target = (net.opengis.xls.ErrorListType)get_store().find_element_user(ERRORLIST$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.ErrorListType)get_store().add_element_user(ERRORLIST$0);
            }
            target.set(errorList);
        }
    }
    
    /**
     * Appends and returns a new empty "ErrorList" element
     */
    public net.opengis.xls.ErrorListType addNewErrorList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ErrorListType target = null;
            target = (net.opengis.xls.ErrorListType)get_store().add_element_user(ERRORLIST$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ErrorList" element
     */
    public void unsetErrorList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRORLIST$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SESSIONID$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SESSIONID$2);
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
            return get_store().find_attribute_user(SESSIONID$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SESSIONID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SESSIONID$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SESSIONID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SESSIONID$2);
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
            get_store().remove_attribute(SESSIONID$2);
        }
    }
}
