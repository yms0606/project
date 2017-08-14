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
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by msi on 2017-08-13.
 */

public class CustomListFragment3 extends Fragment {

    private ListView listView3;
    FrameLayout frameLayout;
    ListViewAdapter3 adapter3;
    Button btok;
    EditText editText;
    public  CustomListFragment3(){

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frg3,container,false);
        frameLayout = (FrameLayout) view.findViewById(R.id.frameLayout);
        editText = (EditText) view.findViewById(R.id.editText);
        btok = (Button) view.findViewById(R.id.btok);
        listView3 = (ListView) view.findViewById(R.id.listview3);
        adapter3 = new ListViewAdapter3();
        listView3.setAdapter(adapter3);
        adapter3.addItem(ContextCompat.getDrawable(getActivity(),R.drawable.ad191),
                "19세이상만 - Over 19 ages","https://www.facebook.com/sangmanlee19/?fref=ts");
        adapter3.addItem(ContextCompat.getDrawable(getActivity(),R.drawable.ad192),
                "순결한 19금 놀이터","https://www.facebook.com/soonkumnol19/");

        btok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = Integer.parseInt(editText.getText().toString());
                if(i>19){
                    frameLayout.setVisibility(View.GONE);
                }
                else{
                    Toast toast = Toast.makeText(getActivity(),"    접근 불가\n어딜 감히 청소년이 !"
                            ,Toast.LENGTH_LONG);
                    toast.show();
                }

            }
        });

        listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://www.facebook.com/sangmanlee19/?fref=ts"));
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(Intent.ACTION_VIEW);
                        intent1.setData(Uri.parse("https://www.facebook.com/soonkumnol19/"));
                        startActivity(intent1);
                        break;
                }
            }
        });
        return  view;

    }
}
