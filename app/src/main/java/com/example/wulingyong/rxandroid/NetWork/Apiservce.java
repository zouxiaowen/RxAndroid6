package com.example.wulingyong.rxandroid.NetWork;


import com.example.wulingyong.rxandroid.ben.Student;
import com.example.wulingyong.rxandroid.ben.UseBen;
import com.example.wulingyong.rxandroid.ben.logben;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Apiservce {
    //登录  mobile   password
    @GET("app/member/register/loginMem")
    Observable<BaseResult<logben>> loging(@Query("mobile") String mobile, @Query("password") String password);
    //首页
    @GET("app/mobileIndex")
    Observable<BaseResult<String>> Homepage(@Query("typeId") int typeId, @Query("name") String name);





    @GET("app/member/index/mobileIndex")
    Observable<BaseResult<UseBen>> PersonalCenter(@Query("memberId") int memberId);

    //String Get_hopping = "/app/cart/mobileGetCurrent";
    @GET("app/cart/mobileGetCurrent")
    Observable<BaseResult<Student>> Get_hopping(@Query("memberId") int memberId, @Query("pageNumber") int pageNumber);

}
