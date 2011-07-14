/*
 * An XML document type.
 * Localname: NextSegment
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.NextSegmentDocument2
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one NextSegment(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class NextSegmentDocument2Impl extends net.opengis.xls.impl.NextSegmentDocumentImpl implements net.opengis.xls.NextSegmentDocument2
{
    private static final long serialVersionUID = 1L;
    
    public NextSegmentDocument2Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NEXTSEGMENT2$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "NextSegment");
    
    
    /**
     * Gets the "NextSegment" element
     */
    public net.opengis.xls.RouteSegmentType getNextSegment2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteSegmentType target = null;
            target = (net.opengis.xls.RouteSegmentType)get_store().find_element_user(NEXTSEGMENT2$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "NextSegment" element
     */
    public void setNextSegment2(net.opengis.xls.RouteSegmentType nextSegment2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteSegmentType target = null;
            target = (net.opengis.xls.RouteSegmentType)get_store().find_element_user(NEXTSEGMENT2$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.RouteSegmentType)get_store().add_element_user(NEXTSEGMENT2$0);
            }
            target.set(nextSegment2);
        }
    }
    
    /**
     * Appends and returns a new empty "NextSegment" element
     */
    public net.opengis.xls.RouteSegmentType addNewNextSegment2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteSegmentType target = null;
            target = (net.opengis.xls.RouteSegmentType)get_store().add_element_user(NEXTSEGMENT2$0);
            return target;
        }
    }
}
