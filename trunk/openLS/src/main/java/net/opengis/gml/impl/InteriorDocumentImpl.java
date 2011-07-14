/*
 * An XML document type.
 * Localname: interior
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.InteriorDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl;
/**
 * A document containing one interior(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class InteriorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.InteriorDocument
{
    private static final long serialVersionUID = 1L;
    
    public InteriorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTERIOR$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "interior");
    
    
    /**
     * Gets the "interior" element
     */
    public net.opengis.gml.AbstractRingPropertyType getInterior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractRingPropertyType target = null;
            target = (net.opengis.gml.AbstractRingPropertyType)get_store().find_element_user(INTERIOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "interior" element
     */
    public void setInterior(net.opengis.gml.AbstractRingPropertyType interior)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractRingPropertyType target = null;
            target = (net.opengis.gml.AbstractRingPropertyType)get_store().find_element_user(INTERIOR$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractRingPropertyType)get_store().add_element_user(INTERIOR$0);
            }
            target.set(interior);
        }
    }
    
    /**
     * Appends and returns a new empty "interior" element
     */
    public net.opengis.gml.AbstractRingPropertyType addNewInterior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractRingPropertyType target = null;
            target = (net.opengis.gml.AbstractRingPropertyType)get_store().add_element_user(INTERIOR$0);
            return target;
        }
    }
}
