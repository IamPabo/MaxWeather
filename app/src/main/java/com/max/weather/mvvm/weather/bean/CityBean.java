package com.max.weather.mvvm.weather.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.max.weather.BR;

public class CityBean extends BaseObservable {

    @SerializedName("c6")
    @Expose
    private String c6;
    @SerializedName("c5")
    @Expose
    private String c5;
    @SerializedName("c4")
    @Expose
    private String c4;
    @SerializedName("c3")
    @Expose
    private String c3;
    @SerializedName("c9")
    @Expose
    private String c9;
    @SerializedName("c8")
    @Expose
    private String c8;
    @SerializedName("c7")
    @Expose
    private String c7;
    @SerializedName("c17")
    @Expose
    private String c17;
    @SerializedName("c16")
    @Expose
    private String c16;
    @SerializedName("c1")
    @Expose
    private String c1;
    @SerializedName("c2")
    @Expose
    private String c2;
    @SerializedName("c11")
    @Expose
    private String c11;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    @SerializedName("c10")
    @Expose
    private String c10;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("c12")
    @Expose
    private String c12;
    @SerializedName("c15")
    @Expose
    private String c15;

    public String getC6() {
        return c6;
    }

    public void setC6(String c6) {
        this.c6 = c6;
    }

    public String getC5() {
        return c5;
    }

    public void setC5(String c5) {
        this.c5 = c5;
    }

    public String getC4() {
        return c4;
    }

    public void setC4(String c4) {
        this.c4 = c4;
    }

    @Bindable
    public String getC3() {
        return c3;
    }

    public void setC3(String c3) {
        this.c3 = c3;
        notifyPropertyChanged(BR.c3);
    }

    public String getC9() {
        return c9;
    }

    public void setC9(String c9) {
        this.c9 = c9;
    }

    public String getC8() {
        return c8;
    }

    public void setC8(String c8) {
        this.c8 = c8;
    }

    public String getC7() {
        return c7;
    }

    public void setC7(String c7) {
        this.c7 = c7;
    }

    public String getC17() {
        return c17;
    }

    public void setC17(String c17) {
        this.c17 = c17;
    }

    public String getC16() {
        return c16;
    }

    public void setC16(String c16) {
        this.c16 = c16;
    }

    public String getC1() {
        return c1;
    }

    public void setC1(String c1) {
        this.c1 = c1;
    }

    public String getC2() {
        return c2;
    }

    public void setC2(String c2) {
        this.c2 = c2;
    }

    public String getC11() {
        return c11;
    }

    public void setC11(String c11) {
        this.c11 = c11;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getC10() {
        return c10;
    }

    public void setC10(String c10) {
        this.c10 = c10;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getC12() {
        return c12;
    }

    public void setC12(String c12) {
        this.c12 = c12;
    }

    public String getC15() {
        return c15;
    }

    public void setC15(String c15) {
        this.c15 = c15;
    }

}