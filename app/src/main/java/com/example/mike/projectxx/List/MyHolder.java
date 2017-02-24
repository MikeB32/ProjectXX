package com.example.mike.projectxx.List;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.example.mike.projectxx.R;

/**
 * Created by Mike on 11/23/2016.
 */

public class MyHolder extends RecyclerView.ViewHolder  implements  View.OnClickListener {
    Context c;
    ImageView img;
    TextView nameTxt;
    ItemClickListener itemClickListener;
    public MyHolder(View itemView) {
        super(itemView);

        img = (ImageView)itemView.findViewById(R.id.playerImage);
        nameTxt = (TextView) itemView.findViewById(R.id.nameTxt);


        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        this.itemClickListener.onItemClick(v,getLayoutPosition());



    }

    public  void  setItemClickListener(ItemClickListener ic)
    {
        this.itemClickListener=ic;
    }
}
