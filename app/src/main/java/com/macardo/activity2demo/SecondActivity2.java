package com.macardo.activity2demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SecondActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        System.out.println("SecondActivity2 task id: "+getTaskId());
    }
}
