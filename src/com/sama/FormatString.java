package com.sama;
import java.util.Formatter;
public class FormatString {
    public static void main(String[] args) {
        String nama = "Candra Julius Sinaga";
        int umur = 18;
        int umur1 = 20;
        int hasil1 = umur - umur1;
        float hasil = 19.5f;
        System.out.println("nama saya adalah " + nama + " umur saya adalah \n" + umur);
        System.out.printf("nama saya adalah %s dan umur saya adalah %d \n",nama ,umur);
        System.out.printf("hasil dari bagi %d + %d = %f",umur,umur,hasil);
//        kelakuan argumen indeks
        System.out.printf("\n%d + %d = %d",umur,umur,hasil1);
        System.out.printf("\nnama dia adalah %1$s dan umur %1$s adalah %2$d. ternyata %2$d masih muda yah " , nama,umur);
//        flags = nilai nilai yang mau di taruh
        System.out.println("\n(flags adalah nilai nilai yang mau kita taruh)");
        System.out.printf("%d - %d =%+d\n",umur,umur1,hasil1);
//        width = lebar
        System.out.println("(width) = lebar");
        int sama = 100000;
        System.out.printf("\n%-10d",sama);
        System.out.printf("\n%+20d",sama);
        System.out.printf("\n%-,4d",sama);
        System.out.printf("\n%010d",sama);
        System.out.printf("\n%+-20d",sama);

        System.out.print("\nfloating point adalah bentuk desimal");

        float Float1 = 1.5234f;
        System.out.printf("%f\n", Float1);
        System.out.printf("%+9f\n",Float1);
//      [.precision]
        System.out.println("\n[.precision]");
        float flaot2 = 15.67890f;
        System.out.printf("%f\n",flaot2);
        System.out.printf("%.4f",flaot2);
        System.out.printf("\n%.2f", flaot2);
        System.out.printf("\n%+08.2f\n",flaot2);

//        contoh
        String basa = "ucup";
        float IPK = 3.4521f;
        System.out.printf("%1$s mendapatkan IPK = %2$0+2.2f\n",basa,IPK);
        StringBuilder buildermnana = new StringBuilder();
        Formatter formatBuilder = new Formatter(buildermnana);
        formatBuilder.format("nama %s IPK : %+2.2f",basa,IPK);
        System.out.println(buildermnana);
    }
}
