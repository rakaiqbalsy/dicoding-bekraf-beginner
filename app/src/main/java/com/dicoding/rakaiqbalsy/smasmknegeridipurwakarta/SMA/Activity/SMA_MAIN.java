package com.dicoding.rakaiqbalsy.smasmknegeridipurwakarta.SMA.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.dicoding.rakaiqbalsy.smasmknegeridipurwakarta.R;
import com.dicoding.rakaiqbalsy.smasmknegeridipurwakarta.SMA.Adapter.AdapterSMA;
import com.dicoding.rakaiqbalsy.smasmknegeridipurwakarta.SMA.Common.DataSma;
import com.dicoding.rakaiqbalsy.smasmknegeridipurwakarta.SMA.Common.SMA;

import java.util.ArrayList;

public class SMA_MAIN extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<SMA> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sma__main);

        recyclerView = findViewById(R.id.recyclerviewSMA);
        recyclerView.setHasFixedSize(true);

        list= new ArrayList<>();
        list.addAll(DataSma.getListSMA());

        showAdapter();
    }

    private void showAdapter() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        AdapterSMA adapterSma = new AdapterSMA(list,getApplicationContext());
        recyclerView.setAdapter(adapterSma);
        adapterSma.notifyDataSetChanged();
    }
}