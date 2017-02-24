package com.example.mike.projectxx;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Language extends Activity implements View.OnClickListener{

    ImageButton lan1,lan2,lan3,lan4,lan5,lan6,lan7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);

        lan1= (ImageButton)findViewById(R.id.lan1);
        lan2= (ImageButton)findViewById(R.id.lan2);
        lan3= (ImageButton)findViewById(R.id.lan3);
        lan4= (ImageButton)findViewById(R.id.lan4);
        lan5= (ImageButton)findViewById(R.id.lan5);
        lan6= (ImageButton)findViewById(R.id.lan6);
        lan7= (ImageButton)findViewById(R.id.lan7);

            SharedPreferences pref = getSharedPreferences("ActivityPREF", Context.MODE_PRIVATE);
            if (pref.getBoolean("activity_executed", false)) {
                Intent intent = new Intent(this, Login.class);
                startActivity(intent);
                finish();
            } else {


                SharedPreferences pref1 = getSharedPreferences("ActivityPREF", Context.MODE_PRIVATE);
                SharedPreferences.Editor edt = pref1.edit();
                edt.putBoolean("activity_executed", true);
                edt.commit();

            }
        }






    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.lan1:
                Intent intent = new Intent(this , Login.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"Language 1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.lan2:
                Toast.makeText(getApplicationContext(),"Language 2",Toast.LENGTH_SHORT).show();
                break;
            case R.id.lan3:
                Toast.makeText(getApplicationContext(),"Language 3",Toast.LENGTH_SHORT).show();
                break;
            case R.id.lan4:
                Toast.makeText(getApplicationContext(),"Language 4",Toast.LENGTH_SHORT).show();
                break;
            case R.id.lan5:
                Toast.makeText(getApplicationContext(),"Language 5",Toast.LENGTH_SHORT).show();
                break;
            case R.id.lan6:
                Toast.makeText(getApplicationContext(),"Language 6",Toast.LENGTH_SHORT).show();
                break;
            case R.id.lan7:
                Toast.makeText(getApplicationContext(),"Language 7",Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
