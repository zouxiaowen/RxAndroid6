package com.example.wulingyong.rxandroid.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;

/**
 * Created by Anhdxy on 2018/8/10
 * <p>
 * glide工具类，防止出现加载时activity退出导致的闪退问题
 */
public class GlideUtils {

    public static void loadImage(Context context, Object url, RequestOptions requestOptions, ImageView imageView) {
        if (context == null) {
            Log.e("glide", "context is null");
            return;
        }
        try {
            Glide.with(context).load(url).apply(requestOptions).into(imageView);
        } catch (Exception e) {
            Log.e("glide", "context is null");
        }
    }

    public static void loadImage(Context context, Object url, ImageView imageView) {
        if (context == null) {
            Log.e("glide", "context is null");
            return;
        }
        try {
            Glide.with(context).load(url).into(imageView);
        } catch (Exception e) {
            Log.e("glide", "context is null");
        }
    }

    public static void loadImage(Context context, boolean asBitmap, Object url, ImageView imageView) {
        if (context == null) {
            Log.e("glide", "context is null");
            return;
        }
        try {
            if (asBitmap) {
                Glide.with(context).asBitmap().load(url).into(imageView);
            } else {
                Glide.with(context).load(url).into(imageView);
            }
        } catch (Exception e) {
            Log.e("glide", "context is null");
        }
    }

    public static void loadImage(Context context, Object url, Target<Bitmap> bitmapTarget) {
        if (context == null) {
            Log.e("glide", "context is null");
            return;
        }
        try {
            Glide.with(context).asBitmap().load(url).into(bitmapTarget);
        } catch (Exception e) {
            Log.e("glide", "context is null");
        }
    }

    public static void loadImage2(Context context, Object url, Target<Drawable> bitmapTarget) {
        if (context == null) {
            Log.e("glide", "context is null");
            return;
        }
        try {
            Glide.with(context).load(url).into(bitmapTarget);
        } catch (Exception e) {
            Log.e("glide", "context is null");
        }
    }

    public static void loadImage(Context context, Object url, RequestOptions requestOptions, Target<Bitmap> bitmapTarget) {
        if (context == null) {
            Log.e("glide", "context is null");
            return;
        }
        try {
            Glide.with(context).asBitmap().load(url).apply(requestOptions).into(bitmapTarget);
        } catch (Exception e) {
            Log.e("glide", "context is null");
        }
    }
}
