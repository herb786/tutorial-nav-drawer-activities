package com.hacaller.navinternationalevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class GalleryActivity extends NavActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActivityView(R.layout.activity_gallery);

        getSupportActionBar().setTitle("GALLERY");
    }
}
