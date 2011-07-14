/*
 * An XML document type.
 * Localname: _GeometricAggregate
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.GeometricAggregateDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl;
/**
 * A document containing one _GeometricAggregate(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class GeometricAggregateDocumentImpl extends net.opengis.gml.impl.GeometryDocumentImpl implements net.opengis.gml.GeometricAggregateDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeometricAggregateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOMETRICAGGREGATE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeometricAggregate");
    private static final org.apache.xmlbeans.QNameSet GEOMETRICAGGREGATE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiPolygon"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeometricAggregate"),
    });
    
    
    /**
     * Gets the "_GeometricAggregate" element
     */
    public net.opengis.gml.AbstractGeometricAggregateType getGeometricAggregate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeometricAggregateType target = null;
            target = (net.opengis.gml.AbstractGeometricAggregateType)get_store().find_element_user(GEOMETRICAGGREGATE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_GeometricAggregate" element
     */
    public void setGeometricAggregate(net.opengis.gml.AbstractGeometricAggregateType geometricAggregate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeometricAggregateType target = null;
            target = (net.opengis.gml.AbstractGeometricAggregateType)get_store().find_element_user(GEOMETRICAGGREGATE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractGeometricAggregateType)get_store().add_element_user(GEOMETRICAGGREGATE$0);
            }
            target.set(geometricAggregate);
        }
    }
    
    /**
     * Appends and returns a new empty "_GeometricAggregate" element
     */
    public net.opengis.gml.AbstractGeometricAggregateType addNewGeometricAggregate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeometricAggregateType target = null;
            target = (net.opengis.gml.AbstractGeometricAggregateType)get_store().add_element_user(GEOMETRICAGGREGATE$0);
            return target;
        }
    }
}
