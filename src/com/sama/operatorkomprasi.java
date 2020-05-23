package com.sama;

public class operatorkomprasi {
    public static void main(String[] args){
//        operator komprasi yang menghasilkan nilai boolean true atau false
        int a = 20;
        int b = 20;
        System.out.printf("hasil dari %d = %d => %s\n" , a,b, (a == b ));

        System.out.println("penggunaan dari lebih kecil");
         a = 78;
         b = 20;
        System.out.printf("hasil dari %d < %d => %s\n", a,b, (a < b ));

        System.out.println("ini penggunaan lebih dari ");
         a = 100;
         b = 300;
        System.out.printf("%d > %d ---> %s\n", a,b, (a > b));

         a = 299;
         b = 500;
        System.out.printf("hasil dari %d <= %d => %s\n", a,b, (a <= b ));


    }
}
