package dadang;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Latihan2 {
    public static void main(String[] args) throws IOException {
        Scanner Inputuser = new Scanner(System.in);
        float hasil;
        String[] bukuAnak = {"buku membaca", "buku menulis", "buka menghitng", "buku menggambar"};
        String[] bukuKomputer = {"buku pemrograman", "buku algoritma", "buku engineering", "buku AI", "buku dasar mobile", "buku web"};
        float[] HargaBukuAnak = {12000, 10000, 20000, 40000};
        float[] HargaBukuKomputer = {20000, 80000, 70000, 50000, 80000, 40000};
        System.out.println(" Harga komputer = " + Arrays.toString(HargaBukuKomputer));
        System.out.println(" Harga buku anak = " + Arrays.toString(HargaBukuAnak));
        System.out.println(" Buku koomputer = " + Arrays.toString(bukuKomputer));
        System.out.println(" Buku koomputer = " + Arrays.toString(bukuAnak));
        System.out.println(" Selamat datang di program saya ");
        System.out.print(" Silahkan masukkan nama anda : ");
        String nama = Inputuser.nextLine();
        System.out.println(" Hai " + nama);
        FileInputStream file = new FileInputStream("input.txt");
        int jumlah = file.read();
        while (jumlah != -1) {
            System.out.print((char) jumlah);
            jumlah = file.read();
        }
        System.out.println(" \napakah anda ingin bermain = ");
        System.out.println("ya atau tidak");
        String user = Inputuser.next();
        if (user.equals("ya")) {
            System.out.println(" anda lanjut bermain \n");

            System.out.println("\n Ada beberapa pilihan kami : ");
            for (int i = 0; i < 4; i++) {
                if (i == 1) {
                    System.out.println("pilihan ke " + i + " adalah kalkulator ");
                } else if (i == 2) {
                    System.out.println("pilihan ke " + i + " adalah kotak ");
                } else if (i == 3) {
                    System.out.println("pilihan ke " + i + " adalah sistem perhitungan penjualan");
                }
            }
            System.out.print(" masukkan pilihan anda  : ");
            int opsi = Inputuser.nextInt();
            System.out.println("\n Anda memilih " + opsi);
            while (opsi >= 1 && opsi <= 4) {
                if (opsi == 1) {
                    System.out.println(" Anda memilih kalkulator ");
                    System.out.print(" masukkan angka1 :  ");
                    float angka = Inputuser.nextFloat();
                    System.out.print("masukkan operator +,-,*,/ = ");
                    String operator = Inputuser.next();
                    System.out.print(" masukkan angka2 :");
                    float angka2 = Inputuser.nextFloat();
                    System.out.println("angka1 = " + angka + " " + operator + " " + angka2);
                    if (operator.equals("*")) {
                        hasil = angka * angka2;
                        System.out.println("hasil = " + hasil);
                    } else if (operator.equals("/")) {
                        if ((angka == 0 )) {
                            System.out.println(" pembagian tidak bisa di bagi ");
                        }else if ( angka2 == 0){
                            System.out.println("pembagian tidak bisa di bagi ");
                        }else{
                            hasil = angka / angka2;
                            System.out.println("hasil = " + hasil);
                        }
                    } else if (operator.equals("+")) {
                        hasil = angka + angka2;
                        System.out.println("hasil = " + hasil);
                    } else if (operator.equals("-")) {
                        hasil = angka - angka2;
                        System.out.println("hasil = " + hasil);
                    } else {
                        if (!operator.equals("+ ,*,-,/, ")) {
                            System.out.println(" anda salah memasukkan operator ");
                            System.out.println(" anda keluar dari program ");
                        }
                    }
                    break;
                }
                if (opsi == 2) {
                    System.out.println(" anda memilih kotak ");
                    System.out.println(" menu kotak dari kami ");
                    for (int j = 0; j < 4; j++) {
                        if (j == 1) {
                            System.out.println("pilihan ke " + j + " adalah persegi panjang ");
                        } else if (j == 2) {
                            System.out.println("pilihan ke " + j + " adalah segitiga ");
                        } else if (j == 3) {
                            System.out.println("pilihan ke " + j + " adalah bujur sangkar ");
                        }
                    }
                    System.out.print("\nmasukkan pilihan anda lagi = ");
                    int opsi2 = Inputuser.nextInt();
                    for (int k = 0; k < 4; k++) {
                        if (opsi2 == 1 && k == 1) {
                            System.out.println(" anda memilih " + k + " persegi panjang ");
                            for (int u = 0; u < 3; u++) {
                                if (u == 1) {
                                    System.out.println("pilihan " + u + " luas persegi panjang ");
                                } else if (u == 2) {
                                    System.out.println("pilihan " + u + " keliling persegi panjang ");
                                }
                            }
                            System.out.print("masukkan opsi = ");
                            int opsi3 = Inputuser.nextInt();
                            for (int p = 0; p < 3; p++) {
                                if (opsi3 == 1 && p == 1) {
                                    System.out.println("pilihan " + p + " adalah luas persegi panjang ");
                                    System.out.print("masukkan panjang = ");
                                    float panjang = Inputuser.nextFloat();
                                    System.out.print("masukkan lebar = ");
                                    float lebar = Inputuser.nextFloat();
                                    float luas = panjang * lebar;
                                    System.out.println(" luas persegi panjang = " + luas);
                                } else if (opsi3 == 2 && p == 2) {
                                    System.out.println("pilihan " + p + " keliling persegi panjang");
                                    System.out.print("masukkan panjang = ");
                                    float panjang = Inputuser.nextFloat();
                                    System.out.print("masukkan lebar = ");
                                    float lebar = Inputuser.nextFloat();
                                    float keliling = 2 * (panjang * lebar);
                                    System.out.println("Keliling persegi panjang  = " + keliling);
                                }
                            }
                        } else if (opsi2 == 2 && k == 2) {
                            System.out.println("anda memilih segitiga");
                            for (int y = 0; y < 3; y++) {
                                if (y == 1) {
                                    System.out.println("pilihan " + y + " adalah luas segitiga ");
                                } else if (y == 2) {
                                    System.out.println("pilihan " + y + " adalah keliling segitiga ");
                                }
                            }
                            System.out.println("masukkan opsi lagi = ");
                            int opsi3 = Inputuser.nextInt();
                            if (opsi3 == 1) {
                                System.out.println("anda memilih Luas segitiga = ");
                                System.out.print("masukkan alas = ");
                                float alas = Inputuser.nextFloat();
                                System.out.print("masukkan tinggi = ");
                                float tinggi = Inputuser.nextFloat();
                                float Luas = (alas * tinggi) / 2;
                                System.out.println("luas segitiga = " + Luas);
                            } else if (opsi3 == 2) {
                                System.out.println("masukka panjang = ");
                                float panjang = Inputuser.nextFloat();
                                float keliling = panjang + panjang + panjang;
                                System.out.println("keliling segitiga = " + keliling);
                            }
                        } else if (opsi2 == 3 && k == 3) {
                            System.out.println("anda memilih bujur sangkar ");
                            for (int l = 0; l < 3; l++) {
                                if (l == 1) {
                                    System.out.println("pilihan ke " + l + " luas bujur sangkar ");
                                } else if (l == 2) {
                                    System.out.println("pilihan ke " + l + " keliling bujur sangkar ");
                                }
                            }
                            System.out.println("masukkan pilihan anda lagi = ");
                            int opsi3 = Inputuser.nextInt();
                            if (opsi3 == 1) {
                                System.out.println("luas bujur sangkar ");
                                System.out.print("masukkan sisi = ");
                                float sisi = Inputuser.nextFloat();
                                System.out.print("masukkan sisi = ");
                                sisi = Inputuser.nextFloat();
                                float luas = sisi * sisi;
                                System.out.println("Luas bujur sangkar = " + luas);
                            } else if (opsi3 == 2) {
                                System.out.println("Keliling bujur sangkar ");
                                System.out.println("masukkan sisi = ");
                                float sisi = Inputuser.nextFloat();
                                System.out.println("masukkan sisi = ");
                                sisi = Inputuser.nextFloat();
                                float keliling = 4 * sisi;
                                System.out.println("keliling bujur sangkar = " + keliling);
                            }
                        }
                    }
                    break;
                } else if (opsi == 3) {
                    System.out.println("Sistem pembuatan kasir buku ");
                    System.out.println("pilihan untuk data = ");
                    int cashir = Inputuser.nextInt();
                    if (cashir == 1) {
                        System.out.println("tampilan data untuk harga buku buku komputer  ");
                        for (int u = 0; u < HargaBukuKomputer.length; u++) {
                            if (!(u == 0)) {
                                if (u == 1) {
                                    System.out.println("harga ke " + u + " = " + HargaBukuKomputer[1]);
                                } else if (u == 2) {
                                    System.out.println("harga ke " + u + " = " + HargaBukuKomputer[2]);
                                } else if (u == 3) {
                                    System.out.println("harga ke " + u + " = " + HargaBukuKomputer[3]);
                                } else if (u == 4) {
                                    System.out.println("harga ke " + u + " = " + HargaBukuKomputer[4]);
                                } else if (u == 5) {
                                    System.out.println("harga ke " + u + " = " + HargaBukuKomputer[5]);
                                } else {
                                    System.out.println("harga ke " + u + " = " + HargaBukuKomputer[6]);
                                }
                            }
                        }
                        for (int k = 0; k < bukuKomputer.length; k++) {
                            if  (!(k == 0)) {
                                if (k == 1) {
                                    System.out.println(" buku ke " + k + " Nama buku = " + bukuKomputer[0]);

                                } else if (k == 2) {
                                    System.out.println(" buku ke " + k + " Nama buku = " + bukuKomputer[1]);
                                } else if (k == 3) {
                                    System.out.println(" buku ke " + k + " Nama buku = " + bukuKomputer[2]);
                                } else if (k == 4) {
                                    System.out.println(" buku ke " + k + " Nama buku = " + bukuKomputer[3]);
                                } else if (k == 5) {
                                    System.out.println(" buku ke " + k + " Nama buku = " + bukuKomputer[4]);
                                } else {
                                    System.out.println(" buku ke " + k + " Nama buku = " + bukuKomputer[5]);
                                }
                            }
                        }
                    }else if (cashir == 2) {
                            System.out.println("\n");
                            System.out.println("tampilan data untuk harga buku komputer ");
                            for (int i = 0; i < HargaBukuAnak.length; i++) {
                                if (!(i == 0)) {
                                    System.out.println("harga ke " + i + " = " + HargaBukuAnak[i]);
                                }
                            }
                        }
                    }
                    System.out.println("Pilih buku yang anda ambil : ");
                    String buku = Inputuser.next();
                    break;
                }
            }else{
            System.out.println(" anda keluar dari program");
        }
        }
    }


