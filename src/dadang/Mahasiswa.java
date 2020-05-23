package dadang;

import java.io.*;
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
// algoritma Program...
public class Mahasiswa {
    public static void main(String[] args) throws IOException {
        FileReader candra1 = new FileReader("siapa.txt");
        BufferedReader candra2 = new BufferedReader(candra1);
        String data1 = candra2.readLine();
        FileReader candra3 = new FileReader("nama.txt");
        BufferedReader candra4 = new BufferedReader(candra3);
        String data = candra4.readLine();
        boolean candra = true;
        while (candra) {
            Scanner Inputuser = new Scanner(System.in);
            System.out.println("=====Pendataan Mahasiswa======");
            System.out.println("1\tData Mahasiswa " + " " + "2\tBiografi Mahasiswa ");
            System.out.println("3\tMenambah Data Mahasiswa " + " " + "4\tMenambah Biografi Mahasiswa ");
            System.out.println("5\tMencari Data Mahasiswa  " + " " + "6\tMencari Data Bigorafi Mahasiswa");
            System.out.println("7\tMengubah Data Mahasiswa " + " " + "8\tMenghapus Data Mahasiswa ");
            System.out.println("\n");
            System.out.println("masukkan nama anda    : ");
            String nama = Inputuser.nextLine();
            if (nama.equalsIgnoreCase("Candra Julius Sinaga")) {
                System.out.println("masukkan pilihan anda : ");
                String pilihan = Inputuser.nextLine();
                if (pilihan.equalsIgnoreCase("1")) {
                    if (data1 == null) {
                        System.err.println("Data anda tidak di temukan silahkan anda menambah data ");
                        nambahMahasiswa();
                    }else {
                        kamu();
                    }
                } else if (pilihan.equalsIgnoreCase("2")) {
                    nama();
                    if (data == null) {
                        System.err.println("Data anda tidak di temukan silahkan anda menambah data ");
                        nambahBiografi();
                    }
                } else if (pilihan.equalsIgnoreCase("3")) {
                    nambahMahasiswa();
                } else if (pilihan.equalsIgnoreCase("4")) {
                    nambahBiografi();
                } else if (pilihan.equalsIgnoreCase("5")) {
                    diaMahasiswa();
                    if (data1 == null) {
                        nambahMahasiswa();
                    }
                } else if (pilihan.equalsIgnoreCase("6")) {
                    belakangBigorafi();
                    if (data == null) {
                        nambahBiografi();
                    }
                } else if (pilihan.equalsIgnoreCase("7")) {

                } else if (pilihan.equalsIgnoreCase("8")) {

                } else {
                    System.err.println("Anda Salah Memasukkan Input ");
                }


            } else if (!nama.equalsIgnoreCase("Candra Julius Sinaga")) {
                System.out.println("masukkan pilihan anda : ");
                String pilihan = Inputuser.nextLine();
                if (pilihan.equalsIgnoreCase("1")) {
                    if (data1 == null) {
                        System.err.println("Data anda tidak di temukan \n Admin belum menambahkan data");
                    }else {
                        kamu();
                    }
                } else if (pilihan.equalsIgnoreCase("2")) {
                    if (data == null) {
                        System.err.println("Data anda belum ada, Admin belum menambahkan data ");
                    } else {
                        nama();
                    }
                } else if (pilihan.equalsIgnoreCase("5")) {
                    if (data1 != null) {
                        diaMahasiswa();
                    } else {
                        System.err.println("Data Anda Belum Ada.. Admin belum menambah data anda ");
                    }
                } else if (pilihan.equalsIgnoreCase("6")) {
                    if (data != null) {
                        belakangBigorafi();
                    } else {
                        System.err.println("Data Anda Belum Ada.. Admin belum manambah data anda ");
                    }
                } else {
                    System.err.println("Anda salah input");
                }
            } else {
                System.err.println("Anda Salah Input \n (Silahkan anda masukkan input 1,2,4,5)");
            }
            candra = saya("Apakah Anda Ingin lanjut ");
        }
    }

