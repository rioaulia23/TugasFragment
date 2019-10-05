package com.example.androidlatihan4_fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class AfterClass extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afterclick);
        ImageView imgview = findViewById(R.id.imgview);
        TextView teks = findViewById(R.id.teks);

        String kota = "";
        Bundle b = getIntent().getExtras();
        if (b != null) {
            kota = b.getString("kota");
        }
        if (kota.equals("jkt")) {
            imgview.setImageResource(R.drawable.monas);
            teks.setText(R.string.jkt);
        } else if (kota.equals("mlg")) {
            imgview.setImageResource(R.drawable.mlg);
            teks.setText(R.string.mlg);
        } else if (kota.equals("sby")) {
            imgview.setImageResource(R.drawable.sby);
            teks.setText(R.string.sby);
        } else if (kota.equals("bxt")) {
            imgview.setImageResource(R.drawable.bxt);
            teks.setText(R.string.bxt);
        } else if (kota.equals("bdg")) {
            imgview.setImageResource(R.drawable.bdg);
            teks.setText(R.string.bdg);
        } else if (kota.equals("jgj")) {
            imgview.setImageResource(R.drawable.jgj);
            teks.setText(R.string.jgj);
        } else if (kota.equals("mks")) {
            imgview.setImageResource(R.drawable.mks);
            teks.setText(R.string.mks);
        } else if (kota.equals("kdr")) {
            imgview.setImageResource(R.drawable.kdr);
            teks.setText(R.string.kdr);
        } else if (kota.equals("smd")) {
            imgview.setImageResource(R.drawable.smd);
            teks.setText(R.string.smd);
        } else if (kota.equals("bpp")) {
            imgview.setImageResource(R.drawable.bpp);
            teks.setText(R.string.bpp);
        } else ;
    }
}
