package com.sama;
import com.sun.security.jgss.GSSUtil;
import org.w3c.dom.ls.LSOutput;

import javax.print.DocFlavor;
import java.util.*;
public class PengenalanFungsiAndMethod {
    public static void main(String[] args) {
        Scanner Inputuser = new Scanner(System.in);
//        void itu artinya hampa
        while (true) {
            System.out.print("masukkan nilai alas = ");
            int alas = Inputuser.nextInt();
            System.out.print("masukkan nilai tinggi = ");
            int tinggi = Inputuser.nextInt();
            kamu(alas, tinggi);
            candra(alas, tinggi);
            System.out.println("\n");
            TampilkaKeadaan(alas, tinggi);
        }
    }

    private static int bangsat(int alas, int tinggi) {
        int hasil = alas * tinggi;
        return hasil;
    }

    private static int buset(int alas, int tinggi) {
        int hasil = (alas * tinggi) / 2;
        return hasil;
    }

    private static int mantap(int alas, int tinggi) {
        int hasil = bangsat(alas, tinggi) + buset(alas, tinggi);
        return hasil;
    }

    private static void TampilkaKeadaan(int alas, int tinggi) {
        System.out.println("ini hasil dari luas = " + bangsat(alas, tinggi));
        System.out.println("ini hasil dari keliling = " + buset(alas, tinggi));
        System.out.println("ini hasil total = " + mantap(alas, tinggi));
    }


    private static void kamu(int alas, int tinggi) {
        for (int i = 0; i < bangsat(alas, tinggi); i++) {
            for (int k = 0; k < buset(alas, tinggi); k++) {
                System.out.print(" 9 ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");
    }

    private static void candra(int alas, int tinggi) {
        for (int i = 0; i < mantap(alas, tinggi); i++) {
            System.out.print(" ) ");
//            if ( i == mantap(alas, tinggi)){
//                System.out.print("\n");
//                break;
        }
    }
}


