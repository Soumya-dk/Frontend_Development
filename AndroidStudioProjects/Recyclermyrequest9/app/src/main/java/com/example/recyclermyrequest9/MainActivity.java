package com.example.recyclermyrequest9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.cycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new Adapter(this,getMyList());
        recyclerView.setAdapter(adapter);

    }

    private ArrayList<Details> getMyList(){

        ArrayList<Details> details = new ArrayList<>();

        Details d = new Details();
        d.setTitle("PUR - 2019 - 056");
        d.setDescription("AWAITING APPROVAL");
        d.setImg(R.drawable.bell);
        details.add(d);

        d = new Details();
        d.setTitle("PUR - 2019 - 056");
        d.setDescription("APPROVED");
        d.setImg(R.drawable.bell);
        details.add(d);


        d = new Details();
        d.setTitle("PUR - 2019 - 056");
        d.setDescription("DRAFT");
        d.setImg(R.drawable.bell);
        details.add(d);

        d = new Details();
        d.setTitle("PUR - 2019 - 056");
        d.setDescription("REJECTED");
        d.setImg(R.drawable.bell);
        details.add(d);

        return details;

    }
}
