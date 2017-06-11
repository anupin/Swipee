package com.anupin.swipee;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;

import com.eftimoff.viewpagertransformers.DepthPageTransformer;

import me.relex.circleindicator.CircleIndicator;

public class ActViewPager extends ActionBarActivity {
    private MyPagerAdapter pageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        pageAdapter = new MyPagerAdapter(getSupportFragmentManager());

        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);
        viewPager.setPageTransformer(true, new DepthPageTransformer());
        viewPager.setAdapter(pageAdapter);
        indicator.setViewPager(viewPager);
    }

    public static class MyPagerAdapter extends FragmentPagerAdapter {
        private static int NUM_ITEMS = 3;

        public MyPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        // Returns total number of pages
        @Override
        public int getCount() {
            return NUM_ITEMS;
        }

        // Returns the fragment to display for that page
        @Override
        public Fragment getItem(int position) {
            if (position == 0)
                return new ActRed();
            else if(position==1)
                return new ActGreen();
            else if(position==2)
                return new ActLogin();
            else
                return new ActLogin();

        }

    }


}
