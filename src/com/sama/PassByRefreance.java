package com.sama;
import java.util.Scanner;
import java.util.Arrays;
public class PassByRefreance {
    public static void main(String[] args) {
        Scanner Inputuser = new Scanner(System.in);
            int[] angka = {10, 23, 56, 24, 67, 21};
            int[] satu = new int[6];
            satu = angka;
            satu[0] = 13;
            angka[2] = 20;
            System.out.println("ini adalah perubahan indeks" + (Arrays.toString(satu)));
            System.out.println("ini adalah perubahan ineks " + (Arrays.toString(angka)));
            System.out.println(Arrays.toString(angka));
            for (int i = 0; i < angka.length; i++) {
                System.out.println("amgka dengan indeks  ke " + i + " dengan nilai " + angka[i]);
                System.out.print("\n");
                System.out.print(angka[i]);
                System.out.print("\n");
                System.out.print(i);
            }
        }
    }



