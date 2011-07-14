/*
 * XML Type:  AvailableStylesType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.AvailableStylesType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML AvailableStylesType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class AvailableStylesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.AvailableStylesType
{
    private static final long serialVersionUID = 1L;
    
    public AvailableStylesTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STYLE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Style");
    
    
    /**
     * Gets array of all "Style" elements
     */
    public java.lang.String[] getStyleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STYLE$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "Style" element
     */
    public java.lang.String getStyleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STYLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "Style" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetStyleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STYLE$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "Style" element
     */
    public org.apache.xmlbeans.XmlString xgetStyleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STYLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "Style" element
     */
    public int sizeOfStyleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STYLE$0);
        }
    }
    
    /**
     * Sets array of all "Style" element
     */
    public void setStyleArray(java.lang.String[] styleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(styleArray, STYLE$0);
        }
    }
    
    /**
     * Sets ith "Style" element
     */
    public void setStyleArray(int i, java.lang.String style)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STYLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(style);
        }
    }
    
    /**
     * Sets (as xml) array of all "Style" element
     */
    public void xsetStyleArray(org.apache.xmlbeans.XmlString[]styleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(styleArray, STYLE$0);
        }
    }
    
    /**
     * Sets (as xml) ith "Style" element
     */
    public void xsetStyleArray(int i, org.apache.xmlbeans.XmlString style)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STYLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(style);
        }
    }
    
    /**
     * Inserts the value as the ith "Style" element
     */
    public void insertStyle(int i, java.lang.String style)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(STYLE$0, i);
            target.setStringValue(style);
        }
    }
    
    /**
     * Appends the value as the last "Style" element
     */
    public void addStyle(java.lang.String style)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STYLE$0);
            target.setStringValue(style);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Style" element
     */
    public org.apache.xmlbeans.XmlString insertNewStyle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(STYLE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Style" element
     */
    public org.apache.xmlbeans.XmlString addNewStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STYLE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Style" element
     */
    public void removeStyle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STYLE$0, i);
        }
    }
}
