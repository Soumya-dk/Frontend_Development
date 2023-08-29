package com.example.recyclernextactvity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView textTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        textTitle = findViewById(R.id.activityTitle);

        Intent i = getIntent();
        String title = i.getStringExtra("title");
        textTitle.setText(title);
    }
}
