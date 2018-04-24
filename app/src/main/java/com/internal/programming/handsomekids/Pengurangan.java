package com.internal.programming.handsomekids;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Pengurangan extends AppCompatActivity {

    private ImageView img_JudulPengurangan, img_Pengurangan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_pengurangan);

        img_JudulPengurangan = (ImageView) findViewById(R.id.img_JudulPengurangan);
        img_Pengurangan = (ImageView) findViewById(R.id.img_Pengurangan);

        Picasso.with(this)
                .load("http://i38.photobucket.com/albums/e111/Azizi_Farsha/SPengurangan_zpsuyp2dsyx.png")
                .into(img_JudulPengurangan);

        Picasso.with(this)
                .load("http://i349.photobucket.com/albums/q364/Adit_Juniior/Kurang_zpsbmpri9rg.png")
                .into(img_Pengurangan);
    }
}
