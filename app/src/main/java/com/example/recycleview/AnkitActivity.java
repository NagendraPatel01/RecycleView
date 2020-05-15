package com.example.recycleview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.ActionMenuItem;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class AnkitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ankit);

       // Toast.makeText(this, "Delete", Toast.LENGTH_LONG).show();


        LayoutInflater inflater = LayoutInflater.from(this);
        View layout = inflater.inflate(R.layout.toastdesign,null,false);

        Toast toast = new Toast(this);
        toast.setView(layout);
        toast.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

            case R.id.item1:
               Toast.makeText(getApplicationContext(),"bhopu",Toast.LENGTH_LONG).show();
               return true;

            case R.id.item2:
                Intent b=new Intent(AnkitActivity.this,BhupActivity.class);
                startActivity(b);
                break;

            case R.id.item3:
                Intent c=new Intent(AnkitActivity.this,AlartActivity.class);
                startActivity(c);
                break;





        }


        return super.onOptionsItemSelected(item);
    }
}
