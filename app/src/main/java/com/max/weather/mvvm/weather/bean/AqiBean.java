package com.max.weather.mvvm.weather.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AqiBean {

    @SerializedName("co")
    @Expose
    private Double co;
    @SerializedName("so2")
    @Expose
    private Integer so2;
    @SerializedName("area")
    @Expose
    private String area;
    @SerializedName("o3")
    @Expose
    private Integer o3;
    @SerializedName("no2")
    @Expose
    private Integer no2;
    @SerializedName("area_code")
    @Expose
    private String areaCode;
    @SerializedName("quality")
    @Expose
    private String quality;
    @SerializedName("aqi")
    @Expose
    private Integer aqi;
    @SerializedName("pm10")
    @Expose
    private Integer pm10;
    @SerializedName("pm2_5")
    @Expose
    private Integer pm25;
    @SerializedName("o3_8h")
    @Expose
    private Integer o38h;
    @SerializedName("primary_pollutant")
    @Expose
    private String primaryPollutant;

    public Double getCo() {
        return co;
    }

    public void setCo(Double co) {
        this.co = co;
    }

    public Integer getSo2() {
        return so2;
    }

    public void setSo2(Integer so2) {
        this.so2 = so2;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Integer getO3() {
        return o3;
    }

    public void setO3(Integer o3) {
        this.o3 = o3;
    }

    public Integer getNo2() {
        return no2;
    }

    public void setNo2(Integer no2) {
        this.no2 = no2;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public Integer getAqi() {
        return aqi;
    }

    public void setAqi(Integer aqi) {
        this.aqi = aqi;
    }

    public Integer getPm10() {
        return pm10;
    }

    public void setPm10(Integer pm10) {
        this.pm10 = pm10;
    }

    public Integer getPm25() {
        return pm25;
    }

    public void setPm25(Integer pm25) {
        this.pm25 = pm25;
    }

    public Integer getO38h() {
        return o38h;
    }

    public void setO38h(Integer o38h) {
        this.o38h = o38h;
    }

    public String getPrimaryPollutant() {
        return primaryPollutant;
    }

    public void setPrimaryPollutant(String primaryPollutant) {
        this.primaryPollutant = primaryPollutant;
    }

}