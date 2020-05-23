package com.sama;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class IfElseStatement {
    public static void main(String[] args){
        Scanner Inputuser = new Scanner(System.in);
        int data;
        int a = 20;
        System.out.println("Silahkan masukkan nilai anda = ");
        System.out.println("Ini adalah cabangnya");
        System.out.print("data anda adalah berapa = ");
        data = Inputuser.nextInt();
        if ( data > a){
            System.out.println("sistem akan dijalankan");
        }else if ( data < a){
            System.out.println("sistem berhenti");
        }else {
            System.out.println("jika nilai dari = " + data + " " + "dengan nilai dari" +" "+ a +" "+ "sama, maka sistem akan rusak");
        }

        System.out.println("Ini selesai");

    }
}
