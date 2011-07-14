/*
 * An XML document type.
 * Localname: Null
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.NullDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl;
/**
 * A document containing one Null(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class NullDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.NullDocument
{
    private static final long serialVersionUID = 1L;
    
    public NullDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NULL$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Null");
    
    
    /**
     * Gets the "Null" element
     */
    public java.lang.Object getNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NULL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "Null" element
     */
    public net.opengis.gml.NullType xgetNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.NullType target = null;
            target = (net.opengis.gml.NullType)get_store().find_element_user(NULL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Null" element
     */
    public void setNull(java.lang.Object xnull)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NULL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NULL$0);
            }
            target.setObjectValue(xnull);
        }
    }
    
    /**
     * Sets (as xml) the "Null" element
     */
    public void xsetNull(net.opengis.gml.NullType xnull)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.NullType target = null;
            target = (net.opengis.gml.NullType)get_store().find_element_user(NULL$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.NullType)get_store().add_element_user(NULL$0);
            }
            target.set(xnull);
        }
    }
}
