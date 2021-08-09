package com.tutorial;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner terminalInput = new Scanner(System.in);
        String pilihanUser;
        boolean isLanjutkan = true;

        while (isLanjutkan) {
        clearScreen();
        System.out.println("Database Perpustakaan");
        System.out.println("1.\t Lihat seluruh buku");
        System.out.println("2.\t Cari data buku");
        System.out.println("3.\t Tambah data buku");
        System.out.println("4.\t Ubah data buku");
        System.out.println("5.\t Hapus data buku");

        System.out.print("\n\nPilihan anda: ");
        pilihanUser= terminalInput.next();

            switch (pilihanUser) {
                case "1":
                    System.out.println("\n=================");
                    System.out.println("LIST SELURUH BUKU");
                    System.out.println("=================");
                    tampilkanData();
                    break;
                case "2":
                    System.out.println("\n=========");
                    System.out.println("CARI DATA BUKU");
                    System.out.println("=========");
                    //cari data
                    break;
                case "3":
                    System.out.println("\n================");
                    System.out.println("TAMBAH DATA BUKU");
                    System.out.println("================");
                    //tambah data
                    break;
                case "4":
                    System.out.println("\n================");
                    System.out.println("UBAH DATA BUKU");
                    System.out.println("================");
                    //ubah data
                    break;
                case "5":
                    System.out.println("\n================");
                    System.out.println("HAPUS DATA BUKU");
                    System.out.println("================");
                    //hapus data
                    break;
                default:
                    System.err.println("\nInput data anda tidak ditemukan\nSilahkan masukkan angka[1-5]");
            }

            isLanjutkan = getYesorNO("Apakah anda ingin melanjutkan");
        }

    }

    private static void tampilkanData() throws IOException {
        System.out.println("Kita akan menampilkan seluruh data disini");

        boolean isTambah = getYesorNO("Apakah anda ingin menambah data");
    }

    private static boolean getYesorNO(String Message){
        Scanner terminalInput = new Scanner(System.in);
        System.out.println("\n"+ Message + " (y/n)? ");
        String pilihanUser = terminalInput.next();

        while(!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")){
            System.err.println("Pilihan anda bukan y atau n");
            System.out.println("\n"+ Message + " (y/n)? ");
            pilihanUser = terminalInput.next();
        }

        return pilihanUser.equalsIgnoreCase("y");
    }

    private static void clearScreen(){
        try{
            if(System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            }else{
                System.out.print("\033\143");
            }
        }catch(Exception ex){
            System.err.println("Tidak bisa clear screen");
        }
    }
}
