package com.max.weather.mvvm.weather;

import android.databinding.BindingAdapter;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.max.weather.databinding.ActivityMainBinding;
import com.max.weather.mvvm.weather.bean.CityBean;
import com.max.weather.mvvm.weather.bean.NowBean;
import com.max.weather.mvvm.weather.bean.WeatherBean;
import com.max.weather.untils.WeatherUtil;

/**
 * @auther MaxLiu
 * @time 2017/1/19
 */

public class MainViewModel{

    private static final String TAG = "MainViewModel";

    private static final String CUSTOM_FONT = "fonts/fangyuan.ttf";

    private AppCompatActivity activity;
    private ActivityMainBinding mBinding;
    private MainConstract.IModel IModel;
    private WeatherBean weatherBean;

    MainViewModel(AppCompatActivity activity, ActivityMainBinding binding){
        mBinding = binding;
        this.activity = activity;
        IModel = new MainModel();
        initTextStyle();
        loadWeather();
    }

    /**
     * 获取数据并刷新View
     */
    private void loadWeather() {
        String longitude = "116.2278";
        String latitude = "40.242266";
        weatherBean = IModel.requestData(MainModel.LOCATION_BAIDU,longitude,latitude);
        NowBean nowWeather = weatherBean.getShowapiResBody().getNow();
        CityBean cityInfo = weatherBean.getShowapiResBody().getCityInfo();
        mBinding.setNowWeather(nowWeather);
        mBinding.setWeatherIcon(nowWeather.getWeatherCode());
        mBinding.setNowCity(cityInfo);
    }

    /**
     * 初始化字体
     */
    private void initTextStyle() {
        Typeface customFont = Typeface.createFromAsset(activity.getAssets(), CUSTOM_FONT);
        mBinding.infoWeather.setTypeface(customFont);
        mBinding.infoCity.setTypeface(customFont);
    }

    /**
     * 根据天气信息更新天气图标
     * @param view ImageView
     * @param weatherCode 数据得到的weatherCode
     */
    @BindingAdapter({"icon"})
    public static void setWeatherIcon(ImageView view, String weatherCode) {
        if (weatherCode != null) {
            view.setImageResource(WeatherUtil.getRsId(weatherCode));
        }
    }
}
