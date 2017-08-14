package com.example.msi.views;

import android.graphics.drawable.Drawable;

/**
 * Created by msi on 2017-08-13.
 */

public class Data2 {
    private String name2;
    private String content2;
    private Drawable img2;


    public void setName(String name){
        this.name2 = name ;
    }
    public void setContent(String content){
        this.content2 = content;
    }
    public void setImg(Drawable img){
        this.img2 = img;
    }
    public  String getName(){
        return  this.name2;
    }
    public  String getContent(){
        return  this.content2;
    }
    public Drawable getImg(){
        return this.img2;
    }
}
