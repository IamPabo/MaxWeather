package com.max.weather.mvvm.weather;

import com.max.weather.http.ApiDefault;
import com.max.weather.mvvm.weather.bean.WeatherBean;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * @auther MaxLiu
 * @time 2017/1/20
 */

class MainModel implements MainConstract.IModel {

    static final String LOCATION_BAIDU = "5";

    @Override
    public Observable<WeatherBean> getWeatherFromLocation(String type, String longitude, String latitude) {
        if (type == null) type = LOCATION_BAIDU;
        return ApiDefault.getApiService().getLocationWeather(
                type,
                longitude, latitude,
                "0", "1", "1", "1", "1")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    @Override
    public Observable<WeatherBean> getWeatherFromCity(String type, String longitude, String latitude) {
        return null;
    }

}
