package com.example.wulingyong.rxandroid.ui;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

//注意BaseActivity的泛型
public abstract class BaseActivity<SV extends ViewDataBinding> extends AppCompatActivity implements View.OnClickListener {

    protected SV bindingView;

    //相当于findViewById();
    protected <T extends View> T getView(int id) {
        return (T) findViewById(id);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bindView();
        initViews();
    }

    //实例化BindingView
    protected void bindView() {
        bindingView = DataBindingUtil.setContentView(this, getLayoutResId());
    }

    //得到布局
    protected abstract int getLayoutResId();

    //实例化
    public abstract void initViews();

    public abstract void processClick(View v);

    public void onClick(View v) {
        processClick(v);
    }

}