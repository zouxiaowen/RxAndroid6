package com.example.wulingyong.rxandroid.NetWork;


import com.example.wulingyong.rxandroid.Myapplication;
import com.example.wulingyong.rxandroid.util.SharedPreferencesUtils;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class HttpNetWorkInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Request.Builder builder = request.newBuilder();

        builder
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json")
                .addHeader("phoneType", "1")
                .addHeader("token", (String) SharedPreferencesUtils.getParam(Myapplication.getAppContext(),"token",""));
        okhttp3.Response response = chain.proceed(builder.build());
        String token = response.header("token");
        if (token != null) {
            SharedPreferencesUtils.setParam(Myapplication.getAppContext(),"token",response.header("token"));
        }
        int code = response.code();
        if (code == 200) {
            return response;
        } else {
            if (code == 404) {
                throw new RuntimeException("找不到服务器");
            } else if (code == 500) {
                throw new RuntimeException("服务器异常");
            } else if (code == 403) {
                throw new RuntimeException("重新登录");
            }else {
                throw new RuntimeException("系统错误");
            }
        }

    }
}