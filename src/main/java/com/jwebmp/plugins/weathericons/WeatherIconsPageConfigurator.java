package com.jwebmp.plugins.weathericons;

import com.jwebmp.core.Page;
import com.jwebmp.core.base.references.CSSReference;
import com.jwebmp.core.services.IPageConfigurator;

import javax.validation.constraints.NotNull;

public class WeatherIconsPageConfigurator
		implements IPageConfigurator<WeatherIconsPageConfigurator>
{
	/**
	 * Field reference
	 */
	private static final CSSReference reference = new CSSReference("WeatherIconsCSS", 1.0, "bower_components/weather-icons/weather-icons.min.css");
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
		if (!page.isConfigured())
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
