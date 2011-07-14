/*
 * An XML document type.
 * Localname: _RouteSummary
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.RouteSummaryDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one _RouteSummary(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class RouteSummaryDocumentImpl extends net.opengis.xls.impl.ADTDocumentImpl implements net.opengis.xls.RouteSummaryDocument
{
    private static final long serialVersionUID = 1L;
    
    public RouteSummaryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROUTESUMMARY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_RouteSummary");
    private static final org.apache.xmlbeans.QNameSet ROUTESUMMARY$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_RouteSummary"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "RouteSummary"),
    });
    
    
    /**
     * Gets the "_RouteSummary" element
     */
    public net.opengis.xls.AbstractRouteSummaryType getRouteSummary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractRouteSummaryType target = null;
            target = (net.opengis.xls.AbstractRouteSummaryType)get_store().find_element_user(ROUTESUMMARY$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_RouteSummary" element
     */
    public void setRouteSummary(net.opengis.xls.AbstractRouteSummaryType routeSummary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractRouteSummaryType target = null;
            target = (net.opengis.xls.AbstractRouteSummaryType)get_store().find_element_user(ROUTESUMMARY$1, 0);
            if (target == null)
            {
                target = (net.opengis.xls.AbstractRouteSummaryType)get_store().add_element_user(ROUTESUMMARY$0);
            }
            target.set(routeSummary);
        }
    }
    
    /**
     * Appends and returns a new empty "_RouteSummary" element
     */
    public net.opengis.xls.AbstractRouteSummaryType addNewRouteSummary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractRouteSummaryType target = null;
            target = (net.opengis.xls.AbstractRouteSummaryType)get_store().add_element_user(ROUTESUMMARY$0);
            return target;
        }
    }
}
