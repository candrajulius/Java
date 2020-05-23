package com.sama;
import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args){
        Scanner Inputuser = new Scanner(System.in);
        System.out.print("masukkan jumlah data :  ");
        int jlh_data = Inputuser.nextInt();

        int[] data = new int [jlh_data];
        System.out.print("\n");
        for (int x = 0; x < jlh_data; x++) {
            System.out.println("input nilai data ke- " + (x + 1) + " : ");
            data[x] = Inputuser.nextInt();
        }
            System.out.print("\n");
            System.out.println("Data Sebelum di Sorting : ");
            for (int x = 0 ; x < jlh_data; x++ ){
                System.out.print(data[x]+ " ");
            }
        System.out.println("\n proses selection sort");
            for (int x = 0; x < jlh_data-1; x++) {
                System.out.println("iterasi ke- " + (x + 1) + " : ");
                for (int y = 0; y < jlh_data; y++) {
                    System.out.print(data[y] + " ");
                    System.out.print(" apakah data " + data[x] + " sudah benar pada urutannya ");
                }
                boolean tukar = false;
                int index = 0;
                int min = data[x];
                String pesan = " Tidak ada pertukaran";
                for (int y = x + 1; y < jlh_data; y++) {
                    if (min > data[y]) {
                        tukar = true;
                        index = y;
                        min = data[y];
                    }
                }
                if (tukar == false) {
                    pesan = " data " + data[x] + " ditukar dengan Data " + data[index];
                    int temp = data[x];
                    data[x] = data[index];
                    data[index] = temp;
                }
                for (int y = 0; y < jlh_data; y++) {
                    System.out.println(data[y] + " ");
                    System.out.println(pesan + " \n ");
                }
            }
                    System.out.print("Data setelah di sorting : ");
                    for (int x = 0; x < jlh_data; x++){
                        System.out.println(data[x]+ " ");
                    }
                }
            }


