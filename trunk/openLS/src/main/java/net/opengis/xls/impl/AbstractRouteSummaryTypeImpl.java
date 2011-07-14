/*
 * XML Type:  AbstractRouteSummaryType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.AbstractRouteSummaryType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * An XML AbstractRouteSummaryType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public class AbstractRouteSummaryTypeImpl extends net.opengis.xls.impl.AbstractDataTypeImpl implements net.opengis.xls.AbstractRouteSummaryType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractRouteSummaryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOTALTIME$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "TotalTime");
    private static final javax.xml.namespace.QName TOTALDISTANCE$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "TotalDistance");
    private static final javax.xml.namespace.QName BOUNDINGBOX$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "BoundingBox");
    
    
    /**
     * Gets the "TotalTime" element
     */
    public org.apache.xmlbeans.GDuration getTotalTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALTIME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getGDurationValue();
        }
    }
    
    /**
     * Gets (as xml) the "TotalTime" element
     */
    public org.apache.xmlbeans.XmlDuration xgetTotalTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDuration target = null;
            target = (org.apache.xmlbeans.XmlDuration)get_store().find_element_user(TOTALTIME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TotalTime" element
     */
    public void setTotalTime(org.apache.xmlbeans.GDuration totalTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALTIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALTIME$0);
            }
            target.setGDurationValue(totalTime);
        }
    }
    
    /**
     * Sets (as xml) the "TotalTime" element
     */
    public void xsetTotalTime(org.apache.xmlbeans.XmlDuration totalTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDuration target = null;
            target = (org.apache.xmlbeans.XmlDuration)get_store().find_element_user(TOTALTIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDuration)get_store().add_element_user(TOTALTIME$0);
            }
            target.set(totalTime);
        }
    }
    
    /**
     * Gets the "TotalDistance" element
     */
    public net.opengis.xls.DistanceType getTotalDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.DistanceType target = null;
            target = (net.opengis.xls.DistanceType)get_store().find_element_user(TOTALDISTANCE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TotalDistance" element
     */
    public void setTotalDistance(net.opengis.xls.DistanceType totalDistance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.DistanceType target = null;
            target = (net.opengis.xls.DistanceType)get_store().find_element_user(TOTALDISTANCE$2, 0);
            if (target == null)
            {
                target = (net.opengis.xls.DistanceType)get_store().add_element_user(TOTALDISTANCE$2);
            }
            target.set(totalDistance);
        }
    }
    
    /**
     * Appends and returns a new empty "TotalDistance" element
     */
    public net.opengis.xls.DistanceType addNewTotalDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.DistanceType target = null;
            target = (net.opengis.xls.DistanceType)get_store().add_element_user(TOTALDISTANCE$2);
            return target;
        }
    }
    
    /**
     * Gets the "BoundingBox" element
     */
    public net.opengis.gml.EnvelopeType getBoundingBox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EnvelopeType target = null;
            target = (net.opengis.gml.EnvelopeType)get_store().find_element_user(BOUNDINGBOX$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BoundingBox" element
     */
    public void setBoundingBox(net.opengis.gml.EnvelopeType boundingBox)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EnvelopeType target = null;
            target = (net.opengis.gml.EnvelopeType)get_store().find_element_user(BOUNDINGBOX$4, 0);
            if (target == null)
            {
                target = (net.opengis.gml.EnvelopeType)get_store().add_element_user(BOUNDINGBOX$4);
            }
            target.set(boundingBox);
        }
    }
    
    /**
     * Appends and returns a new empty "BoundingBox" element
     */
    public net.opengis.gml.EnvelopeType addNewBoundingBox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EnvelopeType target = null;
            target = (net.opengis.gml.EnvelopeType)get_store().add_element_user(BOUNDINGBOX$4);
            return target;
        }
    }
}
