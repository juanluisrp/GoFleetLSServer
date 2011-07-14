/*
 * XML Type:  ErrorType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.ErrorType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls;


/**
 * An XML ErrorType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public interface ErrorType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ErrorType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("errortype3ce4type");
    
    /**
     * Gets the "errorCode" attribute
     */
    net.opengis.xls.ErrorCodeType.Enum getErrorCode();
    
    /**
     * Gets (as xml) the "errorCode" attribute
     */
    net.opengis.xls.ErrorCodeType xgetErrorCode();
    
    /**
     * Sets the "errorCode" attribute
     */
    void setErrorCode(net.opengis.xls.ErrorCodeType.Enum errorCode);
    
    /**
     * Sets (as xml) the "errorCode" attribute
     */
    void xsetErrorCode(net.opengis.xls.ErrorCodeType errorCode);
    
    /**
     * Gets the "severity" attribute
     */
    net.opengis.xls.SeverityType.Enum getSeverity();
    
    /**
     * Gets (as xml) the "severity" attribute
     */
    net.opengis.xls.SeverityType xgetSeverity();
    
    /**
     * True if has "severity" attribute
     */
    boolean isSetSeverity();
    
    /**
     * Sets the "severity" attribute
     */
    void setSeverity(net.opengis.xls.SeverityType.Enum severity);
    
    /**
     * Sets (as xml) the "severity" attribute
     */
    void xsetSeverity(net.opengis.xls.SeverityType severity);
    
    /**
     * Unsets the "severity" attribute
     */
    void unsetSeverity();
    
    /**
     * Gets the "locationID" attribute
     */
    java.lang.String getLocationID();
    
    /**
     * Gets (as xml) the "locationID" attribute
     */
    org.apache.xmlbeans.XmlIDREF xgetLocationID();
    
    /**
     * True if has "locationID" attribute
     */
    boolean isSetLocationID();
    
    /**
     * Sets the "locationID" attribute
     */
    void setLocationID(java.lang.String locationID);
    
    /**
     * Sets (as xml) the "locationID" attribute
     */
    void xsetLocationID(org.apache.xmlbeans.XmlIDREF locationID);
    
    /**
     * Unsets the "locationID" attribute
     */
    void unsetLocationID();
    
    /**
     * Gets the "locationPath" attribute
     */
    java.lang.String getLocationPath();
    
    /**
     * Gets (as xml) the "locationPath" attribute
     */
    org.apache.xmlbeans.XmlString xgetLocationPath();
    
    /**
     * True if has "locationPath" attribute
     */
    boolean isSetLocationPath();
    
    /**
     * Sets the "locationPath" attribute
     */
    void setLocationPath(java.lang.String locationPath);
    
    /**
     * Sets (as xml) the "locationPath" attribute
     */
    void xsetLocationPath(org.apache.xmlbeans.XmlString locationPath);
    
    /**
     * Unsets the "locationPath" attribute
     */
    void unsetLocationPath();
    
    /**
     * Gets the "message" attribute
     */
    java.lang.String getMessage();
    
    /**
     * Gets (as xml) the "message" attribute
     */
    org.apache.xmlbeans.XmlString xgetMessage();
    
    /**
     * True if has "message" attribute
     */
    boolean isSetMessage();
    
    /**
     * Sets the "message" attribute
     */
    void setMessage(java.lang.String message);
    
    /**
     * Sets (as xml) the "message" attribute
     */
    void xsetMessage(org.apache.xmlbeans.XmlString message);
    
    /**
     * Unsets the "message" attribute
     */
    void unsetMessage();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.xls.ErrorType newInstance() {
          return (net.opengis.xls.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.xls.ErrorType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.xls.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.xls.ErrorType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.xls.ErrorType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.xls.ErrorType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.xls.ErrorType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.xls.ErrorType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.xls.ErrorType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.xls.ErrorType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.xls.ErrorType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.xls.ErrorType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.xls.ErrorType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.xls.ErrorType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.xls.ErrorType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.xls.ErrorType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.xls.ErrorType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.ErrorType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.ErrorType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
