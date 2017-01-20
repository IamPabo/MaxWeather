package com.max.weather.http;

import com.max.weather.mvvm.weather.bean.WeatherBean;

import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * @auther MaxLiu
 * @time 2017/1/19
 */

public interface ApiService {

    /**
     * 根据定位经纬度获取当前天气信息
     *
     * @param form             输入的坐标类型：1：GPS设备获取的角度坐标;
     *                         2：GPS获取的米制坐标、sogou地图所用坐标;
     *                         3：google地图、soso地图、aliyun地图、mapabc地图和amap地图所用坐标
     *                         4：3中列表地图坐标对应的米制坐标
     *                         5：百度地图采用的经纬度坐标
     *                         6：百度地图采用的米制坐标
     *                         7：mapbar地图坐标;
     *                         8：51地图坐标
     * @param longitude        经度
     * @param latitude         纬度
     * @param needMoreDay      是否需要返回7天数据中的后4天。1为返回，0为不返回。
     * @param needIndex        是否需要返回指数数据，比如穿衣指数、紫外线指数等。1为返回，0为不返回。
     * @param needHourData     是否需要每小时数据的累积数组。由于本系统是半小时刷一次实时状态，因此实时数组最大长度为48。每天0点长度初始化为0.
     *                         1为需要
     *                         0为不
     * @param need3HourForcast 是否需要当天每3/6小时一次的天气预报列表。1为需要，0为不需要。
     * @param needAlarm        是否需要天气预警。1为需要，0为不需要。
     * @return Observable
     */
    @POST(Url.URL_LOCATION)
    Observable<WeatherBean> getLocationWeather(
            @Query("from") String form,
            @Query("lng") String longitude,
            @Query("lat") String latitude,
            @Query("needMoreDay") String needMoreDay,
            @Query("needIndex") String needIndex,
            @Query("needHourData") String needHourData,
            @Query("need3HourForcast") String need3HourForcast,
            @Query("needAlarm") String needAlarm);
}
