package com.lambton.java.project.sem1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.javaprojectsem1.javaprojectsem1.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @OnClick(R.id.btn_take_attendance)
    void onClickTakeAttendance() {
        Intent mainActivity = new Intent(MainActivity.this, TakeAttendance.class);
        startActivity(mainActivity);
    }

    @OnClick(R.id.btn_reports)
    void onClickReports() {
        Intent mainActivity = new Intent(MainActivity.this, Reports.class);
        startActivity(mainActivity);
    }

    @OnClick(R.id.btn_about_us)
    void onClickAboutUs() {
        Intent mainActivity = new Intent(MainActivity.this, AboutUs.class);
        startActivity(mainActivity);
    }

    @OnClick(R.id.btn_contact_us)
    void onClickContactUs() {
        Intent mainActivity = new Intent(this, ContactUs.class);
        startActivity(mainActivity);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

}
