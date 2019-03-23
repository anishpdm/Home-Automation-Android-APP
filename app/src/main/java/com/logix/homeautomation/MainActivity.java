package com.logix.homeautomation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
String readingname,readingpass;

    EditText ed1,ed2;

    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Pgm Start
        ed1 = (EditText) findViewById(R.id.uname);
        ed2=(EditText) findViewById(R.id.pass);
        b1 = (Button) findViewById(R.id.log);
        b2=(Button) findViewById(R.id.but);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                readingname = ed1.getText().toString();
                readingpass = ed1.getText().toString();

                if (!TextUtils.isEmpty(readingname) && !TextUtils.isEmpty(readingpass)) {
                    if (readingname.equalsIgnoreCase("admin") && readingpass.equalsIgnoreCase("admin")) {

                        Intent intent = new Intent(getApplicationContext(), HomeControls.class);
                        startActivity(intent);
                    }

                } else{
                    Toast.makeText(getApplicationContext(), "Please enter valid details", Toast.LENGTH_SHORT).show();
                }
            }
        });
                //sending
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Second.class);
                        startActivity(intent);
                    }
                });

            }
        }
