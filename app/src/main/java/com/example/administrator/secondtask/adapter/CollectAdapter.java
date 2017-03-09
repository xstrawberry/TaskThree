package com.example.administrator.secondtask.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.secondtask.R;
import com.example.administrator.secondtask.bean.Urls;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/3/8.
 */

public class CollectAdapter extends BaseAdapter{

    private Context context;
    private ArrayList<Urls> list;

    public CollectAdapter(Context context,ArrayList<Urls> list){

        this.context=context;
        this.list=list;

    }


    public void updateAdapter(ArrayList<Urls>list){
        this.list=list;
        this.notifyDataSetChanged();
    }

    public ArrayList<Urls> getList() {
        return list;
    }



    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    class ViewHolder{
        TextView title;
        TextView url;
        ImageView img;


    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder  holder;
        if(convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.fragment3_item,null);
            holder=new ViewHolder();
            holder.title= (TextView) convertView.findViewById(R.id.f3_title);
            holder.url= (TextView) convertView.findViewById(R.id.f3_url);
            holder.img= (ImageView) convertView.findViewById(R.id.f3_img);
            convertView.setTag(holder);
        }else {
            holder= (ViewHolder) convertView.getTag();
        }
        Picasso.with(context).load(list.get(position).getImg()).into(holder.img);
        holder.title.setText(list.get(position).getTitle());
        holder.url.setText(list.get(position).getUrl());




        return convertView;
    }
}
