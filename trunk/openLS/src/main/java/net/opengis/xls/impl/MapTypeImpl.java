/*
 * XML Type:  MapType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.MapType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML MapType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class MapTypeImpl extends net.opengis.xls.impl.AbstractDataTypeImpl implements net.opengis.xls.MapType
{
    private static final long serialVersionUID = 1L;
    
    public MapTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTENT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Content");
    private static final javax.xml.namespace.QName BBOXCONTEXT$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "BBoxContext");
    private static final javax.xml.namespace.QName CENTERCONTEXT$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "CenterContext");
    
    
    /**
     * Gets the "Content" element
     */
    public net.opengis.xls.ContentType getContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ContentType target = null;
            target = (net.opengis.xls.ContentType)get_store().find_element_user(CONTENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Content" element
     */
    public boolean isSetContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTENT$0) != 0;
        }
    }
    
    /**
     * Sets the "Content" element
     */
    public void setContent(net.opengis.xls.ContentType content)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ContentType target = null;
            target = (net.opengis.xls.ContentType)get_store().find_element_user(CONTENT$0, 0);
            if (target == null)
            {
                target = (net.opengis.xls.ContentType)get_store().add_element_user(CONTENT$0);
            }
            target.set(content);
        }
    }
    
    /**
     * Appends and returns a new empty "Content" element
     */
    public net.opengis.xls.ContentType addNewContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.ContentType target = null;
            target = (net.opengis.xls.ContentType)get_store().add_element_user(CONTENT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Content" element
     */
    public void unsetContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTENT$0, 0);
        }
    }
    
    /**
     * Gets the "BBoxContext" element
     */
    public net.opengis.gml.EnvelopeType getBBoxContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EnvelopeType target = null;
            target = (net.opengis.gml.EnvelopeType)get_store().find_element_user(BBOXCONTEXT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "BBoxContext" element
     */
    public boolean isSetBBoxContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BBOXCONTEXT$2) != 0;
        }
    }
    
    /**
     * Sets the "BBoxContext" element
     */
    public void setBBoxContext(net.opengis.gml.EnvelopeType bBoxContext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EnvelopeType target = null;
            target = (net.opengis.gml.EnvelopeType)get_store().find_element_user(BBOXCONTEXT$2, 0);
            if (target == null)
            {
                target = (net.opengis.gml.EnvelopeType)get_store().add_element_user(BBOXCONTEXT$2);
            }
            target.set(bBoxContext);
        }
    }
    
    /**
     * Appends and returns a new empty "BBoxContext" element
     */
    public net.opengis.gml.EnvelopeType addNewBBoxContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EnvelopeType target = null;
            target = (net.opengis.gml.EnvelopeType)get_store().add_element_user(BBOXCONTEXT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "BBoxContext" element
     */
    public void unsetBBoxContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BBOXCONTEXT$2, 0);
        }
    }
    
    /**
     * Gets the "CenterContext" element
     */
    public net.opengis.xls.CenterContextType getCenterContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.CenterContextType target = null;
            target = (net.opengis.xls.CenterContextType)get_store().find_element_user(CENTERCONTEXT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CenterContext" element
     */
    public boolean isSetCenterContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CENTERCONTEXT$4) != 0;
        }
    }
    
    /**
     * Sets the "CenterContext" element
     */
    public void setCenterContext(net.opengis.xls.CenterContextType centerContext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.CenterContextType target = null;
            target = (net.opengis.xls.CenterContextType)get_store().find_element_user(CENTERCONTEXT$4, 0);
            if (target == null)
            {
                target = (net.opengis.xls.CenterContextType)get_store().add_element_user(CENTERCONTEXT$4);
            }
            target.set(centerContext);
        }
    }
    
    /**
     * Appends and returns a new empty "CenterContext" element
     */
    public net.opengis.xls.CenterContextType addNewCenterContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.CenterContextType target = null;
            target = (net.opengis.xls.CenterContextType)get_store().add_element_user(CENTERCONTEXT$4);
            return target;
        }
    }
    
    /**
     * Unsets the "CenterContext" element
     */
    public void unsetCenterContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CENTERCONTEXT$4, 0);
        }
    }
}
