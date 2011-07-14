/*
 * An XML document type.
 * Localname: Place
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.PlaceDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one Place(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class PlaceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.PlaceDocument
{
    private static final long serialVersionUID = 1L;
    
    public PlaceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PLACE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Place");
    
    
    /**
     * Gets the "Place" element
     */
    public net.opengis.xls.NamedPlaceType getPlace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.NamedPlaceType target = null;
            target = (net.opengis.xls.NamedPlaceType)get_store().find_element_user(PLACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Place" element
     */
    public void setPlace(net.opengis.xls.NamedPlaceType place)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.NamedPlaceType target = null;
            target = (net.opengis.xls.NamedPlaceType)get_store().find_element_user(PLACE$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.NamedPlaceType)get_store().add_element_user(PLACE$0);
            }
            target.set(place);
        }
    }
    
    /**
     * Appends and returns a new empty "Place" element
     */
    public net.opengis.xls.NamedPlaceType addNewPlace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.NamedPlaceType target = null;
            target = (net.opengis.xls.NamedPlaceType)get_store().add_element_user(PLACE$0);
            return target;
        }
    }
}
