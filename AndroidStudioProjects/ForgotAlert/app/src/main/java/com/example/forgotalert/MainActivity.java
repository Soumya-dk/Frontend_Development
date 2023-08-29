package com.example.forgotalert;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Dialog epicDialog;
    Button button;
    TextView textview,text;
    ImageView imageview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        epicDialog = new Dialog(this);

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Showdailog();
            }

            private void Showdailog() {

                epicDialog.setContentView(R.layout.dialog_layout);

                imageview = (ImageView) epicDialog.findViewById(R.id.imageview);
                textview = (TextView) epicDialog.findViewById(R.id.textview);
                text = (TextView) epicDialog.findViewById(R.id.text);

                imageview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        epicDialog.dismiss();
                    }
                });
          epicDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
              epicDialog.show();
            }
        });
    }

}