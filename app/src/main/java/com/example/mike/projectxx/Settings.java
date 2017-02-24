package com.example.mike.projectxx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class Settings extends AppCompatActivity {

    Button Lan;
    Switch aSwitch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Lan =(Button)findViewById(R.id.btnlan);
        Lan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Settings.this,SettingsLanguage.class);
                startActivity(intent);
            }
        });
        aSwitch = (Switch)findViewById(R.id.notifcation);
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {


            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(getApplicationContext(), "it is on", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(getApplicationContext(), "it is off", Toast.LENGTH_SHORT).show();

                }

            }
        });

    }
}
