package com.example.hoangdhph19515_lab_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity_login_reg extends AppCompatActivity {

    ImageView img_logo;
    EditText ed_user,ed_pass;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login_reg);

        img_logo = findViewById(R.id.img_logo);
        ed_pass = findViewById(R.id.ed_pass);
        ed_user = findViewById(R.id.ed_userName);
        btn_login = findViewById(R.id.btn_login);



        AnimatorSet animatorSet = new AnimatorSet();
        //eff logo
        float y_logo = img_logo.getY();
        y_logo = -550;

        ObjectAnimator logo_Eff = ObjectAnimator.ofFloat(img_logo,"y",y_logo,400);
        logo_Eff.setDuration(3000);



        float x_Tv_user = ed_user.getX();
        x_Tv_user = -1800;

        ObjectAnimator user1 = ObjectAnimator.ofFloat(ed_user,"x",x_Tv_user,95);
        user1.setDuration(3000);

        float x_Tv_pass = ed_pass.getX();
        x_Tv_pass = 1800;

        ObjectAnimator pass1 = ObjectAnimator.ofFloat(ed_pass,"x",x_Tv_pass,95);
        pass1.setDuration(3000);

        float y_Button = btn_login.getY();
        y_Button = 3000;
        ObjectAnimator btnLogin = ObjectAnimator.ofFloat(btn_login,"y",y_Button,1900);
        btnLogin.setDuration(3000);

        animatorSet.playTogether(logo_Eff,user1,pass1,btnLogin);
        animatorSet.start();



        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_login_reg.this,Activity_img.class);
                startActivity(intent);
            }
        });

    }
}