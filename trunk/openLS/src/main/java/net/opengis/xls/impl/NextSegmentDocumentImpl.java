/*
 * An XML document type.
 * Localname: _NextSegment
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.NextSegmentDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one _NextSegment(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class NextSegmentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.NextSegmentDocument
{
    private static final long serialVersionUID = 1L;
    
    public NextSegmentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NEXTSEGMENT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_NextSegment");
    private static final org.apache.xmlbeans.QNameSet NEXTSEGMENT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_NextSegment"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "NextSegment"),
    });
    
    
    /**
     * Gets the "_NextSegment" element
     */
    public net.opengis.xls.AbstractRouteSegmentType getNextSegment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractRouteSegmentType target = null;
            target = (net.opengis.xls.AbstractRouteSegmentType)get_store().find_element_user(NEXTSEGMENT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_NextSegment" element
     */
    public void setNextSegment(net.opengis.xls.AbstractRouteSegmentType nextSegment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractRouteSegmentType target = null;
            target = (net.opengis.xls.AbstractRouteSegmentType)get_store().find_element_user(NEXTSEGMENT$1, 0);
            if (target == null)
            {
                target = (net.opengis.xls.AbstractRouteSegmentType)get_store().add_element_user(NEXTSEGMENT$0);
            }
            target.set(nextSegment);
        }
    }
    
    /**
     * Appends and returns a new empty "_NextSegment" element
     */
    public net.opengis.xls.AbstractRouteSegmentType addNewNextSegment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractRouteSegmentType target = null;
            target = (net.opengis.xls.AbstractRouteSegmentType)get_store().add_element_user(NEXTSEGMENT$0);
            return target;
        }
    }
}
