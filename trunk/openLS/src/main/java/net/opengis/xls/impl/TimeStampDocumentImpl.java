/*
 * An XML document type.
 * Localname: TimeStamp
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.TimeStampDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one TimeStamp(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class TimeStampDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.TimeStampDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimeStampDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMESTAMP$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "TimeStamp");
    
    
    /**
     * Gets the "TimeStamp" element
     */
    public net.opengis.xls.TimeStampType getTimeStamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.TimeStampType target = null;
            target = (net.opengis.xls.TimeStampType)get_store().find_element_user(TIMESTAMP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TimeStamp" element
     */
    public void setTimeStamp(net.opengis.xls.TimeStampType timeStamp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.TimeStampType target = null;
            target = (net.opengis.xls.TimeStampType)get_store().find_element_user(TIMESTAMP$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.TimeStampType)get_store().add_element_user(TIMESTAMP$0);
            }
            target.set(timeStamp);
        }
    }
    
    /**
     * Appends and returns a new empty "TimeStamp" element
     */
    public net.opengis.xls.TimeStampType addNewTimeStamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.TimeStampType target = null;
            target = (net.opengis.xls.TimeStampType)get_store().add_element_user(TIMESTAMP$0);
            return target;
        }
    }
}
