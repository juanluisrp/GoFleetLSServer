/*
 * An XML document type.
 * Localname: _ADT
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.ADTDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one _ADT(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class ADTDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.ADTDocument
{
    private static final long serialVersionUID = 1L;
    
    public ADTDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_ADT");
    private static final org.apache.xmlbeans.QNameSet ADT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Address"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "POI"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_ADT"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "AOI"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_Location"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Position"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "RouteSummary"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_RouteSummary"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_Position"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_POI"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "RouteInstructionsList"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Map"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "RouteGeometry"),
    });
    
    
    /**
     * Gets the "_ADT" element
     */
    public net.opengis.xls.AbstractDataType getADT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractDataType target = null;
            target = (net.opengis.xls.AbstractDataType)get_store().find_element_user(ADT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_ADT" element
     */
    public void setADT(net.opengis.xls.AbstractDataType adt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractDataType target = null;
            target = (net.opengis.xls.AbstractDataType)get_store().find_element_user(ADT$1, 0);
            if (target == null)
            {
                target = (net.opengis.xls.AbstractDataType)get_store().add_element_user(ADT$0);
            }
            target.set(adt);
        }
    }
    
    /**
     * Appends and returns a new empty "_ADT" element
     */
    public net.opengis.xls.AbstractDataType addNewADT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractDataType target = null;
            target = (net.opengis.xls.AbstractDataType)get_store().add_element_user(ADT$0);
            return target;
        }
    }
}
