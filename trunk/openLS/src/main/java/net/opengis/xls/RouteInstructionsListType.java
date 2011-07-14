/*
 * XML Type:  RouteInstructionsListType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.RouteInstructionsListType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls;


/**
 * An XML RouteInstructionsListType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public interface RouteInstructionsListType extends net.opengis.xls.AbstractDataType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RouteInstructionsListType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("routeinstructionslisttypee020type");
    
    /**
     * Gets array of all "RouteInstruction" elements
     */
    net.opengis.xls.RouteInstructionType[] getRouteInstructionArray();
    
    /**
     * Gets ith "RouteInstruction" element
     */
    net.opengis.xls.RouteInstructionType getRouteInstructionArray(int i);
    
    /**
     * Returns number of "RouteInstruction" element
     */
    int sizeOfRouteInstructionArray();
    
    /**
     * Sets array of all "RouteInstruction" element
     */
    void setRouteInstructionArray(net.opengis.xls.RouteInstructionType[] routeInstructionArray);
    
    /**
     * Sets ith "RouteInstruction" element
     */
    void setRouteInstructionArray(int i, net.opengis.xls.RouteInstructionType routeInstruction);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RouteInstruction" element
     */
    net.opengis.xls.RouteInstructionType insertNewRouteInstruction(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RouteInstruction" element
     */
    net.opengis.xls.RouteInstructionType addNewRouteInstruction();
    
    /**
     * Removes the ith "RouteInstruction" element
     */
    void removeRouteInstruction(int i);
    
    /**
     * Gets the "format" attribute
     */
    java.lang.String getFormat();
    
    /**
     * Gets (as xml) the "format" attribute
     */
    org.apache.xmlbeans.XmlString xgetFormat();
    
    /**
     * True if has "format" attribute
     */
    boolean isSetFormat();
    
    /**
     * Sets the "format" attribute
     */
    void setFormat(java.lang.String format);
    
    /**
     * Sets (as xml) the "format" attribute
     */
    void xsetFormat(org.apache.xmlbeans.XmlString format);
    
    /**
     * Unsets the "format" attribute
     */
    void unsetFormat();
    
    /**
     * Gets the "lang" attribute
     */
    java.lang.String getLang();
    
    /**
     * Gets (as xml) the "lang" attribute
     */
    org.apache.xmlbeans.XmlLanguage xgetLang();
    
    /**
     * Sets the "lang" attribute
     */
    void setLang(java.lang.String lang);
    
    /**
     * Sets (as xml) the "lang" attribute
     */
    void xsetLang(org.apache.xmlbeans.XmlLanguage lang);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.xls.RouteInstructionsListType newInstance() {
          return (net.opengis.xls.RouteInstructionsListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.xls.RouteInstructionsListType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.xls.RouteInstructionsListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.xls.RouteInstructionsListType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.RouteInstructionsListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.xls.RouteInstructionsListType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.RouteInstructionsListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.xls.RouteInstructionsListType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RouteInstructionsListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.xls.RouteInstructionsListType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RouteInstructionsListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.xls.RouteInstructionsListType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RouteInstructionsListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.xls.RouteInstructionsListType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RouteInstructionsListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.xls.RouteInstructionsListType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RouteInstructionsListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.xls.RouteInstructionsListType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RouteInstructionsListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.xls.RouteInstructionsListType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RouteInstructionsListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.xls.RouteInstructionsListType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RouteInstructionsListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.xls.RouteInstructionsListType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.RouteInstructionsListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.xls.RouteInstructionsListType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.RouteInstructionsListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.xls.RouteInstructionsListType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.RouteInstructionsListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.xls.RouteInstructionsListType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.RouteInstructionsListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.RouteInstructionsListType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.RouteInstructionsListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.RouteInstructionsListType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.RouteInstructionsListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
