package com.tutorial;

public class Main {
    public static void main(String[] args){

        System.out.println("test");

        int hasilInteger;
        hasilInteger = tambah (4,5);
        printAngka(hasilInteger);

        float hasilFloat;

        hasilFloat = tambah(4.5f,4);
        printAngka(hasilFloat);

        hasilFloat = tambah(4, 4.5f);
        printAngka(hasilFloat);

        hasilInteger = tambah (11, 12, 13);
        printAngka(hasilInteger);

        hasilFloat = tambah(6.7f,5);
        printAngka(hasilFloat);


        printAngka(5);
        printFloat(10.5f);
        printdouble(10.7d);

    }
    private static void printAngka(float angkaFloat){
        System.out.println("ini adalah angka float dengan nilai " + angkaFloat );
    }
    private static int tambah(int angkaInt1, int angkaInt2, int angkaInt3){
        return angkaInt1 + angkaInt2 + angkaInt3;
    }

    private static float tambah(int angkaInt2,float angkaFloat1){
        return angkaFloat1 + angkaInt2;
    }

    private static float tambah(float angkaFloat1, int angkaInt2){
        return angkaFloat1 + angkaInt2;
    }

    private static int tambah(int angkaInt1, int angkaInt2){
        return angkaInt1 + angkaInt2;
    }

    private static void printdouble(double angkaDouble){
        System.out.println("ini adalah angka double dengan nilai " + angkaDouble );
    }

    private static void printFloat(float angkaFloat){
        System.out.println("ini adalah angka float dengan nilai " + angkaFloat );
    }

    private static void printAngka(int angkaInteger){
        System.out.println("ini adalah angka integer dengan nilai " + angkaInteger );
    }
}
