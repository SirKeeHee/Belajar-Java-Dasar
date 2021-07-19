package com.tutorial;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //cara membuat array 2 dimensi dengan assignments

        int[][] array_2D = {
                {1, 2},
                {3, 4}
        };

        printArray_2D(array_2D);

        //cara membuat array 2 dimensi dengan deklarasi
        //[baris] [kolom]

        int[][] arrayAngka = new int[5][4];

        printArray_2D(arrayAngka);

        //looping lengkap dengan manual

        // for(int i = 0; i < arrayAngka.length; i++){
        //System.out.print("[");
        //  for(int j = 0; j < arrayAngka[i].length; j++){
        //    System.out.print(arrayAngka[i][j] + ",");
        // }
        // System.out.print("]\n");
        //}

        //looping foreach
        //for (int [] baris: arrayAngka) {
        //  System.out.print("[");
        //{ for (int angka: baris) {
        //  System.out.print(angka + ",");
        //  }
        //System.out.print("]\n");
        //}
        //}
        //array secara manual, untuk pembuktian

        int[][] array_2D_2 = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},

        };

        printArray_2D(array_2D_2);

        int [][] array_ragged = {
                {1,2,3},
                {4,5,6,7},
                {8}
        };
        printArray_2D(array_ragged);

        }

        private static void printArray_2D(int[][] dataArray){
            System.out.print("{");
            for (int[] baris : dataArray) {
                System.out.print("[");
                {
                    for (int angka : baris) {
                        System.out.print(angka + ",");
                    }
                    System.out.print("]\n");
                }
                System.out.print("}\n");
            }
        }
    }
