package com.example.recycleview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class programmingadapter extends RecyclerView.Adapter<programmingadapter.ViewHolder> {

    Context context;
   String[] data;

    public programmingadapter(Context context, String[] data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view =inflater.inflate(R.layout.item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        holder.text.setText(data[position]);



        holder.text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (position) {

                    case 0:
                    Intent a = new Intent(context, AnkitActivity.class);
                    context.startActivity(a);
                    break;

                    case 1:
                        Intent b = new Intent(context, AnkitActivity.class);
                        context.startActivity(b);
                        break;

                    case 2:
                        Intent c = new Intent(context, AnkitActivity.class);
                        context.startActivity(c);
                        break;

                }


            }
        });
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView text;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.img);
            text=itemView.findViewById(R.id.text);
        }
    }

}
