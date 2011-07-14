/*
 * XML Type:  SICType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.SICType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls;


/**
 * An XML SICType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public interface SICType extends net.opengis.xls.AbstractNamedReferenceSystem
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SICType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("sictypeabbftype");
    
    /**
     * Gets the "type" attribute
     */
    java.lang.String getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    org.apache.xmlbeans.XmlString xgetType();
    
    /**
     * True if has "type" attribute
     */
    boolean isSetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(java.lang.String type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(org.apache.xmlbeans.XmlString type);
    
    /**
     * Unsets the "type" attribute
     */
    void unsetType();
    
    /**
     * Gets the "subType" attribute
     */
    java.lang.String getSubType();
    
    /**
     * Gets (as xml) the "subType" attribute
     */
    org.apache.xmlbeans.XmlString xgetSubType();
    
    /**
     * True if has "subType" attribute
     */
    boolean isSetSubType();
    
    /**
     * Sets the "subType" attribute
     */
    void setSubType(java.lang.String subType);
    
    /**
     * Sets (as xml) the "subType" attribute
     */
    void xsetSubType(org.apache.xmlbeans.XmlString subType);
    
    /**
     * Unsets the "subType" attribute
     */
    void unsetSubType();
    
    /**
     * Gets the "category" attribute
     */
    java.lang.String getCategory();
    
    /**
     * Gets (as xml) the "category" attribute
     */
    org.apache.xmlbeans.XmlString xgetCategory();
    
    /**
     * True if has "category" attribute
     */
    boolean isSetCategory();
    
    /**
     * Sets the "category" attribute
     */
    void setCategory(java.lang.String category);
    
    /**
     * Sets (as xml) the "category" attribute
     */
    void xsetCategory(org.apache.xmlbeans.XmlString category);
    
    /**
     * Unsets the "category" attribute
     */
    void unsetCategory();
    
    /**
     * Gets the "code" attribute
     */
    java.lang.String getCode();
    
    /**
     * Gets (as xml) the "code" attribute
     */
    org.apache.xmlbeans.XmlString xgetCode();
    
    /**
     * True if has "code" attribute
     */
    boolean isSetCode();
    
    /**
     * Sets the "code" attribute
     */
    void setCode(java.lang.String code);
    
    /**
     * Sets (as xml) the "code" attribute
     */
    void xsetCode(org.apache.xmlbeans.XmlString code);
    
    /**
     * Unsets the "code" attribute
     */
    void unsetCode();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.xls.SICType newInstance() {
          return (net.opengis.xls.SICType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.xls.SICType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.xls.SICType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.xls.SICType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.SICType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.xls.SICType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.SICType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.xls.SICType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.SICType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.xls.SICType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.SICType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.xls.SICType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.SICType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.xls.SICType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.SICType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.xls.SICType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.SICType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.xls.SICType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.SICType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.xls.SICType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.SICType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.xls.SICType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.SICType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.xls.SICType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.SICType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.xls.SICType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.SICType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.xls.SICType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.SICType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.xls.SICType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.SICType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.SICType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.SICType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.SICType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.SICType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
