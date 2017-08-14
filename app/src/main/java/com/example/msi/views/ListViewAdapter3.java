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

public class ListViewAdapter3 extends BaseAdapter {
    private ArrayList<Data3> listViewItemList3 = new ArrayList<Data3>();

    public ListViewAdapter3(){

    }

    @Override
    public int getCount() {
        return listViewItemList3.size();
    }

    @Override
    public Object getItem(int position3) {
        return listViewItemList3.get(position3);
    }

    @Override
    public long getItemId(int position3) {
        return position3;
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

        Data3 listViewItem = listViewItemList3.get(position);

        iv.setImageDrawable(listViewItem.getImg());
        tv_1.setText(listViewItem.getName());
        tv_2.setText(listViewItem.getContent());
        return convertView;
    }
    public void addItem(Drawable img, String name, String content){
        Data3 item3 = new Data3();
        item3.setImg(img);
        item3.setName(name);
        item3.setContent(content);
        listViewItemList3.add(item3);
    }
}
