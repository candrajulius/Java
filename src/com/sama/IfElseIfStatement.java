package com.sama;
import java.util.Scanner;
public class IfElseIfStatement {
    public static void main (String[] args){
        Scanner Inputuser = new Scanner(System.in);
        int data;
        System.out.println("masukkan nilai anda sekarang = ");
        data = Inputuser.nextInt();
        if ( data == 30){
            System.out.println("maka sistem akan terbang");
        } else if( data > 40){
            System.out.println("maka sistem akan berada didarat");
        }else{
            System.out.println("maka sistem akan melayang ");
        }
        System.out.println("ini adalah percobaan membuat pesawat terbang");
    }
}
