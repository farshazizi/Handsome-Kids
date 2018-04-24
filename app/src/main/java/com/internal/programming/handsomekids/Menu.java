package com.internal.programming.handsomekids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Menu extends AppCompatActivity {

    ImageView img_Background3, img_TulisanMulai, img_OperasionalAngka, img_MengenalAngka, img_Latihan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_menu);

        img_Background3 = (ImageView) findViewById(R.id.img_Background3);
        img_TulisanMulai = (ImageView) findViewById(R.id.img_TulisanMulai);
        img_OperasionalAngka = (ImageView) findViewById(R.id.img_OperasionalAngka);

        //nama file kebalik antara mengenalangka dan operasionalangka
        img_OperasionalAngka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Menu.this, MengenalAngka.class);
                startActivity(i);
            }
        });
        img_MengenalAngka = (ImageView) findViewById(R.id.img_MengenalAngka);
        img_MengenalAngka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Menu.this, OperasionalAngka.class);
                startActivity(i);
            }
        });
        img_Latihan = (ImageView) findViewById(R.id.img_Latihan);
        img_Latihan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Menu.this, Level1satu.class);
                startActivity(i);
            }
        });

        Picasso.with(this)
                .load("http://i38.photobucket.com/albums/e111/Azizi_Farsha/background5_zpsufjeigu8.png")
                .into(img_Background3);

        Picasso.with(this)
                .load("http://i38.photobucket.com/albums/e111/Azizi_Farsha/menu_zpsnfdmj9yd.png")
                .into(img_TulisanMulai);

        Picasso.with(this)
                .load("http://i38.photobucket.com/albums/e111/Azizi_Farsha/operasional_zpssrhyatlo.png")
                .into(img_OperasionalAngka);

        Picasso.with(this)
                .load("http://i38.photobucket.com/albums/e111/Azizi_Farsha/mengenalangka_zpslb7pnsqf.png")
                .into(img_MengenalAngka);

        Picasso.with(this)
                .load("http://i38.photobucket.com/albums/e111/Azizi_Farsha/latihansoal_zpsass1tssy.png")
                .into(img_Latihan);
    }
}
