package com.example.wulingyong.rxandroid.NetWork;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class NetUtls {
    private static  NetUtls instance;
    public static final String BASE_URL="http://101.132.242.229:8080/redsunMall/";
    public static NetUtls getInstance(){
        if (instance==null){
            synchronized (NetUtls.class){
                if (instance==null){
                    instance=new NetUtls();
                }
            }
        }
        return instance;
    }

    private NetUtls(){
        OkHttpClient okHttpClient=new OkHttpClient.Builder()
                .addNetworkInterceptor(new HttpNetWorkInterceptor())
                .addInterceptor(new LogInterceptor())
                .build();
         retrofit=new Retrofit.Builder()
                .baseUrl(BASE_URL)
                 .client(okHttpClient)
                 .addConverterFactory(ScalarsConverterFactory.create())  //接口直接返回string
                 .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

    }
    private Apiservce apiservce;
    private Retrofit retrofit;
    public Apiservce getApiservce(){
        if (apiservce==null){
            return retrofit.create(Apiservce.class);
        }
        return apiservce;
    }




}
