import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class ByteStream {
    public static void main(String[] args) throws IOException {
        FileInputStream file = null;
        FileOutputStream kamu = null;
        System.out.println(" \nmembuat file yang sangat rapi\n ");
        file = new FileInputStream("input.txt");
//        System.out.println(file.read());
        int cantik = file.read();
        System.out.println("\nmembaca file\n");
        while(cantik != -1){
            System.out.print((char)cantik);
            cantik = file.read();
        }
        System.out.println("\nmenutup File\n");
        file.close();
        System.out.println("\nmembuat file dari satu file ke file lain\n");
        try {
            file = new FileInputStream("input.txt");
            kamu = new FileOutputStream("output.txt");

            System.out.println("\nmenulis file dari file yang terisi ke file yang kosong\n");
            int panda = file.read();
            while (panda != -1){
                kamu.write(panda);
                panda = file.read();
            }
            System.out.println("\nmembuat akhir dari program\n");
        }finally {
            if (file != null){
                file.close();
            }
            if (kamu != null) {
                file.close();
            }
        }
        System.out.println("ini lah akhir dari program yang saya buat membuat satu file yang kosong dan menampilkannya ke console.");
        System.out.println("\npembuatan file yang baru\n");
        try (FileInputStream kijang = new FileInputStream("hujan.txt")){
            int sambal = kijang.read();
            while (sambal != -1){
                System.out.print((char)sambal);
                sambal = kijang.read();
            }
        }



    }
}