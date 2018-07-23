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
import android.widget.Toast;

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

import java.util.Calendar;
import java.util.Set;
import java.util.TreeSet;

import static com.applikeysolutions.cosmocalendar.utils.SelectionType.MULTIPLE;

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
        SelectionManager(calendar);

        return view;
    }

    //    캘린더 디자인 기본 설정
    public void setCalendarDesign(CalendarView calendar){
        calendar.setDayTextColor(R.color.calendar_color1); //오늘 날짜 색깔
        calendar.setSelectedDayBackgroundColor(R.color.maincolor);

    }

//   날짜 선택 리스너
    public void SelectionManager (final CalendarView calendar){

        //        여러 개 선택
        OnDaySelectedListener onDaySelectedListener = new OnDaySelectedListener() {
            @Override
            public void onDaySelected() {
                Toast.makeText(getContext(),"클릭",Toast.LENGTH_SHORT).show();
            }
        };

        MultipleSelectionManager multipleSelectionManager = new MultipleSelectionManager(onDaySelectedListener){
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

        RangeSelectionManager rangeSelectionManager = new RangeSelectionManager(onDaySelectedListener){
            @Override
            public Pair<Day, Day> getDays() {
                return super.getDays();
            }

            @Override
            public void toggleDay(@NonNull Day day) {
                super.toggleDay(day);
                final AddAlbaDayDialog dialog = new AddAlbaDayDialog(getContext());
                dialog.show();
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



}
