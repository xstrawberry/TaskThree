package com.example.administrator.secondtask.bean;

/**
 * Created by ASUS on 2017/3/6.
 */

public class Urls {
    private String title;
    private String url;
    private String img;

    @Override
    public String toString() {
        return "Urls{" +
                "title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", img='" + img + '\'' +
                '}';
    }

    public Urls(String title, String url, String img) {
        this.title = title;
        this.url = url;
        this.img = img;
    }

    public Urls() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
