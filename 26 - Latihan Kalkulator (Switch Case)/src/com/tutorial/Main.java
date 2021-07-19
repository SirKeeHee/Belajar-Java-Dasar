package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args){

        //latihan kalkulator switch case
        Scanner inputUser;
        float a,b,hasil;
        String operator;

        inputUser = new Scanner(System.in);
        System.out.println("nilai a = ");
        a = inputUser.nextFloat();
        System.out.println("nilai operator = ");
        operator = inputUser.next();
        System.out.println("nilai b = ");
        b = inputUser.nextFloat();

        switch(operator){
            case "+":
                 //penjumlahan
                hasil = a + b;
                System.out.println("hasil" + hasil);
                break;
            case "-":
                //pengurangan
                hasil = a - b;
                System.out.println("hasil" + hasil);
                break;
            case "*":
                //perkalian
                hasil = a * b;
                System.out.println("hasil" + hasil);
                break;
            case "/":
                //pembagian
                hasil = a / b;
                System.out.println("hasil" + hasil);
                break;
            default:
                System.out.println("operator" + operator + "tidak ditemukan");
        }

    }
}
