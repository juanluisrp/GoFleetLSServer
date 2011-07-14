/*
 * An XML document type.
 * Localname: StreetAddress
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.StreetAddressDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one StreetAddress(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class StreetAddressDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.StreetAddressDocument
{
    private static final long serialVersionUID = 1L;
    
    public StreetAddressDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STREETADDRESS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "StreetAddress");
    
    
    /**
     * Gets the "StreetAddress" element
     */
    public net.opengis.xls.StreetAddressType getStreetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.StreetAddressType target = null;
            target = (net.opengis.xls.StreetAddressType)get_store().find_element_user(STREETADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StreetAddress" element
     */
    public void setStreetAddress(net.opengis.xls.StreetAddressType streetAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.StreetAddressType target = null;
            target = (net.opengis.xls.StreetAddressType)get_store().find_element_user(STREETADDRESS$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.StreetAddressType)get_store().add_element_user(STREETADDRESS$0);
            }
            target.set(streetAddress);
        }
    }
    
    /**
     * Appends and returns a new empty "StreetAddress" element
     */
    public net.opengis.xls.StreetAddressType addNewStreetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.StreetAddressType target = null;
            target = (net.opengis.xls.StreetAddressType)get_store().add_element_user(STREETADDRESS$0);
            return target;
        }
    }
}
