/*
 * XML Type:  RoutePlanType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.RoutePlanType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls;


/**
 * An XML RoutePlanType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public interface RoutePlanType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RoutePlanType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("routeplantype9c1atype");
    
    /**
     * Gets the "RoutePreference" element
     */
    net.opengis.xls.RoutePreferenceType.Enum getRoutePreference();
    
    /**
     * Gets (as xml) the "RoutePreference" element
     */
    net.opengis.xls.RoutePreferenceType xgetRoutePreference();
    
    /**
     * Sets the "RoutePreference" element
     */
    void setRoutePreference(net.opengis.xls.RoutePreferenceType.Enum routePreference);
    
    /**
     * Sets (as xml) the "RoutePreference" element
     */
    void xsetRoutePreference(net.opengis.xls.RoutePreferenceType routePreference);
    
    /**
     * Gets the "WayPointList" element
     */
    net.opengis.xls.WayPointListType getWayPointList();
    
    /**
     * Sets the "WayPointList" element
     */
    void setWayPointList(net.opengis.xls.WayPointListType wayPointList);
    
    /**
     * Appends and returns a new empty "WayPointList" element
     */
    net.opengis.xls.WayPointListType addNewWayPointList();
    
    /**
     * Gets the "AvoidList" element
     */
    net.opengis.xls.AvoidListType getAvoidList();
    
    /**
     * True if has "AvoidList" element
     */
    boolean isSetAvoidList();
    
    /**
     * Sets the "AvoidList" element
     */
    void setAvoidList(net.opengis.xls.AvoidListType avoidList);
    
    /**
     * Appends and returns a new empty "AvoidList" element
     */
    net.opengis.xls.AvoidListType addNewAvoidList();
    
    /**
     * Unsets the "AvoidList" element
     */
    void unsetAvoidList();
    
    /**
     * Gets the "useRealTimeTraffic" attribute
     */
    boolean getUseRealTimeTraffic();
    
    /**
     * Gets (as xml) the "useRealTimeTraffic" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetUseRealTimeTraffic();
    
    /**
     * True if has "useRealTimeTraffic" attribute
     */
    boolean isSetUseRealTimeTraffic();
    
    /**
     * Sets the "useRealTimeTraffic" attribute
     */
    void setUseRealTimeTraffic(boolean useRealTimeTraffic);
    
    /**
     * Sets (as xml) the "useRealTimeTraffic" attribute
     */
    void xsetUseRealTimeTraffic(org.apache.xmlbeans.XmlBoolean useRealTimeTraffic);
    
    /**
     * Unsets the "useRealTimeTraffic" attribute
     */
    void unsetUseRealTimeTraffic();
    
    /**
     * Gets the "expectedStartTime" attribute
     */
    java.util.Calendar getExpectedStartTime();
    
    /**
     * Gets (as xml) the "expectedStartTime" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetExpectedStartTime();
    
    /**
     * True if has "expectedStartTime" attribute
     */
    boolean isSetExpectedStartTime();
    
    /**
     * Sets the "expectedStartTime" attribute
     */
    void setExpectedStartTime(java.util.Calendar expectedStartTime);
    
    /**
     * Sets (as xml) the "expectedStartTime" attribute
     */
    void xsetExpectedStartTime(org.apache.xmlbeans.XmlDateTime expectedStartTime);
    
    /**
     * Unsets the "expectedStartTime" attribute
     */
    void unsetExpectedStartTime();
    
    /**
     * Gets the "expectedEndTime" attribute
     */
    java.util.Calendar getExpectedEndTime();
    
    /**
     * Gets (as xml) the "expectedEndTime" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetExpectedEndTime();
    
    /**
     * True if has "expectedEndTime" attribute
     */
    boolean isSetExpectedEndTime();
    
    /**
     * Sets the "expectedEndTime" attribute
     */
    void setExpectedEndTime(java.util.Calendar expectedEndTime);
    
    /**
     * Sets (as xml) the "expectedEndTime" attribute
     */
    void xsetExpectedEndTime(org.apache.xmlbeans.XmlDateTime expectedEndTime);
    
    /**
     * Unsets the "expectedEndTime" attribute
     */
    void unsetExpectedEndTime();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.xls.RoutePlanType newInstance() {
          return (net.opengis.xls.RoutePlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.xls.RoutePlanType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.xls.RoutePlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.xls.RoutePlanType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.RoutePlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.xls.RoutePlanType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.RoutePlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.xls.RoutePlanType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RoutePlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.xls.RoutePlanType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RoutePlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.xls.RoutePlanType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RoutePlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.xls.RoutePlanType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RoutePlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.xls.RoutePlanType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RoutePlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.xls.RoutePlanType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RoutePlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.xls.RoutePlanType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RoutePlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.xls.RoutePlanType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RoutePlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.xls.RoutePlanType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.RoutePlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.xls.RoutePlanType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.RoutePlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.xls.RoutePlanType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.RoutePlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.xls.RoutePlanType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.RoutePlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.RoutePlanType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.RoutePlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.RoutePlanType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.RoutePlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
