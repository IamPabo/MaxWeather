package com.max.weather;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.max.weather.utils.LocationService;

/**
 * @auther MaxLiu
 * @time 2017/1/19
 */

public class MyApplication extends Application {

    public LocationService locationService;
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化定位sdk，建议在Application中创建
        locationService = new LocationService(getApplicationContext());
        //初始化Fresco
        Fresco.initialize(getApplicationContext());
    }
}
