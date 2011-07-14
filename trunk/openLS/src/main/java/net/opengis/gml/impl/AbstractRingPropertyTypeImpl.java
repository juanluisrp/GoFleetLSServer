/*
 * XML Type:  AbstractRingPropertyType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.AbstractRingPropertyType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl;
/**
 * An XML AbstractRingPropertyType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class AbstractRingPropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.AbstractRingPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractRingPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RING$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Ring");
    private static final org.apache.xmlbeans.QNameSet RING$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "LinearRing"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Ring"),
    });
    
    
    /**
     * Gets the "_Ring" element
     */
    public net.opengis.gml.AbstractRingType getRing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractRingType target = null;
            target = (net.opengis.gml.AbstractRingType)get_store().find_element_user(RING$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_Ring" element
     */
    public void setRing(net.opengis.gml.AbstractRingType ring)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractRingType target = null;
            target = (net.opengis.gml.AbstractRingType)get_store().find_element_user(RING$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractRingType)get_store().add_element_user(RING$0);
            }
            target.set(ring);
        }
    }
    
    /**
     * Appends and returns a new empty "_Ring" element
     */
    public net.opengis.gml.AbstractRingType addNewRing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractRingType target = null;
            target = (net.opengis.gml.AbstractRingType)get_store().add_element_user(RING$0);
            return target;
        }
    }
}
