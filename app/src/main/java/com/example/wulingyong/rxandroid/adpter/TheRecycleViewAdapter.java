package com.example.wulingyong.rxandroid.adpter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.wulingyong.rxandroid.ben.Student;

import java.util.List;

public class TheRecycleViewAdapter extends BaseQuickAdapter<Student.ProductsBean,BaseViewHolder> {


    public TheRecycleViewAdapter(int layoutResId, @Nullable List<Student.ProductsBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, Student.ProductsBean item) {

    }




}
