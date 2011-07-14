/*
 * XML Type:  OverlayType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.OverlayType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls;


/**
 * An XML OverlayType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public interface OverlayType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OverlayType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("overlaytype235ctype");
    
    /**
     * Gets the "POI" element
     */
    net.opengis.xls.PointOfInterestType getPOI();
    
    /**
     * True if has "POI" element
     */
    boolean isSetPOI();
    
    /**
     * Sets the "POI" element
     */
    void setPOI(net.opengis.xls.PointOfInterestType poi);
    
    /**
     * Appends and returns a new empty "POI" element
     */
    net.opengis.xls.PointOfInterestType addNewPOI();
    
    /**
     * Unsets the "POI" element
     */
    void unsetPOI();
    
    /**
     * Gets the "RouteGeometry" element
     */
    net.opengis.xls.RouteGeometryType getRouteGeometry();
    
    /**
     * True if has "RouteGeometry" element
     */
    boolean isSetRouteGeometry();
    
    /**
     * Sets the "RouteGeometry" element
     */
    void setRouteGeometry(net.opengis.xls.RouteGeometryType routeGeometry);
    
    /**
     * Appends and returns a new empty "RouteGeometry" element
     */
    net.opengis.xls.RouteGeometryType addNewRouteGeometry();
    
    /**
     * Unsets the "RouteGeometry" element
     */
    void unsetRouteGeometry();
    
    /**
     * Gets the "Position" element
     */
    net.opengis.xls.PositionType getPosition();
    
    /**
     * True if has "Position" element
     */
    boolean isSetPosition();
    
    /**
     * Sets the "Position" element
     */
    void setPosition(net.opengis.xls.PositionType position);
    
    /**
     * Appends and returns a new empty "Position" element
     */
    net.opengis.xls.PositionType addNewPosition();
    
    /**
     * Unsets the "Position" element
     */
    void unsetPosition();
    
    /**
     * Gets the "Map" element
     */
    net.opengis.xls.MapType getMap();
    
    /**
     * True if has "Map" element
     */
    boolean isSetMap();
    
    /**
     * Sets the "Map" element
     */
    void setMap(net.opengis.xls.MapType map);
    
    /**
     * Appends and returns a new empty "Map" element
     */
    net.opengis.xls.MapType addNewMap();
    
    /**
     * Unsets the "Map" element
     */
    void unsetMap();
    
    /**
     * Gets the "Style" element
     */
    net.opengis.xls.StyleType getStyle();
    
    /**
     * True if has "Style" element
     */
    boolean isSetStyle();
    
    /**
     * Sets the "Style" element
     */
    void setStyle(net.opengis.xls.StyleType style);
    
    /**
     * Appends and returns a new empty "Style" element
     */
    net.opengis.xls.StyleType addNewStyle();
    
    /**
     * Unsets the "Style" element
     */
    void unsetStyle();
    
    /**
     * Gets the "zorder" attribute
     */
    java.math.BigInteger getZorder();
    
    /**
     * Gets (as xml) the "zorder" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetZorder();
    
    /**
     * True if has "zorder" attribute
     */
    boolean isSetZorder();
    
    /**
     * Sets the "zorder" attribute
     */
    void setZorder(java.math.BigInteger zorder);
    
    /**
     * Sets (as xml) the "zorder" attribute
     */
    void xsetZorder(org.apache.xmlbeans.XmlInteger zorder);
    
    /**
     * Unsets the "zorder" attribute
     */
    void unsetZorder();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.xls.OverlayType newInstance() {
          return (net.opengis.xls.OverlayType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.xls.OverlayType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.xls.OverlayType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.xls.OverlayType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.OverlayType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.xls.OverlayType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.OverlayType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.xls.OverlayType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.OverlayType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.xls.OverlayType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.OverlayType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.xls.OverlayType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.OverlayType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.xls.OverlayType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.OverlayType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.xls.OverlayType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.OverlayType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.xls.OverlayType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.OverlayType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.xls.OverlayType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.OverlayType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.xls.OverlayType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.OverlayType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.xls.OverlayType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.OverlayType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.xls.OverlayType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.OverlayType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.xls.OverlayType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.OverlayType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.xls.OverlayType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.OverlayType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.OverlayType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.OverlayType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.OverlayType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.OverlayType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
