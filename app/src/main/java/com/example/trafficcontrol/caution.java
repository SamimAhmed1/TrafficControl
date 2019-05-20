package com.example.trafficcontrol;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class caution extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caution);
        getSupportActionBar().setTitle("সতর্কতামূলক সাইনসমূহ");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void generalcautionarysigns(View view) {
        Intent intent = new Intent(caution.this, GeneralCautionarySigns.class);
        startActivity(intent);
    }

    public void specialcautionarysigns(View view) {
        Intent intent = new Intent(caution.this, SpecialCautionarySign.class);
        startActivity(intent);
    }
}
