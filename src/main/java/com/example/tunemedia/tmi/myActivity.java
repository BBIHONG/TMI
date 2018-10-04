package com.example.tunemedia.tmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class myActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        TextView name = (TextView)findViewById(R.id.textView5);
        TextView write = (TextView)findViewById(R.id.textView8);
        TextView comment = (TextView)findViewById(R.id.textView10);
        TextView like = (TextView)findViewById(R.id.textView12);

        name.setText("야호");
        write.setText("2");
        comment.setText("3");
        like.setText("5");

    }
}
