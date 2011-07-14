/*
 * An XML document type.
 * Localname: _Body
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.BodyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one _Body(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class BodyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.BodyDocument
{
    private static final long serialVersionUID = 1L;
    
    public BodyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BODY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_Body");
    private static final org.apache.xmlbeans.QNameSet BODY$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_Body"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Response"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Request"),
    });
    
    
    /**
     * Gets the "_Body" element
     */
    public net.opengis.xls.AbstractBodyType getBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractBodyType target = null;
            target = (net.opengis.xls.AbstractBodyType)get_store().find_element_user(BODY$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_Body" element
     */
    public void setBody(net.opengis.xls.AbstractBodyType body)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractBodyType target = null;
            target = (net.opengis.xls.AbstractBodyType)get_store().find_element_user(BODY$1, 0);
            if (target == null)
            {
                target = (net.opengis.xls.AbstractBodyType)get_store().add_element_user(BODY$0);
            }
            target.set(body);
        }
    }
    
    /**
     * Appends and returns a new empty "_Body" element
     */
    public net.opengis.xls.AbstractBodyType addNewBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractBodyType target = null;
            target = (net.opengis.xls.AbstractBodyType)get_store().add_element_user(BODY$0);
            return target;
        }
    }
}
