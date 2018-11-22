package com.dicoding.rakaiqbalsy.smasmknegeridipurwakarta.SMA.Activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.dicoding.rakaiqbalsy.smasmknegeridipurwakarta.R;

public class DetailSma extends AppCompatActivity {

    private ImageView image;
    private TextView nama, alamat, npsn, tahun, akreditasi;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_sma);

        //inisialiasi
        image = findViewById(R.id.logo1);
        nama = findViewById(R.id.namaSekolah1);
        alamat = findViewById(R.id.alamat1);
        npsn = findViewById(R.id.npsn);
        tahun = findViewById(R.id.tahun);
        akreditasi = findViewById(R.id.akreditasi);
        button = findViewById(R.id.btnMaps1);

        //getExtra intent
        Intent intent = getIntent();
        String iLogo =  intent.getStringExtra("logo");
        String tnama = intent.getStringExtra("nama");
        String talamat =  intent.getStringExtra("alamat");
        String tnpsn = intent.getStringExtra("npsn");
        String takreditasi = intent.getStringExtra("akreditasi");
        final String tletak = intent.getStringExtra("letak");
        String ttahun = intent.getStringExtra("tahun");

        //set
        //image.setImageURI(Uri.parse(iLogo));
        Glide.with(this)
                .load(iLogo)
                .into(image);

        nama.setText(tnama);
        alamat.setText(talamat);
        npsn.setText(tnpsn);
        akreditasi.setText(takreditasi);
        tahun.setText(ttahun);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse(tletak);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if(mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });
    }
}