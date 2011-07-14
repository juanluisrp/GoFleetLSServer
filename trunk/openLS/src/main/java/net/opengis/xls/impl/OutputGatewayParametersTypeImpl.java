/*
 * XML Type:  OutputGatewayParametersType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.OutputGatewayParametersType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML OutputGatewayParametersType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class OutputGatewayParametersTypeImpl extends net.opengis.xls.impl.AbstractGatewayParametersTypeImpl implements net.opengis.xls.OutputGatewayParametersType
{
    private static final long serialVersionUID = 1L;
    
    public OutputGatewayParametersTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OUTPUTMSIDS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "OutputMSIDs");
    
    
    /**
     * Gets the "OutputMSIDs" element
     */
    public net.opengis.xls.OutputMSIDsType getOutputMSIDs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.OutputMSIDsType target = null;
            target = (net.opengis.xls.OutputMSIDsType)get_store().find_element_user(OUTPUTMSIDS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OutputMSIDs" element
     */
    public void setOutputMSIDs(net.opengis.xls.OutputMSIDsType outputMSIDs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.OutputMSIDsType target = null;
            target = (net.opengis.xls.OutputMSIDsType)get_store().find_element_user(OUTPUTMSIDS$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.OutputMSIDsType)get_store().add_element_user(OUTPUTMSIDS$0);
            }
            target.set(outputMSIDs);
        }
    }
    
    /**
     * Appends and returns a new empty "OutputMSIDs" element
     */
    public net.opengis.xls.OutputMSIDsType addNewOutputMSIDs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.OutputMSIDsType target = null;
            target = (net.opengis.xls.OutputMSIDsType)get_store().add_element_user(OUTPUTMSIDS$0);
            return target;
        }
    }
}
