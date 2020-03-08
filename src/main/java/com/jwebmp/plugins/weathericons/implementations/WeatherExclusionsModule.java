package com.jwebmp.plugins.weathericons.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class WeatherExclusionsModule
		implements IGuiceScanModuleExclusions<WeatherExclusionsModule>
{
	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.waveseffect");
		return strings;
	}
}
