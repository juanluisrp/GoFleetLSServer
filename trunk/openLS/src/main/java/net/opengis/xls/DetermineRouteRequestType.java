/*
 * XML Type:  DetermineRouteRequestType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.DetermineRouteRequestType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls;


/**
 * An XML DetermineRouteRequestType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public interface DetermineRouteRequestType extends net.opengis.xls.AbstractRequestParametersType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DetermineRouteRequestType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("determinerouterequesttype8ed3type");
    
    /**
     * Gets the "RouteHandle" element
     */
    net.opengis.xls.RouteHandleType getRouteHandle();
    
    /**
     * True if has "RouteHandle" element
     */
    boolean isSetRouteHandle();
    
    /**
     * Sets the "RouteHandle" element
     */
    void setRouteHandle(net.opengis.xls.RouteHandleType routeHandle);
    
    /**
     * Appends and returns a new empty "RouteHandle" element
     */
    net.opengis.xls.RouteHandleType addNewRouteHandle();
    
    /**
     * Unsets the "RouteHandle" element
     */
    void unsetRouteHandle();
    
    /**
     * Gets the "RoutePlan" element
     */
    net.opengis.xls.RoutePlanType getRoutePlan();
    
    /**
     * True if has "RoutePlan" element
     */
    boolean isSetRoutePlan();
    
    /**
     * Sets the "RoutePlan" element
     */
    void setRoutePlan(net.opengis.xls.RoutePlanType routePlan);
    
    /**
     * Appends and returns a new empty "RoutePlan" element
     */
    net.opengis.xls.RoutePlanType addNewRoutePlan();
    
    /**
     * Unsets the "RoutePlan" element
     */
    void unsetRoutePlan();
    
    /**
     * Gets the "RouteInstructionsRequest" element
     */
    net.opengis.xls.RouteInstructionsRequestType getRouteInstructionsRequest();
    
    /**
     * True if has "RouteInstructionsRequest" element
     */
    boolean isSetRouteInstructionsRequest();
    
    /**
     * Sets the "RouteInstructionsRequest" element
     */
    void setRouteInstructionsRequest(net.opengis.xls.RouteInstructionsRequestType routeInstructionsRequest);
    
    /**
     * Appends and returns a new empty "RouteInstructionsRequest" element
     */
    net.opengis.xls.RouteInstructionsRequestType addNewRouteInstructionsRequest();
    
    /**
     * Unsets the "RouteInstructionsRequest" element
     */
    void unsetRouteInstructionsRequest();
    
    /**
     * Gets the "RouteGeometryRequest" element
     */
    net.opengis.xls.RouteGeometryRequestType getRouteGeometryRequest();
    
    /**
     * True if has "RouteGeometryRequest" element
     */
    boolean isSetRouteGeometryRequest();
    
    /**
     * Sets the "RouteGeometryRequest" element
     */
    void setRouteGeometryRequest(net.opengis.xls.RouteGeometryRequestType routeGeometryRequest);
    
    /**
     * Appends and returns a new empty "RouteGeometryRequest" element
     */
    net.opengis.xls.RouteGeometryRequestType addNewRouteGeometryRequest();
    
    /**
     * Unsets the "RouteGeometryRequest" element
     */
    void unsetRouteGeometryRequest();
    
    /**
     * Gets the "RouteMapRequest" element
     */
    net.opengis.xls.RouteMapRequestType getRouteMapRequest();
    
    /**
     * True if has "RouteMapRequest" element
     */
    boolean isSetRouteMapRequest();
    
    /**
     * Sets the "RouteMapRequest" element
     */
    void setRouteMapRequest(net.opengis.xls.RouteMapRequestType routeMapRequest);
    
    /**
     * Appends and returns a new empty "RouteMapRequest" element
     */
    net.opengis.xls.RouteMapRequestType addNewRouteMapRequest();
    
    /**
     * Unsets the "RouteMapRequest" element
     */
    void unsetRouteMapRequest();
    
    /**
     * Gets the "provideRouteHandle" attribute
     */
    boolean getProvideRouteHandle();
    
    /**
     * Gets (as xml) the "provideRouteHandle" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetProvideRouteHandle();
    
    /**
     * True if has "provideRouteHandle" attribute
     */
    boolean isSetProvideRouteHandle();
    
    /**
     * Sets the "provideRouteHandle" attribute
     */
    void setProvideRouteHandle(boolean provideRouteHandle);
    
    /**
     * Sets (as xml) the "provideRouteHandle" attribute
     */
    void xsetProvideRouteHandle(org.apache.xmlbeans.XmlBoolean provideRouteHandle);
    
    /**
     * Unsets the "provideRouteHandle" attribute
     */
    void unsetProvideRouteHandle();
    
    /**
     * Gets the "distanceUnit" attribute
     */
    net.opengis.xls.DistanceUnitType.Enum getDistanceUnit();
    
    /**
     * Gets (as xml) the "distanceUnit" attribute
     */
    net.opengis.xls.DistanceUnitType xgetDistanceUnit();
    
    /**
     * True if has "distanceUnit" attribute
     */
    boolean isSetDistanceUnit();
    
    /**
     * Sets the "distanceUnit" attribute
     */
    void setDistanceUnit(net.opengis.xls.DistanceUnitType.Enum distanceUnit);
    
    /**
     * Sets (as xml) the "distanceUnit" attribute
     */
    void xsetDistanceUnit(net.opengis.xls.DistanceUnitType distanceUnit);
    
    /**
     * Unsets the "distanceUnit" attribute
     */
    void unsetDistanceUnit();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.xls.DetermineRouteRequestType newInstance() {
          return (net.opengis.xls.DetermineRouteRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.xls.DetermineRouteRequestType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.xls.DetermineRouteRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.xls.DetermineRouteRequestType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.DetermineRouteRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.xls.DetermineRouteRequestType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.DetermineRouteRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.xls.DetermineRouteRequestType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.DetermineRouteRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.xls.DetermineRouteRequestType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.DetermineRouteRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.xls.DetermineRouteRequestType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.DetermineRouteRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.xls.DetermineRouteRequestType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.DetermineRouteRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.xls.DetermineRouteRequestType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.DetermineRouteRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.xls.DetermineRouteRequestType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.DetermineRouteRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.xls.DetermineRouteRequestType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.DetermineRouteRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.xls.DetermineRouteRequestType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.DetermineRouteRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.xls.DetermineRouteRequestType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.DetermineRouteRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.xls.DetermineRouteRequestType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.DetermineRouteRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.xls.DetermineRouteRequestType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.DetermineRouteRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.xls.DetermineRouteRequestType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.DetermineRouteRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.DetermineRouteRequestType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.DetermineRouteRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.DetermineRouteRequestType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.DetermineRouteRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
