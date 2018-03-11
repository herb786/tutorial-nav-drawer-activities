package com.hacaller.navinternationalevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class VenuesActivity extends NavActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActivityView(R.layout.activity_venues);

        getSupportActionBar().setTitle("VENUES");
    }
}
