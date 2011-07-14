/*
 * An XML document type.
 * Localname: SearchCentreDistance
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.SearchCentreDistanceDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one SearchCentreDistance(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class SearchCentreDistanceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.SearchCentreDistanceDocument
{
    private static final long serialVersionUID = 1L;
    
    public SearchCentreDistanceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEARCHCENTREDISTANCE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "SearchCentreDistance");
    
    
    /**
     * Gets the "SearchCentreDistance" element
     */
    public net.opengis.xls.DistanceType getSearchCentreDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.DistanceType target = null;
            target = (net.opengis.xls.DistanceType)get_store().find_element_user(SEARCHCENTREDISTANCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SearchCentreDistance" element
     */
    public void setSearchCentreDistance(net.opengis.xls.DistanceType searchCentreDistance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.DistanceType target = null;
            target = (net.opengis.xls.DistanceType)get_store().find_element_user(SEARCHCENTREDISTANCE$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.DistanceType)get_store().add_element_user(SEARCHCENTREDISTANCE$0);
            }
            target.set(searchCentreDistance);
        }
    }
    
    /**
     * Appends and returns a new empty "SearchCentreDistance" element
     */
    public net.opengis.xls.DistanceType addNewSearchCentreDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.DistanceType target = null;
            target = (net.opengis.xls.DistanceType)get_store().add_element_user(SEARCHCENTREDISTANCE$0);
            return target;
        }
    }
}
