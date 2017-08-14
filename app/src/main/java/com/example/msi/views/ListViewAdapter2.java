package com.example.msi.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
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

public class ListViewAdapter2 extends BaseAdapter{
    private ArrayList<Data2> listViewItemList2 = new ArrayList<Data2>();

    public ListViewAdapter2(){

    }

    @Override
    public int getCount() {
        return listViewItemList2.size();
    }

    @Override
    public Object getItem(int position2) {
        return listViewItemList2.get(position2);
    }

    @Override
    public long getItemId(int position2){
        return position2;
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

        Data2 listViewItem = listViewItemList2.get(position);

        iv.setImageDrawable(listViewItem.getImg());
        tv_1.setText(listViewItem.getName());
        tv_2.setText(listViewItem.getContent());
        return convertView;
    }
    public void addItem(Drawable img, String name, String content){
        Data2 item2 = new Data2();
        item2.setImg(img);
        item2.setName(name);
        item2.setContent(content);
        listViewItemList2.add(item2);
    }
}
