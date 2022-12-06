package com.example.myassociation;

import static com.example.myassociation.R.id.text;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splashScreen extends AppCompatActivity {

    ImageView img;
    TextView text;
    Animation top , bottom;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        img = findViewById(R.id.splash_img);
        text = findViewById(R.id.text);

        top = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.splash_img);
        bottom = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.text);

        img.setAnimation(top);
        text.setAnimation(bottom);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        },3000);


    }
}