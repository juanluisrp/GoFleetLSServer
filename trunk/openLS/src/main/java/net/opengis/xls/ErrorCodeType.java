/*
 * XML Type:  ErrorCodeType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.ErrorCodeType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls;


/**
 * An XML ErrorCodeType(@http://www.opengis.net/xls).
 *
 * This is an atomic type that is a restriction of net.opengis.xls.ErrorCodeType.
 */
public interface ErrorCodeType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ErrorCodeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("errorcodetypeb0b7type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum REQUEST_VERSION_MISMATCH = Enum.forString("RequestVersionMismatch");
    static final Enum VALUE_NOT_RECOGNIZED = Enum.forString("ValueNotRecognized");
    static final Enum NOT_SUPPORTED = Enum.forString("NotSupported");
    static final Enum INCONSISTENT = Enum.forString("Inconsistent");
    static final Enum DELIVERY_FAILURE = Enum.forString("DeliveryFailure");
    static final Enum SECURITY_FAILURE = Enum.forString("SecurityFailure");
    static final Enum NO_RESULTS_RETURNED = Enum.forString("NoResultsReturned");
    static final Enum TIMED_OUT = Enum.forString("TimedOut");
    static final Enum INTERNAL_SERVER_ERROR = Enum.forString("InternalServerError");
    static final Enum DATA_NOT_AVAILABLE = Enum.forString("DataNotAvailable");
    static final Enum UNKNOWN = Enum.forString("Unknown");
    
    static final int INT_REQUEST_VERSION_MISMATCH = Enum.INT_REQUEST_VERSION_MISMATCH;
    static final int INT_VALUE_NOT_RECOGNIZED = Enum.INT_VALUE_NOT_RECOGNIZED;
    static final int INT_NOT_SUPPORTED = Enum.INT_NOT_SUPPORTED;
    static final int INT_INCONSISTENT = Enum.INT_INCONSISTENT;
    static final int INT_DELIVERY_FAILURE = Enum.INT_DELIVERY_FAILURE;
    static final int INT_SECURITY_FAILURE = Enum.INT_SECURITY_FAILURE;
    static final int INT_NO_RESULTS_RETURNED = Enum.INT_NO_RESULTS_RETURNED;
    static final int INT_TIMED_OUT = Enum.INT_TIMED_OUT;
    static final int INT_INTERNAL_SERVER_ERROR = Enum.INT_INTERNAL_SERVER_ERROR;
    static final int INT_DATA_NOT_AVAILABLE = Enum.INT_DATA_NOT_AVAILABLE;
    static final int INT_UNKNOWN = Enum.INT_UNKNOWN;
    
    /**
     * Enumeration value class for net.opengis.xls.ErrorCodeType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_REQUEST_VERSION_MISMATCH
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
        
        static final int INT_REQUEST_VERSION_MISMATCH = 1;
        static final int INT_VALUE_NOT_RECOGNIZED = 2;
        static final int INT_NOT_SUPPORTED = 3;
        static final int INT_INCONSISTENT = 4;
        static final int INT_DELIVERY_FAILURE = 5;
        static final int INT_SECURITY_FAILURE = 6;
        static final int INT_NO_RESULTS_RETURNED = 7;
        static final int INT_TIMED_OUT = 8;
        static final int INT_INTERNAL_SERVER_ERROR = 9;
        static final int INT_DATA_NOT_AVAILABLE = 10;
        static final int INT_UNKNOWN = 11;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("RequestVersionMismatch", INT_REQUEST_VERSION_MISMATCH),
                new Enum("ValueNotRecognized", INT_VALUE_NOT_RECOGNIZED),
                new Enum("NotSupported", INT_NOT_SUPPORTED),
                new Enum("Inconsistent", INT_INCONSISTENT),
                new Enum("DeliveryFailure", INT_DELIVERY_FAILURE),
                new Enum("SecurityFailure", INT_SECURITY_FAILURE),
                new Enum("NoResultsReturned", INT_NO_RESULTS_RETURNED),
                new Enum("TimedOut", INT_TIMED_OUT),
                new Enum("InternalServerError", INT_INTERNAL_SERVER_ERROR),
                new Enum("DataNotAvailable", INT_DATA_NOT_AVAILABLE),
                new Enum("Unknown", INT_UNKNOWN),
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
        public static net.opengis.xls.ErrorCodeType newValue(java.lang.Object obj) {
          return (net.opengis.xls.ErrorCodeType) type.newValue( obj ); }
        
        public static net.opengis.xls.ErrorCodeType newInstance() {
          return (net.opengis.xls.ErrorCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.xls.ErrorCodeType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.xls.ErrorCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.xls.ErrorCodeType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.ErrorCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.xls.ErrorCodeType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.ErrorCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.xls.ErrorCodeType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ErrorCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.xls.ErrorCodeType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ErrorCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.xls.ErrorCodeType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ErrorCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.xls.ErrorCodeType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ErrorCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.xls.ErrorCodeType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ErrorCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.xls.ErrorCodeType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ErrorCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.xls.ErrorCodeType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ErrorCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.xls.ErrorCodeType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.ErrorCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.xls.ErrorCodeType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.ErrorCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.xls.ErrorCodeType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.ErrorCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.xls.ErrorCodeType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.ErrorCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.xls.ErrorCodeType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.ErrorCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.ErrorCodeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.ErrorCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.ErrorCodeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.ErrorCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
