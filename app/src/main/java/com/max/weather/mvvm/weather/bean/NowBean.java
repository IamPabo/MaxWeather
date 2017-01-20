package com.max.weather.mvvm.weather.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.max.weather.BR;

public class NowBean extends BaseObservable {

    @SerializedName("aqiDetail")
    @Expose
    private AqiBean aqiDetail;
    @SerializedName("weather_code")
    @Expose
    private String weatherCode;
    @SerializedName("wind_direction")
    @Expose
    private String windDirection;
    @SerializedName("temperature_time")
    @Expose
    private String temperatureTime;
    @SerializedName("wind_power")
    @Expose
    private String windPower;
    @SerializedName("aqi")
    @Expose
    private Integer aqi;
    @SerializedName("sd")
    @Expose
    private String sd;
    @SerializedName("weather_pic")
    @Expose
    private String weatherPic;
    @SerializedName("weather")
    @Expose
    private String weather;
    @SerializedName("temperature")
    @Expose
    private String temperature;

    public NowBean(String weather,String weatherCode){
        this.weather = weather;
        this.weatherCode = weatherCode;
    }

    public AqiBean getAqiDetail() {
        return aqiDetail;
    }

    public void setAqiDetail(AqiBean aqiDetail) {
        this.aqiDetail = aqiDetail;
    }

    @Bindable
    public String getWeatherCode() {
        return weatherCode;
    }

    public void setWeatherCode(String weatherCode) {
        this.weatherCode = weatherCode;
        notifyPropertyChanged(BR.weatherCode);
    }

    @Bindable
    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
        notifyPropertyChanged(BR.windDirection);
    }

    @Bindable
    public String getTemperatureTime() {
        return temperatureTime;
    }

    public void setTemperatureTime(String temperatureTime) {
        this.temperatureTime = temperatureTime;
        notifyPropertyChanged(BR.temperatureTime);
    }

    @Bindable
    public String getWindPower() {
        return windPower;
    }

    public void setWindPower(String windPower) {
        this.windPower = windPower;
        notifyPropertyChanged(BR.windPower);
    }

    @Bindable
    public Integer getAqi() {
        return aqi;
    }

    public void setAqi(Integer aqi) {
        this.aqi = aqi;
        notifyPropertyChanged(BR.aqi);
    }

    @Bindable
    public String getSd() {
        return sd;
    }

    public void setSd(String sd) {
        this.sd = sd;
        notifyPropertyChanged(BR.sd);
    }

    @Bindable
    public String getWeatherPic() {
        return weatherPic;
    }

    public void setWeatherPic(String weatherPic) {
        this.weatherPic = weatherPic;
        notifyPropertyChanged(BR.weatherPic);
    }

    @Bindable
    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
        notifyPropertyChanged(BR.weather);
    }

    @Bindable
    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
        notifyPropertyChanged(BR.temperature);
    }

}