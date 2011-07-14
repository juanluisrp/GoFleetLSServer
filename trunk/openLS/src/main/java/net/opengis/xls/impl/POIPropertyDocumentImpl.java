/*
 * An XML document type.
 * Localname: _POIProperty
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.POIPropertyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one _POIProperty(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class POIPropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.POIPropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public POIPropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POIPROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_POIProperty");
    private static final org.apache.xmlbeans.QNameSet POIPROPERTY$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "POIProperty"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_POIProperty"),
    });
    
    
    /**
     * Gets the "_POIProperty" element
     */
    public org.apache.xmlbeans.XmlObject getPOIProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(POIPROPERTY$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_POIProperty" element
     */
    public void setPOIProperty(org.apache.xmlbeans.XmlObject poiProperty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(POIPROPERTY$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(POIPROPERTY$0);
            }
            target.set(poiProperty);
        }
    }
    
    /**
     * Appends and returns a new empty "_POIProperty" element
     */
    public org.apache.xmlbeans.XmlObject addNewPOIProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(POIPROPERTY$0);
            return target;
        }
    }
}
