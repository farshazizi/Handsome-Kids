package com.internal.programming.handsomekids;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Pembagian extends AppCompatActivity {

    private ImageView img_JudulPembagian, img_Pembagian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_pembagian);

        img_JudulPembagian = (ImageView) findViewById(R.id.img_JudulPembagian);
        img_Pembagian = (ImageView) findViewById(R.id.img_Pembagian);

        Picasso.with(this)
                .load("http://i38.photobucket.com/albums/e111/Azizi_Farsha/SPembagian_zpsqguhwg8j.png")
                .into(img_JudulPembagian);

        Picasso.with(this)
                .load("http://i38.photobucket.com/albums/e111/Azizi_Farsha/Bagi_zps7rbvksjg.png")
                .into(img_Pembagian);
    }
}
