/*
 * XML Type:  Fault
 * Namespace: http://schemas.xmlsoap.org/soap/envelope/
 * Java type: org.xmlsoap.schemas.soap.envelope.Fault
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.soap.envelope.impl;
/**
 * An XML Fault(@http://schemas.xmlsoap.org/soap/envelope/).
 *
 * This is a complex type.
 */
public class FaultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.soap.envelope.Fault
{
    private static final long serialVersionUID = 1L;
    
    public FaultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FAULTCODE$0 = 
        new javax.xml.namespace.QName("", "faultcode");
    private static final javax.xml.namespace.QName FAULTSTRING$2 = 
        new javax.xml.namespace.QName("", "faultstring");
    private static final javax.xml.namespace.QName FAULTACTOR$4 = 
        new javax.xml.namespace.QName("", "faultactor");
    private static final javax.xml.namespace.QName DETAIL$6 = 
        new javax.xml.namespace.QName("", "detail");
    
    
    /**
     * Gets the "faultcode" element
     */
    public javax.xml.namespace.QName getFaultcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAULTCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "faultcode" element
     */
    public org.apache.xmlbeans.XmlQName xgetFaultcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(FAULTCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "faultcode" element
     */
    public void setFaultcode(javax.xml.namespace.QName faultcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAULTCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAULTCODE$0);
            }
            target.setQNameValue(faultcode);
        }
    }
    
    /**
     * Sets (as xml) the "faultcode" element
     */
    public void xsetFaultcode(org.apache.xmlbeans.XmlQName faultcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(FAULTCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(FAULTCODE$0);
            }
            target.set(faultcode);
        }
    }
    
    /**
     * Gets the "faultstring" element
     */
    public java.lang.String getFaultstring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAULTSTRING$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "faultstring" element
     */
    public org.apache.xmlbeans.XmlString xgetFaultstring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAULTSTRING$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "faultstring" element
     */
    public void setFaultstring(java.lang.String faultstring)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAULTSTRING$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAULTSTRING$2);
            }
            target.setStringValue(faultstring);
        }
    }
    
    /**
     * Sets (as xml) the "faultstring" element
     */
    public void xsetFaultstring(org.apache.xmlbeans.XmlString faultstring)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAULTSTRING$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FAULTSTRING$2);
            }
            target.set(faultstring);
        }
    }
    
    /**
     * Gets the "faultactor" element
     */
    public java.lang.String getFaultactor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAULTACTOR$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "faultactor" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetFaultactor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(FAULTACTOR$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "faultactor" element
     */
    public boolean isSetFaultactor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FAULTACTOR$4) != 0;
        }
    }
    
    /**
     * Sets the "faultactor" element
     */
    public void setFaultactor(java.lang.String faultactor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAULTACTOR$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAULTACTOR$4);
            }
            target.setStringValue(faultactor);
        }
    }
    
    /**
     * Sets (as xml) the "faultactor" element
     */
    public void xsetFaultactor(org.apache.xmlbeans.XmlAnyURI faultactor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(FAULTACTOR$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(FAULTACTOR$4);
            }
            target.set(faultactor);
        }
    }
    
    /**
     * Unsets the "faultactor" element
     */
    public void unsetFaultactor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FAULTACTOR$4, 0);
        }
    }
    
    /**
     * Gets the "detail" element
     */
    public org.xmlsoap.schemas.soap.envelope.Detail getDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.envelope.Detail target = null;
            target = (org.xmlsoap.schemas.soap.envelope.Detail)get_store().find_element_user(DETAIL$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "detail" element
     */
    public boolean isSetDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DETAIL$6) != 0;
        }
    }
    
    /**
     * Sets the "detail" element
     */
    public void setDetail(org.xmlsoap.schemas.soap.envelope.Detail detail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.envelope.Detail target = null;
            target = (org.xmlsoap.schemas.soap.envelope.Detail)get_store().find_element_user(DETAIL$6, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.envelope.Detail)get_store().add_element_user(DETAIL$6);
            }
            target.set(detail);
        }
    }
    
    /**
     * Appends and returns a new empty "detail" element
     */
    public org.xmlsoap.schemas.soap.envelope.Detail addNewDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.envelope.Detail target = null;
            target = (org.xmlsoap.schemas.soap.envelope.Detail)get_store().add_element_user(DETAIL$6);
            return target;
        }
    }
    
    /**
     * Unsets the "detail" element
     */
    public void unsetDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DETAIL$6, 0);
        }
    }
}
