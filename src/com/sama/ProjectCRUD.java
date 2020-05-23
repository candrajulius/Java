package com.sama;

import com.sun.security.jgss.GSSUtil;
import com.sun.source.tree.TryTree;

import java.io.*;
import java.time.Year;
import java.util.*;

public class ProjectCRUD {
    public static void main(String[] args) throws IOException {
        Scanner system = new Scanner(System.in);
        FileReader file = new FileReader("percobaan.txt");
        BufferedReader file1 = new BufferedReader(file);
        String data = file1.readLine();
        boolean bangsat = true;
        while (bangsat) {
            clearScreen();
            System.out.println("========= Program Perpustakaan ======");
            System.out.println("\t  1. List Seluruh Buku ");
            System.out.println("\t  2. Cari Buku ");
            System.out.println("\t  3. Tambah Data Buku");
            System.out.println("\t  4. Ubah Data Buku");
            System.out.println("\t  5. Hapus Data Buku");
            System.out.println("\n");
            System.out.print("masukkan pilhan anda = ");
            String user = system.next();
            switch (user) {
                case "1":
                        System.out.println("===================");
                        System.out.println(" LIST SELURUH BUKU ");
                        System.out.println("===================");
                        if (data == null){
                            tambahData();
                            data = file1.readLine();
                        }else {
                            tampilkanData();
                        }
                    break;
                case "2":
                    System.out.println("===========");
                    System.out.println(" CARI BUKU ");
                    System.out.println("===========");
                    if (data == null){
                        System.out.println("Silahkan anda menambah data");
                        tambahData();
                        data =  file1.readLine();
                    }else {
                        cariData();
                    }
                    break;
                case "3":
                    System.out.println("==================");
                    System.out.println(" TAMBAH DATA BUKU ");
                    System.out.println("==================");
                    tambahData();
                    tampilkanData();
                    break;
                case "4":
                    System.out.println("================");
                    System.out.println(" UBAH DATA BUKU ");
                    System.out.println("================");
                    break;
                case "5" :
                    System.out.println("================");
                    System.out.println(" HAPUS DATA BUKU ");
                    System.out.println("================");
                    MenghapusData();
                    break;
                default:
                    System.err.println("Anda Salah Memasukkan Input \n Silahkan masukkan input (1-5)");
            }
            bangsat = mantap("Apakah anda ingin lanjut ? (ya/tidak) ");

        }
    }

    private static void tampilkanData() throws IOException {
        FileReader file;
        BufferedReader file1;
        try {
            file = new FileReader("percobaan.txt");
            file1 = new BufferedReader(file);
        } catch (Exception e) {
            System.out.println("Database buku tidak di temukan");
            System.out.println("Silahkan Tambah Data Buku Terlebih Dahulu");
            tambahData();
            return;
        }
        try {

            System.out.println("\n| No |\tTahun  |\tPenulis                |\tPenerbit                 |\tJudulBuku");
            System.out.println("-----------------------------------------------------------------------------------------");
            int noData = 0;
            String data = file1.readLine();
            while (data != null) {
                noData++;
                StringTokenizer stringTokenizer = new StringTokenizer(data, ",");
                stringTokenizer.nextToken();
                System.out.printf("| %2d ", noData);
                System.out.printf("|\t%4s     ", stringTokenizer.nextToken());
                System.out.printf("|\t%-20s    ", stringTokenizer.nextToken());
                System.out.printf("|\t%-20s     ", stringTokenizer.nextToken());
                System.out.printf("|\t%s     ", stringTokenizer.nextToken());
                System.out.println("\n");

                data = file1.readLine();
            }
            System.out.println("-----------------------------------------------------------------------------------------");
        }catch (Exception e) {
            System.err.print("Terjadi kesalahan didalam Database Anda");
            System.err.print("Mohon maaf atas kesalahan yang terjadi\n Silahkan Anda Menambah data Terlebih dahulu");
        }
    }

    private static void cariData() throws IOException {
        // Cek Database Ada atau Tidak
        boolean pertama = false;
        try {
            File file = new File("percobaan.txt");
        } catch (Exception e) {
            System.err.println("Silahkan Anda membuat database terlebih dahulu ");
        }
        // mengambil keyword dari user
        Scanner Inputuser = new Scanner(System.in);
        System.out.print("masukkan keyword(penulis,judul,tahun,penerbit)untuk mencari buku : ");
        String data = Inputuser.nextLine();
        String[] data1 = data.split("\\s+");
        cekDatabase(data1, true);
    }


