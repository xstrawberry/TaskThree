package com.example.administrator.secondtask.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * 承载fragment的viewpager的适配器
 * Created by Administrator on 2017/2/28.
 */

public class Main_FregmentAdapter extends FragmentPagerAdapter{
private ArrayList<Fragment> list;
    private String[] names;
    //需要将fragment管理者，数据源集合，名字数组。
    public Main_FregmentAdapter(FragmentManager fm, ArrayList<Fragment> list,String[] names) {
        super(fm);
        this.list=list;
        this.names=names;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    //tablelayout在适配器要和viewpager关联需要重写的方法。
    @Override
    public CharSequence getPageTitle(int position) {
        return names[position];
    }
}
