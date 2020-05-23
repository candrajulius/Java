package com.sama;
import java.util.Scanner;
public class WhileLooping {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        int a = 0;
        boolean kondisi = true;
        System.out.println("angka yang anda masukkan akan bertambah");
        while(kondisi){
            System.out.println("anak ke " + " " + a);
            a++;
            if ( a == 10){
                kondisi = false;
            }
        }
        System.out.println("Itu adalah nama asli saya");

    }
}
