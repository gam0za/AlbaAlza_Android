package com.example.jinyoungkim.albaalza.UI.Alba.MyAlba;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.applikeysolutions.cosmocalendar.view.CalendarView;
import com.example.jinyoungkim.albaalza.R;

public class MyAlba1Fragment extends Fragment {
    CalendarView calendar;

    public MyAlba1Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_alba1, container, false);

        calendar = (CalendarView)view.findViewById(R.id.calendar_view);
        setCalendarDesign(calendar);

        return view;
    }

//    캘린더 디자인 기본 설정
    public void setCalendarDesign(CalendarView calendar){
        calendar.setDayTextColor(R.color.calendar_color1); //오늘 날짜 색깔
        calendar.setSelectedDayBackgroundColor(R.color.maincolor);

    }


}
