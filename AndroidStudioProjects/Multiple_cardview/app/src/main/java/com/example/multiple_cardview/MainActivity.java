package com.example.multiple_cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import Adapter.MyAdapter;
import Model.MyModel;

public class MainActivity extends AppCompatActivity {
    List<MyModel> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataSet();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        MyAdapter adapter = new MyAdapter(arrayList);
        recyclerView.setAdapter(adapter);
    }

    private void dataSet(){
        arrayList = new ArrayList<>();
        arrayList.add(new MyModel("title One",MyModel.ONE_TYPE));
        arrayList.add(new MyModel("title Two",MyModel.TWO_TYPE));
        arrayList.add(new MyModel("title One",MyModel.ONE_TYPE));
        arrayList.add(new MyModel("title Two",MyModel.TWO_TYPE));
        arrayList.add(new MyModel("title One",MyModel.ONE_TYPE));
        arrayList.add(new MyModel("title Two",MyModel.TWO_TYPE));

    }
}
