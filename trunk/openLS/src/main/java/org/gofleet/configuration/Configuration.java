package org.gofleet.configuration;

import org.apache.commons.logging.LogFactory;

public class Configuration {

	private static Object configuration = null;
	private static org.apache.commons.logging.Log log = LogFactory
			.getLog(Configuration.class);

	// @Autowired
	// private static DataSource datasource;

	static {
		try {
			throw new Exception();
			// ConfigurationFactory factory = new ConfigurationFactory();
			// configuration = factory.getConfiguration();
			// DatabaseConfiguration ddbbconfig = new DatabaseConfiguration(
			// datasource, "table", "key", "value");
		} catch (Throwable t) {
			log.error("Error loading configuration: " + t);

			configuration = new Object();
		}
	}

	static public Object getConfiguration() {
		return configuration;
	}
}
