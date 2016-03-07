package com.example.niuxm.practice.news;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.niuxm.practice.R;
import com.example.niuxm.practice.baisc.BaseFragment;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by niuxm on 2016/3/1.
 */
public class NewFragment extends BaseFragment {

    private ViewPager mViewPager;
    private TabLayout mNews_Tab;


    @Nullable @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news, container, false);
        mViewPager = (ViewPager) view.findViewById(R.id.viewpager);
        mNews_Tab = (TabLayout) view.findViewById(R.id.news_tab);
        initTabLayout();
        initViewPager();
        mNews_Tab.setupWithViewPager(mViewPager);
        return view;
    }


    private void initViewPager() {
        NewsViewPagerAdapter newsViewPagerAdapter = new NewsViewPagerAdapter(
                getChildFragmentManager());

        newsViewPagerAdapter.addFragment(NewsListFragment.newInstance(1),
                "NBA");
        newsViewPagerAdapter.addFragment(NewsListFragment.newInstance(2),
                "娱乐");
        newsViewPagerAdapter.addFragment(NewsListFragment.newInstance(3),
                "体育");
        newsViewPagerAdapter.addFragment(NewsListFragment.newInstance(4),
                "笑话");
        mViewPager.setAdapter(newsViewPagerAdapter);
    }


    private void initTabLayout() {
        mNews_Tab.addTab(mNews_Tab.newTab().setText("NBA"));
        mNews_Tab.addTab(mNews_Tab.newTab().setText("娱乐"));
        mNews_Tab.addTab(mNews_Tab.newTab().setText("体育"));
        mNews_Tab.addTab(mNews_Tab.newTab().setText("财经"));
    }


    private class NewsViewPagerAdapter extends FragmentPagerAdapter {

        private List<Fragment> mFragments = new ArrayList<>();
        private List<String> mFragmentsTitles = new ArrayList<>();


        public NewsViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }


        @Override public Fragment getItem(int position) {
            return mFragments.get(position) ;
        }


        @Override public int getCount() {
            return mFragments.size();
        }

        public void addFragment(Fragment fragment,String fragmentTitle) {
            mFragments.add(fragment);
            mFragmentsTitles.add(fragmentTitle);
        }


        @Override public CharSequence getPageTitle(int position) {
            return mFragmentsTitles.get(position);
        }
    }
}

