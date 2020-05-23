package com.sama;
import java.sql.Array;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayMulti {
    public static void main(String[] args) {
        int [] mantap = {1,4,5,6,3,2};
        Arrays.sort(mantap);
        System.out.println(Arrays.toString(mantap));
        int[] sama = Arrays.copyOf(mantap, mantap.length);
        for ( int i = 0; i < mantap.length ; i++){
            mantap[i] = sama[(sama.length - 1) - i];
        }
        System.out.println(Arrays.toString(mantap));
        System.out.println("\n");
        System.out.println(Arrays.toString(mantap));
        int [][] array_2D = {
                {1,23,4,5},
                {1,2,5,4,2},
        };
        System.out.println(array_2D);
        System.out.println(Arrays.toString(array_2D));
        System.out.println(array_2D[0]);
        System.out.println(array_2D[1]);
        System.out.println(Arrays.deepToString(array_2D));
        char [] arrayChar1 = {'c','c','t','y','u'};
        char [] arrayChar2 = {'1','f','t','y','u'};
        System.out.println("\n");
        char [][] kamu = {
                arrayChar1,
                arrayChar2,
        };
        System.out.println(kamu);
        System.out.println(Arrays.deepToString(kamu));
        System.out.println(Arrays.toString(kamu));
    }
}
