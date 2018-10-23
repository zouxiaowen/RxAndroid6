package com.example.wulingyong.rxandroid.ben;


import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Logben   {
    private int subcompanyId;
    private String level;
    private int memberId;
    private boolean reflag;//判断是否有推荐人
    private boolean realnameFlag;//判断是否已经实名
    private boolean firstlogin;//false是第一次登陆
    private boolean realnameAginFlag;//是否需要重新进行实名认证


    public int getSubcompanyId() {
        return subcompanyId;
    }

    public void setSubcompanyId(int subcompanyId) {
        this.subcompanyId = subcompanyId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public boolean isReflag() {
        return reflag;
    }

    public void setReflag(boolean reflag) {
        this.reflag = reflag;
    }

    public boolean isRealnameFlag() {
        return realnameFlag;
    }

    public void setRealnameFlag(boolean realnameFlag) {
        this.realnameFlag = realnameFlag;
    }

    public boolean isFirstlogin() {
        return firstlogin;
    }

    public void setFirstlogin(boolean firstlogin) {
        this.firstlogin = firstlogin;
    }

    public boolean isRealnameAginFlag() {
        return realnameAginFlag;
    }

    public void setRealnameAginFlag(boolean realnameAginFlag) {
        this.realnameAginFlag = realnameAginFlag;
    }



}
