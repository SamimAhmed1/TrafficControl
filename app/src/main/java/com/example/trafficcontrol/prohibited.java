package com.example.trafficcontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class prohibited extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prohibited);
        getSupportActionBar().setTitle("Prohibited");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
