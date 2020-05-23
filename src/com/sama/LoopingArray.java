package com.sama;
import java.util.Scanner;
import java.util.Arrays;
public class LoopingArray {
    public static void main (String[] args ){
        String nama = "Candra Julius Sinaga";
        System.out.println("ini adalah program baru yang dibuat sama" + " " + nama);
        int[] sinaga = {12,45,2,5,7,8,9,0,11};
        for (int i = 0; i < 9; i++){
            System.out.println("data " + i + " dengan nilai" + " " +  sinaga[i]);
        }
        System.out.println("\n");
        for (int i = 0; i < sinaga.length; i++){
            System.out.println("data " + sinaga[i] + " " + "berada" + " " + "ke" + " " + i);
        }
        System.out.println("\n");
        for ( int angka : sinaga){
            System.out.println("data dengan nilai " + " " + angka);
        }
    }
}
