package com.internal.programming.handsomekids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Level1satu extends AppCompatActivity implements View.OnClickListener {

    private ImageView img_LatihanYuk, img_Soal, img_Darah1, img_Darah2, img_Darah3, img_A, img_B, img_C, img_D;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_level1satu);

        img_LatihanYuk = (ImageView) findViewById(R.id.img_LatihanYuk);
        img_Soal = (ImageView) findViewById(R.id.img_Soal);
        img_Darah1 = (ImageView) findViewById(R.id.img_Darah1);
        img_Darah2 = (ImageView) findViewById(R.id.img_Darah2);
        img_Darah3 = (ImageView) findViewById(R.id.img_Darah3);
        img_A = (ImageView) findViewById(R.id.img_A);
        img_A.setOnClickListener(this);
        img_B = (ImageView) findViewById(R.id.img_B);
        img_B.setOnClickListener(this);
        img_C = (ImageView) findViewById(R.id.img_C);
        img_C.setOnClickListener(this);
        img_D = (ImageView) findViewById(R.id.img_D);
        img_D.setOnClickListener(this);

        Picasso.with(this)
                .load("http://i38.photobucket.com/albums/e111/Azizi_Farsha/Latihan%20Yuk_zpsvyzlzawz.png")
                .into(img_LatihanYuk);

        Picasso.with(this)
                .load("http://i38.photobucket.com/albums/e111/Azizi_Farsha/Level%201%201_zpsoiyateuk.png")
                .into(img_Soal);

        Picasso.with(this)
                .load("http://i38.photobucket.com/albums/e111/Azizi_Farsha/Love_zps6kgdwsyr.png")
                .into(img_Darah1);

        Picasso.with(this)
                .load("http://i38.photobucket.com/albums/e111/Azizi_Farsha/Love_zps6kgdwsyr.png")
                .into(img_Darah2);

        Picasso.with(this)
                .load("http://i38.photobucket.com/albums/e111/Azizi_Farsha/Love_zps6kgdwsyr.png")
                .into(img_Darah3);

        Picasso.with(this)
                .load("http://i38.photobucket.com/albums/e111/Azizi_Farsha/p1_zpsrv5ric3x.png")
                .into(img_A);

        Picasso.with(this)
                .load("http://i38.photobucket.com/albums/e111/Azizi_Farsha/p2_zpsnb4efpnl.png")
                .into(img_B);

        Picasso.with(this)
                .load("http://i38.photobucket.com/albums/e111/Azizi_Farsha/p3_zpsqsk6rzlj.png")
                .into(img_C);

        Picasso.with(this)
                .load("http://i38.photobucket.com/albums/e111/Azizi_Farsha/p4_zpscq9hetnr.png")
                .into(img_D);
    }


    @Override
    public void onClick(View view) {
        if (view == img_A){
            Intent i = new Intent(Level1satu.this, Level1dua.class);
            startActivity(i);
        }
        if (view == img_B){
            img_B.setVisibility(View.INVISIBLE);
            img_Darah1.setVisibility(View.GONE);
        }
        if (view == img_C){
            img_C.setVisibility(View.INVISIBLE);
            img_Darah2.setVisibility(View.GONE);
        }
        if (view == img_D){
            img_D.setVisibility(View.INVISIBLE);
            img_Darah3.setVisibility(View.GONE);
        }
    }
}
