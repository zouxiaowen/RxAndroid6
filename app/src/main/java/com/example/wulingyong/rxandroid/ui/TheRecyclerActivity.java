package com.example.wulingyong.rxandroid.ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.example.wulingyong.rxandroid.R;
import com.example.wulingyong.rxandroid.databinding.ActivityTheRecyclerBinding;

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

    }

    @Override
    public void processClick(View v) {

    }
}
