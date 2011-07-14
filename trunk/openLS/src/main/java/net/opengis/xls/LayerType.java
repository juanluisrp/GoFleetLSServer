/*
 * XML Type:  LayerType
 * Namespace: http://www.opengis.net/xls
 * Java type: net.opengis.xls.LayerType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.xls;


/**
 * An XML LayerType(@http://www.opengis.net/xls).
 *
 * This is a complex type.
 */
public interface LayerType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LayerType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("layertype107btype");
    
    /**
     * Gets array of all "Layer" elements
     */
    net.opengis.xls.LayerType.Layer[] getLayerArray();
    
    /**
     * Gets ith "Layer" element
     */
    net.opengis.xls.LayerType.Layer getLayerArray(int i);
    
    /**
     * Returns number of "Layer" element
     */
    int sizeOfLayerArray();
    
    /**
     * Sets array of all "Layer" element
     */
    void setLayerArray(net.opengis.xls.LayerType.Layer[] layerArray);
    
    /**
     * Sets ith "Layer" element
     */
    void setLayerArray(int i, net.opengis.xls.LayerType.Layer layer);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Layer" element
     */
    net.opengis.xls.LayerType.Layer insertNewLayer(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Layer" element
     */
    net.opengis.xls.LayerType.Layer addNewLayer();
    
    /**
     * Removes the ith "Layer" element
     */
    void removeLayer(int i);
    
    /**
     * Gets the "filter" attribute
     */
    net.opengis.xls.LayerType.Filter.Enum getFilter();
    
    /**
     * Gets (as xml) the "filter" attribute
     */
    net.opengis.xls.LayerType.Filter xgetFilter();
    
    /**
     * Sets the "filter" attribute
     */
    void setFilter(net.opengis.xls.LayerType.Filter.Enum filter);
    
    /**
     * Sets (as xml) the "filter" attribute
     */
    void xsetFilter(net.opengis.xls.LayerType.Filter filter);
    
    /**
     * An XML Layer(@http://www.opengis.net/xls).
     *
     * This is a complex type.
     */
    public interface Layer extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Layer.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("layeree3eelemtype");
        
        /**
         * Gets the "Style" element
         */
        net.opengis.xls.StyleType getStyle();
        
        /**
         * True if has "Style" element
         */
        boolean isSetStyle();
        
        /**
         * Sets the "Style" element
         */
        void setStyle(net.opengis.xls.StyleType style);
        
        /**
         * Appends and returns a new empty "Style" element
         */
        net.opengis.xls.StyleType addNewStyle();
        
        /**
         * Unsets the "Style" element
         */
        void unsetStyle();
        
        /**
         * Gets the "name" attribute
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" attribute
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * Sets the "name" attribute
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" attribute
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static net.opengis.xls.LayerType.Layer newInstance() {
              return (net.opengis.xls.LayerType.Layer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static net.opengis.xls.LayerType.Layer newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (net.opengis.xls.LayerType.Layer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML filter(@).
     *
     * This is an atomic type that is a restriction of net.opengis.xls.LayerType$Filter.
     */
    public interface Filter extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Filter.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE501641E7372207C5DD70369E56974EF").resolveHandle("filter06e3attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum INCLUDE = Enum.forString("Include");
        static final Enum EXCLUDE = Enum.forString("Exclude");
        
        static final int INT_INCLUDE = Enum.INT_INCLUDE;
        static final int INT_EXCLUDE = Enum.INT_EXCLUDE;
        
        /**
         * Enumeration value class for net.opengis.xls.LayerType$Filter.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_INCLUDE
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
            
            static final int INT_INCLUDE = 1;
            static final int INT_EXCLUDE = 2;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("Include", INT_INCLUDE),
                    new Enum("Exclude", INT_EXCLUDE),
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
            public static net.opengis.xls.LayerType.Filter newValue(java.lang.Object obj) {
              return (net.opengis.xls.LayerType.Filter) type.newValue( obj ); }
            
            public static net.opengis.xls.LayerType.Filter newInstance() {
              return (net.opengis.xls.LayerType.Filter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static net.opengis.xls.LayerType.Filter newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (net.opengis.xls.LayerType.Filter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.xls.LayerType newInstance() {
          return (net.opengis.xls.LayerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.xls.LayerType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.xls.LayerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.xls.LayerType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.LayerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.xls.LayerType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.LayerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.xls.LayerType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.LayerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.xls.LayerType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.LayerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.xls.LayerType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.LayerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.xls.LayerType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.LayerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.xls.LayerType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.LayerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.xls.LayerType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.LayerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.xls.LayerType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.LayerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.xls.LayerType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.xls.LayerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.xls.LayerType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.LayerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.xls.LayerType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.LayerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.xls.LayerType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.LayerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.xls.LayerType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.xls.LayerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.LayerType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.LayerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.xls.LayerType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.xls.LayerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
