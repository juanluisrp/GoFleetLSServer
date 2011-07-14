/*
 * XML Type:  AbstractGatewayParametersType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.AbstractGatewayParametersType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls;


/**
 * An XML AbstractGatewayParametersType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public interface AbstractGatewayParametersType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AbstractGatewayParametersType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("abstractgatewayparameterstyped0a0type");
    
    /**
     * Gets the "RequestedQoP" element
     */
    net.opengis.xls.QualityOfPositionType getRequestedQoP();
    
    /**
     * True if has "RequestedQoP" element
     */
    boolean isSetRequestedQoP();
    
    /**
     * Sets the "RequestedQoP" element
     */
    void setRequestedQoP(net.opengis.xls.QualityOfPositionType requestedQoP);
    
    /**
     * Appends and returns a new empty "RequestedQoP" element
     */
    net.opengis.xls.QualityOfPositionType addNewRequestedQoP();
    
    /**
     * Unsets the "RequestedQoP" element
     */
    void unsetRequestedQoP();
    
    /**
     * Gets the "locationType" attribute
     */
    net.opengis.xls.AbstractGatewayParametersType.LocationType.Enum getLocationType();
    
    /**
     * Gets (as xml) the "locationType" attribute
     */
    net.opengis.xls.AbstractGatewayParametersType.LocationType xgetLocationType();
    
    /**
     * True if has "locationType" attribute
     */
    boolean isSetLocationType();
    
    /**
     * Sets the "locationType" attribute
     */
    void setLocationType(net.opengis.xls.AbstractGatewayParametersType.LocationType.Enum locationType);
    
    /**
     * Sets (as xml) the "locationType" attribute
     */
    void xsetLocationType(net.opengis.xls.AbstractGatewayParametersType.LocationType locationType);
    
    /**
     * Unsets the "locationType" attribute
     */
    void unsetLocationType();
    
    /**
     * Gets the "requestedsrsName" attribute
     */
    java.lang.String getRequestedsrsName();
    
    /**
     * Gets (as xml) the "requestedsrsName" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetRequestedsrsName();
    
    /**
     * True if has "requestedsrsName" attribute
     */
    boolean isSetRequestedsrsName();
    
    /**
     * Sets the "requestedsrsName" attribute
     */
    void setRequestedsrsName(java.lang.String requestedsrsName);
    
    /**
     * Sets (as xml) the "requestedsrsName" attribute
     */
    void xsetRequestedsrsName(org.apache.xmlbeans.XmlAnyURI requestedsrsName);
    
    /**
     * Unsets the "requestedsrsName" attribute
     */
    void unsetRequestedsrsName();
    
    /**
     * Gets the "priority" attribute
     */
    net.opengis.xls.AbstractGatewayParametersType.Priority.Enum getPriority();
    
    /**
     * Gets (as xml) the "priority" attribute
     */
    net.opengis.xls.AbstractGatewayParametersType.Priority xgetPriority();
    
    /**
     * True if has "priority" attribute
     */
    boolean isSetPriority();
    
    /**
     * Sets the "priority" attribute
     */
    void setPriority(net.opengis.xls.AbstractGatewayParametersType.Priority.Enum priority);
    
    /**
     * Sets (as xml) the "priority" attribute
     */
    void xsetPriority(net.opengis.xls.AbstractGatewayParametersType.Priority priority);
    
    /**
     * Unsets the "priority" attribute
     */
    void unsetPriority();
    
    /**
     * An XML locationType(@).
     *
     * This is an atomic type that is a restriction of net.opengis.xls.AbstractGatewayParametersType$LocationType.
     */
    public interface LocationType extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LocationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("locationtype9891attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum CURRENT = Enum.forString("CURRENT");
        static final Enum LAST = Enum.forString("LAST");
        static final Enum CURRENT_OR_LAST = Enum.forString("CURRENT_OR_LAST");
        
        static final int INT_CURRENT = Enum.INT_CURRENT;
        static final int INT_LAST = Enum.INT_LAST;
        static final int INT_CURRENT_OR_LAST = Enum.INT_CURRENT_OR_LAST;
        
        /**
         * Enumeration value class for net.opengis.xls.AbstractGatewayParametersType$LocationType.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_CURRENT
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
            
            static final int INT_CURRENT = 1;
            static final int INT_LAST = 2;
            static final int INT_CURRENT_OR_LAST = 3;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("CURRENT", INT_CURRENT),
                    new Enum("LAST", INT_LAST),
                    new Enum("CURRENT_OR_LAST", INT_CURRENT_OR_LAST),
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
            public static net.opengis.xls.AbstractGatewayParametersType.LocationType newValue(java.lang.Object obj) {
              return (net.opengis.xls.AbstractGatewayParametersType.LocationType) type.newValue( obj ); }
            
            public static net.opengis.xls.AbstractGatewayParametersType.LocationType newInstance() {
              return (net.opengis.xls.AbstractGatewayParametersType.LocationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static net.opengis.xls.AbstractGatewayParametersType.LocationType newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (net.opengis.xls.AbstractGatewayParametersType.LocationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML priority(@).
     *
     * This is an atomic type that is a restriction of net.opengis.xls.AbstractGatewayParametersType$Priority.
     */
    public interface Priority extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Priority.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("priorityc05cattrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum NORMAL = Enum.forString("NORMAL");
        static final Enum HIGH = Enum.forString("HIGH");
        
        static final int INT_NORMAL = Enum.INT_NORMAL;
        static final int INT_HIGH = Enum.INT_HIGH;
        
        /**
         * Enumeration value class for net.opengis.xls.AbstractGatewayParametersType$Priority.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_NORMAL
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
            
            static final int INT_NORMAL = 1;
            static final int INT_HIGH = 2;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("NORMAL", INT_NORMAL),
                    new Enum("HIGH", INT_HIGH),
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
            public static net.opengis.xls.AbstractGatewayParametersType.Priority newValue(java.lang.Object obj) {
              return (net.opengis.xls.AbstractGatewayParametersType.Priority) type.newValue( obj ); }
            
            public static net.opengis.xls.AbstractGatewayParametersType.Priority newInstance() {
              return (net.opengis.xls.AbstractGatewayParametersType.Priority) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static net.opengis.xls.AbstractGatewayParametersType.Priority newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (net.opengis.xls.AbstractGatewayParametersType.Priority) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        public static net.opengis.xls.AbstractGatewayParametersType newInstance() {
          return (net.opengis.xls.AbstractGatewayParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        public static net.opengis.xls.AbstractGatewayParametersType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.xls.AbstractGatewayParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.xls.AbstractGatewayParametersType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AbstractGatewayParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.xls.AbstractGatewayParametersType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AbstractGatewayParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.xls.AbstractGatewayParametersType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AbstractGatewayParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.xls.AbstractGatewayParametersType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AbstractGatewayParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.xls.AbstractGatewayParametersType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AbstractGatewayParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.xls.AbstractGatewayParametersType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AbstractGatewayParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.xls.AbstractGatewayParametersType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AbstractGatewayParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.xls.AbstractGatewayParametersType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AbstractGatewayParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.xls.AbstractGatewayParametersType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AbstractGatewayParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.xls.AbstractGatewayParametersType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.AbstractGatewayParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.xls.AbstractGatewayParametersType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AbstractGatewayParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.xls.AbstractGatewayParametersType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AbstractGatewayParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.xls.AbstractGatewayParametersType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AbstractGatewayParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.xls.AbstractGatewayParametersType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.AbstractGatewayParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.AbstractGatewayParametersType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.AbstractGatewayParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.AbstractGatewayParametersType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.AbstractGatewayParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
