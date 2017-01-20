package com.max.weather.http;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @auther MaxLiu
 * @time 2017/1/19
 */

public class ApiDefault {

    private static ApiService SERVICE;
    //请求超时
    private static final int DEFAULT_TIME_OUT = 10000;
    public static final String KEY_APP_ID = "showapi_appid";
    public static final String KEY_SING = "showapi_sign";
    public static final String KEY_TIME = "showapi_timestamp";
    public static final String KEY_SIGN_METHOD = "showapi_sign_method";
    public static final String KEY_GZIP = "showapi_res_gzip";

    public static final String VALUE_APP_ID = "28706";
    public static final String VALUE_SING = "f1ecc54fe30a4504831a23f8b63cb532";

    public static ApiService getApiService(){
        if(SERVICE == null){
            final OkHttpClient.Builder mClientBuilder = new OkHttpClient().newBuilder();
            mClientBuilder.connectTimeout(DEFAULT_TIME_OUT, TimeUnit.SECONDS);
            mClientBuilder.addInterceptor(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    Request mRequest = chain.request();
                    HttpUrl.Builder mHttpUrlBuilder = mRequest.url().newBuilder()
                            .addQueryParameter(KEY_APP_ID,VALUE_APP_ID)
                            .addQueryParameter(KEY_SING,VALUE_SING);
                    Request newRequest = mRequest.newBuilder()
                            .method(mRequest.method(),mRequest.body())
                            .url(mHttpUrlBuilder.build())
                            .build();
                    return chain.proceed(newRequest);
                }
            });

            SERVICE = new Retrofit.Builder()
                    .client(mClientBuilder.build())
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .baseUrl(Url.BASE_URL)
                    .build()
                    .create(ApiService.class);
        }
        return SERVICE;
    }
}
