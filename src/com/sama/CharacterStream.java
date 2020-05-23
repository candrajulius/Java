import java.io.*;

public class CharacterStream {
    public static void main(String[] args) throws IOException {
        System.out.println("\nmembuat karakter file Stream\n");
        FileInputStream bytegajah = new FileInputStream("bandit.txt");
        FileReader chargajah = new FileReader("bandit.txt");

        FileOutputStream bytesemut = new FileOutputStream("candra.txt");
        FileWriter charsemut = new FileWriter("input.txt");

//        System.out.println((char)bytegajah.read());
//        System.out.println((char)bytegajah.read());
//        System.out.println((char)chargajah.read());
//        System.out.println((char)chargajah.read());

        int jumlah = bytegajah.read();
        while (jumlah != -1 ){
            System.out.print((char)jumlah);
            bytesemut.write(jumlah);
            jumlah = bytegajah.read();
        }
        System.out.println("\n");
        int data = chargajah.read();
        while(data != -1){
            System.out.print((char)data);
            charsemut.write(data);
            data = chargajah.read();
        }
        System.out.println("menutup file");






        System.out.println("\nmembuat file byteStream\n");
        FileInputStream candra = null;
        FileOutputStream julius = null;
        julius = new FileOutputStream("hujan.txt");
        candra = new FileInputStream("input.txt");
//        System.out.print(candra.read());
        int kambing = candra.read();
        while (kambing != -1 ){
            System.out.print((char)kambing);
            kambing = candra.read();

            }
        try {
            candra = new FileInputStream("input.txt");
            julius = new FileOutputStream("hujan.txt");
            int rumah = candra.read();
            while (rumah != -1 ){
                julius.write(rumah);
                rumah = candra.read();
            }
        }finally {
            if (candra  != null){
                candra.close();
            }
            if (julius != null){
                candra.close();
            }
        }
        }
    }


