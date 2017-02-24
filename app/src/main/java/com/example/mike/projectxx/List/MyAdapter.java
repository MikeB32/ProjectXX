package com.example.mike.projectxx.List;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.Toast;

import com.example.mike.projectxx.Information;
import com.example.mike.projectxx.MainActivity;
import com.example.mike.projectxx.R;

/**
 * Created by Mike on 11/23/2016.
 */

public class MyAdapter extends RecyclerView.Adapter<MyHolder>{

    Context c;
    String[] place;
    int[] images;
    public MyAdapter(Context ctx,String[] place,int[] images)
    {
        this.c=ctx;
        this.place=place;
        this.images=images;
    }
    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.model,null);

        MyHolder holder=new MyHolder(v);

        return holder;
    }


    @Override
    public void onBindViewHolder(final MyHolder holder, final int position) {

        holder.nameTxt.setText(place[position]);
        holder.img.setImageResource(images[position]);



        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View v, int pos) {
                switch (pos){
                    case 0 :
                        Intent i=new Intent(c,Information.class);
                        i.putExtra("Name",place[position]);
                        i.putExtra("Image",images[position]);
                        c.startActivity(i);
                    break;

                    case 1:
                        Toast.makeText(c,"2",Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(c,"3",Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(c,"4",Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(c,"5",Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return place.length;
    }
}