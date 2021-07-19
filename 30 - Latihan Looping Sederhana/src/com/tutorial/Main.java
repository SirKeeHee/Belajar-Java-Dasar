package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //program untuk menjumlahkan angka dengan rentang
        //menggunakan while

        int nilaiAwal, nilaiAkhir, total;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("masukan nilai awal = ");
        nilaiAwal = inputUser.nextInt();
        System.out.print("masukan nilai akhir = ");
        nilaiAkhir = inputUser.nextInt();

        total = 0;

        while (nilaiAwal <= nilaiAkhir) {

            total = total + nilaiAwal;
            System.out.println("ditambah " + nilaiAwal + "menjadi " + total);
            nilaiAwal++;
        }

        // menggunakan do while
        total = 0;

        do {
            total = total + nilaiAwal;
            System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
            nilaiAwal++;
        } while (nilaiAwal <= nilaiAkhir);


        // menggunakan for loop
        total = 0;

        for (; nilaiAwal <= nilaiAkhir; nilaiAwal++) {
            total = total + nilaiAwal;
            System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
        }
    }
}
