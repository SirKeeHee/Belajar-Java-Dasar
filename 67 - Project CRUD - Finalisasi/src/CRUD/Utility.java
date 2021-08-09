package CRUD;

import java.io.*;
import java.time.Year;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Utility {
    protected static String parseYear(String tahun) throws IOException {
        Scanner scan = new Scanner(System.in);
        boolean correctYear = false;
        while(!correctYear){
            try{
                Year.parse(tahun);
                correctYear = true;
            }catch (Exception e){
                System.err.print("Masukan tahun dengan benar\n");
                System.out.print("\nMasukan Tahun Terbit : ");
                tahun = scan.next();
            }
        }
        return tahun;
    }

    public static void hapusData() throws IOException{
        // mengambil db asli
        File database = new File("database.txt");
        FileReader input = new FileReader(database);
        BufferedReader inputBuff = new BufferedReader(input);

        // membuat database sementara
        File tempDB = new File ("tempDB.txt");
        FileWriter outputTemp = new FileWriter(tempDB);
        BufferedWriter outputTempBuff = new BufferedWriter(outputTemp);

        // tampilkan data
        System.out.println("List Buku");
        Operasi.tampilData();

        // mengambil user input
        Scanner scanUser = new Scanner(System.in);
        System.out.print("Masukan urutan buku yang akan di hapus : ");
        int pilihan = scanUser.nextInt();

        // looping membaca data baris dan skip data yang dihapus

        int countData = 0;
        boolean isFound = false;

        // baca perbaris
        String data = inputBuff.readLine();
        while (data != null){
            countData++;
            StringTokenizer dataKata = new StringTokenizer(data,",");
            boolean isDelete = false;
            // tampilkan data yang ingin di hapus
            if (pilihan == countData){
                System.out.println("\nData yang ingin anda hapus : ");
                System.out.println("-----------------------------");
                System.out.println("Referensi  : " + dataKata.nextToken());
                System.out.println("Tahun      : " + dataKata.nextToken());
                System.out.println("Penulis    : " + dataKata.nextToken());
                System.out.println("Penerbit   : " + dataKata.nextToken());
                System.out.println("Judul      : " + dataKata.nextToken());
                isDelete = getYesOrNo("apakah anda yakin ingin menghapusnya?");
                isFound = true;
            }

            if (isDelete){
                // Skip pindahkan data dari ori ke temp
                System.out.println("data berhasil di hapus");
            }else{
                // pindahkan data dari ori ke temp
                outputTempBuff.write(data);
                outputTempBuff.newLine();
            }
            data = inputBuff.readLine();
        }

        if (!isFound){
            System.err.println("Data Tidak ditemukan");
        }


        // menulis file
        outputTempBuff.flush();

        input.close();
        inputBuff.close();
        outputTemp.close();
        outputTempBuff.close();
        System.gc();
        // menghapus db
        database.delete();

        // merename tempdb
        tempDB.renameTo(database);


    }

    public static void ubahData() throws  IOException{
        Scanner scanPilihan = new Scanner(System.in);
        // membaca file input
        File input = new File("database.txt");
        FileReader inputs = new FileReader(input);
        BufferedReader inputsBuff = new BufferedReader(inputs);

        // membaca file
        File output = new File("tempDb.txt");
        FileWriter outputs = new FileWriter(output);
        BufferedWriter ouputsBuff = new BufferedWriter(outputs);

        // mengakses db per line
        String data = inputsBuff.readLine();

        // menampilkan seluruh data
        Operasi.tampilData();

        // mengambil inputan user
        System.out.print("Masukan Urutan yang ingin di Ubah = ");
        int pilihan = scanPilihan.nextInt();

        boolean isFound = false;
        int dataCount = 0;

        while (data != null){
            dataCount++;

            StringTokenizer dataAsli = new StringTokenizer(data,",");
            if (dataCount == pilihan) {
                System.out.println("----------------------------------------------");
                System.out.println("\nData yang anda pilih : ");
                System.out.println("----------------------------------------------");
                System.out.println("Referensi    : " + dataAsli.nextToken());
                System.out.println("Tahun Terbit : " + dataAsli.nextToken());
                System.out.println("Penulis      : " + dataAsli.nextToken());
                System.out.println("Penerbit     : " + dataAsli.nextToken());
                System.out.println("Judul        : " + dataAsli.nextToken());
                System.out.println("----------------------------------------------");
                isFound = true;

                // update data
                String[] fields = {"Tahun Terbit","Penulis","Penerbit","Judul"};
                String[] tempData = new String[4];
                dataAsli = new StringTokenizer(data,",");

                String originalData = dataAsli.nextToken();
                for(int i = 0; i < fields.length ; i++){
                    boolean isUpdate = getYesOrNo("apakah anda ingin mengubah " + fields[i] + " ?");
                    originalData = dataAsli.nextToken();
                    if (isUpdate){

                        if (fields[i].equalsIgnoreCase("tahun")){
                            Scanner tahun = new Scanner(System.in);
                            System.out.print("Masukan Tahun Terbit : ");
                            String Tahun = tahun.next();
                            tempData[i] = parseYear(Tahun);
                        }else{
                            Scanner inputUpdate = new Scanner(System.in);
                            System.out.print("Masukan " + fields[i] + " Baru = ");
                            tempData[i] = inputUpdate.nextLine();
                        }
                    }else{
                        tempData[i] = originalData;
                    }
                }
                dataAsli = new StringTokenizer(data,",");
                dataAsli.nextToken();
                System.out.println("----------------------------------------------");
                System.out.println("\nData Baru : ");
                System.out.println("----------------------------------------------");
                System.out.println("Tahun Terbit : " + dataAsli.nextToken() + " --> " + tempData[0]);
                System.out.println("Penulis      : " + dataAsli.nextToken() + " --> " + tempData[1]);
                System.out.println("Penerbit     : " + dataAsli.nextToken() + " --> " + tempData[2]);
                System.out.println("Judul        : " + dataAsli.nextToken() + " --> " + tempData[3]);
                System.out.println("----------------------------------------------");
                boolean isYakin = getYesOrNo("apakah anda yakin ingin mengganti data tersebut? ");
                if (isYakin){
                    boolean isExist = Operasi.checkBuku(tempData,false);
                    if (isExist){
                        System.err.println("Data Sudah Terdapat Dalam Data Base");
                        ouputsBuff.write(data);
                        ouputsBuff.newLine();
                    }else{
                        String tahun = tempData[0];
                        String penulis = tempData[1];
                        String penerbit = tempData[2];
                        String judul = tempData[3];

                        long noEntry = Operasi.ambilNoEntry(penulis,tahun) + 1;
                        String penulisPrimary = penulis.replaceAll("\\s","");
                        String primaryKey = penulisPrimary + "_" + tahun + "_" + noEntry;
                        ouputsBuff.write(primaryKey + "," + tahun + "," + penulis + "," +
                                penerbit + "," + judul);
                        ouputsBuff.newLine();
                    }
                }else{
                    ouputsBuff.write(data);
                    ouputsBuff.newLine();
                }
            }else{
                //copy data
                ouputsBuff.write(data);
                ouputsBuff.newLine();
            }
            data = inputsBuff.readLine();
        }
        if (!isFound){
            System.err.println("data tidak ditemukan");
        }
        ouputsBuff.flush();
        inputs.close();
        inputsBuff.close();
        outputs.close();
        ouputsBuff.close();


        System.gc();
        input.delete();
        output.renameTo(input);
    }

    public static void clrScreen(){
        try{
            if (System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            }else{
                System.out.print("\033\143");
            }
        }catch (Exception e){
            System.err.println("tidak bisa clear screen");
        }
    }

    public static boolean getYesOrNo(String message){
        Scanner userInput = new Scanner(System.in);
        System.out.print("\n\n" + message);
        String userOption1 = userInput.next();

        while(!userOption1.equalsIgnoreCase("y") && !userOption1.equalsIgnoreCase("n")){
            System.err.print("Bukan Y atau N silahkan masukan kembali (y/n)");
            System.out.print("\n\n" + message);
            userOption1 = userInput.next();
        }
        return userOption1.equalsIgnoreCase("y");
    }
}
