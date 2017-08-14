package com.example.msi.views;

import android.graphics.drawable.Drawable;

/**
 * Created by msi on 2017-08-13.
 */

public class Data {
    private String name;
    private String content;
    private Drawable img;


    public void setName(String name){
        this.name = name ;
    }
    public void setContent(String content){
        this.content = content;
    }
    public void setImg(Drawable img){
        this.img = img;
    }
    public  String getName(){
        return  this.name;
    }
    public  String getContent(){
        return  this.content;
    }
    public Drawable getImg(){
        return this.img;
    }

}
