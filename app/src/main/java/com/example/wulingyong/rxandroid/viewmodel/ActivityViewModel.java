package com.example.wulingyong.rxandroid.viewmodel;

import android.arch.lifecycle.ViewModel;
import android.content.Context;
import android.databinding.ObservableField;
import android.util.Log;
import android.view.View;

import com.example.wulingyong.rxandroid.NetWork.BaseObserver;
import com.example.wulingyong.rxandroid.NetWork.BaseResult;
import com.example.wulingyong.rxandroid.NetWork.NetUtls;
import com.example.wulingyong.rxandroid.ben.Logben;
import com.example.wulingyong.rxandroid.util.MD5Utils;
import com.example.wulingyong.rxandroid.util.ToastUtil;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class ActivityViewModel extends ViewModel {
    public final ObservableField<String> NAME=new ObservableField<>();

    public   void Loging(final Context context){

    }
    public void btnloging(final View v){
        NetUtls.getInstance().getApiservce().
                loging("17621786193", MD5Utils.string2MD5("123456"))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new BaseObserver<Logben>(v.getContext()) {
                    @Override
                    protected void onSuccees(BaseResult<Logben> t) {
                        NAME.set(t.getData().getLevel());
                        ToastUtil.showShort(v.getContext(),NAME.get());

                    }

                    @Override
                    protected void onFailure(BaseResult<Logben> t) {

                    }
                })
        ;

    }
}
