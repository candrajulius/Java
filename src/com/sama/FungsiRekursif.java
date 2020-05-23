package com.sama;
import java.util.*;
public class FungsiRekursif {
    public static void main(String[] args){
        Scanner Inpuuser = new Scanner(System.in);
        while ( true) {
            System.out.print("masukkan nilai :");
            int nilai = Inpuuser.nextInt();
            System.out.println("Anda memasukkan nilai = " + nilai);

            printNilai(nilai);
            int jumlah = jumlahNilai(nilai);
            System.out.println("jumlah = " + jumlah);
            int faktorial = hitungFaktorial(nilai);
            System.out.println("hasil faktorial = " + faktorial);
        }

    }
    private static int hitungFaktorial( int parameter ){
        System.out.println("parameter = " + parameter);

        if (parameter == 1){
            return parameter;
        }
        return parameter * hitungFaktorial( parameter- 1);
    }

     private static int jumlahNilai( int parameter ) {
         System.out.println("parameter =" + parameter);
         if (parameter == 0) {
             return parameter;
         }
         return parameter + jumlahNilai(parameter - 1);
     }
    private static void printNilai ( int parameter){
        System.out.println("nilai = " + parameter);
     }


}
