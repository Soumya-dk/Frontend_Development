package com.example.recyclermyrequest9;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Holder extends RecyclerView.ViewHolder {

    ImageView mImageView,mCircle;
    TextView mTitle,mDesc;

    public Holder(@NonNull View itemView) {
        super(itemView);

        this.mImageView = itemView.findViewById(R.id.imagetv);
        this.mTitle = itemView.findViewById(R.id.titletv);
        this.mDesc = itemView.findViewById(R.id.desctv);
        this.mCircle = itemView.findViewById(R.id.circletv);
    }
}
