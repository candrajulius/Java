package Buku.Larik;

import java.util.Arrays;
import java.util.Scanner;

public class Larik {
    public static void main(String[] args) {
        int[] jumlahHari = {31,2,45,22,313,1313,1313,2244,24,22,15};
        jumlahHari [3] = 4;
        jumlahHari [10] = 12;
        System.out.println(Arrays.toString(jumlahHari));

        char [] tumbang = new char[6];
        tumbang [0] = 'U';
        tumbang [1] = 'P';
        tumbang [2] = 'D';
        tumbang [3] = 'E';
        tumbang [4] = 'R';
        tumbang [5] = 'Y';

        for ( int i = 0; i < 6; i++){
            System.out.print(tumbang[i]);
        }
        char [] nanti = {'S', 'D' , 'U', 'Y' , 'H' , 'J'};
        for (int i = 0; i < nanti.length; i++){
            System.out.println(nanti[i]);
        }
        int [] data = {10,4,56,2,8,9,1};
        int terbesar;
        terbesar = data[5];
        for (int i = 1; i < 6 ; i++) {
            if (data[i] > terbesar)
                terbesar = data[i];
            System.out.println("terbesar = " + terbesar);
        }
        double [] ayam = new double[10];
        int i,jumData;
        String str;
        char jawaban;
        Scanner scan = new Scanner(System.in);
        jumData = 0;
        for (i = 0; i < ayam.length - 1; i++){
            System.out.println("Masukkan sebarang bilangan = ");
            ayam[i] = scan.nextDouble();
            scan.nextLine();
            if (i < ayam.length - 2 ){
                System.out.println("Memasukkan lagi (Y/T) ? ");
                str = scan.nextLine();
                jawaban = str.charAt(0);
                if ( jawaban == 'T' || jawaban == 't'){
                    jumData = i + 1;
                    break;
                }
            }
        }
        for ( i = 0; i < jumData; i++){
            System.out.println(ayam[i]);
        }
    }
}
