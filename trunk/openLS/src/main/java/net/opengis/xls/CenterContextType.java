/*
 * XML Type:  CenterContextType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.CenterContextType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls;


/**
 * An XML CenterContextType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public interface CenterContextType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CenterContextType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("centercontexttype5c12type");
    
    /**
     * Gets the "CenterPoint" element
     */
    net.opengis.gml.PointType getCenterPoint();
    
    /**
     * Sets the "CenterPoint" element
     */
    void setCenterPoint(net.opengis.gml.PointType centerPoint);
    
    /**
     * Appends and returns a new empty "CenterPoint" element
     */
    net.opengis.gml.PointType addNewCenterPoint();
    
    /**
     * Gets the "DisplayScale" element
     */
    java.math.BigInteger getDisplayScale();
    
    /**
     * Gets (as xml) the "DisplayScale" element
     */
    org.apache.xmlbeans.XmlInteger xgetDisplayScale();
    
    /**
     * True if has "DisplayScale" element
     */
    boolean isSetDisplayScale();
    
    /**
     * Sets the "DisplayScale" element
     */
    void setDisplayScale(java.math.BigInteger displayScale);
    
    /**
     * Sets (as xml) the "DisplayScale" element
     */
    void xsetDisplayScale(org.apache.xmlbeans.XmlInteger displayScale);
    
    /**
     * Unsets the "DisplayScale" element
     */
    void unsetDisplayScale();
    
    /**
     * Gets the "DPI" element
     */
    java.math.BigInteger getDPI();
    
    /**
     * Gets (as xml) the "DPI" element
     */
    org.apache.xmlbeans.XmlInteger xgetDPI();
    
    /**
     * True if has "DPI" element
     */
    boolean isSetDPI();
    
    /**
     * Sets the "DPI" element
     */
    void setDPI(java.math.BigInteger dpi);
    
    /**
     * Sets (as xml) the "DPI" element
     */
    void xsetDPI(org.apache.xmlbeans.XmlInteger dpi);
    
    /**
     * Unsets the "DPI" element
     */
    void unsetDPI();
    
    /**
     * Gets the "Radius" element
     */
    net.opengis.xls.RadiusType getRadius();
    
    /**
     * True if has "Radius" element
     */
    boolean isSetRadius();
    
    /**
     * Sets the "Radius" element
     */
    void setRadius(net.opengis.xls.RadiusType radius);
    
    /**
     * Appends and returns a new empty "Radius" element
     */
    net.opengis.xls.RadiusType addNewRadius();
    
    /**
     * Unsets the "Radius" element
     */
    void unsetRadius();
    
    /**
     * Gets the "azimuth" attribute
     */
    java.math.BigInteger getAzimuth();
    
    /**
     * Gets (as xml) the "azimuth" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetAzimuth();
    
    /**
     * True if has "azimuth" attribute
     */
    boolean isSetAzimuth();
    
    /**
     * Sets the "azimuth" attribute
     */
    void setAzimuth(java.math.BigInteger azimuth);
    
    /**
     * Sets (as xml) the "azimuth" attribute
     */
    void xsetAzimuth(org.apache.xmlbeans.XmlInteger azimuth);
    
    /**
     * Unsets the "azimuth" attribute
     */
    void unsetAzimuth();
    
    /**
     * Gets the "SRS" attribute
     */
    java.lang.String getSRS();
    
    /**
     * Gets (as xml) the "SRS" attribute
     */
    org.apache.xmlbeans.XmlString xgetSRS();
    
    /**
     * Sets the "SRS" attribute
     */
    void setSRS(java.lang.String srs);
    
    /**
     * Sets (as xml) the "SRS" attribute
     */
    void xsetSRS(org.apache.xmlbeans.XmlString srs);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.xls.CenterContextType newInstance() {
          return (net.opengis.xls.CenterContextType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.xls.CenterContextType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.xls.CenterContextType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.xls.CenterContextType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.CenterContextType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.xls.CenterContextType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.CenterContextType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.xls.CenterContextType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.CenterContextType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.xls.CenterContextType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.CenterContextType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.xls.CenterContextType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.CenterContextType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.xls.CenterContextType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.CenterContextType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.xls.CenterContextType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.CenterContextType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.xls.CenterContextType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.CenterContextType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.xls.CenterContextType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.CenterContextType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.xls.CenterContextType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.CenterContextType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.xls.CenterContextType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.CenterContextType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.xls.CenterContextType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.CenterContextType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.xls.CenterContextType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.CenterContextType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.xls.CenterContextType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.CenterContextType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.CenterContextType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.CenterContextType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.CenterContextType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.CenterContextType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
