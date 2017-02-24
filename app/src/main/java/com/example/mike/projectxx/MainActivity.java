package com.example.mike.projectxx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.widget.ImageButton;

import com.example.mike.projectxx.List.ListActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    ImageButton btn1,btn2,btn3,btn4,btn5,btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (ImageButton)findViewById(R.id.btn1);
        btn2 = (ImageButton)findViewById(R.id.btn2);
        btn3 = (ImageButton)findViewById(R.id.btn3);
        btn4 = (ImageButton)findViewById(R.id.btn4);
        btn5 = (ImageButton)findViewById(R.id.btn5);
        btn6 = (ImageButton)findViewById(R.id.btn6);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn1:
                Intent intent = new Intent(this,ListActivity.class);
                startActivity(intent);
                break;
            case R.id.btn2:

                break;
            case R.id.btn3:

                break;
            case R.id.btn4:
                Intent intent4 = new Intent(this,AppInfo.class);
                startActivity(intent4);

                break;
            case R.id.btn5:

                break;
            case R.id.btn6:
                Intent intent6 = new Intent(this,Settings.class);
                startActivity(intent6);
                break;

        }
    }

}
