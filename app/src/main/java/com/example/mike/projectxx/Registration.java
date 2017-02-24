package com.example.mike.projectxx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registration extends AppCompatActivity {

    EditText edt1, edt2, edt3, edt4, edt5;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        edt1 = (EditText) findViewById(R.id.fullname);
        edt2 = (EditText) findViewById(R.id.username);
        edt3 = (EditText) findViewById(R.id.password);
        edt4 = (EditText) findViewById(R.id.passo);
        edt5 = (EditText) findViewById(R.id.emo);
        save = (Button) findViewById(R.id.savebtn);
      final  String gg = edt3.getText().toString();
     final    String qq = edt4.getText().toString();

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edt1.length() > 0 & edt2.length() > 0 & edt3.length() >= 6 & edt4.length() >= 6 & edt5.length() > 0) {
                    Intent intent = new Intent(Registration.this, Login.class);
                    startActivity(intent);
                    if (edt3.length() < 6) {
                        Toast.makeText(getApplicationContext(), "Password Must Be more the 6 Characters", Toast.LENGTH_SHORT).show();

                    } else if (!gg.equals(qq)) {
                        Toast.makeText(getApplicationContext(), "Password not match", Toast.LENGTH_SHORT).show();
                    }
                } else{

                        Toast.makeText(getApplicationContext(), "Fill your info", Toast.LENGTH_SHORT).show();

                }
            }

        });
    }
}
