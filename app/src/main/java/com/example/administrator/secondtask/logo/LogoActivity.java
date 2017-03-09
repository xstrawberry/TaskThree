package com.example.administrator.secondtask.logo;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.example.administrator.secondtask.BaseActivity;
import com.example.administrator.secondtask.leadActivity.LeadActivity;
import com.example.administrator.secondtask.MainActivity;
import com.example.administrator.secondtask.R;

/**
 * Created by Administrator on 2017/2/5.
 */

public class LogoActivity extends BaseActivity {
private Button button;
    @Override
    public void addLayout() {
        //需要先将logo布局添加进来
//        setContentView(R.layout.logo);
        if(get().equals("第一次安装程序")){
            sava();
            gotoActivity(LeadActivity.class);


        }
        setContentView(R.layout.logo);
//        else{
//
//        }
    }

    @Override
    public void initView() {





//        TextView textlog= (TextView) findViewById(R.id.textlogo);
//        textlog.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                gotoActivity(MainActivity.class);
//                overridePendingTransition(R.anim.alpha,R.anim.alpha2);
//            }
//        });
     button= (Button) findViewById(R.id.button111);

        final Animation animation1;
        animation1= AnimationUtils.loadAnimation(LogoActivity.this,R.anim.login);
        button.startAnimation(animation1);
        animation1.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

                                            }

            @Override
            public void onAnimationEnd(Animation animation) {
                gotoActivity(MainActivity.class);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

//        new Handler(new Handler.Callback() {
//            //处理接收到的消息的方法
//            @Override
//            public boolean handleMessage(Message arg0) {
//                //实现页面跳转
//                startActivity(new Intent(LogoActivity.this,MainActivity.class));
//                return false;
//            }
//        }).sendEmptyMessageDelayed(0, 5000); //程序开始就运行,表示延时5秒进行任务的执行

    }



}


