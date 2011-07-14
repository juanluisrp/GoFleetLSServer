/*
 * An XML document type.
 * Localname: polygonMember
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.PolygonMemberDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl;
/**
 * A document containing one polygonMember(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class PolygonMemberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.PolygonMemberDocument
{
    private static final long serialVersionUID = 1L;
    
    public PolygonMemberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POLYGONMEMBER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "polygonMember");
    
    
    /**
     * Gets the "polygonMember" element
     */
    public net.opengis.gml.PolygonPropertyType getPolygonMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolygonPropertyType target = null;
            target = (net.opengis.gml.PolygonPropertyType)get_store().find_element_user(POLYGONMEMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "polygonMember" element
     */
    public void setPolygonMember(net.opengis.gml.PolygonPropertyType polygonMember)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolygonPropertyType target = null;
            target = (net.opengis.gml.PolygonPropertyType)get_store().find_element_user(POLYGONMEMBER$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.PolygonPropertyType)get_store().add_element_user(POLYGONMEMBER$0);
            }
            target.set(polygonMember);
        }
    }
    
    /**
     * Appends and returns a new empty "polygonMember" element
     */
    public net.opengis.gml.PolygonPropertyType addNewPolygonMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolygonPropertyType target = null;
            target = (net.opengis.gml.PolygonPropertyType)get_store().add_element_user(POLYGONMEMBER$0);
            return target;
        }
    }
}
