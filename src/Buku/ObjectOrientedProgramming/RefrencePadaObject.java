package Buku.ObjectOrientedProgramming;

import com.sama.InputScanner;
import com.sun.source.tree.LambdaExpressionTree;

import java.time.Year;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

//class Buku {
//    String judul;
//    String penulis;
//    String penerbit;
//    String tahun;
//    Buku(String judul, String penulis, String penerbit, String tahun){
//        this.judul = judul;
//        this.penulis = penulis;
//        this.penerbit = penerbit;
//        this.tahun = tahun;
//    }
//    void tampilkan(){
//        System.out.println("\njudul buku \t  : " + this.judul + " \tnama penulis : " + this.penulis + " \nnama penerbit : " + this.penerbit + " \ttahun : " + this.tahun);
//    }
//
//}
class  Buku {
    String judul;
    String penulis;
    String penerbit;
    Buku(String judul,String penulis,String penerbit){
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
    }
    void tampilkan(){
        System.out.println("Nama : " + this.judul + " penulis : " + this.penulis + "penerbit : " + this.penerbit);
    }
}




public class RefrencePadaObject {
    public static void main(String[] args) {
        Buku buku1 = new Buku("The Legend Of The King |","Candra Julius Sinaga |"," Gramedia");
        buku1.tampilkan();
        buku1.judul = "of the legendary | ";
        buku1.tampilkan();
        String address = Integer.toHexString(System.identityHashCode(buku1));
        System.out.println(address);
        System.out.println("\n");
        Buku buku2 = buku1;
        buku2.tampilkan();
        String address1 = Integer.toHexString(System.identityHashCode(buku2));
        System.out.println(address1);



//        System.out.println(" Pembuatan program Candra Julius Sinaga ");
//        Scanner system = new Scanner(System.in);
//        System.out.println("masukkan judul buku : ");
//        String judul = system.nextLine();
//        System.out.println("masukkan penulis : ");
//        String penulis = system.nextLine();
//        System.out.println("masukkan penerbit : ");
//        String penerbit = system.nextLine();
//        String tahun = candra();
//        Buku buku1 = new Buku(judul,penulis,penerbit,tahun);
//        buku1.tampilkan();

    }
    private static String  candra (){
        Scanner system = new Scanner(System.in);
        System.out.println("Silahkan anda memasukkan tahun ");
        String tahun = system.nextLine();
        boolean candra = false;
        while (!candra) {
            try {
                Year.parse(tahun);
                candra = true;
            } catch (Exception e) {
                System.err.println("Anda salah input ");
                System.out.println("masukkan tahun lagi : ");
                tahun = system.nextLine();
            }
        }
        return tahun;
    }
}
