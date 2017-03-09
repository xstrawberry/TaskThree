package com.example.administrator.secondtask;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/2/27.
 */

public abstract class BaseActivity extends AppCompatActivity{



    private SharedPreferences sp;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sp=this.getSharedPreferences("test", Activity.MODE_WORLD_READABLE);
        get();
        addLayout();
        initView();

    }
    public  abstract void  addLayout();
    public abstract void initView();
    public void showToast(String msg){
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }
    public void showToast(int msg){
        Toast.makeText(this,msg+"",Toast.LENGTH_LONG).show();
    }
    public void showToast(double msg){
        Toast.makeText(this,msg+"",Toast.LENGTH_LONG).show();
    }

    public void gotoActivity(Class<?> activity){
//        Intent intent=new Intent(this,activity);
        startActivity(new Intent(this,activity));
        finish();

    }
    //重写跳转方法1
    public void gotoActivity(Class<?> activity,int num) {
        if(num>0){//进入子菜单
            Intent intent = new Intent(this,activity);
            startActivity(intent);
//            overridePendingTransition(R.anim.leftin,R.anim.rightout);
        }else{//退出子页面
            finish();
//            overridePendingTransition(R.anim.lefthuanyuan,R.anim.lefthuan);
        }
    }

    //重写跳转方法2
    public void gotoActivity(Class<?> activity,String str1,String str2) {
        Intent intent = new Intent(this,activity);
        intent.putExtra(str1,str2);
        startActivity(intent);
//        overridePendingTransition(R.anim.leftin,R.anim.rightout);
    }
    //重写跳转方法3
    public void gotoActivity(Class<?> activity,boolean flag){
        if(flag){
            Intent intent = new Intent(this,activity);
            startActivity(intent);
            finish();
//            overridePendingTransition(R.anim.leftin,R.anim.rightout);//进入
        }else{
            Intent intent = new Intent(this,activity);
            startActivity(intent);
            finish();
//            overridePendingTransition(R.anim.lefthuanyuan,R.anim.lefthuan);//退出
        }
    }

    public void sava(){
        SharedPreferences.Editor editor =sp.edit();
        editor.putString("one","程序已安装");
        //提交了数据以后才能真正保存
        editor.commit();

    }
    public String get(){
        String str=sp.getString("one","第一次安装程序");
        return str;
        //给返回值是为了logo那判断是否需要进入lead界面
    }


}
