/*
 * XML Type:  ClipType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.ClipType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML ClipType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class ClipTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.ClipType
{
    private static final long serialVersionUID = 1L;
    
    public ClipTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POLYGON$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Polygon");
    private static final javax.xml.namespace.QName CIRCLEBYCENTERPOINT$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CircleByCenterPoint");
    private static final javax.xml.namespace.QName LINECORRIDOR$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "LineCorridor");
    
    
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
    
    /**
     * Gets the "CircleByCenterPoint" element
     */
    public net.opengis.gml.CircleByCenterPointType getCircleByCenterPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CircleByCenterPointType target = null;
            target = (net.opengis.gml.CircleByCenterPointType)get_store().find_element_user(CIRCLEBYCENTERPOINT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CircleByCenterPoint" element
     */
    public boolean isSetCircleByCenterPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CIRCLEBYCENTERPOINT$2) != 0;
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
            target = (net.opengis.gml.CircleByCenterPointType)get_store().find_element_user(CIRCLEBYCENTERPOINT$2, 0);
            if (target == null)
            {
                target = (net.opengis.gml.CircleByCenterPointType)get_store().add_element_user(CIRCLEBYCENTERPOINT$2);
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
            target = (net.opengis.gml.CircleByCenterPointType)get_store().add_element_user(CIRCLEBYCENTERPOINT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "CircleByCenterPoint" element
     */
    public void unsetCircleByCenterPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CIRCLEBYCENTERPOINT$2, 0);
        }
    }
    
    /**
     * Gets the "LineCorridor" element
     */
    public net.opengis.xls.LineCorridorType getLineCorridor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.LineCorridorType target = null;
            target = (net.opengis.xls.LineCorridorType)get_store().find_element_user(LINECORRIDOR$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "LineCorridor" element
     */
    public boolean isSetLineCorridor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINECORRIDOR$4) != 0;
        }
    }
    
    /**
     * Sets the "LineCorridor" element
     */
    public void setLineCorridor(net.opengis.xls.LineCorridorType lineCorridor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.LineCorridorType target = null;
            target = (net.opengis.xls.LineCorridorType)get_store().find_element_user(LINECORRIDOR$4, 0);
            if (target == null)
            {
                target = (net.opengis.xls.LineCorridorType)get_store().add_element_user(LINECORRIDOR$4);
            }
            target.set(lineCorridor);
        }
    }
    
    /**
     * Appends and returns a new empty "LineCorridor" element
     */
    public net.opengis.xls.LineCorridorType addNewLineCorridor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.LineCorridorType target = null;
            target = (net.opengis.xls.LineCorridorType)get_store().add_element_user(LINECORRIDOR$4);
            return target;
        }
    }
    
    /**
     * Unsets the "LineCorridor" element
     */
    public void unsetLineCorridor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINECORRIDOR$4, 0);
        }
    }
}
