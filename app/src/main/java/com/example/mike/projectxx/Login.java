package com.example.mike.projectxx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button Log,Reg;
    EditText edt1,edt2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edt1 = (EditText)findViewById(R.id.user);
        edt2 = (EditText)findViewById(R.id.pass);


        Log = (Button)findViewById(R.id.log);
        Reg = (Button)findViewById(R.id.reg);
        Reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this,Registration.class);
                startActivity(intent);
            }
        });
        Log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if(edt1.length()<1&&edt2.length()<1){
                        Toast.makeText(getApplicationContext(),"Please Enter Username/Password",Toast.LENGTH_SHORT).show();
                    }
               // if(edt1.equals("hey")&edt2.equals("hey")){*/
                    Intent intent = new Intent(Login.this , MainActivity.class);
                    startActivity(intent);

            }
        });
    }
}
