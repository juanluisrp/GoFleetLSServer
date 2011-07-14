/*
 * An XML document type.
 * Localname: GeocodeResponseList
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.GeocodeResponseListDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one GeocodeResponseList(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class GeocodeResponseListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.GeocodeResponseListDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeocodeResponseListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOCODERESPONSELIST$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "GeocodeResponseList");
    
    
    /**
     * Gets the "GeocodeResponseList" element
     */
    public net.opengis.xls.GeocodeResponseListType getGeocodeResponseList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.GeocodeResponseListType target = null;
            target = (net.opengis.xls.GeocodeResponseListType)get_store().find_element_user(GEOCODERESPONSELIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GeocodeResponseList" element
     */
    public void setGeocodeResponseList(net.opengis.xls.GeocodeResponseListType geocodeResponseList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.GeocodeResponseListType target = null;
            target = (net.opengis.xls.GeocodeResponseListType)get_store().find_element_user(GEOCODERESPONSELIST$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.GeocodeResponseListType)get_store().add_element_user(GEOCODERESPONSELIST$0);
            }
            target.set(geocodeResponseList);
        }
    }
    
    /**
     * Appends and returns a new empty "GeocodeResponseList" element
     */
    public net.opengis.xls.GeocodeResponseListType addNewGeocodeResponseList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.GeocodeResponseListType target = null;
            target = (net.opengis.xls.GeocodeResponseListType)get_store().add_element_user(GEOCODERESPONSELIST$0);
            return target;
        }
    }
}
