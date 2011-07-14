/*
 * An XML document type.
 * Localname: OutputMSInformation
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.OutputMSInformationDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one OutputMSInformation(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class OutputMSInformationDocumentImpl extends net.opengis.xls.impl.MSInformationDocumentImpl implements net.opengis.xls.OutputMSInformationDocument
{
    private static final long serialVersionUID = 1L;
    
    public OutputMSInformationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OUTPUTMSINFORMATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "OutputMSInformation");
    
    
    /**
     * Gets the "OutputMSInformation" element
     */
    public net.opengis.xls.OutputMSInformationType getOutputMSInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.OutputMSInformationType target = null;
            target = (net.opengis.xls.OutputMSInformationType)get_store().find_element_user(OUTPUTMSINFORMATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OutputMSInformation" element
     */
    public void setOutputMSInformation(net.opengis.xls.OutputMSInformationType outputMSInformation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.OutputMSInformationType target = null;
            target = (net.opengis.xls.OutputMSInformationType)get_store().find_element_user(OUTPUTMSINFORMATION$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.OutputMSInformationType)get_store().add_element_user(OUTPUTMSINFORMATION$0);
            }
            target.set(outputMSInformation);
        }
    }
    
    /**
     * Appends and returns a new empty "OutputMSInformation" element
     */
    public net.opengis.xls.OutputMSInformationType addNewOutputMSInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.OutputMSInformationType target = null;
            target = (net.opengis.xls.OutputMSInformationType)get_store().add_element_user(OUTPUTMSINFORMATION$0);
            return target;
        }
    }
}
