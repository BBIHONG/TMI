package com.example.tunemedia.tmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button)findViewById(R.id.button2);
        Button myBtn = (Button)findViewById(R.id.button);

        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"버튼이 누름",Toast.LENGTH_SHORT).show();

                Intent myIntent = new Intent(MainActivity.this, myActivity.class);
                startActivity(myIntent);
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"버튼이 눌렸어요.",Toast.LENGTH_SHORT).show();

                Intent my1Intent = new Intent(MainActivity.this, writeActivity.class);
                startActivity(my1Intent);
            }
        });

    }
}
