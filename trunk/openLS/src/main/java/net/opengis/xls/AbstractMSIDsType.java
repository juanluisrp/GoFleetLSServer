/*
 * XML Type:  AbstractMSIDsType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.AbstractMSIDsType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls;


/**
 * An XML AbstractMSIDsType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public interface AbstractMSIDsType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AbstractMSIDsType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("abstractmsidstypeec7ctype");
    
    /**
     * Gets the "session" attribute
     */
    net.opengis.xls.AbstractMSIDsType.Session.Enum getSession();
    
    /**
     * Gets (as xml) the "session" attribute
     */
    net.opengis.xls.AbstractMSIDsType.Session xgetSession();
    
    /**
     * True if has "session" attribute
     */
    boolean isSetSession();
    
    /**
     * Sets the "session" attribute
     */
    void setSession(net.opengis.xls.AbstractMSIDsType.Session.Enum session);
    
    /**
     * Sets (as xml) the "session" attribute
     */
    void xsetSession(net.opengis.xls.AbstractMSIDsType.Session session);
    
    /**
     * Unsets the "session" attribute
     */
    void unsetSession();
    
    /**
     * An XML session(@).
     *
     * This is an atomic type that is a restriction of net.opengis.xls.AbstractMSIDsType$Session.
     */
    public interface Session extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Session.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("sessione5beattrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum APN = Enum.forString("APN");
        static final Enum DIAL = Enum.forString("DIAL");
        
        static final int INT_APN = Enum.INT_APN;
        static final int INT_DIAL = Enum.INT_DIAL;
        
        /**
         * Enumeration value class for net.opengis.xls.AbstractMSIDsType$Session.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_APN
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
            
            static final int INT_APN = 1;
            static final int INT_DIAL = 2;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("APN", INT_APN),
                    new Enum("DIAL", INT_DIAL),
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
            public static net.opengis.xls.AbstractMSIDsType.Session newValue(java.lang.Object obj) {
              return (net.opengis.xls.AbstractMSIDsType.Session) type.newValue( obj ); }
            
            public static net.opengis.xls.AbstractMSIDsType.Session newInstance() {
              return (net.opengis.xls.AbstractMSIDsType.Session) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static net.opengis.xls.AbstractMSIDsType.Session newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (net.opengis.xls.AbstractMSIDsType.Session) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.xls.AbstractMSIDsType newInstance() {
          return (net.opengis.xls.AbstractMSIDsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.xls.AbstractMSIDsType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.xls.AbstractMSIDsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.xls.AbstractMSIDsType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AbstractMSIDsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.xls.AbstractMSIDsType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AbstractMSIDsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.xls.AbstractMSIDsType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AbstractMSIDsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.xls.AbstractMSIDsType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AbstractMSIDsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.xls.AbstractMSIDsType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AbstractMSIDsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.xls.AbstractMSIDsType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AbstractMSIDsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.xls.AbstractMSIDsType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AbstractMSIDsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.xls.AbstractMSIDsType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AbstractMSIDsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.xls.AbstractMSIDsType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AbstractMSIDsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.xls.AbstractMSIDsType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AbstractMSIDsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.xls.AbstractMSIDsType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AbstractMSIDsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.xls.AbstractMSIDsType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AbstractMSIDsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.xls.AbstractMSIDsType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AbstractMSIDsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.xls.AbstractMSIDsType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AbstractMSIDsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.AbstractMSIDsType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.AbstractMSIDsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.AbstractMSIDsType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.AbstractMSIDsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
