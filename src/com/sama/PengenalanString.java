package com.sama;
import java.util.Scanner;
import java.util.Arrays;
public class PengenalanString {
    public static void main(String[] args) {
        String nama = "Candra Julius Sinaga";
        System.out.println(nama);
        candra("disini dia", nama);
        System.out.println(nama.charAt(0));
        String gaskan = "c" + nama.substring(1,6);
        System.out.println(gaskan);
        candra("salah dia" , gaskan);
    }
    private static void candra (String nama, String base){
        int gajah = System.identityHashCode(base);
        System.out.println(nama + " = " + base + "\t adreess = " +  Integer.toHexString(gajah));
    }
}
