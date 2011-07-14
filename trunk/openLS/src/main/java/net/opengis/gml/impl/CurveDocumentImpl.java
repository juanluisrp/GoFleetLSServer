/*
 * An XML document type.
 * Localname: _Curve
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CurveDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl;
/**
 * A document containing one _Curve(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CurveDocumentImpl extends net.opengis.gml.impl.GeometricPrimitiveDocumentImpl implements net.opengis.gml.CurveDocument
{
    private static final long serialVersionUID = 1L;
    
    public CurveDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURVE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Curve");
    private static final org.apache.xmlbeans.QNameSet CURVE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "LineString"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Curve"),
    });
    
    
    /**
     * Gets the "_Curve" element
     */
    public net.opengis.gml.AbstractCurveType getCurve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractCurveType target = null;
            target = (net.opengis.gml.AbstractCurveType)get_store().find_element_user(CURVE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_Curve" element
     */
    public void setCurve(net.opengis.gml.AbstractCurveType curve)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractCurveType target = null;
            target = (net.opengis.gml.AbstractCurveType)get_store().find_element_user(CURVE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractCurveType)get_store().add_element_user(CURVE$0);
            }
            target.set(curve);
        }
    }
    
    /**
     * Appends and returns a new empty "_Curve" element
     */
    public net.opengis.gml.AbstractCurveType addNewCurve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractCurveType target = null;
            target = (net.opengis.gml.AbstractCurveType)get_store().add_element_user(CURVE$0);
            return target;
        }
    }
}
