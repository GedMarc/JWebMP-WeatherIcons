package com.jwebmp.plugins.weathericons;

import com.jwebmp.core.Page;
import com.jwebmp.core.base.references.CSSReference;
import com.jwebmp.core.services.IPageConfigurator;

import javax.validation.constraints.NotNull;

public class WeatherIconsPageConfigurator
		implements IPageConfigurator
{
	/**
	 * Field reference
	 */
	private static final CSSReference reference = new CSSReference("WeatherIconsCSS", 1.0, "bower_components/weather-icons/weather-icons.min.css");

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
}
