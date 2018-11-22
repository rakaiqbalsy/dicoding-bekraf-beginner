package com.dicoding.rakaiqbalsy.smasmknegeridipurwakarta.SMA.Adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.dicoding.rakaiqbalsy.smasmknegeridipurwakarta.R;
import com.dicoding.rakaiqbalsy.smasmknegeridipurwakarta.SMA.Activity.DetailSma;
import com.dicoding.rakaiqbalsy.smasmknegeridipurwakarta.SMA.Common.SMA;

import java.util.ArrayList;
import java.util.List;

public class AdapterSMA extends RecyclerView.Adapter<AdapterSMA.MyViewHolder> {
    private List<SMA> smaList;
    private Context context;



    public class MyViewHolder extends RecyclerView.ViewHolder{
        private ImageView logo;
        private TextView namaSekolah, alamat;
        private Button btnMaps;
        private CardView cardViewRow;

        public MyViewHolder(View view) {
            super(view);
            cardViewRow = view.findViewById(R.id.cardViewRow);
            logo = view.findViewById(R.id.logo);
            namaSekolah = view.findViewById(R.id.namaSekolah);
            alamat = view.findViewById(R.id.alamat);
            btnMaps = view.findViewById(R.id.btnDetail);
        }
    }

    public AdapterSMA(List<SMA> smaList, Context context) {
        this.smaList = smaList;
        this.context = context;
    }

    @Override
    public AdapterSMA.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_sma, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final SMA sma = smaList.get(position);

        Glide.with(context)
                .load(sma.getFoto())
                .into(holder.logo);

        holder.namaSekolah.setText(sma.getNama());
        holder.alamat.setText(sma.getAlamat());
        holder.btnMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailSma.class);
                intent.putExtra("logo", sma.getFoto());
                intent.putExtra("nama", sma.getNama());
                intent.putExtra("alamat", sma.getAlamat());
                intent.putExtra("npsn", sma.getNpsn());
                intent.putExtra("akreditasi", sma.getAkreditasi());
                intent.putExtra("letak", sma.getLetak());
                intent.putExtra("tahun", sma.getTahun());
                context.startActivity(new Intent(intent));
            }
        });
    }

    @Override
    public int getItemCount() {
        return smaList.size();
    }
}
