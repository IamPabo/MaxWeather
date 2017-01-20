package com.max.weather.mvvm.weather;

import android.util.Log;

import com.max.weather.http.ApiDefault;
import com.max.weather.mvvm.weather.bean.CityBean;
import com.max.weather.mvvm.weather.bean.NowBean;
import com.max.weather.mvvm.weather.bean.WeatherBean;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

import static android.content.ContentValues.TAG;

/**
 * @auther MaxLiu
 * @time 2017/1/20
 */

public class MainModel implements MainConstract.IModel{

    public static final String LOCATION_BAIDU = "5";
    private WeatherBean mWeatherBean;

    @Override
    public WeatherBean requestData(String type, String longitude, String latitude) {
        if(type == null)type = LOCATION_BAIDU;
        ApiDefault.getApiService().getLocationWeather(
                type,
                longitude,latitude,
                "0","1","1","1","1")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<WeatherBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d(TAG,"failed -> " + e.toString());
                    }

                    @Override
                    public void onNext(WeatherBean weatherBean) {
                        Log.d(TAG,"success -> " + weatherBean.toString());
                        mWeatherBean = weatherBean;
                    }
                });
        return mWeatherBean;
    }

    @Override
    public NowBean getNowWeather(WeatherBean weatherBean) {
        return null;
    }

    @Override
    public CityBean getCity(WeatherBean weatherBean) {
        return null;
    }

}
