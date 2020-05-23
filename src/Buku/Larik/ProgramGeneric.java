package Buku.Larik;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.*;


public class ProgramGeneric {
    public static void main(String[] args) {
        System.out.println("Candra Julius Sinaga ");
        System.out.println("\nPenggunaan Kelas Generic Pada Java");
        System.out.println("Demo 1 ");
        Mygeneric<String> bandal = new Mygeneric<String>();

        bandal.push("Medan Kota aku yang sangat aku cintai ");
        bandal.push("Waktu yang sangat berharga bagi aku ");
        bandal.push("Semarang kota periangan ");
        // Tampilakan data
        while (!bandal.isEmpty()) {
            System.out.println(bandal.pop());
        }
        System.out.println(" Demo 2 ");
        Mygeneric<anjing<Integer,String>> buah = new Mygeneric<>();
        buah.push(new anjing<Integer, String>(3,"Manggis "));
        buah.push(new anjing<Integer, String>(4,"Pepaya "));
        buah.push(new anjing<Integer, String>(5,"Apel "));
        buah.push(new anjing<Integer, String>(6,"Jeruk "));

        while (!buah.isEmpty()){
            System.out.println(buah.pop());
        }
        System.out.println("\n");
        Double [] data = {12.54,12.53,78.90,112.89};
        Integer [] cnra = {2,34,1,12323,4444,112};
        String [] busetdah = {"Candra ", "Julius ", "Sinaga "};
        candra(data);
        candra(busetdah);
        candra(cnra); System.out.println("\n");
        Mygeneric<anjing<Integer,String>> bangsat = new Mygeneric<>();
        bangsat.push(new anjing<>(2,"mantap"));
        bangsat.push(new anjing<>(4,"Lirik lagu kamu buat aku tersimpun buat aku malu saat bersamamu \n Saat bersamamu mungkin \n" ));
        bubbleshort(data); System.out.println("\n");
        showData(data);
        Double candra = 20.900;
        Integer julius = 20;
        Double total = add(candra,julius);
        System.out.println("Total dari pertambahan dari A dan B adalah = " + total);
        Mygeneric<Integer> nums = new Mygeneric<Integer>(); // Menggunakan method Unbounded Wildcard
        nums.push(12);
        nums.push(20);
        nums.push(100);
        System.out.println(" The max number is " + max(nums));
        Mygeneric<Number> numb= new Mygeneric<Number>();
       numb.push(12);
       numb.push(20);
       showData(numb); // menggunakan method upper Bounded Wilcard

        Mygeneric<String> buah1 = new Mygeneric<String >();
        buah1.push("Apel");
        buah1.push("Jeruk");
        buah1.push("Nanas");
        showData1(buah1);
    }
    public static class Mygeneric<E> { // Membuat kelas Generic
        private ArrayList<E> candra = new ArrayList<>();

        public int getSize() {
            return candra.size();
        }

        public void push(E item) {
            candra.add(item);
        }

        public E pop() {
            E item = candra.get(getSize() - 1);
            candra.remove(getSize() - 1);
            return item;
        }

        public boolean isEmpty() {
            return candra.isEmpty();
        }
    }
    public static class anjing <k , v>{ // Membuat Kelas Generic yang menggunakan key and value
        private final k key;
        private final v value;


        public anjing(k key, v value) {
            this.key = key;
            this.value = value;
        }
        public k getKey(){
            return key;
        }
        public v getValue(){
            return value;
        }
        @Override
        public String toString() {
            return ("key " + key + " " + "value " + value);
        }
    }
    public static <E> void candra (E[] cndra){ // Membuat Method Generic
        for (int i = 0; i < cndra.length; i++){
            System.out.println(cndra[i]);
        }
    }
    // untuk membuat pengurutan data dengan dari terkecil hingga terbesar menggunakan Object
    public static <E extends Comparable<E>> void bubbleshort(E[] buset){
        int j;
        boolean flag = true;
        E tempt;
        while (flag){
            flag = false;
            for (j= 0; j < buset.length - 1; j++){
                if (buset[j].compareTo(buset[j+1]) > 0){
                    tempt = buset[j];
                    buset[j] = buset[j + 1];
                    buset [j + 1] = tempt;
                    flag = true;
                }
            }
        }
    }
    // Menampilkan data dengan Object yang sudah dibuat dilayar
    public static <E> void showData2(E [] buset){
        for (int i = 0; i < buset.length; i++){
            System.out.println(buset[i]);
        }
        System.out.println("\n");
    }
    // untuk menambahkan data 1 ke data ke 2 sehingga jumlahnya dapat di buat kedalam sebuah variabel
    public static <T extends Number> double add(T first, T second){
        return first.doubleValue() + second.doubleValue();
    }
    // menentukan nilai max pada data dengan membandingkan nilai tersebut
    // Membuat method ubbounded Wildcard
    public static Number max(Mygeneric<?>candra){
        Integer max = (Integer) candra.pop();
        while (!candra.isEmpty()){
            Integer value = (Integer) candra.pop();
            if (value > max){
                max = value;
            }
        }
        return max;
    }
    // Membuat method Upper Bounded Wilcard
    public static void showData1(Mygeneric<?> candra){
        while (!candra.isEmpty()){
            System.out.println(candra.pop());
        }
    }
    public static void showData(Mygeneric<? extends Number> cinta){
        while (!cinta.isEmpty()){
            System.out.println(cinta.pop());
        }
    }
public abstract class Shape {
        @Override
    public String toString(){
            return String.valueOf(getArea());
        }
        public abstract double getArea();
}
public class Rectangle extends Shape{
        private double h;
        private double w;
        public Rectangle(double height,double width){
            h =height;
            w = width;
        }
        @Override
    public double getArea(){
            return h * w;
        }
}
public class Circle extends Shape{
        private double r;
        public Circle(double radius){
            r = radius;
        }
        @Override
    public double getArea(){
            return Math.PI*r*r;
        }
}
    public static <E> void showDsts (E [] candra){
        for (int i = 0; i < candra.length; i++){
            System.out.println(candra[i]);
        }
    }
    public static void showData(Object[] candra){
        for (int i = 0; i < candra.length; i++){
            System.out.println(candra[i]);
        }
    }
}
