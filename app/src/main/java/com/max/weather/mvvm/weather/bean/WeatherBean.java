package com.max.weather.mvvm.weather.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WeatherBean {

    @SerializedName("showapi_res_code")
    @Expose
    private Integer showapiResCode;
    @SerializedName("showapi_res_error")
    @Expose
    private String showapiResError;
    @SerializedName("showapi_res_body")
    @Expose
    private ApiCode showapiResBody;

    public Integer getShowapiResCode() {
        return showapiResCode;
    }

    public void setShowapiResCode(Integer showapiResCode) {
        this.showapiResCode = showapiResCode;
    }

    public String getShowapiResError() {
        return showapiResError;
    }

    public void setShowapiResError(String showapiResError) {
        this.showapiResError = showapiResError;
    }

    public ApiCode getShowapiResBody() {
        return showapiResBody;
    }

    public void setShowapiResBody(ApiCode showapiResBody) {
        this.showapiResBody = showapiResBody;
    }

}