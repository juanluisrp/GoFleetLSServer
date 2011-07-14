/*
 * XML Type:  AbstractMSInformationType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.AbstractMSInformationType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls;


/**
 * An XML AbstractMSInformationType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public interface AbstractMSInformationType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AbstractMSInformationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("abstractmsinformationtypebea8type");
    
    /**
     * Gets the "msIDType" attribute
     */
    net.opengis.xls.AbstractMSInformationType.MsIDType.Enum getMsIDType();
    
    /**
     * Gets (as xml) the "msIDType" attribute
     */
    net.opengis.xls.AbstractMSInformationType.MsIDType xgetMsIDType();
    
    /**
     * True if has "msIDType" attribute
     */
    boolean isSetMsIDType();
    
    /**
     * Sets the "msIDType" attribute
     */
    void setMsIDType(net.opengis.xls.AbstractMSInformationType.MsIDType.Enum msIDType);
    
    /**
     * Sets (as xml) the "msIDType" attribute
     */
    void xsetMsIDType(net.opengis.xls.AbstractMSInformationType.MsIDType msIDType);
    
    /**
     * Unsets the "msIDType" attribute
     */
    void unsetMsIDType();
    
    /**
     * Gets the "msIDValue" attribute
     */
    java.lang.String getMsIDValue();
    
    /**
     * Gets (as xml) the "msIDValue" attribute
     */
    org.apache.xmlbeans.XmlString xgetMsIDValue();
    
    /**
     * True if has "msIDValue" attribute
     */
    boolean isSetMsIDValue();
    
    /**
     * Sets the "msIDValue" attribute
     */
    void setMsIDValue(java.lang.String msIDValue);
    
    /**
     * Sets (as xml) the "msIDValue" attribute
     */
    void xsetMsIDValue(org.apache.xmlbeans.XmlString msIDValue);
    
    /**
     * Unsets the "msIDValue" attribute
     */
    void unsetMsIDValue();
    
    /**
     * Gets the "encryption" attribute
     */
    net.opengis.xls.AbstractMSInformationType.Encryption.Enum getEncryption();
    
    /**
     * Gets (as xml) the "encryption" attribute
     */
    net.opengis.xls.AbstractMSInformationType.Encryption xgetEncryption();
    
    /**
     * True if has "encryption" attribute
     */
    boolean isSetEncryption();
    
    /**
     * Sets the "encryption" attribute
     */
    void setEncryption(net.opengis.xls.AbstractMSInformationType.Encryption.Enum encryption);
    
    /**
     * Sets (as xml) the "encryption" attribute
     */
    void xsetEncryption(net.opengis.xls.AbstractMSInformationType.Encryption encryption);
    
    /**
     * Unsets the "encryption" attribute
     */
    void unsetEncryption();
    
    /**
     * An XML msIDType(@).
     *
     * This is an atomic type that is a restriction of net.opengis.xls.AbstractMSInformationType$MsIDType.
     */
    public interface MsIDType extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MsIDType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("msidtype6c0dattrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum MSISDN = Enum.forString("MSISDN");
        static final Enum MIN = Enum.forString("MIN");
        static final Enum IMSI = Enum.forString("IMSI");
        static final Enum IMEI = Enum.forString("IMEI");
        static final Enum MDN = Enum.forString("MDN");
        static final Enum EME_MSID = Enum.forString("EME_MSID");
        static final Enum IPV_4 = Enum.forString("IPV4");
        static final Enum IPV_6 = Enum.forString("IPV6");
        
        static final int INT_MSISDN = Enum.INT_MSISDN;
        static final int INT_MIN = Enum.INT_MIN;
        static final int INT_IMSI = Enum.INT_IMSI;
        static final int INT_IMEI = Enum.INT_IMEI;
        static final int INT_MDN = Enum.INT_MDN;
        static final int INT_EME_MSID = Enum.INT_EME_MSID;
        static final int INT_IPV_4 = Enum.INT_IPV_4;
        static final int INT_IPV_6 = Enum.INT_IPV_6;
        
        /**
         * Enumeration value class for net.opengis.xls.AbstractMSInformationType$MsIDType.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_MSISDN
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
            
            static final int INT_MSISDN = 1;
            static final int INT_MIN = 2;
            static final int INT_IMSI = 3;
            static final int INT_IMEI = 4;
            static final int INT_MDN = 5;
            static final int INT_EME_MSID = 6;
            static final int INT_IPV_4 = 7;
            static final int INT_IPV_6 = 8;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("MSISDN", INT_MSISDN),
                    new Enum("MIN", INT_MIN),
                    new Enum("IMSI", INT_IMSI),
                    new Enum("IMEI", INT_IMEI),
                    new Enum("MDN", INT_MDN),
                    new Enum("EME_MSID", INT_EME_MSID),
                    new Enum("IPV4", INT_IPV_4),
                    new Enum("IPV6", INT_IPV_6),
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
            public static net.opengis.xls.AbstractMSInformationType.MsIDType newValue(java.lang.Object obj) {
              return (net.opengis.xls.AbstractMSInformationType.MsIDType) type.newValue( obj ); }
            
            public static net.opengis.xls.AbstractMSInformationType.MsIDType newInstance() {
              return (net.opengis.xls.AbstractMSInformationType.MsIDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static net.opengis.xls.AbstractMSInformationType.MsIDType newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (net.opengis.xls.AbstractMSInformationType.MsIDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML encryption(@).
     *
     * This is an atomic type that is a restriction of net.opengis.xls.AbstractMSInformationType$Encryption.
     */
    public interface Encryption extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Encryption.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("encryption5ea5attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum ASC = Enum.forString("ASC");
        static final Enum B_64 = Enum.forString("B64");
        static final Enum CRP = Enum.forString("CRP");
        
        static final int INT_ASC = Enum.INT_ASC;
        static final int INT_B_64 = Enum.INT_B_64;
        static final int INT_CRP = Enum.INT_CRP;
        
        /**
         * Enumeration value class for net.opengis.xls.AbstractMSInformationType$Encryption.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_ASC
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
            
            static final int INT_ASC = 1;
            static final int INT_B_64 = 2;
            static final int INT_CRP = 3;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("ASC", INT_ASC),
                    new Enum("B64", INT_B_64),
                    new Enum("CRP", INT_CRP),
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
            public static net.opengis.xls.AbstractMSInformationType.Encryption newValue(java.lang.Object obj) {
              return (net.opengis.xls.AbstractMSInformationType.Encryption) type.newValue( obj ); }
            
            public static net.opengis.xls.AbstractMSInformationType.Encryption newInstance() {
              return (net.opengis.xls.AbstractMSInformationType.Encryption) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static net.opengis.xls.AbstractMSInformationType.Encryption newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (net.opengis.xls.AbstractMSInformationType.Encryption) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.xls.AbstractMSInformationType newInstance() {
          return (net.opengis.xls.AbstractMSInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.xls.AbstractMSInformationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.xls.AbstractMSInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.xls.AbstractMSInformationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AbstractMSInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.xls.AbstractMSInformationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AbstractMSInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.xls.AbstractMSInformationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AbstractMSInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.xls.AbstractMSInformationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AbstractMSInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.xls.AbstractMSInformationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AbstractMSInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.xls.AbstractMSInformationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AbstractMSInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.xls.AbstractMSInformationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AbstractMSInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.xls.AbstractMSInformationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AbstractMSInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.xls.AbstractMSInformationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AbstractMSInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.xls.AbstractMSInformationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AbstractMSInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.xls.AbstractMSInformationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AbstractMSInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.xls.AbstractMSInformationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AbstractMSInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.xls.AbstractMSInformationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AbstractMSInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.xls.AbstractMSInformationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AbstractMSInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.AbstractMSInformationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.AbstractMSInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.AbstractMSInformationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.AbstractMSInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