    //algoritma membuat sebuah boolean dimana user dipaksa untuk menginput iya
    private static boolean saya(String message) {
        Scanner system = new Scanner(System.in);
        System.out.println("\n" + message);
        String lanjut = system.nextLine();
        while (!lanjut.equalsIgnoreCase("ya") && !lanjut.equalsIgnoreCase("tidak")) {
            System.err.println("Anda Salah Input, Silahkan Anda Input lagi ");
            System.out.println("Apakah Anda mau Input lagi?(ya/tidak)");
            lanjut = system.nextLine();
        }
        if (lanjut.equalsIgnoreCase("tidak")) {
            System.err.println("Anda Keluar Dari Program \n Terimakasih");
        }
        return lanjut.equalsIgnoreCase("ya");
    }

    // algoritma membuat data mahasiswa
    private static void kamu() throws IOException {
        try {
            System.out.println("==========================================================================================================================================================================");
            File scan = new File("siapa.txt");
            FileReader scan1 = new FileReader(scan);
            BufferedReader scan2 = new BufferedReader(scan1);
            String data = scan2.readLine();
            int no = 0;
            while (data != null) {
                no++;
                StringTokenizer st = new StringTokenizer(data, ",");
                System.out.print("No          : " + no + "\t | ");
                System.out.print("Nama        : " + st.nextToken() + "\t | ");
                System.out.print("NIM         : " + st.nextToken() + "\t | ");
                System.out.print("Fakultas    : " + st.nextToken() + "\t | ");
                System.out.print("Prodi       : " + st.nextToken() + "\t | ");
                System.out.print("Alamat      : " + st.nextToken() + "\t | ");
                System.out.println("\n");
                data = scan2.readLine();
            }
            System.out.println("==========================================================================================================================================================================");
        } catch (Exception e) {
            System.err.println("Data Anda Tidak Ada \n Silahkan Anda Menambah Data ");
        }
    }

    // algoritma mengecek data apakah data mahasiwa ada di system
    private static boolean aku(String[] siapa, boolean andra) throws IOException {
        boolean kedua = false;
        File candra = new File("siapa.txt");
        FileReader candra1 = new FileReader(candra);
        BufferedReader candra2 = new BufferedReader(candra1);
        String data = candra2.readLine();
        try {
            int no = 0;
            if (andra) {
                System.out.println("==========================================================================================================================================================================");
            }
            while (data != null) {
                kedua = true;
                for (String kamu : siapa) {
                    kedua = data.toLowerCase().contains(kamu.toLowerCase());
                }
                if (kedua) {
                    if (andra) {
                        no++;
                        StringTokenizer st = new StringTokenizer(data, ",");
                        System.out.print("No         : " + no + "\t | ");
                        System.out.print("NIM        : " + st.nextToken() + "\t | ");
                        System.out.print("Nama       : " + st.nextToken() + "\t | ");
                        System.out.print("Fakultas   : " + st.nextToken() + "\t | ");
                        System.out.print("Prodi      : " + st.nextToken() + "\t | ");
                        System.out.print("Alamat     : " + st.nextToken() + "\t | ");
                        System.out.println("\n");
                    }
                } else {
                    break;
                }
                data = candra2.readLine();
            }
            if (andra) {
                System.out.println("==========================================================================================================================================================================");
            }
        } catch (Exception e) {
            System.err.println("Data Tidak Ada Silahkan Anda Menambah Data Terlebih Dahulu");
        }
        return kedua;
    }

    // algoritma mencari data mahasiswa disystem
    private static void diaMahasiswa() throws IOException {
        try {
            File candra = new File("siapa.txt");
            FileReader candra1 = new FileReader(candra);
            BufferedReader candra2 = new BufferedReader(candra1);
        } catch (Exception e) {
            System.err.println(" Data Anda Kosong Dan Silahkan Anda Membuat Database Terlebih Dahulu ");
            System.err.println("Admin Belum Membuat Data Anda ");
        }
        Scanner Inputuser = new Scanner(System.in);
        System.out.println("Masukkan keyword (nama,nim,tempat tinggal,fakultas,prodi) untuk mencari data : ");
        String candra = Inputuser.nextLine();
        String[] data = candra.split("\\s+");
        aku(data,true);
    }

