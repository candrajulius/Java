package dadang;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) throws IOException {
        Scanner User = new Scanner(System.in);
        boolean sama = true;
        int jawab, jawab1, jawab2, jawab3;
        FileInputStream candra = new FileInputStream("candra.txt");
        String[] bulan1 = {"Januari","Februari","Maret","April","Mei","Juni","Juli","Agustus","Sepetember","Oktober","November","Desember"};
        int jumlah = candra.read();
        System.out.print("masukkan nama anda : ");
        String user = User.nextLine();
        String nama = user.toLowerCase();
        System.out.println("Selamat datang di program kami " + nama);
        if (!(nama.equals("candra")) & (!nama.equals("candra julius sinaga"))) {
            while (jumlah != -1) {
                System.out.print((char) jumlah);
                jumlah = candra.read();
            }
        }
        FileInputStream sinaga = new FileInputStream("hujan.txt");
        int sinaga2 = sinaga.read();
        if (nama.equals("candra") || nama.equals("candra julius sinaga")) {
            while (sinaga2 != -1) {
                System.out.print((char) sinaga2);
                sinaga2 = sinaga.read();
            }
        }
        System.out.println("\n");
        while (sama) {
            for (int i = 0; i < 5; i++) {
                if (i != 0) {
                    if (i == 1) {
                        System.out.println("Fitur " + i + " penentuan zodiak berdasarkan tanggal lahir ");
                    } else if (i == 2) {
                        System.out.println("Fitur " + i + " memberikan solusi terhadap ekspresi anda ");
                    } else if (i == 3) {
                        System.out.println("Fitur " + i + " untuk mengetahui kepriadian anda ");
                    }
                }
            }
            System.out.print("masukkan pilihan anda = ");
            int pilhan = User.nextInt();
            if (pilhan == 1) {
                System.out.print("\napakah anda ingin lanjut = ");
                String lanjut = User.next();
                String julius = lanjut.toLowerCase();
                if (julius.equals("ya")) {
                    System.out.println("anda memilih " + julius + " dan anda lanjut bermain");
                    System.out.println("\n sistem penentuan zodiak berdasarkan tanggal lahir anda ");
                    System.out.print("masukkan tanggal (1 sampai 31)= ");
                    int tanggal = User.nextInt();
                    System.out.print("masukkan bulan (1 sampai 12) = ");
                    int bulan = User.nextInt();
                    System.out.print("masukkan tahun (1927 - 2022) = ");
                    int tahun = User.nextInt();
                    if (tanggal >= 32 && bulan >= 13 || tahun >= 2023) {
                        System.err.println("Anda Salah Memasukkan INPUT ");
                    }
                    if (tanggal >= 1 && tanggal <= 31 || bulan >= 1 && bulan <= 12) {
                        if ((tanggal >= 21 && bulan == 3 || tanggal <= 19 && bulan == 4) && (tahun >= 1927 && tahun <= 2022)) {
                            System.out.println("tanggal " + tanggal + " bulan " + bulan1[bulan] + " tahun " + tahun);
                            System.out.println("zodiak anda ARIES");
                            System.out.println("sifat = AGRESIF, ENERGIK, IMPLUSIF, BERJIWA PEMIMPIN, \n TIDAK SABARAN, EGOIS, CEPAT EMOSI");
                            System.out.println("pekerjaan = outdoor guide, pelatih kebugaran, tentara, atau ahli manajemen profesional");
                        } else if ((tanggal >= 20 && bulan == 4 || tanggal <= 20 && bulan == 5) && (tahun >= 1927 && tahun <= 2022)) {
                            System.out.println("tanggal " + tanggal + " bulan " + bulan1[bulan] + " tahun " + tahun);
                            System.out.println("zodiak anda TAURUS");
                            System.out.println("sifat = KERAS KEPALA, MATERIALISTIS, PASIF, RAMAH dan SABAR, \n PRAKTIS dan SETIA, MEMILIKI JIWA TOLERANSI");
                            System.out.println("pekerjaan = sales, perbankan, keuangan, atau tim quality control");
                        } else if ((tanggal >= 21 && bulan == 5 || tanggal <= 20 && bulan == 6) && (tahun >= 1927 && tahun <= 2022)) {
                            System.out.println("tanggal " + tanggal + " bulan " + bulan1[bulan] + " tahun " + tahun);
                            System.out.println("zodian anda GEMINI");
                            System.out.println("sifat = LINCAH, PANDAI BICARA, TIDAK STABIL, \n MUDAH BERUBAH-UBAH, MUDAH GUGUP, SANGAT PEKA");
                            System.out.println("pekerjaan = jurnalisme, publikasi, komunikasi, dosen");
                        } else if ((tanggal >= 21 && bulan == 6 || tanggal <= 22 && bulan == 7) && (tahun >= 1927 && tahun <= 2022)) {
                            System.out.println("tanggal " + tanggal + " bulan " + bulan1[bulan] + " tahun " + tahun);
                            System.out.println("zodiak anda CANCER");
                            System.out.println("sifat = SUASANA HATI TIDAK MENENTU, SENTIMENTAL, SETIA, \n PENUH PERHATIAN, SULIT MEMAAFKAN, MEMILIKI DAYA INGAT YANG KUAT");
                            System.out.println("pekerjaan = hukum, programmer, cyber, koki, psikolog, bekerja dirumah(freelance)");
                        } else if ((tanggal >= 23 && bulan == 7 || tanggal <= 22 && bulan == 8) && (tahun >= 1927 && tahun <= 2022)) {
                            System.out.println("tanggal " + tanggal + " bulan " + bulan1[bulan] + " tahun " + tahun);
                            System.out.println("zodiak anda LEO");
                            System.out.println("sifat = SUKA MEMIMPIN, DERMAWAN dan MURAH HATI, PENUH GAYA, \n ARISTOKRATIK, CONGKAK, PERCAYA DIRI TINGGI ");
                            System.out.println("pekerjaan = politisi, diplomat, aktor, musisi, pemimpin korporasi");
                        } else if ((tanggal >= 23 && bulan == 8 || tanggal <= 22 && bulan == 9) && (tahun >= 1927 && tahun <= 2022)) {
                            System.out.println("tanggal " + tanggal + " bulan " + bulan1[bulan] + " tahun " + tahun);
                            System.out.println("zodiak anda VIRGO");
                            System.out.println("sifat = PRAKTIS, ANALISTIS, KRITIS, BERKEPALA DINGIN, dan LOGIS, RAJIN, SEDERHANA");
                            System.out.println("pekerjaan = pengusaha, hospitality");
                        } else if ((tanggal >= 23 && bulan == 9 || tanggal <= 22 && bulan == 10) && (tahun >= 1927 && tahun <= 2022)) {
                            System.out.println("tanggal " + tanggal + " bulan " + bulan1[bulan] + " tahun " + tahun);
                            System.out.println("zodiak anda LIBRA");
                            System.out.println("sifat = PENUH KERAGUAN, BIMBANG, ADIL, \n PANDAI BERMUKA DUA, MEMILIKI NALURI YANG KUAT, MEMPESONA");
                            System.out.println("pekerjaan = diplomat, penerjemah, asisten eksekutif, tokoh literatur");
                        } else if ((tanggal >= 23 && bulan == 10 || tanggal <= 21 && bulan == 11) && (tahun >= 1927 && tahun <= 2022)) {
                            System.out.println("tanggal " + tanggal + " bulan " + bulan + " tahun " + tahun);
                            System.out.println("zodiak anda SCORPIO");
                            System.out.println("sifat = PANJANG AKAL, PENDIAM, PENDENDAM, GIGIH, TEKUN");
                            System.out.println("pekerjaan = kurator museum, agensi detektif, intel militer");
                        } else if ((tanggal >= 22 && bulan == 11 || tanggal <= 21 && bulan == 12) && (tahun >= 1927 && tahun <= 2022)) {
                            System.out.println("tanggal " + tanggal + " bulan " + bulan + " tahun " + tahun);
                            System.out.println("zodiak anda SAGITARIUS");
                            System.out.println("sifat = BERJIWA PETUALANG, PANDAI, SUKA KEBEBASAN,\n MANDIRI, PANDAI BERDIPLOMASI, BERPANDANGAN LUAS");
                            System.out.println("pekerjaan = dokter, penulis, pramugari, guru, pemandu wisata");
                        } else if ((tanggal >= 22 && bulan == 12 || tanggal <= 19 && bulan == 1) && (tahun >= 1927 && tahun <= 2022)) {
                            System.out.println("tanggal " + tanggal + " bulan " + bulan + " tahun " + tahun);
                            System.out.println("zodiak anda CAPRICORN");
                            System.out.println("sifat = PENDIAM, RAJIN, dan AMBISIUS, MATERIALIS, GENGSI TINGGI,\n SUKA MEMERINTAH,SUKA MEMERINTAH");
                            System.out.println("dan SUKA MEMPERALAT ORANG LAEN");
                            System.out.println("pekerjaan = guru, programmer, akuntan, sutradara, ilmuwan");
                        } else if ((tanggal >= 20 && bulan == 1 || tanggal <= 18 && bulan == 2) && (tahun >= 1927 && tahun <= 2022)) {
                            System.out.println("tanggal " + tanggal + " bulan " + bulan + " tahun " + tahun);
                            System.out.println("zodiak anda AQUARIUS");
                            System.out.println("pekerjaan = penulis, desainer grafis, novelis, dan praktisi antara teori dan sains");
                            System.out.println("sifat = TENANG, OBYEKTIF, JENIUS, PENUH IDE, CEPAT MENGERTI ");
                        } else if ((tanggal >= 19 && bulan == 2 || tanggal <= 20 && bulan == 3) && (tahun >= 1927 && tahun <= 2022)) {
                            System.out.println("tanggal " + tanggal + " bulan " + bulan + " tahun " + tahun);
                            System.out.println("zodiak anda PISCES");
                            System.out.println("sifat = MEMILIKI SISI MANUSIAWI YANG BESAR, \n PENUH CINTA, PRAKTIS, SUKA MENGKHAYAL");
                            System.out.println("pekerjaan = terapis atau intruktur pendidikan");
                        } else {
                            System.err.println("tanggal " + tanggal + " bulan " + bulan + " tahun " + tahun);
                            System.err.println("anda keluar dari program");
                        }
                    }
                    if (tahun == 1927 || tahun == 1939 || tahun == 1951 || tahun == 1963 || tahun == 1975 || tahun == 1987 || tahun == 1999 || tahun == 2011) {
                        System.out.println(" shio anda KELINCI ");

                        System.out.println(" bahasa cinanya = Mao ");
                    } else if (tahun == 1928 || tahun == 1940 || tahun == 1952 || tahun == 1964 || tahun == 1976 || tahun == 1988 || tahun == 2000 || tahun == 2012) {
                        System.out.println(" shio anda NAGA ");
                        System.out.println(" bahasa cinanya = Chen ");
                    } else if (tahun == 1929 || tahun == 1941 || tahun == 1953 || tahun == 1965 || tahun == 1977 || tahun == 1989 || tahun == 2001 || tahun == 2013) {
                        System.out.println(" shio anda ULAR ");
                        System.out.println(" bahasa cinanya = Si ");
                    } else if (tahun == 1930 || tahun == 1942 || tahun == 1954 || tahun == 1966 || tahun == 1978 || tahun == 1990 || tahun == 2002 || tahun == 2014) {
                        System.out.println(" shio anda KUDA ");
                        System.out.println(" bahasa cinanya = Wu ");
                    } else if (tahun == 1931 || tahun == 1943 || tahun == 1955 || tahun == 1967 || tahun == 1979 || tahun == 1991 || tahun == 2003 || tahun == 2015) {
                        System.out.println(" shio anda KAMBING ");
                        System.out.println(" bahasa cinanya = Wei ");
                    } else if (tahun == 1932 || tahun == 1944 || tahun == 1956 || tahun == 1968 || tahun == 1980 || tahun == 1992 || tahun == 2004 || tahun == 2016) {
                        System.out.println(" shio anda MONYET ");
                        System.out.println(" bahasa cinanya = Wu ");
                    } else if (tahun == 1933 || tahun == 1945 || tahun == 1957 || tahun == 1969 || tahun == 1981 || tahun == 1993 || tahun == 2005 || tahun == 2017) {
                        System.out.println(" shio anda AYAM ");
                        System.out.println(" bahasa cinanya = You ");
                    } else if (tahun == 1934 || tahun == 1946 || tahun == 1958 || tahun == 1970 || tahun == 1982 || tahun == 1994 || tahun == 2006 || tahun == 2018) {
                        System.out.println(" shio anda ANJING ");
                        System.out.println(" bahasa cinanya = Xu ");
                    } else if (tahun == 1935 || tahun == 1947 || tahun == 1959 || tahun == 1971 || tahun == 1983 || tahun == 1995 || tahun == 2007 || tahun == 2019) {
                        System.out.println(" shio anda BABI ");
                        System.out.println(" bahasa cinanya = Hai ");
                    } else if (tahun == 1936 || tahun == 1948 || tahun == 1960 || tahun == 1972 || tahun == 1984 || tahun == 1996 || tahun == 2008 || tahun == 2020) {
                        System.out.println(" shio anda TIKUS ");
                        System.out.println(" bahasa cinanya = Zi ");
                    } else if (tahun == 1937 || tahun == 1949 || tahun == 1961 || tahun == 1973 || tahun == 1985 || tahun == 1997 || tahun == 2009 || tahun == 2021) {
                        System.out.println(" shio anda KERBAU ");
                        System.out.println(" bahasa cinanya = Chou ");
                    } else if (tahun == 1938 || tahun == 1950 || tahun == 1962 || tahun == 1974 || tahun == 1986 || tahun == 1998 || tahun == 2010 || tahun == 2022) {
                        System.out.println(" shio anda MACAN ");
                        System.out.println(" bahasa cinanya = Yin ");
                    } else {
                        System.err.println(" Anda Salah Input");
                    }
                } else {
                    System.err.println("anda salah memasukkan INPUT");
                }
            } else if (pilhan == 2) {
                System.out.print(" masukkan nama anda sekali lagi = ");
                String mama2 = User.nextLine();
                String mama3 = mama2.toLowerCase();
                System.out.println("nama anda " + mama3);
                System.out.println("Bagaimana perasaan anda saat ini = ");
                String perasaan = User.nextLine();
                String perasaan1 = perasaan.toLowerCase();
                System.out.println("perasaan anda  " + perasaan1);
                if (perasaan1.equals("marah") || perasaan1.equals("kesal")) {
                    System.out.println("mengapa anda marah ?");
                    for (int i = 0; i < 5; i++) {
                        if (i == 1) {
                            System.out.println("anda memilih " + i + " anda marah dengan teman anda ");
                        } else if (i == 2) {
                            System.out.println("anda memilih  " + i + " anda marah dengan pacar anda ");
                        } else if (i == 3) {
                            System.out.println("anda memilih " + i + " anda marah dengan orang tua anda ");
                        } else if (i == 4) {
                            System.out.println(" anda memilih " + i + " anda marah dengan saudara anda ");
                        }
                    }
                    System.out.println("silahkan pilih dari angka 1-4 \n agar kami tahu solusinya untuk Anda");
                    int angka4 = User.nextInt();
                    if (angka4 == 1) {
                        System.out.println("anda marah dengan teman anda ");
                        FileInputStream file = new FileInputStream("JUmat.txt");
                        int file1 = file.read();
                        while (file1 != -1) {
                            System.out.print((char) file1);
                            file1 = file.read();
                        }
                    } else if (angka4 == 2) {
                        System.out.println("anda marah dengan pacar anda ");
                        FileInputStream file3 = new FileInputStream("output.txt");
                        int file4 = file3.read();
                        while (file4 != -1) {
                            System.out.print((char) file4);
                            file4 = file3.read();
                        }
                    } else if (angka4 == 3) {
                        System.out.println(" anda marah dengan orangtua anda ");
                        FileInputStream file5 = new FileInputStream("teman.txt");
                        int file6 = file5.read();
                        while (file6 != -1) {
                            System.out.print((char) file6);
                            file6 = file5.read();
                        }
                    } else if (angka4 == 4) {
                        System.out.println(" anda marah dengan orangtua anda ");
                        FileInputStream file5 = new FileInputStream("teman.txt");
                        int file6 = file5.read();
                        while (file6 != -1) {
                            System.out.print((char) file6);
                            file6 = file5.read();
                        }
                    }
                } else if (perasaan1.equals("sedih") || perasaan1.equals("menangis")) {
                    System.out.println("mengapa anda sedih ?");
                    for (int i = 0; i < 5; i++) {
                        if (i == 1) {
                            System.out.println("anda memilih " + i + " anda sedih karena teman anda ");
                        } else if (i == 2) {
                            System.out.println("anda memilih  " + i + " anda sedih karena pacar anda ");
                        } else if (i == 3) {
                            System.out.println("anda memilih " + i + " anda sedih karena orang tua anda ");
                        } else if (i == 4) {
                            System.out.println(" anda memilih " + i + " anda sedih karena saudara anda ");
                        }
                    }
                    System.out.println("silahkan pilih dari angka 1-4 \n agar kami tahu solusinya untuk Anda");
                    int angka4 = User.nextInt();
                    if (angka4 == 1) {
                        System.out.println("anda sedih dengan teman anda ");
                        FileInputStream file = new FileInputStream("kesal1.txt");
                        int file1 = file.read();
                        while (file1 != -1) {
                            System.out.print((char) file1);
                            file1 = file.read();
                        }
                    } else if (angka4 == 2) {
                        System.out.println("anda sedih dengan pacar anda ");
                        FileInputStream file3 = new FileInputStream("kesal2.txt");
                        int file4 = file3.read();
                        while (file4 != -1) {
                            System.out.print((char) file4);
                            file4 = file3.read();
                        }
                    } else if (angka4 == 3) {
                        System.out.println(" anda sedih dengan orangtua anda ");
                        FileInputStream file5 = new FileInputStream("kesal3.txt");
                        int file6 = file5.read();
                        while (file6 != -1) {
                            System.out.print((char) file6);
                            file6 = file5.read();
                        }
                    } else if (angka4 == 4) {
                        System.out.println(" anda sedih dengan orangtua anda ");
                        FileInputStream file5 = new FileInputStream("kesal4.txt");
                        int file6 = file5.read();
                        while (file6 != -1) {
                            System.out.print((char) file6);
                            file6 = file5.read();
                        }

                    }
                } else {
                    System.out.println("perasaan anda baik");
                }
                System.out.println("\n");
            } else if (pilhan == 3) {
                System.out.println(" TEST KEPRIABADIAN ANDA \n");
                int k = 0;
                do {
                    if (k == 1) {
                        System.out.println("bagaimana karakter anda = ");
                        for (int i = 0; i < 5; i++) {
                            if (i != 0) {
                                if (i == 1) {
                                    System.out.println("no " + i + " mudah diatur ,diam,suka mengalah,memuliki rasa toleransi");
                                } else if (i == 2) {
                                    System.out.println("no " + i + " Rapi , teratur, terencana,mampu meperhatikan hal hal terkecil");
                                } else if (i == 3) {
                                    System.out.println("no " + i + " suka menjadi bahan perhatian, \n ingin selalu disenangi orang laen, menyukai kepopuleran");
                                } else {
                                    System.out.println("no " + i + " sangat suka mengatur, suka petualangan, suka tantangan baru");
                                }
                            }
                        }
                        System.out.println("\n");
                    } else if (k == 2) {
                        System.out.println("Bagaimana Emosi Anda = ");
                        for (int j = 0; j < 6; j++) {
                            if (j != 0) {
                                if (j == 1) {
                                    System.out.println("no " + j + " rendah hati , mudah bergaul, santai, diam");
                                } else if (j == 2) {
                                    System.out.println("no " + j + " suka menganalisis, suka analitik, serius dan tekun ");
                                } else if (j == 3) {
                                    System.out.println("no " + j + " suka bicara, suka tampil , memliki rasa humor tinggi ");
                                } else if (j == 4) {
                                    System.out.println("no " + j + " dinamis dan aktif, sangat menginginkan perubahan,\n memiliki kemauan yang tegas dan kuat");
                                }
                            }
                        }

                        System.out.println("\n");
                    } else if (k == 3) {
                        System.out.println(" Bagaimana anda nanti menjadi orangtua ");
                        for (int u = 0; u < 6; u++) {
                            if (u != 0) {
                                if (u == 1) {
                                    System.out.println(" no " + u + " tidak mudah marah, selalu menyediakan waktu untuk anak - anak,\n tidak tergesa-gesa");
                                } else if (u == 2) {
                                    System.out.println("no " + u + " menjaga rumah selalu rapi, menerapkan standard yang tinggi,\n menginginkan segala sesuatu berjalan dengan lancar");
                                } else if (u == 3) {
                                    System.out.println(" no " + u + " mampu membuat suasana rumah menjadi menyenangkan, merubah bencana menjadi humor ");
                                } else if (u == 4) {
                                    System.out.println(" no " + u + " kepemimpinan yang kuat dalam didalam keluarga, memiliki tujuan yang jelas,\n mampu memberikan motivasi kepada anggota keluarga");
                                }
                            }
                        }
                        System.out.println("\n");
                        System.out.println(" Bagaiamana anda menjadi pekerja = ");
                    } else if (k == 4) {
                        for (int p = 0; p < 6; p++) {
                            if (p != 0) {
                                if (p == 1) {
                                    System.out.println(" no " + p + " kemampuan administratif, menjadi penengah masalah, mampu menghindari munculnya konflik ");
                                } else if (p == 2) {
                                    System.out.println(" no " + p + " beriorentasi pada jadwal , seorang perfeksionos,\n sadar perincian, teratur dan rapi ,ekonomis ");
                                } else if (p == 3) {
                                    System.out.println("no " + p + " kreatif dan inofatif, memikirkan kegiatan baru yang menyenangkan, energi dan antusiasme ");
                                } else if (p == 4) {
                                    System.out.println(" no " + p + " cenderung berorientasi pada target, melihat suatu gambaran secara menyeluruh, bergerak cepat dan bertindak ");
                                }
                            }
                        }
                        System.out.println("\n");
                        System.out.println(" Bagaimana anda menjadi teman ");
                    } else if (k == 5) {
                        for (int i = 0; i < 6; i++) {
                            if (i != 0) {
                                if (i == 1) {
                                    System.out.println("no " + i + " mudah diajak bergaul , menyenagkan. seorang pendengar yang baik , tidak suka menyinggung orang laen ");
                                } else if (i == 2) {
                                    System.out.println("no " + i + " memilki kehatia-hatian dalam memilih teman , menghindari perhatian, setia , berbakti");
                                } else if (i == 3) {
                                    System.out.println("no " + i + " suka dipuji dan mendapat perhatian, bukan pendendam, menyenangkan, cepat meminta maaf");
                                } else if (i == 4) {
                                    System.out.println("no " + i + " mau menjadi pemimpin , mau bekerja untuk kegiatan , mampu mengorganisasikan orang dengan baik");
                                }
                            }
                        }
                    }
                    k++;
                } while (k >= 1 && k <= 5);

                System.out.print("Jawaban Anda yang ke 1 = ");
                jawab = User.nextInt();
                System.out.print("Jawaban Anda yang ke 2 = ");
                jawab1 = User.nextInt();
                System.out.print("Jawaban Anda yang ke 3 = ");
                jawab2 = User.nextInt();
                System.out.print("Jawaban Anda yang ke 4 = ");
                jawab3 = User.nextInt();
                System.out.print("Jawaban Anda yang ke 5 = ");
                int jawab4 = User.nextInt();
                if (jawab == 1 && jawab1 == 1 && jawab2 == 1 && jawab3 == 1 && jawab4 == 1) {
                    System.out.println(" Anda berkripadian PLEGMATIS ");
                    System.out.println(" apakah anda ingin melihat Penjelasan tentang Plegmatis ");
                    System.out.println("ya atau tidak ");
                    String ya = User.next();
                    String ya1 = ya.toLowerCase();
                    System.out.println(" anda memilih " + ya1);
                    if (ya1.equals("ya")) {
                        FileInputStream stream = new FileInputStream("Plegmatis");
                        int stream1 = stream.read();
                        while (stream1 != -1) {
                            System.out.print((char) stream1);
                            stream1 = stream.read();
                        }
                    } else {
                        System.out.println(" Anda Keluar Dari Program ");
                    }
                } else if (jawab == 2 && jawab1 == 2 && jawab2 == 2 && jawab3 == 2 && jawab4 == 2) {
                    System.out.println("Anda berkpribadian MELANKOLIS");
                    System.out.println(" apakah anda ingin melihat Penjelasan tentang Melankonis ");
                    System.out.println("ya atau tidak ");
                    String ya = User.next();
                    String ya1 = ya.toLowerCase();
                    System.out.println(" anda memilih " + ya1);
                    if (ya1.equals("ya")) {
                        FileInputStream stream = new FileInputStream("Melankonis");
                        int stream1 = stream.read();
                        while (stream1 != -1) {
                            System.out.print((char) stream1);
                            stream1 = stream.read();
                        }
                    } else {
                        System.out.println(" Anda Keluar Dari Program ");
                    }
                } else if (jawab == 3 && jawab1 == 3 && jawab2 == 3 && jawab3 == 3 && jawab4 == 4) {
                    System.out.println("Anda berkpribadian SANGUINIS");
                    System.out.println(" apakah anda ingin melihat Penjelasan tentang Sanguinis ");
                    System.out.println("ya atau tidak ");
                    String ya = User.next();
                    String ya1 = ya.toLowerCase();
                    System.out.println(" anda memilih " + ya1);
                    if (ya1.equals("ya")) {
                        FileInputStream stream = new FileInputStream("Sanguinis");
                        int stream1 = stream.read();
                        while (stream1 != -1) {
                            System.out.print((char) stream1);
                            stream1 = stream.read();
                        }
                    } else {
                        System.out.println(" Anda Keluar Dari Program ");
                    }
                } else {
                    System.out.println("Anda berkpribadian KOLERIS");
                    System.out.println(" apakah anda ingin melihat Penjelasan tentang Koleris ");
                    System.out.println("ya atau tidak ");
                    String ya = User.next();
                    String ya1 = ya.toLowerCase();
                    System.out.println(" anda memilih " + ya1);
                    if (ya1.equals("ya")) {
                        FileInputStream stream = new FileInputStream("Koleris");
                        int stream1 = stream.read();
                        while (stream1 != -1) {
                            System.out.print((char) stream1);
                            stream1 = stream.read();
                        }
                    } else {
                        System.out.println(" Anda Keluar Dari Program ");
                    }
                }
            }
            sama = mantap("Apakah anda ingin lanjut (ya/tidak)");
        }
        System.out.println('\n');
        FileInputStream bandit = new FileInputStream("bandit.txt");
        int saya = bandit.read();
        if (nama.equals("candra") || (nama.equals("candra julius sinaga"))) {
            while (saya != -1) {
                System.out.print((char) saya);
                saya = bandit.read();
            }
        } else {
            FileInputStream idiot = new FileInputStream("input.txt");
            int tuna = idiot.read();
            while (tuna != -1) {
                System.out.print((char) tuna);
                tuna = idiot.read();
            }
        }
    }
    private static boolean mantap (String message){
        Scanner scan = new Scanner(System.in);
        System.out.println("\n" + message);
        String manusia = scan.nextLine();
        while (!manusia.equalsIgnoreCase("ya")&& !manusia.equalsIgnoreCase("tidak")){
            System.err.println("Anda salah Input ");
            System.err.println(" Terjadi ERROR ");
            System.out.println("Apakah Anda Ingin melanjutkannya lagi? (ya/tidak)");
            manusia = scan.nextLine();
        }
        return manusia.equalsIgnoreCase("ya");
    }
}