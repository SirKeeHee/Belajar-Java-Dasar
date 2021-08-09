package com.tutorial;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {0,1,2,3};

        Scanner userInput = new Scanner(System.in);
        FileInputStream fileinput = null;
        System.out.print("nilai array ke: ");
        int index = userInput.nextInt();


        //exception handling (try, catch, finally)
        System.out.printf("Handling out of bound");
        try {
            System.out.printf("index ke-%d, adalah %d\n", index, array[index]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println(e);
        }

        //runtime error jika file tidak ada
        System.out.printf("Handling IO not found");
        try {
            FileInputStream fileInput = new FileInputStream("input.txt");
        }catch(IOException e){
            System.err.println(e);
        }

        //menggabungkan dua exception
        System.out.printf("Menggabungkan Dua Buah Exception");
        try{
            System.out.printf("index ke-%d, adalah %d\n", index, array[index]);
            fileinput = new FileInputStream("input.txt");
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Index yang anda masukkan tidak sesuai dengan jumlah array");
        }catch(IOException e){
            System.err.println("file tidak ditemukan");
        }

        //finally
        System.out.printf("Menambahkan Finally");
        try{
            System.out.printf("index ke-%d, adalah %d\n", index, array[index]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Index yang anda masukkan tidak sesuai dengan jumlah array");
        }finally{
            System.out.printf("Finally");
        }

        System.out.println("\nini adalah akhir program");
    }
}
