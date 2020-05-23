package com.sama;

public class OperatorBitwise {
    public static void main(String[] args){
//        Operator Bitwise-----> Sebuah operator untuk melakukan nilai bit
        byte a = 5;
        byte b,c,d;
        String a_bits,b_bits,c_bits,d_bits;

//        Operator Shif Left
        System.out.println("==== Shift left (<<<)");
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace( ' ', '0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = (byte)(a << 3);
        b_bits = String.format("%8s",Integer.toBinaryString(b)). replace( ' ', '0');
        System.out.printf("%s = %d \n",b_bits, b);

//        operator Shift Right
        System.out.println("====== SHIFT RIGHT(>>>)");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace( ' ', '0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = (byte) (a >> 1);
        b_bits = String.format("%8s",Integer.toBinaryString(b)). replace( ' ', '0');
        System.out.printf("%s = %d \n",b_bits, b);

//        operator bitwise OR
        System.out.println("====== Bitwise OR");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace( ' ', '0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = 12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)). replace( ' ', '0');
        System.out.printf("%s = %d \n",b_bits, b);
        System.out.println("Hasil dari =======OR");
        c = (byte) (a | b );
        c_bits = String.format("%8s",Integer.toBinaryString(b)). replace( ' ', '0');
        System.out.printf("%s = %d \n",c_bits, c);

//        operator bitwise AND
        System.out.println("====== Bitwise AND");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace( ' ', '0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = 10;
        b_bits = String.format("%8s",Integer.toBinaryString(b)). replace( ' ', '0');
        System.out.printf("%s = %d \n",b_bits, b);
        System.out.println("hasil dari ======= AND");
        d = (byte) ( a & b);
        d_bits =  String.format("%8s",Integer.toBinaryString(b)). replace( ' ', '0');
        System.out.printf("%s = %d \n",d_bits, d);

//        operator bitwise XOR
        System.out.println("====== Bitwise XOR (^)");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace( ' ', '0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = 10;
        b_bits = String.format("%8s",Integer.toBinaryString(b)). replace( ' ', '0');
        System.out.printf("%s = %d \n",b_bits, b);
        System.out.println("hasil dari ======= XOR");
        d = (byte) ( a ^ b);
        d_bits =  String.format("%8s",Integer.toBinaryString(b)). replace( ' ', '0');
        System.out.printf("%s = %d \n",d_bits, d);


    }
}
