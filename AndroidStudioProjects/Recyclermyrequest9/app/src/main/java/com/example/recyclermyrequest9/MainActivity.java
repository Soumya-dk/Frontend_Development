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

        recyclerView=findViewById(R.id.cycler);
        recyclerView.setLayoutManager(new LinearLayoutManager( this));
        adapter=new Adapter(this,getdetails());
        recyclerView.setAdapter(adapter);



    }

    private ArrayList<Details> getdetails() {
        ArrayList<Details> details=new ArrayList<>();
        Details d=new Details(R.drawable.awaiting,"AWAITING APPROVAL");
        details.add(d);

        d=new Details(R.drawable.approved,"APPROVED");
        details.add(d);

        d=new Details(R.drawable.draft,"DRAFT");
        details.add(d);

        d=new Details(R.drawable.rejected,"REJECTED");
        details.add(d);


        return details;
    }
}
