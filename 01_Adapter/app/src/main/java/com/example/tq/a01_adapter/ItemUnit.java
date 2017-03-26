package com.example.tq.a01_adapter;

/**
 * Created by tq on 2017/3/26.
 */

public class ItemUnit {
    private String title;
    private String context;
    private int imageid;

    public ItemUnit(String title, String context, int imageid) {
        this.title = title;
        this.context = context;
        this.imageid = imageid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public int getImageid() {
        return imageid;
    }

    public void setImageid(int imageid) {
        this.imageid = imageid;
    }
}
