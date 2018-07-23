package com.example.jinyoungkim.albaalza.Base.Utils;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TimePicker;

import com.example.jinyoungkim.albaalza.R;
import com.example.jinyoungkim.albaalza.UI.Alba.MyAlba.MyAlba1Fragment;


/**
 * Created by jinyoungkim on 2018. 7. 23..
 */

// 캘린더 클릭 시 날짜 별 알바 추가 다이얼로그
public class AddAlbaDayDialog extends Dialog {

    TimePicker startPicker, endPicker;
    ImageView btn_dialog;
    int startHour,startMin,endHour,endMin;

    public AddAlbaDayDialog(@NonNull Context context) {
        super(context,android.R.style.Theme_Translucent_NoTitleBar);
    }

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.addalbadialog);

        startPicker = (TimePicker) findViewById(R.id.startPicker);
        endPicker = (TimePicker) findViewById(R.id.endPicker);
        btn_dialog = (ImageView) findViewById(R.id.btn_dialog);

//        시작 시,분
        startHour = startPicker.getHour();
        startMin = startPicker.getMinute();

//        종료 시,분
        endHour = endPicker.getHour();
        endMin = endPicker.getMinute();

        btn_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), MyAlba1Fragment.class);
                i.putExtra("startHour",startHour);
                i.putExtra("startMin",startMin);
                i.putExtra("endHour",endHour);
                i.putExtra("endMin",endMin);

                dismiss();
            }

        });

    }
}
