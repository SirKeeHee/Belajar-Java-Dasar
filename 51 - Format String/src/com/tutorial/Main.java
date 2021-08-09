package com.tutorial;

import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        String nama = "Udin";
        int umur = 17;

        //output : Nama saya adalah Udin, umur saya adalah 17
        System.out.println("Nama saya adalah " + nama + ", umur saya adalah " + umur);

        //cara lainnya dengan format string
        System.out.printf("Nama saya adalah %s, umur saya adalah %d\n", nama, umur);

        //conversion : f = floating point, d = integer, c = character, s = string, b = boolean

        //struktur format = %[argumen_index$][flags][width][.precision]conversion

        //[argumen_index$]
        System.out.println("\n[argumen_index$]");

        //udin, wahai udin, kemana saja kamu udin
        System.out.printf("%1$s, wahai %1$s, kemana saja kamu %1$s?\n", nama);
        //umur udin berapa?, udin menjawab: 17, wah masih muda ya umurnya 17
        System.out.printf("\numur %1$s berapa?, \n%1$s menjawab: %2$s, \nwah masih muda ya umurnya %2$s\n", nama,umur);

        //[flags]
        System.out.printf("\n[flags]");

        int int1 = 5;
        int int2 = 8;
        int hasil = int1 - int2;
        System.out.printf("\n%d - %d = %+d",int1,int2,hasil);

        int int3 = 6;
        int int4 = 12;
        int hasil2 = int3 + int4;
        System.out.printf("\n%d + %d = %+d\n",int3,int4,hasil2);

        //[width]
        System.out.printf("\n[width]");
        int int5 = 1000;
        System.out.println("INTEGER");
        System.out.printf("%d\n",int5);
        System.out.printf("%5d\n",int5);
        System.out.printf("%-5d\n",int5); // flags = "-", artinya rata kiri
        System.out.printf("%+5d\n",int5); // flags = "+", flags akan mengambil slot dari format
        System.out.printf("%+-6d\n",int5);// flags bisa digabungkan "+-"
        System.out.printf("%10d\n",int5);
        System.out.printf("% 10d\n",int5);
        System.out.printf("%010d\n",int5);// flags = "0", kita tambahkan leading "0"
        System.out.printf("%+10d\n",int5);
        int int6 = 100000000;
        System.out.printf("%-,15d\n",int6);// flags = ",", menandakan delimeter per seribu

        System.out.printf("\nFLOATING POINT\n");
        float float1 = 1.543f;
        System.out.printf("%f\n", float1);
        System.out.printf("%+9f\n", float1); // floating point akan mengambil width dengan 6 decimal

        //[.precision]
        System.out.printf("\n[.precision\n]");
        float float2 = 15.678f;
        System.out.printf("%f\n", float2);
        System.out.printf("%.1f\n", float2);
        System.out.printf("%.2f\n", float2);
        System.out.printf("%8.2f\n", float2);// gabungkan dengan width
        System.out.printf("%08.2f\n", float2);// gabungkan dengan width dan flags

        //contoh
        String nama2 = "ucup";
        float IPK = 3.7812831238132f;

        //struktur format = %[argumen_index$][flags][width][.precision]conversion
        
        System.out.printf("\nIPK %1$s berapa?, \n%1$s : saya dapet %2$+5.2f\n", nama2,IPK);

        //kesimpulan

        // save format ini kedalam variabel string
        String info_biasa = "nama: " + nama2 + ", IPK = " + IPK;
        System.out.println("biasa -> " + info_biasa);

        String info_format = String.format("nama: %s, IPK = %2$+5.2f", nama2,IPK);
        System.out.println("string_format -> " + info_format);

        //save format ini kedalam string builder

        StringBuilder builder_info = new StringBuilder();
        Formatter formatBuilder = new Formatter(builder_info);

        formatBuilder.format("nama: %s, IPK = %2$+5.2f",nama2,IPK);
        System.out.println("string builder_format -> " + builder_info);
    }
}
