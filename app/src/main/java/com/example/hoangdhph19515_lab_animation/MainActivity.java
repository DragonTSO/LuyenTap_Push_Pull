package com.example.hoangdhph19515_lab_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    AnimationDrawable icon_loader;
    ImageView img_loader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_loader = findViewById(R.id.img_loader);

        AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(MainActivity.this,R.animator.icon_loader);
               animatorSet.setTarget(img_loader);
                animatorSet.start();
                ////asdadasdsaasdasdasdasdasd
        //dasd/asd/asd/as/d
//        aasd/
//                as/d
//                /asd/asd
//asdasd


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,MainActivity_login_reg.class);
                startActivity(intent);
            }
        },3000);
    }
}