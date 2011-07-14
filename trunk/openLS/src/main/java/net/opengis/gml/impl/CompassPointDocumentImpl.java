/*
 * An XML document type.
 * Localname: CompassPoint
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CompassPointDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl;
/**
 * A document containing one CompassPoint(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CompassPointDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.CompassPointDocument
{
    private static final long serialVersionUID = 1L;
    
    public CompassPointDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPASSPOINT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CompassPoint");
    
    
    /**
     * Gets the "CompassPoint" element
     */
    public net.opengis.gml.CompassPointEnumeration.Enum getCompassPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPASSPOINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return (net.opengis.gml.CompassPointEnumeration.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "CompassPoint" element
     */
    public net.opengis.gml.CompassPointEnumeration xgetCompassPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CompassPointEnumeration target = null;
            target = (net.opengis.gml.CompassPointEnumeration)get_store().find_element_user(COMPASSPOINT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CompassPoint" element
     */
    public void setCompassPoint(net.opengis.gml.CompassPointEnumeration.Enum compassPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPASSPOINT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPASSPOINT$0);
            }
            target.setEnumValue(compassPoint);
        }
    }
    
    /**
     * Sets (as xml) the "CompassPoint" element
     */
    public void xsetCompassPoint(net.opengis.gml.CompassPointEnumeration compassPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CompassPointEnumeration target = null;
            target = (net.opengis.gml.CompassPointEnumeration)get_store().find_element_user(COMPASSPOINT$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.CompassPointEnumeration)get_store().add_element_user(COMPASSPOINT$0);
            }
            target.set(compassPoint);
        }
    }
}
