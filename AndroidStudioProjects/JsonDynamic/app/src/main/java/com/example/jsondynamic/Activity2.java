package com.example.jsondynamic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import static com.example.jsondynamic.MainActivity.EXTRA_COMMENTS;
import static com.example.jsondynamic.MainActivity.EXTRA_CREATOR;
import static com.example.jsondynamic.MainActivity.EXTRA_LIKES;
import static com.example.jsondynamic.MainActivity.EXTRA_URL;


public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();
        String imageUrl = intent.getStringExtra(EXTRA_URL);
        String creatorName = intent.getStringExtra(EXTRA_CREATOR);
        String comments = intent.getStringExtra(EXTRA_COMMENTS);
        int likeCount = intent.getIntExtra(EXTRA_LIKES, 0);

        ImageView imageView = findViewById(R.id.image_detail);
        TextView textViewCreator = findViewById(R.id.text_detail);
        TextView textViewLikes = findViewById(R.id.text_detail1);
        TextView textViewComments = findViewById(R.id.comments);

        Picasso.with(this).load(imageUrl).fit().centerInside().into(imageView);
        textViewCreator.setText(creatorName);
        textViewLikes.setText("Likes: " + likeCount);
        textViewComments.setText(comments);
    }
}
