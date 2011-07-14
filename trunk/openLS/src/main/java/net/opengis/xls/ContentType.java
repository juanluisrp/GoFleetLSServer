/*
 * XML Type:  ContentType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.ContentType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls;


/**
 * An XML ContentType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public interface ContentType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ContentType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("contenttype6e13type");
    
    /**
     * Gets the "Data" element
     */
    java.lang.String getData();
    
    /**
     * Gets (as xml) the "Data" element
     */
    org.apache.xmlbeans.XmlString xgetData();
    
    /**
     * True if has "Data" element
     */
    boolean isSetData();
    
    /**
     * Sets the "Data" element
     */
    void setData(java.lang.String data);
    
    /**
     * Sets (as xml) the "Data" element
     */
    void xsetData(org.apache.xmlbeans.XmlString data);
    
    /**
     * Unsets the "Data" element
     */
    void unsetData();
    
    /**
     * Gets the "URL" element
     */
    java.lang.String getURL();
    
    /**
     * Gets (as xml) the "URL" element
     */
    org.apache.xmlbeans.XmlString xgetURL();
    
    /**
     * True if has "URL" element
     */
    boolean isSetURL();
    
    /**
     * Sets the "URL" element
     */
    void setURL(java.lang.String url);
    
    /**
     * Sets (as xml) the "URL" element
     */
    void xsetURL(org.apache.xmlbeans.XmlString url);
    
    /**
     * Unsets the "URL" element
     */
    void unsetURL();
    
    /**
     * Gets the "format" attribute
     */
    java.lang.String getFormat();
    
    /**
     * Gets (as xml) the "format" attribute
     */
    org.apache.xmlbeans.XmlString xgetFormat();
    
    /**
     * Sets the "format" attribute
     */
    void setFormat(java.lang.String format);
    
    /**
     * Sets (as xml) the "format" attribute
     */
    void xsetFormat(org.apache.xmlbeans.XmlString format);
    
    /**
     * Gets the "width" attribute
     */
    java.math.BigInteger getWidth();
    
    /**
     * Gets (as xml) the "width" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetWidth();
    
    /**
     * Sets the "width" attribute
     */
    void setWidth(java.math.BigInteger width);
    
    /**
     * Sets (as xml) the "width" attribute
     */
    void xsetWidth(org.apache.xmlbeans.XmlInteger width);
    
    /**
     * Gets the "height" attribute
     */
    java.math.BigInteger getHeight();
    
    /**
     * Gets (as xml) the "height" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetHeight();
    
    /**
     * Sets the "height" attribute
     */
    void setHeight(java.math.BigInteger height);
    
    /**
     * Sets (as xml) the "height" attribute
     */
    void xsetHeight(org.apache.xmlbeans.XmlInteger height);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.xls.ContentType newInstance() {
          return (net.opengis.xls.ContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.xls.ContentType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.xls.ContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.xls.ContentType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.ContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.xls.ContentType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.ContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.xls.ContentType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.xls.ContentType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.xls.ContentType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.xls.ContentType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.xls.ContentType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.xls.ContentType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.xls.ContentType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.xls.ContentType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.xls.ContentType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.ContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.xls.ContentType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.ContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.xls.ContentType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.ContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.xls.ContentType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.ContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.ContentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.ContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.ContentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.ContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
