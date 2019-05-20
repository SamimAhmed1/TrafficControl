package com.example.trafficcontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NoSigns extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_signs);
        getSupportActionBar().setTitle("‘না-বাচক’ বাধ্যতামূলক সাইনসমূহ");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
