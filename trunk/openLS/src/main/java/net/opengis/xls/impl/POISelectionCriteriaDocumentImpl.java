/*
 * An XML document type.
 * Localname: _POISelectionCriteria
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.POISelectionCriteriaDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one _POISelectionCriteria(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class POISelectionCriteriaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.POISelectionCriteriaDocument
{
    private static final long serialVersionUID = 1L;
    
    public POISelectionCriteriaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POISELECTIONCRITERIA$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_POISelectionCriteria");
    private static final org.apache.xmlbeans.QNameSet POISELECTIONCRITERIA$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_POISelectionCriteria"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "POIProperties"),
    });
    
    
    /**
     * Gets the "_POISelectionCriteria" element
     */
    public net.opengis.xls.AbstractPOISelectionCriteriaType getPOISelectionCriteria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractPOISelectionCriteriaType target = null;
            target = (net.opengis.xls.AbstractPOISelectionCriteriaType)get_store().find_element_user(POISELECTIONCRITERIA$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_POISelectionCriteria" element
     */
    public void setPOISelectionCriteria(net.opengis.xls.AbstractPOISelectionCriteriaType poiSelectionCriteria)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractPOISelectionCriteriaType target = null;
            target = (net.opengis.xls.AbstractPOISelectionCriteriaType)get_store().find_element_user(POISELECTIONCRITERIA$1, 0);
            if (target == null)
            {
                target = (net.opengis.xls.AbstractPOISelectionCriteriaType)get_store().add_element_user(POISELECTIONCRITERIA$0);
            }
            target.set(poiSelectionCriteria);
        }
    }
    
    /**
     * Appends and returns a new empty "_POISelectionCriteria" element
     */
    public net.opengis.xls.AbstractPOISelectionCriteriaType addNewPOISelectionCriteria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractPOISelectionCriteriaType target = null;
            target = (net.opengis.xls.AbstractPOISelectionCriteriaType)get_store().add_element_user(POISELECTIONCRITERIA$0);
            return target;
        }
    }
}
