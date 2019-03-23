package com.logix.homeautomation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    String readingname;
    EditText ed1;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        // Pgm Start
        ed1 = (EditText) findViewById(R.id.name);
        b = (Button) findViewById(R.id.but);
        if(getIntent()!=null)
        {
            String a1=getIntent().getStringExtra("UNAME");
            ed1.setText(a1);
        }
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                readingname = ed1.getText().toString();
                Toast.makeText(getApplicationContext(),readingname ,Toast.LENGTH_LONG).show();
                Intent intent=new Intent(getApplicationContext(),Second.class);
                startActivity(intent);
            }
        });

    }
}
