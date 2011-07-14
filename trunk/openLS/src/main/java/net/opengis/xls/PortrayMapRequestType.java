/*
 * XML Type:  PortrayMapRequestType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.PortrayMapRequestType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls;


/**
 * An XML PortrayMapRequestType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public interface PortrayMapRequestType extends net.opengis.xls.AbstractRequestParametersType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PortrayMapRequestType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("portraymaprequesttype6c70type");
    
    /**
     * Gets array of all "Output" elements
     */
    net.opengis.xls.OutputType[] getOutputArray();
    
    /**
     * Gets ith "Output" element
     */
    net.opengis.xls.OutputType getOutputArray(int i);
    
    /**
     * Returns number of "Output" element
     */
    int sizeOfOutputArray();
    
    /**
     * Sets array of all "Output" element
     */
    void setOutputArray(net.opengis.xls.OutputType[] outputArray);
    
    /**
     * Sets ith "Output" element
     */
    void setOutputArray(int i, net.opengis.xls.OutputType output);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Output" element
     */
    net.opengis.xls.OutputType insertNewOutput(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Output" element
     */
    net.opengis.xls.OutputType addNewOutput();
    
    /**
     * Removes the ith "Output" element
     */
    void removeOutput(int i);
    
    /**
     * Gets the "Basemap" element
     */
    net.opengis.xls.LayerType getBasemap();
    
    /**
     * True if has "Basemap" element
     */
    boolean isSetBasemap();
    
    /**
     * Sets the "Basemap" element
     */
    void setBasemap(net.opengis.xls.LayerType basemap);
    
    /**
     * Appends and returns a new empty "Basemap" element
     */
    net.opengis.xls.LayerType addNewBasemap();
    
    /**
     * Unsets the "Basemap" element
     */
    void unsetBasemap();
    
    /**
     * Gets array of all "Overlay" elements
     */
    net.opengis.xls.OverlayType[] getOverlayArray();
    
    /**
     * Gets ith "Overlay" element
     */
    net.opengis.xls.OverlayType getOverlayArray(int i);
    
    /**
     * Returns number of "Overlay" element
     */
    int sizeOfOverlayArray();
    
    /**
     * Sets array of all "Overlay" element
     */
    void setOverlayArray(net.opengis.xls.OverlayType[] overlayArray);
    
    /**
     * Sets ith "Overlay" element
     */
    void setOverlayArray(int i, net.opengis.xls.OverlayType overlay);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Overlay" element
     */
    net.opengis.xls.OverlayType insertNewOverlay(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Overlay" element
     */
    net.opengis.xls.OverlayType addNewOverlay();
    
    /**
     * Removes the ith "Overlay" element
     */
    void removeOverlay(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.xls.PortrayMapRequestType newInstance() {
          return (net.opengis.xls.PortrayMapRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.xls.PortrayMapRequestType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.xls.PortrayMapRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.xls.PortrayMapRequestType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.PortrayMapRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.xls.PortrayMapRequestType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.PortrayMapRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.xls.PortrayMapRequestType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.PortrayMapRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.xls.PortrayMapRequestType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.PortrayMapRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.xls.PortrayMapRequestType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.PortrayMapRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.xls.PortrayMapRequestType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.PortrayMapRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.xls.PortrayMapRequestType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.PortrayMapRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.xls.PortrayMapRequestType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.PortrayMapRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.xls.PortrayMapRequestType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.PortrayMapRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.xls.PortrayMapRequestType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.PortrayMapRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.xls.PortrayMapRequestType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.PortrayMapRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.xls.PortrayMapRequestType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.PortrayMapRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.xls.PortrayMapRequestType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.PortrayMapRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.xls.PortrayMapRequestType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.PortrayMapRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.PortrayMapRequestType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.PortrayMapRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.PortrayMapRequestType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.PortrayMapRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
