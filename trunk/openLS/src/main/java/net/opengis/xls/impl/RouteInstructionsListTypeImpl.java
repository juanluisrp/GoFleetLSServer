/*
 * XML Type:  RouteInstructionsListType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.RouteInstructionsListType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML RouteInstructionsListType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class RouteInstructionsListTypeImpl extends net.opengis.xls.impl.AbstractDataTypeImpl implements net.opengis.xls.RouteInstructionsListType
{
    private static final long serialVersionUID = 1L;
    
    public RouteInstructionsListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROUTEINSTRUCTION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "RouteInstruction");
    private static final javax.xml.namespace.QName FORMAT$2 = 
        new javax.xml.namespace.QName("", "format");
    private static final javax.xml.namespace.QName LANG$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "lang");
    
    
    /**
     * Gets array of all "RouteInstruction" elements
     */
    public net.opengis.xls.RouteInstructionType[] getRouteInstructionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ROUTEINSTRUCTION$0, targetList);
            net.opengis.xls.RouteInstructionType[] result = new net.opengis.xls.RouteInstructionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "RouteInstruction" element
     */
    public net.opengis.xls.RouteInstructionType getRouteInstructionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteInstructionType target = null;
            target = (net.opengis.xls.RouteInstructionType)get_store().find_element_user(ROUTEINSTRUCTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "RouteInstruction" element
     */
    public int sizeOfRouteInstructionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROUTEINSTRUCTION$0);
        }
    }
    
    /**
     * Sets array of all "RouteInstruction" element
     */
    public void setRouteInstructionArray(net.opengis.xls.RouteInstructionType[] routeInstructionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(routeInstructionArray, ROUTEINSTRUCTION$0);
        }
    }
    
    /**
     * Sets ith "RouteInstruction" element
     */
    public void setRouteInstructionArray(int i, net.opengis.xls.RouteInstructionType routeInstruction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteInstructionType target = null;
            target = (net.opengis.xls.RouteInstructionType)get_store().find_element_user(ROUTEINSTRUCTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(routeInstruction);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RouteInstruction" element
     */
    public net.opengis.xls.RouteInstructionType insertNewRouteInstruction(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteInstructionType target = null;
            target = (net.opengis.xls.RouteInstructionType)get_store().insert_element_user(ROUTEINSTRUCTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RouteInstruction" element
     */
    public net.opengis.xls.RouteInstructionType addNewRouteInstruction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.RouteInstructionType target = null;
            target = (net.opengis.xls.RouteInstructionType)get_store().add_element_user(ROUTEINSTRUCTION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "RouteInstruction" element
     */
    public void removeRouteInstruction(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROUTEINSTRUCTION$0, i);
        }
    }
    
    /**
     * Gets the "format" attribute
     */
    public java.lang.String getFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMAT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FORMAT$2);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "format" attribute
     */
    public org.apache.xmlbeans.XmlString xgetFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FORMAT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(FORMAT$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "format" attribute
     */
    public boolean isSetFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FORMAT$2) != null;
        }
    }
    
    /**
     * Sets the "format" attribute
     */
    public void setFormat(java.lang.String format)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMAT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORMAT$2);
            }
            target.setStringValue(format);
        }
    }
    
    /**
     * Sets (as xml) the "format" attribute
     */
    public void xsetFormat(org.apache.xmlbeans.XmlString format)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FORMAT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FORMAT$2);
            }
            target.set(format);
        }
    }
    
    /**
     * Unsets the "format" attribute
     */
    public void unsetFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FORMAT$2);
        }
    }
    
    /**
     * Gets the "lang" attribute
     */
    public java.lang.String getLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "lang" attribute
     */
    public org.apache.xmlbeans.XmlLanguage xgetLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$4);
            return target;
        }
    }
    
    /**
     * Sets the "lang" attribute
     */
    public void setLang(java.lang.String lang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$4);
            }
            target.setStringValue(lang);
        }
    }
    
    /**
     * Sets (as xml) the "lang" attribute
     */
    public void xsetLang(org.apache.xmlbeans.XmlLanguage lang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$4);
            }
            target.set(lang);
        }
    }
}
