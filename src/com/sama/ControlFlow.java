package com.sama;
import java.util.*;
public class ControlFlow {
    public static void main(String[] args){
        int a = 0;

        while ( true ){
            a++;
            if (a == 10 ){
                break;
            }else if( a == 5){
                continue;
            }else if ( a == 7 ){
                return;
            }
            System.out.println("ini bukan program java");
        }
        System.out.println("ini akhir segalanya");

//        if ( a > 50 || a % 2 == 0){
//            System.out.println("itu adalah bilangan genap");
//        }else{
//            System.out.println("bilangan bersifat ganjil dan kecil");
//        }
    }
}
