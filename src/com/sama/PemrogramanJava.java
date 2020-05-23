package com.sama;

import java.util.Scanner;

public class PemrogramanJava {
    public static void main(String[] args) {
        System.out.println("program yang saya buat");
        Scanner Inputuser = new Scanner(System.in);
        System.out.print("masukkan nama anda : ");
        String nama = Inputuser.next();
        System.out.println("nama anda : " + nama);

        char [] candra = {'c','a','n','d','r','a'};
        for ( int i = 0; i < candra.length; i++){
            System.out.println(" tampilan nama  ke " + i + "panjang length " + candra[0] + candra[1] + candra[2] + candra[3]);
        }
    }
}
