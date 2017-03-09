package com.example.administrator.secondtask.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Administrator on 2017/2/5.引导界面滑动控件ViewPager所需要的适配器
 */

public class LeadViewPagerAdapter extends PagerAdapter {
    private ImageView[]views;//数据源传进来
    public LeadViewPagerAdapter(ImageView[] views){

        this.views=views;
    }
    @Override
    public int getCount() {

        return views.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {

        return view==object;//固定写法
    }
    //生成你要滑动的这一页

    //viewpager的优化
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(views[position]);
        return views[position];
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(views[position]);
    }
}
