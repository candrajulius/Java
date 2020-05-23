package Buku.Larik;

import javax.management.StandardEmitterMBean;

class bunga{
    public static long medanperang(String st) {
        // cek kalau string berupa string kosong
        if (st.length() == 0) {
            // Nilai yang menyatakan ada kesalahan
            return -32767;
        }
        // validisasi karakter
        boolean ok = true;
        if (!(st.charAt(0) == '+' || st.charAt(0) == '-') || (st.charAt(0) >= '0' && st.charAt(0) <= '9')) {
            ok = false;
        } else {
            for (int i = 1; i < st.length(); i++) {
                if (!(st.charAt(i) >= '0') && st.charAt(i) <= '9') {
                    ok = false;
                    break;
                }
            }
        }
        if (!ok) {
            return -32767;
        }
        //konversi string ke angka
        long bilangan = 0;
        int pengali = 1;
        int digit = 0;
        for (int i = st.length() - 1; i >= 0; i--) {
            switch (st.charAt(i)) {
                case '0':
                    digit = 0;
                    break;
                case '1':
                    digit = 1;
                    break;
                case '2':
                    digit = 2;
                    break;
                case '3':
                    digit = 3;
                    break;
                case '4':
                    digit = 4;
                    break;
                case '5':
                    digit = 5;
                    break;
                case '6':
                    digit = 6;
                    break;
                case '7':
                    digit = 7;
                    break;
                case '8':
                    digit = 8;
                    break;
                case '-':
                    digit = -1;
                    break;
                case '+':
                    digit = 0;
                    break;
            }
            if (digit != -1) {
                bilangan = bilangan + digit * pengali;
                pengali = pengali * 10;
            } else {
                bilangan = -bilangan;
            }
        }
        return bilangan;
    }
}

class candra {
    public static String bangsat (String st, int n){
        int panjang = st.length();
        if (panjang == 0){
            return "";
        }
        String tempt = "";
        for (int i = 0; i < n; i++){
            for (int j = 0; j < panjang; j++){
                tempt = tempt + st.charAt(j);
            }
        }
        return tempt;
    }
}
class julius {
    public static boolean bangsat (int kata){
        if ( kata % 2 == 0){
            return true;
        }else {
            return false;
        }
    }
}
class manaKau {
    public static double manusia(double x, double y){
        double min;
        if ( x > y){
            min = x;
        }else {
            min =  y;
        }
        return min;
    }
}
class manusia {
    public static double manusia1 (double pintar , double bodoh ){
        double max;
        if (pintar > bodoh){
             max = pintar;
        }else {
             max = bodoh;
        }
        return max;
    }
}
class biasaAja {
    public static String biasa(String mantap, int n) {
        int panjang = mantap.length();
        if (n > panjang) {
            n = panjang;
        }
        String tempt = "";
        for (int indeks = panjang - n; indeks < panjang; indeks++) {
            tempt = tempt + mantap.charAt(indeks);
        }
        return tempt;
    }
}


public class Latihan {
    public static void main(String[] args) {
        System.out.println(candra.bangsat(" kau \n  memang bangsat ",10));
        System.out.println(candra.bangsat("siapa \n bilang",2));
        System.out.println("\n");
        System.out.println(julius.bangsat(80)? "genap" : "ganjil");// memakai unary  operator
        System.out.println(julius.bangsat(100)? "genap " : "ganjil"); // memakai unary operator
        System.out.println("\n");
        double manaDia = manaKau.manusia(20,10);
        System.out.println("pencarian data yang terecil dari x dan y adalah " + manaDia);
        System.out.println("\n");
        double candra = manusia.manusia1(10,100);
        System.out.println("perbandingan data terbesar dari a dan b adalah " + candra);
        String sama = biasaAja.biasa("manabisa gitu",5);
        System.out.println(sama);
    }
}
