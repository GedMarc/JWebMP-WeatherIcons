package com.jwebmp.plugins.weathericons;

import com.jwebmp.core.base.html.Italic;

import javax.validation.constraints.NotNull;

/**
 * A weather icon italic
 *
 * @param <J>
 * 		Always this type
 */
@SuppressWarnings("MissingClassJavaDoc")
public class WeatherIcons<J extends WeatherIcons<J>>
		extends Italic<J>
{
	/**
	 * Field icon
	 */
	private WeatherIcon icon;

	/**
	 * Sets the weather icon
	 *
	 * @param text
	 */
	public WeatherIcons(String text)
	{
		this();
		setText(text);
	}

	public WeatherIcons()
	{
		//No config needed
	}

	/**
	 * Sets the give icon
	 *
	 * @param icon
	 * 		The icon to apply
	 */
	public WeatherIcons(WeatherIcon icon)
	{
		this();
		this.icon = icon;
	}

	/**
	 * Returns this icon
	 *
	 * @return The weather icon
	 */
	public WeatherIcon getIcon()
	{
		return icon;
	}

	/**
	 * Sets the icon
	 *
	 * @param icon
	 * 		The icon
	 *
	 * @return Always this object
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setIcon(WeatherIcon icon)
	{
		this.icon = icon;
		return (J) this;
	}
}
