package com.example.trafficcontrol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void trafficLight(View view) {
        Intent intent = new Intent(MainActivity.this,trafficLight.class);
        startActivity(intent);
    }

    public void policeSignal(View view) {
        Intent intent = new Intent(MainActivity.this, policeSignal.class);
        startActivity(intent);
    }

    public void cautionarysigns(View view) {
        Intent intent = new Intent(MainActivity.this, caution.class);
        startActivity(intent);
    }

    public void YesNoSigns(View view) {
        Intent intent = new Intent(MainActivity.this, YesNoSign.class);
        startActivity(intent);
    }

    public void othersSignal(View view) {
        Intent intent = new Intent(MainActivity.this, othersSignal.class);
        startActivity(intent);
    }


    public void roadDirection(View view) {
        Intent intent = new Intent(MainActivity.this, RoadDirectionSigns.class);
        startActivity(intent);
    }

    public void generalInformation(View view) {
        Intent intent = new Intent(MainActivity.this, GeneralInformationSigns.class);
        startActivity(intent);
    }
}
