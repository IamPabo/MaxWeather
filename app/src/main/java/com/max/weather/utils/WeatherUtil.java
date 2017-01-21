package com.max.weather.utils;

import com.max.weather.R;

/**
 * @auther MaxLiu
 * @time 2017/1/19
 */

public class WeatherUtil {

    /**
     * 根据天气的不同返回不同的icon
     * @param code 接口返回的weahterCode
     * @return drawable/icon
     */
    public static int getRsId(String code){
        switch (code){
            case WeatherCodeManager.SUNNY:
                return R.drawable.icon_sun;
            case WeatherCodeManager.CLOUDY:
                return R.drawable.icon_cloudy_day;
            case WeatherCodeManager.YIN:
                return R.drawable.icon_cloudy;
            default:
                return R.drawable.icon_sun;
        }
    }
}
