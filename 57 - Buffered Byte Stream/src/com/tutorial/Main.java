package com.tutorial;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        long waktuStart, waktuFinish;

        //Membaca dari file
        FileInputStream byteInput = new FileInputStream("input.txt");
        System.out.println(byteInput.available());

        //menghitung waktu pembacaan
        waktuStart = System.nanoTime();
        System.out.println(byteInput.readAllBytes());
        waktuFinish  = System.nanoTime();
        System.out.println("waktu = " + (waktuFinish - waktuStart));
        byteInput.close();

        //Membaca dari memory
        FileInputStream byteInput2 = new FileInputStream("input.txt");
        BufferedInputStream bufferedInput = new BufferedInputStream(byteInput2);

        bufferedInput.mark(200);
        //menghitung waktu pembacaan
        waktuStart = System.nanoTime();
        System.out.println(bufferedInput.readAllBytes());
        waktuFinish  = System.nanoTime();
        System.out.println("waktu = " + (waktuFinish - waktuStart));

        //baca ulang
        bufferedInput.reset();
        byte [] data = bufferedInput.readAllBytes();
        String dataString = new String(data);
        System.out.println(dataString);

        //Menulis dengn buffered output

        FileOutputStream byteOutput = new FileOutputStream("output.txt");
        BufferedOutputStream bufferedOutput = new BufferedOutputStream(byteOutput);

        //write data berupa output
        bufferedOutput.write(data,0,data.length);
        bufferedOutput.flush();

        bufferedOutput.close();
        byteOutput.close();


    }
}
