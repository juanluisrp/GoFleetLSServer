/*
 * XML Type:  ReverseGeocodeRequestType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.ReverseGeocodeRequestType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls;


/**
 * An XML ReverseGeocodeRequestType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public interface ReverseGeocodeRequestType extends net.opengis.xls.AbstractRequestParametersType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReverseGeocodeRequestType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("reversegeocoderequesttype5819type");
    
    /**
     * Gets the "Position" element
     */
    net.opengis.xls.PositionType getPosition();
    
    /**
     * Sets the "Position" element
     */
    void setPosition(net.opengis.xls.PositionType position);
    
    /**
     * Appends and returns a new empty "Position" element
     */
    net.opengis.xls.PositionType addNewPosition();
    
    /**
     * Gets array of all "ReverseGeocodePreference" elements
     */
    net.opengis.xls.ReverseGeocodePreferenceType.Enum[] getReverseGeocodePreferenceArray();
    
    /**
     * Gets ith "ReverseGeocodePreference" element
     */
    net.opengis.xls.ReverseGeocodePreferenceType.Enum getReverseGeocodePreferenceArray(int i);
    
    /**
     * Gets (as xml) array of all "ReverseGeocodePreference" elements
     */
    net.opengis.xls.ReverseGeocodePreferenceType[] xgetReverseGeocodePreferenceArray();
    
    /**
     * Gets (as xml) ith "ReverseGeocodePreference" element
     */
    net.opengis.xls.ReverseGeocodePreferenceType xgetReverseGeocodePreferenceArray(int i);
    
    /**
     * Returns number of "ReverseGeocodePreference" element
     */
    int sizeOfReverseGeocodePreferenceArray();
    
    /**
     * Sets array of all "ReverseGeocodePreference" element
     */
    void setReverseGeocodePreferenceArray(net.opengis.xls.ReverseGeocodePreferenceType.Enum[] reverseGeocodePreferenceArray);
    
    /**
     * Sets ith "ReverseGeocodePreference" element
     */
    void setReverseGeocodePreferenceArray(int i, net.opengis.xls.ReverseGeocodePreferenceType.Enum reverseGeocodePreference);
    
    /**
     * Sets (as xml) array of all "ReverseGeocodePreference" element
     */
    void xsetReverseGeocodePreferenceArray(net.opengis.xls.ReverseGeocodePreferenceType[] reverseGeocodePreferenceArray);
    
    /**
     * Sets (as xml) ith "ReverseGeocodePreference" element
     */
    void xsetReverseGeocodePreferenceArray(int i, net.opengis.xls.ReverseGeocodePreferenceType reverseGeocodePreference);
    
    /**
     * Inserts the value as the ith "ReverseGeocodePreference" element
     */
    void insertReverseGeocodePreference(int i, net.opengis.xls.ReverseGeocodePreferenceType.Enum reverseGeocodePreference);
    
    /**
     * Appends the value as the last "ReverseGeocodePreference" element
     */
    void addReverseGeocodePreference(net.opengis.xls.ReverseGeocodePreferenceType.Enum reverseGeocodePreference);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ReverseGeocodePreference" element
     */
    net.opengis.xls.ReverseGeocodePreferenceType insertNewReverseGeocodePreference(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ReverseGeocodePreference" element
     */
    net.opengis.xls.ReverseGeocodePreferenceType addNewReverseGeocodePreference();
    
    /**
     * Removes the ith "ReverseGeocodePreference" element
     */
    void removeReverseGeocodePreference(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.xls.ReverseGeocodeRequestType newInstance() {
          return (net.opengis.xls.ReverseGeocodeRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.xls.ReverseGeocodeRequestType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.xls.ReverseGeocodeRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.xls.ReverseGeocodeRequestType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.ReverseGeocodeRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.xls.ReverseGeocodeRequestType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.ReverseGeocodeRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.xls.ReverseGeocodeRequestType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ReverseGeocodeRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.xls.ReverseGeocodeRequestType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ReverseGeocodeRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.xls.ReverseGeocodeRequestType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ReverseGeocodeRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.xls.ReverseGeocodeRequestType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ReverseGeocodeRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.xls.ReverseGeocodeRequestType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ReverseGeocodeRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.xls.ReverseGeocodeRequestType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ReverseGeocodeRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.xls.ReverseGeocodeRequestType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ReverseGeocodeRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.xls.ReverseGeocodeRequestType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ReverseGeocodeRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.xls.ReverseGeocodeRequestType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.ReverseGeocodeRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.xls.ReverseGeocodeRequestType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.ReverseGeocodeRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.xls.ReverseGeocodeRequestType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.ReverseGeocodeRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.xls.ReverseGeocodeRequestType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.ReverseGeocodeRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.ReverseGeocodeRequestType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.ReverseGeocodeRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.ReverseGeocodeRequestType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.ReverseGeocodeRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
