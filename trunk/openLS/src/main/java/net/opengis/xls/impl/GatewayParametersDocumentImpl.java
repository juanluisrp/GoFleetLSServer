/*
 * An XML document type.
 * Localname: _GatewayParameters
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.GatewayParametersDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one _GatewayParameters(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class GatewayParametersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.GatewayParametersDocument
{
    private static final long serialVersionUID = 1L;
    
    public GatewayParametersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GATEWAYPARAMETERS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_GatewayParameters");
    private static final org.apache.xmlbeans.QNameSet GATEWAYPARAMETERS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "InputGatewayParameters"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_GatewayParameters"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "OutputGatewayParameters"),
    });
    
    
    /**
     * Gets the "_GatewayParameters" element
     */
    public net.opengis.xls.AbstractGatewayParametersType getGatewayParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractGatewayParametersType target = null;
            target = (net.opengis.xls.AbstractGatewayParametersType)get_store().find_element_user(GATEWAYPARAMETERS$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_GatewayParameters" element
     */
    public void setGatewayParameters(net.opengis.xls.AbstractGatewayParametersType gatewayParameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractGatewayParametersType target = null;
            target = (net.opengis.xls.AbstractGatewayParametersType)get_store().find_element_user(GATEWAYPARAMETERS$1, 0);
            if (target == null)
            {
                target = (net.opengis.xls.AbstractGatewayParametersType)get_store().add_element_user(GATEWAYPARAMETERS$0);
            }
            target.set(gatewayParameters);
        }
    }
    
    /**
     * Appends and returns a new empty "_GatewayParameters" element
     */
    public net.opengis.xls.AbstractGatewayParametersType addNewGatewayParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractGatewayParametersType target = null;
            target = (net.opengis.xls.AbstractGatewayParametersType)get_store().add_element_user(GATEWAYPARAMETERS$0);
            return target;
        }
    }
}
