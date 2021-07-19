package com.tutorial;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //membuat string
        String kataString = "hallo";

        char[] kataChar = {'h','a','l','l','o'};

        //menampilkan string
        System.out.println(kataString);
        System.out.println(Arrays.toString(kataChar));

        //mengakses komponen dari string
        System.out.println("komponen pertama dari char[] = " + kataChar[0]);
        System.out.println("komponen pertama dari String = " + kataString.charAt(0));

        //merubah komponen dari string itu tidak bisa karena string di java itu immutable
        kataChar[0] = 'c';

        System.out.println(Arrays.toString(kataChar));

        //kataString[0] = "c" <------ tidak bisa
        //kataString.charAt[0] = "c" <------ tidak bisa

        //string bisa diubah secara tidak langsung

        printAddress("kataString",kataString);
        kataString ="c" + kataString.substring(1,5);

        System.out.println(kataString);

        printAddress("kataString",kataString);

        //memory dari String(String pool)
        String str_1 = "hallo";
        String str_2 = "test";
        String str_3 = "testing";

        printAddress("str_1",str_1);
        printAddress("str_2",str_2);
        printAddress("str_3",str_3);

        str_3 = str_3.substring(0,4);
        printAddress("str_3",str_3);

        String str_4 = "callo";
        printAddress("str_4",str_4);

        kataString = "callo";
        printAddress("kataString",kataString);

        //kesimpulan
        // 1. String di java itu immutable
        // 2. String yang berada di string pool itu akan reusable, memorynya lebih efisien
        // 3. Membuat string dengan method baru , maka dia akan ditaro di memory lain bukan di string pool

        //lihat lebih dalam

        String a = new String("hallo");
        printAddress("a",a);

    }
    private static void printAddress(String nama, String data){
        int address = System.identityHashCode(data);
        System.out.println(nama + " = " + data + "\t || address = " + Integer.toHexString(address));
    }
}
