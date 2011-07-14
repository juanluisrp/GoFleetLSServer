/*
 * XML Type:  QualityOfPositionType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.QualityOfPositionType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls;


/**
 * An XML QualityOfPositionType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public interface QualityOfPositionType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(QualityOfPositionType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("qualityofpositiontype8c0dtype");
    
    /**
     * Gets the "HorizontalAcc" element
     */
    net.opengis.xls.HorAccType getHorizontalAcc();
    
    /**
     * Sets the "HorizontalAcc" element
     */
    void setHorizontalAcc(net.opengis.xls.HorAccType horizontalAcc);
    
    /**
     * Appends and returns a new empty "HorizontalAcc" element
     */
    net.opengis.xls.HorAccType addNewHorizontalAcc();
    
    /**
     * Gets the "VerticalAcc" element
     */
    net.opengis.xls.VerAccType getVerticalAcc();
    
    /**
     * Sets the "VerticalAcc" element
     */
    void setVerticalAcc(net.opengis.xls.VerAccType verticalAcc);
    
    /**
     * Appends and returns a new empty "VerticalAcc" element
     */
    net.opengis.xls.VerAccType addNewVerticalAcc();
    
    /**
     * Gets the "responseReq" attribute
     */
    net.opengis.xls.QualityOfPositionType.ResponseReq.Enum getResponseReq();
    
    /**
     * Gets (as xml) the "responseReq" attribute
     */
    net.opengis.xls.QualityOfPositionType.ResponseReq xgetResponseReq();
    
    /**
     * True if has "responseReq" attribute
     */
    boolean isSetResponseReq();
    
    /**
     * Sets the "responseReq" attribute
     */
    void setResponseReq(net.opengis.xls.QualityOfPositionType.ResponseReq.Enum responseReq);
    
    /**
     * Sets (as xml) the "responseReq" attribute
     */
    void xsetResponseReq(net.opengis.xls.QualityOfPositionType.ResponseReq responseReq);
    
    /**
     * Unsets the "responseReq" attribute
     */
    void unsetResponseReq();
    
    /**
     * Gets the "responseTimer" attribute
     */
    java.lang.String getResponseTimer();
    
    /**
     * Gets (as xml) the "responseTimer" attribute
     */
    org.apache.xmlbeans.XmlString xgetResponseTimer();
    
    /**
     * True if has "responseTimer" attribute
     */
    boolean isSetResponseTimer();
    
    /**
     * Sets the "responseTimer" attribute
     */
    void setResponseTimer(java.lang.String responseTimer);
    
    /**
     * Sets (as xml) the "responseTimer" attribute
     */
    void xsetResponseTimer(org.apache.xmlbeans.XmlString responseTimer);
    
    /**
     * Unsets the "responseTimer" attribute
     */
    void unsetResponseTimer();
    
    /**
     * An XML responseReq(@).
     *
     * This is an atomic type that is a restriction of net.opengis.xls.QualityOfPositionType$ResponseReq.
     */
    public interface ResponseReq extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResponseReq.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("responsereqe8e8attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum NO_DELAY = Enum.forString("No_Delay");
        static final Enum LOW_DELAY = Enum.forString("Low_Delay");
        static final Enum DELAY_TOL = Enum.forString("Delay_Tol");
        
        static final int INT_NO_DELAY = Enum.INT_NO_DELAY;
        static final int INT_LOW_DELAY = Enum.INT_LOW_DELAY;
        static final int INT_DELAY_TOL = Enum.INT_DELAY_TOL;
        
        /**
         * Enumeration value class for net.opengis.xls.QualityOfPositionType$ResponseReq.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_NO_DELAY
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
            
            static final int INT_NO_DELAY = 1;
            static final int INT_LOW_DELAY = 2;
            static final int INT_DELAY_TOL = 3;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("No_Delay", INT_NO_DELAY),
                    new Enum("Low_Delay", INT_LOW_DELAY),
                    new Enum("Delay_Tol", INT_DELAY_TOL),
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
            public static net.opengis.xls.QualityOfPositionType.ResponseReq newValue(java.lang.Object obj) {
              return (net.opengis.xls.QualityOfPositionType.ResponseReq) type.newValue( obj ); }
            
            public static net.opengis.xls.QualityOfPositionType.ResponseReq newInstance() {
              return (net.opengis.xls.QualityOfPositionType.ResponseReq) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static net.opengis.xls.QualityOfPositionType.ResponseReq newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (net.opengis.xls.QualityOfPositionType.ResponseReq) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.xls.QualityOfPositionType newInstance() {
          return (net.opengis.xls.QualityOfPositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.xls.QualityOfPositionType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.xls.QualityOfPositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.xls.QualityOfPositionType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.QualityOfPositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.xls.QualityOfPositionType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.QualityOfPositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.xls.QualityOfPositionType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.QualityOfPositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.xls.QualityOfPositionType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.QualityOfPositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.xls.QualityOfPositionType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.QualityOfPositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.xls.QualityOfPositionType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.QualityOfPositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.xls.QualityOfPositionType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.QualityOfPositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.xls.QualityOfPositionType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.QualityOfPositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.xls.QualityOfPositionType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.QualityOfPositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.xls.QualityOfPositionType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.QualityOfPositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.xls.QualityOfPositionType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.QualityOfPositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.xls.QualityOfPositionType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.QualityOfPositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.xls.QualityOfPositionType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.QualityOfPositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.xls.QualityOfPositionType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.QualityOfPositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.QualityOfPositionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.QualityOfPositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.QualityOfPositionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.QualityOfPositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
