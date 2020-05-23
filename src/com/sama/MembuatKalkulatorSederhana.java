package com.sama;
import java.util.*;
public class MembuatKalkulatorSederhana {
    public static void main(String[] args){
        Scanner Inputuser = new Scanner(System.in);
        float a,b,hasil;
        char operator;
        System.out.print("masukkan angka  = ");
        a = Inputuser.nextFloat();
        System.out.print("Silahkan masukkan operator +,/,*,-, =  ");
        operator = Inputuser.next().charAt(0);
        System.out.print("masukkan angka kedua = ");
        b = Inputuser.nextFloat();
        System.out.println("input user: " + a + " " + operator + " " + b);
        if (operator == '+'){
            hasil = a + b;
            System.out.print(hasil);
        }else if(operator == '-'){
            hasil = a - b;
            System.out.print("hasil = " + " " + hasil);
        }else if (operator == '*'){
            hasil = a * b;
            System.out.print("hasil = " + " " + hasil);
        }else if (operator == '/'){
            if( b == 0 ){
                System.out.println("pembagi nol menghasilkan tak hingga");
            }else{
                hasil = a / b;
                System.out.println(" hasil = " + " " + hasil);
            }
        }else{
            System.out.println("hasil eror dan tidak di temukan");
        }

    }
}
