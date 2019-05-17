package com.example.challenge2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ImageView image1;
        ImageView image2;
        ImageView image3;
        ImageView image4;
        ImageView image5;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image1 = (ImageView) findViewById(R.id.image1);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent image1Intent = new Intent(MainActivity.this, image1Activity.class);
                startActivity(image1Intent);
            }
        });

        image2 = (ImageView) findViewById(R.id.image2);
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent image2Intent = new Intent(MainActivity.this, image2Activity.class);
                startActivity(image2Intent);
            }
        });

        image3 = (ImageView) findViewById(R.id.image3);
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent image3Intent = new Intent(MainActivity.this, imag3Activity.class);
                startActivity(image3Intent);
            }
        });

        image4 = (ImageView) findViewById(R.id.image4);
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent image4Intent = new Intent(MainActivity.this, image4Activity.class);
                startActivity(image4Intent);
            }
        });

        image5 = (ImageView) findViewById(R.id.image5);
        image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent image5Intent = new Intent(MainActivity.this, image5Activity.class);
                startActivity(image5Intent);
            }
        });

    }
}
