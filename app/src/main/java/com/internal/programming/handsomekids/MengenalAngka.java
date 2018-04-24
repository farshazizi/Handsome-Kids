package com.internal.programming.handsomekids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MengenalAngka extends AppCompatActivity {

    ImageView img_BackgroundMengenalAngka, img_TulisanOperasionalAngka, img_Penjumlahan, img_Pengurangan, img_Perkalian, img_Pembagian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_mengenal_angka);

        img_BackgroundMengenalAngka = (ImageView) findViewById(R.id.img_BackgroundMengenalAngka);
        img_TulisanOperasionalAngka = (ImageView) findViewById(R.id.img_TulisanOperasionalAngka);

        img_Penjumlahan = (ImageView) findViewById(R.id.img_Penjumlahan);
        img_Penjumlahan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MengenalAngka.this, Penjumlahan.class);
                startActivity(i);
            }
        });

        img_Pengurangan = (ImageView) findViewById(R.id.img_Pengurangan);
        img_Pengurangan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MengenalAngka.this, Pengurangan.class);
                startActivity(i);
            }
        });

        img_Perkalian = (ImageView) findViewById(R.id.img_Perkalian);
        img_Perkalian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MengenalAngka.this, Perkalian.class);
                startActivity(i);
            }
        });

        img_Pembagian = (ImageView) findViewById(R.id.img_Pembagian);
        img_Pembagian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MengenalAngka.this, Pembagian.class);
                startActivity(i);
            }
        });

        Picasso.with(this)
                .load("http://i38.photobucket.com/albums/e111/Azizi_Farsha/background6_zpsj0udyhfg.png")
                .into(img_BackgroundMengenalAngka);

        Picasso.with(this)
                .load("http://i38.photobucket.com/albums/e111/Azizi_Farsha/operasionalangka_zpscqegr7qc.png")
                .rotate(3)
                .into(img_TulisanOperasionalAngka);

        Picasso.with(this)
                .load("http://i38.photobucket.com/albums/e111/Azizi_Farsha/penjumlahan_zpsvjae9w0p.png")
                .into(img_Penjumlahan);

        Picasso.with(this)
                .load("http://i38.photobucket.com/albums/e111/Azizi_Farsha/pengurangan_zpscykmywlt.png")
                .into(img_Pengurangan);

        Picasso.with(this)
                .load("http://i38.photobucket.com/albums/e111/Azizi_Farsha/perkalian_zpsrwwr3wvt.png")
                .into(img_Perkalian);

        Picasso.with(this)
                .load("http://i38.photobucket.com/albums/e111/Azizi_Farsha/pembagian_zpsbeadglfs.png")
                .into(img_Pembagian);
    }
}
