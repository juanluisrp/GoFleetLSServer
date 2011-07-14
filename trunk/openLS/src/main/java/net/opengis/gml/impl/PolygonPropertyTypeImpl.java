/*
 * XML Type:  PolygonPropertyType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.PolygonPropertyType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl;
/**
 * An XML PolygonPropertyType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class PolygonPropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.PolygonPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public PolygonPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POLYGON$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Polygon");
    
    
    /**
     * Gets the "Polygon" element
     */
    public net.opengis.gml.PolygonType getPolygon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolygonType target = null;
            target = (net.opengis.gml.PolygonType)get_store().find_element_user(POLYGON$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Polygon" element
     */
    public boolean isSetPolygon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POLYGON$0) != 0;
        }
    }
    
    /**
     * Sets the "Polygon" element
     */
    public void setPolygon(net.opengis.gml.PolygonType polygon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolygonType target = null;
            target = (net.opengis.gml.PolygonType)get_store().find_element_user(POLYGON$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.PolygonType)get_store().add_element_user(POLYGON$0);
            }
            target.set(polygon);
        }
    }
    
    /**
     * Appends and returns a new empty "Polygon" element
     */
    public net.opengis.gml.PolygonType addNewPolygon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolygonType target = null;
            target = (net.opengis.gml.PolygonType)get_store().add_element_user(POLYGON$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Polygon" element
     */
    public void unsetPolygon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POLYGON$0, 0);
        }
    }
}
