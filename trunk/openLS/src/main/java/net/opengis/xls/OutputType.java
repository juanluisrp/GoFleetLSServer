/*
 * XML Type:  OutputType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.OutputType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls;


/**
 * An XML OutputType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public interface OutputType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OutputType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("outputtype9bd9type");
    
    /**
     * Gets the "BBoxContext" element
     */
    net.opengis.gml.EnvelopeType getBBoxContext();
    
    /**
     * True if has "BBoxContext" element
     */
    boolean isSetBBoxContext();
    
    /**
     * Sets the "BBoxContext" element
     */
    void setBBoxContext(net.opengis.gml.EnvelopeType bBoxContext);
    
    /**
     * Appends and returns a new empty "BBoxContext" element
     */
    net.opengis.gml.EnvelopeType addNewBBoxContext();
    
    /**
     * Unsets the "BBoxContext" element
     */
    void unsetBBoxContext();
    
    /**
     * Gets the "CenterContext" element
     */
    net.opengis.xls.CenterContextType getCenterContext();
    
    /**
     * True if has "CenterContext" element
     */
    boolean isSetCenterContext();
    
    /**
     * Sets the "CenterContext" element
     */
    void setCenterContext(net.opengis.xls.CenterContextType centerContext);
    
    /**
     * Appends and returns a new empty "CenterContext" element
     */
    net.opengis.xls.CenterContextType addNewCenterContext();
    
    /**
     * Unsets the "CenterContext" element
     */
    void unsetCenterContext();
    
    /**
     * Gets the "width" attribute
     */
    java.math.BigInteger getWidth();
    
    /**
     * Gets (as xml) the "width" attribute
     */
    org.apache.xmlbeans.XmlNonNegativeInteger xgetWidth();
    
    /**
     * True if has "width" attribute
     */
    boolean isSetWidth();
    
    /**
     * Sets the "width" attribute
     */
    void setWidth(java.math.BigInteger width);
    
    /**
     * Sets (as xml) the "width" attribute
     */
    void xsetWidth(org.apache.xmlbeans.XmlNonNegativeInteger width);
    
    /**
     * Unsets the "width" attribute
     */
    void unsetWidth();
    
    /**
     * Gets the "height" attribute
     */
    java.math.BigInteger getHeight();
    
    /**
     * Gets (as xml) the "height" attribute
     */
    org.apache.xmlbeans.XmlNonNegativeInteger xgetHeight();
    
    /**
     * True if has "height" attribute
     */
    boolean isSetHeight();
    
    /**
     * Sets the "height" attribute
     */
    void setHeight(java.math.BigInteger height);
    
    /**
     * Sets (as xml) the "height" attribute
     */
    void xsetHeight(org.apache.xmlbeans.XmlNonNegativeInteger height);
    
    /**
     * Unsets the "height" attribute
     */
    void unsetHeight();
    
    /**
     * Gets the "format" attribute
     */
    java.lang.String getFormat();
    
    /**
     * Gets (as xml) the "format" attribute
     */
    org.apache.xmlbeans.XmlString xgetFormat();
    
    /**
     * True if has "format" attribute
     */
    boolean isSetFormat();
    
    /**
     * Sets the "format" attribute
     */
    void setFormat(java.lang.String format);
    
    /**
     * Sets (as xml) the "format" attribute
     */
    void xsetFormat(org.apache.xmlbeans.XmlString format);
    
    /**
     * Unsets the "format" attribute
     */
    void unsetFormat();
    
    /**
     * Gets the "BGcolor" attribute
     */
    java.lang.String getBGcolor();
    
    /**
     * Gets (as xml) the "BGcolor" attribute
     */
    org.apache.xmlbeans.XmlString xgetBGcolor();
    
    /**
     * True if has "BGcolor" attribute
     */
    boolean isSetBGcolor();
    
    /**
     * Sets the "BGcolor" attribute
     */
    void setBGcolor(java.lang.String bGcolor);
    
    /**
     * Sets (as xml) the "BGcolor" attribute
     */
    void xsetBGcolor(org.apache.xmlbeans.XmlString bGcolor);
    
    /**
     * Unsets the "BGcolor" attribute
     */
    void unsetBGcolor();
    
    /**
     * Gets the "transparent" attribute
     */
    boolean getTransparent();
    
    /**
     * Gets (as xml) the "transparent" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetTransparent();
    
    /**
     * True if has "transparent" attribute
     */
    boolean isSetTransparent();
    
    /**
     * Sets the "transparent" attribute
     */
    void setTransparent(boolean transparent);
    
    /**
     * Sets (as xml) the "transparent" attribute
     */
    void xsetTransparent(org.apache.xmlbeans.XmlBoolean transparent);
    
    /**
     * Unsets the "transparent" attribute
     */
    void unsetTransparent();
    
    /**
     * Gets the "content" attribute
     */
    net.opengis.xls.PresentationContentType.Enum getContent();
    
    /**
     * Gets (as xml) the "content" attribute
     */
    net.opengis.xls.PresentationContentType xgetContent();
    
    /**
     * True if has "content" attribute
     */
    boolean isSetContent();
    
    /**
     * Sets the "content" attribute
     */
    void setContent(net.opengis.xls.PresentationContentType.Enum content);
    
    /**
     * Sets (as xml) the "content" attribute
     */
    void xsetContent(net.opengis.xls.PresentationContentType content);
    
    /**
     * Unsets the "content" attribute
     */
    void unsetContent();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.xls.OutputType newInstance() {
          return (net.opengis.xls.OutputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.xls.OutputType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.xls.OutputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.xls.OutputType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.OutputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.xls.OutputType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.OutputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.xls.OutputType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.OutputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.xls.OutputType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.OutputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.xls.OutputType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.OutputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.xls.OutputType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.OutputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.xls.OutputType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.OutputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.xls.OutputType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.OutputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.xls.OutputType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.OutputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.xls.OutputType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.OutputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.xls.OutputType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.OutputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.xls.OutputType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.OutputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.xls.OutputType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.OutputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.xls.OutputType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.OutputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.OutputType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.OutputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.OutputType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.OutputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
