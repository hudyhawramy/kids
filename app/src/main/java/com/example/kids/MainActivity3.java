package com.example.kids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    ImageView imageView1,imageView2,imageView3,imageView4,imageView5,imageView6,imageView7,imageView8,imageView9,imageView10,imageView11,imageView12,f_image;
    TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10,textView11,textView12,f_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        imageView1=(ImageView) findViewById(R.id.imageView1);
        imageView2=(ImageView) findViewById(R.id.imageView2);
        imageView3=(ImageView) findViewById(R.id.imageView3);
        imageView4=(ImageView) findViewById(R.id.imageView4);
        imageView5=(ImageView) findViewById(R.id.imageView5);
        imageView6=(ImageView) findViewById(R.id.imageView6);
        imageView7=(ImageView) findViewById(R.id.imageView7);
        imageView8=(ImageView) findViewById(R.id.imageView8);
        imageView9=(ImageView) findViewById(R.id.imageView9);
        imageView10=(ImageView) findViewById(R.id.imageView10);
        imageView11=(ImageView) findViewById(R.id.imageView11);
        imageView12=(ImageView) findViewById(R.id.imageView12);

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity3.this, MainActivity4.class));
            }
        });

        ImageView[] images={imageView1,imageView2,imageView3,imageView4,imageView5,imageView6,imageView7,imageView8,imageView9,imageView10,
        imageView11,imageView12};

        TextView[] texts={textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10,textView11,
                textView12,textView12};

        for (int i=0; i<=images.length;i++){
            while (images[i].isSelected()){
                f_image=images[i];
                f_text=texts[i];

            }
        }

        String image=f_image.toString();
        String text=f_text.toString();

        Intent intent=getIntent();
        intent.putExtra("first_image",image);
        intent.putExtra("first_text",text);
        startActivity(intent);

    }
}