/*
 * XML Type:  ResponseType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.ResponseType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls;


/**
 * An XML ResponseType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public interface ResponseType extends net.opengis.xls.AbstractBodyType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResponseType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("responsetypeced9type");
    
    /**
     * Gets the "ErrorList" element
     */
    net.opengis.xls.ErrorListType getErrorList();
    
    /**
     * True if has "ErrorList" element
     */
    boolean isSetErrorList();
    
    /**
     * Sets the "ErrorList" element
     */
    void setErrorList(net.opengis.xls.ErrorListType errorList);
    
    /**
     * Appends and returns a new empty "ErrorList" element
     */
    net.opengis.xls.ErrorListType addNewErrorList();
    
    /**
     * Unsets the "ErrorList" element
     */
    void unsetErrorList();
    
    /**
     * Gets the "_ResponseParameters" element
     */
    net.opengis.xls.AbstractResponseParametersType getResponseParameters();
    
    /**
     * True if has "_ResponseParameters" element
     */
    boolean isSetResponseParameters();
    
    /**
     * Sets the "_ResponseParameters" element
     */
    void setResponseParameters(net.opengis.xls.AbstractResponseParametersType responseParameters);
    
    /**
     * Appends and returns a new empty "_ResponseParameters" element
     */
    net.opengis.xls.AbstractResponseParametersType addNewResponseParameters();
    
    /**
     * Unsets the "_ResponseParameters" element
     */
    void unsetResponseParameters();
    
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
     * Gets the "numberOfResponses" attribute
     */
    java.math.BigInteger getNumberOfResponses();
    
    /**
     * Gets (as xml) the "numberOfResponses" attribute
     */
    org.apache.xmlbeans.XmlNonNegativeInteger xgetNumberOfResponses();
    
    /**
     * True if has "numberOfResponses" attribute
     */
    boolean isSetNumberOfResponses();
    
    /**
     * Sets the "numberOfResponses" attribute
     */
    void setNumberOfResponses(java.math.BigInteger numberOfResponses);
    
    /**
     * Sets (as xml) the "numberOfResponses" attribute
     */
    void xsetNumberOfResponses(org.apache.xmlbeans.XmlNonNegativeInteger numberOfResponses);
    
    /**
     * Unsets the "numberOfResponses" attribute
     */
    void unsetNumberOfResponses();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.xls.ResponseType newInstance() {
          return (net.opengis.xls.ResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.xls.ResponseType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.xls.ResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.xls.ResponseType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.ResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.xls.ResponseType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.ResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.xls.ResponseType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.xls.ResponseType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.xls.ResponseType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.xls.ResponseType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.xls.ResponseType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.xls.ResponseType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.xls.ResponseType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.xls.ResponseType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.xls.ResponseType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.ResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.xls.ResponseType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.ResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.xls.ResponseType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.ResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.xls.ResponseType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.ResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.ResponseType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.ResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.ResponseType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.ResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
