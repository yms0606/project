package com.example.msi.views;

import android.graphics.drawable.Drawable;

/**
 * Created by msi on 2017-08-13.
 */

public class Data3 {
    private String name3;
    private String content3;
    private Drawable img3;


    public void setName(String name){
        this.name3 = name ;
    }
    public void setContent(String content){
        this.content3 = content;
    }
    public void setImg(Drawable img){
        this.img3 = img;
    }
    public  String getName(){
        return  this.name3;
    }
    public  String getContent(){
        return  this.content3;
    }
    public Drawable getImg(){
        return this.img3;
    }
}
