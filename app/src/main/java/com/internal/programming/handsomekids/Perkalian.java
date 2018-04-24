package com.internal.programming.handsomekids;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Perkalian extends AppCompatActivity {

    private ImageView img_JudulPerkalian, img_Perkalian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_perkalian);

        img_JudulPerkalian = (ImageView) findViewById(R.id.img_JudulPerkalian);
        img_Perkalian = (ImageView) findViewById(R.id.img_Perkalian);

        Picasso.with(this)
                .load("http://i38.photobucket.com/albums/e111/Azizi_Farsha/SPerkalian_zpsfmtvyjfx.png")
                .into(img_JudulPerkalian);

        Picasso.with(this)
                .load("http://i349.photobucket.com/albums/q364/Adit_Juniior/Kali_zpsw2rr1lfs.png")
                .into(img_Perkalian);
    }
}
