package com.example.recyclernextactvity;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Holder extends RecyclerView.ViewHolder implements View.OnClickListener{

    ImageView mImageView;
    TextView mTitle, mDes;

    ItemClickListener itemClickListener;

     Holder(@NonNull View itemView) {
        super(itemView);

        this.mImageView = itemView.findViewById(R.id.image);
        this.mTitle = itemView.findViewById(R.id.title);
        this.mDes = itemView.findViewById(R.id.desc);

        itemView.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
         this.itemClickListener.onItemClickListener(v, getLayoutPosition());

    }

    public void setItemClickListener(ItemClickListener ic){
        this.itemClickListener = ic;
    }


}
