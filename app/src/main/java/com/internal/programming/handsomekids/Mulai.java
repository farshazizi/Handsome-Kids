package com.internal.programming.handsomekids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Mulai extends AppCompatActivity {

    ImageView img_Background2, img_BelajarDanBermain, img_Play, img_Mulai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_mulai);

        img_Background2 = (ImageView) findViewById(R.id.img_Background2);
        img_BelajarDanBermain = (ImageView) findViewById(R.id.img_BelajarDanBermain);
        img_Play = (ImageView) findViewById(R.id.img_Play);
        img_Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Mulai.this, Menu.class);
                startActivity(i);
            }
        });
        img_Mulai = (ImageView) findViewById(R.id.img_Mulai);

        Picasso.with(this)
                .load("http://i38.photobucket.com/albums/e111/Azizi_Farsha/background2_zpsufud3ehg.png")
                .into(img_Background2);

        Picasso.with(this)
                .load("http://i38.photobucket.com/albums/e111/Azizi_Farsha/belajardanbermain_zpslrsx6r8l.png")
                .rotate(1)
                .into(img_BelajarDanBermain);

        Picasso.with(this)
                .load("http://i38.photobucket.com/albums/e111/Azizi_Farsha/play_zpso3xnxijv.png")
                .into(img_Play);

        Picasso.with(this)
                .load("http://i38.photobucket.com/albums/e111/Azizi_Farsha/mulai_zpsfmlr5qsc.png")
                .into(img_Mulai);
    }
}
