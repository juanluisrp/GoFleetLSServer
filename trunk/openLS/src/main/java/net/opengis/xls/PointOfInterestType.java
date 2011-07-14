/*
 * XML Type:  PointOfInterestType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.PointOfInterestType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls;


/**
 * An XML PointOfInterestType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public interface PointOfInterestType extends net.opengis.xls.AbstractPOIType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PointOfInterestType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("pointofinteresttype8ebbtype");
    
    /**
     * Gets the "POIAttributeList" element
     */
    net.opengis.xls.POIAttributeListType getPOIAttributeList();
    
    /**
     * True if has "POIAttributeList" element
     */
    boolean isSetPOIAttributeList();
    
    /**
     * Sets the "POIAttributeList" element
     */
    void setPOIAttributeList(net.opengis.xls.POIAttributeListType poiAttributeList);
    
    /**
     * Appends and returns a new empty "POIAttributeList" element
     */
    net.opengis.xls.POIAttributeListType addNewPOIAttributeList();
    
    /**
     * Unsets the "POIAttributeList" element
     */
    void unsetPOIAttributeList();
    
    /**
     * Gets the "Point" element
     */
    net.opengis.gml.PointType getPoint();
    
    /**
     * True if has "Point" element
     */
    boolean isSetPoint();
    
    /**
     * Sets the "Point" element
     */
    void setPoint(net.opengis.gml.PointType point);
    
    /**
     * Appends and returns a new empty "Point" element
     */
    net.opengis.gml.PointType addNewPoint();
    
    /**
     * Unsets the "Point" element
     */
    void unsetPoint();
    
    /**
     * Gets the "Address" element
     */
    net.opengis.xls.AddressType getAddress();
    
    /**
     * True if has "Address" element
     */
    boolean isSetAddress();
    
    /**
     * Sets the "Address" element
     */
    void setAddress(net.opengis.xls.AddressType address);
    
    /**
     * Appends and returns a new empty "Address" element
     */
    net.opengis.xls.AddressType addNewAddress();
    
    /**
     * Unsets the "Address" element
     */
    void unsetAddress();
    
    /**
     * Gets the "ID" attribute
     */
    java.lang.String getID();
    
    /**
     * Gets (as xml) the "ID" attribute
     */
    org.apache.xmlbeans.XmlString xgetID();
    
    /**
     * Sets the "ID" attribute
     */
    void setID(java.lang.String id);
    
    /**
     * Sets (as xml) the "ID" attribute
     */
    void xsetID(org.apache.xmlbeans.XmlString id);
    
    /**
     * Gets the "POIName" attribute
     */
    java.lang.String getPOIName();
    
    /**
     * Gets (as xml) the "POIName" attribute
     */
    org.apache.xmlbeans.XmlString xgetPOIName();
    
    /**
     * True if has "POIName" attribute
     */
    boolean isSetPOIName();
    
    /**
     * Sets the "POIName" attribute
     */
    void setPOIName(java.lang.String poiName);
    
    /**
     * Sets (as xml) the "POIName" attribute
     */
    void xsetPOIName(org.apache.xmlbeans.XmlString poiName);
    
    /**
     * Unsets the "POIName" attribute
     */
    void unsetPOIName();
    
    /**
     * Gets the "phoneNumber" attribute
     */
    java.lang.String getPhoneNumber();
    
    /**
     * Gets (as xml) the "phoneNumber" attribute
     */
    org.apache.xmlbeans.XmlString xgetPhoneNumber();
    
    /**
     * True if has "phoneNumber" attribute
     */
    boolean isSetPhoneNumber();
    
    /**
     * Sets the "phoneNumber" attribute
     */
    void setPhoneNumber(java.lang.String phoneNumber);
    
    /**
     * Sets (as xml) the "phoneNumber" attribute
     */
    void xsetPhoneNumber(org.apache.xmlbeans.XmlString phoneNumber);
    
    /**
     * Unsets the "phoneNumber" attribute
     */
    void unsetPhoneNumber();
    
    /**
     * Gets the "description" attribute
     */
    java.lang.String getDescription();
    
    /**
     * Gets (as xml) the "description" attribute
     */
    org.apache.xmlbeans.XmlString xgetDescription();
    
    /**
     * True if has "description" attribute
     */
    boolean isSetDescription();
    
    /**
     * Sets the "description" attribute
     */
    void setDescription(java.lang.String description);
    
    /**
     * Sets (as xml) the "description" attribute
     */
    void xsetDescription(org.apache.xmlbeans.XmlString description);
    
    /**
     * Unsets the "description" attribute
     */
    void unsetDescription();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.xls.PointOfInterestType newInstance() {
          return (net.opengis.xls.PointOfInterestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.xls.PointOfInterestType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.xls.PointOfInterestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.xls.PointOfInterestType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.PointOfInterestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.xls.PointOfInterestType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.PointOfInterestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.xls.PointOfInterestType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.PointOfInterestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.xls.PointOfInterestType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.PointOfInterestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.xls.PointOfInterestType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.PointOfInterestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.xls.PointOfInterestType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.PointOfInterestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.xls.PointOfInterestType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.PointOfInterestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.xls.PointOfInterestType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.PointOfInterestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.xls.PointOfInterestType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.PointOfInterestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.xls.PointOfInterestType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.PointOfInterestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.xls.PointOfInterestType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.PointOfInterestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.xls.PointOfInterestType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.PointOfInterestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.xls.PointOfInterestType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.PointOfInterestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.xls.PointOfInterestType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.PointOfInterestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.PointOfInterestType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.PointOfInterestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.PointOfInterestType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.PointOfInterestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
