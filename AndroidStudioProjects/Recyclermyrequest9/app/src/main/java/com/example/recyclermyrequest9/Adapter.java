package com.example.recyclermyrequest9;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Holder> {

    Context c;
    ArrayList<Details> details;

    public Adapter(Context c, ArrayList<Details> details) {
        this.c = c;
        this.details = details;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card,null);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int i) {

        holder.mTitle.setText(details.get(i).getTitle());
        holder.mDesc.setText(details.get(i).getTitle());
        holder.mImageView.setImageResource(details.get(i).getImg());

    }

    @Override
    public int getItemCount() {
        return details.size();
    }
}