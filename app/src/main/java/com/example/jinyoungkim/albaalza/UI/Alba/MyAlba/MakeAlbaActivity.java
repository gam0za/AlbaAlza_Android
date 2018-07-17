package com.example.jinyoungkim.albaalza.UI.Alba.MyAlba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.jinyoungkim.albaalza.R;

public class MakeAlbaActivity extends AppCompatActivity {

    EditText edit_albaname, edit_timepay, edit_payday, edit_searchboss;
    ImageView insurance_yes, insurance_no, btn_search, btn_addalba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makealba);

        edit_albaname = (EditText)findViewById(R.id.edit_albaname);
        edit_timepay = (EditText)findViewById(R.id.edit_timepay);
        edit_payday = (EditText)findViewById(R.id.edit_payday);
        edit_searchboss = (EditText)findViewById(R.id.edit_searchboss);

        insurance_yes = (ImageView)findViewById(R.id.insurance_yes);
        insurance_no = (ImageView)findViewById(R.id.insurance_no);
        btn_search = (ImageView)findViewById(R.id.btn_search);
        btn_addalba = (ImageView)findViewById(R.id.btn_addalba);
    }
}
