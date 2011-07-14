/*
 * XML Type:  OutputMSIDsType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.OutputMSIDsType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML OutputMSIDsType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class OutputMSIDsTypeImpl extends net.opengis.xls.impl.AbstractMSIDsTypeImpl implements net.opengis.xls.OutputMSIDsType
{
    private static final long serialVersionUID = 1L;
    
    public OutputMSIDsTypeImpl(org.apache.xmlbeans.SchemaType sType)
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
