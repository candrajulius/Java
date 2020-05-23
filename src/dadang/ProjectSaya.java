package dadang;
import com.sama.InputScanner;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Scanner;
public class ProjectSaya {
    public static void main(String[] args) {
        Scanner Inputuser = new Scanner(System.in);
        String ya = "ya";
        String tidak = "tidak";
        String persegi = "persegi panjang";
        System.out.println("Siapa nama anda ? ");
        String nama = Inputuser.next();
        System.out.println("selamat datang di program kami " + nama);
        System.out.println("menu utama dari kami ");
        cndra(persegi);
        gajah(persegi);
        semut(persegi);
        System.out.println("\n");
        try {
            FileInputStream uang = new FileInputStream("candra.txt");
            FileOutputStream jajan = new FileOutputStream("hujan.txt");
            int data = uang.read();
            while ( data != -1){
                System.out.print((char)data);
                jajan.write(data);
                data = uang.read();
            }
        }catch (Exception e){
            System.out.println("selamat anda memasukki program saya");
        }
        }
        private static void cndra (String jumlah){
            for ( int i = 0; i < 4; i++) {
                if (i == 1) {
                    System.out.println("pilihan ke " + i + " persegi panjang");
                } else if (i == 2) {
                    System.out.println("pilihan ke " + i + " segitiga ");
                } else if (i == 3) {
                    System.out.println("pilihan ke " + i + " bujur sangkar ");
                }
            }

        }
        private static void gajah (String masak){
        Scanner Inputuser = new Scanner(System.in);
        String ya = "ya";
        String tidak = "tidak";
            System.out.println("apakah anda ingin lanjut ?");
            System.out.println("iya atau tidak");
            String user = Inputuser.next();
            if (user.equals(ya)) {
                System.out.println("anda telah lanjut");
            } else if (user.equals(tidak)) {
                System.out.println("anda telah berhenti disini");
            } else {
                System.out.println("anda salah memasukkan input");
            }

        }
        private static void semut (String hajar){
            Scanner Inputuser = new Scanner(System.in);
            System.out.println("silahkan anda pilih opsi : ");
            for (int i = 0; i < 4; i++){
                if (i == 1){
                    System.out.println("opsi ke " + i + " persegi panjang ");
                }else if ( i == 2){
                    System.out.println("opsi ke " + i + " Segitiga ");
                }else if (i == 3){
                    System.out.println("opsi ke " + i + " bujur sangkar ");
                }
            }
            int opsi = Inputuser.nextInt();
            while (opsi > 1 || opsi < 3) {
            if (opsi == 1){
                System.out.println("anda memilih persegi pannjang ");
                System.out.print("masukkan panjang : " );
                float panjang =  Inputuser.nextFloat();
                System.out.println("anda memasukkan angka " + panjang);
                System.out.print("masukkan lebar : ");
                float lebar = Inputuser.nextFloat();
                System.out.println("anda memasukkan angka " + lebar);
                float hasil = panjang * lebar;
                System.out.println("hasil dari " + panjang + " dan " + lebar + " = " + hasil);
                break;
                }else if ( opsi == 2 ){
                System.out.println("anda memilih segitiga ");
                System.out.print("masukkan alas : " );
                float alas =  Inputuser.nextFloat();
                System.out.println("anda memasukkan angka " + alas);
                System.out.print("masukkan tinggi : ");
                float tinggi = Inputuser.nextFloat();
                System.out.println("anda memasukkan angka " + tinggi);
                float hasil = (tinggi * alas) /2;
                System.out.println("hasil dari " + alas + " dan " + tinggi + " = " + hasil);
                break;
            }else if ( opsi == 3){
                System.out.println("anda memilih bujur sangkar ");
                System.out.print("masukkan sisi : " );
                float sisi =  Inputuser.nextFloat();
                System.out.println("anda memasukkan angka " + sisi);
                System.out.print("masukkan sisi : ");
                sisi = Inputuser.nextFloat();
                System.out.println("anda memasukkan angka " + sisi);
                float hasil = sisi * sisi;
                System.out.println("hasil dari " + sisi + " dan " + sisi + " = " + hasil);
                break;
            }
            }
        }
    }

