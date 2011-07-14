/*
 * An XML document type.
 * Localname: Map
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.MapDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one Map(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class MapDocumentImpl extends net.opengis.xls.impl.ADTDocumentImpl implements net.opengis.xls.MapDocument
{
    private static final long serialVersionUID = 1L;
    
    public MapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAP$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Map");
    
    
    /**
     * Gets the "Map" element
     */
    public net.opengis.xls.MapType getMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.MapType target = null;
            target = (net.opengis.xls.MapType)get_store().find_element_user(MAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Map" element
     */
    public void setMap(net.opengis.xls.MapType map)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.MapType target = null;
            target = (net.opengis.xls.MapType)get_store().find_element_user(MAP$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.MapType)get_store().add_element_user(MAP$0);
            }
            target.set(map);
        }
    }
    
    /**
     * Appends and returns a new empty "Map" element
     */
    public net.opengis.xls.MapType addNewMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.MapType target = null;
            target = (net.opengis.xls.MapType)get_store().add_element_user(MAP$0);
            return target;
        }
    }
}
