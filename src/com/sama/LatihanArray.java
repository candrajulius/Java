package com.sama;
import java.util.Scanner;
import java.util.Arrays;
public class LatihanArray {
    public static void main(String[] args) {
        Scanner Inputuser = new Scanner(System.in);
        int[] array1 = {1, 23, 45, 667, 443, 12, 45};
        int[] array2 = {1, 4, 52, 44, 52, 5, 6, 22,};
        lama(array1, array2, "hasil dari");
        int[] hasilArray1 = tambahArray(array1, array2);
        Arrays.sort(hasilArray1);
        masih(hasilArray1, "hasil sorting");
        reserve(hasilArray1);
        masih(hasilArray1, "hasil reserve2");

        System.out.println("menggabungkan dua array");
        int[] hasilArray2 = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            hasilArray2[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            hasilArray2[i + array1.length] = array2[i];
        }
        masih(array1, " array ");
        masih(array2, "array");
        masih(hasilArray2, "hasil ");


        System.out.println("\nSorting\n");
        masih(array1, " array ");
        reserve(array1);
        masih(array1, "hasil reserve");
        Arrays.sort(array2);
        int [] dia = Arrays.copyOf(array2, array2.length);
        masih(array2 , "hasil");
        for (int i = 0; i < array2.length; i++){
            array2[i] = dia[(dia.length -1) -i];
        }
        masih(array2, "hasil");
    }

    private static int[] tambahArray(int[] arrayInt1, int[] arrayInt2) {
        int[] hasilArray = new int[arrayInt1.length];
        for (int i = 0; i < arrayInt1.length; i++) {
            hasilArray[i] = arrayInt1[i] + arrayInt2[i];
        }
        return hasilArray;
    }

    private static void lama(int[] dataArray, int[] dataArray2, String message) {
        System.out.println(message + " = " + Arrays.toString(dataArray) + " dan " + Arrays.toString(dataArray2));
    }

    private static void masih(int[] mantap, String messsage) {
        System.out.println(messsage + " = " + Arrays.toString(mantap));
    }

    private static void reserve(int[] dataArray) {
        Arrays.sort(dataArray);
        int[] arrayReverse = Arrays.copyOf(dataArray, dataArray.length);
        for (int i = 0; i < dataArray.length; i++) {
            dataArray[i] = arrayReverse[(arrayReverse.length - 1) - i];
        }

    }
}



