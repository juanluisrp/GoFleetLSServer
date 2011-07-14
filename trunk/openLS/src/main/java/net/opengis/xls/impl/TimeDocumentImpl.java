/*
 * An XML document type.
 * Localname: Time
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.TimeDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one Time(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class TimeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.TimeDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIME$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Time");
    
    
    /**
     * Gets the "Time" element
     */
    public net.opengis.xls.TimeType getTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.TimeType target = null;
            target = (net.opengis.xls.TimeType)get_store().find_element_user(TIME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Time" element
     */
    public void setTime(net.opengis.xls.TimeType time)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.TimeType target = null;
            target = (net.opengis.xls.TimeType)get_store().find_element_user(TIME$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.TimeType)get_store().add_element_user(TIME$0);
            }
            target.set(time);
        }
    }
    
    /**
     * Appends and returns a new empty "Time" element
     */
    public net.opengis.xls.TimeType addNewTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.TimeType target = null;
            target = (net.opengis.xls.TimeType)get_store().add_element_user(TIME$0);
            return target;
        }
    }
}
