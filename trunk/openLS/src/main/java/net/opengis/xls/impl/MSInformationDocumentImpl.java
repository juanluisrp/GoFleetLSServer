/*
 * An XML document type.
 * Localname: _MSInformation
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.MSInformationDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one _MSInformation(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class MSInformationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.MSInformationDocument
{
    private static final long serialVersionUID = 1L;
    
    public MSInformationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MSINFORMATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_MSInformation");
    private static final org.apache.xmlbeans.QNameSet MSINFORMATION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "InputMSInformation"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_MSInformation"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "OutputMSInformation"),
    });
    
    
    /**
     * Gets the "_MSInformation" element
     */
    public net.opengis.xls.AbstractMSInformationType getMSInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractMSInformationType target = null;
            target = (net.opengis.xls.AbstractMSInformationType)get_store().find_element_user(MSINFORMATION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_MSInformation" element
     */
    public void setMSInformation(net.opengis.xls.AbstractMSInformationType msInformation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractMSInformationType target = null;
            target = (net.opengis.xls.AbstractMSInformationType)get_store().find_element_user(MSINFORMATION$1, 0);
            if (target == null)
            {
                target = (net.opengis.xls.AbstractMSInformationType)get_store().add_element_user(MSINFORMATION$0);
            }
            target.set(msInformation);
        }
    }
    
    /**
     * Appends and returns a new empty "_MSInformation" element
     */
    public net.opengis.xls.AbstractMSInformationType addNewMSInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractMSInformationType target = null;
            target = (net.opengis.xls.AbstractMSInformationType)get_store().add_element_user(MSINFORMATION$0);
            return target;
        }
    }
}
