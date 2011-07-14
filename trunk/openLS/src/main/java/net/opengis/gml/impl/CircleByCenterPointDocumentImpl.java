/*
 * An XML document type.
 * Localname: CircleByCenterPoint
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CircleByCenterPointDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl;
/**
 * A document containing one CircleByCenterPoint(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CircleByCenterPointDocumentImpl extends net.opengis.gml.impl.ArcByCenterPointDocumentImpl implements net.opengis.gml.CircleByCenterPointDocument
{
    private static final long serialVersionUID = 1L;
    
    public CircleByCenterPointDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CIRCLEBYCENTERPOINT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CircleByCenterPoint");
    
    
    /**
     * Gets the "CircleByCenterPoint" element
     */
    public net.opengis.gml.CircleByCenterPointType getCircleByCenterPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CircleByCenterPointType target = null;
            target = (net.opengis.gml.CircleByCenterPointType)get_store().find_element_user(CIRCLEBYCENTERPOINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CircleByCenterPoint" element
     */
    public void setCircleByCenterPoint(net.opengis.gml.CircleByCenterPointType circleByCenterPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CircleByCenterPointType target = null;
            target = (net.opengis.gml.CircleByCenterPointType)get_store().find_element_user(CIRCLEBYCENTERPOINT$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.CircleByCenterPointType)get_store().add_element_user(CIRCLEBYCENTERPOINT$0);
            }
            target.set(circleByCenterPoint);
        }
    }
    
    /**
     * Appends and returns a new empty "CircleByCenterPoint" element
     */
    public net.opengis.gml.CircleByCenterPointType addNewCircleByCenterPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CircleByCenterPointType target = null;
            target = (net.opengis.gml.CircleByCenterPointType)get_store().add_element_user(CIRCLEBYCENTERPOINT$0);
            return target;
        }
    }
}
