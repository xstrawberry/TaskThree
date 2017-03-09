package com.example.administrator.secondtask.mainFragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.secondtask.adapter.Main_FregmentAdapter;
import com.example.administrator.secondtask.R;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/2/27.
 */

public class Fragment1 extends Fragment {
    //必须写一个生命周期
    //必须绑定一个布局
private ViewPager viewPager;

    private Main_FregmentAdapter main_fregmentAdapter;
private String[] name={"头条","社会","国内","国际","娱乐","体育","军事","科技","财经","时尚"};
    private String[] type={"top","shehui","guonei","guoji","yule","tiyu","junshi","keji","caijing","shishang"};
    private TabLayout tabLayout;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment1,null);
        tabLayout= (TabLayout) view.findViewById(R.id.tablayout);
        viewPager= (ViewPager) view.findViewById(R.id.secondfragment_viewpager1 );
        main_fregmentAdapter=new Main_FregmentAdapter(getChildFragmentManager(),getData(),name);
        viewPager.setAdapter(main_fregmentAdapter);
        tabLayout.setupWithViewPager(viewPager);
        return view;
    }
//数据源
public  ArrayList<Fragment> getData(){
    ArrayList<Fragment> list=new ArrayList<>();
    for(int i=0;i<type.length;i++){
        Fragment fragment=new Fragment_item1();
        Bundle bundle=new Bundle();
        bundle.putString("type",type[i]);
        fragment.setArguments(bundle);
        list.add(fragment);

    }
    return list;
}



}