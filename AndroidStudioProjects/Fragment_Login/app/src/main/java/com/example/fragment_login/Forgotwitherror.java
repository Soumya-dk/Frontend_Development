package com.example.fragment_login;


import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Forgotwitherror extends Fragment {


    Button forgotpassbtn1;
    TextView textview, text;
    ImageView imageview;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_forgotwitherror, container, false);



        forgotpassbtn1 = (Button) view.findViewById(R.id.forgotpassbtn1);

        forgotpassbtn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                final Dialog epicDialog=new Dialog(getContext());
                epicDialog.setContentView(R.layout.forgot_alert);

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
        return  view;
    }
}

