package Buku.ObjectOrientedProgramming;
// Class merupakan suatu blueprint atau cetakan untuk menciptakan suatu instant dari object
class candra {
    String bantal = "Candra Julius Sinaga";
    int umur = 20;
    String tempat = "Jl Hm Said No 63 Medan";
    // konsturktor adalah sebuah method yang namanya sama persis dengan nama kelasnya
    candra(String Inputnama , String InputTempat, int InputUmur ){
        String nama = Inputnama;
        String tempat = InputTempat;
        int umur = InputUmur;
        System.out.println(" Nama   : " +  nama);
        System.out.println(" Tempat : " +  tempat);
        System.out.println(" umur   : " +  umur + " tahun ");
    }
    // method adalah sebuah blog terpisah yang digunakan untuk menyelesaikan masalah khusus
    void kamu (){
        System.out.println("nama saya adalah : " + this.bantal + "umur saya adalah : " + this.umur + "\n" + "tempat tinggal saya adalah : " + this.tempat);
    }
}
public class PelajaranObject1 {
    public static void main(String[] args) {
        System.out.println(" Candra Julius Sinaga ");
        candra biasa = new candra("Candra Julius Sinaga","Jl Hm Said No 63 Medan",20);
        biasa.kamu();


    }
}
