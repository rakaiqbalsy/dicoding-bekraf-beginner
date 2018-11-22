package com.dicoding.rakaiqbalsy.smasmknegeridipurwakarta.SMA.Common;

import java.util.ArrayList;

public class DataSma {
    public static String[][] array = new String[][] {
            {"SMA Negeri 1 Purwakarta", "JL. KK SINGAWAINATA NO. 113", "https://drive.google.com/uc?export=view&id=1-O1Y5GbSjIuWwwDdtubeydzCZwdROLro", "20217357", "A", "geo:-6.558643, 107.447918", "1957"},
            {"SMA Negeri 2 Purwakarta", "JL. RAYA SADANG NO.17", "https://drive.google.com/uc?export=view&id=1sSTDsP59-opwXFgGuGcnU9qDbRrNRCj2", "20217361", "A", "geo:-6.514074, 107.465915", "1981"},
            {"SMA Negeri 3 Purwakarta", "JL. LETKOL ABDUL KADIR NO. 15", "https://drive.google.com/uc?export=view&id=1jxumpU8giY7uX-2aiq1f2uJN-MRlF98Y", "20217363", "A", "geo:-6.542172, 107.439169", "1987"},
            {"MA Negeri Purwakarta", "Jl. Veteran No.299", "https://drive.google.com/uc?export=view&id=1mquAl7kHGFBWmERR2V-PFDUx7A7Bwu_V", "20277271", "A", "geo:-6.517076, 107.449828", "1983"}
    };

    public static ArrayList<SMA> getListSMA() {
        SMA sma = null;
        ArrayList<SMA> list = new ArrayList<>();

        for (int i = 0; i < array.length; i++ ) {
            sma = new SMA();
            sma.setNama(array[i][0]);
            sma.setAlamat(array[i][1]);
            sma.setFoto(array[i][2]);
            sma.setNpsn(array[i][3]);
            sma.setAkreditasi(array[i][4]);
            sma.setLetak(array[i][5]);
            sma.setTahun(array[i][6]);

            list.add(sma);
        }
        return list;
    }
}
