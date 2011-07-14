/*
 * XML Type:  RequestHeaderType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.RequestHeaderType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls;


/**
 * An XML RequestHeaderType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public interface RequestHeaderType extends net.opengis.xls.AbstractHeaderType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RequestHeaderType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("requestheadertype9d70type");
    
    /**
     * Gets the "clientName" attribute
     */
    java.lang.String getClientName();
    
    /**
     * Gets (as xml) the "clientName" attribute
     */
    org.apache.xmlbeans.XmlString xgetClientName();
    
    /**
     * True if has "clientName" attribute
     */
    boolean isSetClientName();
    
    /**
     * Sets the "clientName" attribute
     */
    void setClientName(java.lang.String clientName);
    
    /**
     * Sets (as xml) the "clientName" attribute
     */
    void xsetClientName(org.apache.xmlbeans.XmlString clientName);
    
    /**
     * Unsets the "clientName" attribute
     */
    void unsetClientName();
    
    /**
     * Gets the "clientPassword" attribute
     */
    java.lang.String getClientPassword();
    
    /**
     * Gets (as xml) the "clientPassword" attribute
     */
    org.apache.xmlbeans.XmlString xgetClientPassword();
    
    /**
     * True if has "clientPassword" attribute
     */
    boolean isSetClientPassword();
    
    /**
     * Sets the "clientPassword" attribute
     */
    void setClientPassword(java.lang.String clientPassword);
    
    /**
     * Sets (as xml) the "clientPassword" attribute
     */
    void xsetClientPassword(org.apache.xmlbeans.XmlString clientPassword);
    
    /**
     * Unsets the "clientPassword" attribute
     */
    void unsetClientPassword();
    
    /**
     * Gets the "sessionID" attribute
     */
    java.lang.String getSessionID();
    
    /**
     * Gets (as xml) the "sessionID" attribute
     */
    org.apache.xmlbeans.XmlString xgetSessionID();
    
    /**
     * True if has "sessionID" attribute
     */
    boolean isSetSessionID();
    
    /**
     * Sets the "sessionID" attribute
     */
    void setSessionID(java.lang.String sessionID);
    
    /**
     * Sets (as xml) the "sessionID" attribute
     */
    void xsetSessionID(org.apache.xmlbeans.XmlString sessionID);
    
    /**
     * Unsets the "sessionID" attribute
     */
    void unsetSessionID();
    
    /**
     * Gets the "srsName" attribute
     */
    java.lang.String getSrsName();
    
    /**
     * Gets (as xml) the "srsName" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetSrsName();
    
    /**
     * True if has "srsName" attribute
     */
    boolean isSetSrsName();
    
    /**
     * Sets the "srsName" attribute
     */
    void setSrsName(java.lang.String srsName);
    
    /**
     * Sets (as xml) the "srsName" attribute
     */
    void xsetSrsName(org.apache.xmlbeans.XmlAnyURI srsName);
    
    /**
     * Unsets the "srsName" attribute
     */
    void unsetSrsName();
    
    /**
     * Gets the "MSID" attribute
     */
    java.lang.String getMSID();
    
    /**
     * Gets (as xml) the "MSID" attribute
     */
    org.apache.xmlbeans.XmlString xgetMSID();
    
    /**
     * True if has "MSID" attribute
     */
    boolean isSetMSID();
    
    /**
     * Sets the "MSID" attribute
     */
    void setMSID(java.lang.String msid);
    
    /**
     * Sets (as xml) the "MSID" attribute
     */
    void xsetMSID(org.apache.xmlbeans.XmlString msid);
    
    /**
     * Unsets the "MSID" attribute
     */
    void unsetMSID();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.xls.RequestHeaderType newInstance() {
          return (net.opengis.xls.RequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.xls.RequestHeaderType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.xls.RequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.xls.RequestHeaderType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.RequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.xls.RequestHeaderType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.RequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.xls.RequestHeaderType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.xls.RequestHeaderType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.xls.RequestHeaderType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.xls.RequestHeaderType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.xls.RequestHeaderType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.xls.RequestHeaderType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.xls.RequestHeaderType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.xls.RequestHeaderType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.RequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.xls.RequestHeaderType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.RequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.xls.RequestHeaderType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.RequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.xls.RequestHeaderType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.RequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.xls.RequestHeaderType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.RequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.RequestHeaderType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.RequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.RequestHeaderType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.RequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
