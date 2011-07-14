/*
 * XML Type:  NamedPlaceClassification
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.NamedPlaceClassification
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls;


/**
 * An XML NamedPlaceClassification(@http://www.opengis.net/xls).
 *
 * This is an atomic type that is a restriction of net.opengis.xls.NamedPlaceClassification.
 */
public interface NamedPlaceClassification extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NamedPlaceClassification.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("namedplaceclassification7b00type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum COUNTRY_SUBDIVISION = Enum.forString("CountrySubdivision");
    static final Enum COUNTRY_SECONDARY_SUBDIVISION = Enum.forString("CountrySecondarySubdivision");
    static final Enum MUNICIPALITY = Enum.forString("Municipality");
    static final Enum MUNICIPALITY_SUBDIVISION = Enum.forString("MunicipalitySubdivision");
    static final Enum CHOUME_BANCHI_GO = Enum.forString("choume-banchi-go");
    
    static final int INT_COUNTRY_SUBDIVISION = Enum.INT_COUNTRY_SUBDIVISION;
    static final int INT_COUNTRY_SECONDARY_SUBDIVISION = Enum.INT_COUNTRY_SECONDARY_SUBDIVISION;
    static final int INT_MUNICIPALITY = Enum.INT_MUNICIPALITY;
    static final int INT_MUNICIPALITY_SUBDIVISION = Enum.INT_MUNICIPALITY_SUBDIVISION;
    static final int INT_CHOUME_BANCHI_GO = Enum.INT_CHOUME_BANCHI_GO;
    
    /**
     * Enumeration value class for net.opengis.xls.NamedPlaceClassification.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_COUNTRY_SUBDIVISION
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
        
        static final int INT_COUNTRY_SUBDIVISION = 1;
        static final int INT_COUNTRY_SECONDARY_SUBDIVISION = 2;
        static final int INT_MUNICIPALITY = 3;
        static final int INT_MUNICIPALITY_SUBDIVISION = 4;
        static final int INT_CHOUME_BANCHI_GO = 5;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("CountrySubdivision", INT_COUNTRY_SUBDIVISION),
                new Enum("CountrySecondarySubdivision", INT_COUNTRY_SECONDARY_SUBDIVISION),
                new Enum("Municipality", INT_MUNICIPALITY),
                new Enum("MunicipalitySubdivision", INT_MUNICIPALITY_SUBDIVISION),
                new Enum("choume-banchi-go", INT_CHOUME_BANCHI_GO),
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
        public static net.opengis.xls.NamedPlaceClassification newValue(java.lang.Object obj) {
          return (net.opengis.xls.NamedPlaceClassification) type.newValue( obj ); }
        
        public static net.opengis.xls.NamedPlaceClassification newInstance() {
          return (net.opengis.xls.NamedPlaceClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.xls.NamedPlaceClassification newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.xls.NamedPlaceClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.xls.NamedPlaceClassification parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.NamedPlaceClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.xls.NamedPlaceClassification parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.NamedPlaceClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.xls.NamedPlaceClassification parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.NamedPlaceClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.xls.NamedPlaceClassification parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.NamedPlaceClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.xls.NamedPlaceClassification parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.NamedPlaceClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.xls.NamedPlaceClassification parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.NamedPlaceClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.xls.NamedPlaceClassification parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.NamedPlaceClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.xls.NamedPlaceClassification parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.NamedPlaceClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.xls.NamedPlaceClassification parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.NamedPlaceClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.xls.NamedPlaceClassification parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.NamedPlaceClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.xls.NamedPlaceClassification parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.NamedPlaceClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.xls.NamedPlaceClassification parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.NamedPlaceClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.xls.NamedPlaceClassification parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.NamedPlaceClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.xls.NamedPlaceClassification parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.NamedPlaceClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.NamedPlaceClassification parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.NamedPlaceClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.NamedPlaceClassification parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.NamedPlaceClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
