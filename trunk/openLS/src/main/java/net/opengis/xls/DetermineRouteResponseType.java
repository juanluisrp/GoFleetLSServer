/*
 * XML Type:  DetermineRouteResponseType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.DetermineRouteResponseType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls;


/**
 * An XML DetermineRouteResponseType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public interface DetermineRouteResponseType extends net.opengis.xls.AbstractResponseParametersType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DetermineRouteResponseType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("determinerouteresponsetypee003type");
    
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
     * Gets the "RouteSummary" element
     */
    net.opengis.xls.RouteSummaryType getRouteSummary();
    
    /**
     * Sets the "RouteSummary" element
     */
    void setRouteSummary(net.opengis.xls.RouteSummaryType routeSummary);
    
    /**
     * Appends and returns a new empty "RouteSummary" element
     */
    net.opengis.xls.RouteSummaryType addNewRouteSummary();
    
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
     * Gets the "RouteInstructionsList" element
     */
    net.opengis.xls.RouteInstructionsListType getRouteInstructionsList();
    
    /**
     * True if has "RouteInstructionsList" element
     */
    boolean isSetRouteInstructionsList();
    
    /**
     * Sets the "RouteInstructionsList" element
     */
    void setRouteInstructionsList(net.opengis.xls.RouteInstructionsListType routeInstructionsList);
    
    /**
     * Appends and returns a new empty "RouteInstructionsList" element
     */
    net.opengis.xls.RouteInstructionsListType addNewRouteInstructionsList();
    
    /**
     * Unsets the "RouteInstructionsList" element
     */
    void unsetRouteInstructionsList();
    
    /**
     * Gets array of all "RouteMap" elements
     */
    net.opengis.xls.RouteMapType[] getRouteMapArray();
    
    /**
     * Gets ith "RouteMap" element
     */
    net.opengis.xls.RouteMapType getRouteMapArray(int i);
    
    /**
     * Returns number of "RouteMap" element
     */
    int sizeOfRouteMapArray();
    
    /**
     * Sets array of all "RouteMap" element
     */
    void setRouteMapArray(net.opengis.xls.RouteMapType[] routeMapArray);
    
    /**
     * Sets ith "RouteMap" element
     */
    void setRouteMapArray(int i, net.opengis.xls.RouteMapType routeMap);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RouteMap" element
     */
    net.opengis.xls.RouteMapType insertNewRouteMap(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RouteMap" element
     */
    net.opengis.xls.RouteMapType addNewRouteMap();
    
    /**
     * Removes the ith "RouteMap" element
     */
    void removeRouteMap(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.xls.DetermineRouteResponseType newInstance() {
          return (net.opengis.xls.DetermineRouteResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.xls.DetermineRouteResponseType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.xls.DetermineRouteResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.xls.DetermineRouteResponseType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.DetermineRouteResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.xls.DetermineRouteResponseType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.DetermineRouteResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.xls.DetermineRouteResponseType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.DetermineRouteResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.xls.DetermineRouteResponseType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.DetermineRouteResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.xls.DetermineRouteResponseType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.DetermineRouteResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.xls.DetermineRouteResponseType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.DetermineRouteResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.xls.DetermineRouteResponseType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.DetermineRouteResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.xls.DetermineRouteResponseType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.DetermineRouteResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.xls.DetermineRouteResponseType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.DetermineRouteResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.xls.DetermineRouteResponseType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.DetermineRouteResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.xls.DetermineRouteResponseType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.DetermineRouteResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.xls.DetermineRouteResponseType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.DetermineRouteResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.xls.DetermineRouteResponseType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.DetermineRouteResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.xls.DetermineRouteResponseType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.DetermineRouteResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.DetermineRouteResponseType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.DetermineRouteResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.DetermineRouteResponseType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.DetermineRouteResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
