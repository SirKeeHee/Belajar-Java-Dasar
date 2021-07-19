package com.tutorial;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        //kesimpulan perkalian atau pembagian akan dilakukan terlebih dahulu
        //jika dilakukan perkaklian dan pembagian, maka  akan dilakukan operasinya dari kiri ke kanan
        int hasil = 5 * 10 / 2;

        System.out.println(hasil);
        hasil = 5 + 2 - 10;
        System.out.println(hasil);

        //mengelompokkan hasil dengan ( )
        hasil = 5 * (2 + 10);
        System.out.println(hasil);

        Scanner userInput = new Scanner(System.in);
        // perhitungan persamaan kuadrat
        System.out.println("MENGHITUNG PERSAMAAN KUADRAT");

        int m,x,c;

        System.out.print("nilai x = ");
        x = userInput.nextInt();
        System.out.print("gradient m = ");
        m = userInput.nextInt();
        System.out.print("bias c = ");
        c = userInput.nextInt();
        int y = (m * x * x) + c;

        System.out.println("nilai y = " + y);





    }
}
