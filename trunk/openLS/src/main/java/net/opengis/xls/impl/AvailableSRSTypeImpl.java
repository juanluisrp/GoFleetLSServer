/*
 * XML Type:  AvailableSRSType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.AvailableSRSType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML AvailableSRSType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class AvailableSRSTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.AvailableSRSType
{
    private static final long serialVersionUID = 1L;
    
    public AvailableSRSTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SRS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "SRS");
    
    
    /**
     * Gets array of all "SRS" elements
     */
    public java.lang.String[] getSRSArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SRS$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "SRS" element
     */
    public java.lang.String getSRSArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SRS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "SRS" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetSRSArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SRS$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "SRS" element
     */
    public org.apache.xmlbeans.XmlString xgetSRSArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SRS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "SRS" element
     */
    public int sizeOfSRSArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SRS$0);
        }
    }
    
    /**
     * Sets array of all "SRS" element
     */
    public void setSRSArray(java.lang.String[] srsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(srsArray, SRS$0);
        }
    }
    
    /**
     * Sets ith "SRS" element
     */
    public void setSRSArray(int i, java.lang.String srs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SRS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(srs);
        }
    }
    
    /**
     * Sets (as xml) array of all "SRS" element
     */
    public void xsetSRSArray(org.apache.xmlbeans.XmlString[]srsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(srsArray, SRS$0);
        }
    }
    
    /**
     * Sets (as xml) ith "SRS" element
     */
    public void xsetSRSArray(int i, org.apache.xmlbeans.XmlString srs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SRS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(srs);
        }
    }
    
    /**
     * Inserts the value as the ith "SRS" element
     */
    public void insertSRS(int i, java.lang.String srs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SRS$0, i);
            target.setStringValue(srs);
        }
    }
    
    /**
     * Appends the value as the last "SRS" element
     */
    public void addSRS(java.lang.String srs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SRS$0);
            target.setStringValue(srs);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SRS" element
     */
    public org.apache.xmlbeans.XmlString insertNewSRS(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(SRS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SRS" element
     */
    public org.apache.xmlbeans.XmlString addNewSRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SRS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "SRS" element
     */
    public void removeSRS(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SRS$0, i);
        }
    }
}
