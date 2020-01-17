package com.example.recyclernextactvity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView mTitletv,mDestv;
    ImageView mImageViewtv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        ActionBar actionBar = getSupportActionBar();

        mTitletv = findViewById(R.id.title);
        mDestv = findViewById(R.id.desc);
        mImageViewtv = findViewById(R.id.image);

        Intent intent = getIntent();
        String mTitle = intent.getStringExtra("iTitle");
        String mDes = intent.getStringExtra("iDes");

        byte[] mBytes = getIntent().getByteArrayExtra("iImage");

        Bitmap bitmap = BitmapFactory.decodeByteArray(mBytes,0,mBytes.length);

        actionBar.setTitle(mTitle);

        mTitletv.setText(mTitle);
        mDestv.setText(mDes);
        mImageViewtv.setImageBitmap(bitmap);



    }
}
