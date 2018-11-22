package com.dicoding.rakaiqbalsy.smasmknegeridipurwakarta.SMK.Adapter;

import android.content.Context;
import android.content.Intent;
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
import com.dicoding.rakaiqbalsy.smasmknegeridipurwakarta.SMK.Activity.DetailSmk;
import com.dicoding.rakaiqbalsy.smasmknegeridipurwakarta.SMK.Common.SMK;

import java.util.List;

public class AdapterSmk extends RecyclerView.Adapter<AdapterSmk.MyViewHolder> {
    private List<SMK> smkList;
    private Context context;


    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView logo;
        private TextView namaSekolah, alamat;
        private Button btnMaps;
        private CardView cardViewRow;

        public MyViewHolder(View view) {
            super(view);
            cardViewRow = view.findViewById(R.id.cardViewRowSMK);
            logo = view.findViewById(R.id.logosmk);
            namaSekolah = view.findViewById(R.id.namaSekolahsmk);
            alamat = view.findViewById(R.id.alamatsmk);
            btnMaps = view.findViewById(R.id.btnDetailsmk);
        }
    }

    public AdapterSmk(List<SMK> smkList, Context context) {
        this.smkList = smkList;
        this.context = context;
    }

    @Override
    public AdapterSmk.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_smk, parent, false);

        return new AdapterSmk.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(AdapterSmk.MyViewHolder holder, int position) {
        final SMK smk = smkList.get(position);

        Glide.with(context)
                .load(smk.getLogo())
                .into(holder.logo);

        holder.namaSekolah.setText(smk.getNama());
        holder.alamat.setText(smk.getAlamat());
        holder.btnMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailSmk.class);
                intent.putExtra("logo2", smk.getLogo());
                intent.putExtra("nama2", smk.getNama());
                intent.putExtra("alamat2", smk.getAlamat());
                intent.putExtra("npsn2", smk.getNpsn());
                intent.putExtra("akreditasi2", smk.getAkreditas());
                intent.putExtra("letak2", smk.getLetak());
                intent.putExtra("tahun2", smk.getTahun());
                context.startActivity(new Intent(intent));
            }
        });
    }

    @Override
    public int getItemCount() {
        return smkList.size();
    }
}