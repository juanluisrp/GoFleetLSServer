/*
 * XML Type:  BuildingLocatorType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.BuildingLocatorType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls;


/**
 * An XML BuildingLocatorType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public interface BuildingLocatorType extends net.opengis.xls.AbstractStreetLocatorType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BuildingLocatorType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("buildinglocatortype012atype");
    
    /**
     * Gets the "number" attribute
     */
    java.lang.String getNumber();
    
    /**
     * Gets (as xml) the "number" attribute
     */
    org.apache.xmlbeans.XmlString xgetNumber();
    
    /**
     * True if has "number" attribute
     */
    boolean isSetNumber();
    
    /**
     * Sets the "number" attribute
     */
    void setNumber(java.lang.String number);
    
    /**
     * Sets (as xml) the "number" attribute
     */
    void xsetNumber(org.apache.xmlbeans.XmlString number);
    
    /**
     * Unsets the "number" attribute
     */
    void unsetNumber();
    
    /**
     * Gets the "subdivision" attribute
     */
    java.lang.String getSubdivision();
    
    /**
     * Gets (as xml) the "subdivision" attribute
     */
    org.apache.xmlbeans.XmlString xgetSubdivision();
    
    /**
     * True if has "subdivision" attribute
     */
    boolean isSetSubdivision();
    
    /**
     * Sets the "subdivision" attribute
     */
    void setSubdivision(java.lang.String subdivision);
    
    /**
     * Sets (as xml) the "subdivision" attribute
     */
    void xsetSubdivision(org.apache.xmlbeans.XmlString subdivision);
    
    /**
     * Unsets the "subdivision" attribute
     */
    void unsetSubdivision();
    
    /**
     * Gets the "buildingName" attribute
     */
    java.lang.String getBuildingName();
    
    /**
     * Gets (as xml) the "buildingName" attribute
     */
    org.apache.xmlbeans.XmlString xgetBuildingName();
    
    /**
     * True if has "buildingName" attribute
     */
    boolean isSetBuildingName();
    
    /**
     * Sets the "buildingName" attribute
     */
    void setBuildingName(java.lang.String buildingName);
    
    /**
     * Sets (as xml) the "buildingName" attribute
     */
    void xsetBuildingName(org.apache.xmlbeans.XmlString buildingName);
    
    /**
     * Unsets the "buildingName" attribute
     */
    void unsetBuildingName();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.xls.BuildingLocatorType newInstance() {
          return (net.opengis.xls.BuildingLocatorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.xls.BuildingLocatorType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.xls.BuildingLocatorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.xls.BuildingLocatorType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.BuildingLocatorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.xls.BuildingLocatorType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.BuildingLocatorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.xls.BuildingLocatorType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.BuildingLocatorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.xls.BuildingLocatorType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.BuildingLocatorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.xls.BuildingLocatorType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.BuildingLocatorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.xls.BuildingLocatorType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.BuildingLocatorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.xls.BuildingLocatorType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.BuildingLocatorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.xls.BuildingLocatorType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.BuildingLocatorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.xls.BuildingLocatorType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.BuildingLocatorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.xls.BuildingLocatorType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.BuildingLocatorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.xls.BuildingLocatorType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.BuildingLocatorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.xls.BuildingLocatorType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.BuildingLocatorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.xls.BuildingLocatorType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.BuildingLocatorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.xls.BuildingLocatorType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.BuildingLocatorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.BuildingLocatorType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.BuildingLocatorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.BuildingLocatorType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.BuildingLocatorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
