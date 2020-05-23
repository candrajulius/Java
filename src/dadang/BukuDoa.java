package dadang;

import com.sama.Scanning;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class BukuDoa {
    public static void main(String[] args) throws IOException {
        Scanner Input = new Scanner(System.in);
        boolean running = true;
        System.out.println(" KUMPULAN DOA DOA ");
        System.out.print(" siapa nama anda   = ");
        String nama = Input.nextLine();
        String nama1 = nama.toLowerCase();
        System.out.println(" Hallo " + nama1);
        if (nama1.equals("candra julius sinaga")) {
            FileInputStream candra = new FileInputStream("hujan.txt");
            int masa = candra.read();
            while (masa != -1) {
                System.out.print((char) masa);
                masa = candra.read();
            }
        } else {
            String candra = "Selamat datang di program kami. Anda bermain di program kami \n Program dibuat oleh Candra Julius Sinaga ";
            System.out.print(candra);
        }
        System.out.println("\n");
        System.out.println("masukkan waktu anda sekarang = ");
        long waktu = Input.nextLong();
        if (waktu >= 6 && waktu <= 12){
            System.out.println(" waktu pukul  " + waktu);
            System.out.println(" selamat pagi ");
        }else if (waktu >= 12 && waktu <= 15) {
            System.out.println(" waktu pukul  " + waktu);
            System.out.println("selamat siang");
        }else if (waktu == 16 || waktu == 17 || waktu == 18){
                System.out.println(" waktu pukul = " + waktu);
                System.out.println("selamat sore");

        }else if (waktu >= 18 && waktu <= 24){
            System.out.println(" waktu pukul  " + waktu);
            System.out.println(" selamat malam ");
        }else if (waktu >= 0 && waktu <=6){            System.out.println(" waktu pukul  " + waktu);
            System.out.println("selamat malam kali ");
        }
            System.out.println("\n");
        while (running) {
            System.out.println("===== Daftar Kumpulan Doa Kami =====  ");
            for (int i = 0; i < 10; i++) {
                if (i == 1) {
                    System.out.println("anda memilih " + i + " Doa MALAIKAT TUHAN ");
                } else if (i == 2) {
                    System.out.println("anda memilih " + i + " Doa NOVENA SALAM MARIA ");
                } else if (i == 3) {
                    System.out.println("anda memilih " + i + " Doa BAPAK KAMI ");
                } else if (i == 4) {
                    System.out.println("anda memilih " + i + " Doa BAPAK KEMULIAAN ");
                } else if (i == 5) {
                    System.out.println("anda memilih " + i + " Doa SALAM MARIA ");
                } else if (i == 6) {
                    System.out.println("anda memilih " + i + " Doa TOBAT ");
                } else if (i == 7) {
                    System.out.println("anda memilih " + i + " Doa AKU PERCAYA ");
                } else if (i == 8) {
                    System.out.println("anda memilih " + i + " Doa Doa NOVENA ROH KUDUS ");
                } else if (i == 9) {
                    System.out.println("anda memilih " + i + " Doa NOVENA BUNDA PENOLONG ABADI ");
                }

            }


            System.out.println("\n");
            System.out.print("masukkan pilhan anda = ");
            int pil = Input.nextInt();
            if (pil == 1) {
                System.out.println("\n");
                FileInputStream file = new FileInputStream("DoaSalamMaria");
                int jumlah = file.read();
                while (jumlah != -1) {
                    System.out.print((char) jumlah);
                    jumlah = file.read();
                }
            } else if (pil == 2) {
                System.out.println("\n");
                FileInputStream file1 = new FileInputStream("DoaNovenaSalamMaria");
                int jumlah1 = file1.read();
                while (jumlah1 != -1) {
                    System.out.print((char) jumlah1);
                    jumlah1 = file1.read();
                }
            } else if (pil == 3) {
                System.out.println("\n");
                FileInputStream file2 = new FileInputStream("DoaBapakKami");
                int jumlah2 = file2.read();
                while (jumlah2 != -1) {
                    System.out.print((char) jumlah2);
                    jumlah2 = file2.read();
                }
            } else if (pil == 4) {
                System.out.println("\n");
                FileInputStream file3 = new FileInputStream("bahagia.txt");
                int jumlah3 = file3.read();
                while (jumlah3 != -1) {
                    System.out.print((char) jumlah3);
                    jumlah3 = file3.read();
                }
            } else if (pil == 5) {
                System.out.println("\n");
                FileInputStream file4 = new FileInputStream("SalamMaria");
                int jumlah4 = file4.read();
                while (jumlah4 != -1) {
                    System.out.print((char) jumlah4);
                    jumlah4 = file4.read();
                }
            } else if (pil == 6) {
                System.out.println("\n");
                FileInputStream file4 = new FileInputStream("DoaTobat");
                int jumlah4 = file4.read();
                while (jumlah4 != -1) {
                    System.out.print((char) jumlah4);
                    jumlah4 = file4.read();

                }
            } else if (pil == 7) {
                System.out.println("\n");
                FileInputStream file4 = new FileInputStream("DoaAkuPercaya");
                int jumlah4 = file4.read();
                while (jumlah4 != -1) {
                    System.out.print((char) jumlah4);
                    jumlah4 = file4.read();

                }
            } else if (pil == 8) {
                System.out.println("\n");
                FileInputStream file4 = new FileInputStream("DoaNovenaRohKudus");
                int jumlah4 = file4.read();
                while (jumlah4 != -1) {
                    System.out.print((char) jumlah4);
                    jumlah4 = file4.read();
                }
            } else {
                System.err.println(" Anda salah INPUT ");
                System.err.println(" Dan Anda Keluar Dari Program ");
            }
            running = manusia("\nApakah Anda Ingin Melanjutkan Doa ? (ya/tidak)");
        }
        System.out.println("\n");
            if (nama.equals("candra julius sinaga")) {
                FileInputStream candra = new FileInputStream("bandit.txt");
                int candra2 = candra.read();
                while (candra2 != -1){
                    System.out.print((char)candra2);
                    candra2 = candra.read();
                }
                }else {
                FileInputStream candra3 = new FileInputStream("input.txt");
                    int candra1 = candra3.read();
                while (candra1 != -1){
                        System.out.print((char)candra1);
                        candra1 = candra3.read();
                    }
                }
            }
            private static boolean manusia(String message)throws IOException{
                Scanner scan = new Scanner(System.in);
                System.out.println("\n" + message);
                String lanjut = scan.nextLine();
                while (!lanjut.equalsIgnoreCase("ya") && !lanjut.equalsIgnoreCase("tidak")){
                    System.err.println("Anda salah memasukkan Input ");
                    System.err.println(" Input yang anda masukkan adalah " + lanjut);
                    System.out.println("\n" + message);
                    lanjut = scan.nextLine();
                }
                return lanjut.equalsIgnoreCase("ya");
            }
            private static void julius ()throws IOException{
        try{
            if (System.getProperty("os name").contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            }else {
                System.out.println("\033\143");
            }
        }catch (Exception ex){
            System.err.println(" Tidak Bisa Menghapus Layar");
        }
            }
        }

