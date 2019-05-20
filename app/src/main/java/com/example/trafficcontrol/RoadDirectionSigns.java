package com.example.trafficcontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RoadDirectionSigns extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_road_direction_signs);
        getSupportActionBar().setTitle("পথনির্দেশক সাইনসমূহ");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
