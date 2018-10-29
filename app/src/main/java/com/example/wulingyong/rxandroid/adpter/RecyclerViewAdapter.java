package com.example.wulingyong.rxandroid.adpter;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wulingyong.rxandroid.R;
import com.example.wulingyong.rxandroid.ben.Student;
import com.example.wulingyong.rxandroid.databinding.LayoutItemBinding;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder>implements View.OnClickListener {

    private List<Student.ProductsBean> data;

    public RecyclerViewAdapter(List<Student.ProductsBean> data) {
        this.data=data;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutItemBinding layoutItemBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.layout_item, parent, false);
        layoutItemBinding.getRoot().setOnClickListener(this);
        return new RecyclerViewHolder(layoutItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        LayoutItemBinding layoutItemBinding = holder.getBinding();
        Student.ProductsBean userBean = data.get(position);
        layoutItemBinding.setProduct(userBean);
        layoutItemBinding.setProductimage(data.get(position).getProductImages().get(0));
//        //将position保存在itemView的Tag中，以便点击时进行获取
        layoutItemBinding.getRoot().setTag(position);
//        itemMvvmBinding.btnUpdate.setOnClickListener(new OnBtnClickListener(1, userBean));
//        itemMvvmBinding.btnDelete.setOnClickListener(new OnBtnClickListener(2, position));
//        // 立刻执行绑定
        layoutItemBinding.executePendingBindings();

    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }

    @Override
    public void onClick(View v) {

    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder{
        //这里只要给RecyclerView.ViewHolder返回一个view就可以，所以我们将构造方法中传入databinding

        LayoutItemBinding layoutItemBinding;


        public RecyclerViewHolder(LayoutItemBinding layoutItemBinding) {
            super(layoutItemBinding.getRoot());
            this.layoutItemBinding = layoutItemBinding;
        }
        public LayoutItemBinding getBinding() {
            return layoutItemBinding;
        }

        public void setBinding(LayoutItemBinding layoutItemBinding) {
            this.layoutItemBinding = layoutItemBinding;
        }

    }
}
