/*
 * An XML attribute type.
 * Localname: encodingStyle
 * Namespace: http://schemas.xmlsoap.org/soap/envelope/
 * Java type: org.xmlsoap.schemas.soap.envelope.EncodingStyleAttribute
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.soap.envelope.impl;
/**
 * A document containing one encodingStyle(@http://schemas.xmlsoap.org/soap/envelope/) attribute.
 *
 * This is a complex type.
 */
public class EncodingStyleAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.soap.envelope.EncodingStyleAttribute
{
    private static final long serialVersionUID = 1L;
    
    public EncodingStyleAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENCODINGSTYLE$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/envelope/", "encodingStyle");
    
    
    /**
     * Gets the "encodingStyle" attribute
     */
    public java.util.List getEncodingStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGSTYLE$0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "encodingStyle" attribute
     */
    public org.xmlsoap.schemas.soap.envelope.EncodingStyle xgetEncodingStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.envelope.EncodingStyle target = null;
            target = (org.xmlsoap.schemas.soap.envelope.EncodingStyle)get_store().find_attribute_user(ENCODINGSTYLE$0);
            return target;
        }
    }
    
    /**
     * True if has "encodingStyle" attribute
     */
    public boolean isSetEncodingStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ENCODINGSTYLE$0) != null;
        }
    }
    
    /**
     * Sets the "encodingStyle" attribute
     */
    public void setEncodingStyle(java.util.List encodingStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGSTYLE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENCODINGSTYLE$0);
            }
            target.setListValue(encodingStyle);
        }
    }
    
    /**
     * Sets (as xml) the "encodingStyle" attribute
     */
    public void xsetEncodingStyle(org.xmlsoap.schemas.soap.envelope.EncodingStyle encodingStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.envelope.EncodingStyle target = null;
            target = (org.xmlsoap.schemas.soap.envelope.EncodingStyle)get_store().find_attribute_user(ENCODINGSTYLE$0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.envelope.EncodingStyle)get_store().add_attribute_user(ENCODINGSTYLE$0);
            }
            target.set(encodingStyle);
        }
    }
    
    /**
     * Unsets the "encodingStyle" attribute
     */
    public void unsetEncodingStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ENCODINGSTYLE$0);
        }
    }
}
