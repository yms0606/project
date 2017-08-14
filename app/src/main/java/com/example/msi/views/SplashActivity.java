package com.example.msi.views;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by msi on 2017-08-14.
 */

public class SplashActivity extends Activity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.splash2);
            Handler handler2 = new Handler();
            handler2.postDelayed(new Runnable() {
                @Override
                public void run() {
                    finish();
                }
            }, 3000);
        }
    }

