package com.sama;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Scanning {
    public static void main(String[] args) throws IOException {
    FileReader file = new FileReader("DoaSalamMaria");
    BufferedReader file1 = new BufferedReader(file);
    Scanner scanner = new Scanner(file1);// Menggunakan Class Scanner untuk menngambil sebuah file dari memory
        System.out.println(file1.readLine()); // Pendeklarasian untuk menampilkan file yang kita ambil dari baris pertama pada file
        System.out.println("\n");
        System.out.println(scanner.next());// Mengambil baris pertama yang ada difile untuk di tampilkan kelayar menggunakan Scanner
        System.out.println("\n");
        while (scanner.hasNext()){ // looping untuk menampilkan semua baris yang ada di file agar di tampilkan dilayar..
            System.out.println(scanner.next());
        }
        System.out.println("\n");
        FileReader fileReader = new FileReader("percobaan.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        Scanner mana = new Scanner(bufferedReader);
        mana.useDelimiter(",");
        while (mana.hasNext()){
            System.out.println(mana.next());
        }
        System.out.println("\n");

        FileReader mantap = new FileReader("percobaan.txt");
        BufferedReader mantap1 = new BufferedReader(mantap);
        String data = mantap1.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(data,",");
        System.out.println(stringTokenizer.nextToken());

        while (stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
            data = mantap1.readLine();

        }

}
}
