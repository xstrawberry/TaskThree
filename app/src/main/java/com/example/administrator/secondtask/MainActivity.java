package com.example.administrator.secondtask;

import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.secondtask.mainFragments.Fragment1;
import com.example.administrator.secondtask.mainFragments.Fragment2;
import com.example.administrator.secondtask.mainFragments.Fragment3;
import com.example.administrator.secondtask.mainFragments.Fragment4;

public class MainActivity extends BaseActivity {
    FragmentManager fragmentManager;//fragment管理者
    FragmentTransaction transaction;//fragment事件处理者
    private RelativeLayout r1,r2,r3,r4;
    private ImageView img1,img2,img3,img4;
    private TextView tv1,tv2,tv3,tv4;
    private int now_count;

    private Fragment[] fragments=new Fragment[4];




    @Override
    public void addLayout() {
        setContentView(R.layout.main_interface);
    }

    @Override
    public void initView() {
        r1= (RelativeLayout) findViewById(R.id.main_news);
        r2= (RelativeLayout) findViewById(R.id.main_movie);
        r3= (RelativeLayout) findViewById(R.id.main_save);
        r4= (RelativeLayout) findViewById(R.id.main_me);
        img1= (ImageView) findViewById(R.id.news);
        img2= (ImageView) findViewById(R.id.movie);
        img3= (ImageView) findViewById(R.id.save);
        img4= (ImageView) findViewById(R.id.me);
        tv1= (TextView) findViewById(R.id.main_tv1);
        tv2= (TextView) findViewById(R.id.main_tv2);
        tv3= (TextView) findViewById(R.id.main_tv3);
        tv4= (TextView) findViewById(R.id.main_tv4);





        fragmentManager=getSupportFragmentManager();
         transaction=fragmentManager.beginTransaction();
       //初始化进入界面的是第一个
        fragments[0]=new Fragment1();
        transaction.add(R.id.main_layout,fragments[0]);
        transaction.commit();
        now_count=0;

//
        img1.setImageResource(R.drawable.night_timeline_toolbar_btn_news_selected);
        tv1.setTextColor(0xff2b61c0);

        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                img1.setImageResource(R.drawable.night_timeline_toolbar_btn_news_selected);
                tv1.setTextColor(0xff2b61c0);
                img2.setImageResource(R.drawable.night_timeline_toolbar_btn_live_normal);
                tv2.setTextColor(0xffaaaaaa);
                img3.setImageResource(R.drawable.night_timeline_toolbar_btn_recommend_normal);
                tv3.setTextColor(0xffaaaaaa);
                img4.setImageResource(R.drawable.night_timeline_toolbar_btn_me_normal);
                tv4.setTextColor(0xffaaaaaa);

                choiceFragment(0);
            }
        });

        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                img1.setImageResource(R.drawable.night_timeline_toolbar_btn_news_normal);
                tv1.setTextColor(0xffaaaaaa);
                img2.setImageResource(R.drawable.night_timeline_toolbar_btn_live_selected);
                tv2.setTextColor(0xff2b61c0);
                img3.setImageResource(R.drawable.night_timeline_toolbar_btn_recommend_normal);
                tv3.setTextColor(0xffaaaaaa);
                img4.setImageResource(R.drawable.night_timeline_toolbar_btn_me_normal);
                tv4.setTextColor(0xffaaaaaa);

                choiceFragment(1);
            }
        });

        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                img1.setImageResource(R.drawable.night_timeline_toolbar_btn_news_normal);
                tv1.setTextColor(0xffaaaaaa);
                img2.setImageResource(R.drawable.night_timeline_toolbar_btn_live_normal);
                tv2.setTextColor(0xffaaaaaa);
                img3.setImageResource(R.drawable.night_timeline_toolbar_btn_recommend_selected);
                tv3.setTextColor(0xff2b61c0);
                img4.setImageResource(R.drawable.night_timeline_toolbar_btn_me_normal);
                tv4.setTextColor(0xffaaaaaa);


                choiceFragment(2);
            }
        });

        r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                img1.setImageResource(R.drawable.night_timeline_toolbar_btn_news_normal);
                tv1.setTextColor(0xffaaaaaa);
                img2.setImageResource(R.drawable.night_timeline_toolbar_btn_live_normal);
                tv2.setTextColor(0xffaaaaaa);
                img3.setImageResource(R.drawable.night_timeline_toolbar_btn_recommend_normal);
                tv3.setTextColor(0xffaaaaaa);
                img4.setImageResource(R.drawable.night_timeline_toolbar_btn_me_selected);
                tv4.setTextColor(0xff2b61c0);


                choiceFragment(3);
            }
        });


    }


    public  void  choiceFragment(int btn_index){
        if(now_count!=btn_index){
            transaction=fragmentManager.beginTransaction();
            if(fragments[btn_index]==null){
                fragments[btn_index]=newFragment(btn_index);
                transaction.add(R.id.main_layout,fragments[btn_index]);
            }else {
                transaction.show(fragments[btn_index]);

            }
//将之前作为now_count的值隐藏，让当前选的值显示出来。
            transaction.hide(fragments[now_count]);
//事件处理通知
            transaction.commit();
//最后将当前值作为now_count，以便下次替换
            now_count=btn_index;

        }else {

        }


    }


    public  Fragment newFragment(int btn_index){
        switch (btn_index){
            case 0:
                 return new Fragment1();
            case 1:
                 return new Fragment2();
            case 2:
                return new Fragment3();
            case 3:
                return new Fragment4();

        }

        return null;

    }



    // 定义一个变量，来标识是否退出
    private static boolean isExit = false;

    private static Handler mHandler = new Handler() {

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            isExit = false;
        }
    };


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exit();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    private void exit() {
        if (!isExit) {
            isExit = true;
            Toast.makeText(getApplicationContext(), "再按一次退出",
                    Toast.LENGTH_SHORT).show();
            // 利用handler延迟发送更改状态信息
            mHandler.sendEmptyMessageDelayed(0, 2000);
        } else {
            //Log.e(TAG, "exit application");
            this.finish();
        }
    }
}
