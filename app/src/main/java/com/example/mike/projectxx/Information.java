package com.example.mike.projectxx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Information extends AppCompatActivity {
    ImageView img;
    TextView nameTxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        Intent i = getIntent();

        final String name = i.getExtras().getString("Name");
        final int image = i.getExtras().getInt("Image");


        img = (ImageView) findViewById(R.id.playerImage);
        nameTxt = (TextView) findViewById(R.id.nameTxt);

        img.setImageResource(image);
        nameTxt.setText("NAME :   " + name);
    }
}