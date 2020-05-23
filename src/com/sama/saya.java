package com.sama;

public class saya {
    public static void main (String[] args){
//        Program untuk konversi data
        int nilaiInt = 405;
        System.out.println(nilaiInt);
        long nilaiLong = nilaiInt;
        System.out.println(" ini adalah niali" + nilaiLong);
        byte nialiByte = (byte) nilaiInt;
        System.out.println("Ini adalah nilai dari byte"+ nialiByte);
        System.out.println("nilai masksimum dari byte = " + Byte.MAX_VALUE);

//        cast pembagian
        int a = 20;
        float c = 20;
        float x = (float) a / c;
        System.out.println("hasil dari semua pembagian adalah = " + x );

    }
}
