/*
 * XML Type:  StreetAddressType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.StreetAddressType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls;


/**
 * An XML StreetAddressType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public interface StreetAddressType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StreetAddressType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("streetaddresstypebe5btype");
    
    /**
     * Gets the "_StreetLocation" element
     */
    net.opengis.xls.AbstractStreetLocatorType getStreetLocation();
    
    /**
     * True if has "_StreetLocation" element
     */
    boolean isSetStreetLocation();
    
    /**
     * Sets the "_StreetLocation" element
     */
    void setStreetLocation(net.opengis.xls.AbstractStreetLocatorType streetLocation);
    
    /**
     * Appends and returns a new empty "_StreetLocation" element
     */
    net.opengis.xls.AbstractStreetLocatorType addNewStreetLocation();
    
    /**
     * Unsets the "_StreetLocation" element
     */
    void unsetStreetLocation();
    
    /**
     * Gets array of all "Street" elements
     */
    net.opengis.xls.StreetNameType[] getStreetArray();
    
    /**
     * Gets ith "Street" element
     */
    net.opengis.xls.StreetNameType getStreetArray(int i);
    
    /**
     * Returns number of "Street" element
     */
    int sizeOfStreetArray();
    
    /**
     * Sets array of all "Street" element
     */
    void setStreetArray(net.opengis.xls.StreetNameType[] streetArray);
    
    /**
     * Sets ith "Street" element
     */
    void setStreetArray(int i, net.opengis.xls.StreetNameType street);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Street" element
     */
    net.opengis.xls.StreetNameType insertNewStreet(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Street" element
     */
    net.opengis.xls.StreetNameType addNewStreet();
    
    /**
     * Removes the ith "Street" element
     */
    void removeStreet(int i);
    
    /**
     * Gets the "locator" attribute
     */
    org.apache.xmlbeans.XmlAnySimpleType getLocator();
    
    /**
     * True if has "locator" attribute
     */
    boolean isSetLocator();
    
    /**
     * Sets the "locator" attribute
     */
    void setLocator(org.apache.xmlbeans.XmlAnySimpleType locator);
    
    /**
     * Appends and returns a new empty "locator" attribute
     */
    org.apache.xmlbeans.XmlAnySimpleType addNewLocator();
    
    /**
     * Unsets the "locator" attribute
     */
    void unsetLocator();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.xls.StreetAddressType newInstance() {
          return (net.opengis.xls.StreetAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.xls.StreetAddressType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.xls.StreetAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.xls.StreetAddressType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.StreetAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.xls.StreetAddressType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.StreetAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.xls.StreetAddressType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.StreetAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.xls.StreetAddressType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.StreetAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.xls.StreetAddressType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.StreetAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.xls.StreetAddressType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.StreetAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.xls.StreetAddressType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.StreetAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.xls.StreetAddressType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.StreetAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.xls.StreetAddressType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.StreetAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.xls.StreetAddressType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.StreetAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.xls.StreetAddressType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.StreetAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.xls.StreetAddressType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.StreetAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.xls.StreetAddressType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.StreetAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.xls.StreetAddressType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.StreetAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.StreetAddressType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.StreetAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.StreetAddressType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.StreetAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
