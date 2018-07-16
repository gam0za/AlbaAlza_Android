package com.example.jinyoungkim.albaalza.UI.Alba.MyAlba;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jinyoungkim.albaalza.R;

public class MyAlbaFragment extends Fragment {


    public MyAlbaFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_myalba, container, false);
    }

}
