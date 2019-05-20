package com.example.trafficcontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class YesSigns extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yes_signs);
        getSupportActionBar().setTitle("‘হ্যাঁ-বাচক’ বাধ্যতামূলক সাইনসমূহ");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
