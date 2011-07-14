/*
 * XML Type:  POIPropertiesType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.POIPropertiesType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls;


/**
 * An XML POIPropertiesType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public interface POIPropertiesType extends net.opengis.xls.AbstractPOISelectionCriteriaType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(POIPropertiesType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("poipropertiestyped02ftype");
    
    /**
     * Gets array of all "_POIProperty" elements
     */
    org.apache.xmlbeans.XmlObject[] getPOIPropertyArray();
    
    /**
     * Gets ith "_POIProperty" element
     */
    org.apache.xmlbeans.XmlObject getPOIPropertyArray(int i);
    
    /**
     * Returns number of "_POIProperty" element
     */
    int sizeOfPOIPropertyArray();
    
    /**
     * Sets array of all "_POIProperty" element
     */
    void setPOIPropertyArray(org.apache.xmlbeans.XmlObject[] poiPropertyArray);
    
    /**
     * Sets ith "_POIProperty" element
     */
    void setPOIPropertyArray(int i, org.apache.xmlbeans.XmlObject poiProperty);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "_POIProperty" element
     */
    org.apache.xmlbeans.XmlObject insertNewPOIProperty(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "_POIProperty" element
     */
    org.apache.xmlbeans.XmlObject addNewPOIProperty();
    
    /**
     * Removes the ith "_POIProperty" element
     */
    void removePOIProperty(int i);
    
    /**
     * Gets the "directoryType" attribute
     */
    java.lang.String getDirectoryType();
    
    /**
     * Gets (as xml) the "directoryType" attribute
     */
    org.apache.xmlbeans.XmlString xgetDirectoryType();
    
    /**
     * True if has "directoryType" attribute
     */
    boolean isSetDirectoryType();
    
    /**
     * Sets the "directoryType" attribute
     */
    void setDirectoryType(java.lang.String directoryType);
    
    /**
     * Sets (as xml) the "directoryType" attribute
     */
    void xsetDirectoryType(org.apache.xmlbeans.XmlString directoryType);
    
    /**
     * Unsets the "directoryType" attribute
     */
    void unsetDirectoryType();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.xls.POIPropertiesType newInstance() {
          return (net.opengis.xls.POIPropertiesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.xls.POIPropertiesType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.xls.POIPropertiesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.xls.POIPropertiesType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.POIPropertiesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.xls.POIPropertiesType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.POIPropertiesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.xls.POIPropertiesType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.POIPropertiesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.xls.POIPropertiesType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.POIPropertiesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.xls.POIPropertiesType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.POIPropertiesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.xls.POIPropertiesType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.POIPropertiesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.xls.POIPropertiesType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.POIPropertiesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.xls.POIPropertiesType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.POIPropertiesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.xls.POIPropertiesType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.POIPropertiesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.xls.POIPropertiesType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.POIPropertiesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.xls.POIPropertiesType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.POIPropertiesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.xls.POIPropertiesType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.POIPropertiesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.xls.POIPropertiesType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.POIPropertiesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.xls.POIPropertiesType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.POIPropertiesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.POIPropertiesType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.POIPropertiesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.POIPropertiesType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.POIPropertiesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
