package com.example.trafficcontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SpecialCautionarySign extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_special_cautionary_sign);
        getSupportActionBar().setTitle("বিশেষ সতর্কতামুলক সাইনসমূহ");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
