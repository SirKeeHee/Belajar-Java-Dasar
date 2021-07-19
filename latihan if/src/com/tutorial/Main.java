package com.tutorial;

public class Main {
    public static void main(String[] args){
        // latihan
        int a = 1;
        int b = 10;
        int c = 15;
        int d = 20;

        System.out.println("ini adalah awal program");

        if(a == 5){
            if(b == 10){

                System.out.println("ini adalah aksi jika a = 5 dan b = 10");

                if(c == 15){

                    System.out.println("ini adalah aksi jika a = 5 , b = 10, c = 15");

                    if(d == 20){

                        System.out.println("ini adalah aksi jika a = 5 , b = 10, c = 15 , d = 20");

                    }else{
                        System.out.println("ini adalah aksi default dimana a, b , c, d salah");

                    }
                }else{
                    System.out.println("ini adalah aksi default dimana a, b benar dan c salah");
                }
            }else{
                System.out.println("ini adalah aksi default dimana a benar b salah");
            }
        }else{
            System.out.println("ini adalah aksi dimana a salah");
        }

        System.out.println("ini adalah akhir program");

    }
}
