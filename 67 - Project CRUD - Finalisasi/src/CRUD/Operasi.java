package CRUD;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Operasi {
    public static void tampilData() throws IOException {

        FileReader fileInput;
        BufferedReader fileInputBuffered;
        try {
            fileInput = new FileReader ("database.txt");
            fileInputBuffered = new BufferedReader(fileInput);
        }catch (Exception e){
            System.err.println("\ndatabase tidak tersedia");
            System.err.println("silahkan tambah data terlebih dahulu");
            tambahData();
            return;
        }
        System.out.print("\n--------------------------------------------------------------------------");
        System.out.println("\n| No |\tTahun |\t Penulis              |\t Penerbit   |\t Judul           |");
        System.out.print("--------------------------------------------------------------------------\n");

        String isiFile = fileInputBuffered.readLine();
        int no = 1;
        while (isiFile != null) {
            StringTokenizer file = new StringTokenizer(isiFile, ",");

            file.nextToken();
            System.out.printf("| %02d |", no);
            System.out.printf("  %4s  |", file.nextToken());
            System.out.printf("\t%-20s  |", file.nextToken());
            System.out.printf("\t%-10s  |", file.nextToken());
            System.out.printf("\t%-15s  |", file.nextToken() );
            System.out.println();
            isiFile = fileInputBuffered.readLine();
            no++;
        }
        System.out.println("--------------------------------------------------------------------------");
        boolean isTambah = Utility.getYesOrNo("Apakah anda ingin menambah data buku?(y/n)");
    }

    public static void cariData() throws IOException{
        // membaca
        FileReader fileInput;
        BufferedReader fileInputBuffered;
        try {
            fileInput = new FileReader ("database.txt");
        }catch (Exception e){
            System.err.println("\ndatabase tidak tersedia");
            System.err.println("silahkan tambah data terlebih dahulu");
            return;
        }

        // ambil keyword dari user
        Scanner userKey = new Scanner(System.in);
        System.out.println("Masukan Keyword data yang ingin dicari");
        String hasil = userKey.nextLine();
        String[] keyword = hasil.split("\\s");

        // cek keywoard di database
        checkBuku(keyword,true);
    }

    //default accesss modifier
    static boolean checkBuku(String[] keyword , boolean isDisplay) throws IOException{
        FileReader database = new FileReader("database.txt");
        BufferedReader databaseBuff = new BufferedReader(database);
        String data = databaseBuff.readLine();
        boolean isExist = false;
        int no = 0;
        if (isDisplay){
            System.out.println("====Hasilnya====");
            System.out.print("\n--------------------------------------------------------------------------");
            System.out.println("\n| No |\tTahun |\t Penulis              |\t Penerbit   |\t Judul           |");
            System.out.print("--------------------------------------------------------------------------\n");
        }
        while(data != null){
            // System.out.println(Arrays.toString(keyword));

            // cekk keyword
            isExist = true;
            for (String keywords : keyword ){
                isExist = isExist && data.toLowerCase().contains(keywords.toLowerCase());
            }

            // jika keyword cocok maka akan menampilkan
            if (isExist){
                if (isDisplay){
                    no++;
                    StringTokenizer hasil = new StringTokenizer(data,",");

                    hasil.nextToken();
                    System.out.printf("| %02d |", no);
                    System.out.printf("  %4s  |", hasil.nextToken());
                    System.out.printf("\t%-20s  |", hasil.nextToken());
                    System.out.printf("\t%-10s  |", hasil.nextToken());
                    System.out.printf("\t%-15s  |", hasil.nextToken() );
                    System.out.println();
                }else{
                    break;
                }
            }
            data = databaseBuff.readLine();
        }
        if (isDisplay){
            System.out.println("--------------------------------------------------------------------------");
        }
        return isExist;
    }

    public static void tambahData() throws IOException{
        //mengambil inputan user
        Scanner scan  = new Scanner(System.in);
        // menggunakan append untuk menambahkan dibelakangnya bukan menulis ulang
        FileWriter fileOutput = new FileWriter("database.txt",true);
        BufferedWriter fileOutputBuff = new BufferedWriter(fileOutput);

        String penulis,judul,penerbit,tahun;

        // mengambil inputan dari untuk penulis
        System.out.print("Masukan Penulis : ");
        penulis = scan.nextLine();

        // mengambil inputan untuk judul
        System.out.print("Masukan Judul Buku : ");
        judul = scan.nextLine();

        // mengambil inputan untuk penerbit
        System.out.print("Masukan Penerbit Buku : ");
        penerbit = scan.nextLine();

        // mengambil inputan untuk tahun
        System.out.print("Masukan Tahun Terbit : ");
        tahun = scan.next();
        tahun = Utility.parseYear(tahun);

        String[] keyword = {tahun+","+penulis+","+penerbit+","+judul};
        boolean isExist = checkBuku(keyword,false);

        //memasukan data ke database
        if(!isExist){
            String penulisPrimary = penulis.replaceAll("\\s","");
            long noEntry = ambilNoEntry(penulis,tahun) + 1;
            String primaryKey = penulisPrimary + "_" + tahun + "_" + noEntry;
            System.out.println("data yang akan anda masukan adalah ");
            System.out.println("------------------------------------");
            System.out.println("Primary Key  : " + primaryKey);
            System.out.println("Tahun Terbit : " + tahun);
            System.out.println("Penulis      : " + penulis);
            System.out.println("Judul        : " + judul);
            System.out.println("Penerbit     : " + penerbit);
            boolean isTambah = Utility.getYesOrNo("Apakah anda ingin menambah data tersebut?");
            if (isTambah){
                fileOutputBuff.write(primaryKey + "," + tahun + "," + penulis + "," +
                        penerbit + "," + judul);
                fileOutputBuff.newLine();
                fileOutputBuff.flush();
            }
        }else{
            System.err.println("Buku sudah tersedia");
            checkBuku(keyword,true);
        }

        fileOutput.close();
        fileOutputBuff.close();
    }

    public static long ambilNoEntry(String penulis , String tahun ) throws IOException{
        FileReader input = new FileReader("database.txt");
        BufferedReader inputBuff = new BufferedReader(input);

        long entry = 0;
        String data = inputBuff.readLine();
        Scanner scan ;
        String primaryKey;

        while (data != null){
            scan = new Scanner(data);
            scan.useDelimiter(",");
            primaryKey = scan.next();
            scan = new Scanner(primaryKey);
            scan.useDelimiter("_");

            penulis = penulis.replaceAll("\\s","");
            if (penulis.equalsIgnoreCase(scan.next()) && tahun.equalsIgnoreCase(scan.next())){
                entry = scan.nextInt();
            }
            data = inputBuff.readLine();
        }
        return entry;
    }
}
