package com.dicoding.rakaiqbalsy.smasmknegeridipurwakarta.SMK.Common;

import java.util.ArrayList;

public class DataSMK {
    public static String[][] array = new String[][] {
            {"SMK Negeri 1 Purwakarta", "JL. Industri Km 4", "https://drive.google.com/uc?export=view&id=1kltRMxi_2J0RvkA132ZiNnMvuOaRIj8w", "20217367", "A", "-6.514373, 107.429943", "1963"},
            {"SMK Negeri 2 Purwakarta", "JL. Jend. Ahmad Yani No 98", "https://drive.google.com/uc?export=view&id=1IrLFjuWoGTq_3of4JScv-oE1JSskSDKV", "20229756", "A", "-6.547529, 107.442329", "1968"},
            {"SMK Negeri 3 Purwakarta", "JL. Veteran No 3", "https://drive.google.com/uc?export=view&id=1i0ixF95Wf-qaoBWL_Ynx2cgA0PNiT3UV", "69849572", "Belum Ada Data Akreditasi", "-6.518524, 107.452153", "2014"}
    };

    public static ArrayList<SMK> getListSMK() {
        SMK smk = null;
        ArrayList<SMK> list = new ArrayList<>();

        for (int i = 0; i < array.length; i++ ) {
            smk = new SMK();
            smk.setNama(array[i][0]);
            smk.setAlamat(array[i][1]);
            smk.setLogo(array[i][2]);
            smk.setNpsn(array[i][3]);
            smk.setAkreditas(array[i][4]);
            smk.setLetak(array[i][5]);
            smk.setTahun(array[i][6]);

            list.add(smk);
        }
        return list;
    }
}