package com.hacaller.navinternationalevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TimetableActivity extends NavActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActivityView(R.layout.activity_timetable);

        getSupportActionBar().setTitle("TIMETABLE");
    }
}
