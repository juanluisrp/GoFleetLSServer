/*
 * An XML document type.
 * Localname: AvoidFeature
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.AvoidFeatureDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one AvoidFeature(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class AvoidFeatureDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.AvoidFeatureDocument
{
    private static final long serialVersionUID = 1L;
    
    public AvoidFeatureDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AVOIDFEATURE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "AvoidFeature");
    
    
    /**
     * Gets the "AvoidFeature" element
     */
    public net.opengis.xls.AvoidFeatureType.Enum getAvoidFeature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AVOIDFEATURE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (net.opengis.xls.AvoidFeatureType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "AvoidFeature" element
     */
    public net.opengis.xls.AvoidFeatureType xgetAvoidFeature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AvoidFeatureType target = null;
            target = (net.opengis.xls.AvoidFeatureType)get_store().find_element_user(AVOIDFEATURE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AvoidFeature" element
     */
    public void setAvoidFeature(net.opengis.xls.AvoidFeatureType.Enum avoidFeature)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AVOIDFEATURE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AVOIDFEATURE$0);
            }
            target.setEnumValue(avoidFeature);
        }
    }
    
    /**
     * Sets (as xml) the "AvoidFeature" element
     */
    public void xsetAvoidFeature(net.opengis.xls.AvoidFeatureType avoidFeature)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AvoidFeatureType target = null;
            target = (net.opengis.xls.AvoidFeatureType)get_store().find_element_user(AVOIDFEATURE$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.AvoidFeatureType)get_store().add_element_user(AVOIDFEATURE$0);
            }
            target.set(avoidFeature);
        }
    }
}
