package com.example.jinyoungkim.albaalza.UI.Alba.MyAlba;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.util.Pair;
import android.text.Selection;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

import com.applikeysolutions.cosmocalendar.dialog.CalendarDialog;
import com.applikeysolutions.cosmocalendar.dialog.OnDaysSelectionListener;
import com.applikeysolutions.cosmocalendar.model.Day;
import com.applikeysolutions.cosmocalendar.selection.BaseSelectionManager;
import com.applikeysolutions.cosmocalendar.selection.MultipleSelectionManager;
import com.applikeysolutions.cosmocalendar.selection.OnDaySelectedListener;
import com.applikeysolutions.cosmocalendar.selection.RangeSelectionManager;
import com.applikeysolutions.cosmocalendar.selection.SelectionState;
import com.applikeysolutions.cosmocalendar.settings.lists.connected_days.ConnectedDays;
import com.applikeysolutions.cosmocalendar.view.CalendarView;
import com.example.jinyoungkim.albaalza.Base.Utils.AddAlbaDayDialog;
import com.example.jinyoungkim.albaalza.R;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static com.applikeysolutions.cosmocalendar.utils.SelectionType.MULTIPLE;

public class MyAlba1Fragment extends Fragment {
    CalendarView calendar;
    ImageView btn_add;
    CalendarDialog calendarDialog;
    ArrayList<Day> days = new ArrayList<>();
    MultipleSelectionManager multipleSelectionManager;
    RangeSelectionManager rangeSelectionManager;
    public MyAlba1Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_alba1, container, false);

        calendar = (CalendarView)view.findViewById(R.id.calendarview);
        btn_add = (ImageView)view.findViewById(R.id.btn_add);


        setCalendarDesign(calendar);
        SelectionManager(calendar);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addAlbaDay();
            }
        });

        return view;
    }


    //    1. 캘린더 디자인 기본 설정
    public void setCalendarDesign(CalendarView calendar){
        calendar.setDayTextColor(R.color.calendar_color1); //오늘 날짜 색깔
        calendar.setSelectedDayBackgroundColor(R.color.maincolor);

    }

    //     2. 날짜 선택
    public void SelectionManager (final CalendarView calendar){


        OnDaySelectedListener onDaySelectedListener = new OnDaySelectedListener() {
            @Override
            public void onDaySelected() {
                Toast.makeText(getContext(),"클릭",Toast.LENGTH_SHORT).show();
            }
        };


        // 2-1. 날짜 각각 선택
         multipleSelectionManager = new MultipleSelectionManager(onDaySelectedListener){
            @Override
            public void toggleDay(@NonNull Day day) {
                super.toggleDay(day);
                calendar.setSelectedDayBackgroundColor(R.color.maincolor);
            }

            @Override
            public boolean isDaySelected(@NonNull Day day) {
                return super.isDaySelected(day);
            }

            @Override
            public void clearSelections() {
                super.clearSelections();
            }

            @Override
            public void removeDay(Day day) {
                super.removeDay(day);
            }
        };

        // 2-2. 날짜 연결 선택
         rangeSelectionManager = new RangeSelectionManager(onDaySelectedListener){
            @Override
            public Pair<Day, Day> getDays() {
                return super.getDays();
            }

            @Override
            public void toggleDay(@NonNull Day day) {
                super.toggleDay(day);
                final AddAlbaDayDialog dialog = new AddAlbaDayDialog(getContext());
                dialog.show();
                days.add(day);
            }

            @Override
            public boolean isDaySelected(@NonNull Day day) {
                return super.isDaySelected(day);
            }

            @Override
            public void clearSelections() {
                super.clearSelections();
            }

            @Override
            public SelectionState getSelectedState(Day day) {
                return super.getSelectedState(day);
            }

        };

        calendar.setSelectionManager(rangeSelectionManager);


    }

    //     다이얼로그 열기
    public void addAlbaDay(){

        Toast.makeText(getContext(), "PAIR  "+rangeSelectionManager.getDays(), Toast.LENGTH_LONG).show();

        OnDaysSelectionListener onDaysSelectionListener = new OnDaysSelectionListener() {
            @Override
            public void onDaysSelected(List<Day> selectedDays) {
                Toast.makeText(getContext(),"test::::"+selectedDays.get(0).toString(),Toast.LENGTH_SHORT).show();
            }
        };

        calendarDialog = new CalendarDialog(getContext(),onDaysSelectionListener);
        calendarDialog.show();

        calendar.setSelectedDayBackgroundColor(R.color.maincolor);
    }

}
