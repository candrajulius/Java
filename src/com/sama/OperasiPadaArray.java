package com.sama;
import java.util.Arrays;
import java.util.Scanner;
public class OperasiPadaArray {
    public static void main(String[] args) {
        Scanner Inputuser = new Scanner(System.in);
        int[] array = {1,2,4,56,74,66,223,11,22};
        int[] array2 = new int[10];
        array2 = array;
        bandal(array);
        bandal(array2);
            System.out.println("\n");
            System.out.println("ini adalah teknik sorting");
            System.out.println("pengurutan data array");
            Arrays.sort(array);
            bandal(array);
            System.out.println("masukkan nilai yang akan anda cari = ");
            int data = Inputuser.nextInt();
            int letak = Arrays.binarySearch(array,data);
            System.out.println("data yang anda cari " + data + " berada di indeks " + letak);
        manusia("bella");
        System.out.println("mengkopi array dengan copyOf");
        int [] array3 = Arrays.copyOf(array, 4);
        bandal(array3);
        System.out.println("mengkopi array dengan copyOfrange");
        int [] array4 = Arrays.copyOfRange(array , 2,6);
        bandal(array);
        bandal(array4);
        System.out.println("\n fill \n");
        int [] array5 = new int[10];
        System.out.println(Arrays.toString(array5));
        Arrays.fill(array5,5);
        bandal(array5);
        System.out.println("membandingkan dua buah nilai pada array = equals");
        int[] array6 = {1,2,3,4,5,6,7};
        int[] array7 = {1,2,3,4,5,6,8};
        bandal(array6);
        bandal(array7);
        if (Arrays.equals(array6,array7)){
            System.out.println("array ini sama");
        }else{
            System.out.println("array ini berbeda");
        }
        System.out.println("\n mengecek nilai yang besar pada array = compare");
        System.out.println(Arrays.compare(array6,array7));
        System.out.println("\nmengecek indeks yang berbeda");
        System.out.println(Arrays.mismatch(array6,array7));
        System.out.println("\nakhir dari program\n");

        }
    private static void bandal(int[] Dataarray){
        System.out.println("array = " + Arrays.toString(Dataarray));
    }
    private static void manusia (String nama){
        System.out.println(" selamat pagi " + nama);
    }
    }