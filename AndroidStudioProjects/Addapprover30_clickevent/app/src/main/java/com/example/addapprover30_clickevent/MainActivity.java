package com.example.addapprover30_clickevent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button1);
        TextView textView1 = findViewById(R.id.textview1);

        button1.setOnClickListener(this);
        textView1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                Toast.makeText(this, "DONE",Toast.LENGTH_SHORT).show();
                break;
            case R.id.textview1:
                Toast.makeText(this, "CANCEL",Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
