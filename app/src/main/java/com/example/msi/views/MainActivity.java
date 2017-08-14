package com.example.msi.views;




import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;

import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;



public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    ViewPager viewPager ;
    TabLayout tapLayout ;
    Tab pagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(this, SplashActivity.class));
        setContentView(R.layout.mains);

        viewPager = (ViewPager)findViewById(R.id.viewpager);
        tapLayout = (TabLayout)findViewById(R.id.tabs);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        pagerAdapter = new Tab(getSupportFragmentManager(),tapLayout.getTabCount());


        tapLayout.addTab(tapLayout.newTab().setText("frg1!").
                                setTag("frg1"));
        tapLayout.addTab(tapLayout.newTab().setText("frg2!").
                setTag("frg2"));
        tapLayout.addTab(tapLayout.newTab().setText("frg3!").
                setTag("frg3"));
        tapLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("welcome");

        viewPager.setAdapter(pagerAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tapLayout));

        tapLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

                switch (tapLayout.getSelectedTabPosition()){
                    case 0:
                        getSupportActionBar().setTitle("즐겨라 ! 인생을 !");
                        tab.setText("funny");
                        break;
                    case 1:
                        getSupportActionBar().setTitle("오늘은 어떤 일이 !?");
                        tab.setText("daily day");
                        break;
                    case 2:
                        getSupportActionBar().setTitle("말안해도 알잖아 ~");
                        tab.setText("19");
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                switch (tapLayout.getSelectedTabPosition()){
                    case 0:
                        tab.setText("funny");
                        break;
                    case 1:
                        tab.setText("daily life");
                        break;
                    case 2:
                        tab.setText("//_//");
                        break;
                }

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

}
