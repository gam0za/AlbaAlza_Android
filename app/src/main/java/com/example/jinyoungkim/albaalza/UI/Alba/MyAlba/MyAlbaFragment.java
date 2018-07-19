package com.example.jinyoungkim.albaalza.UI.Alba.MyAlba;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jinyoungkim.albaalza.R;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator;

public class MyAlbaFragment extends Fragment {
    private SharedPreferences sharedPreferences;
    private ViewPager viewPager;
    public MyAlbaFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_myalba, container, false);
//        viewpager
        viewPager = (ViewPager)view.findViewById(R.id.viewpager);
        viewPager.setAdapter(new pagerAdapter(getActivity().getSupportFragmentManager()));
        viewPager.setCurrentItem(0);

        return view;
    }


    private class pagerAdapter extends FragmentPagerAdapter {

        public pagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if(position ==0 ){
                return new MyAlba1Fragment();
            }else if(position ==1){
                return new MyAlba2Fragment();
            }else{
                return new MyAlba3Fragment();
            }
        }

        @Override
        public int getCount() {
            return 3;
        }
    }





}
