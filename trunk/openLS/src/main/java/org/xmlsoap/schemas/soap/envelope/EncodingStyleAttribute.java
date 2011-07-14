/*
 * An XML attribute type.
 * Localname: encodingStyle
 * Namespace: http://schemas.xmlsoap.org/soap/envelope/
 * Java type: org.xmlsoap.schemas.soap.envelope.EncodingStyleAttribute
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.soap.envelope;


/**
 * A document containing one encodingStyle(@http://schemas.xmlsoap.org/soap/envelope/) attribute.
 *
 * This is a complex type.
 */
public interface EncodingStyleAttribute extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EncodingStyleAttribute.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("encodingstyle6a93attrtypetype");
    
    /**
     * Gets the "encodingStyle" attribute
     */
    java.util.List getEncodingStyle();
    
    /**
     * Gets (as xml) the "encodingStyle" attribute
     */
    org.xmlsoap.schemas.soap.envelope.EncodingStyle xgetEncodingStyle();
    
    /**
     * True if has "encodingStyle" attribute
     */
    boolean isSetEncodingStyle();
    
    /**
     * Sets the "encodingStyle" attribute
     */
    void setEncodingStyle(java.util.List encodingStyle);
    
    /**
     * Sets (as xml) the "encodingStyle" attribute
     */
    void xsetEncodingStyle(org.xmlsoap.schemas.soap.envelope.EncodingStyle encodingStyle);
    
    /**
     * Unsets the "encodingStyle" attribute
     */
    void unsetEncodingStyle();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.xmlsoap.schemas.soap.envelope.EncodingStyleAttribute newInstance() {
          return (org.xmlsoap.schemas.soap.envelope.EncodingStyleAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.xmlsoap.schemas.soap.envelope.EncodingStyleAttribute newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.xmlsoap.schemas.soap.envelope.EncodingStyleAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.xmlsoap.schemas.soap.envelope.EncodingStyleAttribute parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.xmlsoap.schemas.soap.envelope.EncodingStyleAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.xmlsoap.schemas.soap.envelope.EncodingStyleAttribute parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.xmlsoap.schemas.soap.envelope.EncodingStyleAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.xmlsoap.schemas.soap.envelope.EncodingStyleAttribute parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.soap.envelope.EncodingStyleAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.xmlsoap.schemas.soap.envelope.EncodingStyleAttribute parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.soap.envelope.EncodingStyleAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.xmlsoap.schemas.soap.envelope.EncodingStyleAttribute parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.soap.envelope.EncodingStyleAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.xmlsoap.schemas.soap.envelope.EncodingStyleAttribute parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.soap.envelope.EncodingStyleAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.xmlsoap.schemas.soap.envelope.EncodingStyleAttribute parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.soap.envelope.EncodingStyleAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.xmlsoap.schemas.soap.envelope.EncodingStyleAttribute parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.soap.envelope.EncodingStyleAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.xmlsoap.schemas.soap.envelope.EncodingStyleAttribute parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.soap.envelope.EncodingStyleAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.xmlsoap.schemas.soap.envelope.EncodingStyleAttribute parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.soap.envelope.EncodingStyleAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.xmlsoap.schemas.soap.envelope.EncodingStyleAttribute parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.xmlsoap.schemas.soap.envelope.EncodingStyleAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.xmlsoap.schemas.soap.envelope.EncodingStyleAttribute parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.xmlsoap.schemas.soap.envelope.EncodingStyleAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.xmlsoap.schemas.soap.envelope.EncodingStyleAttribute parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.xmlsoap.schemas.soap.envelope.EncodingStyleAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.xmlsoap.schemas.soap.envelope.EncodingStyleAttribute parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.xmlsoap.schemas.soap.envelope.EncodingStyleAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.xmlsoap.schemas.soap.envelope.EncodingStyleAttribute parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.xmlsoap.schemas.soap.envelope.EncodingStyleAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.xmlsoap.schemas.soap.envelope.EncodingStyleAttribute parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.xmlsoap.schemas.soap.envelope.EncodingStyleAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
