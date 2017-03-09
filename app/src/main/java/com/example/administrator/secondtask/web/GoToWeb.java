package com.example.administrator.secondtask.web;

import android.content.Intent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.administrator.secondtask.BaseActivity;
import com.example.administrator.secondtask.R;
import com.example.administrator.secondtask.adapter.CollectAdapter;
import com.example.administrator.secondtask.bean.Urls;
import com.example.administrator.secondtask.collect.DB_C;
import com.umeng.socialize.ShareAction;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;
import com.umeng.socialize.media.UMWeb;
import com.umeng.socialize.utils.Log;

import java.util.ArrayList;

import static android.widget.Toast.makeText;
import static com.example.administrator.secondtask.R.id.web;

/**
 * Created by Administrator on 2017/3/2.
 */

public class GoToWeb extends BaseActivity{

    private WebView webView;
    private ProgressBar bar;
    private ImageView img1,img2;
    private ArrayList<Urls> urlArrayList;
    private DB_C dbc;
    private String url;
    private CollectAdapter collectAdapter;
    private String img;
    private String title;
    private UMWeb uweb;
    private UMImage image;

    @Override
    public void addLayout() {
        setContentView(R.layout.gotoweb);
    }

    @Override
    public void initView() {
        dbc=new DB_C(this);
        bar = (ProgressBar) findViewById(R.id.progressbar);
        webView = (WebView) findViewById(web);
        img1 = (ImageView) findViewById(R.id.share);
        img2 = (ImageView) findViewById(R.id.collect_start);
        //方便fragement3的调用
        collectAdapter=new CollectAdapter(this,dbc.showAll());

        Intent intent = getIntent();
         url = intent.getStringExtra("url");
         img = intent.getStringExtra("img");
         title = intent.getStringExtra("title");
        webView.loadUrl(url);
//开始进来就初始化看网页是否被收藏了
        if(ischange(title,dbc.showAll())){
            img2.setImageResource(R.drawable.collect);
        }

        bar();
        urlchange();
        gongneng();
        share();

        collect();

    }

//收藏模块
    private void collect(){



        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                urlArrayList=new ArrayList<>();
                urlArrayList=dbc.showAll();

                if(ischange(title,urlArrayList)){
                    dbc.delete(url);
                    img2.setImageResource(R.drawable.nocollect);
                    Log.e("msg111", dbc.showAll()+"");
                    Toast.makeText(GoToWeb.this,"取消收藏",Toast.LENGTH_SHORT).show();
                }else{
//分别为intent传过来title,url,img
                    dbc.add(title,url,img);
                    img2.setImageResource(R.drawable.collect);
                    makeText(GoToWeb.this,"收藏成功",Toast.LENGTH_SHORT).show();
                }

            }
        });



    }


//判断是否收藏过了
    private boolean ischange(String a, ArrayList<Urls> u){
           for(Urls url:u){
               //如果获取的标题和点击传过来的标题相同返回true（已经收藏）
               if(url.getTitle().equals(a)){
                   return true;
               }
           }

        //如果获取的标题和点击传过来的标题相同返回false（没收藏）
        return false;
    }



//分享模块
    private void share(){
        //图片来源
        image=new UMImage(GoToWeb.this,img);
         uweb=new UMWeb(url);

        uweb.setTitle(title);//标题
        uweb.setThumb(image);  //缩略图
        uweb.setDescription("虹宇专属");//描述

        /**
         *其中umShareListener为回调监听，构建如下，其中分享成功会回调onComplete，
         * 取消分享回调onCancel，分享错误回调onError，对应的错误信息可以
         * 用过onError的Throwable参数来打印
         */
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new ShareAction(GoToWeb.this).withText(" ").withMedia(uweb)
                        .setDisplayList(SHARE_MEDIA.SINA,SHARE_MEDIA.QQ,SHARE_MEDIA.WEIXIN)
                        .setCallback(new UMShareListener() {
                            @Override
                            public void onStart(SHARE_MEDIA share_media) {
                                makeText(GoToWeb.this,"开始分享",Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onResult(SHARE_MEDIA share_media) {
                                makeText(GoToWeb.this,"分享成功",Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onError(SHARE_MEDIA share_media, Throwable throwable) {
                                makeText(GoToWeb.this,"出错了",Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onCancel(SHARE_MEDIA share_media) {
                                makeText(GoToWeb.this,"取消了",Toast.LENGTH_SHORT).show();
                            }
                        }).open();
            }
        });





    }

    /**
     *最后在分享所在的Activity里复写onActivityResult方法,注意不可在fragment中实现，
     * 如果在fragment中调用分享，在fragment依赖的Activity中实现，
     * 如果不实现onActivityResult方法，会导致分享或回调无法正常进行
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        UMShareAPI.get(this).onActivityResult(requestCode, resultCode, data);

    }


    private void bar() {
        webView.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                if (newProgress == 100) {
                    bar.setVisibility(View.GONE);
                } else {
                    if (View.INVISIBLE == bar.getVisibility()) {
                        bar.setVisibility(View.VISIBLE);
                    }
                    bar.setProgress(newProgress);
                }
                super.onProgressChanged(view, newProgress);
            }

        });
    }


    //网页加载后的处理 网址改变

    private void urlchange(){

        webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {

                view.loadUrl(url);
                return true;
            }
        });
    }


//    private void urlchange() {
//        webView.setWebViewClient(new WebViewClient() {
//            @Override
//            public boolean shouldOverrideUrlLoading(WebView view, String url) {
//                view.loadUrl(url);
//                return true;
//            }
//        });
//
//    }

    private void gongneng() {
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

// User settings
        webSettings.setJavaScriptEnabled(true);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        webSettings.setUseWideViewPort(true);//关键点

        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);

        webSettings.setDisplayZoomControls(false);
        webSettings.setJavaScriptEnabled(true); // 设置支持javascript脚本
        webSettings.setAllowFileAccess(true); // 允许访问文件
        webSettings.setBuiltInZoomControls(true); // 设置显示缩放按钮
        webSettings.setSupportZoom(true); // 支持缩放

        webSettings.setLoadWithOverviewMode(true);
    }


    @Override
    public void onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack();
        }else {
            super.onBackPressed();
        }

    }




}


