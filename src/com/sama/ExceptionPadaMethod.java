package com.sama;
import java.util.Scanner;
import java.lang.Exception;
public class ExceptionPadaMethod {
    public static void main(String[] args) {
        Scanner Inpuuser = new Scanner(System.in);
        System.out.print("masukkan angka yang anda cari : ");
        int nama = Inpuuser.nextInt();
        int[] babi = {12, 34, 5, 2, 33, 51};
        try {
            System.out.printf("indeks yang anda masukkan %d terdapat angka  ke- %d \n", nama, babi[nama]);
        }catch (Exception e ){
            System.err.println("angka yang anda masukkan tidak ada \n");
        }
        System.out.println("berakhirnya program anda \n");
        System.out.println(" Exception pada fungsi ");
        try {
            int jumlah = kami(babi,nama);
            System.out.printf("\nindeks yang anda masukkan %d terdapat angka  ke- %d ",nama,jumlah);
        }catch (Exception e){
            System.err.println("angka yang anda masukkan salah\n");
        }
        System.out.println("\n Exception dari method\n");
        int wiki = katak(babi,nama);
        System.out.printf(" indeks yang anda masukkan %d terdapat angka  ke- %d",nama,nama,wiki);


    }
    private static int kami( int[]sama, int kiblat) throws Exception{
        int hasil = sama[kiblat];
        return hasil;
    }
    private static int katak(int []hajar, int kosek){
        int hasil = 0;
        try {
            hasil = hajar[kosek];
        }catch (Exception e ){
            System.err.println("angka yang anda masukkan tidak ada di data");
        }
        return hasil;
    }
}

