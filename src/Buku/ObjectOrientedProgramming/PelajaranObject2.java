package Buku.ObjectOrientedProgramming;

import java.util.Scanner;

class julius {
    String nama;
    String tempat;
    int umur;
    julius(String candra, String tempat , int umur){
        this.nama = candra;
        this.tempat = tempat;
        this.umur = umur;
    }
    // method tanpa parameter dan return;
    void candra() {
        System.out.println("nama : " + this.nama + " tempat " + this.tempat + "umur " + this.umur);
    }
    // method dengan parameter tanpa return;
    void bagusan (String Inputnama ){
        this.nama = Inputnama;
    }
    // method dengan return tanpa parameter;
    String biasa(){
        String masukan = "Julius Sinaga";
        this.nama = masukan;
        System.out.println(this.nama);
        return this.nama;
    }
    // method dengan return dan dengan parameter
    boolean mantap (String mesage, String tempat) {
        Scanner system = new Scanner(System.in);
        System.out.println("\n" + mesage);
        String candra = system.nextLine();
        this.tempat = tempat;
        return candra.equalsIgnoreCase("ya");
    }
}
public class PelajaranObject2 {
    public static void main(String[] args) {
        julius Julius = new julius("Siapa yang pantas yang bisa aku andalkan bukan rayuan bukan pujian ", "Jl Garuda " , 20);
        Julius.candra();
        Julius.bagusan("Candra Julius Sinaga");
        Julius.candra();
        Julius.biasa();
        Julius.mantap("Apakah Anda Ingin Mengubah nama","Candra Julius Sinaga");
        Julius.candra();
    }
}
