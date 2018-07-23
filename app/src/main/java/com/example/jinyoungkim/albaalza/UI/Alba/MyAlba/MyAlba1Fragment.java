package com.example.jinyoungkim.albaalza.UI.Alba.MyAlba;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.jinyoungkim.albaalza.R;

public class MyAlba1Fragment extends Fragment {
    ImageView btn_add;
    public MyAlba1Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_alba1, container, false);

        btn_add = (ImageView)view.findViewById(R.id.btn_add);


        return view;
    }


}
