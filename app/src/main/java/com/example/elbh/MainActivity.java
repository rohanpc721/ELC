package com.example.elbh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public void onTonext(View view){

        Intent intent = new Intent(getApplicationContext(),SecondActivity.class);

        startActivity(intent);
        ImageView  imageView6=(ImageView)findViewById(R.id.imageView2);

        overridePendingTransition(R.anim.pull_in_left, R.anim.push_out_right);
        final Animation effect1 = AnimationUtils.loadAnimation(this, R.anim.effect_but);
        imageView6.startAnimation(effect1);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView  imageView1=(ImageView)findViewById(R.id.imageView);
        ImageView  imageView2=(ImageView)findViewById(R.id.imageView4);
        ImageView  imageView3=(ImageView)findViewById(R.id.imageView5);
        ImageView  imageView4=(ImageView)findViewById(R.id.imageView3);
        ImageView  imageView5=(ImageView)findViewById(R.id.imageView2);


        final Animation animleft = AnimationUtils.loadAnimation(this, R.anim.fadein);
        final Animation animright = AnimationUtils.loadAnimation(this, R.anim.fadeout);
        final Animation animfade = AnimationUtils.loadAnimation(this, R.anim.fade_or);
        final Animation animslideup = AnimationUtils.loadAnimation(this, R.anim.slideup);

        imageView1.startAnimation(animleft);
        imageView2.startAnimation(animright);
        imageView3.startAnimation(animright);
        imageView4.startAnimation(animfade);
        imageView5.startAnimation(animfade);



    }
}
