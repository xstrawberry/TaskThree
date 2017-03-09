package com.example.administrator.secondtask.mainFragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.administrator.secondtask.R;
import com.example.administrator.secondtask.adapter.CollectAdapter;
import com.example.administrator.secondtask.collect.DB_C;

/**
 * Created by Administrator on 2017/2/27.
 */

public class Fragment3 extends Fragment{
    private DB_C dbc3;
    private CollectAdapter collectAdapter;
    private ListView listView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment3,null);
        listView= (ListView) view.findViewById(R.id.fragment3_listview);
        dbc3=new DB_C(getContext());
        collectAdapter=new CollectAdapter(getContext(),dbc3.showAll());
        listView.setAdapter(collectAdapter);




        return view;

    }



    //fragment切换页面自动刷新
    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        dbc3.getlist().clear();
        collectAdapter.updateAdapter(dbc3.showAll());

    }
}