    //algoritma membuat data biografi mahasiswa
    private static void nama() throws IOException {
        try {
            File candra = new File("nama.txt");
            FileReader candra1 = new FileReader(candra);
            BufferedReader candra2 = new BufferedReader(candra1);
            String data1 = candra2.readLine();
            int No = 0;
            System.out.println("==========================================================================================================================================");
            while (data1 != null) {
                No++;
                StringTokenizer julius = new StringTokenizer(data1, ",");
                System.out.print("No                  : " + No + "\t | ");
                System.out.print("Nama                : " + julius.nextToken() + "\t | ");
                System.out.print("Tempat lahir        : " + julius.nextToken() + "\t | ");
                System.out.print("Tanggal Lahir       : " + julius.nextToken() + "\t | ");
                System.out.print("Tempat tinggal      : " + julius.nextToken() + "\t | ");
                System.out.print("Jurusan             : " + julius.nextToken() + "\t | ");
                System.out.print("Email               : " + julius.nextToken() + "\t | ");
                System.out.println("\n");
                data1 = candra2.readLine();
            }
            System.out.println("\n==========================================================================================================================================");
        } catch (Exception e) {
            System.err.println("Silahkan Anda Menambah Data Terlebih Dahulu \n ERROR ");
            System.err.println("Admin Anda belum Menambah Data ");
            nambahBiografi();
        }
    }

    // algoritma mengecek data biografi mahasiswa
    private static boolean depan(String[] kangen, boolean andra) throws IOException {
        boolean kamu = false;
        try {
            File candra = new File("nama.txt");
            FileReader candra1 = new FileReader(candra);
            BufferedReader candra2 = new BufferedReader(candra1);
            String data1 = candra2.readLine();
            int No = 0;
            if (andra) {
                System.out.println("==========================================================================================================================================");
            }
            while (data1 != null) {
                kamu = true;
                No++;
                for (String dia : kangen) {
                    kamu = data1.toLowerCase().contains(dia.toLowerCase());
                }
                if (kamu) {
                    if (andra) {
                        StringTokenizer julius = new StringTokenizer(data1, ",");
                        System.out.print("No               : " + No + "\t | ");
                        System.out.print("Nama             : " + julius.nextToken() + "\t | ");
                        System.out.print("Tempat           : " + julius.nextToken() + "\t | ");
                        System.out.print("Tanggal Lahir    : " + julius.nextToken() + "\t | ");
                        System.out.print("Alamat           : " + julius.nextToken() + "\t | ");
                        System.out.print("Jurusan          : " + julius.nextToken() + "\t | ");
                        System.out.print("Email            : " + julius.nextToken() + "\t | ");
                        System.out.println("\n");
                    } else {
                        break;
                    }
                }
                data1 = candra2.readLine();
            }
            if (andra) {
                System.out.println("\n==========================================================================================================================================");
            }
        } catch (Exception e) {
            System.err.println("Silahkan Anda Menambah Data Terlebih Dahulu \n ERROR ");
            System.err.println("Admin Anda belum Menambah Data ");
        }
        return kamu;
    }

    // algoritma  mencari data biografi mahasiswa
    private static void belakangBigorafi() throws IOException {
        try {
            File candra = new File("nama.txt");
        } catch (Exception e) {
            System.err.println("Data tidak di temukan. Terjadi Error \n Dan Admin Belum Membuat Data");
        }
        Scanner Inputuser = new Scanner(System.in);
        System.out.println("Silahkan Masukkan Keyword (nama,tanggal lahir,tempat,alamat,jurusan,email) Untuk Mencari Data : ");
        String system = Inputuser.nextLine();
        String[] dada = system.split("\\s+");
        depan(dada, true);
    }

