package com.nim1718076.quiz1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private keluargaAdapter adapter;
    private ArrayList<keluarga> keluargaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();

        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);

        adapter = new keluargaAdapter(keluargaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new keluarga(R.drawable.abil,"Habil","Paman"));
        keluargaArrayList.add(new keluarga(R.drawable.eka,"Eka","Kakak"));
        keluargaArrayList.add(new keluarga(R.drawable.cptr2,"Desvi","keponakan"));


    }
}
