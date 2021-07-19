package com.tutorial;

public class Main {
    public static void main(String[] args){

       // do {
       //     aksi
       // }while (kondisi);

        System.out.println("ini  adalah awal program");

        int a = 0;
        boolean kondisi = true;

        do{
            a++;
            //a++ duluan do while ke 1, jika do while dibawah maka do while ke 0
            System.out.println("do while ke-" + a);
            //a++
            if (a==10){
                kondisi = false;
            }
        }while(kondisi);
        System.out.println("ini adalah akhir program");

    }
}
