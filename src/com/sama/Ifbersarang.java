package com.sama;
import java.util.Scanner;
public class Ifbersarang {
    public static void main(String[] args) {
        Scanner Inputuser = new Scanner(System.in);
        System.out.println("Ini adalah program sejak tadi aku buat");
        int a, b;
        Long ayamm;
            System.out.print("tolong anda masukkan angka anda kedalam sene = ");
        a = Inputuser.nextInt();
        System.out.print("masukkan nilai kedua = ");
        b = Inputuser.nextInt();
        if ( a == 20) {
            if (b == 40) {
                System.out.println("semua sistem akan bekerja dengan kondisi baik");
            } else {
                System.out.println("dari semua itu tidak terpenuhi maka sistem akan eror");
            }
        }
            System.out.println("program telah selesai");
    }
}
