package com.example.wulingyong.rxandroid.ui;

import android.view.View;

import com.example.wulingyong.rxandroid.MainActivity;
import com.example.wulingyong.rxandroid.R;
import com.example.wulingyong.rxandroid.databinding.ActivityBinding;
import com.example.wulingyong.rxandroid.util.ToastUtil;

public class Activity extends BaseActivity<ActivityBinding> {



    @Override
    protected int getLayoutResId() {
        return R.layout.activity;
    }

    @Override
    public void initViews() {
        bindingView.button.setOnClickListener(this);
        bindingView.button2.setOnClickListener(this);
        bindingView.button3.setOnClickListener(this);
    }

    @Override
    public void processClick(View v) {
        switch (v.getId()){
            case R.id.button:
                MainActivity.openActivity(this);
                break;
            case R.id.button2:
                RecycleViewActivity.openActivity(this);
                break;
            case R.id.button3:
                ToastUtil.showShort(this,"框架本就是简化版的databinding");
//                TheRecyclerActivity.openActivity(this);
                break;
        }
    }
}
