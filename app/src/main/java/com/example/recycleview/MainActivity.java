package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycle;

    String[] data = {"bhup","bhup","bhup","bhup","bhup","bhup","bhup","bhup","bhup","bhup","bhup","bhup"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       recycle=findViewById(R.id.recycle);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recycle.setLayoutManager(layoutManager);

       programmingadapter adapter = new programmingadapter(this,data);
       recycle.setAdapter(adapter);
    }
}
