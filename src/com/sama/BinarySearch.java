package com.sama;
import java.util.Scanner;
import java.util.Arrays;
public class BinarySearch {
    static void Bubblesort(int[] angka) {
        for (int i = 0; i < angka.length - 1; i++) {
            for (int j = 0; j < angka.length - 1; j++) {
                if (angka[j] > angka[j + 1]) {
                    int temp = angka[j];
                    angka[j] = angka[j + 1];
                    angka[j + 1] = temp;
                }
            }
        }
    }

    static int binarySearch(int angka[], int cari, int i, int j) {
        int tengah;
        while (i <= j) {
            tengah = (i + j) / 2;
            if (cari == angka[tengah]) return tengah;
            else if (cari < angka[tengah]) j = tengah - 1;
            else i = tengah + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("Bubble Short yang dari Ascending");
            System.out.println("ascending adalah pengurutan dari yang terkecil ke terbesar");
            Scanner Inputuser = new Scanner(System.in);
            int[] angka = {1, 2, 8, 100, 5, 7, 12, 56};
            Bubblesort(angka);
            for (int i = 0; i < angka.length; i++) {
                System.out.println(angka[i] + " ");
            }
            System.out.print("masukkan angka anda  = ");
            int cari;
            cari = Inputuser.nextInt();
            int hasil = binarySearch(angka, cari, 0, angka.length - 1);
            if (hasil >= 0) System.out.println("Angka ketemu berada di indeks " + hasil);
            else System.out.println("Angka tidak ada");
        }
    }
}




