package com.example.msi.views;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


/**
 * Created by msi on 2017-08-09.
 */

public class Tab extends FragmentStatePagerAdapter {
    private int tabCount ;


    public Tab(FragmentManager fm , int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                CustomListFragment fr1 = new CustomListFragment();
                return fr1;
            case 1:
                CustomListFragment2 fr2 = new CustomListFragment2();
                return fr2;
            case 2:
                CustomListFragment3 fr3 = new CustomListFragment3();
                return fr3;
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
