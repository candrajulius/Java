package com.sama;
import java.util.Scanner;
public class InputScanner {
    public static void main(String[] args){
        Scanner userInput= new Scanner(System.in);
        System.out.println("Ini adalah perhitungan membuat luas segitiga");
        System.out.println("Nama Saya Candra Julius Sinaga");
        int sisi,luas,panjang,lebar;
        System.out.print("sisi = ");
        sisi = userInput.nextInt();
        System.out.print("sisi = ");
        sisi = userInput.nextInt();
        luas = sisi * sisi;
        System.out.println("luas dari sisi kali sisi adalah = " + luas);

        System.out.println("Ini adalah perhitungan membuat luas persegi panjang");
        System.out.print("panjang = ");
        panjang = userInput.nextInt();
        System.out.print("lebar = ");
        lebar = userInput.nextInt();
        luas = panjang * lebar;
        System.out.print("luas dari persegi panjang = " + luas);

    }
}
