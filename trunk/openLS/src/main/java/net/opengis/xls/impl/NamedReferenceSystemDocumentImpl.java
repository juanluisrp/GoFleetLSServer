/*
 * An XML document type.
 * Localname: _NamedReferenceSystem
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.NamedReferenceSystemDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one _NamedReferenceSystem(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class NamedReferenceSystemDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.NamedReferenceSystemDocument
{
    private static final long serialVersionUID = 1L;
    
    public NamedReferenceSystemDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAMEDREFERENCESYSTEM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_NamedReferenceSystem");
    private static final org.apache.xmlbeans.QNameSet NAMEDREFERENCESYSTEM$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "NACE"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "SIC"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "NAICS"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_NamedReferenceSystem"),
    });
    
    
    /**
     * Gets the "_NamedReferenceSystem" element
     */
    public net.opengis.xls.AbstractNamedReferenceSystem getNamedReferenceSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractNamedReferenceSystem target = null;
            target = (net.opengis.xls.AbstractNamedReferenceSystem)get_store().find_element_user(NAMEDREFERENCESYSTEM$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_NamedReferenceSystem" element
     */
    public void setNamedReferenceSystem(net.opengis.xls.AbstractNamedReferenceSystem namedReferenceSystem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractNamedReferenceSystem target = null;
            target = (net.opengis.xls.AbstractNamedReferenceSystem)get_store().find_element_user(NAMEDREFERENCESYSTEM$1, 0);
            if (target == null)
            {
                target = (net.opengis.xls.AbstractNamedReferenceSystem)get_store().add_element_user(NAMEDREFERENCESYSTEM$0);
            }
            target.set(namedReferenceSystem);
        }
    }
    
    /**
     * Appends and returns a new empty "_NamedReferenceSystem" element
     */
    public net.opengis.xls.AbstractNamedReferenceSystem addNewNamedReferenceSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractNamedReferenceSystem target = null;
            target = (net.opengis.xls.AbstractNamedReferenceSystem)get_store().add_element_user(NAMEDREFERENCESYSTEM$0);
            return target;
        }
    }
}
