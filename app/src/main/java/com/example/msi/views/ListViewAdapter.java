package com.example.msi.views;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by msi on 2017-08-13.
 */

public class ListViewAdapter extends BaseAdapter {

    private ArrayList<Data> listViewItemList = new ArrayList<Data>();

    public ListViewAdapter(){

    }

    @Override
    public int getCount() {
        return listViewItemList.size();
    }

    @Override
    public Object getItem(int position) {
        return listViewItemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();

        if(convertView==null){
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.view,parent,false);
        }
        ImageView iv = (ImageView) convertView.findViewById(R.id.imageview_1);
        TextView tv_1 = (TextView) convertView.findViewById(R.id.textview_1);
        TextView tv_2 = (TextView) convertView.findViewById(R.id.textview_2);

        Data listViewItem = listViewItemList.get(position);

        iv.setImageDrawable(listViewItem.getImg());
        tv_1.setText(listViewItem.getName());
        tv_2.setText(listViewItem.getContent());



        return convertView;
    }
    public void addItem(Drawable img,String name,String content){
        Data item = new Data();
        item.setImg(img);
        item.setName(name);
        item.setContent(content);
        listViewItemList.add(item);
    }
}
