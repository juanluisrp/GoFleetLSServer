/*
 * XML Type:  ReverseGeocodeResponseType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.ReverseGeocodeResponseType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls;


/**
 * An XML ReverseGeocodeResponseType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public interface ReverseGeocodeResponseType extends net.opengis.xls.AbstractResponseParametersType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReverseGeocodeResponseType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("reversegeocoderesponsetype3f7dtype");
    
    /**
     * Gets array of all "ReverseGeocodedLocation" elements
     */
    net.opengis.xls.ReverseGeocodedLocationType[] getReverseGeocodedLocationArray();
    
    /**
     * Gets ith "ReverseGeocodedLocation" element
     */
    net.opengis.xls.ReverseGeocodedLocationType getReverseGeocodedLocationArray(int i);
    
    /**
     * Returns number of "ReverseGeocodedLocation" element
     */
    int sizeOfReverseGeocodedLocationArray();
    
    /**
     * Sets array of all "ReverseGeocodedLocation" element
     */
    void setReverseGeocodedLocationArray(net.opengis.xls.ReverseGeocodedLocationType[] reverseGeocodedLocationArray);
    
    /**
     * Sets ith "ReverseGeocodedLocation" element
     */
    void setReverseGeocodedLocationArray(int i, net.opengis.xls.ReverseGeocodedLocationType reverseGeocodedLocation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ReverseGeocodedLocation" element
     */
    net.opengis.xls.ReverseGeocodedLocationType insertNewReverseGeocodedLocation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ReverseGeocodedLocation" element
     */
    net.opengis.xls.ReverseGeocodedLocationType addNewReverseGeocodedLocation();
    
    /**
     * Removes the ith "ReverseGeocodedLocation" element
     */
    void removeReverseGeocodedLocation(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.xls.ReverseGeocodeResponseType newInstance() {
          return (net.opengis.xls.ReverseGeocodeResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.xls.ReverseGeocodeResponseType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.xls.ReverseGeocodeResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.xls.ReverseGeocodeResponseType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.ReverseGeocodeResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.xls.ReverseGeocodeResponseType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.ReverseGeocodeResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.xls.ReverseGeocodeResponseType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ReverseGeocodeResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.xls.ReverseGeocodeResponseType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ReverseGeocodeResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.xls.ReverseGeocodeResponseType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ReverseGeocodeResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.xls.ReverseGeocodeResponseType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ReverseGeocodeResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.xls.ReverseGeocodeResponseType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ReverseGeocodeResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.xls.ReverseGeocodeResponseType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ReverseGeocodeResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.xls.ReverseGeocodeResponseType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ReverseGeocodeResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.xls.ReverseGeocodeResponseType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ReverseGeocodeResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.xls.ReverseGeocodeResponseType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.ReverseGeocodeResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.xls.ReverseGeocodeResponseType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.ReverseGeocodeResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.xls.ReverseGeocodeResponseType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.ReverseGeocodeResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.xls.ReverseGeocodeResponseType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.ReverseGeocodeResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.ReverseGeocodeResponseType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.ReverseGeocodeResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.ReverseGeocodeResponseType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.ReverseGeocodeResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
