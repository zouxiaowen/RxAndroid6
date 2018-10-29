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
import com.example.wulingyong.rxandroid.adpter.TheRecycleViewAdapter;
import com.example.wulingyong.rxandroid.ben.Student;
import com.example.wulingyong.rxandroid.databinding.ActivityTheRecyclerBinding;
import com.example.wulingyong.rxandroid.util.ToastUtil;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class TheRecyclerActivity extends BaseActivity<ActivityTheRecyclerBinding> {

    public static void openActivity(Context context) {
        Intent intent = new Intent(context, TheRecyclerActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_the_recycler;
    }

    @Override
    public void initViews() {
        NetUtls.getInstance().getApiservce().Get_hopping(18433,1)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new BaseObserver<Student>(this) {
                    @Override
                    protected void onSuccees(BaseResult<Student> t) {
                        bindingView.recyclerview.setLayoutManager(new LinearLayoutManager(TheRecyclerActivity.this, GridLayoutManager.VERTICAL, false));
                        //初始化适配器
                        TheRecycleViewAdapter recyclerViewAdapter = new TheRecycleViewAdapter(R.layout.layout_item,t.getData().getProducts());
                        //绑定适配器
                        bindingView.recyclerview.setAdapter(recyclerViewAdapter);

                    }

                    @Override
                    protected void onFailure(BaseResult<Student> t) {
                        ToastUtil.showShort(TheRecyclerActivity.this,t.getMessage());
                    }
                });

    }

    @Override
    public void processClick(View v) {

    }
}
