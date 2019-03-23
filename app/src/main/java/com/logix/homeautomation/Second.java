package com.logix.homeautomation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Second extends AppCompatActivity {
    String readname;
    String readmob;
    String reademail;
    String readadd;
    String readuser;
    String readpass;
    String readcpass;

    EditText ed1;
    EditText ed2;
    EditText ed3;
    EditText ed4,ed5,ed6,ed7;
    Button b3, b4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ed1 = (EditText) findViewById(R.id.name);
        ed2 = (EditText) findViewById(R.id.mob);
        ed3 = (EditText) findViewById(R.id.email);
        ed4 = (EditText) findViewById(R.id.add);
        ed5=(EditText) findViewById(R.id.uname);
        ed6=(EditText) findViewById(R.id.pass);
        ed7=(EditText) findViewById(R.id.cpass);
        b3 = (Button) findViewById(R.id.reg);
        b4 = (Button) findViewById(R.id.areg);


            b3.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick (View v) {
                        readpass = ed6.getText().toString();
                        readcpass = ed7.getText().toString();
                        if (readpass.equals(readcpass))

                        {
                            readname = ed1.getText().toString();
                            Toast.makeText(getApplicationContext(), readname, Toast.LENGTH_SHORT).show();
                            readmob = ed2.getText().toString();
                            Toast.makeText(getApplicationContext(), readmob, Toast.LENGTH_SHORT).show();
                            reademail = ed3.getText().toString();
                            Toast.makeText(getApplicationContext(), reademail, Toast.LENGTH_SHORT).show();
                            readadd = ed4.getText().toString();
                            Toast.makeText(getApplicationContext(), readadd, Toast.LENGTH_SHORT).show();

                        }



        else
        {
            Toast.makeText(getApplicationContext(), "Password doesn't match", Toast.LENGTH_LONG).show();
        }
                    }
            });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });


    }
}


