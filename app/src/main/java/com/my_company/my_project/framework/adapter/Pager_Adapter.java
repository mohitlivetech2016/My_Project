package com.my_company.my_project.framework.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.my_company.my_project.framework.fragments.FirstCall_Fragment;
import com.my_company.my_project.framework.fragments.SecondCall_Fragment;

public class Pager_Adapter extends FragmentStatePagerAdapter{

    int mNumOfTabs;

    public Pager_Adapter(FragmentManager fm,int NumOfTabbs) {
        super(fm);
        this.mNumOfTabs=NumOfTabbs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){

            case 0:
                FirstCall_Fragment tab1=new FirstCall_Fragment();
                return tab1;
            case 1:
                SecondCall_Fragment tab2=new SecondCall_Fragment();
                return tab2;
            default:
                return null;

        }



    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
