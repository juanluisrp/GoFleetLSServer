/*
 * An XML document type.
 * Localname: OutputGatewayParameters
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.OutputGatewayParametersDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one OutputGatewayParameters(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class OutputGatewayParametersDocumentImpl extends net.opengis.xls.impl.GatewayParametersDocumentImpl implements net.opengis.xls.OutputGatewayParametersDocument
{
    private static final long serialVersionUID = 1L;
    
    public OutputGatewayParametersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OUTPUTGATEWAYPARAMETERS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "OutputGatewayParameters");
    
    
    /**
     * Gets the "OutputGatewayParameters" element
     */
    public net.opengis.xls.OutputGatewayParametersType getOutputGatewayParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.OutputGatewayParametersType target = null;
            target = (net.opengis.xls.OutputGatewayParametersType)get_store().find_element_user(OUTPUTGATEWAYPARAMETERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OutputGatewayParameters" element
     */
    public void setOutputGatewayParameters(net.opengis.xls.OutputGatewayParametersType outputGatewayParameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.OutputGatewayParametersType target = null;
            target = (net.opengis.xls.OutputGatewayParametersType)get_store().find_element_user(OUTPUTGATEWAYPARAMETERS$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.OutputGatewayParametersType)get_store().add_element_user(OUTPUTGATEWAYPARAMETERS$0);
            }
            target.set(outputGatewayParameters);
        }
    }
    
    /**
     * Appends and returns a new empty "OutputGatewayParameters" element
     */
    public net.opengis.xls.OutputGatewayParametersType addNewOutputGatewayParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.OutputGatewayParametersType target = null;
            target = (net.opengis.xls.OutputGatewayParametersType)get_store().add_element_user(OUTPUTGATEWAYPARAMETERS$0);
            return target;
        }
    }
}
