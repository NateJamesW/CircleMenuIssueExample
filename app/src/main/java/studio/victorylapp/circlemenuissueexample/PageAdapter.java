package studio.victorylapp.circlemenuissueexample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import studio.victorylapp.fragments.MainFragment;
import studio.victorylapp.fragments.SecondFragment;
import studio.victorylapp.fragments.ThirdFragement;

public class PageAdapter extends FragmentPagerAdapter {

    private int numOfTabs;

    PageAdapter(FragmentManager fm, int numOfTabs){
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position){
        switch (position){
            case 0 :
                return new MainFragment();
            case 1:
                return new SecondFragment();
            case 2:
                return new ThirdFragement();
            default:
                return null;
        }
    }

    @Override
    public  int getCount(){ return  numOfTabs;}
}
