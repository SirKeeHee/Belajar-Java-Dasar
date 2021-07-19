package com.tutorial;

public class Main {
    public static void main(String[] args){

        // while (kondisi){
        //      aksi
        // }

        int a = 0;
        boolean kondisi = true;


        System.out.println("ini adalah awal program");
        while (kondisi){
            System.out.println("while loop ke-" + a);
            a++;
            //a++ duluan berenti di angka 9, jika a++(decrement) dibawah if maka tepat berhenti di angka 10
            if (a == 10){
                kondisi = false;
            }
            //a++;
        }
        System.out.println("ini adalah akhir program");

    }
}
