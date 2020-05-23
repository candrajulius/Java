package com.sama;
import java.util.Scanner;
public class OperasiString {
    public static void main(String[] args) {
        Scanner Inputuser = new Scanner(System.in);
        String kalimat = "kamu sangat baik sekali";

//        mengambil komponen dari String
        System.out.println(kalimat.charAt(0));

//        substring
        String hujan = "su" + kalimat.substring(0,4);
        System.out.println(hujan);
        System.out.println(kalimat.substring(0,4));

//        concenation = penggabungan dua kalimat
        String biasa = kalimat + "gorengan";
        System.out.println(biasa);


//        membuat String menjadi uppercase dan lowercase.
        System.out.println(kalimat.toUpperCase());
        System.out.println(kalimat.toLowerCase());
        System.out.println("\n");

//        penggabungan tipe data String dengan Tipe data Integer dan Float
        int jumlah = 20;
        String jama = "dia memiliki bayangan mencapai dengan " + jumlah;
        System.out.println("ini penggabungan dua tipe data yang berbeda " + jama + "\n");

//        replace = memindahkan satu kata ke kata baru
        System.out.println(kalimat.replace("kamu", "dia"));

//        compare
        String marga = "Sinaga";
        String marga1 = "Situmeang";
        System.out.println(marga.compareTo(marga1));
        System.out.println(marga1.compareTo(marga));

//        equal = membandingkan kata dengan kata laen menjadi benar
        String kata = "mama";
        String dia = "mama";
        String kamu = new String("sama aja ");
//        perbandingan dua buah string == persamaan pada string pool
        System.out.println(kata);
        System.out.print("masukkan string dari user = ");
        dia = Inputuser.next();

        if (kata.equals(dia)){
            System.out.println("sama ");
        }else{
            System.out.println("berbeda ");
        }
    }
}
