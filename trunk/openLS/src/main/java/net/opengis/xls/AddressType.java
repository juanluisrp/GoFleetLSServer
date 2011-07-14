/*
 * XML Type:  AddressType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.AddressType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls;


/**
 * An XML AddressType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public interface AddressType extends net.opengis.xls.AbstractAddressType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AddressType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("addresstyped738type");
    
    /**
     * Gets the "freeFormAddress" element
     */
    java.lang.String getFreeFormAddress();
    
    /**
     * Gets (as xml) the "freeFormAddress" element
     */
    org.apache.xmlbeans.XmlString xgetFreeFormAddress();
    
    /**
     * True if has "freeFormAddress" element
     */
    boolean isSetFreeFormAddress();
    
    /**
     * Sets the "freeFormAddress" element
     */
    void setFreeFormAddress(java.lang.String freeFormAddress);
    
    /**
     * Sets (as xml) the "freeFormAddress" element
     */
    void xsetFreeFormAddress(org.apache.xmlbeans.XmlString freeFormAddress);
    
    /**
     * Unsets the "freeFormAddress" element
     */
    void unsetFreeFormAddress();
    
    /**
     * Gets the "StreetAddress" element
     */
    net.opengis.xls.StreetAddressType getStreetAddress();
    
    /**
     * True if has "StreetAddress" element
     */
    boolean isSetStreetAddress();
    
    /**
     * Sets the "StreetAddress" element
     */
    void setStreetAddress(net.opengis.xls.StreetAddressType streetAddress);
    
    /**
     * Appends and returns a new empty "StreetAddress" element
     */
    net.opengis.xls.StreetAddressType addNewStreetAddress();
    
    /**
     * Unsets the "StreetAddress" element
     */
    void unsetStreetAddress();
    
    /**
     * Gets array of all "Place" elements
     */
    net.opengis.xls.NamedPlaceType[] getPlaceArray();
    
    /**
     * Gets ith "Place" element
     */
    net.opengis.xls.NamedPlaceType getPlaceArray(int i);
    
    /**
     * Returns number of "Place" element
     */
    int sizeOfPlaceArray();
    
    /**
     * Sets array of all "Place" element
     */
    void setPlaceArray(net.opengis.xls.NamedPlaceType[] placeArray);
    
    /**
     * Sets ith "Place" element
     */
    void setPlaceArray(int i, net.opengis.xls.NamedPlaceType place);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Place" element
     */
    net.opengis.xls.NamedPlaceType insertNewPlace(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Place" element
     */
    net.opengis.xls.NamedPlaceType addNewPlace();
    
    /**
     * Removes the ith "Place" element
     */
    void removePlace(int i);
    
    /**
     * Gets the "PostalCode" element
     */
    java.lang.String getPostalCode();
    
    /**
     * Gets (as xml) the "PostalCode" element
     */
    net.opengis.xls.PostalCodeType xgetPostalCode();
    
    /**
     * True if has "PostalCode" element
     */
    boolean isSetPostalCode();
    
    /**
     * Sets the "PostalCode" element
     */
    void setPostalCode(java.lang.String postalCode);
    
    /**
     * Sets (as xml) the "PostalCode" element
     */
    void xsetPostalCode(net.opengis.xls.PostalCodeType postalCode);
    
    /**
     * Unsets the "PostalCode" element
     */
    void unsetPostalCode();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.xls.AddressType newInstance() {
          return (net.opengis.xls.AddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.xls.AddressType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.xls.AddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.xls.AddressType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.xls.AddressType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.xls.AddressType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.xls.AddressType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.xls.AddressType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.xls.AddressType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.xls.AddressType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.xls.AddressType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.xls.AddressType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.xls.AddressType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.xls.AddressType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.xls.AddressType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.xls.AddressType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.xls.AddressType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.AddressType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.AddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.AddressType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.AddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
