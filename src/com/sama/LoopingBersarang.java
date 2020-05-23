package com.sama;
import java.util.*;
public class LoopingBersarang {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        float a, b, hasil;
        char operator;
        boolean kamu;
        float sama = 100;
        System.out.println("cara membuat program sederhana");
        System.out.print("masukkan angka anda =");
        a = inputUser.nextInt();
        System.out.print("masukkan operator +,-,/,* =");
        operator = inputUser.next().charAt(0);
        System.out.print("masukkan angka kedua anda = ");
        b = inputUser.nextInt();
        System.out.println("hasil dari " + a + " " + operator + " " + b);


        if (operator == '+') {
            hasil = a + b;
            System.out.println("hasil =" + " " + hasil);
            for ( int i = 0; i < hasil; i++){
                    System.out.print(" * ");
                    if ( hasil % 2 == 0){
                        System.out.print("\n");
                    }
            }
            System.out.print("\n");
            if (kamu = hasil == sama) {
                System.out.println("hasil anda adalah benar");
            } else {
                System.out.println("hasil yang anda masukkan salah");
            }
        } else if (operator == '-') {
            hasil = a - b;
            System.out.print("hasil =" + " " + hasil);
            if ( hasil == sama) {
                System.out.println("hasil yang anda masukkan benar");
            } else {
                System.out.println("hasil yang anda masukkan salah");
            }
        } else if (operator == '*') {
            hasil = a * b;
            System.out.println("hasil =" + " " + hasil);
            if (kamu = hasil == sama) {
                System.out.println("hasil yang anda masukkan benar");
            } else {
                System.out.println("hasil yang anda masukkan salah");
            }
        } else if (operator == '/') {
            if (b == 0) {
                System.out.println("pembagi nol menjadi tak hingga");
                hasil = a / b;
                System.out.println("hasil menjadi eror");

                if ( hasil == sama) {
                    System.out.println("hasil yang anda masukkan benar");
                } else {
                    System.out.println("hasil yang anda masukkan salah");
                }
            }
            } else{
                System.out.println(operator + " " + "yang anda masukkan salah dan hasil pun menjadi eror");
            }
            System.out.print("\n");
        }
    }
