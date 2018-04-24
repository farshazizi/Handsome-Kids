package com.internal.programming.handsomekids;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class OperasionalAngka extends AppCompatActivity {

    private ImageView img_Background4, img_AngkaSatu, img_SemuaAngka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_operasional_angka);

        img_Background4 = (ImageView) findViewById(R.id.img_Background4);
        img_AngkaSatu = (ImageView) findViewById(R.id.img_AngkaSatu);
        img_SemuaAngka = (ImageView) findViewById(R.id.img_SemuaAngka);

        Picasso.with(this)
                .load("http://i38.photobucket.com/albums/e111/Azizi_Farsha/background3_zpsxvhm5rwl.png")
                .into(img_Background4);

        Picasso.with(this)
                .load("http://i38.photobucket.com/albums/e111/Azizi_Farsha/satu_zpsamclzqq1.png")
                .into(img_AngkaSatu);

        Picasso.with(this)
                .load("http://i38.photobucket.com/albums/e111/Azizi_Farsha/angka_zpsmduau5ph.png")
                .into(img_SemuaAngka);
    }
}
