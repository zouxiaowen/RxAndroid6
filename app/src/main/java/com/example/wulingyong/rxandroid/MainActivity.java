package com.example.wulingyong.rxandroid;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.GridLayoutManager;
import android.view.View;

import com.example.wulingyong.rxandroid.NetWork.BaseObserver;
import com.example.wulingyong.rxandroid.NetWork.BaseResult;
import com.example.wulingyong.rxandroid.NetWork.NetUtls;
import com.example.wulingyong.rxandroid.adpter.ShopAdapter;
import com.example.wulingyong.rxandroid.ben.Student;
import com.example.wulingyong.rxandroid.databinding.ActivityMainBinding;
import com.example.wulingyong.rxandroid.ui.BaseActivity;
import com.example.wulingyong.rxandroid.util.ToastUtil;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import java.util.List;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;


public class MainActivity extends BaseActivity<ActivityMainBinding> {
    private int pageNumber = 1;
    private Context context;
    private ShopAdapter shopAdapter;
    @Override
    protected int getLayoutResId() {
        return R.layout.activity_main;
    }

    @Override
    public void initViews() {
        this.context=MainActivity.this;
        shopAdapter=new ShopAdapter(R.layout.layout_love,null);
        bindingView.recyclerview.setLayoutManager(new GridLayoutManager(context, 2));
        bindingView.recyclerview.setAdapter(shopAdapter);
        getData();
        ViewListener();
    }

    private void ViewListener() {
        bindingView.smart.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                pageNumber=1;
                getData();
            }
        });
        bindingView.smart.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                loadData();
            }
        });
    }

    private void getData(  ) {
        NetUtls.getInstance().getApiservce().Get_hopping(18433,pageNumber)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new BaseObserver<Student>(this) {
                    @Override
                    protected void onSuccees(BaseResult<Student> t) {
                        bindingView.smart.finishRefresh(true);
                        setData(true,t.getData().getProducts());
                        //成功后才++
                        pageNumber++;
                    }

                    @Override
                    protected void onFailure(BaseResult<Student> t) {
                        ToastUtil.showShort(context,t.getMessage());
                        bindingView.smart.finishRefresh(false);
                    }
                });
    }
    private void loadData() {
        NetUtls.getInstance().getApiservce().Get_hopping(18433,pageNumber)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new BaseObserver<Student>(this) {
                    @Override
                    protected void onSuccees(BaseResult<Student> t) {
                        bindingView.smart.finishLoadMore(true);
                        setData(false,t.getData().getProducts());
                        //成功后才++
                        pageNumber++;
                    }

                    @Override
                    protected void onFailure(BaseResult<Student> t) {
                        ToastUtil.showShort(context,t.getMessage());
                        bindingView.smart.finishLoadMore(false);
                    }
                });
    }

    @Override
    public void processClick(View v) {

    }
    private void setData(boolean isRefresh, List data) {
        pageNumber++;
        final int size = data == null ? 0 : data.size();
        if (isRefresh) {
            shopAdapter.setNewData(data);
        } else {
            if (size > 0) {
                shopAdapter.addData(data);
            }
        }
        if (size < 10) {
            //第一页如果不够一页就不显示没有更多数据布局
            shopAdapter.loadMoreEnd(isRefresh);
            ToastUtil.showShort(context,"没有更多数据了");
        } else {
            shopAdapter.loadMoreComplete();
        }
    }

}
