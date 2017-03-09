package com.example.administrator.secondtask.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.secondtask.R;
import com.example.administrator.secondtask.bean.ItemBean;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhang on 2017/3/1.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private List<ItemBean.ResultBean.DataBean> list;
   private Context context;
    public RecyclerViewAdapter(Context context){
        this.context=context;
        this.list=new ArrayList<>();
 }


//    public void UnMonkeyAdapter(Context context,ArrayList<ItemBean.ResultBean.DataBean> list){
//        this.context=context;
//        this.list=new ArrayList<>();
//        notifyDataSetChanged();
//    }
    //添加数据
    public void addList( List<ItemBean.ResultBean.DataBean> list){
        if(this.list.containsAll(list)){
            return;
        }
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    //更新数据
    public void updateList( List<ItemBean.ResultBean.DataBean> list){
        this.list=list;
        notifyDataSetChanged();
    }

//下面的viewtype就是接收con值以此来判断
    @Override
    public  RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        RecyclerView.ViewHolder holder;
        if(viewType==3){
            view= LayoutInflater.from(parent.getContext()).inflate(R.layout.items1,parent,false);
            holder=new MyViewHolder(view);
        }else if(viewType==1){
            view= LayoutInflater.from(parent.getContext()).inflate(R.layout.items2,parent,false);
            holder=new MyViewHolder2(view);
        }else {
            view=LayoutInflater.from(parent.getContext()).inflate(R.layout.items3,parent,false);
            holder=new MyViewHolder3(view);
        }

        return holder;
    }

     //复写类型设置方法
    //判断每张图片位置是否有图，给个count值记录并返回。
    @Override
    public int getItemViewType(int position) {
        int con=0;
        if(list.get(position).getThumbnail_pic_s()!=null){
            con++;


        }if(list.get(position).getThumbnail_pic_s02()!=null){
            con++;


        }
        if(list.get(position).getThumbnail_pic_s03()!=null){
            con++;


        }
        return con;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
    //
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(context,"位置"+position,Toast.LENGTH_LONG).show();

                if(listener!=null) {
                    listener.onItemClick(v,position);

                }
            }
        });



        if(holder instanceof MyViewHolder ) {
            MyViewHolder holder1= (MyViewHolder) holder;
            Log.e("msg",list.get(position).getTitle());
           holder1.tv1.setText(list.get(position).getTitle());
            holder1.tv2.setText(list.get(position).getAuthor_name());
            holder1.tv3.setText(list.get(position).getDate());
            Picasso.with(context).load(list.get(position).getThumbnail_pic_s()).into(holder1.img1);
            Picasso.with(context).load(list.get(position).getThumbnail_pic_s02()).into(holder1.img2);
            Picasso.with(context).load(list.get(position).getThumbnail_pic_s03()).into(holder1.img3);
            Picasso.with(context).load(list.get(position).getThumbnail_pic_s()).placeholder(R.drawable.loading).error(R.drawable.loadingerror).into(holder1.img1);
            Picasso.with(context).load(list.get(position).getThumbnail_pic_s02()).placeholder(R.drawable.loading).error(R.drawable.loadingerror).into(holder1.img2);
            Picasso.with(context).load(list.get(position).getThumbnail_pic_s03()).placeholder(R.drawable.loading).error(R.drawable.loadingerror).into(holder1.img3);



        }else if(holder instanceof MyViewHolder2){
            MyViewHolder2 holder2= (MyViewHolder2) holder;
            holder2.tv4.setText(list.get(position).getTitle());
            holder2.tv5.setText(list.get(position).getAuthor_name());
            holder2.tv6.setText(list.get(position).getDate());
            Picasso.with(context).load(list.get(position).getThumbnail_pic_s()).into(holder2.img4);
            Picasso.with(context).load(list.get(position).getThumbnail_pic_s()).placeholder(R.drawable.loading).error(R.drawable.loadingerror).into(holder2.img4);

        }else {
            MyViewHolder3 holder3= (MyViewHolder3) holder;
            holder3.tv7.setText(list.get(position).getTitle());
            holder3.tv8.setText(list.get(position).getAuthor_name());
            holder3.tv9.setText(list.get(position).getDate());
        }
    }

    @Override
    public int getItemCount() {
        Log.e("msg",+list.size()+"getItemCount() ");

        return list.size();
    }
     //先找到对应item布局的对应控件
    class MyViewHolder extends RecyclerView.ViewHolder{
     private TextView tv1,tv2,tv3;
         private ImageView img1,img2,img3;
        public MyViewHolder(View itemView) {
            super(itemView);

            tv1= (TextView) itemView.findViewById(R.id.item1_title);
            tv2= (TextView) itemView.findViewById(R.id.item1_tv1);
            tv3= (TextView) itemView.findViewById(R.id.item1_tv2);
            img1= (ImageView) itemView.findViewById(R.id.item1_img1);
            img2= (ImageView) itemView.findViewById(R.id.item1_img2);
            img3= (ImageView) itemView.findViewById(R.id.item1_img3);
        }
    }
    class MyViewHolder2 extends RecyclerView.ViewHolder{
        private TextView tv4,tv5,tv6;
        private ImageView img4;
        public MyViewHolder2(View itemView) {
            super(itemView);
              tv4= (TextView) itemView.findViewById(R.id.item2_tv1);
              tv5= (TextView) itemView.findViewById(R.id.item2_tv2);
              tv6= (TextView) itemView.findViewById(R.id.item2_tv3);
            img4= (ImageView) itemView.findViewById(R.id.item2_img);



        }
    }

    class MyViewHolder3 extends RecyclerView.ViewHolder {
        private TextView tv7, tv8, tv9;

        public MyViewHolder3(View itemView) {
            super(itemView);
            tv7 = (TextView) itemView.findViewById(R.id.item3_tv1);
            tv8 = (TextView) itemView.findViewById(R.id.item3_tv2);
            tv9 = (TextView) itemView.findViewById(R.id.item3_tv3);


        }


    }


//2.注册接口方法
    private OnItemClickListener listener;
    public void  setOnItemClickListener(OnItemClickListener listener){
               this.listener=listener;
    }



    //1.接口准备完毕
   public interface OnItemClickListener{

       void onItemClick(View view,int position );

   }


    }


