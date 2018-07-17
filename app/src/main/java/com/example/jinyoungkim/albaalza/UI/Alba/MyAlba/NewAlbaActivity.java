package com.example.jinyoungkim.albaalza.UI.Alba.MyAlba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.jinyoungkim.albaalza.R;

public class NewAlbaActivity extends AppCompatActivity {

    ImageView add_alba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newalba);

        add_alba = (ImageView)findViewById(R.id.add_alba);

        add_alba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MakeAlbaActivity.class);
                startActivity(i);
            }
        });
    }
}
