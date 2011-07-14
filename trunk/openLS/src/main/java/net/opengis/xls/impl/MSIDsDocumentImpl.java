/*
 * An XML document type.
 * Localname: _MSIDs
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.MSIDsDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one _MSIDs(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class MSIDsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.MSIDsDocument
{
    private static final long serialVersionUID = 1L;
    
    public MSIDsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MSIDS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_MSIDs");
    private static final org.apache.xmlbeans.QNameSet MSIDS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "OutputMSIDs"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_MSIDs"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "InputMSIDs"),
    });
    
    
    /**
     * Gets the "_MSIDs" element
     */
    public net.opengis.xls.AbstractMSIDsType getMSIDs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractMSIDsType target = null;
            target = (net.opengis.xls.AbstractMSIDsType)get_store().find_element_user(MSIDS$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_MSIDs" element
     */
    public void setMSIDs(net.opengis.xls.AbstractMSIDsType msiDs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractMSIDsType target = null;
            target = (net.opengis.xls.AbstractMSIDsType)get_store().find_element_user(MSIDS$1, 0);
            if (target == null)
            {
                target = (net.opengis.xls.AbstractMSIDsType)get_store().add_element_user(MSIDS$0);
            }
            target.set(msiDs);
        }
    }
    
    /**
     * Appends and returns a new empty "_MSIDs" element
     */
    public net.opengis.xls.AbstractMSIDsType addNewMSIDs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractMSIDsType target = null;
            target = (net.opengis.xls.AbstractMSIDsType)get_store().add_element_user(MSIDS$0);
            return target;
        }
    }
}
