package com.sama;
import java.util.*;
public class TernaryOperator {
    public static void main(String[] args){
        Scanner Inputuser = new Scanner(System.in);
        int input, x;
        System.out.print("hasil dari input user = ");
        input = Inputuser.nextInt();

        x = (input == 10) ? (input*input) : (input/2);
        System.out.println("inilah hasil dari x = " +" "+ x);
    }
}
