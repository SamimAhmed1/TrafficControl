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

    public void caution(View view) {
        Intent intent = new Intent(MainActivity.this, caution.class);
        startActivity(intent);
    }

    public void limit(View view) {
        Intent intent = new Intent(MainActivity.this, limit.class);
        startActivity(intent);
    }

    public void othersSignal(View view) {
        Intent intent = new Intent(MainActivity.this, othersSignal.class);
        startActivity(intent);
    }

    public void arrow(View view) {
        Intent intent = new Intent(MainActivity.this, rectangularWarnings.class);
        startActivity(intent);
    }

    public void prohibited(View view) {
        Intent intent = new Intent(MainActivity.this, prohibited.class);
        startActivity(intent);
    }
}
