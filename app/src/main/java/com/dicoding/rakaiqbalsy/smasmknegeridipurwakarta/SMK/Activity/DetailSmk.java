package com.dicoding.rakaiqbalsy.smasmknegeridipurwakarta.SMK.Activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;
import com.dicoding.rakaiqbalsy.smasmknegeridipurwakarta.R;

public class DetailSmk extends AppCompatActivity {

    private ImageView image;
    private TextView nama, alamat, npsn, tahun, akreditasi;
    private Button button;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_smk);

        //inisialiasi
        image = findViewById(R.id.logo2);
        nama = findViewById(R.id.namaSekolah2);
        alamat = findViewById(R.id.alamat2);
        npsn = findViewById(R.id.npsn2);
        tahun = findViewById(R.id.tahun2);
        akreditasi = findViewById(R.id.akreditasi2);
        button = findViewById(R.id.btnMaps2);

        //getExtra intent
        Intent intent = getIntent();
        String iLogo =  intent.getStringExtra("logo2");
        String tnama = intent.getStringExtra("nama2");
        String talamat =  intent.getStringExtra("alamat2");
        String tnpsn = intent.getStringExtra("npsn2");
        String takreditasi = intent.getStringExtra("akreditasi2");
        final String tletak = intent.getStringExtra("letak2");
        String ttahun = intent.getStringExtra("tahun2");

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
                Uri gmmIntentUri = Uri.parse("geo:"+tletak);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if(mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}

