/*
 * An XML document type.
 * Localname: PostalCode
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.PostalCodeDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one PostalCode(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class PostalCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.PostalCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public PostalCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POSTALCODE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "PostalCode");
    
    
    /**
     * Gets the "PostalCode" element
     */
    public java.lang.String getPostalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTALCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PostalCode" element
     */
    public net.opengis.xls.PostalCodeType xgetPostalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.PostalCodeType target = null;
            target = (net.opengis.xls.PostalCodeType)get_store().find_element_user(POSTALCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PostalCode" element
     */
    public void setPostalCode(java.lang.String postalCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTALCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSTALCODE$0);
            }
            target.setStringValue(postalCode);
        }
    }
    
    /**
     * Sets (as xml) the "PostalCode" element
     */
    public void xsetPostalCode(net.opengis.xls.PostalCodeType postalCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.PostalCodeType target = null;
            target = (net.opengis.xls.PostalCodeType)get_store().find_element_user(POSTALCODE$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.PostalCodeType)get_store().add_element_user(POSTALCODE$0);
            }
            target.set(postalCode);
        }
    }
}
