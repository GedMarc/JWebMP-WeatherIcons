import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.weathericons.WeatherIconsPageConfigurator;
import com.jwebmp.plugins.weathericons.implementations.WeatherExclusionsModule;

module com.jwebmp.plugins.weathericons {
	requires com.jwebmp.core;
	requires java.validation;
	requires com.jwebmp.guicedinjection;

	exports com.jwebmp.plugins.weathericons;

	provides IPageConfigurator with WeatherIconsPageConfigurator;
	provides IGuiceScanModuleExclusions with WeatherExclusionsModule;
	provides IGuiceScanJarExclusions with WeatherExclusionsModule;

	opens com.jwebmp.plugins.weathericons to com.google.guice, com.jwebmp.core;
}
