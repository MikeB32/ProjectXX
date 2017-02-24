package com.example.mike.projectxx;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class SettingsLanguage extends Activity implements View.OnClickListener{

    ImageButton lan1,lan2,lan3,lan4,lan5,lan6,lan7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_language);

        lan1 = (ImageButton) findViewById(R.id.slan1);
        lan2 = (ImageButton) findViewById(R.id.slan2);
        lan3 = (ImageButton) findViewById(R.id.slan3);
        lan4 = (ImageButton) findViewById(R.id.slan4);
        lan5 = (ImageButton) findViewById(R.id.slan5);
        lan6 = (ImageButton) findViewById(R.id.slan6);
        lan7 = (ImageButton) findViewById(R.id.slan7);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.slan1:
                Intent intent = new Intent(this , MainActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"Language 1",Toast.LENGTH_SHORT).show();
                
                break;
            case R.id.slan2:
                Toast.makeText(getApplicationContext(),"Language 2",Toast.LENGTH_SHORT).show();
                break;
            case R.id.slan3:
                Toast.makeText(getApplicationContext(),"Language 3",Toast.LENGTH_SHORT).show();
                break;
            case R.id.slan4:
                Toast.makeText(getApplicationContext(),"Language 4",Toast.LENGTH_SHORT).show();
                break;
            case R.id.slan5:
                Toast.makeText(getApplicationContext(),"Language 5",Toast.LENGTH_SHORT).show();
                break;
            case R.id.slan6:
                Toast.makeText(getApplicationContext(),"Language 6",Toast.LENGTH_SHORT).show();
                break;
            case R.id.slan7:
                Toast.makeText(getApplicationContext(),"Language 7",Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
