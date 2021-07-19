package com.tutorial;

import java.util.*;

public class Main {
    //switch case
    public static void main(String [] args){


        String input;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("panggil nama: ");
        input = inputUser.next();

        //ekspresinya bisa berupa int, short, long, byte, string, enum
        switch(input){
            case "otong":
                System.out.println("Saya otong dan hadir bos");
                break;
                //tanda break agar semua tidak terjalankan, jika tidak ada tanda break semua akan ikut dijalankan
            case "ucup":
                System.out.println("Saya ucup dan hadir bos");
                break;
            case "mario":
                System.out.println("Saya mario dan hadir bos");
                break;
            default:
                System.out.println(input + " tidak hadir bos");
        }

        System.out.println("selesai program");


    }
}
