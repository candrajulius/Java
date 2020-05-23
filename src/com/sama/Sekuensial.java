package com.sama;
import java.util.Scanner;
public class Sekuensial {

    static void Julius(int[] angka) {
        for (int i = 0; i < angka.length - 1; i++) {
            for (int j = 0; j < angka.length -1 ; j++) {
                if (angka[j] < angka[j + 1]) {
                    int temp = angka[j];
                    angka[j] = angka[j + 1];
                    angka[j + 1] = temp;
                }
            }
        }
    }
    static int Candra(int[]angka, int data){
        for (int i = 0; i < angka.length; i++){
            if (data == angka[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main (String[] args){
        Scanner Inputuser = new Scanner(System.in);
        int []angka = {1,2,3,4,5,9,7,0};
        Julius(angka);
        for (int i = 0; i < angka.length; i++){
            System.out.println(angka[i] + " ");
        }
        System.out.print("masukkan angka yang anda cari =  ");
        int data = Inputuser.nextInt();
     System.out.println("Data" + " " +  "yang anda cari berada di indeks"  + " " +  Candra(angka,data));
    }
}

