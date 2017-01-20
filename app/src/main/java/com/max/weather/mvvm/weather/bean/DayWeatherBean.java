package com.max.weather.mvvm.weather.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DayWeatherBean {

    @SerializedName("day_weather")
    @Expose
    private String dayWeather;
    @SerializedName("night_weather")
    @Expose
    private String nightWeather;
    @SerializedName("night_weather_code")
    @Expose
    private String nightWeatherCode;
    @SerializedName("air_press")
    @Expose
    private String airPress;
    @SerializedName("jiangshui")
    @Expose
    private String jiangshui;
    @SerializedName("night_wind_power")
    @Expose
    private String nightWindPower;
    @SerializedName("day_wind_power")
    @Expose
    private String dayWindPower;
    @SerializedName("day_weather_code")
    @Expose
    private String dayWeatherCode;
    @SerializedName("sun_begin_end")
    @Expose
    private String sunBeginEnd;
    @SerializedName("ziwaixian")
    @Expose
    private String ziwaixian;
    @SerializedName("day_weather_pic")
    @Expose
    private String dayWeatherPic;
    @SerializedName("weekday")
    @Expose
    private Integer weekday;
    @SerializedName("night_air_temperature")
    @Expose
    private String nightAirTemperature;
    @SerializedName("day_air_temperature")
    @Expose
    private String dayAirTemperature;
    @SerializedName("day_wind_direction")
    @Expose
    private String dayWindDirection;
    @SerializedName("day")
    @Expose
    private String day;
    @SerializedName("night_weather_pic")
    @Expose
    private String nightWeatherPic;
    @SerializedName("night_wind_direction")
    @Expose
    private String nightWindDirection;

    public String getDayWeather() {
        return dayWeather;
    }

    public void setDayWeather(String dayWeather) {
        this.dayWeather = dayWeather;
    }

    public String getNightWeather() {
        return nightWeather;
    }

    public void setNightWeather(String nightWeather) {
        this.nightWeather = nightWeather;
    }

    public String getNightWeatherCode() {
        return nightWeatherCode;
    }

    public void setNightWeatherCode(String nightWeatherCode) {
        this.nightWeatherCode = nightWeatherCode;
    }

    public String getAirPress() {
        return airPress;
    }

    public void setAirPress(String airPress) {
        this.airPress = airPress;
    }

    public String getJiangshui() {
        return jiangshui;
    }

    public void setJiangshui(String jiangshui) {
        this.jiangshui = jiangshui;
    }

    public String getNightWindPower() {
        return nightWindPower;
    }

    public void setNightWindPower(String nightWindPower) {
        this.nightWindPower = nightWindPower;
    }

    public String getDayWindPower() {
        return dayWindPower;
    }

    public void setDayWindPower(String dayWindPower) {
        this.dayWindPower = dayWindPower;
    }

    public String getDayWeatherCode() {
        return dayWeatherCode;
    }

    public void setDayWeatherCode(String dayWeatherCode) {
        this.dayWeatherCode = dayWeatherCode;
    }

    public String getSunBeginEnd() {
        return sunBeginEnd;
    }

    public void setSunBeginEnd(String sunBeginEnd) {
        this.sunBeginEnd = sunBeginEnd;
    }

    public String getZiwaixian() {
        return ziwaixian;
    }

    public void setZiwaixian(String ziwaixian) {
        this.ziwaixian = ziwaixian;
    }

    public String getDayWeatherPic() {
        return dayWeatherPic;
    }

    public void setDayWeatherPic(String dayWeatherPic) {
        this.dayWeatherPic = dayWeatherPic;
    }

    public Integer getWeekday() {
        return weekday;
    }

    public void setWeekday(Integer weekday) {
        this.weekday = weekday;
    }

    public String getNightAirTemperature() {
        return nightAirTemperature;
    }

    public void setNightAirTemperature(String nightAirTemperature) {
        this.nightAirTemperature = nightAirTemperature;
    }

    public String getDayAirTemperature() {
        return dayAirTemperature;
    }

    public void setDayAirTemperature(String dayAirTemperature) {
        this.dayAirTemperature = dayAirTemperature;
    }

    public String getDayWindDirection() {
        return dayWindDirection;
    }

    public void setDayWindDirection(String dayWindDirection) {
        this.dayWindDirection = dayWindDirection;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getNightWeatherPic() {
        return nightWeatherPic;
    }

    public void setNightWeatherPic(String nightWeatherPic) {
        this.nightWeatherPic = nightWeatherPic;
    }

    public String getNightWindDirection() {
        return nightWindDirection;
    }

    public void setNightWindDirection(String nightWindDirection) {
        this.nightWindDirection = nightWindDirection;
    }

}