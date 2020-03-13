module com.jwebmp.plugins.weathericons {
	requires com.jwebmp.core;
	requires java.validation;
	requires com.guicedee.guicedinjection;

	exports com.jwebmp.plugins.weathericons;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.weathericons.WeatherIconsPageConfigurator;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.weathericons.implementations.WeatherExclusionsModule;

	opens com.jwebmp.plugins.weathericons to  com.jwebmp.core;
}
