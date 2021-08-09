package com.tutorial;

//import java library
import java.io.*;
import java.time.Year;
import java.util.*;

//import CRUD library
import CRUD.Operasi;
import CRUD.Utility;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner userInput = new Scanner(System.in);
        String userOption;
        boolean isContinue = true;
        while (isContinue){
            Utility.clrScreen();
            System.out.println("====Database Perpustakaan====\n");
            System.out.println("1.\t Lihat Seluruh Buku");
            System.out.println("2.\t Cari Buku");
            System.out.println("3.\t Tambah Data Buku");
            System.out.println("4.\t Ubah Data Buku");
            System.out.println("5.\t Hapus Data Buku");
            System.out.print("\n\nPilihan Anda = ");
            userOption = userInput.next();
            switch (userOption) {
                case "1":
                    System.out.println("\n=================");
                    System.out.println("List Seluruh Buku");
                    System.out.println("=================");
                    Operasi.tampilData();
                    break;
                case "2" :
                    System.out.println("\n================");
                    System.out.println("Cari Data Buku");
                    System.out.println("================");
                    Operasi.cariData();
                    break;
                case "3" :
                    System.out.println("\n=================");
                    System.out.println("Tambah Data Buku");
                    System.out.println("=================");
                    Operasi.tambahData();
                    Operasi.tampilData();
                    break;
                case "4" :
                    System.out.println("\n=================");
                    System.out.println("Ubah Data Buku");
                    System.out.println("=================");
                    Utility.ubahData();
                    break;
                case "5":
                    System.out.println("\n=================");
                    System.out.println("Hapus Data Buku");
                    System.out.println("=================");
                    Utility.hapusData();
                    break;
                default:
                    System.err.print("\nInput anda tidak benar silahkan masukan input sebagai berikut \n" +
                            "1,2,3,4,5");
            }

            isContinue = CRUD.Utility.getYesOrNo("Apakah anda ingin melanjutkan?(y/n)");

        }
    }





}