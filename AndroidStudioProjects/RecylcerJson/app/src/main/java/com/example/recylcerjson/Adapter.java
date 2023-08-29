package com.example.recylcerjson;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener,View.OnLongClickListener
{
    public TextView txt_description;
    private ItemClickListener itemClickListener;
    public RecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        txt_description = (TextView) itemView.findViewById(R.id.textView1);

        itemView.setOnClickListener(this);
        itemView.setOnLongClickListener(this);
    }
   public void setItemClickListener(ItemClickListener itemClickListener)
   {
       this.itemClickListener = itemClickListener;
   }
    @Override
    public void onClick(View v) {
        itemClickListener.onClick(v,getAdapterPosition(),false);

    }

    @Override
    public boolean onLongClick(View v) {
        itemClickListener.onClick(v,getAdapterPosition(),true);
        return false;
    }
}

public class Adapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    private List<String> listData = new ArrayList<>();
    private Context context;

    public Adapter(List<String> listData, Context context) {
        this.listData = listData;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       LayoutInflater inflater = LayoutInflater.from(parent.getContext());
       View itemView = inflater.inflate(R.layout.custom_view,parent,false);
       return new RecyclerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        holder.txt_description.setText(listData.get(position));
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClick(View view, int position, boolean isLongClick) {
                if(isLongClick)
                    Toast.makeText(context,"Long Click"+listData.get(position),Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(context,"Name:Luke Ray\nAge:30\nId:1Sd41"+listData.get(position),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }
}


