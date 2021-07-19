package com.tutorial;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        int[] arrayAngka1 = {1,2,3,4,5};

        //mengubah array menjadi string
        System.out.println("\nMerubah array menjadi string\n==========");
        printArray(arrayAngka1);

        //mengcopy array
        System.out.println("\nMengcopy array\n==========");
        int [] arrayAngka2 = new int[5];
        printArray(arrayAngka1);
        printArray(arrayAngka2);

        System.out.println("\nMengcopy dengan loop");
        for(int i = 0; i < arrayAngka1.length; i++){
            arrayAngka2[i] = arrayAngka1[i];
        }
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka2);
        System.out.println(arrayAngka2);

        System.out.println("\nMengcopy dengan copyOf");
        int [] arrayAngka3 = Arrays.copyOf(arrayAngka1,5);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka3);
        System.out.println(arrayAngka3);

        System.out.println("\nMengcopy dengan copyOfRange");
        int [] arrayAngka4 = Arrays.copyOfRange(arrayAngka1,3,5);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka4);
        System.out.println(arrayAngka4);

        //fill array
        System.out.println("\nFill Array\n==========");
        int [] arrayAngka5 = new int [7];
        printArray(arrayAngka5);
        Arrays.fill(arrayAngka5,5);
        printArray(arrayAngka5);

        //komparasi array
        System.out.println("\nKomparasi Array\n==========");
        int [] arrayAngka6 = {1,2,3,4,5};
        int [] arrayAngka7 = {1,2,3,4,5};

        System.out.println("\nMembandingkan antara dua buah array");
        System.out.println(Arrays.equals(arrayAngka6,arrayAngka7));

        if(Arrays.equals(arrayAngka6,arrayAngka7)){
            System.out.println("array ini sama");
        }else{
            System.out.println("array ini beda");
        }

        System.out.println("\nMengecek array mana yang lebih besar");
        System.out.println(Arrays.compare(arrayAngka6,arrayAngka7));

        System.out.println("\nMengecek index mana yang lebih besar");
        System.out.println(Arrays.mismatch(arrayAngka6,arrayAngka7));

        //sort array
        System.out.println("\nSort Array\n==========");
        int [] arrayAngka8 = {1,6,4,5,3,5,2,6};
        printArray(arrayAngka8);
        Arrays.sort(arrayAngka8);
        printArray(arrayAngka8);

        //search array
        System.out.println("\nSearch Array\n==========");
        int angka = 3;
        int posisi = Arrays.binarySearch(arrayAngka8,angka);
        //binary search wajib di sort dulu
        System.out.println("angka " + angka + " ada di index " + posisi);
    }
    private static void printArray(int[] dataArray){
        System.out.println("array = " + Arrays.toString(dataArray));
    }
}
