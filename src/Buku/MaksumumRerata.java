package Buku;

import java.util.Scanner;

public class MaksumumRerata {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
//        System.out.println(" kumpulan pembelajaran ");
//        System.out.println("tinggi segitiga = ");
//        int tinggi = data.nextInt();
//        for (int i = 1; tinggi >= i; tinggi--) {
//            int bil = tinggi;
//            for (int j = 1; j <= tinggi; j++) {
//                System.out.print(String.format("%3d", bil));
//                bil = bil + tinggi - j;
//            }
//            System.out.print("\n");
//        }
//        System.out.print(" Jumlah Baris = ");
//        int jumlahBaris = data.nextInt();
//        System.out.print(" Jumlah Kolom = ");
//        int jumlahKolom = data.nextInt();
//        for (int i = jumlahBaris; i >= 1; i--) {
//            int bil = i;
//            for (int j = 1; j <= jumlahKolom; j++) {
//                System.out.print(String.format("%3d" + " ", bil));
//                bil = bil + jumlahBaris;
//            }
//            System.out.println("\n");
//        }
//        System.out.println("n = ");
//        int n = data.nextInt();
//        float jum = 1;
//        for (float i = 2; i <= n; i++) {
//            if (i % 2 == 0) {
//                jum = jum - 1 / i;
//            } else {
//                jum = jum + 1 / i;
//            }
//        }
//        System.out.println(" jumlah = " + jum);
//        System.out.println(" loping =  berulangan ");
//        System.out.println("masukkan bilangan anda = ");
//        int user = data.nextInt();
//        for (int i = 0; i <= 20; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }
//        int m,r,k;
//        System.out.println(" m : ");
//         m = data.nextInt();
//
//        System.out.println("n : ");
//         k = data.nextInt();
//         r = m % k ;
//         while ( r != 0){
//             m = k;
//             k = r;
//             r = m % k;
//         }
//        System.out.println(" FPB = " + k);
//        System.out.println("masukkan bilangan anda = ");
//         int bil = data.nextInt();
//         while (bil <= 10){
//             System.out.println(bil);
//             bil = bil + 2;
//         }
//        System.out.println("masukkan bilangan anda = ");
//         int bil1 = data.nextInt();
//         while (bil1 >= 1){
//             System.out.println("bilangan = " + bil1);
//             bil1 = bil1 - 1;
//         }
//        System.out.println("masukkan pencacah = ");
//        int pencacah = data.nextInt();
//        int jum = 0;
//        int n = 1;
//        while (n <=  pencacah){
//            jum = jum + n;
//            n++;
//        }
//        System.out.println("jumlah = " + jum);
        float n , bil;
        double jum,pi;
        System.out.println(" n : ");
        n = data.nextInt();
        bil = 1;
        jum = 0;
        while (bil <= n){
            jum = jum + 1 / (bil * bil);
            bil ++;
        }
        pi = Math.sqrt(jum * 6);
        System.out.println("pi = " + pi);
        System.out.println("\n");

    }
}



