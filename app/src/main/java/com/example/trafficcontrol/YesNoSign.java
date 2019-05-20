package com.example.trafficcontrol;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class YesNoSign extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yes_no_sign);
        getSupportActionBar().setTitle("'হাঁ-না বাচক'সাইনসমূহ");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void YesSigns(View view) {
        Intent intent = new Intent(YesNoSign.this, YesSigns.class);
        startActivity(intent);
    }

    public void NoSigns(View view) {
        Intent intent = new Intent(YesNoSign.this, NoSigns.class);
        startActivity(intent);
    }
}
