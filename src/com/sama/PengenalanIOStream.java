package com.sama;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class PengenalanIOStream {
    public static void main(String[] args) throws IOException {
        System.out.println("pengenalan Io Stream memakai Error Handling");
        try {
            FileInputStream Candra = new FileInputStream("input.txt");
            System.out.println((char)Candra.read());System.out.println((char)Candra.read());
            System.out.println((char)Candra.read());System.out.println((char)Candra.read());
            System.out.println((char)Candra.read());System.out.println((char)Candra.read());
        }catch (Exception e){
            System.err.println("nama yang anda masukkan salah!!!");
        }
        System.out.println("pengenalan Io Stream secara langsung");
        FileInputStream bangsat = new FileInputStream("candra.txt");
        System.out.print((char)bangsat.read());System.out.print((char)bangsat.read());
        System.out.print((char)bangsat.read());System.out.print((char)bangsat.read());
        System.out.print((char)bangsat.read());System.out.print((char)bangsat.read());
    }
}
