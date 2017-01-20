package com.max.weather.mvvm.weather;

import com.max.weather.mvvm.weather.bean.CityBean;
import com.max.weather.mvvm.weather.bean.NowBean;
import com.max.weather.mvvm.weather.bean.WeatherBean;

/**
 * @auther MaxLiu
 * @time 2017/1/20
 */

public class MainConstract {

    interface IModel{

        WeatherBean requestData(String type,String longitude,String latitude);

        NowBean getNowWeather(WeatherBean weatherBean);

        CityBean getCity(WeatherBean weatherBean);
    }
}
