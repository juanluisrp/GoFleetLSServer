/*
 * XML Type:  AbstractRouteSegmentType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.AbstractRouteSegmentType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls;


/**
 * An XML AbstractRouteSegmentType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public interface AbstractRouteSegmentType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AbstractRouteSegmentType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("abstractroutesegmenttype714etype");
    
    /**
     * Gets the "Distance" element
     */
    net.opengis.xls.DistanceType getDistance();
    
    /**
     * Sets the "Distance" element
     */
    void setDistance(net.opengis.xls.DistanceType distance);
    
    /**
     * Appends and returns a new empty "Distance" element
     */
    net.opengis.xls.DistanceType addNewDistance();
    
    /**
     * Gets the "TravelTime" element
     */
    org.apache.xmlbeans.GDuration getTravelTime();
    
    /**
     * Gets (as xml) the "TravelTime" element
     */
    org.apache.xmlbeans.XmlDuration xgetTravelTime();
    
    /**
     * Sets the "TravelTime" element
     */
    void setTravelTime(org.apache.xmlbeans.GDuration travelTime);
    
    /**
     * Sets (as xml) the "TravelTime" element
     */
    void xsetTravelTime(org.apache.xmlbeans.XmlDuration travelTime);
    
    /**
     * Gets the "BoundingBox" element
     */
    net.opengis.gml.EnvelopeType getBoundingBox();
    
    /**
     * Sets the "BoundingBox" element
     */
    void setBoundingBox(net.opengis.gml.EnvelopeType boundingBox);
    
    /**
     * Appends and returns a new empty "BoundingBox" element
     */
    net.opengis.gml.EnvelopeType addNewBoundingBox();
    
    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * True if has "name" attribute
     */
    boolean isSetName();
    
    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Unsets the "name" attribute
     */
    void unsetName();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        public static net.opengis.xls.AbstractRouteSegmentType newInstance() {
          return (net.opengis.xls.AbstractRouteSegmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        public static net.opengis.xls.AbstractRouteSegmentType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.xls.AbstractRouteSegmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.xls.AbstractRouteSegmentType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AbstractRouteSegmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.xls.AbstractRouteSegmentType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AbstractRouteSegmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.xls.AbstractRouteSegmentType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AbstractRouteSegmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.xls.AbstractRouteSegmentType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AbstractRouteSegmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.xls.AbstractRouteSegmentType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AbstractRouteSegmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.xls.AbstractRouteSegmentType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AbstractRouteSegmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.xls.AbstractRouteSegmentType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AbstractRouteSegmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.xls.AbstractRouteSegmentType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AbstractRouteSegmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.xls.AbstractRouteSegmentType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AbstractRouteSegmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.xls.AbstractRouteSegmentType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AbstractRouteSegmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.xls.AbstractRouteSegmentType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AbstractRouteSegmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.xls.AbstractRouteSegmentType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AbstractRouteSegmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.xls.AbstractRouteSegmentType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AbstractRouteSegmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.xls.AbstractRouteSegmentType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AbstractRouteSegmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.AbstractRouteSegmentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.AbstractRouteSegmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.AbstractRouteSegmentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.AbstractRouteSegmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
