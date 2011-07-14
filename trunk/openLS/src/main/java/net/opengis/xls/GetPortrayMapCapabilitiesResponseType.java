/*
 * XML Type:  GetPortrayMapCapabilitiesResponseType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.GetPortrayMapCapabilitiesResponseType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls;


/**
 * An XML GetPortrayMapCapabilitiesResponseType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public interface GetPortrayMapCapabilitiesResponseType extends net.opengis.xls.AbstractResponseParametersType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetPortrayMapCapabilitiesResponseType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("getportraymapcapabilitiesresponsetype902ctype");
    
    /**
     * Gets the "AvailableSRS" element
     */
    net.opengis.xls.AvailableSRSType getAvailableSRS();
    
    /**
     * Sets the "AvailableSRS" element
     */
    void setAvailableSRS(net.opengis.xls.AvailableSRSType availableSRS);
    
    /**
     * Appends and returns a new empty "AvailableSRS" element
     */
    net.opengis.xls.AvailableSRSType addNewAvailableSRS();
    
    /**
     * Gets the "AvailableLayers" element
     */
    net.opengis.xls.AvailableLayersType getAvailableLayers();
    
    /**
     * Sets the "AvailableLayers" element
     */
    void setAvailableLayers(net.opengis.xls.AvailableLayersType availableLayers);
    
    /**
     * Appends and returns a new empty "AvailableLayers" element
     */
    net.opengis.xls.AvailableLayersType addNewAvailableLayers();
    
    /**
     * Gets the "AvailableFormats" element
     */
    net.opengis.xls.AvailableFormatsType getAvailableFormats();
    
    /**
     * Sets the "AvailableFormats" element
     */
    void setAvailableFormats(net.opengis.xls.AvailableFormatsType availableFormats);
    
    /**
     * Appends and returns a new empty "AvailableFormats" element
     */
    net.opengis.xls.AvailableFormatsType addNewAvailableFormats();
    
    /**
     * Gets the "AvailableStyles" element
     */
    net.opengis.xls.AvailableStylesType getAvailableStyles();
    
    /**
     * Sets the "AvailableStyles" element
     */
    void setAvailableStyles(net.opengis.xls.AvailableStylesType availableStyles);
    
    /**
     * Appends and returns a new empty "AvailableStyles" element
     */
    net.opengis.xls.AvailableStylesType addNewAvailableStyles();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.xls.GetPortrayMapCapabilitiesResponseType newInstance() {
          return (net.opengis.xls.GetPortrayMapCapabilitiesResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.xls.GetPortrayMapCapabilitiesResponseType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.xls.GetPortrayMapCapabilitiesResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.xls.GetPortrayMapCapabilitiesResponseType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.GetPortrayMapCapabilitiesResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.xls.GetPortrayMapCapabilitiesResponseType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.GetPortrayMapCapabilitiesResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.xls.GetPortrayMapCapabilitiesResponseType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.GetPortrayMapCapabilitiesResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.xls.GetPortrayMapCapabilitiesResponseType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.GetPortrayMapCapabilitiesResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.xls.GetPortrayMapCapabilitiesResponseType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.GetPortrayMapCapabilitiesResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.xls.GetPortrayMapCapabilitiesResponseType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.GetPortrayMapCapabilitiesResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.xls.GetPortrayMapCapabilitiesResponseType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.GetPortrayMapCapabilitiesResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.xls.GetPortrayMapCapabilitiesResponseType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.GetPortrayMapCapabilitiesResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.xls.GetPortrayMapCapabilitiesResponseType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.GetPortrayMapCapabilitiesResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.xls.GetPortrayMapCapabilitiesResponseType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.GetPortrayMapCapabilitiesResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.xls.GetPortrayMapCapabilitiesResponseType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.GetPortrayMapCapabilitiesResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.xls.GetPortrayMapCapabilitiesResponseType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.GetPortrayMapCapabilitiesResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.xls.GetPortrayMapCapabilitiesResponseType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.GetPortrayMapCapabilitiesResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.xls.GetPortrayMapCapabilitiesResponseType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.GetPortrayMapCapabilitiesResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.GetPortrayMapCapabilitiesResponseType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.GetPortrayMapCapabilitiesResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.GetPortrayMapCapabilitiesResponseType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.GetPortrayMapCapabilitiesResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
