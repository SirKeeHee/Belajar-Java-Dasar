package com.tutorial;

public class Main {

        public static void main(String[] args){

            //tipe data di java
            //integer, byte, short, long, double, float, char, boolean

            //integer(satuan)
            int i = 10;
            System.out.println("-----INTEGER-----");
            System.out.println("nilai integer i =" + i);
            System.out.println("Nilai max = " + Integer.MAX_VALUE);
            System.out.println("Nilai min = " + Integer.MIN_VALUE);
            System.out.println("Besar Integer = " + Integer.BYTES + " bytes");
            System.out.println("Besar Integer = " + Integer.SIZE + " bit");

            //byte(satuan)
            byte b = 10;
            System.out.println("-----BYTE-----");
            System.out.println("nilai byte b =" + b);
            System.out.println("Nilai max = " + Byte.MAX_VALUE);
            System.out.println("Nilai min = " + Byte.MIN_VALUE);
            System.out.println("Besar Byte = " + Byte.BYTES + " bytes");
            System.out.println("Besar Byte = " + Byte.SIZE + " bit");

            //short(satuan)
            short s = 10;
            System.out.println("-----SHORT-----");
            System.out.println("nilai short s =" + s);
            System.out.println("Nilai max = " + Short.MAX_VALUE);
            System.out.println("Nilai min = " + Short.MIN_VALUE);
            System.out.println("Besar Short = " + Short.BYTES + " bytes");
            System.out.println("Besar Short = " + Short.SIZE + " bit");

            //long(satuan)
            long l = 10L;
            System.out.println("-----LONG-----");
            System.out.println("nilai long l =" + l);
            System.out.println("Nilai max = " + Long.MAX_VALUE);
            System.out.println("Nilai min = " + Long.MIN_VALUE);
            System.out.println("Besar Long = " + Long.BYTES + " bytes");
            System.out.println("Besar Long = " + Long.SIZE + " bit");

            //double(koma, bilangan real)
            double d = -10.5d;
            System.out.println("-----DOUBLE-----");
            System.out.println("nilai double d =" + d);
            System.out.println("Nilai max = " + Double.MAX_VALUE);
            System.out.println("Nilai min = " + Double.MIN_VALUE);
            System.out.println("Besar Double = " + Double.BYTES + " bytes");
            System.out.println("Besar Double = " + Double.SIZE + " bit");

            //float(koma, bilangan real)
            float f = -9.5f;
            System.out.println("-----FLOAT-----");
            System.out.println("nilai float f =" + f);
            System.out.println("Nilai max = " + Float.MAX_VALUE);
            System.out.println("Nilai min = " + Float.MIN_VALUE);
            System.out.println("Besar Float = " + Float.BYTES + " bytes");
            System.out.println("Besar Float = " + Float.SIZE + " bit");

            //char(karakter) berdasarkan ASCII
            char c = 'c';
            System.out.println("-----CHAR-----");
            System.out.println("nilai char c =" + c);
            System.out.println("Nilai max = " + Character.MAX_VALUE);
            System.out.println("Nilai min = " + Character.MIN_VALUE);
            System.out.println("Besar Character = " + Character.BYTES + " bytes");
            System.out.println("Besar Character = " + Character.SIZE + " bit");

            //boolean(nilai true atau false)
            boolean val = true;
            System.out.println("-----BOOLEAN-----");
            System.out.println("nilai boolean val =" + val);
            System.out.println("Nilai max = " + Boolean.TRUE);
            System.out.println("Nilai min = " + Boolean.FALSE);
        }
}