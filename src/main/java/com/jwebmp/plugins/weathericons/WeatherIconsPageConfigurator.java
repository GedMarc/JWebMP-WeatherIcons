package com.jwebmp.plugins.weathericons;

import com.jwebmp.core.Page;
import com.jwebmp.core.base.references.CSSReference;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.services.IPageConfigurator;

import jakarta.validation.constraints.NotNull;

@PluginInformation(pluginName = "Weather Icons",
		pluginUniqueName = "weather-icons",
		pluginDescription = "Weather Icons is the only icon font and CSS with 222 weather themed icons, ready to be dropped right into Bootstrap, " +
				"or any project that needs high quality weather, maritime, and meteorological based icons!",
		pluginVersion = "2.2",
		pluginDependancyUniqueIDs = "jquery",
		pluginCategories = "icons",
		pluginSubtitle = "Weather Icons is the only icon font and CSS with 222 weather themed icons",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-WeatherIcons",
		pluginSourceUrl = "https://github.com/erikflowers/weather-icons",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-WeatherIcons/wiki",
		pluginOriginalHomepage = "http://erikflowers.github.io/weather-icons/",
		pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins.iconsets/jwebmp-weathericons",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginLastUpdatedDate = "2020/12/14",
		pluginGroupId = "com.jwebmp.plugins.iconsets",
		pluginArtifactId = "jwebmp-weathericons",
		pluginModuleName = "com.jwebmp.plugins.weathericons",
		pluginStatus = PluginStatus.Released
)
public class WeatherIconsPageConfigurator
		implements IPageConfigurator<WeatherIconsPageConfigurator>
{
	/**
	 * Field reference
	 */
	private static final CSSReference reference = new CSSReference("WeatherIconsCSS", 2.2, "bower_components/weather-icons/weather-icons.min.css");
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return WeatherIconsPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		WeatherIconsPageConfigurator.enabled = mustEnable;
	}

	/**
	 * Returns the associated CSS Reference for the icons
	 *
	 * @return
	 */
	public static CSSReference getReference()
	{
		return WeatherIconsPageConfigurator.reference;
	}

	/**
	 * Configures the given page for the parameters
	 *
	 * @param page
	 * 		The page incoming
	 *
	 * @return The original page incoming or a new page, never null
	 */
	@Override
	public @NotNull Page<?> configure(Page<?> page)
	{
		if (!page.isConfigured() && enabled())
		{
			page.addCssReference(WeatherIconsPageConfigurator.reference);
		}
		return page;
	}

	@Override
	public boolean enabled()
	{
		return WeatherIconsPageConfigurator.enabled;
	}
}
