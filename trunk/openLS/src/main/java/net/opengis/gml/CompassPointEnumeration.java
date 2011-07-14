/*
 * XML Type:  CompassPointEnumeration
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CompassPointEnumeration
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml;


/**
 * An XML CompassPointEnumeration(@http://www.opengis.net/gml).
 *
 * This is an atomic type that is a restriction of net.opengis.gml.CompassPointEnumeration.
 */
public interface CompassPointEnumeration extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CompassPointEnumeration.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("compasspointenumerationa2a4type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum N = Enum.forString("N");
    static final Enum NNE = Enum.forString("NNE");
    static final Enum NE = Enum.forString("NE");
    static final Enum ENE = Enum.forString("ENE");
    static final Enum E = Enum.forString("E");
    static final Enum ESE = Enum.forString("ESE");
    static final Enum SE = Enum.forString("SE");
    static final Enum SSE = Enum.forString("SSE");
    static final Enum S = Enum.forString("S");
    static final Enum SSW = Enum.forString("SSW");
    static final Enum SW = Enum.forString("SW");
    static final Enum WSW = Enum.forString("WSW");
    static final Enum W = Enum.forString("W");
    static final Enum WNW = Enum.forString("WNW");
    static final Enum NW = Enum.forString("NW");
    static final Enum NNW = Enum.forString("NNW");
    
    static final int INT_N = Enum.INT_N;
    static final int INT_NNE = Enum.INT_NNE;
    static final int INT_NE = Enum.INT_NE;
    static final int INT_ENE = Enum.INT_ENE;
    static final int INT_E = Enum.INT_E;
    static final int INT_ESE = Enum.INT_ESE;
    static final int INT_SE = Enum.INT_SE;
    static final int INT_SSE = Enum.INT_SSE;
    static final int INT_S = Enum.INT_S;
    static final int INT_SSW = Enum.INT_SSW;
    static final int INT_SW = Enum.INT_SW;
    static final int INT_WSW = Enum.INT_WSW;
    static final int INT_W = Enum.INT_W;
    static final int INT_WNW = Enum.INT_WNW;
    static final int INT_NW = Enum.INT_NW;
    static final int INT_NNW = Enum.INT_NNW;
    
    /**
     * Enumeration value class for net.opengis.gml.CompassPointEnumeration.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_N
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_N = 1;
        static final int INT_NNE = 2;
        static final int INT_NE = 3;
        static final int INT_ENE = 4;
        static final int INT_E = 5;
        static final int INT_ESE = 6;
        static final int INT_SE = 7;
        static final int INT_SSE = 8;
        static final int INT_S = 9;
        static final int INT_SSW = 10;
        static final int INT_SW = 11;
        static final int INT_WSW = 12;
        static final int INT_W = 13;
        static final int INT_WNW = 14;
        static final int INT_NW = 15;
        static final int INT_NNW = 16;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("N", INT_N),
                new Enum("NNE", INT_NNE),
                new Enum("NE", INT_NE),
                new Enum("ENE", INT_ENE),
                new Enum("E", INT_E),
                new Enum("ESE", INT_ESE),
                new Enum("SE", INT_SE),
                new Enum("SSE", INT_SSE),
                new Enum("S", INT_S),
                new Enum("SSW", INT_SSW),
                new Enum("SW", INT_SW),
                new Enum("WSW", INT_WSW),
                new Enum("W", INT_W),
                new Enum("WNW", INT_WNW),
                new Enum("NW", INT_NW),
                new Enum("NNW", INT_NNW),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.CompassPointEnumeration newValue(java.lang.Object obj) {
          return (net.opengis.gml.CompassPointEnumeration) type.newValue( obj ); }
        
        public static net.opengis.gml.CompassPointEnumeration newInstance() {
          return (net.opengis.gml.CompassPointEnumeration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.CompassPointEnumeration newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.CompassPointEnumeration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.CompassPointEnumeration parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.CompassPointEnumeration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.CompassPointEnumeration parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.CompassPointEnumeration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.CompassPointEnumeration parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.CompassPointEnumeration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.CompassPointEnumeration parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.CompassPointEnumeration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.CompassPointEnumeration parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.CompassPointEnumeration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.CompassPointEnumeration parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.CompassPointEnumeration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.CompassPointEnumeration parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.CompassPointEnumeration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.CompassPointEnumeration parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.CompassPointEnumeration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.CompassPointEnumeration parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.CompassPointEnumeration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.CompassPointEnumeration parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.CompassPointEnumeration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.CompassPointEnumeration parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.CompassPointEnumeration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.CompassPointEnumeration parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.CompassPointEnumeration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.CompassPointEnumeration parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.CompassPointEnumeration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.CompassPointEnumeration parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.CompassPointEnumeration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.gml.CompassPointEnumeration parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.CompassPointEnumeration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.gml.CompassPointEnumeration parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.CompassPointEnumeration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
