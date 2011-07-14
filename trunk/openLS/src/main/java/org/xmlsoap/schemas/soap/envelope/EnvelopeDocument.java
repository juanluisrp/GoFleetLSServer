/*
 * An XML document type.
 * Localname: Envelope
 * Namespace: http://schemas.xmlsoap.org/soap/envelope/
 * Java type: org.xmlsoap.schemas.soap.envelope.EnvelopeDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.soap.envelope;


/**
 * A document containing one Envelope(@http://schemas.xmlsoap.org/soap/envelope/) element.
 *
 * This is a complex type.
 */
public interface EnvelopeDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EnvelopeDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("envelope12a9doctype");
    
    /**
     * Gets the "Envelope" element
     */
    org.xmlsoap.schemas.soap.envelope.Envelope getEnvelope();
    
    /**
     * Sets the "Envelope" element
     */
    void setEnvelope(org.xmlsoap.schemas.soap.envelope.Envelope envelope);
    
    /**
     * Appends and returns a new empty "Envelope" element
     */
    org.xmlsoap.schemas.soap.envelope.Envelope addNewEnvelope();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.xmlsoap.schemas.soap.envelope.EnvelopeDocument newInstance() {
          return (org.xmlsoap.schemas.soap.envelope.EnvelopeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.xmlsoap.schemas.soap.envelope.EnvelopeDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.xmlsoap.schemas.soap.envelope.EnvelopeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.xmlsoap.schemas.soap.envelope.EnvelopeDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.xmlsoap.schemas.soap.envelope.EnvelopeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.xmlsoap.schemas.soap.envelope.EnvelopeDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.xmlsoap.schemas.soap.envelope.EnvelopeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.xmlsoap.schemas.soap.envelope.EnvelopeDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.soap.envelope.EnvelopeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.xmlsoap.schemas.soap.envelope.EnvelopeDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.soap.envelope.EnvelopeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.xmlsoap.schemas.soap.envelope.EnvelopeDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.soap.envelope.EnvelopeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.xmlsoap.schemas.soap.envelope.EnvelopeDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.soap.envelope.EnvelopeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.xmlsoap.schemas.soap.envelope.EnvelopeDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.soap.envelope.EnvelopeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.xmlsoap.schemas.soap.envelope.EnvelopeDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.soap.envelope.EnvelopeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.xmlsoap.schemas.soap.envelope.EnvelopeDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.soap.envelope.EnvelopeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.xmlsoap.schemas.soap.envelope.EnvelopeDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.soap.envelope.EnvelopeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.xmlsoap.schemas.soap.envelope.EnvelopeDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.xmlsoap.schemas.soap.envelope.EnvelopeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.xmlsoap.schemas.soap.envelope.EnvelopeDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.xmlsoap.schemas.soap.envelope.EnvelopeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.xmlsoap.schemas.soap.envelope.EnvelopeDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.xmlsoap.schemas.soap.envelope.EnvelopeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.xmlsoap.schemas.soap.envelope.EnvelopeDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.xmlsoap.schemas.soap.envelope.EnvelopeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.xmlsoap.schemas.soap.envelope.EnvelopeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.xmlsoap.schemas.soap.envelope.EnvelopeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.xmlsoap.schemas.soap.envelope.EnvelopeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.xmlsoap.schemas.soap.envelope.EnvelopeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
