package com.sama;
import java.util.Scanner;
public class OperasiAritmatika {
    public static void main(String[] args){
//        operasi aritmatika dengan bahasa pemrograman java
        System.out.println("ini adalah pembuatan operasi artimatika dengan bahasa pemrograman java");
        int hasil = 20 + 2 * 7 - 5;
        System.out.println("hasilnya adalah =" + " " + hasil);
        hasil  = (20+2) * 8 ;
        System.out.println(hasil);
        hasil = 20 % 2;
        System.out.println(hasil);

        Scanner userInput = new Scanner(System.in);
        int x,y,c;
        int m;
        System.out.print("ini adalah x = ");
        x = userInput.nextInt();
        System.out.print("ini adalah nilai dari y = ");
        y = userInput.nextInt();
        c = x * y;
        System.out.println("hasil dari nilai tersebut adalah =" + " " + c);
    }
}
