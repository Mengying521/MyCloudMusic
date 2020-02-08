package com.wmy.learning.mycloudmusic.adapter;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * 通用FragmentPagerAdapter
 * 主要是创建了列表
 * 实现了通用的方法
 * 直接用FragmentPagerAdapter有可能有内存泄漏
 * 所以使用FragmentStatePagerAdapter
 * 具体的这里不讲解
 * 会在详解系列课程中讲解
 */
public abstract class BaseFragmentPagerAdapter<T> extends FragmentPagerAdapter {

    protected final List<T> datum = new ArrayList<T>();
    protected final Context context;

    public BaseFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    protected T getData(int position) {
        return datum.get(position);
    }

    @Override
    public int getCount() {
        return datum.size();
    }

    public void setDatum(List<T> datum) {
        if (datum != null && datum.size() > 0) {
            this.datum.clear();
            this.datum.addAll(datum);

            //通知数据改变了
            notifyDataSetChanged();

        }
    }

    public void addDatum(List<T> datum) {
        if (datum != null && datum.size() > 0) {
            this.datum.addAll(datum);

            //通知数据改变了
            notifyDataSetChanged();
        }
    }
}
