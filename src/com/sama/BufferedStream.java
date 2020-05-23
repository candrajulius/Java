package com.sama;

import javax.imageio.stream.FileImageOutputStream;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class  BufferedStream {
    public static void main(String[] args) throws IOException {
        System.out.println("pembacaan dari file");
        FileInputStream file = new FileInputStream("bahagia.txt");
        System.out.println(file.read());
        System.out.println(file.available());
        long WaktuStart,WaktuFinish,Hasil;
        WaktuStart = System.nanoTime();
        System.out.println(file.readAllBytes());
        WaktuFinish = System.nanoTime();
        Hasil = WaktuFinish - WaktuStart;
        System.out.println("waktu = " + Hasil);

        FileInputStream file2 = new FileInputStream("bahagia.txt");
        BufferedInputStream file3 = new BufferedInputStream(file2);
        file3.mark(200);
        WaktuStart = System.nanoTime();
        System.out.println(file3.readAllBytes());
        WaktuFinish = System.nanoTime();
        Hasil = WaktuFinish - WaktuStart;
        System.out.println("waktu = " + Hasil);
        file3.reset();
//        baca ulang
        byte [] data = file3.readAllBytes();
        String dataString = new String(data);
        System.out.println(dataString);

//        menulis baru
        FileOutputStream sumbang = new FileOutputStream("percobaan.txt");
        BufferedOutputStream sumbang1 = new BufferedOutputStream(sumbang);
        sumbang1.write(data);
        sumbang1.flush();
    }
}
