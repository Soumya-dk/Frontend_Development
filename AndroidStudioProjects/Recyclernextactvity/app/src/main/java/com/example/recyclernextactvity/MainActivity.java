package com.example.recyclernextactvity;

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

        recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new Adapter(this,getMyList());
        recyclerView.setAdapter(adapter);
    }

    private ArrayList<Model> getMyList(){
        ArrayList<Model> models = new ArrayList<>();

        Model m = new Model();
        m.setTitle("name");
        m.setDescription("this is name");
        m.setImg(R.drawable.mobile);
        models.add(m);

        m = new Model();
        m.setTitle("name1");
        m.setDescription("this is name1");
        m.setImg(R.drawable.mobile);
        models.add(m);

        return models;
    }
}
