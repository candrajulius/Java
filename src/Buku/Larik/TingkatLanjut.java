package Buku.Larik;

import com.sun.jdi.ArrayReference;
import com.sun.security.jgss.GSSUtil;

import java.lang.reflect.Array;
import java.util.*;

public class TingkatLanjut {
    public static void main(String[] args) {
        System.out.println("penggunaan list ");
        List list = new ArrayList();
        list.add("Candra Julius Sinaga"); // menambahkan data sebuah obeject untuk disimpan dalam sebuah variabel
        list.add("Nama mama saya Julita Theodota Sitanggang ");
        list.add("Nama bapak saya Maruli Tua Sinaga ");
        System.out.println("======= Cara pertama ======= ");
        String candra = (String)list.get(0); // untuk menampilkan data koleksian tersebut dilayar
        String candra1 = (String)list.get(1);
        String candra2 = (String)list.get(2);
        System.out.println(candra);
        System.out.println(candra1);
        System.out.println(candra2);
        System.out.println("\n===== Cara Kedua ===== ");
        Iterator candra45 = list.iterator();
        while (candra45.hasNext()){
            System.out.println(candra45.next());
        }
        System.out.println("\n");
        Object candra12 = list.remove(candra);
        System.out.println(candra12);
        candra45 = list.iterator();
        while (candra45.hasNext()){
            System.out.println(candra45.next());
        }
        System.out.println("\n Penggunaan Set ");
        Set set = new HashSet();
        set.add("Candra Julius Sinaga ");
        set.add(1);
        set.add("Julius Sinaga ");
        Iterator set1 = set.iterator();
        while (set1.hasNext()){
            System.out.println(set1.next());
        }
        // kesimpulan dari set adalah sebuah object yang sama dengan list akan tetanpi object tersebut akan
        System.out.println("\n Penggunaan map ");
        Map map = new HashMap();
        String nama = " nama saya candra julius sinaga";
        String nama1 = " nama saya manusia keparat ";
        map.put(4,nama);
        map.put(2,nama1);
        map.put(1,"Mama saya adalah Julita Theodota Sitangang");
        String element = (String)map.get(4);
        System.out.println(element);
        Iterator map2 = map.keySet().iterator();
        while (map2.hasNext()){
            Object key = map2.next();
            Object value = map.get(key);
            System.out.println( "key " + key);
            System.out.println("value " + value);
        }
        System.out.println("\n");
        Object remove =  map.remove(2);
        System.out.println(remove);
        map2 = map.keySet().iterator();
        while (map2.hasNext()){
            Object key = map2.next();
            Object value = map.get(key);
            System.out.println("key  " + key);
            System.out.println(" value " + value);
        }
        System.out.println("\n Penggunaan Queue ");
        Queue que = new LinkedList();
        que.add("Candra Julius Sinaga");
        que.add("Julius Kemana ");
        que.add("Dimana dia Sekarang");
        System.out.println(que.element() + "\n");
        Iterator que1 = que.iterator();
        while (que1.hasNext()){
            String que3 = (String)que1.next();
            System.out.println(que3);
        }
        System.out.println("Penggunaan Stack ");
        Stack stack = new Stack();
        // Push untuk menambahkan element
        stack.push(2);
        stack.push("Julius Candra Sinaga ");
        stack.push("Sinaga anak orang ");
        Object push1 = stack.firstElement(); // Untuk menampilkan element pertama
        System.out.println(push1);
        Iterator stack2 = stack.iterator();
        while (stack2.hasNext()){
            System.out.println(stack2.next());
        }
        System.out.println(" Menghapus data terakhir dalam koleksian = " + stack.pop()); // pop itu kegunaan untuk menghilangkan data terakhir yang masuk dari koleksi
       Object candra3 = stack.remove((Object)2);
        System.out.println("Menghapus data pada indeks ke 2 " + candra3 + "\n");
     stack2 = stack.iterator();
     while (stack2.hasNext()){
         System.out.println(stack2.next());
     }
     // kesimpulan dari stack adalah last in dan last out dalam sebuah data koleksian
    }

}
