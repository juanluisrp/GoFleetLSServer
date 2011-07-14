/*
 * An XML attribute type.
 * Localname: actor
 * Namespace: http://schemas.xmlsoap.org/soap/envelope/
 * Java type: org.xmlsoap.schemas.soap.envelope.ActorAttribute
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.soap.envelope.impl;
/**
 * A document containing one actor(@http://schemas.xmlsoap.org/soap/envelope/) attribute.
 *
 * This is a complex type.
 */
public class ActorAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.soap.envelope.ActorAttribute
{
    private static final long serialVersionUID = 1L;
    
    public ActorAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTOR$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/envelope/", "actor");
    
    
    /**
     * Gets the "actor" attribute
     */
    public java.lang.String getActor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTOR$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "actor" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetActor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(ACTOR$0);
            return target;
        }
    }
    
    /**
     * True if has "actor" attribute
     */
    public boolean isSetActor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACTOR$0) != null;
        }
    }
    
    /**
     * Sets the "actor" attribute
     */
    public void setActor(java.lang.String actor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTOR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTOR$0);
            }
            target.setStringValue(actor);
        }
    }
    
    /**
     * Sets (as xml) the "actor" attribute
     */
    public void xsetActor(org.apache.xmlbeans.XmlAnyURI actor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(ACTOR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(ACTOR$0);
            }
            target.set(actor);
        }
    }
    
    /**
     * Unsets the "actor" attribute
     */
    public void unsetActor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACTOR$0);
        }
    }
}
