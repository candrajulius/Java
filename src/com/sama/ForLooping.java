package com.sama;
import java.util.*;
public class ForLooping {
    public static void main(String[] args){
        Scanner inputUser = new Scanner(System.in);

        int a;
        float b,c;
        float hasil;
        char operator;
        System.out.print("masukkan angka yang anda inginkan = ");
        b = inputUser.nextFloat();
        System.out.print("masukkan oeprator  +,/,*,-,% = ");
        operator = inputUser.next().charAt(0);
        System.out.print("masukkan angka kedua yang anda inginkan = ");
        c = inputUser.nextFloat();
        System.out.println("input user " + " " + b + " " + operator + " "+ c );
        if ( operator == '+' ){
            hasil = b + c;
            System.out.println("ini adalah hasilnya = " + hasil);
        }else if ( operator == '-'){
            hasil = b - c;
            System.out.println("ini adalah hasilnya = " + hasil);
        }else if ( operator == '*'){
          hasil = b * c;
            System.out.println("ini adalah hasilnya =" + hasil);
        }else if( operator == '/'){
           hasil = b / c;
            System.out.println("Ini adalah hailnya" + hasil);
            if ( c == 0){
                System.out.println("hasil menjadi tidak terhingga");
            }else{
                System.out.println("hasil " + " " + hasil);
            }
        } else if ( operator == '%' ){
            hasil = b % c;
            System.out.println("hasil dari modulus =" + hasil);
        }
        else{
            System.out.println("operator yang anda masukkan tidak di temuka + " + operator);
            System.out.println("hasilnya pun menjadi eror");
        }


        for(a = 0; a <= 10; a++) {
            System.out.println("ini adalah program ke -" + " " + a);
        }
        System.out.println("ini adalah akhir dari semua program");


    }

}
