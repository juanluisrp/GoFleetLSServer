/*
 * XML Type:  RouteGeometryRequestType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.RouteGeometryRequestType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls;


/**
 * An XML RouteGeometryRequestType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public interface RouteGeometryRequestType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RouteGeometryRequestType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("routegeometryrequesttype5206type");
    
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
     * Gets the "scale" attribute
     */
    java.math.BigInteger getScale();
    
    /**
     * Gets (as xml) the "scale" attribute
     */
    org.apache.xmlbeans.XmlPositiveInteger xgetScale();
    
    /**
     * True if has "scale" attribute
     */
    boolean isSetScale();
    
    /**
     * Sets the "scale" attribute
     */
    void setScale(java.math.BigInteger scale);
    
    /**
     * Sets (as xml) the "scale" attribute
     */
    void xsetScale(org.apache.xmlbeans.XmlPositiveInteger scale);
    
    /**
     * Unsets the "scale" attribute
     */
    void unsetScale();
    
    /**
     * Gets the "provideStartingPortion" attribute
     */
    boolean getProvideStartingPortion();
    
    /**
     * Gets (as xml) the "provideStartingPortion" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetProvideStartingPortion();
    
    /**
     * True if has "provideStartingPortion" attribute
     */
    boolean isSetProvideStartingPortion();
    
    /**
     * Sets the "provideStartingPortion" attribute
     */
    void setProvideStartingPortion(boolean provideStartingPortion);
    
    /**
     * Sets (as xml) the "provideStartingPortion" attribute
     */
    void xsetProvideStartingPortion(org.apache.xmlbeans.XmlBoolean provideStartingPortion);
    
    /**
     * Unsets the "provideStartingPortion" attribute
     */
    void unsetProvideStartingPortion();
    
    /**
     * Gets the "maxPoints" attribute
     */
    java.math.BigInteger getMaxPoints();
    
    /**
     * Gets (as xml) the "maxPoints" attribute
     */
    org.apache.xmlbeans.XmlPositiveInteger xgetMaxPoints();
    
    /**
     * True if has "maxPoints" attribute
     */
    boolean isSetMaxPoints();
    
    /**
     * Sets the "maxPoints" attribute
     */
    void setMaxPoints(java.math.BigInteger maxPoints);
    
    /**
     * Sets (as xml) the "maxPoints" attribute
     */
    void xsetMaxPoints(org.apache.xmlbeans.XmlPositiveInteger maxPoints);
    
    /**
     * Unsets the "maxPoints" attribute
     */
    void unsetMaxPoints();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.xls.RouteGeometryRequestType newInstance() {
          return (net.opengis.xls.RouteGeometryRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.xls.RouteGeometryRequestType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.xls.RouteGeometryRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.xls.RouteGeometryRequestType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.RouteGeometryRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.xls.RouteGeometryRequestType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.RouteGeometryRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.xls.RouteGeometryRequestType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RouteGeometryRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.xls.RouteGeometryRequestType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RouteGeometryRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.xls.RouteGeometryRequestType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RouteGeometryRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.xls.RouteGeometryRequestType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RouteGeometryRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.xls.RouteGeometryRequestType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RouteGeometryRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.xls.RouteGeometryRequestType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RouteGeometryRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.xls.RouteGeometryRequestType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RouteGeometryRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.xls.RouteGeometryRequestType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RouteGeometryRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.xls.RouteGeometryRequestType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.RouteGeometryRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.xls.RouteGeometryRequestType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.RouteGeometryRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.xls.RouteGeometryRequestType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.RouteGeometryRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.xls.RouteGeometryRequestType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.RouteGeometryRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.RouteGeometryRequestType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.RouteGeometryRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.RouteGeometryRequestType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.RouteGeometryRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
