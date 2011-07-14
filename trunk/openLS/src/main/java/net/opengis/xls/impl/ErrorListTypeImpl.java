/*
 * XML Type:  ErrorListType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.ErrorListType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML ErrorListType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class ErrorListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.ErrorListType
{
    private static final long serialVersionUID = 1L;
    
    public ErrorListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERROR$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Error");
    private static final javax.xml.namespace.QName HIGHESTSEVERITY$2 = 
        new javax.xml.namespace.QName("", "highestSeverity");
    
    
    /**
     * Gets array of all "Error" elements
     */
    public net.opengis.xls.ErrorType[] getErrorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ERROR$0, targetList);
            net.opengis.xls.ErrorType[] result = new net.opengis.xls.ErrorType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Error" element
     */
    public net.opengis.xls.ErrorType getErrorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ErrorType target = null;
            target = (net.opengis.xls.ErrorType)get_store().find_element_user(ERROR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Error" element
     */
    public int sizeOfErrorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERROR$0);
        }
    }
    
    /**
     * Sets array of all "Error" element
     */
    public void setErrorArray(net.opengis.xls.ErrorType[] errorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(errorArray, ERROR$0);
        }
    }
    
    /**
     * Sets ith "Error" element
     */
    public void setErrorArray(int i, net.opengis.xls.ErrorType error)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ErrorType target = null;
            target = (net.opengis.xls.ErrorType)get_store().find_element_user(ERROR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(error);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Error" element
     */
    public net.opengis.xls.ErrorType insertNewError(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ErrorType target = null;
            target = (net.opengis.xls.ErrorType)get_store().insert_element_user(ERROR$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Error" element
     */
    public net.opengis.xls.ErrorType addNewError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ErrorType target = null;
            target = (net.opengis.xls.ErrorType)get_store().add_element_user(ERROR$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Error" element
     */
    public void removeError(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERROR$0, i);
        }
    }
    
    /**
     * Gets the "highestSeverity" attribute
     */
    public net.opengis.xls.SeverityType.Enum getHighestSeverity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIGHESTSEVERITY$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HIGHESTSEVERITY$2);
            }
            if (target == null)
            {
                return null;
            }
            return (net.opengis.xls.SeverityType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "highestSeverity" attribute
     */
    public net.opengis.xls.SeverityType xgetHighestSeverity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.SeverityType target = null;
            target = (net.opengis.xls.SeverityType)get_store().find_attribute_user(HIGHESTSEVERITY$2);
            if (target == null)
            {
                target = (net.opengis.xls.SeverityType)get_default_attribute_value(HIGHESTSEVERITY$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "highestSeverity" attribute
     */
    public boolean isSetHighestSeverity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HIGHESTSEVERITY$2) != null;
        }
    }
    
    /**
     * Sets the "highestSeverity" attribute
     */
    public void setHighestSeverity(net.opengis.xls.SeverityType.Enum highestSeverity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIGHESTSEVERITY$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HIGHESTSEVERITY$2);
            }
            target.setEnumValue(highestSeverity);
        }
    }
    
    /**
     * Sets (as xml) the "highestSeverity" attribute
     */
    public void xsetHighestSeverity(net.opengis.xls.SeverityType highestSeverity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.SeverityType target = null;
            target = (net.opengis.xls.SeverityType)get_store().find_attribute_user(HIGHESTSEVERITY$2);
            if (target == null)
            {
                target = (net.opengis.xls.SeverityType)get_store().add_attribute_user(HIGHESTSEVERITY$2);
            }
            target.set(highestSeverity);
        }
    }
    
    /**
     * Unsets the "highestSeverity" attribute
     */
    public void unsetHighestSeverity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HIGHESTSEVERITY$2);
        }
    }
}
