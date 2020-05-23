package Buku;

import java.util.Scanner;

class bilangan {
    public static int terkecil(int []x){
        int jumlah = x.length;
        int min;
        min = x[0];
        for (int i = 1; i < jumlah; i++){
            if (x[i] < min){
                min = x[i];
                System.out.println(min);
            }
        }
        return min;
    }
    public static int Genap(int [] y){
        int jumlah = y.length;
        int genap = y[0];
        for (int i = 0; i < jumlah; i++){
            if (y[i] % 2 == 0){
                genap = y[i];
                System.out.println("Bilangan genap adalah = " + genap);
            }
        }
        return genap;
    }

    public  static  int Ganjil(int[] x){
        int ganjil = x[0];
       int jumlah = x.length;
        for (int i = 0; i < jumlah; i++){
            if(x[i] % 2 == 1){
                ganjil = x[i];
                System.out.println("Bilangan ganjil adalah " + ganjil);
            }
        }
        return ganjil;
    }
    public static int max(int []x){
        int jumlah = x.length;
        int max = x[0];
        for (int i = 0; i < jumlah; i++){
            if (x[i] > max){
                max = x[i];
                System.out.println("nilai max adalah = " + max);
            }
        }
        return max;
    }
    public static void Perkalian (int []x, int [] y, int [] c){

    }
}
class setring{
    public static String kanan(String kata, int jumlahKataYangMauDitampilkan){
        int panjang = kata.length();
        if (jumlahKataYangMauDitampilkan > panjang){
            jumlahKataYangMauDitampilkan = panjang;
        }
        String tempt = "";
        for (int indeks = panjang - jumlahKataYangMauDitampilkan; indeks < panjang; indeks++){
            tempt = tempt + kata.charAt(indeks);
        }
        System.out.println(tempt);
        return tempt;
    }
    public static String kiri ( String kata, int JumlahKataYangMauDitampilkan){
        int PanjangKata = kata.length();
        if (JumlahKataYangMauDitampilkan < PanjangKata){
           PanjangKata = JumlahKataYangMauDitampilkan;
        }
        String tempt = "";
        for (int indeks = 0; indeks < JumlahKataYangMauDitampilkan; indeks++){
            tempt = tempt + kata.charAt(indeks);
        }
        System.out.println(tempt);
        return tempt;
    }
    public static String Ulang(String kata, int jumlah){
        int panjang = kata.length();
        String tempt ="";
        if (panjang == 0){
            return tempt;
        }
        for (int i = 0; i < jumlah; i++){
            for (int j = 0; j < panjang; j++){
                tempt = tempt + kata.charAt(j);
            }
        }
        System.out.println(tempt);
        return tempt;
    }
    public static String formatRibuan(String st ){
        int panjang = st.length();
        if (panjang == 0){
            return "";
        }
        int jumlahtitik = panjang/3;
        if (jumlahtitik == 0){
            return st;
        }
        int jumlahKaraker = panjang + jumlahtitik;
        int posisiTempt = jumlahKaraker - 1;
        String strtemot = "";
        while (panjang > 3 ){
            int posisiSt = panjang - 1;
            for (int i = posisiSt; i > posisiSt -3; i--){
                strtemot = strtemot + st.charAt(i);
                posisiTempt = posisiTempt - 1;
            }
            strtemot = strtemot + '.';
            posisiTempt--;
            panjang = panjang - 3;
        }
        if (panjang > 0){
            for (int i = 0; i < panjang; i++){
                strtemot = strtemot + st.charAt(i);
            }
            System.out.println(strtemot);
        }
        return strtemot;
    }
}
class rekursif{
    public static long faktorial (int n){
        if  ((n == 0) || (n == 1)){
            return 1;
        }else {
            return n * faktorial(n-1);
        }
    }
    public static long fib(int n){
        if (n == 0){
            return 0;
        }else {
            if (n == 1){
                return 1;
            }else {
                return fib(n-1) + fib(n-2);
            }
        }
    }
    public static long perpangkatan(int y , int n ){
        if ((n == 0 )|| (n ==1)){
            return y;
        }else {
            return y * perpangkatan(y,n-1);
        }
    }
    public static void balik ( long bil ){
        long digit;
        System.out.println(bil % 10);
        digit = bil % 10;
        if (digit != 0 ){
            balik(digit);
        }
    }
}
class mencari{
    public static int musuh( int [] data, int n, int u){
        if (u > n) {
            u = n;
        }else {
            if (u == 1){
                return data[0];
            }else {
                if (u > 1){
                    if (data [u-1] > musuh(data,n,u))
                        return data[u-1];
                }else {
                    return musuh(data,n,u);

                    }
                }
            }
        if (u < 1){
            return -3821;
        }
        return -323232;
        }
    }





public class Pendahuluan {
    public static void main(String[] args) {
        int [] data ={12,34,5,2,12,123,44,100};
        String candra ="Candra Julius Sinaga";
        boolean bangsat = true;
        int n;
        long hasil;
        long mantap;
        while (bangsat) {
            System.out.println(mencari.musuh(data,8,4));
        Scanner system = new Scanner(System.in);
        System.out.println(" masukkan angka untuk di pangkati ");
        int y = system.nextInt();
        System.out.println("masukkan angka yang mau di pangkati " );
        n = system.nextInt();
        mantap = rekursif.perpangkatan(y,n);
        hasil = rekursif.fib(n);
        System.out.println("hasil = " + rekursif.faktorial(n));
        System.out.println("hasil = " + hasil );
            System.out.println( y + " pangkat " + n + " adalah = " + mantap);
            rekursif.balik(3000);
            bilangan.terkecil(data);
            bilangan.Genap(data);
            bilangan.max(data);
            bilangan.Ganjil(data);
            setring.kanan(candra, 100);
            try {
                String gaul = setring.kiri("Siapa yang bilang ada disana dia ", 5);
                setring.Ulang("julius ",10);
                setring.formatRibuan("0002000000000009");
            } catch (Exception e) {
                System.err.println("Kata yang anda masukkan melebihi batas ");
                System.err.println(" Dan Terjadi ERROR ");
            }
            bangsat = lanjut("Apakah anda ingin lanjut ");

        }

    }
    private static boolean lanjut (String message ){
        boolean dan = false;
        Scanner system = new Scanner(System.in);
        System.out.println("\n" + message );
        String lanjut = system.nextLine();
        while (!lanjut.equalsIgnoreCase("ya")&& !lanjut.equalsIgnoreCase("tidak")){
            System.err.println("Anda salah Input. Silahkan masukkan input (ya/tidak) ");
            System.out.println("apakah anda ingin lanjut (ya/tidak) ");
            lanjut = system.nextLine();

        }
        if (lanjut.equalsIgnoreCase("ya")){
            System.out.println(" Anda benar ");
            return lanjut.equalsIgnoreCase("ya");
        }
        if (lanjut.equalsIgnoreCase("tidak")){
            System.err.println("Anda keluar dari Program");
        }

        return dan;
    }
}
