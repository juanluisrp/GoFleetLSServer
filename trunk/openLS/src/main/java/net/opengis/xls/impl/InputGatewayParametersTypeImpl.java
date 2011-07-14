/*
 * XML Type:  InputGatewayParametersType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.InputGatewayParametersType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML InputGatewayParametersType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class InputGatewayParametersTypeImpl extends net.opengis.xls.impl.AbstractGatewayParametersTypeImpl implements net.opengis.xls.InputGatewayParametersType
{
    private static final long serialVersionUID = 1L;
    
    public InputGatewayParametersTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INPUTMSIDS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "InputMSIDs");
    
    
    /**
     * Gets the "InputMSIDs" element
     */
    public net.opengis.xls.InputMSIDsType getInputMSIDs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.InputMSIDsType target = null;
            target = (net.opengis.xls.InputMSIDsType)get_store().find_element_user(INPUTMSIDS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "InputMSIDs" element
     */
    public void setInputMSIDs(net.opengis.xls.InputMSIDsType inputMSIDs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.InputMSIDsType target = null;
            target = (net.opengis.xls.InputMSIDsType)get_store().find_element_user(INPUTMSIDS$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.InputMSIDsType)get_store().add_element_user(INPUTMSIDS$0);
            }
            target.set(inputMSIDs);
        }
    }
    
    /**
     * Appends and returns a new empty "InputMSIDs" element
     */
    public net.opengis.xls.InputMSIDsType addNewInputMSIDs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.InputMSIDsType target = null;
            target = (net.opengis.xls.InputMSIDsType)get_store().add_element_user(INPUTMSIDS$0);
            return target;
        }
    }
}