    private static void clearScreen() throws IOException {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.println("\033\143");
            }
        } catch (Exception ex) {
            System.err.println("Tidak Bisa ClearScreen");
        }
    }

    private static boolean mantap(String message) throws IOException {
        Scanner mantap = new Scanner(System.in);
        System.out.print("\n" + message);
        String lanjut = mantap.nextLine();
        while (!lanjut.equalsIgnoreCase("ya") && (!lanjut.equalsIgnoreCase("tidak"))) {
            System.err.println("anda Salah memasukkan Input " + lanjut + "\n Coba Lagi ");
            System.out.println("\n" + message);
            lanjut = mantap.nextLine();
        }
        if (lanjut.equalsIgnoreCase("tidak")) {
            System.err.println("Anda keluar dari program \n Terimakasih ");
        }
        return lanjut.equalsIgnoreCase("ya");
    }

    private static boolean cekDatabase(String[] key , boolean isDisplay) throws IOException{
        String data;
        boolean pertama = false;
        int jumlahdata = 0;
        try {
            FileReader file = new FileReader("percobaan.txt");
            BufferedReader file1 = new BufferedReader(file);
            data = file1.readLine();
            if (isDisplay) {
                System.out.println("\n| No |\tTahun  |\tPenulis                |\tPenerbit                 |\tJudulBuku");
                System.out.println("-----------------------------------------------------------------------------------------");
            }
            while (data != null){

                pertama = true;
                for (String cari : key ){
                    pertama = data.toLowerCase().contains(cari.toLowerCase());
                }
                if (pertama) {
                    if (isDisplay) {
                        jumlahdata++;
                        StringTokenizer stringTokenizer = new StringTokenizer(data, ",");
                        stringTokenizer.nextToken();
                        System.out.printf("| %2d ", jumlahdata);
                        System.out.printf("|\t%4s     ", stringTokenizer.nextToken());
                        System.out.printf("|\t%-20s    ", stringTokenizer.nextToken());
                        System.out.printf("|\t%-20s     ", stringTokenizer.nextToken());
                        System.out.printf("|\t%s     ", stringTokenizer.nextToken());
                        System.out.println("\n");
                    } else {
                        break;
                    }
                }
                data = file1.readLine();
            }
            if (isDisplay) {
                System.out.println("-----------------------------------------------------------------------------------------");
            }
        }catch (Exception e){
            System.err.println("Data anda tidak di temukan \n Silahkan anda menambah data");
        }
        return pertama;
    }

    private static void tambahData() throws IOException {
        FileWriter file = new FileWriter("percobaan.txt",true);
        BufferedWriter file1 = new BufferedWriter(file);
        Scanner Inputuser = new Scanner(System.in);
        System.out.println("masukkan penulis        : ");
        String penulis = Inputuser.nextLine();
        System.out.println("masukkan penerbit       : ");
        String penerbit = Inputuser.nextLine();
        System.out.println("masukkan judul buku     : ");
        String judul = Inputuser.nextLine();
        System.out.println("masukkan  tahun terbit  : ");
        String tahun = tahun();
        String[] data = {tahun+","+penulis+","+penerbit+","+judul};
        System.out.println(Arrays.toString(data));
         boolean pertama = cekDatabase(data,false);
        if (!pertama){
            long mama = 0;
            System.out.println(mama);
            mama = sana(penulis,tahun)+ 1;
            String  penulisSpasi = penulis.replaceAll("\\s","");
            String primarykey = penulisSpasi+"_"+tahun+"_"+mama;
            System.out.println("Data yang anda masukkan adalah : ");
            System.out.println("==================================");
            System.out.println("kata kunci    : " + primarykey);
            System.out.println("penulis       : " + penulis);
            System.out.println("penerbit      : " + penerbit);
            System.out.println("judul buku    : " + judul);
            System.out.println("tahun terbit  : " + tahun);
            System.out.println("===================================");
           boolean sama =  mantap("Apakah anda ingin menambah data tersebut : (ya/tidak) ");
           if  (sama) {
               file1.write(primarykey + "," + tahun + "," + penulis + "," + penerbit + "," + judul);
               file1.newLine();
               file1.flush();
           }
        } else {
            System.out.println("Data yang anda masukkan sudah ada di database ");
            cekDatabase(data,true);
            boolean bingung = mantap("Apakah anda ingin menambah data yang sudah ada ? (ya/tidak) ");
            if (bingung){
                long noData = 0;
                 noData = sana(penulis,tahun)+ 1;
                String  penulisSpasi = penulis.replaceAll("\\s","");
                String primarykey = penulisSpasi+"_"+tahun+"_"+noData;
                System.out.println("Data yang anda masukkan adalah : ");
                System.out.println("==================================");
                System.out.println("kata kunci    : " + primarykey);
                System.out.println("penulis       : " + penulis);
                System.out.println("penerbit      : " + penerbit);
                System.out.println("judul buku    : " + judul);
                System.out.println("tahun terbit  : " + tahun);
                System.out.println("===================================");
                file1.write(primarykey + "," + tahun + "," + penulis + "," + penerbit + "," + judul);
                file1.newLine();
                file1.flush();
            }
        }
    }
    private static long sana (String penulis, String tahun)throws IOException{
        FileReader file = new FileReader("percobaan.txt");
        BufferedReader file1 = new BufferedReader(file);
        long entry = 0;
        String data = file1.readLine();
        Scanner data1;
        String primayKey;

        while (data != null){
            data1 = new Scanner(data);
            data1.useDelimiter(",");
            primayKey =  data1.next();
            data1 = new Scanner(primayKey);
            data1.useDelimiter("_");
            String penulisSpasi = penulis.replaceAll("\\s+","");
            if  (penulisSpasi.equalsIgnoreCase(data1.next())&& tahun.equalsIgnoreCase(data1.next())){
                entry = data1.nextInt();
            }
            data = file1.readLine();
        }
        return entry;
    }
    private static String tahun() throws IOException {
        boolean tahunValid = false;
        Scanner Inputuser = new Scanner(System.in);
        String tahun = Inputuser.nextLine();
        while (!tahunValid) {
            try {
                Year.parse(tahun);
                tahunValid = true;

            } catch (Exception e) {
                System.err.println("format tahun yang anda masukkan salah \n Silahkan masukkan format '(YYYY)'");
                System.out.println("masukkan tahun lagi ");
                tahun = Inputuser.nextLine();
            }
        }
        return tahun;
    }
    private static void MenghapusData() throws IOException {
        // Database original
        File file = new File("percobaan.txt");
        FileReader file1 = new FileReader(file);
        BufferedReader file2 = new BufferedReader(file1);

        // Database Sementara
        File database = new File("mantap.txt");
        FileWriter fileWriter = new FileWriter(database);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        // menampilkan data dan menambah data
        siapa();
        // kita ambil user input untuk mendelete sementara
        Scanner Inputuser = new Scanner(System.in);
        try {

            System.out.print("masukkan nomor buku yang mau di hapus ");
            int num = Inputuser.nextInt();
            // Loopimg untuk membaca tiap data baris dan skip data yang akan di delete
            int nums = 0;
            boolean hapus = false;
            String data = file2.readLine();
            while (data != null) {
                nums++;
                StringTokenizer rumah = new StringTokenizer(data, ",");
                if (num == nums) {
                    System.out.println("\nData yang akan anda hapus adalah : ");
                    System.out.println("=====================================");
                    System.out.println("Refrensi    : " + rumah.nextToken());
                    System.out.println("Tahun       : " + rumah.nextToken());
                    System.out.println("Penulis     : " + rumah.nextToken());
                    System.out.println("Penerbit    : " + rumah.nextToken());
                    System.out.println("Judul       : " + rumah.nextToken());
                    hapus = mantap("Apakah Anda Yakin Menghapus data Terebsebut ");
                    if (hapus) {
                        System.out.println("Data Anda Sudah Di hapus");
                        bufferedWriter.write(data);
                        bufferedWriter.newLine();
                        //skip pindahkan data dari original kesementara
                    }
                }
                data = file2.readLine();
            }
            bufferedWriter.flush();
            file.delete();
            database.renameTo(file);
        } catch (Exception e) {
            System.err.println("Silahkan Anda Mengulang Kembali karena terjadi Error");

        }
    }
    private static boolean siapa() throws IOException {
        boolean mana = false;
        File file = new File("percobaan.txt");
        FileReader file1 = new FileReader(file);
        BufferedReader file2 = new BufferedReader(file1);
        // Tampilkan data
        System.out.println("List Buku");
        String siapa = file2.readLine();
        if (siapa == null){
            System.out.println("Silahkan anda menambah data karena tidak ada data");
            tambahData();
            mana = mantap("Apakah anda ingin lanjut ? (ya/tidak) ");
            if (mana){
                tampilkanData();
            }
        }else {
            tampilkanData();
        }
        return mana;
    }
}


