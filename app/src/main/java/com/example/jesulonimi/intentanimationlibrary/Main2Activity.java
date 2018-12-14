package com.example.jesulonimi.intentanimationlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import maes.tech.intentanim.CustomIntent;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


    }

    @Override
    public void finish() {
        super.finish();
        CustomIntent.customType(this,"right-to-left");
    }
}
