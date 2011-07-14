/*
 * XML Type:  AbstractAddressType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.AbstractAddressType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls;


/**
 * An XML AbstractAddressType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public interface AbstractAddressType extends net.opengis.xls.AbstractLocationType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AbstractAddressType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("abstractaddresstype30fatype");
    
    /**
     * Gets the "addressee" attribute
     */
    java.lang.String getAddressee();
    
    /**
     * Gets (as xml) the "addressee" attribute
     */
    org.apache.xmlbeans.XmlString xgetAddressee();
    
    /**
     * True if has "addressee" attribute
     */
    boolean isSetAddressee();
    
    /**
     * Sets the "addressee" attribute
     */
    void setAddressee(java.lang.String addressee);
    
    /**
     * Sets (as xml) the "addressee" attribute
     */
    void xsetAddressee(org.apache.xmlbeans.XmlString addressee);
    
    /**
     * Unsets the "addressee" attribute
     */
    void unsetAddressee();
    
    /**
     * Gets the "countryCode" attribute
     */
    java.lang.String getCountryCode();
    
    /**
     * Gets (as xml) the "countryCode" attribute
     */
    net.opengis.xls.CountryCodeType xgetCountryCode();
    
    /**
     * Sets the "countryCode" attribute
     */
    void setCountryCode(java.lang.String countryCode);
    
    /**
     * Sets (as xml) the "countryCode" attribute
     */
    void xsetCountryCode(net.opengis.xls.CountryCodeType countryCode);
    
    /**
     * Gets the "language" attribute
     */
    java.lang.String getLanguage();
    
    /**
     * Gets (as xml) the "language" attribute
     */
    org.apache.xmlbeans.XmlLanguage xgetLanguage();
    
    /**
     * True if has "language" attribute
     */
    boolean isSetLanguage();
    
    /**
     * Sets the "language" attribute
     */
    void setLanguage(java.lang.String language);
    
    /**
     * Sets (as xml) the "language" attribute
     */
    void xsetLanguage(org.apache.xmlbeans.XmlLanguage language);
    
    /**
     * Unsets the "language" attribute
     */
    void unsetLanguage();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        public static net.opengis.xls.AbstractAddressType newInstance() {
          return (net.opengis.xls.AbstractAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        public static net.opengis.xls.AbstractAddressType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.xls.AbstractAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.xls.AbstractAddressType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AbstractAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.xls.AbstractAddressType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AbstractAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.xls.AbstractAddressType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AbstractAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.xls.AbstractAddressType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AbstractAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.xls.AbstractAddressType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AbstractAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.xls.AbstractAddressType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AbstractAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.xls.AbstractAddressType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AbstractAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.xls.AbstractAddressType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AbstractAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.xls.AbstractAddressType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AbstractAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.xls.AbstractAddressType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AbstractAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.xls.AbstractAddressType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AbstractAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.xls.AbstractAddressType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AbstractAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.xls.AbstractAddressType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AbstractAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.xls.AbstractAddressType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AbstractAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.AbstractAddressType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.AbstractAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.AbstractAddressType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.AbstractAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
