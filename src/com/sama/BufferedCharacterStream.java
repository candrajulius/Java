package com.sama;

import java.io.*;
import java.util.Arrays;
import java.util.Objects;

public class BufferedCharacterStream {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("bahagia.txt");
        BufferedReader file1 = new BufferedReader(file);
        file1.mark(200);
        System.out.println(file1.readLine());
        System.out.print((char)file1.read());
        file1.reset();
        char [] simponi = new char[100];
        file1.read(simponi,0,100);
        System.out.println(simponi);
        file1.reset();

        FileWriter fileWriter = new FileWriter("percobaan.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String data4 = file1.readLine();
        bufferedWriter.write(data4,0,data4.length());
        bufferedWriter.flush();
        String data5 = file1.readLine();
        bufferedWriter.newLine();
        bufferedWriter.write(data5);
        bufferedWriter.flush();

    }
}
