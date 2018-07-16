package com.example.jinyoungkim.albaalza.UI.Alba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.jinyoungkim.albaalza.R;
import com.example.jinyoungkim.albaalza.UI.Alba.AlbaTing.AlbaTingFragment;
import com.example.jinyoungkim.albaalza.UI.Alba.Home.HomeFragment;
import com.example.jinyoungkim.albaalza.UI.Alba.Labor.LaborFragment;
import com.example.jinyoungkim.albaalza.UI.Alba.MyAlba.MyAlbaFragment;
import com.example.jinyoungkim.albaalza.UI.Alba.Setting.SettingFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView tab_home, tab_myalba, tab_albating, tab_labor, tab_setting;

    private HomeFragment homeFragment;
    private MyAlbaFragment myAlbaFragment;
    private AlbaTingFragment albaTingFragment;
    private LaborFragment laborFragment;
    private SettingFragment settingFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Fragment 정의
        homeFragment = new HomeFragment();
        myAlbaFragment = new MyAlbaFragment();
        albaTingFragment = new AlbaTingFragment();
        laborFragment = new LaborFragment();
        settingFragment = new SettingFragment();

//        첫번째로 보여질 탭 홈탭으로 설정
        getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, homeFragment).commit();

//        이미지 버튼
        tab_home = (ImageView)findViewById(R.id.tab_home);
        tab_myalba = (ImageView)findViewById(R.id.tab_myalba);
        tab_albating = (ImageView)findViewById(R.id.tab_albating);
        tab_labor = (ImageView)findViewById(R.id.tab_labor);
        tab_setting = (ImageView)findViewById(R.id.tab_setting);

        tab_home.setOnClickListener(this);
        tab_myalba.setOnClickListener(this);
        tab_albating.setOnClickListener(this);
        tab_labor.setOnClickListener(this);
        tab_setting.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
    switch (view.getId()){
        case R.id.tab_home:
            getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, homeFragment).commit();
            break;

        case R.id.tab_myalba:
            getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, myAlbaFragment).commit();
            break;

        case R.id.tab_albating:
            getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, albaTingFragment).commit();
            break;

        case R.id.tab_labor:
            getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, laborFragment).commit();
            break;

        case R.id.tab_setting:
            getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, settingFragment).commit();
            break;
    }
    }
}
