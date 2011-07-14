/*
 * An XML document type.
 * Localname: Altitude
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.AltitudeDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one Altitude(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class AltitudeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.AltitudeDocument
{
    private static final long serialVersionUID = 1L;
    
    public AltitudeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALTITUDE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Altitude");
    
    
    /**
     * Gets the "Altitude" element
     */
    public net.opengis.xls.AltitudeType getAltitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AltitudeType target = null;
            target = (net.opengis.xls.AltitudeType)get_store().find_element_user(ALTITUDE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Altitude" element
     */
    public void setAltitude(net.opengis.xls.AltitudeType altitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AltitudeType target = null;
            target = (net.opengis.xls.AltitudeType)get_store().find_element_user(ALTITUDE$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.AltitudeType)get_store().add_element_user(ALTITUDE$0);
            }
            target.set(altitude);
        }
    }
    
    /**
     * Appends and returns a new empty "Altitude" element
     */
    public net.opengis.xls.AltitudeType addNewAltitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AltitudeType target = null;
            target = (net.opengis.xls.AltitudeType)get_store().add_element_user(ALTITUDE$0);
            return target;
        }
    }
}
