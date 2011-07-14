/*
 * XML Type:  QualityOfPositionType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.QualityOfPositionType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML QualityOfPositionType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class QualityOfPositionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.QualityOfPositionType
{
    private static final long serialVersionUID = 1L;
    
    public QualityOfPositionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HORIZONTALACC$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "HorizontalAcc");
    private static final javax.xml.namespace.QName VERTICALACC$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "VerticalAcc");
    private static final javax.xml.namespace.QName RESPONSEREQ$4 = 
        new javax.xml.namespace.QName("", "responseReq");
    private static final javax.xml.namespace.QName RESPONSETIMER$6 = 
        new javax.xml.namespace.QName("", "responseTimer");
    
    
    /**
     * Gets the "HorizontalAcc" element
     */
    public net.opengis.xls.HorAccType getHorizontalAcc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.HorAccType target = null;
            target = (net.opengis.xls.HorAccType)get_store().find_element_user(HORIZONTALACC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HorizontalAcc" element
     */
    public void setHorizontalAcc(net.opengis.xls.HorAccType horizontalAcc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.HorAccType target = null;
            target = (net.opengis.xls.HorAccType)get_store().find_element_user(HORIZONTALACC$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.HorAccType)get_store().add_element_user(HORIZONTALACC$0);
            }
            target.set(horizontalAcc);
        }
    }
    
    /**
     * Appends and returns a new empty "HorizontalAcc" element
     */
    public net.opengis.xls.HorAccType addNewHorizontalAcc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.HorAccType target = null;
            target = (net.opengis.xls.HorAccType)get_store().add_element_user(HORIZONTALACC$0);
            return target;
        }
    }
    
    /**
     * Gets the "VerticalAcc" element
     */
    public net.opengis.xls.VerAccType getVerticalAcc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.VerAccType target = null;
            target = (net.opengis.xls.VerAccType)get_store().find_element_user(VERTICALACC$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "VerticalAcc" element
     */
    public void setVerticalAcc(net.opengis.xls.VerAccType verticalAcc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.VerAccType target = null;
            target = (net.opengis.xls.VerAccType)get_store().find_element_user(VERTICALACC$2, 0);
            if (target == null)
            {
                target = (net.opengis.xls.VerAccType)get_store().add_element_user(VERTICALACC$2);
            }
            target.set(verticalAcc);
        }
    }
    
    /**
     * Appends and returns a new empty "VerticalAcc" element
     */
    public net.opengis.xls.VerAccType addNewVerticalAcc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.VerAccType target = null;
            target = (net.opengis.xls.VerAccType)get_store().add_element_user(VERTICALACC$2);
            return target;
        }
    }
    
    /**
     * Gets the "responseReq" attribute
     */
    public net.opengis.xls.QualityOfPositionType.ResponseReq.Enum getResponseReq()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSEREQ$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(RESPONSEREQ$4);
            }
            if (target == null)
            {
                return null;
            }
            return (net.opengis.xls.QualityOfPositionType.ResponseReq.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "responseReq" attribute
     */
    public net.opengis.xls.QualityOfPositionType.ResponseReq xgetResponseReq()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.QualityOfPositionType.ResponseReq target = null;
            target = (net.opengis.xls.QualityOfPositionType.ResponseReq)get_store().find_attribute_user(RESPONSEREQ$4);
            if (target == null)
            {
                target = (net.opengis.xls.QualityOfPositionType.ResponseReq)get_default_attribute_value(RESPONSEREQ$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "responseReq" attribute
     */
    public boolean isSetResponseReq()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RESPONSEREQ$4) != null;
        }
    }
    
    /**
     * Sets the "responseReq" attribute
     */
    public void setResponseReq(net.opengis.xls.QualityOfPositionType.ResponseReq.Enum responseReq)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSEREQ$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESPONSEREQ$4);
            }
            target.setEnumValue(responseReq);
        }
    }
    
    /**
     * Sets (as xml) the "responseReq" attribute
     */
    public void xsetResponseReq(net.opengis.xls.QualityOfPositionType.ResponseReq responseReq)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.QualityOfPositionType.ResponseReq target = null;
            target = (net.opengis.xls.QualityOfPositionType.ResponseReq)get_store().find_attribute_user(RESPONSEREQ$4);
            if (target == null)
            {
                target = (net.opengis.xls.QualityOfPositionType.ResponseReq)get_store().add_attribute_user(RESPONSEREQ$4);
            }
            target.set(responseReq);
        }
    }
    
    /**
     * Unsets the "responseReq" attribute
     */
    public void unsetResponseReq()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RESPONSEREQ$4);
        }
    }
    
    /**
     * Gets the "responseTimer" attribute
     */
    public java.lang.String getResponseTimer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSETIMER$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "responseTimer" attribute
     */
    public org.apache.xmlbeans.XmlString xgetResponseTimer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RESPONSETIMER$6);
            return target;
        }
    }
    
    /**
     * True if has "responseTimer" attribute
     */
    public boolean isSetResponseTimer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RESPONSETIMER$6) != null;
        }
    }
    
    /**
     * Sets the "responseTimer" attribute
     */
    public void setResponseTimer(java.lang.String responseTimer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSETIMER$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESPONSETIMER$6);
            }
            target.setStringValue(responseTimer);
        }
    }
    
    /**
     * Sets (as xml) the "responseTimer" attribute
     */
    public void xsetResponseTimer(org.apache.xmlbeans.XmlString responseTimer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RESPONSETIMER$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RESPONSETIMER$6);
            }
            target.set(responseTimer);
        }
    }
    
    /**
     * Unsets the "responseTimer" attribute
     */
    public void unsetResponseTimer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RESPONSETIMER$6);
        }
    }
    /**
     * An XML responseReq(@).
     *
     * This is an atomic type that is a restriction of net.opengis.xls.QualityOfPositionType$ResponseReq.
     */
    public static class ResponseReqImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements net.opengis.xls.QualityOfPositionType.ResponseReq
    {
        private static final long serialVersionUID = 1L;
        
        public ResponseReqImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ResponseReqImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
