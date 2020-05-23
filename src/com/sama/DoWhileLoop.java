package com.sama;
import java.sql.SQLOutput;
import java.util.Scanner;
public class DoWhileLoop {
    private static void mama(int panjang, int lebar) {
        System.out.println(luasPersegiPanjang(panjang, lebar));
    }

    private static void mama(int sisi) {
        System.out.println(LuasBujurSangkar(sisi));
    }

    private static void kakak(int alas, int tinggi) {
        System.out.println(LuasSegitiga(alas, tinggi));
    }


    private static int luasPersegiPanjang(int panjang, int lebar) {
        int hasil = panjang * lebar;
        return hasil;
    }

    private static int LuasBujurSangkar(int sisi) {
        int hasil = sisi * sisi;
        return hasil;
    }

    private static int LuasSegitiga(int alas, int tinggi) {
        int hasil = (alas * tinggi) / 2;
        return hasil;
    }

    public static void main(String[] args) {
        Scanner Inputuser = new Scanner(System.in);
        int panjang, lebar, sisi, alas, tinggi;
        int hasil;
        boolean kami = false;
        String mantap = "ya";
//        System.out.println("tamilan data semuanya ");
//        for (int i = 0; i < 3; i++){
//            System.out.println("nomor  ke " + i + );
//        }
        System.out.print("masukkan angka anda = ");
        int nama = Inputuser.nextInt();

        while (nama >= 1 && nama <= 3) {
            System.out.println("anda memilih angka  ke " + nama);
            if (nama == 1) {
                System.out.print("masukkan panjang = ");
                panjang = Inputuser.nextInt();
                System.out.print("masukkan lebar = ");
                lebar = Inputuser.nextInt();
                hasil = panjang * lebar;
                System.out.println("hasl = " + hasil);
                System.out.print("apakah anda ingin lanjut ");
                String jaka = Inputuser.next();
                if (jaka == "ya ") {
                    System.out.println("apakah anda ingin lanjut  = " + jaka);
                    continue;
                } else {
                    System.out.println("program telah selesai");
                }
            } else if (nama == 2) {
                System.out.print("masukkan sisi = ");
                sisi = Inputuser.nextInt();
                System.out.print("masukkan sisi = ");
                sisi = Inputuser.nextInt();
                hasil = sisi * sisi;
                System.out.println("hasil = " + hasil);
                System.out.println(" apakah anda ingin lanjut = ");
                String jaka = Inputuser.next();
                if (jaka == mantap ){
                    System.out.println("apakah anda ingin lanjut  = " + jaka);
                    if (jaka != mantap) {
                        System.out.println("program telah selesai");
                    }
                    else{
                        System.out.println("selain dari itu " + jaka + " kamu salah input ");
                    }
                }break;
            } else if (nama == 3) {
                System.out.print("masukkan alas = ");
                alas = Inputuser.nextInt();
                System.out.print("masukkan tinggi = ");
                tinggi = Inputuser.nextInt();
                hasil = (alas * tinggi) / 2;
                System.out.println("hasil = " + hasil);
                System.out.println("apakah anda ingin lanjut = ");
                String jaka = Inputuser.next();
                if (jaka != "1" ) {
                    System.out.println("anda telah lanjut " );
                    continue;
                }
                else {
                    System.out.println("program telah selesai");
                }break;
            } else {
                System.out.println("anda memasukkan angka " + kami + " yang salah " + "anda telah keluar dari program");
            }break;
        }
    }
}


