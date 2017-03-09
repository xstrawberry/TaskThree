package com.example.administrator.secondtask.leadActivity;

import android.support.v4.view.ViewPager;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.administrator.secondtask.adapter.LeadViewPagerAdapter;
import com.example.administrator.secondtask.BaseActivity;
import com.example.administrator.secondtask.logo.LogoActivity;
import com.example.administrator.secondtask.R;


/**
 * Created by Administrator on 2017/2/5.
 */

public class LeadActivity extends BaseActivity {
    private ViewPager viewPager;
    float startx;//手按下
    float endx;//手抬起来
    int p;//第几张图
    Button[] btns=new Button[3];
    @Override
    public void addLayout() {
       setContentView(R.layout.lead);
    }

    @Override
    public void initView() {
        viewPager= (ViewPager) findViewById(R.id.viewpager);
        btns[0]= (Button) findViewById(R.id.btn_lead1);
        btns[1]= (Button) findViewById(R.id.btn_lead2);
        btns[2]= (Button) findViewById(R.id.btn_lead3);

        //数据源图片
        ImageView[] views=new ImageView[3];
        for (int i=0;i<views.length;i++){
            views[i]=new ImageView(this);
        }
        views[0].setBackgroundResource(R.drawable.lead1);
        views[1].setBackgroundResource(R.drawable.lead2);
        views[2].setBackgroundResource(R.drawable.lead3);



//        //给viewpager设置一个PagerTransformer
        viewPager.setPageTransformer(true, new ViewPager.PageTransformer() {
            /**
             * 页面滑动时回调的方法,
//             * @param page当前滑动的view
             * @param position 当从右向左滑的时候,左边page的position是[0一-1]变化的
             * 右边page的position是[1一0]变化的,再次滑动的时候,刚才变化到-1(即已经画出视野的page)將从-1变化到-2,
             * 而当前可见的page和右边滑过来的page的position将再次从[0一-1]变化 和 [1一0]变化   但是我们关心是position是[-1一1]变化的
             * page,所以处理动画的时候需要我们过滤一下
             */
            @Override
            public void transformPage(View page, float position) {
                rollingPage(page,position);
            }
        });
        
        
        viewPager.setAdapter(new LeadViewPagerAdapter(views));
        


        viewPager.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        startx=event.getX();
                        break;
                    case MotionEvent.ACTION_UP:
                        endx=event.getX();
                        if(p==2&&startx-endx>300){
//                            Toast.makeText(LeadActivity.this,"跳转",Toast.LENGTH_LONG).show();
                               gotoActivity(LogoActivity.class);
                        }
                        break;
                }



                return false;
            }
        });

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
             p=position;
                for(int i=0;i<btns.length;i++){
                    btns[i].setBackgroundResource(R.drawable.first_dian);
                }
                btns[position].setBackgroundResource(R.drawable.end_dian);
//                if(position==2){
//                 gotoActivity(LogoActivity.class);
//             }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }
//滚动页面方法
    private void rollingPage(View page, float position) {
        if(position>=-1&&position<=1){
            page.setPivotX(position<0?page.getWidth():0);//设置要旋转的Y轴的位置
            page.setRotationY(90*position);//开始设置属性动画值
        }
    }
}
