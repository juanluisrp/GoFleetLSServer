/*
 * An XML document type.
 * Localname: RouteInstruction
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.RouteInstructionDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one RouteInstruction(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class RouteInstructionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.RouteInstructionDocument
{
    private static final long serialVersionUID = 1L;
    
    public RouteInstructionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROUTEINSTRUCTION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "RouteInstruction");
    
    
    /**
     * Gets the "RouteInstruction" element
     */
    public net.opengis.xls.RouteInstructionType getRouteInstruction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteInstructionType target = null;
            target = (net.opengis.xls.RouteInstructionType)get_store().find_element_user(ROUTEINSTRUCTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RouteInstruction" element
     */
    public void setRouteInstruction(net.opengis.xls.RouteInstructionType routeInstruction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteInstructionType target = null;
            target = (net.opengis.xls.RouteInstructionType)get_store().find_element_user(ROUTEINSTRUCTION$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.RouteInstructionType)get_store().add_element_user(ROUTEINSTRUCTION$0);
            }
            target.set(routeInstruction);
        }
    }
    
    /**
     * Appends and returns a new empty "RouteInstruction" element
     */
    public net.opengis.xls.RouteInstructionType addNewRouteInstruction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteInstructionType target = null;
            target = (net.opengis.xls.RouteInstructionType)get_store().add_element_user(ROUTEINSTRUCTION$0);
            return target;
        }
    }
}
