package com.example.administrator.secondtask.mainFragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.secondtask.MainActivity;
import com.example.administrator.secondtask.R;
import com.example.administrator.secondtask.adapter.RecyclerViewAdapter;
import com.example.administrator.secondtask.bean.ItemBean;
import com.example.administrator.secondtask.web.GoToWeb;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Administrator on 2017/2/28.
 * 因为主的Fragment1有很多的页面要展示，所以又需要很多的fragment来帮忙，这么多fragment通过
 * ViewPager来展示。
 */


public class Fragment_item1 extends Fragment{

private String type;
    private  Retrofit retrofit;
private RecyclerView recyclerView;
    private RecyclerViewAdapter recycleViewAdapter;
private SwipeRefreshLayout swipeRefreshLayout;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //fragement的传值方式
        type=getArguments().getString("type");

        View view=inflater.inflate(R.layout.layout_fragment,null);
        recyclerView= (RecyclerView) view.findViewById(R.id.recyclerview);
        swipeRefreshLayout= (SwipeRefreshLayout) view.findViewById(R.id.refreshlayout);

//
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recycleViewAdapter=new RecyclerViewAdapter(getContext());
        recyclerView.setAdapter(recycleViewAdapter);



       //添加向下拉动刷新
        swipeRefreshLayout.setColorSchemeResources(R.color.colorAccent,R.color.colorPrimary);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                swipeRefreshLayout.setRefreshing(true);
                getHttp(type,true);
            }
        });



        getHttp(type,false);
        return view;
    }

    public void getHttp(String type,final boolean isupdate){

        //1、初始化
        //--》网址
        //--》解析工具
         retrofit = new Retrofit.Builder()

//                .baseUrl("http://v.juhe.cn/dream/")
                .baseUrl("http://v.juhe.cn/toutiao/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        //3.准备请求网络
        EntertainmentService service=retrofit.create(EntertainmentService.class);
        //4.通过回调获得结果,getbean存放key值

        Call<ItemBean> call=service.getBean(type,"8b41621da64fb5a7db660117a62cfa36");
//        Call<DreamofZhou> call=service.getBean("8c42b211e1112fcc7d05c6739e1c3d2d");
        //5.请求加入调度，正式排队去网络获取数据
        call.enqueue(new Callback<ItemBean>() {
            @Override
            public void onResponse(Call<ItemBean> call, final Response<ItemBean> response) {

                if (isupdate){
                    recycleViewAdapter.updateList(response.body().getResult().getData());
                    swipeRefreshLayout.setRefreshing(false);
                }else {
//                    recycleViewAdapter.addList((ArrayList<ItemBean.ResultBean.DataBean>) response.body().getResult().getData());

                    recycleViewAdapter.addList(response.body().getResult().getData());
                }


                //加载成功过后的item点击事件跳转网页
                recycleViewAdapter.setOnItemClickListener(new RecyclerViewAdapter.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {

                        //通过主页面activity获得权限以方便跳转
                        MainActivity activity= (MainActivity) getActivity();
                        Intent intent=new Intent(activity, GoToWeb.class);
                        intent.putExtra("url",response.body().getResult().getData().get(position).getUrl());
                        intent.putExtra("img",response.body().getResult().getData().get(position).getThumbnail_pic_s());
                        intent.putExtra("title",response.body().getResult().getData().get(position).getTitle());
                        startActivity(intent);

                    }
                });

            }

            @Override
            public void onFailure(Call<ItemBean> call, Throwable t) {
                Log.e("msg",t+" 11111111");
            }
        });





    }
    //2.通过接口去规定请求方式和请求后的数据格式
    //--》get请求（注解）
    //--》获取数据格式
    public interface EntertainmentService{
        //        @GET("category")
//        Call<DreamofZhou> getBean(@Query("key") String key);
        @GET("index")
        Call<ItemBean> getBean(@Query("type") String type,@Query("key") String key);


    }
    }

