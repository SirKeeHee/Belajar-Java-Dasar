package com.tutorial;

public class Main {
    public static void main(String[] args){
        // nested if / if bersarang
        int a = 5;
        int b = 10;

        System.out.println("ini adalah awal program");

        if(a == 5){

            if(b == 10){

                System.out.println("ini adalah aksi jika a = 5 dan b = 10");

            }else{
                System.out.println("ini adalah aksi jika a = 5 dan b bukan = 10");
            }

        }else{

            System.out.println("ini adalah aksi default dimana a dan b salah");


        }

        System.out.println("ini adalah akhir program");

    }
}
