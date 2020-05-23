package com.sama;
import java.util.Scanner;
public class LatihanOperatorLogika {
    public static void main(String[] args){
        Scanner inputUser = new Scanner(System.in);
        System.out.println("latihan operator Logika");
        int nilaibenar = 9;
        int nilaitebakan;
        boolean statusTebakan;
        System.out.print("masuukkan nilai tebakan anda = ");
        nilaitebakan = inputUser.nextInt();
        System.out.println("nilai tebakan anda adalah : " + nilaitebakan);

        System.out.println("Operasi Logika");
        statusTebakan = (nilaitebakan == nilaibenar);
        System.out.println("tebakan anda = " + statusTebakan);

        System.out.println("operasi aljabar boolean (and / or)");
        System.out.print("masukkan nilai diantara 4 dan 9 = ");
        nilaitebakan =  inputUser.nextInt();
        statusTebakan = (nilaitebakan > 4) && (nilaitebakan < 9);
        System.out.println("tebakan anda " + statusTebakan);



    }
}
