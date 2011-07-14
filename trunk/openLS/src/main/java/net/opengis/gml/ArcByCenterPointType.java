/*
 * XML Type:  ArcByCenterPointType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ArcByCenterPointType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml;


/**
 * An XML ArcByCenterPointType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public interface ArcByCenterPointType extends net.opengis.gml.AbstractCurveSegmentType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ArcByCenterPointType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("arcbycenterpointtype3e0ftype");
    
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
     * Gets the "radius" element
     */
    net.opengis.gml.LengthType getRadius();
    
    /**
     * Sets the "radius" element
     */
    void setRadius(net.opengis.gml.LengthType radius);
    
    /**
     * Appends and returns a new empty "radius" element
     */
    net.opengis.gml.LengthType addNewRadius();
    
    /**
     * Gets the "startAngle" element
     */
    net.opengis.gml.AngleType getStartAngle();
    
    /**
     * True if has "startAngle" element
     */
    boolean isSetStartAngle();
    
    /**
     * Sets the "startAngle" element
     */
    void setStartAngle(net.opengis.gml.AngleType startAngle);
    
    /**
     * Appends and returns a new empty "startAngle" element
     */
    net.opengis.gml.AngleType addNewStartAngle();
    
    /**
     * Unsets the "startAngle" element
     */
    void unsetStartAngle();
    
    /**
     * Gets the "endAngle" element
     */
    net.opengis.gml.AngleType getEndAngle();
    
    /**
     * True if has "endAngle" element
     */
    boolean isSetEndAngle();
    
    /**
     * Sets the "endAngle" element
     */
    void setEndAngle(net.opengis.gml.AngleType endAngle);
    
    /**
     * Appends and returns a new empty "endAngle" element
     */
    net.opengis.gml.AngleType addNewEndAngle();
    
    /**
     * Unsets the "endAngle" element
     */
    void unsetEndAngle();
    
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
        public static net.opengis.gml.ArcByCenterPointType newInstance() {
          return (net.opengis.gml.ArcByCenterPointType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.ArcByCenterPointType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.ArcByCenterPointType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.ArcByCenterPointType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.ArcByCenterPointType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.ArcByCenterPointType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.ArcByCenterPointType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.ArcByCenterPointType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ArcByCenterPointType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.ArcByCenterPointType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ArcByCenterPointType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.ArcByCenterPointType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ArcByCenterPointType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.ArcByCenterPointType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ArcByCenterPointType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.ArcByCenterPointType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ArcByCenterPointType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.ArcByCenterPointType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ArcByCenterPointType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.ArcByCenterPointType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ArcByCenterPointType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.ArcByCenterPointType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ArcByCenterPointType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.ArcByCenterPointType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.ArcByCenterPointType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.ArcByCenterPointType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.ArcByCenterPointType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.ArcByCenterPointType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.ArcByCenterPointType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.ArcByCenterPointType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.ArcByCenterPointType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.gml.ArcByCenterPointType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.ArcByCenterPointType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.gml.ArcByCenterPointType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.ArcByCenterPointType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