    //algortima menambah data mahasiswa hanya admin yang boleh melakukan
    private static void nambahMahasiswa() throws IOException {
        Scanner system = new Scanner(System.in);
        try {
            FileWriter candra = new FileWriter("siapa.txt", true);
            BufferedWriter candra1 = new BufferedWriter(candra);
            System.out.println("Silahkan anda masukkan nama anda : ");
            String nama = system.nextLine();
            System.out.println("Silahkan anda masukkan Nim anda : ");
            String nim = system.nextLine();
            System.out.println("Silahkan anda masukkan Fakultas anda : ");
            String fakultas = system.nextLine();
            System.out.println("Silahkan anda masukkan Prodi anda : ");
            String prodi = system.nextLine();
            System.out.println("Silahkan anda masukkan tempat rumah anda ");
            String tempat = system.nextLine();
            String[] data = {nama + "," + nim + "," + fakultas + "," + prodi + "," + tempat};
            System.out.println(Arrays.toString(data));
            boolean kedua = aku(data, false);
            if (!kedua) {
                System.out.println("Data yang anda masukkan adalah : ");
                System.out.println("Nama anda         : " + nama);
                System.out.println("Nim anda          : " + nim);
                System.out.println("fakultas anda     : " + fakultas);
                System.out.println("prodi anda        : " + prodi);
                System.out.println("tempat tinggal    : " + tempat);
                boolean sama = saya("Apkah anda ingin memasukkan data ");
                if (sama) {
                    candra1.write(nama + "," + nim + "," + fakultas + "," + prodi + "," + tempat);
                    candra1.newLine();
                    candra1.flush();
                }
            } else {
                System.out.println("Data yang anda masukkan sudah ada di sistem ");
                aku(data, true);
                boolean sama1 = saya("apakah anda ingin menambah data tersebut lagi ");
                if (sama1) {
                    System.err.println("Maaf anda tidak dapat menambah data tersebut karena data sudah ada ");
                    System.err.println("==============ERROR==============");
                }
            }
        } catch (Exception e) {
            System.err.println("Terjadi kesalahan pada sistem atau terjadi kesalahan pada data anda ");
        }
        return;
    }

    // algoritma menambah data biografi mahasiswa hanya admin yang boleh melakukan
    private static void nambahBiografi() throws IOException {
        try {

            Scanner system = new Scanner(System.in);
            FileWriter candra = new FileWriter("nama.txt");
            BufferedWriter candra1 = new BufferedWriter(candra);
            System.out.println("Silahkan anda masukkan nama          : ");
            String nama = system.nextLine();
            System.out.println("Silahkan anda masukkan tempat lahir  : ");
            String tempat = system.nextLine();
            System.out.println("Silahkan anda masukkan tanggal lahir : ");
            String tanggal = system.nextLine();
            System.out.println("Silahkan masukkan tempat tinggal     : ");
            String tinggal = system.nextLine();
            System.out.println("Silahkan anda masukkan jurusan anda  : ");
            String jurusan = system.nextLine();
            System.out.println("Silahkan anda masukkan email anda    : ");
            String email = system.nextLine();
            String[] data = {nama + "," + tempat + "," + tanggal + "," + tinggal + "," + jurusan};
            boolean kamu = depan(data, false);
            if (!kamu) {
                System.out.println("Data yang anda masukkan adalah ");
                System.out.println("nama           : " + nama);
                System.out.println("tempat lahir   : " + tempat);
                System.out.println("tanggal lahir  : " + tanggal);
                System.out.println("tempat tinggal : " + tinggal);
                System.out.println("jurusan        : " + jurusan);
                System.out.println("email          : " + email);
                boolean sama = saya("Apakah anda yakin ingin menambah data ini ? (ya/tidak)");
                if (sama) {
                    candra1.write(nama + "," + tempat + "," + tanggal + "," + jurusan + "," + email);
                    candra1.flush();
                    candra1.newLine();
                } else {
                    System.err.println("Terimakasih banyak ");
                }
            } else {
                System.err.println("Data yang anda masukkan sudah ada di database ");
                depan(data, true);
                boolean sama1 = saya("Apakah anda ingin menambah data ini lagi ke system ? (ya/tidak)");
                if (sama1) {
                    System.err.println("Tidak dapat menambah data yang sudah ada di system ");
                    System.err.println("Data tidak bisa di duplikat ");
                } else {
                    System.err.println("Terimakasih banyak ");
                }
            }
        }catch (Exception e){
            System.err.println("Anda Belum Menambah kan data ");
        }
    }
}