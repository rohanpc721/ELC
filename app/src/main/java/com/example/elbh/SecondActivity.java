package com.example.elbh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ScrollView;

public class SecondActivity extends AppCompatActivity {

    public void onTonext1(View view){

        Intent intent1 = new Intent(getApplicationContext(),ThirdActivity.class);

        startActivity(intent1);


        overridePendingTransition(R.anim.pull_in_left, R.anim.push_out_right);


    }
    public void onTonext2(View view){

        Intent intent2 = new Intent(getApplicationContext(),FourthActivity.class);

        startActivity(intent2);


        overridePendingTransition(R.anim.pull_in_left, R.anim.push_out_right);


    }
    public void onTonext3(View view){

        Intent intent3 = new Intent(getApplicationContext(),FifthActivity.class);
        startActivity(intent3);
        overridePendingTransition(R.anim.pull_in_left, R.anim.push_out_right);
    }
    public void onTonext4(View view){

        Intent intent4 = new Intent(getApplicationContext(),SixthActivity.class);
        startActivity(intent4);
        overridePendingTransition(R.anim.pull_in_left, R.anim.push_out_right);
    }
    public void onTonext5(View view){

        Intent intent5 = new Intent(getApplicationContext(),SeventhActivity.class);
        startActivity(intent5);
        overridePendingTransition(R.anim.pull_in_left, R.anim.push_out_right);
    }
    public void onTonext6(View view){

        Intent intent5 = new Intent(getApplicationContext(),EighthActivity.class);
        startActivity(intent5);
        overridePendingTransition(R.anim.pull_in_left, R.anim.push_out_right);
    }
    public void onTonext7(View view){

        Intent intent5 = new Intent(getApplicationContext(),NinthActivity.class);
        startActivity(intent5);
        overridePendingTransition(R.anim.pull_in_left, R.anim.push_out_right);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ImageView  imageView10=(ImageView)findViewById(R.id.imageView10);
        ImageView  imageView11=(ImageView)findViewById(R.id.imageView11);
        ImageView  imageView12=(ImageView)findViewById(R.id.imageView12);
        ImageView  imageView13=(ImageView)findViewById(R.id.imageView13);
        ImageView  imageView14=(ImageView)findViewById(R.id.imageView14);
        ImageView  imageView15=(ImageView)findViewById(R.id.imageView15);
        ImageView  imageView16=(ImageView)findViewById(R.id.imageView16);
        final Animation animleft = AnimationUtils.loadAnimation(this, R.anim.fadein);
        final Animation animright = AnimationUtils.loadAnimation(this, R.anim.fadeout);
        final Animation animbounce = AnimationUtils.loadAnimation(this, R.anim.bounce);

        imageView11.startAnimation(animleft);
        imageView12.startAnimation(animright);
        imageView13.startAnimation(animleft);
        imageView14.startAnimation(animright);
        imageView15.startAnimation(animleft);
        imageView16.startAnimation(animright);
        imageView10.startAnimation(animbounce);







    }
}