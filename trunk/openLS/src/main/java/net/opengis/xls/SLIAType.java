/*
 * XML Type:  SLIAType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.SLIAType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls;


/**
 * An XML SLIAType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public interface SLIAType extends net.opengis.xls.AbstractResponseParametersType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SLIAType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("sliatype9f89type");
    
    /**
     * Gets the "OutputGatewayParameters" element
     */
    net.opengis.xls.OutputGatewayParametersType getOutputGatewayParameters();
    
    /**
     * Sets the "OutputGatewayParameters" element
     */
    void setOutputGatewayParameters(net.opengis.xls.OutputGatewayParametersType outputGatewayParameters);
    
    /**
     * Appends and returns a new empty "OutputGatewayParameters" element
     */
    net.opengis.xls.OutputGatewayParametersType addNewOutputGatewayParameters();
    
    /**
     * Gets the "requestID" attribute
     */
    java.lang.String getRequestID();
    
    /**
     * Gets (as xml) the "requestID" attribute
     */
    org.apache.xmlbeans.XmlString xgetRequestID();
    
    /**
     * True if has "requestID" attribute
     */
    boolean isSetRequestID();
    
    /**
     * Sets the "requestID" attribute
     */
    void setRequestID(java.lang.String requestID);
    
    /**
     * Sets (as xml) the "requestID" attribute
     */
    void xsetRequestID(org.apache.xmlbeans.XmlString requestID);
    
    /**
     * Unsets the "requestID" attribute
     */
    void unsetRequestID();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.xls.SLIAType newInstance() {
          return (net.opengis.xls.SLIAType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.xls.SLIAType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.xls.SLIAType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.xls.SLIAType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.SLIAType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.xls.SLIAType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.SLIAType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.xls.SLIAType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.SLIAType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.xls.SLIAType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.SLIAType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.xls.SLIAType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.SLIAType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.xls.SLIAType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.SLIAType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.xls.SLIAType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.SLIAType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.xls.SLIAType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.SLIAType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.xls.SLIAType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.SLIAType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.xls.SLIAType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.SLIAType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.xls.SLIAType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.SLIAType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.xls.SLIAType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.SLIAType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.xls.SLIAType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.SLIAType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.xls.SLIAType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.SLIAType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.SLIAType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.SLIAType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.SLIAType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.SLIAType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
