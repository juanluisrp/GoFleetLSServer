/*
 * XML Type:  ReferenceSystemType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.ReferenceSystemType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML ReferenceSystemType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class ReferenceSystemTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.ReferenceSystemType
{
    private static final long serialVersionUID = 1L;
    
    public ReferenceSystemTypeImpl(org.apache.xmlbeans.SchemaType sType)
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
     * Gets array of all "_NamedReferenceSystem" elements
     */
    public net.opengis.xls.AbstractNamedReferenceSystem[] getNamedReferenceSystemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NAMEDREFERENCESYSTEM$1, targetList);
            net.opengis.xls.AbstractNamedReferenceSystem[] result = new net.opengis.xls.AbstractNamedReferenceSystem[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "_NamedReferenceSystem" element
     */
    public net.opengis.xls.AbstractNamedReferenceSystem getNamedReferenceSystemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractNamedReferenceSystem target = null;
            target = (net.opengis.xls.AbstractNamedReferenceSystem)get_store().find_element_user(NAMEDREFERENCESYSTEM$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "_NamedReferenceSystem" element
     */
    public int sizeOfNamedReferenceSystemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAMEDREFERENCESYSTEM$1);
        }
    }
    
    /**
     * Sets array of all "_NamedReferenceSystem" element
     */
    public void setNamedReferenceSystemArray(net.opengis.xls.AbstractNamedReferenceSystem[] namedReferenceSystemArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(namedReferenceSystemArray, NAMEDREFERENCESYSTEM$0, NAMEDREFERENCESYSTEM$1);
        }
    }
    
    /**
     * Sets ith "_NamedReferenceSystem" element
     */
    public void setNamedReferenceSystemArray(int i, net.opengis.xls.AbstractNamedReferenceSystem namedReferenceSystem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractNamedReferenceSystem target = null;
            target = (net.opengis.xls.AbstractNamedReferenceSystem)get_store().find_element_user(NAMEDREFERENCESYSTEM$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(namedReferenceSystem);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "_NamedReferenceSystem" element
     */
    public net.opengis.xls.AbstractNamedReferenceSystem insertNewNamedReferenceSystem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractNamedReferenceSystem target = null;
            target = (net.opengis.xls.AbstractNamedReferenceSystem)get_store().insert_element_user(NAMEDREFERENCESYSTEM$1, NAMEDREFERENCESYSTEM$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "_NamedReferenceSystem" element
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
    
    /**
     * Removes the ith "_NamedReferenceSystem" element
     */
    public void removeNamedReferenceSystem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAMEDREFERENCESYSTEM$1, i);
        }
    }
}
