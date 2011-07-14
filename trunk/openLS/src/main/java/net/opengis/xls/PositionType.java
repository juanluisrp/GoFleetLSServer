/*
 * XML Type:  PositionType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.PositionType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls;


/**
 * An XML PositionType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public interface PositionType extends net.opengis.xls.AbstractPositionType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PositionType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("positiontypeacf1type");
    
    /**
     * Gets the "Point" element
     */
    net.opengis.gml.PointType getPoint();
    
    /**
     * Sets the "Point" element
     */
    void setPoint(net.opengis.gml.PointType point);
    
    /**
     * Appends and returns a new empty "Point" element
     */
    net.opengis.gml.PointType addNewPoint();
    
    /**
     * Gets the "Ellipse" element
     */
    net.opengis.xls.EllipseType getEllipse();
    
    /**
     * True if has "Ellipse" element
     */
    boolean isSetEllipse();
    
    /**
     * Sets the "Ellipse" element
     */
    void setEllipse(net.opengis.xls.EllipseType ellipse);
    
    /**
     * Appends and returns a new empty "Ellipse" element
     */
    net.opengis.xls.EllipseType addNewEllipse();
    
    /**
     * Unsets the "Ellipse" element
     */
    void unsetEllipse();
    
    /**
     * Gets the "CircleByCenterPoint" element
     */
    net.opengis.gml.CircleByCenterPointType getCircleByCenterPoint();
    
    /**
     * True if has "CircleByCenterPoint" element
     */
    boolean isSetCircleByCenterPoint();
    
    /**
     * Sets the "CircleByCenterPoint" element
     */
    void setCircleByCenterPoint(net.opengis.gml.CircleByCenterPointType circleByCenterPoint);
    
    /**
     * Appends and returns a new empty "CircleByCenterPoint" element
     */
    net.opengis.gml.CircleByCenterPointType addNewCircleByCenterPoint();
    
    /**
     * Unsets the "CircleByCenterPoint" element
     */
    void unsetCircleByCenterPoint();
    
    /**
     * Gets the "CircularArc" element
     */
    net.opengis.xls.CircularArcType getCircularArc();
    
    /**
     * True if has "CircularArc" element
     */
    boolean isSetCircularArc();
    
    /**
     * Sets the "CircularArc" element
     */
    void setCircularArc(net.opengis.xls.CircularArcType circularArc);
    
    /**
     * Appends and returns a new empty "CircularArc" element
     */
    net.opengis.xls.CircularArcType addNewCircularArc();
    
    /**
     * Unsets the "CircularArc" element
     */
    void unsetCircularArc();
    
    /**
     * Gets the "Polygon" element
     */
    net.opengis.gml.PolygonType getPolygon();
    
    /**
     * True if has "Polygon" element
     */
    boolean isSetPolygon();
    
    /**
     * Sets the "Polygon" element
     */
    void setPolygon(net.opengis.gml.PolygonType polygon);
    
    /**
     * Appends and returns a new empty "Polygon" element
     */
    net.opengis.gml.PolygonType addNewPolygon();
    
    /**
     * Unsets the "Polygon" element
     */
    void unsetPolygon();
    
    /**
     * Gets the "MultiPolygon" element
     */
    net.opengis.gml.MultiPolygonType getMultiPolygon();
    
    /**
     * True if has "MultiPolygon" element
     */
    boolean isSetMultiPolygon();
    
    /**
     * Sets the "MultiPolygon" element
     */
    void setMultiPolygon(net.opengis.gml.MultiPolygonType multiPolygon);
    
    /**
     * Appends and returns a new empty "MultiPolygon" element
     */
    net.opengis.gml.MultiPolygonType addNewMultiPolygon();
    
    /**
     * Unsets the "MultiPolygon" element
     */
    void unsetMultiPolygon();
    
    /**
     * Gets the "QoP" element
     */
    net.opengis.xls.QualityOfPositionType getQoP();
    
    /**
     * True if has "QoP" element
     */
    boolean isSetQoP();
    
    /**
     * Sets the "QoP" element
     */
    void setQoP(net.opengis.xls.QualityOfPositionType qoP);
    
    /**
     * Appends and returns a new empty "QoP" element
     */
    net.opengis.xls.QualityOfPositionType addNewQoP();
    
    /**
     * Unsets the "QoP" element
     */
    void unsetQoP();
    
    /**
     * Gets the "Time" element
     */
    net.opengis.xls.TimeType getTime();
    
    /**
     * True if has "Time" element
     */
    boolean isSetTime();
    
    /**
     * Sets the "Time" element
     */
    void setTime(net.opengis.xls.TimeType time);
    
    /**
     * Appends and returns a new empty "Time" element
     */
    net.opengis.xls.TimeType addNewTime();
    
    /**
     * Unsets the "Time" element
     */
    void unsetTime();
    
    /**
     * Gets the "Speed" element
     */
    net.opengis.xls.SpeedType getSpeed();
    
    /**
     * True if has "Speed" element
     */
    boolean isSetSpeed();
    
    /**
     * Sets the "Speed" element
     */
    void setSpeed(net.opengis.xls.SpeedType speed);
    
    /**
     * Appends and returns a new empty "Speed" element
     */
    net.opengis.xls.SpeedType addNewSpeed();
    
    /**
     * Unsets the "Speed" element
     */
    void unsetSpeed();
    
    /**
     * Gets the "Direction" element
     */
    net.opengis.xls.AngleType getDirection();
    
    /**
     * True if has "Direction" element
     */
    boolean isSetDirection();
    
    /**
     * Sets the "Direction" element
     */
    void setDirection(net.opengis.xls.AngleType direction);
    
    /**
     * Appends and returns a new empty "Direction" element
     */
    net.opengis.xls.AngleType addNewDirection();
    
    /**
     * Unsets the "Direction" element
     */
    void unsetDirection();
    
    /**
     * Gets the "levelOfConf" attribute
     */
    java.lang.String getLevelOfConf();
    
    /**
     * Gets (as xml) the "levelOfConf" attribute
     */
    org.apache.xmlbeans.XmlString xgetLevelOfConf();
    
    /**
     * True if has "levelOfConf" attribute
     */
    boolean isSetLevelOfConf();
    
    /**
     * Sets the "levelOfConf" attribute
     */
    void setLevelOfConf(java.lang.String levelOfConf);
    
    /**
     * Sets (as xml) the "levelOfConf" attribute
     */
    void xsetLevelOfConf(org.apache.xmlbeans.XmlString levelOfConf);
    
    /**
     * Unsets the "levelOfConf" attribute
     */
    void unsetLevelOfConf();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.xls.PositionType newInstance() {
          return (net.opengis.xls.PositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.xls.PositionType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.xls.PositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.xls.PositionType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.PositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.xls.PositionType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.PositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.xls.PositionType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.PositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.xls.PositionType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.PositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.xls.PositionType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.PositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.xls.PositionType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.PositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.xls.PositionType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.PositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.xls.PositionType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.PositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.xls.PositionType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.PositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.xls.PositionType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.PositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.xls.PositionType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.PositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.xls.PositionType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.PositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.xls.PositionType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.PositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.xls.PositionType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.PositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.PositionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.PositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.PositionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.PositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
