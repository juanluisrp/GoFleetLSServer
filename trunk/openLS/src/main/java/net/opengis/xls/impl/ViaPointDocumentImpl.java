/*
 * An XML document type.
 * Localname: ViaPoint
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.ViaPointDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one ViaPoint(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class ViaPointDocumentImpl extends net.opengis.xls.impl.WayPointDocumentImpl implements net.opengis.xls.ViaPointDocument
{
    private static final long serialVersionUID = 1L;
    
    public ViaPointDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VIAPOINT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "ViaPoint");
    
    
    /**
     * Gets the "ViaPoint" element
     */
    public net.opengis.xls.WayPointType getViaPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.WayPointType target = null;
            target = (net.opengis.xls.WayPointType)get_store().find_element_user(VIAPOINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ViaPoint" element
     */
    public void setViaPoint(net.opengis.xls.WayPointType viaPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.WayPointType target = null;
            target = (net.opengis.xls.WayPointType)get_store().find_element_user(VIAPOINT$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.WayPointType)get_store().add_element_user(VIAPOINT$0);
            }
            target.set(viaPoint);
        }
    }
    
    /**
     * Appends and returns a new empty "ViaPoint" element
     */
    public net.opengis.xls.WayPointType addNewViaPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.WayPointType target = null;
            target = (net.opengis.xls.WayPointType)get_store().add_element_user(VIAPOINT$0);
            return target;
        }
    }
}
