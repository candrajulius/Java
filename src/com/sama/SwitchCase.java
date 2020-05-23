package com.sama;
import java.util.*;
public class SwitchCase {
    public static void main(String[] args){
        System.out.println("ini adalah assisten saya");
        String input;
        Scanner inputUser = new Scanner(System.in);
        System.out.print("panggil nama = ");
        input = inputUser.next();
        switch (input) {
            case "Candra":
                System.out.println("Saya Candra hadir");
                break;
            case "Julius":
                System.out.println("Saya Julius Hadir pak");
                break;
            default:
                System.out.println(input + " " + "tidak Hadir");
        }
        System.out.println("Selesai Program");
    }
}
