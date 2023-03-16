package com.example.hoangdhph19515_lab_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.view.View;

public class Activity_img extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img);

        AnimatorSet love_eff =
                (AnimatorSet) AnimatorInflater.loadAnimator(Activity_img.this,R.animator.love_zoom_in_out_eff);
        View img_loves;
        love_eff.setTarget(img_loves = findViewById(R.id.img_Loves));
        love_eff.start();
        //asdassdd
        //s
    }
}