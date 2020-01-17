package com.example.recyclernextactvity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;


public class Adapter extends RecyclerView.Adapter<Holder> {

    Context c;
    ArrayList<Model> models;

    public Adapter(Context c, ArrayList<Model> models) {
        this.c = c;
        this.models = models;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card,null);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final Holder holder, final int i) {
        holder.mTitle.setText(models.get(i).getTitle());
        holder.mDes.setText(models.get(i).getDescription());
        holder.mImageView.setImageResource(models.get(i).getImg());

       holder.setItemClickListener(new ItemClickListener() {
           @Override
           public void onItemClickListener(View v, int position) {

               String gTitle = models.get(position).getTitle();
               String gDes = models.get(position).getDescription();
               BitmapDrawable bitmapDrawable = (BitmapDrawable)holder.mImageView.getDrawable();

               Bitmap bitmap = bitmapDrawable.getBitmap();

               ByteArrayOutputStream stream = new ByteArrayOutputStream();

               bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);

               byte[] bytes = stream.toByteArray();

               Intent intent = new Intent(c, Activity2.class);
               intent.putExtra("iTitle", gTitle);
               intent.putExtra("iDes",gDes);
               intent.putExtra("iImage",bytes);
               c.startActivity(intent);


           }
       });

       holder.setItemClickListener(new ItemClickListener() {
           @Override
           public void onItemClickListener(View v, int position) {
               if (models.get(position).getTitle().equals("name")){

               }
               if (models.get(position).getTitle().equals("name1")){

               }
           }
       });

    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
