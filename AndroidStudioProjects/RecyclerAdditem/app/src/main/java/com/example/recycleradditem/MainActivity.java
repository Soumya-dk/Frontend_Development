package com.example.recycleradditem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Adapter adapter;
    ArrayList<String> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items = new ArrayList<>();
        items.add("IBM ThinkServer TS150 Tower\nServer With Max. Processor 1 x\nIntel Xeon E3 (Quad Core) E3-1225\nv5(3.3 GHz /Cache 8 MB)...");
        items.add("Lenovo ThinkServer TS450\n(PN:70M2001VIH) With Max.\nProcessor 1 x Intel Xeon E3 (Quad\nCore) E3-1225 v5”(3.3 GHz /Cache ");
        items.add("IBM X3300M4 Server With\nx3300M4/ Part NO:7382IA4/ Intel\nXeon E5 1230v2 1.8 GHz,10 MB,\n1066MHz/ 1x 8GB RAM/ 1x500GB");
        items.add("IBM Lenovo ThinkServer RD450\nRack Server (PN:70Q90059IH) with\n1 x Intel® Xeon® E5-2620v4\n(2.1GHz/8C/20MB/85W/");
        items.add("daptec 128 MB Raid Controller\nPair. Pci-e SAS/SATA");



        recyclerView = findViewById(R.id.cycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter(this,items);
        recyclerView.setAdapter(adapter);
    }
}
