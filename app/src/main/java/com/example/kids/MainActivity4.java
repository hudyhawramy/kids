package com.example.kids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
    CheckedTextView checkedTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        imageView=(ImageView) findViewById(R.id.imageView2);
        textView=(TextView) findViewById(R.id.textView);
        checkedTextView=(CheckedTextView) findViewById(R.id.checkedTextView);

        Intent intent=getIntent();
        String str = intent.getStringExtra("first_image");
        String str1 = intent.getStringExtra("first_text");

        textView.setText(str1);

    }
}