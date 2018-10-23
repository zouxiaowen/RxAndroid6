package com.example.wulingyong.rxandroid.ben;


import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.example.wulingyong.rxandroid.util.GlideUtils;

public class Userben   {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @BindingAdapter("imageUrl")
    public static void loadImage(ImageView imageView, String name) {
        GlideUtils.loadImage(imageView.getContext(),name,imageView);
    }


}
