package com.example.mike.projectxx.List;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mike.projectxx.R;

public class ListActivity extends AppCompatActivity {
    String[] names={"Icardi","Candreva","Milito","Perisic","Zanetti"};
    // String[] positions={"","", "","",""};
    int[] images={R.drawable.ic_launcher,R.drawable.ic_launcher,R.drawable.ic_launcher,R.drawable.ic_launcher,R.drawable.ic_launcher,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

            RecyclerView rv= (RecyclerView)findViewById(R.id.myRecycler);


            rv.setLayoutManager(new LinearLayoutManager(this));

            MyAdapter adapter=new MyAdapter(this,names,images);
            rv.setAdapter(adapter);

        }


    }

