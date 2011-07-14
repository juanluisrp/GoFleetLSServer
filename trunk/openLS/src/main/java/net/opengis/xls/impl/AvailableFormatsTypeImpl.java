/*
 * XML Type:  AvailableFormatsType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.AvailableFormatsType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML AvailableFormatsType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class AvailableFormatsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.AvailableFormatsType
{
    private static final long serialVersionUID = 1L;
    
    public AvailableFormatsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FORMAT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Format");
    
    
    /**
     * Gets array of all "Format" elements
     */
    public java.lang.String[] getFormatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FORMAT$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "Format" element
     */
    public java.lang.String getFormatArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMAT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "Format" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetFormatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FORMAT$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "Format" element
     */
    public org.apache.xmlbeans.XmlString xgetFormatArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORMAT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "Format" element
     */
    public int sizeOfFormatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORMAT$0);
        }
    }
    
    /**
     * Sets array of all "Format" element
     */
    public void setFormatArray(java.lang.String[] formatArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(formatArray, FORMAT$0);
        }
    }
    
    /**
     * Sets ith "Format" element
     */
    public void setFormatArray(int i, java.lang.String format)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMAT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(format);
        }
    }
    
    /**
     * Sets (as xml) array of all "Format" element
     */
    public void xsetFormatArray(org.apache.xmlbeans.XmlString[]formatArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(formatArray, FORMAT$0);
        }
    }
    
    /**
     * Sets (as xml) ith "Format" element
     */
    public void xsetFormatArray(int i, org.apache.xmlbeans.XmlString format)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORMAT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(format);
        }
    }
    
    /**
     * Inserts the value as the ith "Format" element
     */
    public void insertFormat(int i, java.lang.String format)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(FORMAT$0, i);
            target.setStringValue(format);
        }
    }
    
    /**
     * Appends the value as the last "Format" element
     */
    public void addFormat(java.lang.String format)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FORMAT$0);
            target.setStringValue(format);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Format" element
     */
    public org.apache.xmlbeans.XmlString insertNewFormat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(FORMAT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Format" element
     */
    public org.apache.xmlbeans.XmlString addNewFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FORMAT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Format" element
     */
    public void removeFormat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORMAT$0, i);
        }
    }
}
