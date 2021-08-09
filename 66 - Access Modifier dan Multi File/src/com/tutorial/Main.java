package com.tutorial;

import foodmachine.util.Memasak;

public class Main {
    public static void main(String[] args) {
        //public, private, default, protected

        // dengan access modifier public, dapat diakses
        Lain.methodPublic();

        // dengan access modifier private, tidak dapat diakses
        //Lain.methodPrivate():

        //karena ada dalam package yang sama, maka dapat diakses
        Lain.methodDefault();

        //dapat diakses di package lain dengan syarat import dahulu
        //karena ada dalam package yang sama, maka dapat diakses
        Lain.methodProtected();

        Memasak.dagingPublic();
        //Memasak.dagingPrivate(); //tidak bisa karena classnya berbeda

        //Memasak.dagingDefault(); //tidak bisa karena packagenya berbeda

        //Memasak.dagingProtected(); //tidak bisa karena packagenya berbeda


    }



}
