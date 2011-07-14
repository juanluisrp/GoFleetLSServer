/*
 * XML Type:  StreetNameType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.StreetNameType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls;


/**
 * An XML StreetNameType(@http://www.opengis.net/xls).
 *
 * This is an atomic type that is a restriction of net.opengis.xls.StreetNameType.
 */
public interface StreetNameType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StreetNameType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("streetnametype868ctype");
    
    /**
     * Gets the "directionalPrefix" attribute
     */
    java.lang.String getDirectionalPrefix();
    
    /**
     * Gets (as xml) the "directionalPrefix" attribute
     */
    org.apache.xmlbeans.XmlString xgetDirectionalPrefix();
    
    /**
     * True if has "directionalPrefix" attribute
     */
    boolean isSetDirectionalPrefix();
    
    /**
     * Sets the "directionalPrefix" attribute
     */
    void setDirectionalPrefix(java.lang.String directionalPrefix);
    
    /**
     * Sets (as xml) the "directionalPrefix" attribute
     */
    void xsetDirectionalPrefix(org.apache.xmlbeans.XmlString directionalPrefix);
    
    /**
     * Unsets the "directionalPrefix" attribute
     */
    void unsetDirectionalPrefix();
    
    /**
     * Gets the "typePrefix" attribute
     */
    java.lang.String getTypePrefix();
    
    /**
     * Gets (as xml) the "typePrefix" attribute
     */
    org.apache.xmlbeans.XmlString xgetTypePrefix();
    
    /**
     * True if has "typePrefix" attribute
     */
    boolean isSetTypePrefix();
    
    /**
     * Sets the "typePrefix" attribute
     */
    void setTypePrefix(java.lang.String typePrefix);
    
    /**
     * Sets (as xml) the "typePrefix" attribute
     */
    void xsetTypePrefix(org.apache.xmlbeans.XmlString typePrefix);
    
    /**
     * Unsets the "typePrefix" attribute
     */
    void unsetTypePrefix();
    
    /**
     * Gets the "officialName" attribute
     */
    java.lang.String getOfficialName();
    
    /**
     * Gets (as xml) the "officialName" attribute
     */
    org.apache.xmlbeans.XmlString xgetOfficialName();
    
    /**
     * True if has "officialName" attribute
     */
    boolean isSetOfficialName();
    
    /**
     * Sets the "officialName" attribute
     */
    void setOfficialName(java.lang.String officialName);
    
    /**
     * Sets (as xml) the "officialName" attribute
     */
    void xsetOfficialName(org.apache.xmlbeans.XmlString officialName);
    
    /**
     * Unsets the "officialName" attribute
     */
    void unsetOfficialName();
    
    /**
     * Gets the "typeSuffix" attribute
     */
    java.lang.String getTypeSuffix();
    
    /**
     * Gets (as xml) the "typeSuffix" attribute
     */
    org.apache.xmlbeans.XmlString xgetTypeSuffix();
    
    /**
     * True if has "typeSuffix" attribute
     */
    boolean isSetTypeSuffix();
    
    /**
     * Sets the "typeSuffix" attribute
     */
    void setTypeSuffix(java.lang.String typeSuffix);
    
    /**
     * Sets (as xml) the "typeSuffix" attribute
     */
    void xsetTypeSuffix(org.apache.xmlbeans.XmlString typeSuffix);
    
    /**
     * Unsets the "typeSuffix" attribute
     */
    void unsetTypeSuffix();
    
    /**
     * Gets the "directionalSuffix" attribute
     */
    java.lang.String getDirectionalSuffix();
    
    /**
     * Gets (as xml) the "directionalSuffix" attribute
     */
    org.apache.xmlbeans.XmlString xgetDirectionalSuffix();
    
    /**
     * True if has "directionalSuffix" attribute
     */
    boolean isSetDirectionalSuffix();
    
    /**
     * Sets the "directionalSuffix" attribute
     */
    void setDirectionalSuffix(java.lang.String directionalSuffix);
    
    /**
     * Sets (as xml) the "directionalSuffix" attribute
     */
    void xsetDirectionalSuffix(org.apache.xmlbeans.XmlString directionalSuffix);
    
    /**
     * Unsets the "directionalSuffix" attribute
     */
    void unsetDirectionalSuffix();
    
    /**
     * Gets the "muniOctant" attribute
     */
    net.opengis.gml.CompassPointEnumeration.Enum getMuniOctant();
    
    /**
     * Gets (as xml) the "muniOctant" attribute
     */
    net.opengis.gml.CompassPointEnumeration xgetMuniOctant();
    
    /**
     * True if has "muniOctant" attribute
     */
    boolean isSetMuniOctant();
    
    /**
     * Sets the "muniOctant" attribute
     */
    void setMuniOctant(net.opengis.gml.CompassPointEnumeration.Enum muniOctant);
    
    /**
     * Sets (as xml) the "muniOctant" attribute
     */
    void xsetMuniOctant(net.opengis.gml.CompassPointEnumeration muniOctant);
    
    /**
     * Unsets the "muniOctant" attribute
     */
    void unsetMuniOctant();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.xls.StreetNameType newInstance() {
          return (net.opengis.xls.StreetNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.xls.StreetNameType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.xls.StreetNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.xls.StreetNameType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.StreetNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.xls.StreetNameType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.StreetNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.xls.StreetNameType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.StreetNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.xls.StreetNameType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.StreetNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.xls.StreetNameType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.StreetNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.xls.StreetNameType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.StreetNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.xls.StreetNameType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.StreetNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.xls.StreetNameType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.StreetNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.xls.StreetNameType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.StreetNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.xls.StreetNameType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.StreetNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.xls.StreetNameType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.StreetNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.xls.StreetNameType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.StreetNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.xls.StreetNameType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.StreetNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.xls.StreetNameType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.StreetNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.StreetNameType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.StreetNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.StreetNameType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.StreetNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
