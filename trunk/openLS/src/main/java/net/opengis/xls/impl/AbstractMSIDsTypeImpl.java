/*
 * XML Type:  AbstractMSIDsType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.AbstractMSIDsType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML AbstractMSIDsType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class AbstractMSIDsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.AbstractMSIDsType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractMSIDsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SESSION$0 = 
        new javax.xml.namespace.QName("", "session");
    
    
    /**
     * Gets the "session" attribute
     */
    public net.opengis.xls.AbstractMSIDsType.Session.Enum getSession()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SESSION$0);
            if (target == null)
            {
                return null;
            }
            return (net.opengis.xls.AbstractMSIDsType.Session.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "session" attribute
     */
    public net.opengis.xls.AbstractMSIDsType.Session xgetSession()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractMSIDsType.Session target = null;
            target = (net.opengis.xls.AbstractMSIDsType.Session)get_store().find_attribute_user(SESSION$0);
            return target;
        }
    }
    
    /**
     * True if has "session" attribute
     */
    public boolean isSetSession()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SESSION$0) != null;
        }
    }
    
    /**
     * Sets the "session" attribute
     */
    public void setSession(net.opengis.xls.AbstractMSIDsType.Session.Enum session)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SESSION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SESSION$0);
            }
            target.setEnumValue(session);
        }
    }
    
    /**
     * Sets (as xml) the "session" attribute
     */
    public void xsetSession(net.opengis.xls.AbstractMSIDsType.Session session)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractMSIDsType.Session target = null;
            target = (net.opengis.xls.AbstractMSIDsType.Session)get_store().find_attribute_user(SESSION$0);
            if (target == null)
            {
                target = (net.opengis.xls.AbstractMSIDsType.Session)get_store().add_attribute_user(SESSION$0);
            }
            target.set(session);
        }
    }
    
    /**
     * Unsets the "session" attribute
     */
    public void unsetSession()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SESSION$0);
        }
    }
    /**
     * An XML session(@).
     *
     * This is an atomic type that is a restriction of net.opengis.xls.AbstractMSIDsType$Session.
     */
    public static class SessionImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements net.opengis.xls.AbstractMSIDsType.Session
    {
        private static final long serialVersionUID = 1L;
        
        public SessionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected SessionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
