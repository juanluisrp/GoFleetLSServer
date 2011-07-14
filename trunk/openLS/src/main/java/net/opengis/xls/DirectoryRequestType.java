/*
 * XML Type:  DirectoryRequestType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.DirectoryRequestType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls;


/**
 * An XML DirectoryRequestType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public interface DirectoryRequestType extends net.opengis.xls.AbstractRequestParametersType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DirectoryRequestType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("directoryrequesttypeb098type");
    
    /**
     * Gets the "POILocation" element
     */
    net.opengis.xls.POILocationType getPOILocation();
    
    /**
     * True if has "POILocation" element
     */
    boolean isSetPOILocation();
    
    /**
     * Sets the "POILocation" element
     */
    void setPOILocation(net.opengis.xls.POILocationType poiLocation);
    
    /**
     * Appends and returns a new empty "POILocation" element
     */
    net.opengis.xls.POILocationType addNewPOILocation();
    
    /**
     * Unsets the "POILocation" element
     */
    void unsetPOILocation();
    
    /**
     * Gets the "_POISelectionCriteria" element
     */
    net.opengis.xls.AbstractPOISelectionCriteriaType getPOISelectionCriteria();
    
    /**
     * Sets the "_POISelectionCriteria" element
     */
    void setPOISelectionCriteria(net.opengis.xls.AbstractPOISelectionCriteriaType poiSelectionCriteria);
    
    /**
     * Appends and returns a new empty "_POISelectionCriteria" element
     */
    net.opengis.xls.AbstractPOISelectionCriteriaType addNewPOISelectionCriteria();
    
    /**
     * Gets the "sortCriteria" attribute
     */
    java.lang.String getSortCriteria();
    
    /**
     * Gets (as xml) the "sortCriteria" attribute
     */
    org.apache.xmlbeans.XmlString xgetSortCriteria();
    
    /**
     * True if has "sortCriteria" attribute
     */
    boolean isSetSortCriteria();
    
    /**
     * Sets the "sortCriteria" attribute
     */
    void setSortCriteria(java.lang.String sortCriteria);
    
    /**
     * Sets (as xml) the "sortCriteria" attribute
     */
    void xsetSortCriteria(org.apache.xmlbeans.XmlString sortCriteria);
    
    /**
     * Unsets the "sortCriteria" attribute
     */
    void unsetSortCriteria();
    
    /**
     * Gets the "sortDirection" attribute
     */
    net.opengis.xls.SortDirectionType.Enum getSortDirection();
    
    /**
     * Gets (as xml) the "sortDirection" attribute
     */
    net.opengis.xls.SortDirectionType xgetSortDirection();
    
    /**
     * True if has "sortDirection" attribute
     */
    boolean isSetSortDirection();
    
    /**
     * Sets the "sortDirection" attribute
     */
    void setSortDirection(net.opengis.xls.SortDirectionType.Enum sortDirection);
    
    /**
     * Sets (as xml) the "sortDirection" attribute
     */
    void xsetSortDirection(net.opengis.xls.SortDirectionType sortDirection);
    
    /**
     * Unsets the "sortDirection" attribute
     */
    void unsetSortDirection();
    
    /**
     * Gets the "distanceUnit" attribute
     */
    net.opengis.xls.DistanceUnitType.Enum getDistanceUnit();
    
    /**
     * Gets (as xml) the "distanceUnit" attribute
     */
    net.opengis.xls.DistanceUnitType xgetDistanceUnit();
    
    /**
     * True if has "distanceUnit" attribute
     */
    boolean isSetDistanceUnit();
    
    /**
     * Sets the "distanceUnit" attribute
     */
    void setDistanceUnit(net.opengis.xls.DistanceUnitType.Enum distanceUnit);
    
    /**
     * Sets (as xml) the "distanceUnit" attribute
     */
    void xsetDistanceUnit(net.opengis.xls.DistanceUnitType distanceUnit);
    
    /**
     * Unsets the "distanceUnit" attribute
     */
    void unsetDistanceUnit();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.xls.DirectoryRequestType newInstance() {
          return (net.opengis.xls.DirectoryRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.xls.DirectoryRequestType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.xls.DirectoryRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.xls.DirectoryRequestType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.DirectoryRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.xls.DirectoryRequestType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.DirectoryRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.xls.DirectoryRequestType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.DirectoryRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.xls.DirectoryRequestType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.DirectoryRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.xls.DirectoryRequestType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.DirectoryRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.xls.DirectoryRequestType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.DirectoryRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.xls.DirectoryRequestType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.DirectoryRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.xls.DirectoryRequestType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.DirectoryRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.xls.DirectoryRequestType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.DirectoryRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.xls.DirectoryRequestType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.DirectoryRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.xls.DirectoryRequestType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.DirectoryRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.xls.DirectoryRequestType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.DirectoryRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.xls.DirectoryRequestType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.DirectoryRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.xls.DirectoryRequestType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.DirectoryRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.DirectoryRequestType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.DirectoryRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.DirectoryRequestType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.DirectoryRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
