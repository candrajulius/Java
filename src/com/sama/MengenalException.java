package com.sama;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
public class MengenalException {
    public static void main(String[] args) {
        int[]array = {1,3,4,5,62,};
        String nama = "buttet";
        int jumlah = System.identityHashCode(nama);
        System.out.print("adress dari " + nama + " mengkoverasi ke oktal = " + jumlah  + " menkonverasi ke hexadesimal = " + Integer.toHexString(jumlah) + "\n");
        Scanner Inputuser = new Scanner(System.in);
        System.out.print(" masukkan angka yang anda inginkan = ");
        int indeks = Inputuser.nextInt();
        FileInputStream fileInputStream = null;
//        for (int i = 0; i < array.length; i++){
//            System.out.println("tampilan data ke - " + i  + " adalah " + array[i]);
        try {
            System.out.printf("angka yang anda masukkan %d berada di indeks ke- %d \n", indeks,array[indeks]);
            fileInputStream = new FileInputStream("kamu salah");
        }catch (IOException e){
            for ( int i = 0; i < array.length; i++) {
                System.err.println("tampilan data ke " + i + " adalah " + array[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
                System.err.println("data yang anda cari tidak berada di file");
        }finally {
            System.err.println("sistem sudah berakhir");
        }
        }
        }
