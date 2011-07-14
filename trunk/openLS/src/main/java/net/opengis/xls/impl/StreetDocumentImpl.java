/*
 * An XML document type.
 * Localname: Street
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.StreetDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one Street(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class StreetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.StreetDocument
{
    private static final long serialVersionUID = 1L;
    
    public StreetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STREET$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Street");
    
    
    /**
     * Gets the "Street" element
     */
    public net.opengis.xls.StreetNameType getStreet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.StreetNameType target = null;
            target = (net.opengis.xls.StreetNameType)get_store().find_element_user(STREET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Street" element
     */
    public void setStreet(net.opengis.xls.StreetNameType street)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.StreetNameType target = null;
            target = (net.opengis.xls.StreetNameType)get_store().find_element_user(STREET$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.StreetNameType)get_store().add_element_user(STREET$0);
            }
            target.set(street);
        }
    }
    
    /**
     * Appends and returns a new empty "Street" element
     */
    public net.opengis.xls.StreetNameType addNewStreet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.StreetNameType target = null;
            target = (net.opengis.xls.StreetNameType)get_store().add_element_user(STREET$0);
            return target;
        }
    }
}
