package com.sama;
import java.util.*;
public class LatihanLooping {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        int nilaiAwal, nilaiAkhir, total;
        System.out.print("masukkan awalan mu = ");
        nilaiAwal = inputUser.nextInt();
        System.out.print("masukkan akhiran mu = ");
        nilaiAkhir = inputUser.nextInt();

//        for (total = 0; nilaiAwal <= nilaiAkhir; nilaiAwal++) {
//            total = total + nilaiAwal;
//            System.out.println("ditambah " + " " + nilaiAwal + " " + "menjadi" + " " + total);
//        }

        total = 0;

        while( nilaiAwal <= nilaiAkhir) {
            total = total + nilaiAwal;
            System.out.println("ditambah  " + " " + nilaiAwal + " " + "menjadi" + " " + total);
            total = total * nilaiAkhir;
            System.out.println("dikali " + " " + nilaiAkhir + " " + "menjadi" + " " + total );
            total = total - nilaiAwal;
            System.out.println("dikurang" + " " + nilaiAwal + " " + "menjadi" + " " + total);
            total = total / nilaiAwal;
            System.out.println("dibagi" + " " + nilaiAwal + " " + "menjadi" + " " + total);
           nilaiAwal++;
        }
    }
}
