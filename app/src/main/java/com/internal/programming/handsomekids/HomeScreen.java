package com.internal.programming.handsomekids;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class HomeScreen extends AppCompatActivity {

    private static int splashInterval = 5000;

    private ImageView img_HomeScreen, img_Logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_home_screen);

//        img_HomeScreen = (ImageView) findViewById(R.id.img_HomeScreen);
        img_Logo = (ImageView) findViewById(R.id.img_Logo);

//        Picasso.with(this)
//                .load("http://i38.photobucket.com/albums/e111/Azizi_Farsha/background1_zpsesgt4a6e.png")
//                .into(img_HomeScreen);

        Picasso.with(this)
                .load("http://i38.photobucket.com/albums/e111/Azizi_Farsha/logo_zpsynhdhtvi.png")
                .into(img_Logo);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                Intent i = new Intent(HomeScreen.this, Mulai.class);
                startActivity(i); // menghubungkan activity splashscren ke main activity dengan intent


                //jeda selesai Splashscreen
                this.finish();
            }

            private void finish() {
                // TODO Auto-generated method stub

            }
        }, splashInterval);

    }
}
