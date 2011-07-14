/*
 * An XML document type.
 * Localname: Building
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.BuildingDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one Building(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class BuildingDocumentImpl extends net.opengis.xls.impl.StreetLocationDocumentImpl implements net.opengis.xls.BuildingDocument
{
    private static final long serialVersionUID = 1L;
    
    public BuildingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUILDING$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Building");
    
    
    /**
     * Gets the "Building" element
     */
    public net.opengis.xls.BuildingLocatorType getBuilding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.BuildingLocatorType target = null;
            target = (net.opengis.xls.BuildingLocatorType)get_store().find_element_user(BUILDING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Building" element
     */
    public void setBuilding(net.opengis.xls.BuildingLocatorType building)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.BuildingLocatorType target = null;
            target = (net.opengis.xls.BuildingLocatorType)get_store().find_element_user(BUILDING$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.BuildingLocatorType)get_store().add_element_user(BUILDING$0);
            }
            target.set(building);
        }
    }
    
    /**
     * Appends and returns a new empty "Building" element
     */
    public net.opengis.xls.BuildingLocatorType addNewBuilding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.BuildingLocatorType target = null;
            target = (net.opengis.xls.BuildingLocatorType)get_store().add_element_user(BUILDING$0);
            return target;
        }
    }
}
