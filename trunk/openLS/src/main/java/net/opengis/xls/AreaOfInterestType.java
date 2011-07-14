/*
 * XML Type:  AreaOfInterestType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.AreaOfInterestType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls;


/**
 * An XML AreaOfInterestType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public interface AreaOfInterestType extends net.opengis.xls.AbstractDataType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AreaOfInterestType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("areaofinteresttype49actype");
    
    /**
     * Gets the "CircleByCenterPoint" element
     */
    net.opengis.gml.CircleByCenterPointType getCircleByCenterPoint();
    
    /**
     * True if has "CircleByCenterPoint" element
     */
    boolean isSetCircleByCenterPoint();
    
    /**
     * Sets the "CircleByCenterPoint" element
     */
    void setCircleByCenterPoint(net.opengis.gml.CircleByCenterPointType circleByCenterPoint);
    
    /**
     * Appends and returns a new empty "CircleByCenterPoint" element
     */
    net.opengis.gml.CircleByCenterPointType addNewCircleByCenterPoint();
    
    /**
     * Unsets the "CircleByCenterPoint" element
     */
    void unsetCircleByCenterPoint();
    
    /**
     * Gets the "Polygon" element
     */
    net.opengis.gml.PolygonType getPolygon();
    
    /**
     * True if has "Polygon" element
     */
    boolean isSetPolygon();
    
    /**
     * Sets the "Polygon" element
     */
    void setPolygon(net.opengis.gml.PolygonType polygon);
    
    /**
     * Appends and returns a new empty "Polygon" element
     */
    net.opengis.gml.PolygonType addNewPolygon();
    
    /**
     * Unsets the "Polygon" element
     */
    void unsetPolygon();
    
    /**
     * Gets the "Envelope" element
     */
    net.opengis.gml.EnvelopeType getEnvelope();
    
    /**
     * True if has "Envelope" element
     */
    boolean isSetEnvelope();
    
    /**
     * Sets the "Envelope" element
     */
    void setEnvelope(net.opengis.gml.EnvelopeType envelope);
    
    /**
     * Appends and returns a new empty "Envelope" element
     */
    net.opengis.gml.EnvelopeType addNewEnvelope();
    
    /**
     * Unsets the "Envelope" element
     */
    void unsetEnvelope();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.xls.AreaOfInterestType newInstance() {
          return (net.opengis.xls.AreaOfInterestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.xls.AreaOfInterestType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.xls.AreaOfInterestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.xls.AreaOfInterestType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AreaOfInterestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.xls.AreaOfInterestType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AreaOfInterestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.xls.AreaOfInterestType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AreaOfInterestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.xls.AreaOfInterestType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AreaOfInterestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.xls.AreaOfInterestType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AreaOfInterestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.xls.AreaOfInterestType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AreaOfInterestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.xls.AreaOfInterestType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AreaOfInterestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.xls.AreaOfInterestType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AreaOfInterestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.xls.AreaOfInterestType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AreaOfInterestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.xls.AreaOfInterestType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AreaOfInterestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.xls.AreaOfInterestType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AreaOfInterestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.xls.AreaOfInterestType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AreaOfInterestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.xls.AreaOfInterestType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AreaOfInterestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.xls.AreaOfInterestType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AreaOfInterestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.AreaOfInterestType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.AreaOfInterestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.AreaOfInterestType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.AreaOfInterestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
