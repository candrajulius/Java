package com.sama;
import java.util.Arrays;
import java.util.Scanner;
public class PengenalanArray {
    public static void main(String[] args){
        Scanner Inputuser = new Scanner(System.in);
        System.out.println("assignment array");
        int[] arrayInteger = {1 , 2 , 3 ,4 };
        arrayInteger[0] = 90;
        System.out.println(arrayInteger[0]);
        System.out.println(arrayInteger[1]);
        System.out.println(arrayInteger[2]);
        System.out.println(arrayInteger[3]);

//        Deklarasi
//        tipedata[] nama = new int [jumlah arrray];

        System.out.println("deklarasi Array");
        float[] ayam = new float [900];
        ayam[3] = 98.99f;
        System.out.println(ayam[3]);

//        stock barang , nama barang
//        looping untuk stock barang dan nama barang.
//        ketika user menginput nama barang maka akan muncul stock barang dan nama barangnya
//        barang akan ditampilkan beserta harga dari barang tersebut 
//        sesudah akan ditampilkan semua barang dan stock nya
//        ketika user menginput nama barang yang tidak ada maka program akan mengatakan maaf "nama barang yang anda ketik salah"
    }
}
