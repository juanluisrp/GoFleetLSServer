/*
 * XML Type:  AvailableStylesType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.AvailableStylesType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls;


/**
 * An XML AvailableStylesType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public interface AvailableStylesType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AvailableStylesType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("availablestylestype2241type");
    
    /**
     * Gets array of all "Style" elements
     */
    java.lang.String[] getStyleArray();
    
    /**
     * Gets ith "Style" element
     */
    java.lang.String getStyleArray(int i);
    
    /**
     * Gets (as xml) array of all "Style" elements
     */
    org.apache.xmlbeans.XmlString[] xgetStyleArray();
    
    /**
     * Gets (as xml) ith "Style" element
     */
    org.apache.xmlbeans.XmlString xgetStyleArray(int i);
    
    /**
     * Returns number of "Style" element
     */
    int sizeOfStyleArray();
    
    /**
     * Sets array of all "Style" element
     */
    void setStyleArray(java.lang.String[] styleArray);
    
    /**
     * Sets ith "Style" element
     */
    void setStyleArray(int i, java.lang.String style);
    
    /**
     * Sets (as xml) array of all "Style" element
     */
    void xsetStyleArray(org.apache.xmlbeans.XmlString[] styleArray);
    
    /**
     * Sets (as xml) ith "Style" element
     */
    void xsetStyleArray(int i, org.apache.xmlbeans.XmlString style);
    
    /**
     * Inserts the value as the ith "Style" element
     */
    void insertStyle(int i, java.lang.String style);
    
    /**
     * Appends the value as the last "Style" element
     */
    void addStyle(java.lang.String style);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Style" element
     */
    org.apache.xmlbeans.XmlString insertNewStyle(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Style" element
     */
    org.apache.xmlbeans.XmlString addNewStyle();
    
    /**
     * Removes the ith "Style" element
     */
    void removeStyle(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.xls.AvailableStylesType newInstance() {
          return (net.opengis.xls.AvailableStylesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.xls.AvailableStylesType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.xls.AvailableStylesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.xls.AvailableStylesType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AvailableStylesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.xls.AvailableStylesType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AvailableStylesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.xls.AvailableStylesType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AvailableStylesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.xls.AvailableStylesType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AvailableStylesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.xls.AvailableStylesType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AvailableStylesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.xls.AvailableStylesType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AvailableStylesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.xls.AvailableStylesType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AvailableStylesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.xls.AvailableStylesType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AvailableStylesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.xls.AvailableStylesType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AvailableStylesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.xls.AvailableStylesType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AvailableStylesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.xls.AvailableStylesType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AvailableStylesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.xls.AvailableStylesType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AvailableStylesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.xls.AvailableStylesType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AvailableStylesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.xls.AvailableStylesType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AvailableStylesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.AvailableStylesType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.AvailableStylesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.AvailableStylesType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.AvailableStylesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
