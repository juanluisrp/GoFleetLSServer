/*
 * An XML document type.
 * Localname: AvoidList
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.AvoidListDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one AvoidList(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class AvoidListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.AvoidListDocument
{
    private static final long serialVersionUID = 1L;
    
    public AvoidListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AVOIDLIST$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "AvoidList");
    
    
    /**
     * Gets the "AvoidList" element
     */
    public net.opengis.xls.AvoidListType getAvoidList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AvoidListType target = null;
            target = (net.opengis.xls.AvoidListType)get_store().find_element_user(AVOIDLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AvoidList" element
     */
    public void setAvoidList(net.opengis.xls.AvoidListType avoidList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AvoidListType target = null;
            target = (net.opengis.xls.AvoidListType)get_store().find_element_user(AVOIDLIST$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.AvoidListType)get_store().add_element_user(AVOIDLIST$0);
            }
            target.set(avoidList);
        }
    }
    
    /**
     * Appends and returns a new empty "AvoidList" element
     */
    public net.opengis.xls.AvoidListType addNewAvoidList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AvoidListType target = null;
            target = (net.opengis.xls.AvoidListType)get_store().add_element_user(AVOIDLIST$0);
            return target;
        }
    }
}
