/*
 * An XML document type.
 * Localname: InputGatewayParameters
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.InputGatewayParametersDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one InputGatewayParameters(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class InputGatewayParametersDocumentImpl extends net.opengis.xls.impl.GatewayParametersDocumentImpl implements net.opengis.xls.InputGatewayParametersDocument
{
    private static final long serialVersionUID = 1L;
    
    public InputGatewayParametersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INPUTGATEWAYPARAMETERS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "InputGatewayParameters");
    
    
    /**
     * Gets the "InputGatewayParameters" element
     */
    public net.opengis.xls.InputGatewayParametersType getInputGatewayParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.InputGatewayParametersType target = null;
            target = (net.opengis.xls.InputGatewayParametersType)get_store().find_element_user(INPUTGATEWAYPARAMETERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "InputGatewayParameters" element
     */
    public void setInputGatewayParameters(net.opengis.xls.InputGatewayParametersType inputGatewayParameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.InputGatewayParametersType target = null;
            target = (net.opengis.xls.InputGatewayParametersType)get_store().find_element_user(INPUTGATEWAYPARAMETERS$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.InputGatewayParametersType)get_store().add_element_user(INPUTGATEWAYPARAMETERS$0);
            }
            target.set(inputGatewayParameters);
        }
    }
    
    /**
     * Appends and returns a new empty "InputGatewayParameters" element
     */
    public net.opengis.xls.InputGatewayParametersType addNewInputGatewayParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.InputGatewayParametersType target = null;
            target = (net.opengis.xls.InputGatewayParametersType)get_store().add_element_user(INPUTGATEWAYPARAMETERS$0);
            return target;
        }
    }
}
