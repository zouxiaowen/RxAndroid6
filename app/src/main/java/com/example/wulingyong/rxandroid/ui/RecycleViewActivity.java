package com.example.wulingyong.rxandroid.ui;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import com.example.wulingyong.rxandroid.NetWork.BaseObserver;
import com.example.wulingyong.rxandroid.NetWork.BaseResult;
import com.example.wulingyong.rxandroid.NetWork.NetUtls;
import com.example.wulingyong.rxandroid.R;
import com.example.wulingyong.rxandroid.adpter.RecyclerViewAdapter;
import com.example.wulingyong.rxandroid.ben.Student;
import com.example.wulingyong.rxandroid.databinding.ActivityRecycleViewBinding;
import com.example.wulingyong.rxandroid.util.ToastUtil;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class RecycleViewActivity extends BaseActivity<ActivityRecycleViewBinding> {


    public static void openActivity(Context context) {
        Intent intent = new Intent(context, RecycleViewActivity.class);
        context.startActivity(intent);
    }
    @Override
    protected int getLayoutResId() {
        return R.layout.activity_recycle_view;
    }

    @Override
    public void initViews() {
        NetUtls.getInstance().getApiservce().Get_hopping(18433,1)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new BaseObserver<Student>(this) {
                    @Override
                    protected void onSuccees(BaseResult<Student> t) {
                        bindingView.recyclerview.setLayoutManager(new LinearLayoutManager(RecycleViewActivity.this, GridLayoutManager.VERTICAL, false));
                        //初始化适配器
                        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(t.getData().getProducts());
                        //绑定适配器
                        bindingView.recyclerview.setAdapter(recyclerViewAdapter);

                    }

                    @Override
                    protected void onFailure(BaseResult<Student> t) {
                        ToastUtil.showShort(RecycleViewActivity.this,t.getMessage());
                    }
                });



    }

    @Override
    public void processClick(View v) {

    }
}
