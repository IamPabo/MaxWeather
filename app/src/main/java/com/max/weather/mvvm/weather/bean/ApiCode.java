package com.max.weather.mvvm.weather.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ApiCode {

    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("ret_code")
    @Expose
    private Integer retCode;
    @SerializedName("cityInfo")
    @Expose
    private CityBean cityInfo;
    @SerializedName("now")
    @Expose
    private NowBean now;
    @SerializedName("f1")
    @Expose
    private DayWeatherBean f1;
    @SerializedName("f3")
    @Expose
    private F3 f3;
    @SerializedName("f2")
    @Expose
    private F2 f2;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getRetCode() {
        return retCode;
    }

    public void setRetCode(Integer retCode) {
        this.retCode = retCode;
    }

    public CityBean getCityInfo() {
        return cityInfo;
    }

    public void setCityInfo(CityBean cityInfo) {
        this.cityInfo = cityInfo;
    }

    public NowBean getNow() {
        return now;
    }

    public void setNow(NowBean now) {
        this.now = now;
    }

    public DayWeatherBean getF1() {
        return f1;
    }

    public void setF1(DayWeatherBean f1) {
        this.f1 = f1;
    }

    public F3 getF3() {
        return f3;
    }

    public void setF3(F3 f3) {
        this.f3 = f3;
    }

    public F2 getF2() {
        return f2;
    }

    public void setF2(F2 f2) {
        this.f2 = f2;
    }

}