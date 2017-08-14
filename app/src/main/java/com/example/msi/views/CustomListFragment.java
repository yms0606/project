package com.example.msi.views;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.view.menu.ListMenuPresenter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by msi on 2017-08-13.
 */

public class CustomListFragment extends Fragment {
    private ListView listView;
    ListViewAdapter adapter;
    public  CustomListFragment(){

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, final Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frg1, container, false);

        listView = (ListView) view.findViewById(R.id.listview1);
        adapter = new ListViewAdapter();
        listView.setAdapter(adapter);
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.funny1),
                "웃고싶으면 들어와 - 일상의 추억", "https://www.facebook.com/yourfuny");
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.funny2),
                "웃음으로 하나되는 공간", "http://www.wowentertainment.co.kr/");
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.funny3),
                "개웃김", "https://www.facebook.com/yeah.kr/?fref=ts");
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.funny4),
                "웃음관리위원회", "https://www.facebook.com/smilemarket2/?fref=ts");
        adapter.addItem(ContextCompat.getDrawable(getActivity(),R.drawable.funny5),
                "세상에서 가장 웃긴 동영상","https://www.facebook.com/gagdong/?fref=ts");

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://www.facebook.com/yourfuny"));
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(Intent.ACTION_VIEW);
                        intent1.setData(Uri.parse("https://www.facebook.com/UTAGONG/?fref=ts"));
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(Intent.ACTION_VIEW);
                        intent2.setData(Uri.parse("https://www.facebook.com/yeah.kr/?fref=ts"));
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(Intent.ACTION_VIEW);
                        intent3.setData(Uri.parse("https://www.facebook.com/smilemarket2/?fref=ts"));
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(Intent.ACTION_VIEW);
                        intent4.setData(Uri.parse("https://www.facebook.com/gagdong/?fref=ts"));
                        startActivity(intent4);
                        break;
                }

            }
        });


        return view;
    }



}
