/*
 * An XML document type.
 * Localname: InputMSInformation
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.InputMSInformationDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one InputMSInformation(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class InputMSInformationDocumentImpl extends net.opengis.xls.impl.MSInformationDocumentImpl implements net.opengis.xls.InputMSInformationDocument
{
    private static final long serialVersionUID = 1L;
    
    public InputMSInformationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INPUTMSINFORMATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "InputMSInformation");
    
    
    /**
     * Gets the "InputMSInformation" element
     */
    public net.opengis.xls.InputMSInformationType getInputMSInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.InputMSInformationType target = null;
            target = (net.opengis.xls.InputMSInformationType)get_store().find_element_user(INPUTMSINFORMATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "InputMSInformation" element
     */
    public void setInputMSInformation(net.opengis.xls.InputMSInformationType inputMSInformation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.InputMSInformationType target = null;
            target = (net.opengis.xls.InputMSInformationType)get_store().find_element_user(INPUTMSINFORMATION$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.InputMSInformationType)get_store().add_element_user(INPUTMSINFORMATION$0);
            }
            target.set(inputMSInformation);
        }
    }
    
    /**
     * Appends and returns a new empty "InputMSInformation" element
     */
    public net.opengis.xls.InputMSInformationType addNewInputMSInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.InputMSInformationType target = null;
            target = (net.opengis.xls.InputMSInformationType)get_store().add_element_user(INPUTMSINFORMATION$0);
            return target;
        }
    }
}
