package com.example.wulingyong.rxandroid.NetWork;

import android.app.ProgressDialog;
import android.content.Context;
import android.widget.Toast;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public abstract class BaseObserver<T> implements Observer<BaseResult<T>> {
    protected Context mContext;
    private ProgressDialog dialog;
    public BaseObserver(Context cxt) {
        this.mContext = cxt;
        dialog=new ProgressDialog(mContext);
    }
    @Override
    public void onSubscribe(Disposable d) {
        dialog.show();
    }
    @Override
    public void onNext(BaseResult<T> tBaseEntity) {
        dialog.dismiss();
        if (tBaseEntity.getCode() == 200) {
            onSuccees(tBaseEntity);
        } else {
            onFailure(tBaseEntity);
        }
    }

    @Override
    public void onError(Throwable e) {
        dialog.dismiss();
        if (e instanceof RuntimeException) {
            if (e.getMessage().equals("重新登录")) {
                Toast.makeText (mContext,"登录信息过期，请重新登录",Toast.LENGTH_LONG).show();
            }else {
                Toast.makeText (mContext,e.getMessage(),Toast.LENGTH_LONG).show();
            }
        }


    }

    @Override
    public void onComplete() {
    }

    /**
     * 返回成功
     *
     * @param t
     * @throws Exception
     */
    protected abstract void onSuccees(BaseResult<T> t) ;


    /**
     *
     * @param
     */
    protected abstract void onFailure(BaseResult<T> t);



}
