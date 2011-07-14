/*
 * An XML document type.
 * Localname: _Measure
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.MeasureDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls.impl;
/**
 * A document containing one _Measure(@http://www.opengis.net/xls) element.
 *
 * This is a complex type.
 */
public class MeasureDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.xls.MeasureDocument
{
    private static final long serialVersionUID = 1L;
    
    public MeasureDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEASURE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_Measure");
    private static final org.apache.xmlbeans.QNameSet MEASURE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Distance"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Angle"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "_Measure"),
        new javax.xml.namespace.QName("http://www.opengis.net/xls", "Speed"),
    });
    
    
    /**
     * Gets the "_Measure" element
     */
    public net.opengis.xls.AbstractMeasureType getMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractMeasureType target = null;
            target = (net.opengis.xls.AbstractMeasureType)get_store().find_element_user(MEASURE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_Measure" element
     */
    public void setMeasure(net.opengis.xls.AbstractMeasureType measure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractMeasureType target = null;
            target = (net.opengis.xls.AbstractMeasureType)get_store().find_element_user(MEASURE$1, 0);
            if (target == null)
            {
                target = (net.opengis.xls.AbstractMeasureType)get_store().add_element_user(MEASURE$0);
            }
            target.set(measure);
        }
    }
    
    /**
     * Appends and returns a new empty "_Measure" element
     */
    public net.opengis.xls.AbstractMeasureType addNewMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.xls.AbstractMeasureType target = null;
            target = (net.opengis.xls.AbstractMeasureType)get_store().add_element_user(MEASURE$0);
            return target;
        }
    }
}
