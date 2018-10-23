package com.example.wulingyong.rxandroid.adpter;

import android.support.annotation.Nullable;
import android.widget.ImageView;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.wulingyong.rxandroid.R;
import com.example.wulingyong.rxandroid.ben.Student;
import com.example.wulingyong.rxandroid.util.GlideUtils;
import com.example.wulingyong.rxandroid.util.StringUtils;
import java.util.List;
public class ShopAdapter extends BaseQuickAdapter<Student.ProductsBean,BaseViewHolder> {

    public ShopAdapter(int layoutResId, @Nullable List<Student.ProductsBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, Student.ProductsBean item) {
        helper.setText(R.id.textView, item.getName() + "");
        ImageView image = helper.getView(R.id.image);
        GlideUtils.loadImage(mContext, item.getProductImages().isEmpty() ? "" : item.getProductImages().get(0).getLarge(), new RequestOptions().error(R.mipmap.ic_launcher), image);
        String monty = StringUtils.formatPrice(item.getDisplayPrice());
        int integral = item.getExchangePointDisplay();
        if ("EXCHANGE".equals(item.getType())) {
            if (!"0".equals(monty) && integral != 0) {
                helper.setText(R.id.textView_money, "￥" + monty + "+" + integral + "积分");
            }
            if ("0".equals(monty) && integral != 0) {
                helper.setText(R.id.textView_money, +integral + "积分");
            }
            if (!"0".equals(monty) && integral == 0) {
                helper.setText(R.id.textView_money, "￥" + monty);
            }
        } else {
            helper.setText(R.id.textView_money, "￥" + monty);
        }
    }


}
