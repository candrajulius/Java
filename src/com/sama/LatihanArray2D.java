package com.sama;
import java.util.Arrays;
public class LatihanArray2D {
    public static void main(String[] args) {
        int[][] matrikx_a = {
                {1, 2, 3,},
                {4, 5, 6,},
                {7, 8, 9,},
        };
        int[][] matrikx_b = {
                {11, 12, 13,},
                {14, 15, 16,},
                {17, 18, 19,},
        };
        dataArray(matrikx_a);
        dataArray(matrikx_b);
        int[][] hasil = tambah(matrikx_a, matrikx_b);
        dataArray(hasil);

        int[][] matrikx_c = {
                {1, 2,},
                {4, 5,},
        };
        int[][] matrikx_d = {
                {11, 12,},
                {14, 15,},
        };

        System.out.println("perkalian matrixs");
        int baris_c = matrikx_c.length;
        int kolom_c = matrikx_c[0].length;
        int baris_d = matrikx_d.length;
        int kolom_d = matrikx_d[0].length;
        int buffer;
        int[][] hasilKali = new int[baris_c][kolom_d];

        for (int i = 0; i < baris_c; i++) {
            for (int k = 0; k < kolom_d; k++) {
                buffer = 0;
                for (int j = 0; j < kolom_c; j++) {
                    buffer += matrikx_c[i][j] * matrikx_d[j][k];
                }
                hasilKali[i][k] = buffer;
            }
        }
        dataArray(hasilKali);

    }

    private static int[][] tambah(int[][] matriks_1, int[][] matriks_2){
        int baris_a = matriks_1.length;
        int kolom_a = matriks_1.length;

        int baris_b = matriks_1.length;
        int kolom_b = matriks_2[0].length;
        int[][] hasil = new int[baris_a][kolom_a];
        if ( baris_a == baris_b && kolom_a == kolom_b) {
            for (int i = 0; i < baris_a; i++) {
                for (int j = 0; j < kolom_a; j++) {
                    hasil[i][j] = matriks_1[i][j] + matriks_2[i][j];
                }
            }
        }else{
            System.out.println("jumlah baris dan kolom tidak sama");
        }
        return hasil;
    }

    private static void dataArray( int [][] dataArray) {
        int baris = dataArray.length;
        int kolom = dataArray[0].length;

        for (int i = 0; i < baris; i++) {
            System.out.print("[");
            for (int j = 0; j < kolom; j++) {
                System.out.print(dataArray[i][j]);
                if (j < (kolom - 1)) {
                    System.out.print(",");
                } else {
                    System.out.print("]");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}


