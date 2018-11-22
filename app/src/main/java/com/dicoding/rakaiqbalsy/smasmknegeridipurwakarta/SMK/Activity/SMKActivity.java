package com.dicoding.rakaiqbalsy.smasmknegeridipurwakarta.SMK.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.dicoding.rakaiqbalsy.smasmknegeridipurwakarta.R;
import com.dicoding.rakaiqbalsy.smasmknegeridipurwakarta.SMA.Adapter.AdapterSMA;
import com.dicoding.rakaiqbalsy.smasmknegeridipurwakarta.SMA.Common.DataSma;
import com.dicoding.rakaiqbalsy.smasmknegeridipurwakarta.SMK.Adapter.AdapterSmk;
import com.dicoding.rakaiqbalsy.smasmknegeridipurwakarta.SMK.Common.DataSMK;
import com.dicoding.rakaiqbalsy.smasmknegeridipurwakarta.SMK.Common.SMK;

import java.util.ArrayList;

public class SMKActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<SMK> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smk);

        recyclerView = findViewById(R.id.recyclerviewSMK);
        recyclerView.setHasFixedSize(true);

        list= new ArrayList<>();
        list.addAll(DataSMK.getListSMK());

        showAdapter();
    }

    private void showAdapter() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        AdapterSmk adapterSmk = new AdapterSmk(list,getApplicationContext());
        recyclerView.setAdapter(adapterSmk);
        adapterSmk.notifyDataSetChanged();
    }
}