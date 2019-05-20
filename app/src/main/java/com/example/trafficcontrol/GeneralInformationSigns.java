package com.example.trafficcontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class GeneralInformationSigns extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_information_signs);
        getSupportActionBar().setTitle("তথ্যমূলক সাইনসমূহ");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
