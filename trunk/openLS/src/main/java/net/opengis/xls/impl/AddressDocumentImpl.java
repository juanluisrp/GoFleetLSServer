/*
 * An XML document type.
 * Localname: Address
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.AddressDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one Address(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class AddressDocumentImpl extends net.opengis.xls.impl.LocationDocumentImpl implements net.opengis.xls.AddressDocument
{
    private static final long serialVersionUID = 1L;
    
    public AddressDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Address");
    
    
    /**
     * Gets the "Address" element
     */
    public net.opengis.xls.AddressType getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AddressType target = null;
            target = (net.opengis.xls.AddressType)get_store().find_element_user(ADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Address" element
     */
    public void setAddress(net.opengis.xls.AddressType address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AddressType target = null;
            target = (net.opengis.xls.AddressType)get_store().find_element_user(ADDRESS$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.AddressType)get_store().add_element_user(ADDRESS$0);
            }
            target.set(address);
        }
    }
    
    /**
     * Appends and returns a new empty "Address" element
     */
    public net.opengis.xls.AddressType addNewAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AddressType target = null;
            target = (net.opengis.xls.AddressType)get_store().add_element_user(ADDRESS$0);
            return target;
        }
    }
}
