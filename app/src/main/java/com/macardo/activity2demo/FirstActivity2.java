package com.macardo.activity2demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button First2Btn = findViewById(R.id.FirstActivityBtn);
        First2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("FirstActivity2 task id: "+getTaskId());
                Intent intent = new Intent(FirstActivity2.this,SecondActivity2.class);
                startActivity(intent);
            }
        });
    }
}
