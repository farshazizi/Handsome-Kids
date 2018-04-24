package com.internal.programming.handsomekids;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Penjumlahan extends AppCompatActivity {

    private ImageView img_JudulPenjumlahan, img_Penjumlahan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_penjumlahan);

        img_JudulPenjumlahan = (ImageView) findViewById(R.id.img_JudulPenjumlahan);
        img_Penjumlahan = (ImageView) findViewById(R.id.img_Penjumlahan);

        Picasso.with(this)
                .load("http://i38.photobucket.com/albums/e111/Azizi_Farsha/SPenjumlahan_zpsepvvphld.png")
                .into(img_JudulPenjumlahan);

        Picasso.with(this)
                .load("http://i349.photobucket.com/albums/q364/Adit_Juniior/Tambah_zpszas1kifh.png")
                .into(img_Penjumlahan);
    }
}
