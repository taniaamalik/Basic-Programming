package coba;

import java.util.Scanner;

public class TiketKeretaApi2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nilai, pilihan, tarifAwal;
        int penumpang = 0;
        double discount;
        double total = 0;
        String pilihKereta = null;
        String konfirmasi;
        String[][] kereta = {{"Jenis", "Harga", "Diskon", "AC", "Colokan"}, {"Ekonomi", "50000", "2%", "Tidak ada", "Tidak ada"}, {"Bisnis", "100000", "5%", "Ada", "Tidak ada"}, {"Eksekutif", "200000", "7%", "Ada", "Tidak ada"}, {"Pariwisata", "300000", "10%", "Ada", "Ada"}};
        do {
            System.out.println("Pilihan menunya adalah :");
            System.out.println("1. Melihat Daftar Kereta Api");
            System.out.println("2. Melihat Daftar Kereta Api yang ada AC");
            System.out.println("3. Melihat Daftar Kereta Api yang ada Colokan");
            System.out.println("4. Memesan Tiket Kereta Api");
            System.out.println("5. Melihat Pesanan Tiket");
            System.out.print("Masukkan nilai : ");
            nilai = in.nextInt();
            switch (nilai) {
                case 1:
                    System.out.println("Daftar Kereta Api =");
                    System.out.println("------------------------------------------");
                    for (int i = 0; i < kereta.length; i++) {
                        for (int j = 0; j < kereta.length; j++) {
                            System.out.print(kereta[i][j] + "|");
                        }
                        System.out.println();
                        System.out.println("------------------------------------------");
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Daftar Kereta Api yang ada AC =");
                    System.out.println("------------------------------------------");
                    for (int i = 0; i < kereta.length; i++) {
                        if (i == 1) {
                            continue;
                        }
                        for (int j = 0; j < kereta.length; j++) {
                            System.out.print(kereta[i][j] + "|");
                        }
                        System.out.println();
                        System.out.println("------------------------------------------");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Daftar Kereta Api yang ada Colokan =");
                    System.out.println("------------------------------------------");
                    for (int i = 0; i < kereta.length; i++) {
                        if (i > 0 && i < 4) {
                            continue;
                        }
                        for (int j = 0; j < kereta.length; j++) {
                            System.out.print(kereta[i][j] + "|");
                        }
                        System.out.println();
                        System.out.println("------------------------------------------");
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Memesan Tiket Kereta Api =");
                    System.out.print("Masukan Jenis Kereta Api : ");
                    pilihKereta = in.next();
                    System.out.print("Masukan Jumlah Penumpang : ");
                    penumpang = in.nextInt();
                    if (pilihKereta.equalsIgnoreCase("ekonomi")) {
                        pilihKereta = kereta[1][0];
                        tarifAwal = 50000;
                        discount = 0.98;
                        total = (tarifAwal * penumpang) * discount;
                        System.out.println("Total Harga : " + total);
                    } else if (pilihKereta.equalsIgnoreCase("bisnis")) {
                        pilihKereta = kereta[2][0];
                        tarifAwal = 100000;
                        discount = 0.95;
                        total = (tarifAwal * penumpang * discount);
                        System.out.println("Total Harga : " + total);
                    } else if (pilihKereta.equalsIgnoreCase("eksekutif")) {
                        pilihKereta = kereta[3][0];
                        tarifAwal = 200000;
                        discount = 0.97;
                        total = (tarifAwal * penumpang * discount);
                        System.out.println("Total Harga : " + total);
                    } else if (pilihKereta.equalsIgnoreCase("pariwisata")) {
                        pilihKereta = kereta[4][0];
                        tarifAwal = 300000;
                        discount = 0.9;
                        total = (tarifAwal * penumpang * discount);
                        System.out.println("Total Harga : " + total);
                    } else {
                        System.out.println("Input Salah");
                    }
                    break;
                case 5:
                    System.out.println("--------------------------------------------------");
                    System.out.println("Jenis Kereta\tJumlah Penumpang\tTotal Harga");
                    System.out.println("--------------------------------------------------");
                    System.out.println(pilihKereta + "\t\t\t" + penumpang + "\t\t  " + total);
                    System.out.println("--------------------------------------------------");
                    break;
                default:
                    System.exit(0);
            }
        } while (nilai != 6);
    }
}