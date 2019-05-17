package com.example.trafficcontrol;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class othersSignal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others_signal);
        getSupportActionBar().setTitle("অন্যান্য সিগন্যাল");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
