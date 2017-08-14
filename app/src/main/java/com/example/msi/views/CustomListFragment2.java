package com.example.msi.views;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by msi on 2017-08-13.
 */

public class CustomListFragment2 extends Fragment {
    private ListView listView2;
    ListViewAdapter2 adapter2;
    public  CustomListFragment2(){

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frg2,container,false);

        listView2 = (ListView) view.findViewById(R.id.listview2);
        adapter2 = new ListViewAdapter2();
        listView2.setAdapter(adapter2);
        adapter2.addItem(ContextCompat.getDrawable(getActivity(),R.drawable.daily1),
               "오버워치 - OverWatch","https://www.facebook.com/kroverwatchfans/?fref=ts");
        adapter2.addItem(ContextCompat.getDrawable(getActivity(),R.drawable.daily2),
                "두산베어스 - DoosanBears","https://www.facebook.com/1982doosanbears/?fref=ts");
        adapter2.addItem(ContextCompat.getDrawable(getActivity(),R.drawable.daily3),
                "김지원 - Ji won Kim","https://www.facebook.com/OfficialKimJiWon1/?fref=ts");
        adapter2.addItem(ContextCompat.getDrawable(getActivity(),R.drawable.daily4),
                "미친야구","https://www.facebook.com/crazzzybaseball");
        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://www.facebook.com/kroverwatchfans/?fref=ts"));
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(Intent.ACTION_VIEW);
                        intent1.setData(Uri.parse("https://www.facebook.com/1982doosanbears/?fref=ts"));
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(Intent.ACTION_VIEW);
                        intent2.setData(Uri.parse("https://www.facebook.com/OfficialKimJiWon1/?fref=ts"));
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(Intent.ACTION_VIEW);
                        intent3.setData(Uri.parse("https://www.facebook.com/crazzzybaseball"));
                        startActivity(intent3);
                        break;


                }

            }
        });
        return  view;

    }
}
