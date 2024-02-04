package com.jwebmp.plugins.weathericons;

import com.jwebmp.core.base.interfaces.ICssClassName;
import com.jwebmp.core.base.interfaces.IIcon;

import static com.guicedee.services.jsonrepresentation.json.StaticStrings.CHAR_DASH;
import static com.guicedee.services.jsonrepresentation.json.StaticStrings.CHAR_UNDERSCORE;
import static com.jwebmp.core.utilities.StaticStrings.*;

public enum WeatherIcon
		implements ICssClassName
{
	/**
	 * Field day_sunny
	 */
	day_sunny,
	/**
	 * Field day_cloudy
	 */
	day_cloudy,
	/**
	 * Field day_cloudy_gusts
	 */
	day_cloudy_gusts,
	/**
	 * Field day_cloudy_windy
	 */
	day_cloudy_windy,
	/**
	 * Field day_fog
	 */
	day_fog,
	/**
	 * Field day_hail
	 */
	day_hail,
	/**
	 * Field day_haze
	 */
	day_haze,
	/**
	 * Field day_lightning
	 */
	day_lightning,
	/**
	 * Field day_rain
	 */
	day_rain,
	/**
	 * Field day_rain_mix
	 */
	day_rain_mix,
	/**
	 * Field day_rain_wind
	 */
	day_rain_wind,
	/**
	 * Field day_showers
	 */
	day_showers,
	/**
	 * Field day_sleet
	 */
	day_sleet,
	/**
	 * Field day_sleet_storm
	 */
	day_sleet_storm,
	/**
	 * Field day_snow
	 */
	day_snow,
	/**
	 * Field day_snow_thunderstorm
	 */
	day_snow_thunderstorm,
	/**
	 * Field day_snow_wind
	 */
	day_snow_wind,
	/**
	 * Field day_sprinkle
	 */
	day_sprinkle,
	/**
	 * Field day_storm_showers
	 */
	day_storm_showers,
	/**
	 * Field day_sunny_overcast
	 */
	day_sunny_overcast,
	/**
	 * Field day_thunderstorm
	 */
	day_thunderstorm,
	/**
	 * Field day_windy
	 */
	day_windy,
	/**
	 * Field solar_eclipse
	 */
	solar_eclipse,
	/**
	 * Field hot
	 */
	hot,
	/**
	 * Field day_cloudy_high
	 */
	day_cloudy_high,
	/**
	 * Field day_light_wind
	 */
	day_light_wind,
	/**
	 * Field night_clear
	 */
	night_clear,
	/**
	 * Field night_alt_cloudy
	 */
	night_alt_cloudy,
	/**
	 * Field night_alt_cloudy_gusts
	 */
	night_alt_cloudy_gusts,
	/**
	 * Field night_alt_cloudy_windy
	 */
	night_alt_cloudy_windy,
	/**
	 * Field night_alt_hail
	 */
	night_alt_hail,
	/**
	 * Field night_alt_lightning
	 */
	night_alt_lightning,
	/**
	 * Field night_alt_rain
	 */
	night_alt_rain,
	/**
	 * Field night_alt_rain_mix
	 */
	night_alt_rain_mix,
	/**
	 * Field night_alt_rain_wind
	 */
	night_alt_rain_wind,
	/**
	 * Field night_alt_showers
	 */
	night_alt_showers,
	/**
	 * Field night_alt_sleet
	 */
	night_alt_sleet,
	/**
	 * Field night_alt_sleet_storm
	 */
	night_alt_sleet_storm,
	/**
	 * Field night_alt_snow
	 */
	night_alt_snow,
	/**
	 * Field night_alt_snow_thunderstorm
	 */
	night_alt_snow_thunderstorm,
	/**
	 * Field night_alt_snow_wind
	 */
	night_alt_snow_wind,
	/**
	 * Field night_alt_sprinkle
	 */
	night_alt_sprinkle,
	/**
	 * Field night_alt_storm_showers
	 */
	night_alt_storm_showers,
	/**
	 * Field night_alt_thunderstorm
	 */
	night_alt_thunderstorm,
	/**
	 * Field night_cloudy
	 */
	night_cloudy,
	/**
	 * Field night_cloudy_gusts
	 */
	night_cloudy_gusts,
	/**
	 * Field night_cloudy_windy
	 */
	night_cloudy_windy,
	/**
	 * Field night_fog
	 */
	night_fog,
	/**
	 * Field night_hail
	 */
	night_hail,
	/**
	 * Field night_lightning
	 */
	night_lightning,
	/**
	 * Field night_partly_cloudy
	 */
	night_partly_cloudy,
	/**
	 * Field night_rain
	 */
	night_rain,
	/**
	 * Field night_rain_mix
	 */
	night_rain_mix,
	/**
	 * Field night_rain_wind
	 */
	night_rain_wind,
	/**
	 * Field night_showers
	 */
	night_showers,
	/**
	 * Field night_sleet
	 */
	night_sleet,
	/**
	 * Field night_sleet_storm
	 */
	night_sleet_storm,
	/**
	 * Field night_snow
	 */
	night_snow,
	/**
	 * Field night_snow_thunderstorm
	 */
	night_snow_thunderstorm,
	/**
	 * Field night_snow_wind
	 */
	night_snow_wind,
	/**
	 * Field night_sprinkle
	 */
	night_sprinkle,
	/**
	 * Field night_storm_showers
	 */
	night_storm_showers,
	/**
	 * Field night_thunderstorm
	 */
	night_thunderstorm,
	/**
	 * Field lunar_eclipse
	 */
	lunar_eclipse,
	/**
	 * Field stars
	 */
	stars,
	/**
	 * Field storm_showers
	 */
	storm_showers,
	/**
	 * Field thunderstorm
	 */
	thunderstorm,
	/**
	 * Field night_alt_cloudy_high
	 */
	night_alt_cloudy_high,
	/**
	 * Field night_cloudy_high
	 */
	night_cloudy_high,
	/**
	 * Field night_alt_partly_cloudy
	 */
	night_alt_partly_cloudy,
	/**
	 * Field cloud
	 */
	cloud,
	/**
	 * Field cloudy
	 */
	cloudy,
	/**
	 * Field cloudy_gusts
	 */
	cloudy_gusts,
	/**
	 * Field cloudy_windy
	 */
	cloudy_windy,
	/**
	 * Field fog
	 */
	fog,
	/**
	 * Field hail
	 */
	hail,
	/**
	 * Field rain
	 */
	rain,
	/**
	 * Field rain_mix
	 */
	rain_mix,
	/**
	 * Field rain_wind
	 */
	rain_wind,
	/**
	 * Field showers
	 */
	showers,
	/**
	 * Field sleet
	 */
	sleet,
	/**
	 * Field snow
	 */
	snow,
	/**
	 * Field sprinkle
	 */
	sprinkle,
	/**
	 * Field snow_wind
	 */
	snow_wind,
	/**
	 * Field smog
	 */
	smog,
	/**
	 * Field smoke
	 */
	smoke,
	/**
	 * Field lightning
	 */
	lightning,
	/**
	 * Field raindrops
	 */
	raindrops,
	/**
	 * Field raindrop
	 */
	raindrop,
	/**
	 * Field dust
	 */
	dust,
	/**
	 * Field snowflake_cold
	 */
	snowflake_cold,
	/**
	 * Field windy
	 */
	windy,
	/**
	 * Field strong_wind
	 */
	strong_wind,
	/**
	 * Field sandstorm
	 */
	sandstorm,
	/**
	 * Field earthquake
	 */
	earthquake,
	/**
	 * Field fire
	 */
	fire,
	/**
	 * Field flood
	 */
	flood,
	/**
	 * Field meteor
	 */
	meteor,
	/**
	 * Field tsunami
	 */
	tsunami,
	/**
	 * Field volcano
	 */
	volcano,
	/**
	 * Field hurricane
	 */
	hurricane,
	/**
	 * Field tornado
	 */
	tornado,
	/**
	 * Field small_craft_advisory
	 */
	small_craft_advisory,
	/**
	 * Field gale_warning
	 */
	gale_warning,
	/**
	 * Field storm_warning
	 */
	storm_warning,
	/**
	 * Field hurricane_warning
	 */
	hurricane_warning,
	/**
	 * Field wind_direction
	 */
	wind_direction,
	/**
	 * Field alien
	 */
	alien,
	/**
	 * Field celsius
	 */
	celsius,
	/**
	 * Field fahrenheit
	 */
	fahrenheit,
	/**
	 * Field degrees
	 */
	degrees,
	/**
	 * Field thermometer
	 */
	thermometer,
	/**
	 * Field thermometer_exterior
	 */
	thermometer_exterior,
	/**
	 * Field thermometer_internal
	 */
	thermometer_internal,
	/**
	 * Field cloud_down
	 */
	cloud_down,
	/**
	 * Field cloud_up
	 */
	cloud_up,
	/**
	 * Field cloud_refresh
	 */
	cloud_refresh,
	/**
	 * Field horizon
	 */
	horizon,
	/**
	 * Field horizon_alt
	 */
	horizon_alt,
	/**
	 * Field sunrise
	 */
	sunrise,
	/**
	 * Field sunset
	 */
	sunset,
	/**
	 * Field moonrise
	 */
	moonrise,
	/**
	 * Field moonset
	 */
	moonset,
	/**
	 * Field refresh
	 */
	refresh,
	/**
	 * Field refresh_alt
	 */
	refresh_alt,
	/**
	 * Field umbrella
	 */
	umbrella,
	/**
	 * Field barometer
	 */
	barometer,
	/**
	 * Field humidity
	 */
	humidity,
	/**
	 * Field na
	 */
	na,
	/**
	 * Field train
	 */
	train,
	/**
	 * Field moon_new
	 */
	moon_new,
	/**
	 * Field moon_waxing_crescent_1
	 */
	moon_waxing_crescent_1,
	/**
	 * Field moon_waxing_crescent_2
	 */
	moon_waxing_crescent_2,
	/**
	 * Field moon_waxing_crescent_3
	 */
	moon_waxing_crescent_3,
	/**
	 * Field moon_waxing_crescent_4
	 */
	moon_waxing_crescent_4,
	/**
	 * Field moon_waxing_crescent_5
	 */
	moon_waxing_crescent_5,
	/**
	 * Field moon_waxing_crescent_6
	 */
	moon_waxing_crescent_6,
	/**
	 * Field moon_first_quarter
	 */
	moon_first_quarter,
	/**
	 * Field moon_waxing_gibbous_1
	 */
	moon_waxing_gibbous_1,
	/**
	 * Field moon_waxing_gibbous_2
	 */
	moon_waxing_gibbous_2,
	/**
	 * Field moon_waxing_gibbous_3
	 */
	moon_waxing_gibbous_3,
	/**
	 * Field moon_waxing_gibbous_4
	 */
	moon_waxing_gibbous_4,
	/**
	 * Field moon_waxing_gibbous_5
	 */
	moon_waxing_gibbous_5,
	/**
	 * Field moon_waxing_gibbous_6
	 */
	moon_waxing_gibbous_6,
	/**
	 * Field moon_full
	 */
	moon_full,
	/**
	 * Field moon_waning_gibbous_1
	 */
	moon_waning_gibbous_1,
	/**
	 * Field moon_waning_gibbous_2
	 */
	moon_waning_gibbous_2,
	/**
	 * Field moon_waning_gibbous_3
	 */
	moon_waning_gibbous_3,
	/**
	 * Field moon_waning_gibbous_4
	 */
	moon_waning_gibbous_4,
	/**
	 * Field moon_waning_gibbous_5
	 */
	moon_waning_gibbous_5,
	/**
	 * Field moon_waning_gibbous_6
	 */
	moon_waning_gibbous_6,
	/**
	 * Field moon_third_quarter
	 */
	moon_third_quarter,
	/**
	 * Field moon_waning_crescent_1
	 */
	moon_waning_crescent_1,
	/**
	 * Field moon_waning_crescent_2
	 */
	moon_waning_crescent_2,
	/**
	 * Field moon_waning_crescent_3
	 */
	moon_waning_crescent_3,
	/**
	 * Field moon_waning_crescent_4
	 */
	moon_waning_crescent_4,
	/**
	 * Field moon_waning_crescent_5
	 */
	moon_waning_crescent_5,
	/**
	 * Field moon_waning_crescent_6
	 */
	moon_waning_crescent_6,
	/**
	 * Field moon_alt_new
	 */
	moon_alt_new,
	/**
	 * Field moon_alt_waxing_crescent_1
	 */
	moon_alt_waxing_crescent_1,
	/**
	 * Field moon_alt_waxing_crescent_2
	 */
	moon_alt_waxing_crescent_2,
	/**
	 * Field moon_alt_waxing_crescent_3
	 */
	moon_alt_waxing_crescent_3,
	/**
	 * Field moon_alt_waxing_crescent_4
	 */
	moon_alt_waxing_crescent_4,
	/**
	 * Field moon_alt_waxing_crescent_5
	 */
	moon_alt_waxing_crescent_5,
	/**
	 * Field moon_alt_waxing_crescent_6
	 */
	moon_alt_waxing_crescent_6,
	/**
	 * Field moon_alt_first_quarter
	 */
	moon_alt_first_quarter,
	/**
	 * Field moon_alt_waxing_gibbous_1
	 */
	moon_alt_waxing_gibbous_1,
	/**
	 * Field moon_alt_waxing_gibbous_2
	 */
	moon_alt_waxing_gibbous_2,
	/**
	 * Field moon_alt_waxing_gibbous_3
	 */
	moon_alt_waxing_gibbous_3,
	/**
	 * Field moon_alt_waxing_gibbous_4
	 */
	moon_alt_waxing_gibbous_4,
	/**
	 * Field moon_alt_waxing_gibbous_5
	 */
	moon_alt_waxing_gibbous_5,
	/**
	 * Field moon_alt_waxing_gibbous_6
	 */
	moon_alt_waxing_gibbous_6,
	/**
	 * Field moon_alt_full
	 */
	moon_alt_full,
	/**
	 * Field moon_alt_waning_gibbous_1
	 */
	moon_alt_waning_gibbous_1,
	/**
	 * Field moon_alt_waning_gibbous_2
	 */
	moon_alt_waning_gibbous_2,
	/**
	 * Field moon_alt_waning_gibbous_3
	 */
	moon_alt_waning_gibbous_3,
	/**
	 * Field moon_alt_waning_gibbous_4
	 */
	moon_alt_waning_gibbous_4,
	/**
	 * Field moon_alt_waning_gibbous_5
	 */
	moon_alt_waning_gibbous_5,
	/**
	 * Field moon_alt_waning_gibbous_6
	 */
	moon_alt_waning_gibbous_6,
	/**
	 * Field moon_alt_third_quarter
	 */
	moon_alt_third_quarter,
	/**
	 * Field moon_alt_waning_crescent_1
	 */
	moon_alt_waning_crescent_1,
	/**
	 * Field moon_alt_waning_crescent_2
	 */
	moon_alt_waning_crescent_2,
	/**
	 * Field moon_alt_waning_crescent_3
	 */
	moon_alt_waning_crescent_3,
	/**
	 * Field moon_alt_waning_crescent_4
	 */
	moon_alt_waning_crescent_4,
	/**
	 * Field moon_alt_waning_crescent_5
	 */
	moon_alt_waning_crescent_5,
	/**
	 * Field moon_alt_waning_crescent_6
	 */
	moon_alt_waning_crescent_6,
	/**
	 * Field time_1
	 */
	time_1,
	/**
	 * Field time_2
	 */
	time_2,
	/**
	 * Field time_3
	 */
	time_3,
	/**
	 * Field time_4
	 */
	time_4,
	/**
	 * Field time_5
	 */
	time_5,
	/**
	 * Field time_6
	 */
	time_6,
	/**
	 * Field time_7
	 */
	time_7,
	/**
	 * Field time_8
	 */
	time_8,
	/**
	 * Field time_9
	 */
	time_9,
	/**
	 * Field time_10
	 */
	time_10,
	/**
	 * Field time_11
	 */
	time_11,
	/**
	 * Field time_12
	 */
	time_12,
	/**
	 * Field direction_up
	 */
	direction_up,
	/**
	 * Field direction_up_right
	 */
	direction_up_right,
	/**
	 * Field direction_right
	 */
	direction_right,
	/**
	 * Field direction_down_right
	 */
	direction_down_right,
	/**
	 * Field direction_down
	 */
	direction_down,
	/**
	 * Field direction_down_left
	 */
	direction_down_left,
	/**
	 * Field direction_left
	 */
	direction_left,
	/**
	 * Field direction_up_left
	 */
	direction_up_left,
	/**
	 * Field towards_0_deg
	 */
	towards_0_deg,
	/**
	 * Field towards_23_deg
	 */
	towards_23_deg,
	/**
	 * Field towards_45_deg
	 */
	towards_45_deg,
	/**
	 * Field towards_68_deg
	 */
	towards_68_deg,
	/**
	 * Field towards_90_deg
	 */
	towards_90_deg,
	/**
	 * Field towards_113_deg
	 */
	towards_113_deg,
	/**
	 * Field towards_135_deg
	 */
	towards_135_deg,
	/**
	 * Field towards_158_deg
	 */
	towards_158_deg,
	/**
	 * Field towards_180_deg
	 */
	towards_180_deg,
	/**
	 * Field towards_203_deg
	 */
	towards_203_deg,
	/**
	 * Field towards_225_deg
	 */
	towards_225_deg,
	/**
	 * Field towards_248_deg
	 */
	towards_248_deg,
	/**
	 * Field towards_270_deg
	 */
	towards_270_deg,
	/**
	 * Field towards_293_deg
	 */
	towards_293_deg,
	/**
	 * Field towards_313_deg
	 */
	towards_313_deg,
	/**
	 * Field towards_336_deg
	 */
	towards_336_deg,
	/**
	 * Field from_180_deg
	 */
	from_180_deg,
	/**
	 * Field from_203_deg
	 */
	from_203_deg,
	/**
	 * Field from_225_deg
	 */
	from_225_deg,
	/**
	 * Field from_248_deg
	 */
	from_248_deg,
	/**
	 * Field from_270_deg
	 */
	from_270_deg,
	/**
	 * Field from_293_deg
	 */
	from_293_deg,
	/**
	 * Field from_313_deg
	 */
	from_313_deg,
	/**
	 * Field from_336_deg
	 */
	from_336_deg,
	/**
	 * Field from_0_deg
	 */
	from_0_deg,
	/**
	 * Field from_23_deg
	 */
	from_23_deg,
	/**
	 * Field from_45_deg
	 */
	from_45_deg,
	/**
	 * Field from_68_deg
	 */
	from_68_deg,
	/**
	 * Field from_90_deg
	 */
	from_90_deg,
	/**
	 * Field from_113_deg
	 */
	from_113_deg,
	/**
	 * Field from_135_deg
	 */
	from_135_deg,
	/**
	 * Field from_158_deg
	 */
	from_158_deg,
	/**
	 * Field towards_n
	 */
	towards_n,
	/**
	 * Field towards_nne
	 */
	towards_nne,
	/**
	 * Field towards_ne
	 */
	towards_ne,
	/**
	 * Field towards_ene
	 */
	towards_ene,
	/**
	 * Field towards_e
	 */
	towards_e,
	/**
	 * Field towards_ese
	 */
	towards_ese,
	/**
	 * Field towards_se
	 */
	towards_se,
	/**
	 * Field towards_sse
	 */
	towards_sse,
	/**
	 * Field towards_s
	 */
	towards_s,
	/**
	 * Field towards_ssw
	 */
	towards_ssw,
	/**
	 * Field towards_sw
	 */
	towards_sw,
	/**
	 * Field towards_wsw
	 */
	towards_wsw,
	/**
	 * Field towards_w
	 */
	towards_w,
	/**
	 * Field towards_wnw
	 */
	towards_wnw,
	/**
	 * Field towards_nw
	 */
	towards_nw,
	/**
	 * Field towards_nnw
	 */
	towards_nnw,
	/**
	 * Field from_n
	 */
	from_n,
	/**
	 * Field from_nne
	 */
	from_nne,
	/**
	 * Field from_ne
	 */
	from_ne,
	/**
	 * Field from_ene
	 */
	from_ene,
	/**
	 * Field from_e
	 */
	from_e,
	/**
	 * Field from_ese
	 */
	from_ese,
	/**
	 * Field from_se
	 */
	from_se,
	/**
	 * Field from_sse
	 */
	from_sse,
	/**
	 * Field from_s
	 */
	from_s,
	/**
	 * Field from_ssw
	 */
	from_ssw,
	/**
	 * Field from_sw
	 */
	from_sw,
	/**
	 * Field from_wsw
	 */
	from_wsw,
	/**
	 * Field from_w
	 */
	from_w,
	/**
	 * Field from_wnw
	 */
	from_wnw,
	/**
	 * Field from_nw
	 */
	from_nw,
	/**
	 * Field from_nnw
	 */
	from_nnw,
	/**
	 * Field wind_beaufort_0
	 */
	wind_beaufort_0,
	/**
	 * Field wind_beaufort_1
	 */
	wind_beaufort_1,
	/**
	 * Field wind_beaufort_2
	 */
	wind_beaufort_2,
	/**
	 * Field wind_beaufort_3
	 */
	wind_beaufort_3,
	/**
	 * Field wind_beaufort_4
	 */
	wind_beaufort_4,
	/**
	 * Field wind_beaufort_5
	 */
	wind_beaufort_5,
	/**
	 * Field wind_beaufort_6
	 */
	wind_beaufort_6,
	/**
	 * Field wind_beaufort_7
	 */
	wind_beaufort_7,
	/**
	 * Field wind_beaufort_8
	 */
	wind_beaufort_8,
	/**
	 * Field wind_beaufort_9
	 */
	wind_beaufort_9,
	/**
	 * Field wind_beaufort_10
	 */
	wind_beaufort_10,
	/**
	 * Field wind_beaufort_11
	 */
	wind_beaufort_11,
	/**
	 * Field wind_beaufort_12
	 */
	wind_beaufort_12,

	;

	@Override
	public String toString()
	{
		return "wi-" + name().toLowerCase()
		                     .replace(CHAR_UNDERSCORE, CHAR_DASH);
	}


}
