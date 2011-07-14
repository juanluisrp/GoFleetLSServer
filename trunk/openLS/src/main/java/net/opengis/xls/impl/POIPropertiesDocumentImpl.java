/*
 * An XML document type.
 * Localname: POIProperties
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.POIPropertiesDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one POIProperties(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class POIPropertiesDocumentImpl extends net.opengis.xls.impl.POISelectionCriteriaDocumentImpl implements net.opengis.xls.POIPropertiesDocument
{
    private static final long serialVersionUID = 1L;
    
    public POIPropertiesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POIPROPERTIES$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "POIProperties");
    
    
    /**
     * Gets the "POIProperties" element
     */
    public net.opengis.xls.POIPropertiesDocument.POIProperties getPOIProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.POIPropertiesDocument.POIProperties target = null;
            target = (net.opengis.xls.POIPropertiesDocument.POIProperties)get_store().find_element_user(POIPROPERTIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "POIProperties" element
     */
    public void setPOIProperties(net.opengis.xls.POIPropertiesDocument.POIProperties poiProperties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.POIPropertiesDocument.POIProperties target = null;
            target = (net.opengis.xls.POIPropertiesDocument.POIProperties)get_store().find_element_user(POIPROPERTIES$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.POIPropertiesDocument.POIProperties)get_store().add_element_user(POIPROPERTIES$0);
            }
            target.set(poiProperties);
        }
    }
    
    /**
     * Appends and returns a new empty "POIProperties" element
     */
    public net.opengis.xls.POIPropertiesDocument.POIProperties addNewPOIProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.POIPropertiesDocument.POIProperties target = null;
            target = (net.opengis.xls.POIPropertiesDocument.POIProperties)get_store().add_element_user(POIPROPERTIES$0);
            return target;
        }
    }
    /**
     * An XML POIProperties(@http://www.opengis.net/xls).
     *
     * This is a complex type.
     */
    public static class POIPropertiesImpl extends net.opengis.xls.impl.POIPropertiesTypeImpl implements net.opengis.xls.POIPropertiesDocument.POIProperties
    {
        private static final long serialVersionUID = 1L;
        
        public POIPropertiesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
