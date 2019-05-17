package com.example.trafficcontrol;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class policeSignal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_signal);
        getSupportActionBar().setTitle("পুলিশ সিগন্যাল");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }


}
