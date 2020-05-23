package com.sama;

public class OverloadMethod {
    public static void main(String[] args){
        int hasilInteger;
        hasilInteger  = Angkasatu(9,8,9);
        float hasilFloat;
        hasilFloat = Angkasatu(9,2.8f,2.9f);
        Angkasatu(hasilInteger);
        Angkasatu(10);
        Angkasatu(10.5f);

    }
    private static float Angkasatu( int bilangan ,float bilangan1, float bilangan2){
        return bilangan + bilangan1 * bilangan2;
    }
    private static int Angkasatu(int bilangan, int bilangan1, int bilangan2){
        return bilangan + bilangan1 + bilangan2;
    }
    private static void Angkasatu( float angkaFloat){
        System.out.println("angka didalam float " + " " + angkaFloat);
    }
    private static void Angkasatu( int angkaInteger){
        System.out.println("angka didalam integer"+ " "+ angkaInteger);
    }

}
