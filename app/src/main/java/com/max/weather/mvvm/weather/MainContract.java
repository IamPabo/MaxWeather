package com.max.weather.mvvm.weather;

import com.max.weather.mvvm.weather.bean.WeatherBean;

import rx.Observable;

/**
 * @auther MaxLiu
 * @time 2017/1/20
 */

class MainContract {

    interface IModel{

        /**
         * 根据经纬度获取当前的天气和城市信息
         * @param type 经纬度类型
         * @param longitude 经度
         * @param latitude 纬度
         * @return Observable<WeatherBean>
         */
        Observable<WeatherBean> getWeatherFromLocation(
                String type,String longitude,String latitude
        );

        Observable<WeatherBean> getWeatherFromCity(
                String type,String longitude,String latitude
        );
    }
}
