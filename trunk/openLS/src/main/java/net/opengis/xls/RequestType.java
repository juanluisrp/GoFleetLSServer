/*
 * XML Type:  RequestType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.RequestType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls;


/**
 * An XML RequestType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public interface RequestType extends net.opengis.xls.AbstractBodyType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RequestType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("requesttype6d3dtype");
    
    /**
     * Gets the "_RequestParameters" element
     */
    net.opengis.xls.AbstractRequestParametersType getRequestParameters();
    
    /**
     * True if has "_RequestParameters" element
     */
    boolean isSetRequestParameters();
    
    /**
     * Sets the "_RequestParameters" element
     */
    void setRequestParameters(net.opengis.xls.AbstractRequestParametersType requestParameters);
    
    /**
     * Appends and returns a new empty "_RequestParameters" element
     */
    net.opengis.xls.AbstractRequestParametersType addNewRequestParameters();
    
    /**
     * Unsets the "_RequestParameters" element
     */
    void unsetRequestParameters();
    
    /**
     * Gets the "methodName" attribute
     */
    java.lang.String getMethodName();
    
    /**
     * Gets (as xml) the "methodName" attribute
     */
    org.apache.xmlbeans.XmlNMTOKEN xgetMethodName();
    
    /**
     * Sets the "methodName" attribute
     */
    void setMethodName(java.lang.String methodName);
    
    /**
     * Sets (as xml) the "methodName" attribute
     */
    void xsetMethodName(org.apache.xmlbeans.XmlNMTOKEN methodName);
    
    /**
     * Gets the "version" attribute
     */
    java.lang.String getVersion();
    
    /**
     * Gets (as xml) the "version" attribute
     */
    org.apache.xmlbeans.XmlString xgetVersion();
    
    /**
     * Sets the "version" attribute
     */
    void setVersion(java.lang.String version);
    
    /**
     * Sets (as xml) the "version" attribute
     */
    void xsetVersion(org.apache.xmlbeans.XmlString version);
    
    /**
     * Gets the "requestID" attribute
     */
    java.lang.String getRequestID();
    
    /**
     * Gets (as xml) the "requestID" attribute
     */
    org.apache.xmlbeans.XmlString xgetRequestID();
    
    /**
     * Sets the "requestID" attribute
     */
    void setRequestID(java.lang.String requestID);
    
    /**
     * Sets (as xml) the "requestID" attribute
     */
    void xsetRequestID(org.apache.xmlbeans.XmlString requestID);
    
    /**
     * Gets the "maximumResponses" attribute
     */
    java.math.BigInteger getMaximumResponses();
    
    /**
     * Gets (as xml) the "maximumResponses" attribute
     */
    org.apache.xmlbeans.XmlNonNegativeInteger xgetMaximumResponses();
    
    /**
     * True if has "maximumResponses" attribute
     */
    boolean isSetMaximumResponses();
    
    /**
     * Sets the "maximumResponses" attribute
     */
    void setMaximumResponses(java.math.BigInteger maximumResponses);
    
    /**
     * Sets (as xml) the "maximumResponses" attribute
     */
    void xsetMaximumResponses(org.apache.xmlbeans.XmlNonNegativeInteger maximumResponses);
    
    /**
     * Unsets the "maximumResponses" attribute
     */
    void unsetMaximumResponses();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.xls.RequestType newInstance() {
          return (net.opengis.xls.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.xls.RequestType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.xls.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.xls.RequestType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.xls.RequestType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.xls.RequestType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.xls.RequestType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.xls.RequestType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.xls.RequestType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.xls.RequestType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.xls.RequestType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.xls.RequestType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.xls.RequestType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.xls.RequestType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.xls.RequestType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.xls.RequestType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.xls.RequestType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.RequestType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.RequestType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
