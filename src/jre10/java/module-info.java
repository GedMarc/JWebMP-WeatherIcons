module com.jwebmp.plugins.weathericons {
	requires com.jwebmp.core;
	requires java.validation;

	exports com.jwebmp.plugins.weathericons;

	opens com.jwebmp.plugins.weathericons to com.google.guice, com.jwebmp.core;
}
