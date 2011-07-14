/*
 * XML Type:  RouteInstructionType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.RouteInstructionType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls;


/**
 * An XML RouteInstructionType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public interface RouteInstructionType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RouteInstructionType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("routeinstructiontype0915type");
    
    /**
     * Gets the "Instruction" element
     */
    java.lang.String getInstruction();
    
    /**
     * Gets (as xml) the "Instruction" element
     */
    org.apache.xmlbeans.XmlString xgetInstruction();
    
    /**
     * Sets the "Instruction" element
     */
    void setInstruction(java.lang.String instruction);
    
    /**
     * Sets (as xml) the "Instruction" element
     */
    void xsetInstruction(org.apache.xmlbeans.XmlString instruction);
    
    /**
     * Gets the "distance" element
     */
    net.opengis.xls.DistanceType getDistance();
    
    /**
     * Sets the "distance" element
     */
    void setDistance(net.opengis.xls.DistanceType distance);
    
    /**
     * Appends and returns a new empty "distance" element
     */
    net.opengis.xls.DistanceType addNewDistance();
    
    /**
     * Gets the "RouteInstructionGeometry" element
     */
    net.opengis.xls.RouteGeometryType getRouteInstructionGeometry();
    
    /**
     * True if has "RouteInstructionGeometry" element
     */
    boolean isSetRouteInstructionGeometry();
    
    /**
     * Sets the "RouteInstructionGeometry" element
     */
    void setRouteInstructionGeometry(net.opengis.xls.RouteGeometryType routeInstructionGeometry);
    
    /**
     * Appends and returns a new empty "RouteInstructionGeometry" element
     */
    net.opengis.xls.RouteGeometryType addNewRouteInstructionGeometry();
    
    /**
     * Unsets the "RouteInstructionGeometry" element
     */
    void unsetRouteInstructionGeometry();
    
    /**
     * Gets the "BoundingBox" element
     */
    net.opengis.gml.EnvelopeType getBoundingBox();
    
    /**
     * True if has "BoundingBox" element
     */
    boolean isSetBoundingBox();
    
    /**
     * Sets the "BoundingBox" element
     */
    void setBoundingBox(net.opengis.gml.EnvelopeType boundingBox);
    
    /**
     * Appends and returns a new empty "BoundingBox" element
     */
    net.opengis.gml.EnvelopeType addNewBoundingBox();
    
    /**
     * Unsets the "BoundingBox" element
     */
    void unsetBoundingBox();
    
    /**
     * Gets the "duration" attribute
     */
    org.apache.xmlbeans.GDuration getDuration();
    
    /**
     * Gets (as xml) the "duration" attribute
     */
    org.apache.xmlbeans.XmlDuration xgetDuration();
    
    /**
     * Sets the "duration" attribute
     */
    void setDuration(org.apache.xmlbeans.GDuration duration);
    
    /**
     * Sets (as xml) the "duration" attribute
     */
    void xsetDuration(org.apache.xmlbeans.XmlDuration duration);
    
    /**
     * Gets the "description" attribute
     */
    java.lang.String getDescription();
    
    /**
     * Gets (as xml) the "description" attribute
     */
    org.apache.xmlbeans.XmlString xgetDescription();
    
    /**
     * True if has "description" attribute
     */
    boolean isSetDescription();
    
    /**
     * Sets the "description" attribute
     */
    void setDescription(java.lang.String description);
    
    /**
     * Sets (as xml) the "description" attribute
     */
    void xsetDescription(org.apache.xmlbeans.XmlString description);
    
    /**
     * Unsets the "description" attribute
     */
    void unsetDescription();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.xls.RouteInstructionType newInstance() {
          return (net.opengis.xls.RouteInstructionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.xls.RouteInstructionType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.xls.RouteInstructionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.xls.RouteInstructionType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.RouteInstructionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.xls.RouteInstructionType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.RouteInstructionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.xls.RouteInstructionType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RouteInstructionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.xls.RouteInstructionType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RouteInstructionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.xls.RouteInstructionType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RouteInstructionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.xls.RouteInstructionType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RouteInstructionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.xls.RouteInstructionType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RouteInstructionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.xls.RouteInstructionType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RouteInstructionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.xls.RouteInstructionType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RouteInstructionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.xls.RouteInstructionType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RouteInstructionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.xls.RouteInstructionType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.RouteInstructionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.xls.RouteInstructionType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.RouteInstructionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.xls.RouteInstructionType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.RouteInstructionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.xls.RouteInstructionType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.RouteInstructionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.RouteInstructionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.RouteInstructionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.RouteInstructionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.RouteInstructionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
