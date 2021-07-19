package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args){

        //menghitung nilai deret fibonacci
        int f_n, f_n_1, f_n_2, n;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("mengambil nilai fibonacci ke - : ");
        n = inputUser.nextInt();

        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;

        //menggunakan for while
        for(int i = 1; i <= n; i++){
            System.out.println("nilai ke - " + i + " adalah " + f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
        }

        //menggunakan while
        int i = 1;
        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;

        while(i <= n ){
            i++;
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
            System.out.println("nilai ke - " + i + " adalah " + f_n);
        }

        //menggunakan do while
        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;
        i = 1;
        do{
            System.out.println("nilai ke - " + i + " adalah " + f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
            i++;

        }while(i <= n);


        }
    }
