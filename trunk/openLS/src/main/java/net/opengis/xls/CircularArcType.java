/*
 * XML Type:  CircularArcType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.CircularArcType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls;


/**
 * An XML CircularArcType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public interface CircularArcType extends net.opengis.gml.AbstractGeometricPrimitiveType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CircularArcType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("circulararctypebb99type");
    
    /**
     * Gets the "pos" element
     */
    net.opengis.gml.DirectPositionType getPos();
    
    /**
     * Sets the "pos" element
     */
    void setPos(net.opengis.gml.DirectPositionType pos);
    
    /**
     * Appends and returns a new empty "pos" element
     */
    net.opengis.gml.DirectPositionType addNewPos();
    
    /**
     * Gets the "innerRadius" element
     */
    net.opengis.gml.LengthType getInnerRadius();
    
    /**
     * Sets the "innerRadius" element
     */
    void setInnerRadius(net.opengis.gml.LengthType innerRadius);
    
    /**
     * Appends and returns a new empty "innerRadius" element
     */
    net.opengis.gml.LengthType addNewInnerRadius();
    
    /**
     * Gets the "outerRadius" element
     */
    net.opengis.gml.LengthType getOuterRadius();
    
    /**
     * Sets the "outerRadius" element
     */
    void setOuterRadius(net.opengis.gml.LengthType outerRadius);
    
    /**
     * Appends and returns a new empty "outerRadius" element
     */
    net.opengis.gml.LengthType addNewOuterRadius();
    
    /**
     * Gets the "startAngle" element
     */
    net.opengis.gml.AngleType getStartAngle();
    
    /**
     * Sets the "startAngle" element
     */
    void setStartAngle(net.opengis.gml.AngleType startAngle);
    
    /**
     * Appends and returns a new empty "startAngle" element
     */
    net.opengis.gml.AngleType addNewStartAngle();
    
    /**
     * Gets the "endAngle" element
     */
    net.opengis.gml.AngleType getEndAngle();
    
    /**
     * Sets the "endAngle" element
     */
    void setEndAngle(net.opengis.gml.AngleType endAngle);
    
    /**
     * Appends and returns a new empty "endAngle" element
     */
    net.opengis.gml.AngleType addNewEndAngle();
    
    /**
     * Gets the "interpolation" attribute
     */
    net.opengis.gml.CurveInterpolationType.Enum getInterpolation();
    
    /**
     * Gets (as xml) the "interpolation" attribute
     */
    net.opengis.gml.CurveInterpolationType xgetInterpolation();
    
    /**
     * True if has "interpolation" attribute
     */
    boolean isSetInterpolation();
    
    /**
     * Sets the "interpolation" attribute
     */
    void setInterpolation(net.opengis.gml.CurveInterpolationType.Enum interpolation);
    
    /**
     * Sets (as xml) the "interpolation" attribute
     */
    void xsetInterpolation(net.opengis.gml.CurveInterpolationType interpolation);
    
    /**
     * Unsets the "interpolation" attribute
     */
    void unsetInterpolation();
    
    /**
     * Gets the "numArc" attribute
     */
    java.math.BigInteger getNumArc();
    
    /**
     * Gets (as xml) the "numArc" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetNumArc();
    
    /**
     * Sets the "numArc" attribute
     */
    void setNumArc(java.math.BigInteger numArc);
    
    /**
     * Sets (as xml) the "numArc" attribute
     */
    void xsetNumArc(org.apache.xmlbeans.XmlInteger numArc);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.xls.CircularArcType newInstance() {
          return (net.opengis.xls.CircularArcType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.xls.CircularArcType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.xls.CircularArcType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.xls.CircularArcType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.CircularArcType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.xls.CircularArcType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.CircularArcType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.xls.CircularArcType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.CircularArcType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.xls.CircularArcType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.CircularArcType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.xls.CircularArcType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.CircularArcType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.xls.CircularArcType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.CircularArcType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.xls.CircularArcType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.CircularArcType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.xls.CircularArcType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.CircularArcType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.xls.CircularArcType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.CircularArcType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.xls.CircularArcType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.CircularArcType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.xls.CircularArcType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.CircularArcType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.xls.CircularArcType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.CircularArcType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.xls.CircularArcType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.CircularArcType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.xls.CircularArcType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.CircularArcType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.CircularArcType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.CircularArcType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.CircularArcType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.CircularArcType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
