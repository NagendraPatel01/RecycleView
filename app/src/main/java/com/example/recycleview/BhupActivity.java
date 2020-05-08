package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.leo.simplearcloader.SimpleArcLoader;

public class BhupActivity extends AppCompatActivity {

    SimpleArcLoader loader;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bhup);

        loader=findViewById(R.id.loader);

loader.start();

        Handler a=new Handler();
a.postDelayed(new Runnable() {
    @Override
    public void run() {

        loader.stop();
        Intent a=new Intent(BhupActivity.this,MainActivity.class);
        startActivity(a);

    }
},5000);


    }
}
